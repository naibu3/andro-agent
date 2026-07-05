package expo.modules.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.tracing.Trace;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.codescanner.GmsBarcodeScanner;
import com.google.mlkit.vision.codescanner.GmsBarcodeScannerOptions;
import com.google.mlkit.vision.codescanner.GmsBarcodeScanning;
import expo.modules.camera.CameraExceptions;
import expo.modules.camera.analyzers.BarCodeScannerResultSerializer;
import expo.modules.camera.analyzers.MLKitBarCodeScanner;
import expo.modules.camera.records.BarcodeSettings;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraMode;
import expo.modules.camera.records.CameraRatio;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.records.FlashMode;
import expo.modules.camera.records.FocusMode;
import expo.modules.camera.records.VideoQuality;
import expo.modules.camera.tasks.ResolveTakenPictureKt;
import expo.modules.camera.utils.CameraUtils;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.core.utilities.EmulatorUtilities;
import expo.modules.core.utilities.VRUtilities;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilder;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CameraViewModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lexpo/modules/camera/CameraViewModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "moduleScope", "Lkotlinx/coroutines/CoroutineScope;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "cacheDirectory", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "permissionsManager", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "Companion", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraViewModule extends Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CameraViewModule";
    private final CoroutineScope moduleScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent3;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent4;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent5;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent5;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent6;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent6;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent7;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent7;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent8;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent8;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent9;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent9;
        CameraViewModule cameraViewModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (cameraViewModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(cameraViewModule);
            moduleDefinitionBuilder.Name("ExpoCamera");
            moduleDefinitionBuilder.Events("onModernBarcodeScanned");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder("isModernBarcodeScannerAvailable");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
            if (returnType == null) {
                returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Boolean.class));
                returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Boolean.class), returnType);
            }
            propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(!VRUtilities.INSTANCE.isQuest() && CameraUtils.INSTANCE.isMLKitAvailable(this.this$0.getAppContext().getReactContext()));
                }
            }));
            moduleDefinitionBuilder2.getProperties().put("isModernBarcodeScannerAvailable", propertyComponentBuilder);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            PropertyComponentBuilder propertyComponentBuilder2 = new PropertyComponentBuilder("toggleRecordingAsyncAvailable");
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(Reflection.getOrCreateKotlinClass(Boolean.class));
                returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Boolean.class), returnType2);
            }
            propertyComponentBuilder2.setGetter(new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            }));
            moduleDefinitionBuilder3.getProperties().put("toggleRecordingAsyncAvailable", propertyComponentBuilder2);
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("requestCameraPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.askForPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder4.getConverters();
                AnyType[] anyTypeArr3 = new AnyType[1];
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters);
                }
                anyTypeArr3[0] = anyType;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) throws Exceptions.PermissionsModuleNotFound {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.askForPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                                } else {
                                    untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("requestCameraPermissionsAsync", asyncFunctionWithPromiseComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("requestMicrophonePermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.RECORD_AUDIO");
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder5.getConverters();
                AnyType[] anyTypeArr4 = new AnyType[1];
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters2);
                }
                anyTypeArr4[0] = anyType2;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), (Promise) objArr[0], "android.permission.RECORD_AUDIO");
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent2 = new StringAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12);
                                } else {
                                    untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12);
                                }
                            } else {
                                untypedAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12);
                            }
                        } else {
                            untypedAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12);
                        }
                    } else {
                        untypedAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12);
                    }
                } else {
                    untypedAsyncFunctionComponent2 = new IntAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12);
                }
                asyncFunctionWithPromiseComponent2 = untypedAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder5.getAsyncFunctions().put("requestMicrophonePermissionsAsync", asyncFunctionWithPromiseComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder6 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("getCameraPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.getPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder6.getConverters();
                AnyType[] anyTypeArr5 = new AnyType[1];
                AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$8
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters3);
                }
                anyTypeArr5[0] = anyType3;
                Function1<Object[], Unit> function13 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$9
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) throws Exceptions.PermissionsModuleNotFound {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.getPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent3 = new StringAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13);
                                } else {
                                    untypedAsyncFunctionComponent3 = new UntypedAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13);
                                }
                            } else {
                                untypedAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13);
                            }
                        } else {
                            untypedAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13);
                        }
                    } else {
                        untypedAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13);
                    }
                } else {
                    untypedAsyncFunctionComponent3 = new IntAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13);
                }
                asyncFunctionWithPromiseComponent3 = untypedAsyncFunctionComponent3;
            }
            moduleDefinitionBuilder6.getAsyncFunctions().put("getCameraPermissionsAsync", asyncFunctionWithPromiseComponent3);
            ModuleDefinitionBuilder moduleDefinitionBuilder7 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent4 = new AsyncFunctionWithPromiseComponent("getMicrophonePermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.RECORD_AUDIO");
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder7.getConverters();
                AnyType[] anyTypeArr6 = new AnyType[1];
                AnyType anyType4 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$11
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters4);
                }
                anyTypeArr6[0] = anyType4;
                Function1<Object[], Unit> function14 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$12
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), (Promise) objArr[0], "android.permission.RECORD_AUDIO");
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent4 = new StringAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14);
                                } else {
                                    untypedAsyncFunctionComponent4 = new UntypedAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14);
                                }
                            } else {
                                untypedAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14);
                            }
                        } else {
                            untypedAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14);
                        }
                    } else {
                        untypedAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14);
                    }
                } else {
                    untypedAsyncFunctionComponent4 = new IntAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14);
                }
                asyncFunctionWithPromiseComponent4 = untypedAsyncFunctionComponent4;
            }
            moduleDefinitionBuilder7.getAsyncFunctions().put("getMicrophonePermissionsAsync", asyncFunctionWithPromiseComponent4);
            ModuleDefinitionBuilder moduleDefinitionBuilder8 = moduleDefinitionBuilder;
            TypeConverterProvider converters5 = moduleDefinitionBuilder8.getConverters();
            AnyType[] anyTypeArr7 = new AnyType[2];
            AnyType anyType5 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(String.class);
                    }
                }), converters5);
            }
            anyTypeArr7[0] = anyType5;
            AnyType anyType6 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(List.class), false));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(List.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(BarcodeType.class)));
                    }
                }), converters5);
            }
            anyTypeArr7[1] = anyType6;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent10 = new AsyncFunctionWithPromiseComponent("scanFromURLAsync", anyTypeArr7, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    final List list = (List) objArr[1];
                    final String str = (String) obj;
                    if (!CameraUtils.INSTANCE.isMLKitAvailable(this.this$0.getAppContext().getReactContext())) {
                        promise.reject(new CameraExceptions.MLKitUnavailableException());
                        return;
                    }
                    ImageLoaderInterface imageLoader = this.this$0.getAppContext().getImageLoader();
                    if (imageLoader != null) {
                        final CameraViewModule cameraViewModule2 = this.this$0;
                        imageLoader.loadImageForManipulationFromURL(str, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.camera.CameraViewModule$definition$1$7$1
                            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
                            public void onSuccess(Bitmap bitmap) {
                                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                                try {
                                    MLKitBarCodeScanner mLKitBarCodeScanner = new MLKitBarCodeScanner();
                                    List<BarcodeType> list2 = list;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    mLKitBarCodeScanner.setSettings(arrayList2);
                                    BuildersKt__Builders_commonKt.launch$default(cameraViewModule2.moduleScope, null, null, new CameraViewModule$definition$1$7$1$onSuccess$1(mLKitBarCodeScanner, bitmap, promise, arrayList2, null), 3, null);
                                } catch (Exception unused) {
                                    promise.reject(new CameraExceptions.MLKitUnavailableException());
                                }
                            }

                            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
                            public void onFailure(Throwable cause) {
                                promise.reject(new CameraExceptions.ImageRetrievalException(str));
                            }
                        });
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder8.getAsyncFunctions().put("scanFromURLAsync", asyncFunctionWithPromiseComponent10);
            ModuleDefinitionBuilder moduleDefinitionBuilder9 = moduleDefinitionBuilder;
            TypeConverterProvider converters6 = moduleDefinitionBuilder9.getConverters();
            AnyType[] anyTypeArr8 = new AnyType[1];
            AnyType anyType7 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(BarcodeSettings.class), false));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(BarcodeSettings.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$4
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(BarcodeSettings.class);
                    }
                }), converters6);
            }
            anyTypeArr8[0] = anyType7;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent11 = new AsyncFunctionWithPromiseComponent("launchScanner", anyTypeArr8, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    BarcodeSettings barcodeSettings = (BarcodeSettings) objArr[0];
                    if (!CameraUtils.INSTANCE.hasGooglePlayServices(this.this$0.getAppContext().getReactContext())) {
                        promise.reject(new CameraExceptions.GooglePlayServicesUnavailableException());
                        return;
                    }
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext == null) {
                        promise.reject(new Exceptions.ReactContextLost());
                        return;
                    }
                    try {
                        GmsBarcodeScannerOptions.Builder builder = new GmsBarcodeScannerOptions.Builder();
                        if (!barcodeSettings.getBarcodeTypes().isEmpty()) {
                            int iMapToBarcode = ((BarcodeType) CollectionsKt.first((List) barcodeSettings.getBarcodeTypes())).mapToBarcode();
                            List listDrop = CollectionsKt.drop(barcodeSettings.getBarcodeTypes(), 1);
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
                            Iterator it = listDrop.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
                            }
                            int[] intArray = CollectionsKt.toIntArray(arrayList);
                            builder.setBarcodeFormats(iMapToBarcode, Arrays.copyOf(intArray, intArray.length));
                        }
                        GmsBarcodeScannerOptions gmsBarcodeScannerOptionsBuild = builder.build();
                        Intrinsics.checkNotNullExpressionValue(gmsBarcodeScannerOptionsBuild, "build(...)");
                        GmsBarcodeScanner client = GmsBarcodeScanning.getClient(reactContext, gmsBarcodeScannerOptionsBuild);
                        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
                        Task<Barcode> taskStartScan = client.startScan();
                        final CameraViewModule cameraViewModule2 = this.this$0;
                        final Function1<Barcode, Unit> function15 = new Function1<Barcode, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$8$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Barcode barcode) {
                                invoke2(barcode);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Barcode barcode) {
                                BarCodeScannerResultSerializer barCodeScannerResultSerializer = BarCodeScannerResultSerializer.INSTANCE;
                                Intrinsics.checkNotNull(barcode);
                                cameraViewModule2.sendEvent("onModernBarcodeScanned", BarCodeScannerResultSerializer.INSTANCE.toBundle(BarCodeScannerResultSerializer.parseBarcodeScanningResult$default(barCodeScannerResultSerializer, barcode, null, 2, null), 1.0f));
                                promise.resolve();
                            }
                        };
                        Intrinsics.checkNotNull(taskStartScan.addOnSuccessListener(new OnSuccessListener(function15) { // from class: expo.modules.camera.CameraViewModuleKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
                            private final /* synthetic */ Function1 function;

                            {
                                Intrinsics.checkNotNullParameter(function15, "function");
                                this.function = function15;
                            }

                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final /* synthetic */ void onSuccess(Object obj) {
                                this.function.invoke(obj);
                            }
                        }).addOnCanceledListener(new OnCanceledListener() { // from class: expo.modules.camera.CameraViewModule$definition$1$8$2
                            @Override // com.google.android.gms.tasks.OnCanceledListener
                            public final void onCanceled() {
                                promise.reject(new CameraExceptions.BarcodeScanningCancelledException());
                            }
                        }).addOnFailureListener(new OnFailureListener() { // from class: expo.modules.camera.CameraViewModule$definition$1$8$3
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception it2) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                promise.reject(new CameraExceptions.BarcodeScanningFailedException());
                            }
                        }));
                    } catch (Exception unused) {
                        promise.reject(new CameraExceptions.GooglePlayServicesUnavailableException());
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder9.getAsyncFunctions().put("launchScanner", asyncFunctionWithPromiseComponent11);
            moduleDefinitionBuilder.getAsyncFunctions().put("dismissScanner", new UntypedAsyncFunctionComponent("dismissScanner", new AnyType[0], new Function1<Object[], Object>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Unit.INSTANCE;
                }
            }));
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    try {
                        CoroutineScopeKt.cancel(this.this$0.moduleScope, new ModuleDestroyedException(null, 1, null));
                    } catch (IllegalStateException unused) {
                        Log.e(CameraViewModule.TAG, "The scope does not have a job in it");
                    }
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder10 = moduleDefinitionBuilder;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PictureRef.class);
            Module module = moduleDefinitionBuilder10.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AppContext appContext = module.getAppContext();
            AnyType anyType8 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PictureRef.class), false));
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, "Picture", orCreateKotlinClass, anyType8 == null ? new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(PictureRef.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$Class$1
                @Override // kotlin.jvm.functions.Function0
                public final KType invoke() {
                    return Reflection.typeOf(PictureRef.class);
                }
            }), null) : anyType8, moduleDefinitionBuilder10.getConverters());
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "width");
            AnyType[] anyTypeArr9 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider3 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType3 = returnTypeProvider3.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(Reflection.getOrCreateKotlinClass(Integer.class));
                returnTypeProvider3.getTypes().put(Reflection.getOrCreateKotlinClass(Integer.class), returnType3);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr9, returnType3, new Function1<Object[], Object>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(((PictureRef) it[0]).getRef().getWidth());
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder.getProperties().put("width", propertyComponentBuilderWithThis);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "height");
            AnyType[] anyTypeArr10 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider4 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType4 = returnTypeProvider4.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(Reflection.getOrCreateKotlinClass(Integer.class));
                returnTypeProvider4.getTypes().put(Reflection.getOrCreateKotlinClass(Integer.class), returnType4);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("get", anyTypeArr10, returnType4, new Function1<Object[], Object>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(((PictureRef) it[0]).getRef().getHeight());
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder.getProperties().put("height", propertyComponentBuilderWithThis2);
            ClassComponentBuilder classComponentBuilder2 = classComponentBuilder;
            TypeConverterProvider converters7 = classComponentBuilder2.getConverters();
            AnyType[] anyTypeArr11 = new AnyType[2];
            AnyType anyType9 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PictureRef.class), false));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(PictureRef.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(PictureRef.class);
                    }
                }), converters7);
            }
            anyTypeArr11[0] = anyType9;
            AnyType anyType10 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(SavePictureOptions.class), true));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(SavePictureOptions.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(SavePictureOptions.class);
                    }
                }), converters7);
            }
            anyTypeArr11[1] = anyType10;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent12 = new AsyncFunctionWithPromiseComponent("savePictureAsync", anyTypeArr11, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    SavePictureOptions savePictureOptions = (SavePictureOptions) objArr[1];
                    Bitmap ref = ((PictureRef) obj).getRef();
                    Bundle bundle = new Bundle();
                    File cacheDirectory = this.this$0.getCacheDirectory();
                    bundle.putInt("width", ref.getWidth());
                    bundle.putInt("height", ref.getHeight());
                    Number numberValueOf = savePictureOptions != null ? Double.valueOf(savePictureOptions.getQuality()) : 1;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                        ref.compress(Bitmap.CompressFormat.JPEG, numberValueOf.intValue() * 100, byteArrayOutputStream2);
                        try {
                            String strWriteStreamToFile$default = ResolveTakenPictureKt.writeStreamToFile$default(cacheDirectory, byteArrayOutputStream2, null, 4, null);
                            ref.recycle();
                            String string = Uri.fromFile(new File(strWriteStreamToFile$default)).toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            bundle.putString(ShareConstants.MEDIA_URI, string);
                            if (savePictureOptions != null && savePictureOptions.getBase64()) {
                                bundle.putString("base64", Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2));
                            }
                            promise.resolve(bundle);
                        } catch (CodedException e) {
                            promise.reject(e);
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(byteArrayOutputStream, null);
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            classComponentBuilder2.getAsyncFunctions().put("savePictureAsync", asyncFunctionWithPromiseComponent12);
            moduleDefinitionBuilder10.getClassData().add(classComponentBuilder.buildClass());
            ModuleDefinitionBuilder moduleDefinitionBuilder11 = moduleDefinitionBuilder;
            final ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$View$1
                @Override // kotlin.jvm.functions.Function0
                public final KType invoke() {
                    return Reflection.typeOf(ExpoCameraView.class);
                }
            }, 2, null), moduleDefinitionBuilder11.getConverters());
            CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
            viewDefinitionBuilder.EventsWithArray(CameraViewModuleKt.getCameraEvents());
            Function2<ExpoCameraView, CameraType, Unit> function2 = new Function2<ExpoCameraView, CameraType, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, CameraType cameraType) {
                    invoke2(expoCameraView, cameraType);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, CameraType cameraType) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (cameraType != null) {
                        if (view.getLensFacing() != cameraType) {
                            view.setLensFacing(cameraType);
                        }
                    } else if (view.getLensFacing() != CameraType.BACK) {
                        view.setLensFacing(CameraType.BACK);
                    }
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType11 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CameraType.class), true));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(CameraType.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(CameraType.class);
                    }
                }), null);
            }
            props.put("facing", new ConcreteViewProp("facing", anyType11, function2));
            Function2<ExpoCameraView, FlashMode, Unit> function22 = new Function2<ExpoCameraView, FlashMode, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, FlashMode flashMode) {
                    invoke2(expoCameraView, flashMode);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, FlashMode flashMode) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (flashMode != null) {
                        if (view.getFlashMode() != flashMode) {
                            view.setFlashMode(flashMode);
                        }
                    } else if (view.getFlashMode() != FlashMode.OFF) {
                        view.setFlashMode(FlashMode.OFF);
                    }
                }
            };
            Map<String, AnyViewProp> props2 = viewDefinitionBuilder.getProps();
            AnyType anyType12 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(FlashMode.class), true));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(FlashMode.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(FlashMode.class);
                    }
                }), null);
            }
            props2.put("flashMode", new ConcreteViewProp("flashMode", anyType12, function22));
            Function2<ExpoCameraView, Boolean, Unit> function23 = new Function2<ExpoCameraView, Boolean, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, Boolean bool) {
                    invoke2(expoCameraView, bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, Boolean bool) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        if (view.getEnableTorch() != zBooleanValue) {
                            view.setEnableTorch(zBooleanValue);
                            return;
                        }
                        return;
                    }
                    if (view.getEnableTorch()) {
                        view.setEnableTorch(false);
                    }
                }
            };
            Map<String, AnyViewProp> props3 = viewDefinitionBuilder.getProps();
            AnyType anyType13 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), true));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Boolean.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Boolean.class);
                    }
                }), null);
            }
            props3.put("enableTorch", new ConcreteViewProp("enableTorch", anyType13, function23));
            CameraViewModule$definition$1$12$4 cameraViewModule$definition$1$12$4 = new Function2<ExpoCameraView, Boolean, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, Boolean bool) {
                    invoke2(expoCameraView, bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, Boolean bool) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.setAnimateShutter(bool != null ? bool.booleanValue() : true);
                }
            };
            Map<String, AnyViewProp> props4 = viewDefinitionBuilder.getProps();
            AnyType anyType14 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), true));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Boolean.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$4
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Boolean.class);
                    }
                }), null);
            }
            props4.put("animateShutter", new ConcreteViewProp("animateShutter", anyType14, cameraViewModule$definition$1$12$4));
            Function2<ExpoCameraView, Float, Unit> function24 = new Function2<ExpoCameraView, Float, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, Float f) {
                    invoke2(expoCameraView, f);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, Float f) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (f == null) {
                        if (view.getZoom() == 0.0f) {
                            return;
                        }
                        view.setZoom(0.0f);
                    } else {
                        float fFloatValue = f.floatValue();
                        if (view.getZoom() == fFloatValue) {
                            return;
                        }
                        view.setZoom(fFloatValue);
                    }
                }
            };
            Map<String, AnyViewProp> props5 = viewDefinitionBuilder.getProps();
            AnyType anyType15 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Float.class), true));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Float.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$5
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Float.class);
                    }
                }), null);
            }
            props5.put("zoom", new ConcreteViewProp("zoom", anyType15, function24));
            Function2<ExpoCameraView, CameraMode, Unit> function25 = new Function2<ExpoCameraView, CameraMode, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, CameraMode cameraMode) {
                    invoke2(expoCameraView, cameraMode);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, CameraMode cameraMode) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (cameraMode != null) {
                        if (view.getCameraMode() != cameraMode) {
                            view.setCameraMode(cameraMode);
                        }
                    } else if (view.getCameraMode() != CameraMode.PICTURE) {
                        view.setCameraMode(CameraMode.PICTURE);
                    }
                }
            };
            Map<String, AnyViewProp> props6 = viewDefinitionBuilder.getProps();
            AnyType anyType16 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CameraMode.class), true));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(CameraMode.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$6
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(CameraMode.class);
                    }
                }), null);
            }
            props6.put("mode", new ConcreteViewProp("mode", anyType16, function25));
            CameraViewModule$definition$1$12$7 cameraViewModule$definition$1$12$7 = new Function2<ExpoCameraView, Boolean, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, Boolean bool) {
                    invoke2(expoCameraView, bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, Boolean bool) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.setMute(bool != null ? bool.booleanValue() : false);
                }
            };
            Map<String, AnyViewProp> props7 = viewDefinitionBuilder.getProps();
            AnyType anyType17 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), true));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Boolean.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$7
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Boolean.class);
                    }
                }), null);
            }
            props7.put("mute", new ConcreteViewProp("mute", anyType17, cameraViewModule$definition$1$12$7));
            Function2<ExpoCameraView, VideoQuality, Unit> function26 = new Function2<ExpoCameraView, VideoQuality, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, VideoQuality videoQuality) {
                    invoke2(expoCameraView, videoQuality);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, VideoQuality videoQuality) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (videoQuality != null) {
                        if (view.getVideoQuality() != videoQuality) {
                            view.setVideoQuality(videoQuality);
                        }
                    } else if (view.getVideoQuality() != VideoQuality.VIDEO1080P) {
                        view.setVideoQuality(VideoQuality.VIDEO1080P);
                    }
                }
            };
            Map<String, AnyViewProp> props8 = viewDefinitionBuilder.getProps();
            AnyType anyType18 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(VideoQuality.class), true));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(VideoQuality.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$8
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(VideoQuality.class);
                    }
                }), null);
            }
            props8.put("videoQuality", new ConcreteViewProp("videoQuality", anyType18, function26));
            CameraViewModule$definition$1$12$9 cameraViewModule$definition$1$12$9 = new Function2<ExpoCameraView, BarcodeSettings, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, BarcodeSettings barcodeSettings) {
                    invoke2(expoCameraView, barcodeSettings);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, BarcodeSettings barcodeSettings) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (barcodeSettings != null) {
                        view.setBarcodeScannerSettings(barcodeSettings);
                    }
                }
            };
            Map<String, AnyViewProp> props9 = viewDefinitionBuilder.getProps();
            AnyType anyType19 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(BarcodeSettings.class), true));
            if (anyType19 == null) {
                anyType19 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(BarcodeSettings.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$9
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(BarcodeSettings.class);
                    }
                }), null);
            }
            props9.put("barcodeScannerSettings", new ConcreteViewProp("barcodeScannerSettings", anyType19, cameraViewModule$definition$1$12$9));
            CameraViewModule$definition$1$12$10 cameraViewModule$definition$1$12$10 = new Function2<ExpoCameraView, Boolean, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$10
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, Boolean bool) {
                    invoke2(expoCameraView, bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, Boolean bool) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (bool != null) {
                        bool.booleanValue();
                        view.setShouldScanBarcodes(bool.booleanValue());
                    }
                }
            };
            Map<String, AnyViewProp> props10 = viewDefinitionBuilder.getProps();
            AnyType anyType20 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), true));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Boolean.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$10
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Boolean.class);
                    }
                }), null);
            }
            props10.put("barcodeScannerEnabled", new ConcreteViewProp("barcodeScannerEnabled", anyType20, cameraViewModule$definition$1$12$10));
            Function2<ExpoCameraView, String, Unit> function27 = new Function2<ExpoCameraView, String, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$11
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, String str) {
                    invoke2(expoCameraView, str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, String str) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (str != null) {
                        if (Intrinsics.areEqual(view.getPictureSize(), str)) {
                            return;
                        }
                        view.setPictureSize(str);
                    } else if (view.getPictureSize().length() > 0) {
                        view.setPictureSize("");
                    }
                }
            };
            Map<String, AnyViewProp> props11 = viewDefinitionBuilder.getProps();
            AnyType anyType21 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType21 == null) {
                anyType21 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$11
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(String.class);
                    }
                }), null);
            }
            props11.put("pictureSize", new ConcreteViewProp("pictureSize", anyType21, function27));
            Function2<ExpoCameraView, FocusMode, Unit> function28 = new Function2<ExpoCameraView, FocusMode, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$12
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, FocusMode focusMode) {
                    invoke2(expoCameraView, focusMode);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, FocusMode focusMode) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (focusMode != null) {
                        if (view.getAutoFocus() != focusMode) {
                            view.setAutoFocus(focusMode);
                        }
                    } else if (view.getAutoFocus() != FocusMode.OFF) {
                        view.setAutoFocus(FocusMode.OFF);
                    }
                }
            };
            Map<String, AnyViewProp> props12 = viewDefinitionBuilder.getProps();
            AnyType anyType22 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(FocusMode.class), true));
            if (anyType22 == null) {
                anyType22 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(FocusMode.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$12
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(FocusMode.class);
                    }
                }), null);
            }
            props12.put("autoFocus", new ConcreteViewProp("autoFocus", anyType22, function28));
            Function2<ExpoCameraView, CameraRatio, Unit> function29 = new Function2<ExpoCameraView, CameraRatio, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$13
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, CameraRatio cameraRatio) {
                    invoke2(expoCameraView, cameraRatio);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, CameraRatio cameraRatio) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (cameraRatio != null) {
                        if (view.getRatio() != cameraRatio) {
                            view.setRatio(cameraRatio);
                        }
                    } else if (view.getRatio() != null) {
                        view.setRatio(null);
                    }
                }
            };
            Map<String, AnyViewProp> props13 = viewDefinitionBuilder.getProps();
            AnyType anyType23 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CameraRatio.class), true));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(CameraRatio.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$13
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(CameraRatio.class);
                    }
                }), null);
            }
            props13.put("ratio", new ConcreteViewProp("ratio", anyType23, function29));
            Function2<ExpoCameraView, Boolean, Unit> function210 = new Function2<ExpoCameraView, Boolean, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$14
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, Boolean bool) {
                    invoke2(expoCameraView, bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, Boolean bool) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        if (view.getMirror() != zBooleanValue) {
                            view.setMirror(zBooleanValue);
                            return;
                        }
                        return;
                    }
                    if (view.getMirror()) {
                        view.setMirror(false);
                    }
                }
            };
            Map<String, AnyViewProp> props14 = viewDefinitionBuilder.getProps();
            AnyType anyType24 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), true));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Boolean.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$14
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Boolean.class);
                    }
                }), null);
            }
            props14.put("mirror", new ConcreteViewProp("mirror", anyType24, function210));
            Function2<ExpoCameraView, Integer, Unit> function211 = new Function2<ExpoCameraView, Integer, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$15
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoCameraView expoCameraView, Integer num) {
                    invoke2(expoCameraView, num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoCameraView view, Integer num) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Integer videoEncodingBitrate = view.getVideoEncodingBitrate();
                        if (videoEncodingBitrate != null && videoEncodingBitrate.intValue() == iIntValue) {
                            return;
                        }
                        view.setVideoEncodingBitrate(Integer.valueOf(iIntValue));
                        return;
                    }
                    if (view.getVideoEncodingBitrate() != null) {
                        view.setVideoEncodingBitrate(null);
                    }
                }
            };
            Map<String, AnyViewProp> props15 = viewDefinitionBuilder.getProps();
            AnyType anyType25 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Integer.class), true));
            if (anyType25 == null) {
                anyType25 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Integer.class), true, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$15
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Integer.class);
                    }
                }), null);
            }
            props15.put("videoBitrate", new ConcreteViewProp("videoBitrate", anyType25, function211));
            viewDefinitionBuilder.setOnViewDidUpdateProps(new Function1<View, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDidUpdateProps$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleScope, null, null, new CameraViewModule$definition$1$12$16$1((ExpoCameraView) it, null), 3, null);
                }
            });
            viewDefinitionBuilder.setOnViewDestroys(new Function1<View, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDestroys$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ((ExpoCameraView) it).cleanupCamera();
                }
            });
            TypeConverterProvider converters8 = viewDefinitionBuilder.getConverters();
            AnyType[] anyTypeArr12 = new AnyType[2];
            AnyType anyType26 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false));
            if (anyType26 == null) {
                anyType26 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ExpoCameraView.class);
                    }
                }), converters8);
            }
            anyTypeArr12[0] = anyType26;
            AnyType anyType27 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(PictureOptions.class), false));
            if (anyType27 == null) {
                anyType27 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(PictureOptions.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(PictureOptions.class);
                    }
                }), converters8);
            }
            anyTypeArr12[1] = anyType27;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent13 = new AsyncFunctionWithPromiseComponent("takePicture", anyTypeArr12, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    PictureOptions pictureOptions = (PictureOptions) objArr[1];
                    ExpoCameraView expoCameraView = (ExpoCameraView) obj;
                    if (!EmulatorUtilities.INSTANCE.isRunningOnEmulator()) {
                        expoCameraView.takePicture(pictureOptions, promise, this.this$0.getCacheDirectory(), this.this$0.getRuntimeContext());
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleScope, null, null, new CameraViewModule$definition$1$12$18$1(CameraViewHelper.INSTANCE.generateSimulatorPhoto(expoCameraView.getWidth(), expoCameraView.getHeight()), promise, pictureOptions, this.this$0, expoCameraView, null), 3, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            viewDefinitionBuilder.getAsyncFunctions().put("takePicture", asyncFunctionWithPromiseComponent13);
            asyncFunctionWithPromiseComponent13.runOnQueue(Queues.MAIN);
            if (ExpoCameraView.class == Promise.class) {
                asyncFunctionWithPromiseComponent5 = new AsyncFunctionWithPromiseComponent("getAvailablePictureSizes", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ((ExpoCameraView) promise).getAvailablePictureSizes();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                AnyType[] anyTypeArr13 = new AnyType[1];
                AnyType anyType28 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false));
                if (anyType28 == null) {
                    anyType28 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExpoCameraView.class);
                        }
                    }), null);
                }
                anyTypeArr13[0] = anyType28;
                Function1<Object[], List<? extends String>> function15 = new Function1<Object[], List<? extends String>>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final List<? extends String> invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        return ((ExpoCameraView) objArr[0]).getAvailablePictureSizes();
                    }
                };
                if (!Intrinsics.areEqual(List.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(List.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(List.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(List.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(List.class, String.class)) {
                                    untypedAsyncFunctionComponent5 = new StringAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr13, function15);
                                } else {
                                    untypedAsyncFunctionComponent5 = new UntypedAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr13, function15);
                                }
                            } else {
                                untypedAsyncFunctionComponent5 = new FloatAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr13, function15);
                            }
                        } else {
                            untypedAsyncFunctionComponent5 = new DoubleAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr13, function15);
                        }
                    } else {
                        untypedAsyncFunctionComponent5 = new BoolAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr13, function15);
                    }
                } else {
                    untypedAsyncFunctionComponent5 = new IntAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr13, function15);
                }
                asyncFunctionWithPromiseComponent5 = untypedAsyncFunctionComponent5;
            }
            viewDefinitionBuilder.getAsyncFunctions().put("getAvailablePictureSizes", asyncFunctionWithPromiseComponent5);
            TypeConverterProvider converters9 = viewDefinitionBuilder.getConverters();
            AnyType[] anyTypeArr14 = new AnyType[2];
            AnyType anyType29 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false));
            if (anyType29 == null) {
                anyType29 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$4
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ExpoCameraView.class);
                    }
                }), converters9);
            }
            anyTypeArr14[0] = anyType29;
            AnyType anyType30 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RecordingOptions.class), false));
            if (anyType30 == null) {
                anyType30 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(RecordingOptions.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$5
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(RecordingOptions.class);
                    }
                }), converters9);
            }
            anyTypeArr14[1] = anyType30;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent14 = new AsyncFunctionWithPromiseComponent("record", anyTypeArr14, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws Exceptions.MissingPermissions {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    RecordingOptions recordingOptions = (RecordingOptions) objArr[1];
                    ExpoCameraView expoCameraView = (ExpoCameraView) obj;
                    if (expoCameraView.getMute() || this.this$0.getPermissionsManager().hasGrantedPermissions("android.permission.RECORD_AUDIO")) {
                        expoCameraView.record(recordingOptions, promise, this.this$0.getCacheDirectory());
                        return;
                    }
                    throw new Exceptions.MissingPermissions("android.permission.RECORD_AUDIO");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) throws Exceptions.MissingPermissions {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            viewDefinitionBuilder.getAsyncFunctions().put("record", asyncFunctionWithPromiseComponent14);
            asyncFunctionWithPromiseComponent14.runOnQueue(Queues.MAIN);
            if (ExpoCameraView.class == Promise.class) {
                asyncFunctionWithPromiseComponent6 = new AsyncFunctionWithPromiseComponent("toggleRecording", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$4
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ((ExpoCameraView) promise).toggleRecording();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                AnyType[] anyTypeArr15 = new AnyType[1];
                AnyType anyType31 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false));
                if (anyType31 == null) {
                    anyType31 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExpoCameraView.class);
                        }
                    }), null);
                }
                anyTypeArr15[0] = anyType31;
                Function1<Object[], Unit> function16 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        ((ExpoCameraView) objArr[0]).toggleRecording();
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent6 = new StringAsyncFunctionComponent("toggleRecording", anyTypeArr15, function16);
                                } else {
                                    untypedAsyncFunctionComponent6 = new UntypedAsyncFunctionComponent("toggleRecording", anyTypeArr15, function16);
                                }
                            } else {
                                untypedAsyncFunctionComponent6 = new FloatAsyncFunctionComponent("toggleRecording", anyTypeArr15, function16);
                            }
                        } else {
                            untypedAsyncFunctionComponent6 = new DoubleAsyncFunctionComponent("toggleRecording", anyTypeArr15, function16);
                        }
                    } else {
                        untypedAsyncFunctionComponent6 = new BoolAsyncFunctionComponent("toggleRecording", anyTypeArr15, function16);
                    }
                } else {
                    untypedAsyncFunctionComponent6 = new IntAsyncFunctionComponent("toggleRecording", anyTypeArr15, function16);
                }
                asyncFunctionWithPromiseComponent6 = untypedAsyncFunctionComponent6;
            }
            viewDefinitionBuilder.getAsyncFunctions().put("toggleRecording", asyncFunctionWithPromiseComponent6);
            if (ExpoCameraView.class == Promise.class) {
                asyncFunctionWithPromiseComponent7 = new AsyncFunctionWithPromiseComponent("stopRecording", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$7
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws Throwable {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ((ExpoCameraView) promise).stopRecording();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) throws Throwable {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                AnyType[] anyTypeArr16 = new AnyType[1];
                AnyType anyType32 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false));
                if (anyType32 == null) {
                    anyType32 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$8
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExpoCameraView.class);
                        }
                    }), null);
                }
                anyTypeArr16[0] = anyType32;
                Function1<Object[], Unit> function17 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) throws Throwable {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        ((ExpoCameraView) objArr[0]).stopRecording();
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent7 = new StringAsyncFunctionComponent("stopRecording", anyTypeArr16, function17);
                                } else {
                                    untypedAsyncFunctionComponent7 = new UntypedAsyncFunctionComponent("stopRecording", anyTypeArr16, function17);
                                }
                            } else {
                                untypedAsyncFunctionComponent7 = new FloatAsyncFunctionComponent("stopRecording", anyTypeArr16, function17);
                            }
                        } else {
                            untypedAsyncFunctionComponent7 = new DoubleAsyncFunctionComponent("stopRecording", anyTypeArr16, function17);
                        }
                    } else {
                        untypedAsyncFunctionComponent7 = new BoolAsyncFunctionComponent("stopRecording", anyTypeArr16, function17);
                    }
                } else {
                    untypedAsyncFunctionComponent7 = new IntAsyncFunctionComponent("stopRecording", anyTypeArr16, function17);
                }
                asyncFunctionWithPromiseComponent7 = untypedAsyncFunctionComponent7;
            }
            viewDefinitionBuilder.getAsyncFunctions().put("stopRecording", asyncFunctionWithPromiseComponent7);
            asyncFunctionWithPromiseComponent7.runOnQueue(Queues.MAIN);
            if (ExpoCameraView.class == Promise.class) {
                asyncFunctionWithPromiseComponent8 = new AsyncFunctionWithPromiseComponent("resumePreview", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$10
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ((ExpoCameraView) promise).resumePreview();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                AnyType[] anyTypeArr17 = new AnyType[1];
                AnyType anyType33 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false));
                if (anyType33 == null) {
                    anyType33 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$11
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExpoCameraView.class);
                        }
                    }), null);
                }
                anyTypeArr17[0] = anyType33;
                Function1<Object[], Unit> function18 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        ((ExpoCameraView) objArr[0]).resumePreview();
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent8 = new StringAsyncFunctionComponent("resumePreview", anyTypeArr17, function18);
                                } else {
                                    untypedAsyncFunctionComponent8 = new UntypedAsyncFunctionComponent("resumePreview", anyTypeArr17, function18);
                                }
                            } else {
                                untypedAsyncFunctionComponent8 = new FloatAsyncFunctionComponent("resumePreview", anyTypeArr17, function18);
                            }
                        } else {
                            untypedAsyncFunctionComponent8 = new DoubleAsyncFunctionComponent("resumePreview", anyTypeArr17, function18);
                        }
                    } else {
                        untypedAsyncFunctionComponent8 = new BoolAsyncFunctionComponent("resumePreview", anyTypeArr17, function18);
                    }
                } else {
                    untypedAsyncFunctionComponent8 = new IntAsyncFunctionComponent("resumePreview", anyTypeArr17, function18);
                }
                asyncFunctionWithPromiseComponent8 = untypedAsyncFunctionComponent8;
            }
            viewDefinitionBuilder.getAsyncFunctions().put("resumePreview", asyncFunctionWithPromiseComponent8);
            if (ExpoCameraView.class == Promise.class) {
                asyncFunctionWithPromiseComponent9 = new AsyncFunctionWithPromiseComponent("pausePreview", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$13
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ((ExpoCameraView) promise).pausePreview();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                AnyType[] anyTypeArr18 = new AnyType[1];
                AnyType anyType34 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false));
                if (anyType34 == null) {
                    anyType34 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ExpoCameraView.class), false, new Function0<KType>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$14
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ExpoCameraView.class);
                        }
                    }), null);
                }
                anyTypeArr18[0] = anyType34;
                Function1<Object[], Unit> function19 = new Function1<Object[], Unit>() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        ((ExpoCameraView) objArr[0]).pausePreview();
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent9 = new StringAsyncFunctionComponent("pausePreview", anyTypeArr18, function19);
                                } else {
                                    untypedAsyncFunctionComponent9 = new UntypedAsyncFunctionComponent("pausePreview", anyTypeArr18, function19);
                                }
                            } else {
                                untypedAsyncFunctionComponent9 = new FloatAsyncFunctionComponent("pausePreview", anyTypeArr18, function19);
                            }
                        } else {
                            untypedAsyncFunctionComponent9 = new DoubleAsyncFunctionComponent("pausePreview", anyTypeArr18, function19);
                        }
                    } else {
                        untypedAsyncFunctionComponent9 = new BoolAsyncFunctionComponent("pausePreview", anyTypeArr18, function19);
                    }
                } else {
                    untypedAsyncFunctionComponent9 = new IntAsyncFunctionComponent("pausePreview", anyTypeArr18, function19);
                }
                asyncFunctionWithPromiseComponent9 = untypedAsyncFunctionComponent9;
            }
            viewDefinitionBuilder.getAsyncFunctions().put("pausePreview", asyncFunctionWithPromiseComponent9);
            moduleDefinitionBuilder11.registerViewDefinition(viewDefinitionBuilder.build());
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return getAppContext().getCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Permissions getPermissionsManager() throws Exceptions.PermissionsModuleNotFound {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new Exceptions.PermissionsModuleNotFound();
    }

    /* compiled from: CameraViewModule.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/camera/CameraViewModule$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG$expo_camera_release", "()Ljava/lang/String;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTAG$expo_camera_release() {
            return CameraViewModule.TAG;
        }
    }
}

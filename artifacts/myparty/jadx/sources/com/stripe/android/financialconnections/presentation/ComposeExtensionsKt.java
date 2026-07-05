package com.stripe.android.financialconnections.presentation;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.uicore.utils.ActivityExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ComposeExtensions.kt */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u0002H\u0001\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001aG\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u000e\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u000e*\u0002H\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0001¢\u0006\u0002\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"paneViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", ExifInterface.LATITUDE_SOUTH, "factory", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "parentActivity", "Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "collectAsState", "Landroidx/compose/runtime/State;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "VM", "prop1", "Lkotlin/reflect/KProperty1;", "(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/reflect/KProperty1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposeExtensionsKt {
    public static final /* synthetic */ <T extends FinancialConnectionsViewModel<S>, S> T paneViewModel(Function1<? super FinancialConnectionsSheetNativeComponent, ? extends ViewModelProvider.Factory> factory, Composer composer, int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(factory, "factory");
        composer.startReplaceGroup(1481344674);
        ViewModelProvider.Factory factoryInvoke = factory.invoke(parentActivity(composer, 0).getViewModel().getActivityRetainedComponent());
        composer.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ViewModel.class), current, (String) null, factoryInvoke, defaultViewModelCreationExtras, composer, 0, 0);
        composer.endReplaceableGroup();
        T t = (T) viewModel;
        composer.endReplaceGroup();
        return t;
    }

    public static final FinancialConnectionsSheetNativeActivity parentActivity(Composer composer, int i) {
        composer.startReplaceGroup(-168296965);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168296965, i, -1, "com.stripe.android.financialconnections.presentation.parentActivity (ComposeExtensions.kt:31)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComponentActivity componentActivityExtractActivity = ActivityExtensionsKt.extractActivity((Context) objConsume);
        Intrinsics.checkNotNull(componentActivityExtractActivity, "null cannot be cast to non-null type com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity");
        FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) componentActivityExtractActivity;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return financialConnectionsSheetNativeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <VM extends FinancialConnectionsViewModel<S>, S, A> State<A> collectAsState(VM vm, final KProperty1<S, ? extends A> prop1, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        composer.startReplaceGroup(-1826310263);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1826310263, i, -1, "com.stripe.android.financialconnections.presentation.collectAsState (ComposeExtensions.kt:44)");
        }
        composer.startReplaceGroup(1748820228);
        boolean zChanged = composer.changed(prop1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final StateFlow<S> stateFlow = vm.getStateFlow();
            objRememberedValue = FlowKt.distinctUntilChanged(new Flow<A>() { // from class: com.stripe.android.financialconnections.presentation.ComposeExtensionsKt$collectAsState$lambda$1$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.financialconnections.presentation.ComposeExtensionsKt$collectAsState$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ KProperty1 $prop1$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.ComposeExtensionsKt$collectAsState$lambda$1$$inlined$map$1$2", f = "ComposeExtensions.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    /* renamed from: com.stripe.android.financialconnections.presentation.ComposeExtensionsKt$collectAsState$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, KProperty1 kProperty1) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$prop1$inlined = kProperty1;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = anonymousClass1.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Object obj3 = this.$prop1$inlined.get(obj);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, prop1), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        Flow flow = (Flow) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1748823318);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = vm.getStateFlow().getValue();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        State<A> stateCollectAsState = SnapshotStateKt.collectAsState(flow, prop1.get(objRememberedValue2), null, composer, 0, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateCollectAsState;
    }
}

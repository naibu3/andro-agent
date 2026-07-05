package expo.modules.camera;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.DisplayOrientedMeteringPointFactory;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ZoomState;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.lifecycle.ProcessCameraProviderExtKt;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Quality;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.layout.LayoutKt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.LiveData;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.wallet.WalletConstants;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.nimbusds.jose.jwk.JWKParameterNames;
import expo.modules.camera.CameraExceptions;
import expo.modules.camera.ExpoCameraView;
import expo.modules.camera.analyzers.BarcodeAnalyzer;
import expo.modules.camera.analyzers.BarcodeAnalyzerKt;
import expo.modules.camera.common.BarcodeScannedEvent;
import expo.modules.camera.common.CameraMountErrorEvent;
import expo.modules.camera.common.PictureSavedEvent;
import expo.modules.camera.records.BarcodeSettings;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraMode;
import expo.modules.camera.records.CameraRatio;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.records.FlashMode;
import expo.modules.camera.records.FocusMode;
import expo.modules.camera.records.VideoQuality;
import expo.modules.camera.utils.BarCodeScannerResult;
import expo.modules.camera.utils.CameraUtils;
import expo.modules.camera.utils.FileSystemUtils;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.interfaces.camera.CameraViewInterface;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.viewevent.ViewEventCallback;
import expo.modules.kotlin.viewevent.ViewEventDelegate;
import expo.modules.kotlin.views.ExpoView;
import expo.modules.notifications.service.NotificationsService;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ExpoCameraView.kt */
@Metadata(d1 = {"\u0000ã\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u008f\u0001\u001a\u00020}2\u0007\u0010\u0090\u0001\u001a\u00020U2\u0007\u0010\u0091\u0001\u001a\u00020UH\u0014J6\u0010\u0092\u0001\u001a\u00020}2\u0007\u0010\u0093\u0001\u001a\u00020)2\u0007\u0010\u0094\u0001\u001a\u00020U2\u0007\u0010\u0095\u0001\u001a\u00020U2\u0007\u0010\u0096\u0001\u001a\u00020U2\u0007\u0010\u0097\u0001\u001a\u00020UH\u0014J\u0015\u0010\u0098\u0001\u001a\u00020}2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0016J/\u0010\u009b\u0001\u001a\u00020}2\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\b\u0010 \u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030£\u0001J\u0010\u0010¤\u0001\u001a\u00020}2\u0007\u0010¥\u0001\u001a\u000207J\u0012\u0010¦\u0001\u001a\u00020}2\u0007\u0010§\u0001\u001a\u00020)H\u0002J%\u0010¨\u0001\u001a\u00020}2\b\u0010\u009c\u0001\u001a\u00030©\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\b\u0010 \u0001\u001a\u00030¡\u0001J\u0007\u0010ª\u0001\u001a\u00020}J\u0007\u0010«\u0001\u001a\u00020}J\u0010\u0010¬\u0001\u001a\u00020}H\u0087@¢\u0006\u0003\u0010\u00ad\u0001J\t\u0010®\u0001\u001a\u00020 H\u0002J\n\u0010¯\u0001\u001a\u00030°\u0001H\u0002J\u0015\u0010±\u0001\u001a\u0005\u0018\u00010²\u00012\u0007\u0010³\u0001\u001a\u00020bH\u0002J\u0010\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\"0µ\u0001H\u0002J\t\u0010¶\u0001\u001a\u00020}H\u0002J\u0011\u0010·\u0001\u001a\u00020}2\u0006\u00100\u001a\u00020CH\u0002J\u0013\u0010¸\u0001\u001a\u00020}2\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\u000f\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020b0$H\u0007J\u0007\u0010¼\u0001\u001a\u00020}J\u0007\u0010½\u0001\u001a\u00020}J\u0010\u0010¾\u0001\u001a\u00020}2\u0007\u0010\u008e\u0001\u001a\u00020)J\u0013\u0010¿\u0001\u001a\u00020}2\n\u0010À\u0001\u001a\u0005\u0018\u00010Á\u0001J\u0013\u0010Â\u0001\u001a\u00020}2\b\u0010Ã\u0001\u001a\u00030Ä\u0001H\u0002JD\u0010Å\u0001\u001a$\u0012\u0018\u0012\u0016\u0012\u0005\u0012\u00030È\u00010Ç\u0001j\n\u0012\u0005\u0012\u00030È\u0001`É\u0001\u0012\u0005\u0012\u00030È\u00010Æ\u00012\r\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00020U0$2\b\u0010Ë\u0001\u001a\u00030Ì\u0001H\u0002J\u0013\u0010\u0086\u0001\u001a\u00020}2\b\u0010Ã\u0001\u001a\u00030Ä\u0001H\u0002J\u0014\u0010Í\u0001\u001a\u00020}2\t\u0010Î\u0001\u001a\u0004\u0018\u00010'H\u0016J\n\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0016J\u0011\u0010\u008a\u0001\u001a\u00020}2\b\u0010Ñ\u0001\u001a\u00030È\u0001J\n\u0010Ò\u0001\u001a\u00030Ó\u0001H\u0002J\u0007\u0010Ô\u0001\u001a\u00020}R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00102\u001a\u0002012\u0006\u00100\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0002072\u0006\u00100\u001a\u000207@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010>\u001a\u00020=2\u0006\u00100\u001a\u00020=@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010D\u001a\u00020C2\u0006\u00100\u001a\u00020C@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010J\u001a\u00020I2\u0006\u00100\u001a\u00020I@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u00020O2\u0006\u00100\u001a\u00020O@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010V\u001a\u0004\u0018\u00010U2\b\u00100\u001a\u0004\u0018\u00010U@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010]\u001a\u0004\u0018\u00010\\2\b\u00100\u001a\u0004\u0018\u00010\\@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010c\u001a\u00020b2\u0006\u00100\u001a\u00020b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010h\u001a\u00020)2\u0006\u00100\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010j\"\u0004\bo\u0010lR\u001a\u0010p\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010j\"\u0004\br\u0010lR+\u0010t\u001a\u00020)2\u0006\u0010s\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\bu\u0010j\"\u0004\bv\u0010lR\u000e\u0010y\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010{\u001a\b\u0012\u0004\u0012\u00020}0|8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0004\b~\u0010\u007fR&\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010|8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0081\u0001\u001a\u0005\b\u0084\u0001\u0010\u007fR&\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010|8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0081\u0001\u001a\u0005\b\u0088\u0001\u0010\u007fR&\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010|8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0081\u0001\u001a\u0005\b\u008c\u0001\u0010\u007fR\u000f\u0010\u008e\u0001\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Õ\u0001"}, d2 = {"Lexpo/modules/camera/ExpoCameraView;", "Lexpo/modules/kotlin/views/ExpoView;", "Lexpo/modules/interfaces/camera/CameraViewInterface;", "context", "Landroid/content/Context;", "appContext", "Lexpo/modules/kotlin/AppContext;", "<init>", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V", "currentActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getCurrentActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "orientationEventListener", "expo/modules/camera/ExpoCameraView$orientationEventListener$2$1", "getOrientationEventListener", "()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;", "orientationEventListener$delegate", "Lkotlin/Lazy;", "camera", "Landroidx/camera/core/Camera;", "getCamera", "()Landroidx/camera/core/Camera;", "setCamera", "(Landroidx/camera/core/Camera;)V", "activeRecording", "Landroidx/camera/video/Recording;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "imageCaptureUseCase", "Landroidx/camera/core/ImageCapture;", "imageAnalysisUseCase", "Landroidx/camera/core/ImageAnalysis;", "recorder", "Landroidx/camera/video/Recorder;", "barcodeFormats", "", "Lexpo/modules/camera/records/BarcodeType;", "glSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "isRecording", "", "previewView", "Landroidx/camera/view/PreviewView;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "shouldCreateCamera", "previewPaused", "value", "Lexpo/modules/camera/records/CameraType;", "lensFacing", "getLensFacing", "()Lexpo/modules/camera/records/CameraType;", "setLensFacing", "(Lexpo/modules/camera/records/CameraType;)V", "Lexpo/modules/camera/records/FlashMode;", "flashMode", "getFlashMode", "()Lexpo/modules/camera/records/FlashMode;", "setFlashMode", "(Lexpo/modules/camera/records/FlashMode;)V", "Lexpo/modules/camera/records/CameraMode;", "cameraMode", "getCameraMode", "()Lexpo/modules/camera/records/CameraMode;", "setCameraMode", "(Lexpo/modules/camera/records/CameraMode;)V", "", "zoom", "getZoom", "()F", "setZoom", "(F)V", "Lexpo/modules/camera/records/FocusMode;", "autoFocus", "getAutoFocus", "()Lexpo/modules/camera/records/FocusMode;", "setAutoFocus", "(Lexpo/modules/camera/records/FocusMode;)V", "Lexpo/modules/camera/records/VideoQuality;", "videoQuality", "getVideoQuality", "()Lexpo/modules/camera/records/VideoQuality;", "setVideoQuality", "(Lexpo/modules/camera/records/VideoQuality;)V", "", "videoEncodingBitrate", "getVideoEncodingBitrate", "()Ljava/lang/Integer;", "setVideoEncodingBitrate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Lexpo/modules/camera/records/CameraRatio;", "ratio", "getRatio", "()Lexpo/modules/camera/records/CameraRatio;", "setRatio", "(Lexpo/modules/camera/records/CameraRatio;)V", "", "pictureSize", "getPictureSize", "()Ljava/lang/String;", "setPictureSize", "(Ljava/lang/String;)V", "mirror", "getMirror", "()Z", "setMirror", "(Z)V", "mute", "getMute", "setMute", "animateShutter", "getAnimateShutter", "setAnimateShutter", "<set-?>", "enableTorch", "getEnableTorch", "setEnableTorch", "enableTorch$delegate", "Lkotlin/properties/ReadWriteProperty;", "lastWidth", "lastHeight", "onCameraReady", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "", "getOnCameraReady", "()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "onCameraReady$delegate", "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", "onMountError", "Lexpo/modules/camera/common/CameraMountErrorEvent;", "getOnMountError", "onMountError$delegate", "onBarcodeScanned", "Lexpo/modules/camera/common/BarcodeScannedEvent;", "getOnBarcodeScanned", "onBarcodeScanned$delegate", "onPictureSaved", "Lexpo/modules/camera/common/PictureSavedEvent;", "getOnPictureSaved", "onPictureSaved$delegate", "shouldScanBarcodes", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "left", "top", "right", "bottom", "onViewAdded", "child", "Landroid/view/View;", "takePicture", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/camera/PictureOptions;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "cacheDirectory", "Ljava/io/File;", "runtimeContext", "Lexpo/modules/kotlin/RuntimeContext;", "setCameraFlashMode", "mode", "setTorchEnabled", ViewProps.ENABLED, "record", "Lexpo/modules/camera/RecordingOptions;", "stopRecording", "toggleRecording", "createCamera", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createImageAnalyzer", "buildResolutionSelector", "Landroidx/camera/core/resolutionselector/ResolutionSelector;", "parseSizeSafely", "Landroid/util/Size;", "size", "createVideoCapture", "Landroidx/camera/video/VideoCapture;", "startFocusMetering", "setCameraZoom", "observeCameraState", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "getAvailablePictureSizes", "resumePreview", "pausePreview", "setShouldScanBarcodes", "setBarcodeScannerSettings", "settings", "Lexpo/modules/camera/records/BarcodeSettings;", "transformBarcodeScannerResultToViewCoordinates", OptionalModuleUtils.BARCODE, "Lexpo/modules/camera/utils/BarCodeScannerResult;", "getCornerPointsAndBoundingBox", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "cornerPoints", "boundingBox", "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;", "setPreviewTexture", "surfaceTexture", "getPreviewSizeAsArray", "", "response", "cancelCoroutineScope", "", "cleanupCamera", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpoCameraView extends ExpoView implements CameraViewInterface {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ExpoCameraView.class, "enableTorch", "getEnableTorch()Z", 0)), Reflection.property1(new PropertyReference1Impl(ExpoCameraView.class, "onCameraReady", "getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), Reflection.property1(new PropertyReference1Impl(ExpoCameraView.class, "onMountError", "getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), Reflection.property1(new PropertyReference1Impl(ExpoCameraView.class, "onBarcodeScanned", "getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), Reflection.property1(new PropertyReference1Impl(ExpoCameraView.class, "onPictureSaved", "getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};
    private Recording activeRecording;
    private boolean animateShutter;
    private FocusMode autoFocus;
    private List<? extends BarcodeType> barcodeFormats;
    private Camera camera;
    private CameraMode cameraMode;
    private ProcessCameraProvider cameraProvider;

    /* renamed from: enableTorch$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty enableTorch;
    private FlashMode flashMode;
    private SurfaceTexture glSurfaceTexture;
    private ImageAnalysis imageAnalysisUseCase;
    private ImageCapture imageCaptureUseCase;
    private boolean isRecording;
    private int lastHeight;
    private int lastWidth;
    private CameraType lensFacing;
    private boolean mirror;
    private boolean mute;

    /* renamed from: onBarcodeScanned$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onBarcodeScanned;

    /* renamed from: onCameraReady$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onCameraReady;

    /* renamed from: onMountError$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onMountError;

    /* renamed from: onPictureSaved$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onPictureSaved;

    /* renamed from: orientationEventListener$delegate, reason: from kotlin metadata */
    private final Lazy orientationEventListener;
    private String pictureSize;
    private boolean previewPaused;
    private PreviewView previewView;
    private CameraRatio ratio;
    private Recorder recorder;
    private final CoroutineScope scope;
    private boolean shouldCreateCamera;
    private boolean shouldScanBarcodes;
    private Integer videoEncodingBitrate;
    private VideoQuality videoQuality;
    private float zoom;

    /* compiled from: ExpoCameraView.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CameraState.Type.values().length];
            try {
                iArr[CameraState.Type.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PreviewView.ScaleType.values().length];
            try {
                iArr2[PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ExpoCameraView.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.camera.ExpoCameraView", f = "ExpoCameraView.kt", i = {}, l = {WalletConstants.ERROR_CODE_ILLEGAL_CALLER}, m = "createCamera", n = {}, s = {})
    /* renamed from: expo.modules.camera.ExpoCameraView$createCamera$1, reason: invalid class name and case insensitive filesystem */
    static final class C11841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11841(Continuation<? super C11841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExpoCameraView.this.createCamera(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoCameraView(Context context, final AppContext appContext) {
        super(context, appContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.orientationEventListener = LazyKt.lazy(new Function0() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExpoCameraView.orientationEventListener_delegate$lambda$0(appContext, this);
            }
        });
        this.barcodeFormats = CollectionsKt.emptyList();
        PreviewView previewView = new PreviewView(context);
        previewView.setElevation(0.0f);
        this.previewView = previewView;
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.lensFacing = CameraType.BACK;
        this.flashMode = FlashMode.OFF;
        this.cameraMode = CameraMode.PICTURE;
        this.autoFocus = FocusMode.OFF;
        this.videoQuality = VideoQuality.VIDEO1080P;
        this.pictureSize = "";
        this.animateShutter = true;
        Delegates delegates = Delegates.INSTANCE;
        final boolean z = false;
        this.enableTorch = new ObservableProperty<Boolean>(z) { // from class: expo.modules.camera.ExpoCameraView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                this.setTorchEnabled(zBooleanValue);
            }
        };
        ExpoCameraView expoCameraView = this;
        this.onCameraReady = new ViewEventDelegate(expoCameraView, null);
        this.onMountError = new ViewEventDelegate(expoCameraView, null);
        this.onBarcodeScanned = new ViewEventDelegate(expoCameraView, new Function1() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Short.valueOf(ExpoCameraView.onBarcodeScanned_delegate$lambda$4((BarcodeScannedEvent) obj));
            }
        });
        this.onPictureSaved = new ViewEventDelegate(expoCameraView, new Function1() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Short.valueOf(ExpoCameraView.onPictureSaved_delegate$lambda$5((PictureSavedEvent) obj));
            }
        });
        getOrientationEventListener().enable();
        this.previewView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: expo.modules.camera.ExpoCameraView.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                if (parent != null) {
                    parent.measure(View.MeasureSpec.makeMeasureSpec(ExpoCameraView.this.getMeasuredWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(ExpoCameraView.this.getMeasuredHeight(), BasicMeasure.EXACTLY));
                }
                if (parent != null) {
                    parent.layout(0, 0, parent.getMeasuredWidth(), parent.getMeasuredHeight());
                }
            }
        });
        addView(this.previewView, new ViewGroup.LayoutParams(-1, -1));
    }

    private final AppCompatActivity getCurrentActivity() throws Exceptions.MissingActivity {
        Activity throwingActivity = getAppContext().getThrowingActivity();
        Intrinsics.checkNotNull(throwingActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (AppCompatActivity) throwingActivity;
    }

    private final ExpoCameraView$orientationEventListener$2$1 getOrientationEventListener() {
        return (ExpoCameraView$orientationEventListener$2$1) this.orientationEventListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [expo.modules.camera.ExpoCameraView$orientationEventListener$2$1] */
    public static final ExpoCameraView$orientationEventListener$2$1 orientationEventListener_delegate$lambda$0(AppContext appContext, final ExpoCameraView expoCameraView) throws Exceptions.MissingActivity {
        final Activity throwingActivity = appContext.getThrowingActivity();
        return new OrientationEventListener(throwingActivity) { // from class: expo.modules.camera.ExpoCameraView$orientationEventListener$2$1
            {
                super(throwingActivity);
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                if (orientation == -1) {
                    return;
                }
                int i = (45 > orientation || orientation >= 135) ? (135 > orientation || orientation >= 225) ? (225 > orientation || orientation >= 315) ? 0 : 1 : 2 : 3;
                ImageAnalysis imageAnalysis = this.this$0.imageAnalysisUseCase;
                if (imageAnalysis != null) {
                    imageAnalysis.setTargetRotation(i);
                }
                ImageCapture imageCapture = this.this$0.imageCaptureUseCase;
                if (imageCapture != null) {
                    imageCapture.setTargetRotation(i);
                }
            }
        };
    }

    public final Camera getCamera() {
        return this.camera;
    }

    public final void setCamera(Camera camera) {
        this.camera = camera;
    }

    public final CameraType getLensFacing() {
        return this.lensFacing;
    }

    public final void setLensFacing(CameraType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.lensFacing = value;
        this.shouldCreateCamera = true;
    }

    public final FlashMode getFlashMode() {
        return this.flashMode;
    }

    public final void setFlashMode(FlashMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.flashMode = value;
        setCameraFlashMode(value);
    }

    public final CameraMode getCameraMode() {
        return this.cameraMode;
    }

    public final void setCameraMode(CameraMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cameraMode = value;
        this.shouldCreateCamera = true;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float f) {
        this.zoom = f;
        setCameraZoom(f);
    }

    public final FocusMode getAutoFocus() {
        return this.autoFocus;
    }

    public final void setAutoFocus(FocusMode value) {
        CameraControl cameraControl;
        Intrinsics.checkNotNullParameter(value, "value");
        this.autoFocus = value;
        Camera camera = this.camera;
        if (camera == null || (cameraControl = camera.getCameraControl()) == null) {
            return;
        }
        if (this.autoFocus == FocusMode.OFF) {
            Intrinsics.checkNotNull(cameraControl.cancelFocusAndMetering());
        } else {
            startFocusMetering();
        }
    }

    public final VideoQuality getVideoQuality() {
        return this.videoQuality;
    }

    public final void setVideoQuality(VideoQuality value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.videoQuality = value;
        this.shouldCreateCamera = true;
    }

    public final Integer getVideoEncodingBitrate() {
        return this.videoEncodingBitrate;
    }

    public final void setVideoEncodingBitrate(Integer num) {
        this.videoEncodingBitrate = num;
        this.shouldCreateCamera = true;
    }

    public final CameraRatio getRatio() {
        return this.ratio;
    }

    public final void setRatio(CameraRatio cameraRatio) {
        this.ratio = cameraRatio;
        this.shouldCreateCamera = true;
    }

    public final String getPictureSize() {
        return this.pictureSize;
    }

    public final void setPictureSize(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.pictureSize = value;
        this.shouldCreateCamera = true;
    }

    public final boolean getMirror() {
        return this.mirror;
    }

    public final void setMirror(boolean z) {
        this.mirror = z;
        this.shouldCreateCamera = true;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final void setMute(boolean z) {
        this.mute = z;
    }

    public final boolean getAnimateShutter() {
        return this.animateShutter;
    }

    public final void setAnimateShutter(boolean z) {
        this.animateShutter = z;
    }

    public final boolean getEnableTorch() {
        return ((Boolean) this.enableTorch.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setEnableTorch(boolean z) {
        this.enableTorch.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final ViewEventCallback<Unit> getOnCameraReady() {
        return this.onCameraReady.getValue(this, $$delegatedProperties[1]);
    }

    private final ViewEventCallback<CameraMountErrorEvent> getOnMountError() {
        return this.onMountError.getValue(this, $$delegatedProperties[2]);
    }

    private final ViewEventCallback<BarcodeScannedEvent> getOnBarcodeScanned() {
        return this.onBarcodeScanned.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final short onBarcodeScanned_delegate$lambda$4(BarcodeScannedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return (short) (event.getData().hashCode() % LayoutKt.LargeDimension);
    }

    private final ViewEventCallback<PictureSavedEvent> getOnPictureSaved() {
        return this.onPictureSaved.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final short onPictureSaved_delegate$lambda$5(PictureSavedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = event.getData().getString(ShareConstants.MEDIA_URI);
        return (short) ((string != null ? string.hashCode() : -1) % LayoutKt.LargeDimension);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChild(this.previewView, widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(ViewGroup.resolveSize(this.previewView.getMeasuredWidth(), widthMeasureSpec), ViewGroup.resolveSize(this.previewView.getMeasuredHeight(), heightMeasureSpec));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i = right - left;
        int i2 = bottom - top;
        if (i == this.lastWidth && i2 == this.lastHeight) {
            return;
        }
        this.previewView.layout(0, 0, i, i2);
        SurfaceTexture surfaceTexture = this.glSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this.lastWidth = i;
        this.lastHeight = i2;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        if (Intrinsics.areEqual(child, this.previewView)) {
            return;
        }
        if (child != null) {
            child.bringToFront();
        }
        removeView(this.previewView);
        addView(this.previewView, 0);
    }

    public final void takePicture(PictureOptions options, Promise promise, File cacheDirectory, RuntimeContext runtimeContext) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        Object systemService = getContext().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        int streamVolume = ((AudioManager) systemService).getStreamVolume(3);
        boolean shutterSound = options.getShutterSound();
        ImageCapture imageCapture = this.imageCaptureUseCase;
        if (imageCapture != null) {
            imageCapture.m162lambda$takePicture$1$androidxcameracoreImageCapture(ContextCompat.getMainExecutor(getContext()), new C11871(shutterSound, streamVolume, this, options, promise, cacheDirectory, runtimeContext));
        }
    }

    /* compiled from: ExpoCameraView.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"expo/modules/camera/ExpoCameraView$takePicture$1", "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;", "onCaptureStarted", "", "onCaptureSuccess", "image", "Landroidx/camera/core/ImageProxy;", "onError", NotificationsService.EXCEPTION_KEY, "Landroidx/camera/core/ImageCaptureException;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: expo.modules.camera.ExpoCameraView$takePicture$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11871 extends ImageCapture.OnImageCapturedCallback {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ boolean $hasShutterSound;
        final /* synthetic */ PictureOptions $options;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ RuntimeContext $runtimeContext;
        final /* synthetic */ int $volume;
        final /* synthetic */ ExpoCameraView this$0;

        C11871(boolean z, int i, ExpoCameraView expoCameraView, PictureOptions pictureOptions, Promise promise, File file, RuntimeContext runtimeContext) {
            this.$hasShutterSound = z;
            this.$volume = i;
            this.this$0 = expoCameraView;
            this.$options = pictureOptions;
            this.$promise = promise;
            this.$cacheDirectory = file;
            this.$runtimeContext = runtimeContext;
        }

        @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
        public void onCaptureStarted() {
            if (this.$hasShutterSound && this.$volume != 0) {
                new MediaActionSound().play(0);
            }
            if (this.this$0.getAnimateShutter()) {
                View rootView = this.this$0.getRootView();
                final ExpoCameraView expoCameraView = this.this$0;
                rootView.postDelayed(new Runnable() { // from class: expo.modules.camera.ExpoCameraView$takePicture$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExpoCameraView.C11871.onCaptureStarted$lambda$1(expoCameraView);
                    }
                }, 100L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCaptureStarted$lambda$1(final ExpoCameraView expoCameraView) {
            expoCameraView.getRootView().setForeground(new ColorDrawable(-1));
            expoCameraView.getRootView().postDelayed(new Runnable() { // from class: expo.modules.camera.ExpoCameraView$takePicture$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoCameraView.C11871.onCaptureStarted$lambda$1$lambda$0(expoCameraView);
                }
            }, 50L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCaptureStarted$lambda$1$lambda$0(ExpoCameraView expoCameraView) {
            expoCameraView.getRootView().setForeground(null);
        }

        @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
        public void onCaptureSuccess(ImageProxy image) {
            Intrinsics.checkNotNullParameter(image, "image");
            ImageProxy.PlaneProxy[] planes = image.getPlanes();
            Intrinsics.checkNotNullExpressionValue(planes, "getPlanes(...)");
            byte[] byteArray = BarcodeAnalyzerKt.toByteArray(planes);
            if (this.$options.getFastMode()) {
                this.$promise.resolve((Object) null);
            }
            File file = this.$cacheDirectory;
            ExpoCameraView expoCameraView = this.this$0;
            BuildersKt__Builders_commonKt.launch$default(expoCameraView.scope, null, null, new ExpoCameraView$takePicture$1$onCaptureSuccess$1$1(expoCameraView, byteArray, this.$promise, this.$options, this.$runtimeContext, file, null), 3, null);
            image.close();
        }

        @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
        public void onError(ImageCaptureException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.$promise.reject(new CameraExceptions.ImageCaptureFailed());
        }
    }

    public final void setCameraFlashMode(FlashMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        ImageCapture imageCapture = this.imageCaptureUseCase;
        if (imageCapture != null) {
            imageCapture.setFlashMode(mode.mapToLens());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTorchEnabled(boolean enabled) {
        CameraInfo cameraInfo;
        Camera camera;
        CameraControl cameraControl;
        Camera camera2 = this.camera;
        if (camera2 == null || (cameraInfo = camera2.getCameraInfo()) == null || !cameraInfo.hasFlashUnit() || (camera = this.camera) == null || (cameraControl = camera.getCameraControl()) == null) {
            return;
        }
        cameraControl.enableTorch(enabled);
    }

    public final void record(RecordingOptions options, final Promise promise, File cacheDirectory) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        FileOutputOptions fileOutputOptionsBuild = ((FileOutputOptions.Builder) ((FileOutputOptions.Builder) new FileOutputOptions.Builder(FileSystemUtils.INSTANCE.generateOutputFile(cacheDirectory, "Camera", ".mp4")).setFileSizeLimit(options.getMaxFileSize())).setDurationLimitMillis(options.getMaxDuration() * 1000)).build();
        Intrinsics.checkNotNullExpressionValue(fileOutputOptionsBuild, "build(...)");
        Recorder recorder = this.recorder;
        if (recorder != null) {
            if (!this.mute && ActivityCompat.checkSelfPermission(getContext(), "android.permission.RECORD_AUDIO") != 0) {
                promise.reject(new Exceptions.MissingPermissions("android.permission.RECORD_AUDIO"));
                return;
            }
            PendingRecording pendingRecordingPrepareRecording = recorder.prepareRecording(getContext(), fileOutputOptionsBuild);
            if (!this.mute) {
                PendingRecording.withAudioEnabled$default(pendingRecordingPrepareRecording, false, 1, null);
            }
            Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
            Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
            this.activeRecording = pendingRecordingPrepareRecording.start(mainExecutor, new Consumer() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ExpoCameraView.record$lambda$9$lambda$8(this.f$0, promise, (VideoRecordEvent) obj);
                }
            });
            return;
        }
        promise.reject("E_RECORDING_FAILED", "Starting video recording failed - could not create video file.", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void record$lambda$9$lambda$8(ExpoCameraView expoCameraView, Promise promise, VideoRecordEvent event) {
        String message;
        String message2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof VideoRecordEvent.Pause) {
            expoCameraView.isRecording = false;
            return;
        }
        if (event instanceof VideoRecordEvent.Resume) {
            expoCameraView.isRecording = true;
            return;
        }
        if (event instanceof VideoRecordEvent.Start) {
            expoCameraView.isRecording = true;
            return;
        }
        if (event instanceof VideoRecordEvent.Finalize) {
            VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) event;
            int error = finalize.getError();
            if (error == 0 || error == 2 || error == 4 || error == 9) {
                Bundle bundle = new Bundle();
                bundle.putString(ShareConstants.MEDIA_URI, finalize.getOutputResults().getOutputUri().toString());
                promise.resolve(bundle);
                return;
            }
            Throwable cause = finalize.getCause();
            if (cause == null || (message2 = cause.getMessage()) == null) {
                Throwable cause2 = finalize.getCause();
                if (cause2 == null || (message = cause2.getMessage()) == null) {
                    message = "Unknown error";
                }
                message2 = "Video recording Failed: " + message;
            }
            promise.reject(new CameraExceptions.VideoRecordingFailed(message2));
        }
    }

    public final void stopRecording() throws Throwable {
        this.isRecording = false;
        Recording recording = this.activeRecording;
        if (recording != null) {
            recording.close();
        }
    }

    public final void toggleRecording() {
        Recording recording = this.activeRecording;
        if (recording != null) {
            if (this.isRecording) {
                recording.pause();
            } else {
                recording.resume();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCamera(Continuation<? super Unit> continuation) {
        C11841 c11841;
        PreviewView.ScaleType scaleType;
        if (continuation instanceof C11841) {
            c11841 = (C11841) continuation;
            if ((c11841.label & Integer.MIN_VALUE) != 0) {
                c11841.label -= Integer.MIN_VALUE;
            } else {
                c11841 = new C11841(continuation);
            }
        }
        Object objAwaitInstance = c11841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11841.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwaitInstance);
            if (!this.shouldCreateCamera || this.previewPaused) {
                return Unit.INSTANCE;
            }
            this.shouldCreateCamera = false;
            ProcessCameraProvider.Companion companion = ProcessCameraProvider.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c11841.label = 1;
            objAwaitInstance = ProcessCameraProviderExtKt.awaitInstance(companion, context, c11841);
            if (objAwaitInstance == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitInstance);
        }
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) objAwaitInstance;
        CameraRatio cameraRatio = this.ratio;
        if (cameraRatio != null) {
            PreviewView previewView = this.previewView;
            if (cameraRatio == CameraRatio.FOUR_THREE || this.ratio == CameraRatio.SIXTEEN_NINE) {
                scaleType = PreviewView.ScaleType.FIT_CENTER;
            } else {
                scaleType = PreviewView.ScaleType.FILL_CENTER;
            }
            previewView.setScaleType(scaleType);
        }
        ResolutionSelector resolutionSelectorBuildResolutionSelector = buildResolutionSelector();
        Preview previewBuild = new Preview.Builder().setResolutionSelector(resolutionSelectorBuildResolutionSelector).build();
        previewBuild.setSurfaceProvider(this.previewView.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(previewBuild, "also(...)");
        final SurfaceTexture surfaceTexture = this.glSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.previewView.getWidth(), this.previewView.getHeight());
            previewBuild.setSurfaceProvider(new Preview.SurfaceProvider() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda8
                @Override // androidx.camera.core.Preview.SurfaceProvider
                public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                    ExpoCameraView.createCamera$lambda$15$lambda$14(surfaceTexture, this, surfaceRequest);
                }
            });
        }
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(this.lensFacing.mapToCharacteristic()).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "build(...)");
        this.imageCaptureUseCase = new ImageCapture.Builder().setResolutionSelector(resolutionSelectorBuildResolutionSelector).setFlashMode(this.flashMode.mapToLens()).build();
        VideoCapture<Recorder> videoCaptureCreateVideoCapture = createVideoCapture();
        this.imageAnalysisUseCase = createImageAnalyzer();
        UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
        builder.addUseCase(previewBuild);
        if (this.cameraMode == CameraMode.PICTURE) {
            ImageCapture imageCapture = this.imageCaptureUseCase;
            if (imageCapture != null) {
                builder.addUseCase(imageCapture);
            }
            ImageAnalysis imageAnalysis = this.imageAnalysisUseCase;
            if (imageAnalysis != null) {
                builder.addUseCase(imageAnalysis);
            }
        } else {
            builder.addUseCase(videoCaptureCreateVideoCapture);
        }
        UseCaseGroup useCaseGroupBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "build(...)");
        try {
            processCameraProvider.unbindAll();
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(getCurrentActivity(), cameraSelectorBuild, useCaseGroupBuild);
            this.camera = cameraBindToLifecycle;
            if (cameraBindToLifecycle != null) {
                CameraInfo cameraInfo = cameraBindToLifecycle.getCameraInfo();
                Intrinsics.checkNotNullExpressionValue(cameraInfo, "getCameraInfo(...)");
                observeCameraState(cameraInfo);
            }
            setCameraZoom(this.zoom);
            this.cameraProvider = processCameraProvider;
        } catch (Exception unused) {
            getOnMountError().invoke(new CameraMountErrorEvent("Camera component could not be rendered - is there any other instance running?"));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCamera$lambda$15$lambda$14(SurfaceTexture surfaceTexture, ExpoCameraView expoCameraView, SurfaceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final Surface surface = new Surface(surfaceTexture);
        request.provideSurface(surface, ContextCompat.getMainExecutor(expoCameraView.getContext()), new Consumer() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                surface.release();
            }
        });
    }

    private final ImageAnalysis createImageAnalyzer() {
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setResolutionSelector(new ResolutionSelector.Builder().setResolutionStrategy(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build()).setBackpressureStrategy(0).build();
        Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "build(...)");
        if (this.shouldScanBarcodes && CameraUtils.INSTANCE.isMLKitBarcodeScannerAvailable()) {
            try {
                imageAnalysisBuild.setAnalyzer(ContextCompat.getMainExecutor(getContext()), new BarcodeAnalyzer(this.lensFacing, this.barcodeFormats, new Function1() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ExpoCameraView.createImageAnalyzer$lambda$21$lambda$20(this.f$0, (BarCodeScannerResult) obj);
                    }
                }));
                return imageAnalysisBuild;
            } catch (Exception e) {
                Log.e(CameraViewModule.INSTANCE.getTAG$expo_camera_release(), "Failed to initialize BarcodeAnalyzer: " + e.getMessage());
            }
        }
        return imageAnalysisBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createImageAnalyzer$lambda$21$lambda$20(ExpoCameraView expoCameraView, BarCodeScannerResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        expoCameraView.onBarcodeScanned(it);
        return Unit.INSTANCE;
    }

    private final ResolutionSelector buildResolutionSelector() {
        ResolutionStrategy HIGHEST_AVAILABLE_STRATEGY;
        if (this.pictureSize.length() > 0) {
            Size sizeSafely = parseSizeSafely(this.pictureSize);
            if (sizeSafely != null) {
                HIGHEST_AVAILABLE_STRATEGY = new ResolutionStrategy(sizeSafely, 3);
            } else {
                HIGHEST_AVAILABLE_STRATEGY = ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY;
                Intrinsics.checkNotNullExpressionValue(HIGHEST_AVAILABLE_STRATEGY, "HIGHEST_AVAILABLE_STRATEGY");
            }
        } else {
            HIGHEST_AVAILABLE_STRATEGY = ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY;
            Intrinsics.checkNotNull(HIGHEST_AVAILABLE_STRATEGY);
        }
        if (this.ratio == CameraRatio.ONE_ONE) {
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionFilter(new ResolutionFilter() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda5
                @Override // androidx.camera.core.resolutionselector.ResolutionFilter
                public final List filter(List list, int i) {
                    return ExpoCameraView.buildResolutionSelector$lambda$24(list, i);
                }
            }).setResolutionStrategy(HIGHEST_AVAILABLE_STRATEGY).build();
            Intrinsics.checkNotNull(resolutionSelectorBuild);
            return resolutionSelectorBuild;
        }
        ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
        CameraRatio cameraRatio = this.ratio;
        if (cameraRatio != null) {
            builder.setAspectRatioStrategy(cameraRatio.mapToStrategy());
        }
        builder.setResolutionStrategy(HIGHEST_AVAILABLE_STRATEGY);
        ResolutionSelector resolutionSelectorBuild2 = builder.build();
        Intrinsics.checkNotNull(resolutionSelectorBuild2);
        return resolutionSelectorBuild2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List buildResolutionSelector$lambda$24(List supportedSizes, int i) {
        Intrinsics.checkNotNullParameter(supportedSizes, "supportedSizes");
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedSizes) {
            Size size = (Size) obj;
            if (size.getWidth() == size.getHeight()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Size parseSizeSafely(String size) {
        if (!new Regex("\\d+x\\d+").matches(size)) {
            return null;
        }
        try {
            return Size.parseSize(size);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final VideoCapture<Recorder> createVideoCapture() {
        Quality qualityMapToQuality = this.videoQuality.mapToQuality();
        FallbackStrategy fallbackStrategyHigherQualityOrLowerThan = FallbackStrategy.higherQualityOrLowerThan(qualityMapToQuality);
        Intrinsics.checkNotNullExpressionValue(fallbackStrategyHigherQualityOrLowerThan, "higherQualityOrLowerThan(...)");
        QualitySelector qualitySelectorFrom = QualitySelector.from(qualityMapToQuality, fallbackStrategyHigherQualityOrLowerThan);
        Intrinsics.checkNotNullExpressionValue(qualitySelectorFrom, "from(...)");
        Recorder.Builder builder = new Recorder.Builder();
        Integer num = this.videoEncodingBitrate;
        if (num != null) {
            builder.setTargetVideoEncodingBitRate(num.intValue());
        }
        Recorder recorderBuild = builder.setExecutor(ContextCompat.getMainExecutor(getContext())).setQualitySelector(qualitySelectorFrom).build();
        this.recorder = recorderBuild;
        Intrinsics.checkNotNullExpressionValue(recorderBuild, "also(...)");
        VideoCapture.Builder builder2 = new VideoCapture.Builder(recorderBuild);
        if (this.mirror) {
            builder2.setMirrorMode(2);
        }
        builder2.setVideoStabilizationEnabled(true);
        VideoCapture<Recorder> videoCaptureBuild = builder2.build();
        Intrinsics.checkNotNullExpressionValue(videoCaptureBuild, "build(...)");
        return videoCaptureBuild;
    }

    private final void startFocusMetering() {
        Camera camera = this.camera;
        if (camera != null) {
            FocusMeteringAction focusMeteringActionBuild = new FocusMeteringAction.Builder(new DisplayOrientedMeteringPointFactory(this.previewView.getDisplay(), camera.getCameraInfo(), this.previewView.getWidth(), this.previewView.getHeight()).createPoint(1.0f, 1.0f), 1).build();
            Intrinsics.checkNotNullExpressionValue(focusMeteringActionBuild, "build(...)");
            camera.getCameraControl().startFocusAndMetering(focusMeteringActionBuild);
        }
    }

    private final void setCameraZoom(float value) {
        CameraControl cameraControl;
        CameraInfo cameraInfo;
        LiveData<ZoomState> zoomState;
        ZoomState value2;
        Camera camera = this.camera;
        float maxZoomRatio = (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (zoomState = cameraInfo.getZoomState()) == null || (value2 = zoomState.getValue()) == null) ? 1.0f : value2.getMaxZoomRatio();
        float fMax = Float.max(1.0f, Float.min(maxZoomRatio, RangesKt.coerceIn(value, 0.0f, 1.0f) * maxZoomRatio));
        Camera camera2 = this.camera;
        if (camera2 == null || (cameraControl = camera2.getCameraControl()) == null) {
            return;
        }
        cameraControl.setZoomRatio(fMax);
    }

    private final void observeCameraState(CameraInfo cameraInfo) {
        cameraInfo.getCameraState().observe(getCurrentActivity(), new ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: expo.modules.camera.ExpoCameraView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExpoCameraView.observeCameraState$lambda$32(this.f$0, (CameraState) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeCameraState$lambda$32(ExpoCameraView expoCameraView, CameraState cameraState) {
        if (WhenMappings.$EnumSwitchMapping$0[cameraState.getType().ordinal()] == 1) {
            expoCameraView.getOnCameraReady().invoke(Unit.INSTANCE);
            expoCameraView.setTorchEnabled(expoCameraView.getEnableTorch());
        }
        return Unit.INSTANCE;
    }

    public final List<String> getAvailablePictureSizes() {
        CameraInfo cameraInfo;
        ArrayList arrayList;
        Size[] outputSizes;
        Camera camera = this.camera;
        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) Camera2CameraInfo.from(cameraInfo).getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(256)) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    String string = size.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    arrayList2.add(string);
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final void resumePreview() {
        this.shouldCreateCamera = true;
        this.previewPaused = false;
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C11851(null), 3, null);
    }

    /* compiled from: ExpoCameraView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.camera.ExpoCameraView$resumePreview$1", f = "ExpoCameraView.kt", i = {}, l = {622}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.camera.ExpoCameraView$resumePreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C11851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11851(Continuation<? super C11851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpoCameraView.this.new C11851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ExpoCameraView.this.createCamera(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void pausePreview() {
        this.previewPaused = true;
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
    }

    public final void setShouldScanBarcodes(boolean shouldScanBarcodes) {
        this.shouldScanBarcodes = shouldScanBarcodes;
        this.shouldCreateCamera = true;
    }

    public final void setBarcodeScannerSettings(BarcodeSettings settings) {
        List<BarcodeType> listEmptyList;
        if (settings == null || (listEmptyList = settings.getBarcodeTypes()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.barcodeFormats = listEmptyList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[LOOP:0: B:28:0x0082->B:30:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[LOOP:1: B:36:0x00bf->B:38:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[EDGE_INSN: B:41:0x009d->B:31:0x009d BREAK  A[LOOP:0: B:28:0x0082->B:30:0x009b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[EDGE_INSN: B:43:0x00da->B:39:0x00da BREAK  A[LOOP:1: B:36:0x00bf->B:38:0x00d8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void transformBarcodeScannerResultToViewCoordinates(BarCodeScannerResult barcode) {
        float f;
        float f2;
        int first;
        int last;
        int step;
        int first2;
        int last2;
        int step2;
        List<Integer> cornerPoints = barcode.getCornerPoints();
        float width = this.previewView.getWidth();
        float height = this.previewView.getHeight();
        float width2 = barcode.getWidth();
        float height2 = barcode.getHeight();
        if (width <= 0.0f || height <= 0.0f || width2 <= 0.0f || height2 <= 0.0f) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.previewView.getScaleType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                f = width / width2;
                f2 = height / height2;
                IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, cornerPoints.size()), 2);
                first = intProgressionStep.getFirst();
                last = intProgressionStep.getLast();
                step = intProgressionStep.getStep();
                if ((step <= 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        cornerPoints.set(first, Integer.valueOf(MathKt.roundToInt(cornerPoints.get(first).intValue() * f)));
                        if (first == last) {
                            break;
                        } else {
                            first += step;
                        }
                    }
                }
                IntProgression intProgressionStep2 = RangesKt.step(RangesKt.until(1, cornerPoints.size()), 2);
                first2 = intProgressionStep2.getFirst();
                last2 = intProgressionStep2.getLast();
                step2 = intProgressionStep2.getStep();
                if ((step2 <= 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        cornerPoints.set(first2, Integer.valueOf(MathKt.roundToInt(cornerPoints.get(first2).intValue() * f2)));
                        if (first2 == last2) {
                            break;
                        } else {
                            first2 += step2;
                        }
                    }
                }
                barcode.setCornerPoints(cornerPoints);
                barcode.setHeight((int) height);
                barcode.setWidth((int) width);
            }
            f = width / height > width2 / height2 ? width / width2 : height / height2;
        } else if (width / height > width2 / height2) {
        }
        f2 = f;
        IntProgression intProgressionStep3 = RangesKt.step(RangesKt.until(0, cornerPoints.size()), 2);
        first = intProgressionStep3.getFirst();
        last = intProgressionStep3.getLast();
        step = intProgressionStep3.getStep();
        if (step <= 0) {
            while (true) {
                cornerPoints.set(first, Integer.valueOf(MathKt.roundToInt(cornerPoints.get(first).intValue() * f)));
                if (first == last) {
                }
                first += step;
            }
        } else {
            while (true) {
                cornerPoints.set(first, Integer.valueOf(MathKt.roundToInt(cornerPoints.get(first).intValue() * f)));
                if (first == last) {
                }
                first += step;
            }
        }
        IntProgression intProgressionStep22 = RangesKt.step(RangesKt.until(1, cornerPoints.size()), 2);
        first2 = intProgressionStep22.getFirst();
        last2 = intProgressionStep22.getLast();
        step2 = intProgressionStep22.getStep();
        if (step2 <= 0) {
            while (true) {
                cornerPoints.set(first2, Integer.valueOf(MathKt.roundToInt(cornerPoints.get(first2).intValue() * f2)));
                if (first2 == last2) {
                }
                first2 += step2;
            }
        } else {
            while (true) {
                cornerPoints.set(first2, Integer.valueOf(MathKt.roundToInt(cornerPoints.get(first2).intValue() * f2)));
                if (first2 == last2) {
                }
                first2 += step2;
            }
        }
        barcode.setCornerPoints(cornerPoints);
        barcode.setHeight((int) height);
        barcode.setWidth((int) width);
    }

    private final Pair<ArrayList<Bundle>, Bundle> getCornerPointsAndBoundingBox(List<Integer> cornerPoints, BarCodeScannerResult.BoundingBox boundingBox) {
        float f = this.previewView.getResources().getDisplayMetrics().density;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, cornerPoints.size() - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                Bundle bundle = new Bundle();
                bundle.putFloat("x", cornerPoints.get(i + 1).intValue() / f);
                bundle.putFloat(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, cornerPoints.get(i).intValue() / f);
                arrayList.add(bundle);
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        bundle3.putFloat("x", boundingBox.getX() / f);
        bundle3.putFloat(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, boundingBox.getY() / f);
        Unit unit = Unit.INSTANCE;
        bundle2.putParcelable("origin", bundle3);
        Bundle bundle4 = new Bundle();
        bundle4.putFloat("width", boundingBox.getWidth() / f);
        bundle4.putFloat("height", boundingBox.getHeight() / f);
        Unit unit2 = Unit.INSTANCE;
        bundle2.putParcelable("size", bundle4);
        return TuplesKt.to(arrayList, bundle2);
    }

    private final void onBarcodeScanned(BarCodeScannerResult barcode) {
        if (this.shouldScanBarcodes) {
            transformBarcodeScannerResultToViewCoordinates(barcode);
            Pair<ArrayList<Bundle>, Bundle> cornerPointsAndBoundingBox = getCornerPointsAndBoundingBox(barcode.getCornerPoints(), barcode.getBoundingBox());
            getOnBarcodeScanned().invoke(new BarcodeScannedEvent(getId(), String.valueOf(barcode.getValue()), String.valueOf(barcode.getRaw()), BarcodeType.INSTANCE.mapFormatToString(barcode.getType()), cornerPointsAndBoundingBox.component1(), cornerPointsAndBoundingBox.component2(), barcode.getExtra()));
        }
    }

    @Override // expo.modules.interfaces.camera.CameraViewInterface
    public void setPreviewTexture(SurfaceTexture surfaceTexture) {
        this.glSurfaceTexture = surfaceTexture;
        this.shouldCreateCamera = true;
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C11861(null), 3, null);
    }

    /* compiled from: ExpoCameraView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.camera.ExpoCameraView$setPreviewTexture$1", f = "ExpoCameraView.kt", i = {}, l = {763}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.camera.ExpoCameraView$setPreviewTexture$1, reason: invalid class name and case insensitive filesystem */
    static final class C11861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11861(Continuation<? super C11861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpoCameraView.this.new C11861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ExpoCameraView.this.createCamera(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // expo.modules.interfaces.camera.CameraViewInterface
    public int[] getPreviewSizeAsArray() {
        return new int[]{this.previewView.getWidth(), this.previewView.getHeight()};
    }

    public final void onPictureSaved(Bundle response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ViewEventCallback<PictureSavedEvent> onPictureSaved = getOnPictureSaved();
        int i = response.getInt("id");
        Bundle bundle = response.getBundle("data");
        Intrinsics.checkNotNull(bundle);
        onPictureSaved.invoke(new PictureSavedEvent(i, bundle));
    }

    private final Object cancelCoroutineScope() {
        try {
            CoroutineScopeKt.cancel(this.scope, new ModuleDestroyedException(null, 1, null));
            return Unit.INSTANCE;
        } catch (Exception unused) {
            return Integer.valueOf(Log.e(CameraViewModule.INSTANCE.getTAG$expo_camera_release(), "The scope does not have a job in it"));
        }
    }

    public final void cleanupCamera() {
        getOrientationEventListener().disable();
        cancelCoroutineScope();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        SurfaceTexture surfaceTexture = this.glSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }
}

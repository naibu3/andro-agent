package coil3.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.EventListener;
import coil3.Image_androidKt;
import coil3.intercept.EngineInterceptor;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.size.Size;
import coil3.transform.Transformation;
import coil3.util.BitmapsKt;
import coil3.util.DrawableUtils;
import coil3.util.Logger;
import coil3.util.Utils_androidKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import org.apache.commons.io.FilenameUtils;

/* compiled from: EngineInterceptor.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0080@¢\u0006\u0002\u0010\u000b\u001a0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u0013"}, d2 = {ViewProps.TRANSFORM, "Lcoil3/intercept/EngineInterceptor$ExecuteResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "request", "Lcoil3/request/ImageRequest;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil3/request/Options;", "eventListener", "Lcoil3/EventListener;", "logger", "Lcoil3/util/Logger;", "(Lcoil3/intercept/EngineInterceptor$ExecuteResult;Lcoil3/request/ImageRequest;Lcoil3/request/Options;Lcoil3/EventListener;Lcoil3/util/Logger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertDrawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "transformations", "", "Lcoil3/transform/Transformation;", "coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EngineInterceptorKt {

    /* compiled from: EngineInterceptor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptorKt", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0}, l = {52}, m = ViewProps.TRANSFORM, n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "request", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "eventListener", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
    /* renamed from: coil3.intercept.EngineInterceptorKt$transform$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptorKt.transform(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f7 -> B:32:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object transform(EngineInterceptor.ExecuteResult executeResult, ImageRequest imageRequest, Options options, EventListener eventListener, Logger logger, Continuation<? super EngineInterceptor.ExecuteResult> continuation) {
        AnonymousClass1 anonymousClass1;
        Options options2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        int i;
        Bitmap bitmap;
        int i2;
        List<Transformation> list;
        EngineInterceptor.ExecuteResult executeResult2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objTransform = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objTransform);
            List<Transformation> transformations = ImageRequests_androidKt.getTransformations(imageRequest);
            if (!transformations.isEmpty()) {
                Drawable drawableAsDrawable = Image_androidKt.asDrawable(executeResult.getImage(), imageRequest.getContext().getResources());
                if ((drawableAsDrawable instanceof BitmapDrawable) || ImageRequests_androidKt.getAllowConversionToBitmap(imageRequest)) {
                    options2 = options;
                    Bitmap bitmapConvertDrawableToBitmap = convertDrawableToBitmap(drawableAsDrawable, options2, transformations, logger);
                    imageRequest2 = imageRequest;
                    eventListener2 = eventListener;
                    eventListener2.transformStart(imageRequest2, bitmapConvertDrawableToBitmap);
                    int size = transformations.size();
                    i = 0;
                    bitmap = bitmapConvertDrawableToBitmap;
                    i2 = size;
                    list = transformations;
                    executeResult2 = executeResult;
                    if (i < i2) {
                    }
                } else if (logger != null) {
                    Logger.Level level = Logger.Level.Info;
                    if (logger.getMinLevel().compareTo(level) <= 0) {
                        logger.log(EngineInterceptor.TAG, level, "allowConversionToBitmap=false, skipping transformations for type " + Reflection.getOrCreateKotlinClass(executeResult.getImage().getClass()).getQualifiedName() + FilenameUtils.EXTENSION_SEPARATOR, null);
                    }
                }
            }
            return executeResult;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = anonymousClass1.I$1;
        int i4 = anonymousClass1.I$0;
        List<Transformation> list2 = (List) anonymousClass1.L$4;
        eventListener2 = (EventListener) anonymousClass1.L$3;
        Options options3 = (Options) anonymousClass1.L$2;
        ImageRequest imageRequest3 = (ImageRequest) anonymousClass1.L$1;
        executeResult2 = (EngineInterceptor.ExecuteResult) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objTransform);
        list = list2;
        options2 = options3;
        bitmap = (Bitmap) objTransform;
        JobKt.ensureActive(anonymousClass1.get$context());
        ImageRequest imageRequest4 = imageRequest3;
        i = i4 + 1;
        imageRequest2 = imageRequest4;
        if (i < i2) {
            Transformation transformation = list.get(i);
            Size size2 = options2.getSize();
            anonymousClass1.L$0 = executeResult2;
            anonymousClass1.L$1 = imageRequest2;
            anonymousClass1.L$2 = options2;
            anonymousClass1.L$3 = eventListener2;
            anonymousClass1.L$4 = list;
            anonymousClass1.I$0 = i;
            anonymousClass1.I$1 = i2;
            anonymousClass1.label = 1;
            objTransform = transformation.transform(bitmap, size2, anonymousClass1);
            if (objTransform == coroutine_suspended) {
                return coroutine_suspended;
            }
            int i5 = i;
            imageRequest3 = imageRequest2;
            i4 = i5;
            bitmap = (Bitmap) objTransform;
            JobKt.ensureActive(anonymousClass1.get$context());
            ImageRequest imageRequest42 = imageRequest3;
            i = i4 + 1;
            imageRequest2 = imageRequest42;
            if (i < i2) {
                eventListener2.transformEnd(imageRequest2, bitmap);
                return EngineInterceptor.ExecuteResult.copy$default(executeResult2, Image_androidKt.asImage(new BitmapDrawable(imageRequest2.getContext().getResources(), bitmap)), false, null, null, 14, null);
            }
        }
    }

    private static final Bitmap convertDrawableToBitmap(Drawable drawable, Options options, List<? extends Transformation> list, Logger logger) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config safeConfig = BitmapsKt.getSafeConfig(bitmap);
            if (ArraysKt.contains(Utils_androidKt.getVALID_TRANSFORMATION_CONFIGS(), safeConfig)) {
                return bitmap;
            }
            if (logger != null) {
                Logger.Level level = Logger.Level.Info;
                if (logger.getMinLevel().compareTo(level) <= 0) {
                    logger.log(EngineInterceptor.TAG, level, "Converting bitmap with config " + safeConfig + " to apply transformations: " + list + FilenameUtils.EXTENSION_SEPARATOR, null);
                }
            }
        } else if (logger != null) {
            Logger.Level level2 = Logger.Level.Info;
            if (logger.getMinLevel().compareTo(level2) <= 0) {
                logger.log(EngineInterceptor.TAG, level2, "Converting drawable of type " + Reflection.getOrCreateKotlinClass(drawable.getClass()).getQualifiedName() + " to apply transformations: " + list + FilenameUtils.EXTENSION_SEPARATOR, null);
            }
        }
        return DrawableUtils.INSTANCE.convertToBitmap(drawable, ImageRequests_androidKt.getBitmapConfig(options), options.getSize(), options.getScale(), options.getPrecision() == Precision.INEXACT);
    }
}

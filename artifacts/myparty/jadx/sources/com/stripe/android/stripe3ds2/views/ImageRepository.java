package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.webkit.Profile;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.StripeHttpClient;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* compiled from: ImageRepository.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\fJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageSupplier", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;)V", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "getImage", "Landroid/graphics/Bitmap;", "imageUrl", "", "getImage$3ds2sdk_release", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalImage", "getRemoteImage", "cacheImage", "", "image", "ImageSupplier", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageRepository {
    private final ImageCache imageCache;
    private final ImageSupplier imageSupplier;
    private final CoroutineContext workContext;

    public ImageRepository(CoroutineContext workContext, ImageCache imageCache, ImageSupplier imageSupplier) {
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(imageSupplier, "imageSupplier");
        this.workContext = workContext;
        this.imageCache = imageCache;
        this.imageSupplier = imageSupplier;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageRepository(ErrorReporter errorReporter, CoroutineContext workContext) {
        this(workContext, ImageCache.Default.INSTANCE, new ImageSupplier.Default(errorReporter, workContext));
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    public final Object getImage$3ds2sdk_release(String str, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(this.workContext, new ImageRepository$getImage$2(str, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getLocalImage(String imageUrl) {
        return this.imageCache.get(imageUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemoteImage(String str, Continuation<? super Bitmap> continuation) {
        return this.imageSupplier.getBitmap(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheImage(String imageUrl, Bitmap image) {
        if (image != null) {
            this.imageCache.set(imageUrl, image);
        }
    }

    /* compiled from: ImageRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "", "getBitmap", "Landroid/graphics/Bitmap;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Profile.DEFAULT_PROFILE_NAME, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ImageSupplier {
        Object getBitmap(String str, Continuation<? super Bitmap> continuation);

        /* compiled from: ImageRepository.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier$Default;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "getBitmap", "Landroid/graphics/Bitmap;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Default implements ImageSupplier {
            private final ErrorReporter errorReporter;
            private final CoroutineContext workContext;

            public Default(ErrorReporter errorReporter, CoroutineContext workContext) {
                Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
                Intrinsics.checkNotNullParameter(workContext, "workContext");
                this.errorReporter = errorReporter;
                this.workContext = workContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object getBitmap(String str, Continuation<? super Bitmap> continuation) {
                ImageRepository$ImageSupplier$Default$getBitmap$1 imageRepository$ImageSupplier$Default$getBitmap$1;
                Throwable th;
                Default r1;
                Object objM9118constructorimpl;
                Throwable thM9121exceptionOrNullimpl;
                Bitmap bitmapDecodeStream;
                if (continuation instanceof ImageRepository$ImageSupplier$Default$getBitmap$1) {
                    imageRepository$ImageSupplier$Default$getBitmap$1 = (ImageRepository$ImageSupplier$Default$getBitmap$1) continuation;
                    if ((imageRepository$ImageSupplier$Default$getBitmap$1.label & Integer.MIN_VALUE) != 0) {
                        imageRepository$ImageSupplier$Default$getBitmap$1.label -= Integer.MIN_VALUE;
                    } else {
                        imageRepository$ImageSupplier$Default$getBitmap$1 = new ImageRepository$ImageSupplier$Default$getBitmap$1(this, continuation);
                    }
                }
                Object objDoGetRequest = imageRepository$ImageSupplier$Default$getBitmap$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = imageRepository$ImageSupplier$Default$getBitmap$1.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(objDoGetRequest);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Default r14 = this;
                        try {
                            StripeHttpClient stripeHttpClient = new StripeHttpClient(str, null, this.errorReporter, this.workContext, 2, null);
                            imageRepository$ImageSupplier$Default$getBitmap$1.L$0 = this;
                            imageRepository$ImageSupplier$Default$getBitmap$1.L$1 = str;
                            imageRepository$ImageSupplier$Default$getBitmap$1.label = 1;
                            objDoGetRequest = stripeHttpClient.doGetRequest(imageRepository$ImageSupplier$Default$getBitmap$1);
                            if (objDoGetRequest == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = this;
                            str = str;
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = this;
                            str = str;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl != null) {
                            }
                            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r1 = this;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) imageRepository$ImageSupplier$Default$getBitmap$1.L$1;
                    r1 = (Default) imageRepository$ImageSupplier$Default$getBitmap$1.L$0;
                    try {
                        ResultKt.throwOnFailure(objDoGetRequest);
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion22 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                        }
                    }
                }
                InputStream inputStream = (InputStream) objDoGetRequest;
                if (inputStream != null) {
                    InputStream inputStream2 = inputStream;
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream2);
                        CloseableKt.closeFinally(inputStream2, null);
                    } finally {
                    }
                } else {
                    bitmapDecodeStream = null;
                }
                objM9118constructorimpl = Result.m9118constructorimpl(bitmapDecodeStream);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    r1.errorReporter.reportError(new RuntimeException("Could not get bitmap from url: " + str + ".", thM9121exceptionOrNullimpl));
                }
                if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    return null;
                }
                return objM9118constructorimpl;
            }
        }
    }
}

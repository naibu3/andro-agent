package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: NetworkImageDecoder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u000fJ\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0007H\u0002J \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/uicore/image/NetworkImageDecoder;", "", "<init>", "()V", "decode", "Lcom/stripe/android/uicore/image/LoadedImage;", "url", "Ljava/net/URL;", "width", "", "height", "(Ljava/net/URL;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeStream", "Landroid/graphics/BitmapFactory$Options;", "(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "calculateInSampleSize", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "reqWidth", "reqHeight", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkImageDecoder {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int IMAGE_STREAM_TIMEOUT = 10000;

    /* compiled from: NetworkImageDecoder.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.NetworkImageDecoder", f = "NetworkImageDecoder.kt", i = {0, 0, 0, 0, 0}, l = {28, 33}, m = "decode", n = {"this", "url", "$this$decode_u24lambda_u240", "width", "height"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"})
    /* renamed from: com.stripe.android.uicore.image.NetworkImageDecoder$decode$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkImageDecoder.this.decode(null, 0, 0, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(URL url, int i, int i2, Continuation<? super LoadedImage> continuation) {
        AnonymousClass1 anonymousClass1;
        NetworkImageDecoder networkImageDecoder;
        URL url2;
        BitmapFactory.Options options;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objDecodeStream = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objDecodeStream);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = url;
            anonymousClass1.L$2 = options2;
            anonymousClass1.I$0 = i;
            anonymousClass1.I$1 = i2;
            anonymousClass1.label = 1;
            if (decodeStream(options2, url, anonymousClass1) != coroutine_suspended) {
                networkImageDecoder = this;
                url2 = url;
                options = options2;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDecodeStream);
            return (LoadedImage) objDecodeStream;
        }
        i2 = anonymousClass1.I$1;
        i = anonymousClass1.I$0;
        options = (BitmapFactory.Options) anonymousClass1.L$2;
        url2 = (URL) anonymousClass1.L$1;
        networkImageDecoder = (NetworkImageDecoder) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objDecodeStream);
        options.inSampleSize = networkImageDecoder.calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        objDecodeStream = networkImageDecoder.decodeStream(options, url2, anonymousClass1);
    }

    public final Object decode(URL url, Continuation<? super LoadedImage> continuation) {
        Object objDecodeStream = decodeStream(new BitmapFactory.Options(), url, continuation);
        return objDecodeStream == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDecodeStream : (LoadedImage) objDecodeStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream stream(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Intrinsics.checkNotNullExpressionValue(uRLConnectionOpenConnection, "openConnection(...)");
        uRLConnectionOpenConnection.setConnectTimeout(10000);
        uRLConnectionOpenConnection.setReadTimeout(10000);
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return inputStream;
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int i = 1;
        if (iIntValue <= reqHeight && iIntValue2 <= reqWidth) {
            return 1;
        }
        int i2 = iIntValue / 2;
        int i3 = iIntValue2 / 2;
        while (i2 / i >= reqHeight && i3 / i >= reqWidth) {
            i *= 2;
        }
        return i;
    }

    /* compiled from: NetworkImageDecoder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/image/NetworkImageDecoder$Companion;", "", "<init>", "()V", "IMAGE_STREAM_TIMEOUT", "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object decodeStream(final BitmapFactory.Options options, URL url, Continuation<? super LoadedImage> continuation) {
        Object objM9118constructorimpl;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            final InputStream inputStreamStream = stream(url);
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.stripe.android.uicore.image.NetworkImageDecoder$decodeStream$2$1$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    InputStream inputStream = inputStreamStream;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        inputStream.close();
                        Result.m9118constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.INSTANCE;
                        Result.m9118constructorimpl(ResultKt.createFailure(th2));
                    }
                }
            });
            InputStream inputStream = inputStreamStream;
            try {
                LoadedImage loadedImage = null;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                CloseableKt.closeFinally(inputStream, null);
                if (bitmapDecodeStream != null) {
                    String outMimeType = options.outMimeType;
                    Intrinsics.checkNotNullExpressionValue(outMimeType, "outMimeType");
                    loadedImage = new LoadedImage(outMimeType, bitmapDecodeStream);
                }
                objM9118constructorimpl = Result.m9118constructorimpl(loadedImage);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            Result.Companion companion3 = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m9118constructorimpl((LoadedImage) objM9118constructorimpl));
        } else {
            Result.Companion companion4 = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}

package expo.modules.notifications.notifications.presentation.builders;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: DownloadImage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"downloadImage", "Landroid/graphics/Bitmap;", "imageUrl", "Landroid/net/Uri;", "connectTimeout", "", "readTimeout", "(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-notifications_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DownloadImageKt {

    /* compiled from: DownloadImage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.notifications.notifications.presentation.builders.DownloadImageKt", f = "DownloadImage.kt", i = {}, l = {13}, m = "downloadImage", n = {}, s = {})
    /* renamed from: expo.modules.notifications.notifications.presentation.builders.DownloadImageKt$downloadImage$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadImageKt.downloadImage(null, 0L, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object downloadImage(Uri uri, long j, long j2, Continuation<? super Bitmap> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM9118constructorimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objWithTimeout = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objWithTimeout);
                Result.Companion companion = Result.INSTANCE;
                DownloadImageKt$downloadImage$2$1 downloadImageKt$downloadImage$2$1 = new DownloadImageKt$downloadImage$2$1(uri, j, j2, null);
                anonymousClass1.label = 1;
                objWithTimeout = TimeoutKt.withTimeout(j + j2, downloadImageKt$downloadImage$2$1, anonymousClass1);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeout);
            }
            objM9118constructorimpl = Result.m9118constructorimpl((Bitmap) objWithTimeout);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            return null;
        }
        return objM9118constructorimpl;
    }

    public static /* synthetic */ Object downloadImage$default(Uri uri, long j, long j2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 8000;
        }
        if ((i & 4) != 0) {
            j2 = 8000;
        }
        return downloadImage(uri, j, j2, continuation);
    }
}

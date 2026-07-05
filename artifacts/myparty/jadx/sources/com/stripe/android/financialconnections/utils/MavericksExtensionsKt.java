package com.stripe.android.financialconnections.utils;

import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.presentation.Async;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MavericksExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000\"&\u0010\u0003\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"isCancellationError", "", "Lcom/stripe/android/financialconnections/presentation/Async;", "error", "", ExifInterface.GPS_DIRECTION_TRUE, "getError", "(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MavericksExtensionsKt {
    public static final boolean isCancellationError(Async<?> async) {
        Intrinsics.checkNotNullParameter(async, "<this>");
        if (!(async instanceof Async.Fail)) {
            return false;
        }
        Async.Fail fail = (Async.Fail) async;
        if (fail.getError() instanceof CancellationException) {
            return true;
        }
        return (fail.getError() instanceof StripeException) && (fail.getError().getCause() instanceof CancellationException);
    }

    public static final <T> Throwable getError(Async<? extends T> async) {
        Intrinsics.checkNotNullParameter(async, "<this>");
        Async.Fail fail = async instanceof Async.Fail ? (Async.Fail) async : null;
        if (fail != null) {
            return fail.getError();
        }
        return null;
    }
}

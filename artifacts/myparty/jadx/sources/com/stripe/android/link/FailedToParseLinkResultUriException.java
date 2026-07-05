package com.stripe.android.link;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebLinkActivityContract.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/FailedToParseLinkResultUriException;", "Lcom/stripe/android/core/exception/StripeException;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FailedToParseLinkResultUriException extends StripeException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedToParseLinkResultUriException(Throwable error) {
        super(null, null, 0, error, null, 23, null);
        Intrinsics.checkNotNullParameter(error, "error");
    }
}

package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.networking.NetworkConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RateLimitException.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0017¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/exception/RateLimitException;", "Lcom/stripe/android/core/exception/StripeException;", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "", "message", "cause", "", "<init>", "(Lcom/stripe/android/core/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "analyticsValue", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RateLimitException extends StripeException {
    public RateLimitException() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RateLimitException(StripeError stripeError, String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i & 1) != 0 ? null : stripeError;
        this(stripeError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? stripeError != null ? stripeError.getMessage() : null : str2, (i & 8) != 0 ? null : th);
    }

    public RateLimitException(StripeError stripeError, String str, String str2, Throwable th) {
        super(stripeError, str, NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS, th, str2);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "rateLimitError";
    }
}

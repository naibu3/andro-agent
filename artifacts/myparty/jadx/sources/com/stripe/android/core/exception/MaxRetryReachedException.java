package com.stripe.android.core.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MaxRetryReachedException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0017¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/core/exception/MaxRetryReachedException;", "Lcom/stripe/android/core/exception/StripeException;", "message", "", "<init>", "(Ljava/lang/String;)V", "analyticsValue", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaxRetryReachedException extends StripeException {
    /* JADX WARN: Multi-variable type inference failed */
    public MaxRetryReachedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MaxRetryReachedException(String str) {
        super(null, null, 0, null, str, 15, null);
    }

    public /* synthetic */ MaxRetryReachedException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "maxRetryReachedError";
    }
}

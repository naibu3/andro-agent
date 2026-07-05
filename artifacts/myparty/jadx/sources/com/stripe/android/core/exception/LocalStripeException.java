package com.stripe.android.core.exception;

import kotlin.Metadata;

/* compiled from: LocalStripeException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/core/exception/LocalStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "displayMessage", "", "analyticsValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayMessage", "()Ljava/lang/String;", "getAnalyticsValue", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalStripeException extends StripeException {
    private final String analyticsValue;
    private final String displayMessage;

    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public LocalStripeException(String str, String str2) {
        super(null, null, 0, null, str, 15, null);
        this.displayMessage = str;
        this.analyticsValue = str2;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        String str = this.analyticsValue;
        return str == null ? "unknown" : str;
    }
}

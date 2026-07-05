package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "()V", "analyticsValue", "", "message", "getMessage", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InvalidDeferredIntentUsageException extends StripeException {
    public static final int $stable = 0;
    private final String message;

    public InvalidDeferredIntentUsageException() {
        super(null, null, 0, null, null, 31, null);
        this.message = "The payment method on the intent doesn't match the one provided in the createIntentCallback. When using deferred\nintent creation, ensure you're either creating a new intent with the correct payment method or updating an\nexisting intent with the new payment method ID.";
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "invalidDeferredIntentUsage";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}

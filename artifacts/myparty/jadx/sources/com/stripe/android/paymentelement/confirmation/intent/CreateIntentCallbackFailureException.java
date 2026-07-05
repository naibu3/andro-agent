package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentCallbackFailureException;", "Lcom/stripe/android/core/exception/StripeException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "analyticsValue", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateIntentCallbackFailureException extends StripeException {
    public static final int $stable = 8;
    private final Throwable cause;

    public CreateIntentCallbackFailureException(Throwable th) {
        super(null, null, 0, null, null, 31, null);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "merchantReturnedCreateIntentCallbackFailure";
    }
}

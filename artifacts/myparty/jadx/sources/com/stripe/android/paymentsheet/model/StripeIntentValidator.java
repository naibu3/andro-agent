package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.state.PaymentSheetLoadingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeIntentValidator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "", "<init>", "()V", "requireValid", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeIntentValidator {
    public static final int $stable = 0;
    public static final StripeIntentValidator INSTANCE = new StripeIntentValidator();

    private StripeIntentValidator() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StripeIntent requireValid(StripeIntent stripeIntent) throws PaymentSheetLoadingException {
        PaymentSheetLoadingException.SetupIntentInTerminalState setupIntentInTerminalState;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        boolean z = stripeIntent instanceof PaymentIntent;
        if (z) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            if (paymentIntent.getConfirmationMethod() != PaymentIntent.ConfirmationMethod.Automatic) {
                setupIntentInTerminalState = new PaymentSheetLoadingException.InvalidConfirmationMethod(paymentIntent.getConfirmationMethod());
            } else if (z) {
                PaymentIntent paymentIntent2 = (PaymentIntent) stripeIntent;
                if (StripeIntentValidatorKt.isInTerminalState(paymentIntent2)) {
                    setupIntentInTerminalState = new PaymentSheetLoadingException.PaymentIntentInTerminalState(paymentIntent2.getStatus());
                } else if (z) {
                    PaymentIntent paymentIntent3 = (PaymentIntent) stripeIntent;
                    if (paymentIntent3.getAmount() == null || paymentIntent3.getCurrency() == null) {
                        setupIntentInTerminalState = PaymentSheetLoadingException.MissingAmountOrCurrency.INSTANCE;
                    } else if (stripeIntent instanceof SetupIntent) {
                        SetupIntent setupIntent = (SetupIntent) stripeIntent;
                        setupIntentInTerminalState = StripeIntentValidatorKt.isInTerminalState(setupIntent) ? new PaymentSheetLoadingException.SetupIntentInTerminalState(setupIntent.getStatus()) : null;
                    }
                }
            }
        }
        if (setupIntentInTerminalState == null) {
            return stripeIntent;
        }
        throw setupIntentInTerminalState;
    }
}

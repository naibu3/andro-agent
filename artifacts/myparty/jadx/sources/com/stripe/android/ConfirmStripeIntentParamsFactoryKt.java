package com.stripe.android;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConfirmStripeIntentParamsFactory.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\rH\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"mandateData", "Lcom/stripe/android/model/MandateDataParams;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "canSetupFutureUsage", "", "Lcom/stripe/android/model/PaymentIntent;", "paymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "extractSetAsDefaultPaymentMethodFromExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "(Lcom/stripe/android/model/PaymentMethodExtraParams;)Ljava/lang/Boolean;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmStripeIntentParamsFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MandateDataParams mandateData(StripeIntent stripeIntent, PaymentMethod.Type type) {
        if (type == null) {
            return null;
        }
        boolean z = true;
        if (stripeIntent instanceof PaymentIntent) {
            if (!canSetupFutureUsage((PaymentIntent) stripeIntent, type.code) && !type.getRequiresMandateForPaymentIntent()) {
                z = false;
            }
        } else if (!(stripeIntent instanceof SetupIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        MandateDataParams mandateDataParams = new MandateDataParams(MandateDataParams.Type.Online.INSTANCE.getDEFAULT());
        if (z && type.requiresMandate) {
            return mandateDataParams;
        }
        return null;
    }

    private static final boolean canSetupFutureUsage(PaymentIntent paymentIntent, String str) {
        return paymentIntent.isSetupFutureUsageSet(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean extractSetAsDefaultPaymentMethodFromExtraParams(PaymentMethodExtraParams paymentMethodExtraParams) {
        if (paymentMethodExtraParams instanceof PaymentMethodExtraParams.Card) {
            return ((PaymentMethodExtraParams.Card) paymentMethodExtraParams).getSetAsDefault();
        }
        if (paymentMethodExtraParams instanceof PaymentMethodExtraParams.USBankAccount) {
            return ((PaymentMethodExtraParams.USBankAccount) paymentMethodExtraParams).getSetAsDefault();
        }
        if (paymentMethodExtraParams instanceof PaymentMethodExtraParams.SepaDebit) {
            return ((PaymentMethodExtraParams.SepaDebit) paymentMethodExtraParams).getSetAsDefault();
        }
        return null;
    }
}

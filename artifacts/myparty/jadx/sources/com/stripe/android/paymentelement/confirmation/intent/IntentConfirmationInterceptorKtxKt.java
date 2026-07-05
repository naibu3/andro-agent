package com.stripe.android.paymentelement.confirmation.intent;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressDetailsKt;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: IntentConfirmationInterceptorKtx.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0080@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"intercept", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntentConfirmationInterceptorKtxKt {
    public static final Object intercept(IntentConfirmationInterceptor intentConfirmationInterceptor, PaymentMethodConfirmationOption paymentMethodConfirmationOption, StripeIntent stripeIntent, PaymentElementLoader.InitializationMode initializationMode, AddressDetails addressDetails, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        if (paymentMethodConfirmationOption instanceof PaymentMethodConfirmationOption.New) {
            PaymentMethodConfirmationOption.New r12 = (PaymentMethodConfirmationOption.New) paymentMethodConfirmationOption;
            return intentConfirmationInterceptor.intercept(initializationMode, stripeIntent, r12.getCreateParams(), r12.getOptionsParams(), r12.getExtraParams(), addressDetails != null ? AddressDetailsKt.toConfirmPaymentIntentShipping(addressDetails) : null, r12.getShouldSave(), continuation);
        }
        if (!(paymentMethodConfirmationOption instanceof PaymentMethodConfirmationOption.Saved)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentMethodConfirmationOption.Saved saved = (PaymentMethodConfirmationOption.Saved) paymentMethodConfirmationOption;
        return intentConfirmationInterceptor.intercept(initializationMode, stripeIntent, saved.getPaymentMethod(), saved.getOptionsParams(), null, addressDetails != null ? AddressDetailsKt.toConfirmPaymentIntentShipping(addressDetails) : null, continuation);
    }
}

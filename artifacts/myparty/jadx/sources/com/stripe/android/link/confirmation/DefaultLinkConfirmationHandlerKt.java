package com.stripe.android.link.confirmation;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultLinkConfirmationHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\r"}, d2 = {"createPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "selectedPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "consumerSessionClientSecret", "", "cvc", "billingPhone", "computeExpectedPaymentMethodType", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "paymentDetails", "computeBankAccountExpectedPaymentMethodType", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkConfirmationHandlerKt {
    public static final PaymentMethodCreateParams createPaymentMethodCreateParams(ConsumerPaymentDetails.PaymentDetails selectedPaymentDetails, String consumerSessionClientSecret, String str, String str2) {
        Address address;
        Intrinsics.checkNotNullParameter(selectedPaymentDetails, "selectedPaymentDetails");
        Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
        ConsumerPaymentDetails.BillingAddress billingAddress = selectedPaymentDetails.getBillingAddress();
        if (billingAddress != null) {
            String line1 = billingAddress.getLine1();
            String line2 = billingAddress.getLine2();
            String postalCode = billingAddress.getPostalCode();
            String locality = billingAddress.getLocality();
            String administrativeArea = billingAddress.getAdministrativeArea();
            CountryCode countryCode = billingAddress.getCountryCode();
            address = new Address(locality, countryCode != null ? countryCode.getValue() : null, line1, line2, postalCode, administrativeArea);
        } else {
            address = null;
        }
        String billingEmailAddress = selectedPaymentDetails.getBillingEmailAddress();
        ConsumerPaymentDetails.BillingAddress billingAddress2 = selectedPaymentDetails.getBillingAddress();
        PaymentMethod.BillingDetails billingDetails = new PaymentMethod.BillingDetails(address, billingEmailAddress, billingAddress2 != null ? billingAddress2.getName() : null, str2);
        return PaymentMethodCreateParams.Companion.createLink$default(PaymentMethodCreateParams.INSTANCE, selectedPaymentDetails.getId(), consumerSessionClientSecret, !Intrinsics.areEqual(billingDetails, new PaymentMethod.BillingDetails(null, null, null, null, 15, null)) ? billingDetails : null, str != null ? MapsKt.mapOf(TuplesKt.to("card", MapsKt.mapOf(TuplesKt.to("cvc", str)))) : null, null, 16, null);
    }

    public static final String computeExpectedPaymentMethodType(LinkConfiguration configuration, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            return computeBankAccountExpectedPaymentMethodType(configuration);
        }
        if ((paymentDetails instanceof ConsumerPaymentDetails.Card) || (paymentDetails instanceof ConsumerPaymentDetails.Passthrough)) {
            return "card";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String computeBankAccountExpectedPaymentMethodType(LinkConfiguration linkConfiguration) {
        boolean zContains = linkConfiguration.getStripeIntent().getPaymentMethodTypes().contains(PaymentMethod.Type.USBankAccount.code);
        if (linkConfiguration.getLinkMode() == LinkMode.LinkCardBrand && !zContains) {
            return "card";
        }
        return "bank_account";
    }
}

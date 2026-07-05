package com.stripe.android.paymentsheet.model;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.model.ConsumerShippingAddress;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getShippingDetails", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "makeAddressDetails", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionFactoryKt {
    public static final AddressDetails getShippingDetails(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if ((paymentSelection instanceof PaymentSelection.CustomPaymentMethod) || (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) || (paymentSelection instanceof PaymentSelection.GooglePay) || (paymentSelection instanceof PaymentSelection.New.Card) || (paymentSelection instanceof PaymentSelection.New.GenericPaymentMethod) || (paymentSelection instanceof PaymentSelection.New.LinkInline) || (paymentSelection instanceof PaymentSelection.New.USBankAccount) || (paymentSelection instanceof PaymentSelection.ShopPay) || (paymentSelection instanceof PaymentSelection.Saved)) {
            return null;
        }
        if (!(paymentSelection instanceof PaymentSelection.Link)) {
            throw new NoWhenBranchMatchedException();
        }
        return makeAddressDetails((PaymentSelection.Link) paymentSelection);
    }

    private static final AddressDetails makeAddressDetails(PaymentSelection.Link link) {
        ConsumerShippingAddress shippingAddress = link.getShippingAddress();
        if (shippingAddress == null) {
            return null;
        }
        String name = shippingAddress.getAddress().getName();
        String unredactedPhoneNumber = shippingAddress.getUnredactedPhoneNumber();
        String line1 = shippingAddress.getAddress().getLine1();
        String line2 = shippingAddress.getAddress().getLine2();
        String locality = shippingAddress.getAddress().getLocality();
        String administrativeArea = shippingAddress.getAddress().getAdministrativeArea();
        String postalCode = shippingAddress.getAddress().getPostalCode();
        CountryCode countryCode = shippingAddress.getAddress().getCountryCode();
        return new AddressDetails(name, new PaymentSheet.Address(locality, countryCode != null ? countryCode.getValue() : null, line1, line2, postalCode, administrativeArea), unredactedPhoneNumber, null);
    }
}

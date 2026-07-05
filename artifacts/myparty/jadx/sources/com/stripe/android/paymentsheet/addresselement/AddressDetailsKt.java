package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressDetails.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0004H\u0000¨\u0006\t"}, d2 = {"toIdentifierMap", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "billingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "toConfirmPaymentIntentShipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressDetailsKt {
    public static /* synthetic */ Map toIdentifierMap$default(AddressDetails addressDetails, PaymentSheet.BillingDetails billingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            billingDetails = null;
        }
        return toIdentifierMap(addressDetails, billingDetails);
    }

    public static final Map<IdentifierSpec, String> toIdentifierMap(AddressDetails addressDetails, PaymentSheet.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(addressDetails, "<this>");
        if (billingDetails == null || !billingDetails.isFilledOut$paymentsheet_release()) {
            Pair[] pairArr = new Pair[8];
            pairArr[0] = TuplesKt.to(IdentifierSpec.INSTANCE.getName(), addressDetails.getName());
            IdentifierSpec line1 = IdentifierSpec.INSTANCE.getLine1();
            PaymentSheet.Address address = addressDetails.getAddress();
            pairArr[1] = TuplesKt.to(line1, address != null ? address.getLine1() : null);
            IdentifierSpec line2 = IdentifierSpec.INSTANCE.getLine2();
            PaymentSheet.Address address2 = addressDetails.getAddress();
            pairArr[2] = TuplesKt.to(line2, address2 != null ? address2.getLine2() : null);
            IdentifierSpec city = IdentifierSpec.INSTANCE.getCity();
            PaymentSheet.Address address3 = addressDetails.getAddress();
            pairArr[3] = TuplesKt.to(city, address3 != null ? address3.getCity() : null);
            IdentifierSpec state = IdentifierSpec.INSTANCE.getState();
            PaymentSheet.Address address4 = addressDetails.getAddress();
            pairArr[4] = TuplesKt.to(state, address4 != null ? address4.getState() : null);
            IdentifierSpec postalCode = IdentifierSpec.INSTANCE.getPostalCode();
            PaymentSheet.Address address5 = addressDetails.getAddress();
            pairArr[5] = TuplesKt.to(postalCode, address5 != null ? address5.getPostalCode() : null);
            IdentifierSpec country = IdentifierSpec.INSTANCE.getCountry();
            PaymentSheet.Address address6 = addressDetails.getAddress();
            pairArr[6] = TuplesKt.to(country, address6 != null ? address6.getCountry() : null);
            pairArr[7] = TuplesKt.to(IdentifierSpec.INSTANCE.getPhone(), addressDetails.getPhoneNumber());
            Map mapMapOf = MapsKt.mapOf(pairArr);
            IdentifierSpec sameAsShipping = IdentifierSpec.INSTANCE.getSameAsShipping();
            Boolean boolIsCheckboxSelected = addressDetails.isCheckboxSelected();
            Map mapMapOf2 = addressDetails.isCheckboxSelected() != null ? MapsKt.mapOf(TuplesKt.to(sameAsShipping, boolIsCheckboxSelected != null ? boolIsCheckboxSelected.toString() : null)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapMapOf, mapMapOf2);
        }
        return MapsKt.emptyMap();
    }

    public static final ConfirmPaymentIntentParams.Shipping toConfirmPaymentIntentShipping(AddressDetails addressDetails) {
        Intrinsics.checkNotNullParameter(addressDetails, "<this>");
        String name = addressDetails.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        Address.Builder builder = new Address.Builder();
        PaymentSheet.Address address = addressDetails.getAddress();
        Address.Builder line1 = builder.setLine1(address != null ? address.getLine1() : null);
        PaymentSheet.Address address2 = addressDetails.getAddress();
        Address.Builder line2 = line1.setLine2(address2 != null ? address2.getLine2() : null);
        PaymentSheet.Address address3 = addressDetails.getAddress();
        Address.Builder city = line2.setCity(address3 != null ? address3.getCity() : null);
        PaymentSheet.Address address4 = addressDetails.getAddress();
        Address.Builder state = city.setState(address4 != null ? address4.getState() : null);
        PaymentSheet.Address address5 = addressDetails.getAddress();
        Address.Builder country = state.setCountry(address5 != null ? address5.getCountry() : null);
        PaymentSheet.Address address6 = addressDetails.getAddress();
        return new ConfirmPaymentIntentParams.Shipping(country.setPostalCode(address6 != null ? address6.getPostalCode() : null).build(), str, null, addressDetails.getPhoneNumber(), null, 20, null);
    }
}

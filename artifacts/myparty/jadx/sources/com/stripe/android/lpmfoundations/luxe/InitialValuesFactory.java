package com.stripe.android.lpmfoundations.luxe;

import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.forms.ConvertToFormValuesMapKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.ParameterDestination;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* compiled from: InitialValuesFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/lpmfoundations/luxe/InitialValuesFactory;", "", "<init>", "()V", "create", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InitialValuesFactory {
    public static final int $stable = 0;
    public static final InitialValuesFactory INSTANCE = new InitialValuesFactory();

    private InitialValuesFactory() {
    }

    public final Map<IdentifierSpec, String> create(PaymentSheet.BillingDetails defaultBillingDetails, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodExtraParams paymentMethodExtraParams) {
        Map<IdentifierSpec, String> mapEmptyMap;
        LinkedHashMap linkedHashMapEmptyMap;
        PaymentSheet.Address address;
        PaymentSheet.Address address2;
        PaymentSheet.Address address3;
        PaymentSheet.Address address4;
        PaymentSheet.Address address5;
        PaymentSheet.Address address6;
        if (paymentMethodCreateParams == null || (mapEmptyMap = ConvertToFormValuesMapKt.convertToFormValuesMap(paymentMethodCreateParams.toParamMap())) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        if (paymentMethodExtraParams != null) {
            Map<IdentifierSpec, String> mapConvertToFormValuesMap = ConvertToFormValuesMapKt.convertToFormValuesMap(paymentMethodExtraParams.toParamMap());
            linkedHashMapEmptyMap = new LinkedHashMap(MapsKt.mapCapacity(mapConvertToFormValuesMap.size()));
            Iterator<T> it = mapConvertToFormValuesMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMapEmptyMap.put(IdentifierSpec.copy$default((IdentifierSpec) entry.getKey(), null, false, ParameterDestination.Local.Extras, 3, null), entry.getValue());
            }
        } else {
            linkedHashMapEmptyMap = MapsKt.emptyMap();
        }
        Pair[] pairArr = new Pair[9];
        String postalCode = null;
        pairArr[0] = TuplesKt.to(IdentifierSpec.INSTANCE.getName(), defaultBillingDetails != null ? defaultBillingDetails.getName() : null);
        pairArr[1] = TuplesKt.to(IdentifierSpec.INSTANCE.getEmail(), defaultBillingDetails != null ? defaultBillingDetails.getEmail() : null);
        pairArr[2] = TuplesKt.to(IdentifierSpec.INSTANCE.getPhone(), defaultBillingDetails != null ? defaultBillingDetails.getPhone() : null);
        pairArr[3] = TuplesKt.to(IdentifierSpec.INSTANCE.getLine1(), (defaultBillingDetails == null || (address6 = defaultBillingDetails.getAddress()) == null) ? null : address6.getLine1());
        pairArr[4] = TuplesKt.to(IdentifierSpec.INSTANCE.getLine2(), (defaultBillingDetails == null || (address5 = defaultBillingDetails.getAddress()) == null) ? null : address5.getLine2());
        pairArr[5] = TuplesKt.to(IdentifierSpec.INSTANCE.getCity(), (defaultBillingDetails == null || (address4 = defaultBillingDetails.getAddress()) == null) ? null : address4.getCity());
        pairArr[6] = TuplesKt.to(IdentifierSpec.INSTANCE.getState(), (defaultBillingDetails == null || (address3 = defaultBillingDetails.getAddress()) == null) ? null : address3.getState());
        pairArr[7] = TuplesKt.to(IdentifierSpec.INSTANCE.getCountry(), (defaultBillingDetails == null || (address2 = defaultBillingDetails.getAddress()) == null) ? null : address2.getCountry());
        IdentifierSpec postalCode2 = IdentifierSpec.INSTANCE.getPostalCode();
        if (defaultBillingDetails != null && (address = defaultBillingDetails.getAddress()) != null) {
            postalCode = address.getPostalCode();
        }
        pairArr[8] = TuplesKt.to(postalCode2, postalCode);
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pairArr), mapEmptyMap), linkedHashMapEmptyMap);
    }
}

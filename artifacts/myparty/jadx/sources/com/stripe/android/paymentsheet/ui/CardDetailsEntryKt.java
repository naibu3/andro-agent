package com.stripe.android.paymentsheet.ui;

import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: CardDetailsEntry.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\b"}, d2 = {"toUpdateParams", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "cardDetailsEntry", "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;", "billingDetailsEntry", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;", "createBillingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDetailsEntryKt {
    public static final CardUpdateParams toUpdateParams(CardDetailsEntry cardDetailsEntry, BillingDetailsEntry billingDetailsEntry) {
        ExpiryDateState expiryDateState;
        ExpiryDateState expiryDateState2;
        CardBrandChoice cardBrandChoice;
        Integer expiryYear = null;
        CardBrand brand = (cardDetailsEntry == null || (cardBrandChoice = cardDetailsEntry.getCardBrandChoice()) == null) ? null : cardBrandChoice.getBrand();
        Integer expiryMonth = (cardDetailsEntry == null || (expiryDateState2 = cardDetailsEntry.getExpiryDateState()) == null) ? null : expiryDateState2.getExpiryMonth();
        if (cardDetailsEntry != null && (expiryDateState = cardDetailsEntry.getExpiryDateState()) != null) {
            expiryYear = expiryDateState.getExpiryYear();
        }
        return new CardUpdateParams(expiryMonth, expiryYear, brand, createBillingDetails(billingDetailsEntry));
    }

    private static final PaymentMethod.BillingDetails createBillingDetails(BillingDetailsEntry billingDetailsEntry) {
        Address address;
        BillingDetailsFormState billingDetailsFormState;
        FormFieldEntry name;
        BillingDetailsFormState billingDetailsFormState2;
        FormFieldEntry phone;
        BillingDetailsFormState billingDetailsFormState3;
        FormFieldEntry email;
        BillingDetailsFormState billingDetailsFormState4;
        if (billingDetailsEntry == null || (billingDetailsFormState4 = billingDetailsEntry.getBillingDetailsFormState()) == null) {
            address = null;
        } else {
            FormFieldEntry city = billingDetailsFormState4.getCity();
            String value = city != null ? city.getValue() : null;
            FormFieldEntry country = billingDetailsFormState4.getCountry();
            String value2 = country != null ? country.getValue() : null;
            FormFieldEntry line1 = billingDetailsFormState4.getLine1();
            String value3 = line1 != null ? line1.getValue() : null;
            FormFieldEntry line2 = billingDetailsFormState4.getLine2();
            String value4 = line2 != null ? line2.getValue() : null;
            FormFieldEntry postalCode = billingDetailsFormState4.getPostalCode();
            String value5 = postalCode != null ? postalCode.getValue() : null;
            FormFieldEntry state = billingDetailsFormState4.getState();
            address = new Address(value, value2, value3, value4, value5, state != null ? state.getValue() : null);
        }
        String value6 = (billingDetailsEntry == null || (billingDetailsFormState3 = billingDetailsEntry.getBillingDetailsFormState()) == null || (email = billingDetailsFormState3.getEmail()) == null) ? null : email.getValue();
        String value7 = (billingDetailsEntry == null || (billingDetailsFormState2 = billingDetailsEntry.getBillingDetailsFormState()) == null || (phone = billingDetailsFormState2.getPhone()) == null) ? null : phone.getValue();
        String value8 = (billingDetailsEntry == null || (billingDetailsFormState = billingDetailsEntry.getBillingDetailsFormState()) == null || (name = billingDetailsFormState.getName()) == null) ? null : name.getValue();
        boolean z = false;
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{value6, value7, value8});
        if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
            z = true;
        } else {
            for (String str : listListOf) {
                if (str != null && !StringsKt.isBlank(str)) {
                    break;
                }
            }
            z = true;
        }
        if (address == null && z) {
            return null;
        }
        return new PaymentMethod.BillingDetails(address, value6, value8, value7);
    }
}

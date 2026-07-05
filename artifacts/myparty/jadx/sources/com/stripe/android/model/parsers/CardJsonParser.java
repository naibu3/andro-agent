package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.TokenizationMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CardJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Card;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardJsonParser implements ModelJsonParser<Card> {
    private static final String FIELD_ADDRESS_CITY = "address_city";
    private static final String FIELD_ADDRESS_COUNTRY = "address_country";
    private static final String FIELD_ADDRESS_LINE1 = "address_line1";
    private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final String FIELD_ADDRESS_LINE2 = "address_line2";
    private static final String FIELD_ADDRESS_STATE = "address_state";
    private static final String FIELD_ADDRESS_ZIP = "address_zip";
    private static final String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final String FIELD_BRAND = "brand";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_CURRENCY = "currency";
    private static final String FIELD_CUSTOMER = "customer";
    private static final String FIELD_CVC_CHECK = "cvc_check";
    private static final String FIELD_EXP_MONTH = "exp_month";
    private static final String FIELD_EXP_YEAR = "exp_year";
    private static final String FIELD_FINGERPRINT = "fingerprint";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LAST4 = "last4";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_TOKENIZATION_METHOD = "tokenization_method";
    public static final String VALUE_CARD = "card";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Card parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (!Intrinsics.areEqual("card", json.optString("object"))) {
            return null;
        }
        Integer numOptInteger = StripeJsonUtils.INSTANCE.optInteger(json, FIELD_EXP_MONTH);
        Integer numValueOf = Integer.valueOf(numOptInteger != null ? numOptInteger.intValue() : -1);
        int iIntValue = numValueOf.intValue();
        Integer num = (iIntValue < 1 || iIntValue > 12) ? null : numValueOf;
        Integer numOptInteger2 = StripeJsonUtils.INSTANCE.optInteger(json, FIELD_EXP_YEAR);
        Integer numValueOf2 = Integer.valueOf(numOptInteger2 != null ? numOptInteger2.intValue() : -1);
        Integer num2 = numValueOf2.intValue() < 0 ? null : numValueOf2;
        String strOptString = StripeJsonUtils.optString(json, FIELD_ADDRESS_CITY);
        String strOptString2 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1);
        String strOptString3 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK);
        String strOptString4 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE2);
        String strOptString5 = StripeJsonUtils.optString(json, FIELD_ADDRESS_COUNTRY);
        String strOptString6 = StripeJsonUtils.optString(json, FIELD_ADDRESS_STATE);
        String strOptString7 = StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP);
        String strOptString8 = StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP_CHECK);
        CardBrand cardBrand = Card.INSTANCE.getCardBrand(StripeJsonUtils.optString(json, "brand"));
        String strOptCountryCode = StripeJsonUtils.INSTANCE.optCountryCode(json, "country");
        String strOptString9 = StripeJsonUtils.optString(json, "customer");
        return new Card(num, num2, StripeJsonUtils.optString(json, "name"), strOptString2, strOptString3, strOptString4, strOptString, strOptString6, strOptString7, strOptString8, strOptString5, StripeJsonUtils.optString(json, "last4"), cardBrand, CardFunding.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_FUNDING)), StripeJsonUtils.optString(json, "fingerprint"), strOptCountryCode, StripeJsonUtils.optCurrency(json, "currency"), strOptString9, StripeJsonUtils.optString(json, FIELD_CVC_CHECK), StripeJsonUtils.optString(json, "id"), TokenizationMethod.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_TOKENIZATION_METHOD)));
    }
}

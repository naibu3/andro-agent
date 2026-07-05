package com.stripe.android.model.parsers;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.CvcCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConsumerPaymentDetailsJsonParser.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parsePaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "parseBillingAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "cardBrandFix", "", "original", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsumerPaymentDetailsJsonParser implements ModelJsonParser<ConsumerPaymentDetails> {
    public static final ConsumerPaymentDetailsJsonParser INSTANCE = new ConsumerPaymentDetailsJsonParser();

    private ConsumerPaymentDetailsJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerPaymentDetails parse(JSONObject json) throws JSONException {
        ArrayList arrayListEmptyList;
        ConsumerPaymentDetails.PaymentDetails paymentDetails;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("redacted_payment_details");
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((IntIterator) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                ConsumerPaymentDetailsJsonParser consumerPaymentDetailsJsonParser = INSTANCE;
                Intrinsics.checkNotNull(jSONObject);
                ConsumerPaymentDetails.PaymentDetails paymentDetails2 = consumerPaymentDetailsJsonParser.parsePaymentDetails(jSONObject);
                if (paymentDetails2 != null) {
                    arrayList2.add(paymentDetails2);
                }
            }
            arrayListEmptyList = arrayList2;
        } else {
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("redacted_payment_details");
            arrayListEmptyList = (jSONObjectOptJSONObject == null || (paymentDetails = INSTANCE.parsePaymentDetails(jSONObjectOptJSONObject)) == null) ? CollectionsKt.emptyList() : CollectionsKt.listOf(paymentDetails);
        }
        return new ConsumerPaymentDetails(arrayListEmptyList);
    }

    public final ConsumerPaymentDetails.PaymentDetails parsePaymentDetails(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "type");
        if (strOptString != null) {
            String string = json.getString("id");
            boolean zOptBoolean = json.optBoolean("is_default");
            String strOptString2 = StripeJsonUtils.optString(json, "nickname");
            String str = (strOptString2 == null || StringsKt.isBlank(strOptString2)) ? null : strOptString2;
            String lowerCase = strOptString.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "card")) {
                JSONObject jSONObject = json.getJSONObject("card_details");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("checks");
                List<String> listJsonArrayToList = ModelJsonParser.INSTANCE.jsonArrayToList(jSONObject.optJSONArray("networks"));
                Intrinsics.checkNotNull(string);
                int i = jSONObject.getInt("exp_year");
                int i2 = jSONObject.getInt("exp_month");
                CardBrand.Companion companion = CardBrand.INSTANCE;
                ConsumerPaymentDetailsJsonParser consumerPaymentDetailsJsonParser = INSTANCE;
                String string2 = jSONObject.getString("brand");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                CardBrand cardBrandFromCode = companion.fromCode(consumerPaymentDetailsJsonParser.cardBrandFix(string2));
                String string3 = jSONObject.getString("last4");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                CvcCheck cvcCheckFromCode = CvcCheck.INSTANCE.fromCode(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getString("cvc_check") : null);
                String string4 = jSONObject.getString("funding");
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return new ConsumerPaymentDetails.Card(string, string3, zOptBoolean, str, consumerPaymentDetailsJsonParser.parseBillingAddress(json), StripeJsonUtils.optString(json, "billing_email_address"), i, i2, cardBrandFromCode, listJsonArrayToList, cvcCheckFromCode, string4);
            }
            if (Intrinsics.areEqual(lowerCase, "bank_account")) {
                JSONObject jSONObject2 = json.getJSONObject("bank_account_details");
                Intrinsics.checkNotNull(string);
                String string5 = jSONObject2.getString("last4");
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return new ConsumerPaymentDetails.BankAccount(string, string5, zOptBoolean, str, StripeJsonUtils.optString(jSONObject2, "bank_name"), StripeJsonUtils.optString(jSONObject2, "bank_icon_code"), INSTANCE.parseBillingAddress(json), StripeJsonUtils.optString(json, "billing_email_address"));
            }
        }
        return null;
    }

    private final ConsumerPaymentDetails.BillingAddress parseBillingAddress(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("billing_address");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        String strOptString = StripeJsonUtils.optString(jSONObjectOptJSONObject, "name");
        String strOptString2 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "line_1");
        String strOptString3 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "line_2");
        String strOptString4 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "locality");
        String strOptString5 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "postal_code");
        String strOptString6 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "administrative_area");
        String strOptString7 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "country_code");
        return new ConsumerPaymentDetails.BillingAddress(strOptString, strOptString2, strOptString3, strOptString6, strOptString4, strOptString5, strOptString7 != null ? new CountryCode(strOptString7) : null);
    }

    private final String cardBrandFix(String original) {
        String lowerCase = original.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.areEqual(lowerCase, "american_express") ? "amex" : Intrinsics.areEqual(lowerCase, "diners_club") ? "diners" : lowerCase;
    }
}

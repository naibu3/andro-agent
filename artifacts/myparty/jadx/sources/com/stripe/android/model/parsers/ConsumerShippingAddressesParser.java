package com.stripe.android.model.parsers;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerShippingAddress;
import com.stripe.android.model.ConsumerShippingAddresses;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConsumerShippingAddressesParser.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ConsumerShippingAddresses;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseShippingAddress", "Lcom/stripe/android/model/ConsumerShippingAddress;", "parseAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsumerShippingAddressesParser implements ModelJsonParser<ConsumerShippingAddresses> {
    public static final ConsumerShippingAddressesParser INSTANCE = new ConsumerShippingAddressesParser();

    private ConsumerShippingAddressesParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerShippingAddresses parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("shipping_addresses");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(((IntIterator) it).nextInt());
            ConsumerShippingAddressesParser consumerShippingAddressesParser = INSTANCE;
            Intrinsics.checkNotNull(jSONObject);
            ConsumerShippingAddress shippingAddress = consumerShippingAddressesParser.parseShippingAddress(jSONObject);
            if (shippingAddress != null) {
                arrayList.add(shippingAddress);
            }
        }
        return new ConsumerShippingAddresses(arrayList);
    }

    private final ConsumerShippingAddress parseShippingAddress(JSONObject json) {
        String strOptString = json.optString("id");
        boolean zOptBoolean = json.optBoolean("is_default");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("address");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        Intrinsics.checkNotNull(strOptString);
        return new ConsumerShippingAddress(strOptString, zOptBoolean, parseAddress(jSONObjectOptJSONObject), null, 8, null);
    }

    private final ConsumerPaymentDetails.BillingAddress parseAddress(JSONObject json) {
        String strOptString = StripeJsonUtils.optString(json, "name");
        String strOptString2 = StripeJsonUtils.optString(json, "line_1");
        String strOptString3 = StripeJsonUtils.optString(json, "line_2");
        String strOptString4 = StripeJsonUtils.optString(json, "locality");
        String strOptString5 = StripeJsonUtils.optString(json, "administrative_area");
        String strOptString6 = StripeJsonUtils.optString(json, "postal_code");
        String strOptString7 = StripeJsonUtils.optString(json, "country_code");
        return new ConsumerPaymentDetails.BillingAddress(strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6, strOptString7 != null ? new CountryCode(strOptString7) : null);
    }
}

package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Customer;
import com.stripe.android.model.CustomerPaymentSource;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.TokenizationMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CustomerJsonParser.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Customer;", "<init>", "()V", "customerSourceJsonParser", "Lcom/stripe/android/model/parsers/CustomerPaymentSourceJsonParser;", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerJsonParser implements ModelJsonParser<Customer> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_DATA = "data";
    private static final String FIELD_DEFAULT_SOURCE = "default_source";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_HAS_MORE = "has_more";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LIVEMODE = "livemode";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_SHIPPING = "shipping";
    private static final String FIELD_SOURCES = "sources";
    private static final String FIELD_TOTAL_COUNT = "total_count";
    private static final String FIELD_URL = "url";
    private static final String VALUE_CUSTOMER = "customer";
    private static final String VALUE_LIST = "list";
    private final CustomerPaymentSourceJsonParser customerSourceJsonParser = new CustomerPaymentSourceJsonParser();

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Customer parse(JSONObject json) {
        Integer num;
        String str;
        boolean z;
        List listEmptyList;
        boolean z2;
        Intrinsics.checkNotNullParameter(json, "json");
        if (!Intrinsics.areEqual("customer", StripeJsonUtils.optString(json, "object"))) {
            return null;
        }
        String strOptString = StripeJsonUtils.optString(json, "id");
        String strOptString2 = StripeJsonUtils.optString(json, FIELD_DEFAULT_SOURCE);
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_SHIPPING);
        ShippingInformation shippingInformation = jSONObjectOptJSONObject != null ? new ShippingInformationJsonParser().parse(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_SOURCES);
        if (jSONObjectOptJSONObject2 != null && Intrinsics.areEqual(VALUE_LIST, StripeJsonUtils.optString(jSONObjectOptJSONObject2, "object"))) {
            boolean zOptBoolean = StripeJsonUtils.INSTANCE.optBoolean(jSONObjectOptJSONObject2, FIELD_HAS_MORE);
            Integer numOptInteger = StripeJsonUtils.INSTANCE.optInteger(jSONObjectOptJSONObject2, FIELD_TOTAL_COUNT);
            String strOptString3 = StripeJsonUtils.optString(jSONObjectOptJSONObject2, "url");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((IntIterator) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                CustomerPaymentSourceJsonParser customerPaymentSourceJsonParser = this.customerSourceJsonParser;
                Intrinsics.checkNotNull(jSONObject);
                CustomerPaymentSource customerPaymentSource = customerPaymentSourceJsonParser.parse(jSONObject);
                if (customerPaymentSource != null) {
                    arrayList2.add(customerPaymentSource);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((CustomerPaymentSource) obj).getTokenizationMethod() != TokenizationMethod.ApplePay) {
                    arrayList3.add(obj);
                }
            }
            num = numOptInteger;
            str = strOptString3;
            listEmptyList = arrayList3;
            z2 = zOptBoolean;
            z = false;
        } else {
            num = null;
            str = null;
            z = false;
            listEmptyList = CollectionsKt.emptyList();
            z2 = false;
        }
        return new Customer(strOptString, strOptString2, shippingInformation, listEmptyList, z2, num, str, StripeJsonUtils.optString(json, "description"), StripeJsonUtils.optString(json, "email"), json.optBoolean("livemode", z));
    }

    /* compiled from: CustomerJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser$Companion;", "", "<init>", "()V", "FIELD_ID", "", "FIELD_OBJECT", "FIELD_DESCRIPTION", "FIELD_DEFAULT_SOURCE", "FIELD_EMAIL", "FIELD_LIVEMODE", "FIELD_SHIPPING", "FIELD_SOURCES", "FIELD_DATA", "FIELD_HAS_MORE", "FIELD_TOTAL_COUNT", "FIELD_URL", "VALUE_LIST", "VALUE_CUSTOMER", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

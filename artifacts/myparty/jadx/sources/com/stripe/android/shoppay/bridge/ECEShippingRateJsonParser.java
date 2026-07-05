package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.shoppay.bridge.ECEDeliveryEstimate;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ECEShippingRateJsonParser.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseDeliveryEstimate", "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;", "fieldName", "", "parseDeliveryEstimateUnit", "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ECEShippingRateJsonParser implements ModelJsonParser<ECEShippingRate> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_AMOUNT = "amount";
    private static final String FIELD_DELIVERY_ESTIMATE = "deliveryEstimate";
    private static final String FIELD_DISPLAY_NAME = "displayName";
    private static final String FIELD_ID = "id";
    private static final String FIELD_MAXIMUM = "maximum";
    private static final String FIELD_MINIMUM = "minimum";
    private static final String FIELD_UNIT = "unit";
    private static final String FIELD_VALUE = "value";

    @Inject
    public ECEShippingRateJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ECEShippingRate parse(JSONObject json) {
        String strOptString;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString2 = StripeJsonUtils.optString(json, "id");
        if (strOptString2 == null || (strOptString = StripeJsonUtils.optString(json, FIELD_DISPLAY_NAME)) == null) {
            return null;
        }
        return new ECEShippingRate(strOptString2, json.optInt("amount", 0), strOptString, parseDeliveryEstimate(json, FIELD_DELIVERY_ESTIMATE));
    }

    private final ECEDeliveryEstimate parseDeliveryEstimate(JSONObject json, String fieldName) {
        if (!json.isNull(fieldName)) {
            Object objOpt = json.opt(fieldName);
            if ((objOpt instanceof String) && ((CharSequence) objOpt).length() > 0) {
                return new ECEDeliveryEstimate.Text((String) objOpt);
            }
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(fieldName);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(FIELD_MAXIMUM);
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(FIELD_MINIMUM);
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject3 != null) {
            ECEDeliveryEstimateUnit deliveryEstimateUnit = parseDeliveryEstimateUnit(jSONObjectOptJSONObject2);
            ECEDeliveryEstimateUnit deliveryEstimateUnit2 = parseDeliveryEstimateUnit(jSONObjectOptJSONObject3);
            if (deliveryEstimateUnit != null && deliveryEstimateUnit2 != null) {
                return new ECEDeliveryEstimate.Range(new ECEStructuredDeliveryEstimate(deliveryEstimateUnit, deliveryEstimateUnit2));
            }
        }
        return null;
    }

    private final ECEDeliveryEstimateUnit parseDeliveryEstimateUnit(JSONObject json) {
        String strOptString = json.optString(FIELD_UNIT);
        int iOptInt = json.optInt("value", -1);
        if (iOptInt == -1) {
            return null;
        }
        Intrinsics.checkNotNull(strOptString);
        if (strOptString.length() == 0) {
            return null;
        }
        String upperCase = strOptString.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new ECEDeliveryEstimateUnit(DeliveryTimeUnit.valueOf(upperCase), iOptInt);
    }

    /* compiled from: ECEShippingRateJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser$Companion;", "", "<init>", "()V", "FIELD_ID", "", "FIELD_DISPLAY_NAME", "FIELD_AMOUNT", "FIELD_DELIVERY_ESTIMATE", "FIELD_MAXIMUM", "FIELD_MINIMUM", "FIELD_UNIT", "FIELD_VALUE", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

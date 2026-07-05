package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.shoppay.bridge.ShippingCalculationRequest;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ShippingCalculationRequestJsonParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseShippingAddress", "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShippingCalculationRequestJsonParser implements ModelJsonParser<ShippingCalculationRequest> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_ADDRESS = "address";
    private static final String FIELD_CITY = "city";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_POSTAL_CODE = "postal_code";
    private static final String FIELD_SHIPPING_ADDRESS = "shippingAddress";
    private static final String FIELD_STATE = "state";

    @Inject
    public ShippingCalculationRequestJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ShippingCalculationRequest parse(JSONObject json) {
        ShippingCalculationRequest.ShippingAddress shippingAddress;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_SHIPPING_ADDRESS);
        if (jSONObjectOptJSONObject == null || (shippingAddress = parseShippingAddress(jSONObjectOptJSONObject)) == null) {
            return null;
        }
        return new ShippingCalculationRequest(shippingAddress);
    }

    private final ShippingCalculationRequest.ShippingAddress parseShippingAddress(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("address");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new ShippingCalculationRequest.ShippingAddress(StripeJsonUtils.optString(json, "name"), new ECEPartialAddress(StripeJsonUtils.optString(jSONObjectOptJSONObject, FIELD_CITY), StripeJsonUtils.optString(jSONObjectOptJSONObject, "state"), StripeJsonUtils.optString(jSONObjectOptJSONObject, FIELD_POSTAL_CODE), StripeJsonUtils.optString(jSONObjectOptJSONObject, "country")));
    }

    /* compiled from: ShippingCalculationRequestJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser$Companion;", "", "<init>", "()V", "FIELD_SHIPPING_ADDRESS", "", "FIELD_NAME", "FIELD_ADDRESS", "FIELD_CITY", "FIELD_STATE", "FIELD_POSTAL_CODE", "FIELD_COUNTRY", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

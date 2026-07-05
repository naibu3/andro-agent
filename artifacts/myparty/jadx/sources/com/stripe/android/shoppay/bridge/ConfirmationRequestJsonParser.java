package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.shoppay.bridge.ConfirmationRequest;
import com.stripe.android.shoppay.bridge.ECEPaymentMethodOptions;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ConfirmationRequestJsonParser.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0017\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;", "shippingRateParser", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "<init>", "(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V", "parse", "json", "Lorg/json/JSONObject;", "parsePaymentDetails", "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;", "parseBillingDetails", "Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;", "parseShippingAddress", "Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;", "parseFullAddress", "Lcom/stripe/android/shoppay/bridge/ECEFullAddress;", "parsePaymentMethodOptions", "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;", "parseShopPay", "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmationRequestJsonParser implements ModelJsonParser<ConfirmationRequest> {
    private static final String FIELD_ADDRESS_CITY = "city";
    private static final String FIELD_ADDRESS_COUNTRY = "country";
    private static final String FIELD_ADDRESS_LINE1 = "line1";
    private static final String FIELD_ADDRESS_LINE2 = "line2";
    private static final String FIELD_ADDRESS_POSTAL_CODE = "postal_code";
    private static final String FIELD_ADDRESS_STATE = "state";
    private static final String FIELD_BILLING_ADDRESS = "address";
    private static final String FIELD_BILLING_DETAILS = "billingDetails";
    private static final String FIELD_BILLING_EMAIL = "email";
    private static final String FIELD_BILLING_NAME = "name";
    private static final String FIELD_BILLING_PHONE = "phone";
    private static final String FIELD_EXTERNAL_SOURCE_ID = "externalSourceId";
    private static final String FIELD_PAYMENT_DETAILS = "paymentDetails";
    private static final String FIELD_PAYMENT_METHOD_OPTIONS = "paymentMethodOptions";
    private static final String FIELD_SHIPPING_ADDRESS = "shippingAddress";
    private static final String FIELD_SHIPPING_ADDRESS_DETAILS = "address";
    private static final String FIELD_SHIPPING_NAME = "name";
    private static final String FIELD_SHIPPING_RATE = "shippingRate";
    private static final String FIELD_SHOP_PAY = "shopPay";
    private final ModelJsonParser<ECEShippingRate> shippingRateParser;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public ConfirmationRequestJsonParser(ModelJsonParser<ECEShippingRate> shippingRateParser) {
        Intrinsics.checkNotNullParameter(shippingRateParser, "shippingRateParser");
        this.shippingRateParser = shippingRateParser;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConfirmationRequest parse(JSONObject json) {
        ConfirmationRequest.ConfirmEventData paymentDetails;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_PAYMENT_DETAILS);
        if (jSONObjectOptJSONObject == null || (paymentDetails = parsePaymentDetails(jSONObjectOptJSONObject)) == null) {
            return null;
        }
        return new ConfirmationRequest(paymentDetails);
    }

    private final ConfirmationRequest.ConfirmEventData parsePaymentDetails(JSONObject json) {
        ECEBillingDetails billingDetails;
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_BILLING_DETAILS);
        if (jSONObjectOptJSONObject == null || (billingDetails = parseBillingDetails(jSONObjectOptJSONObject)) == null) {
            throw new IllegalArgumentException("Missing billing details");
        }
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_SHIPPING_ADDRESS);
        ECEShippingAddressData shippingAddress = jSONObjectOptJSONObject2 != null ? parseShippingAddress(jSONObjectOptJSONObject2) : null;
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(FIELD_SHIPPING_RATE);
        ECEShippingRate eCEShippingRate = jSONObjectOptJSONObject3 != null ? (ECEShippingRate) this.shippingRateParser.parse(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(FIELD_PAYMENT_METHOD_OPTIONS);
        return new ConfirmationRequest.ConfirmEventData(billingDetails, shippingAddress, eCEShippingRate, jSONObjectOptJSONObject4 != null ? parsePaymentMethodOptions(jSONObjectOptJSONObject4) : null);
    }

    private final ECEBillingDetails parseBillingDetails(JSONObject json) {
        String strOptString = StripeJsonUtils.optString(json, "name");
        String strOptString2 = StripeJsonUtils.optString(json, "email");
        String strOptString3 = StripeJsonUtils.optString(json, "phone");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("address");
        return new ECEBillingDetails(strOptString, strOptString2, strOptString3, jSONObjectOptJSONObject != null ? parseFullAddress(jSONObjectOptJSONObject) : null);
    }

    private final ECEShippingAddressData parseShippingAddress(JSONObject json) {
        String strOptString = StripeJsonUtils.optString(json, "name");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("address");
        return new ECEShippingAddressData(strOptString, jSONObjectOptJSONObject != null ? parseFullAddress(jSONObjectOptJSONObject) : null);
    }

    private final ECEFullAddress parseFullAddress(JSONObject json) {
        return new ECEFullAddress(StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1), StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE2), StripeJsonUtils.optString(json, FIELD_ADDRESS_CITY), StripeJsonUtils.optString(json, "state"), StripeJsonUtils.optString(json, FIELD_ADDRESS_POSTAL_CODE), StripeJsonUtils.optString(json, "country"));
    }

    private final ECEPaymentMethodOptions parsePaymentMethodOptions(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_SHOP_PAY);
        return new ECEPaymentMethodOptions(jSONObjectOptJSONObject != null ? parseShopPay(jSONObjectOptJSONObject) : null);
    }

    private final ECEPaymentMethodOptions.ShopPay parseShopPay(JSONObject json) {
        String strOptString = StripeJsonUtils.optString(json, FIELD_EXTERNAL_SOURCE_ID);
        if (strOptString == null) {
            return null;
        }
        return new ECEPaymentMethodOptions.ShopPay(strOptString);
    }

    /* compiled from: ConfirmationRequestJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser$Companion;", "", "<init>", "()V", "FIELD_PAYMENT_DETAILS", "", "FIELD_BILLING_DETAILS", "FIELD_BILLING_NAME", "FIELD_BILLING_EMAIL", "FIELD_BILLING_PHONE", "FIELD_BILLING_ADDRESS", "FIELD_SHIPPING_ADDRESS", "FIELD_SHIPPING_NAME", "FIELD_SHIPPING_ADDRESS_DETAILS", "FIELD_ADDRESS_LINE1", "FIELD_ADDRESS_LINE2", "FIELD_ADDRESS_CITY", "FIELD_ADDRESS_STATE", "FIELD_ADDRESS_POSTAL_CODE", "FIELD_ADDRESS_COUNTRY", "FIELD_SHIPPING_RATE", "FIELD_PAYMENT_METHOD_OPTIONS", "FIELD_SHOP_PAY", "FIELD_EXTERNAL_SOURCE_ID", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

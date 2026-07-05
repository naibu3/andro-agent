package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: PaymentIntentJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "ErrorJsonParser", "ShippingJsonParser", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentIntentJsonParser implements ModelJsonParser<PaymentIntent> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_AMOUNT = "amount";
    private static final String FIELD_CANCELED_AT = "canceled_at";
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    private static final String FIELD_CAPTURE_METHOD = "capture_method";
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    private static final String FIELD_CONFIRMATION_METHOD = "confirmation_method";
    private static final String FIELD_COUNTRY_CODE = "country_code";
    private static final String FIELD_CREATED = "created";
    private static final String FIELD_CURRENCY = "currency";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LAST_PAYMENT_ERROR = "last_payment_error";
    private static final String FIELD_LINK_FUNDING_SOURCES = "link_funding_sources";
    private static final String FIELD_LIVEMODE = "livemode";
    private static final String FIELD_NEXT_ACTION = "next_action";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_PAYMENT_METHOD = "payment_method";
    private static final String FIELD_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    private static final String FIELD_RECEIPT_EMAIL = "receipt_email";
    private static final String FIELD_SETUP_FUTURE_USAGE = "setup_future_usage";
    private static final String FIELD_SHIPPING = "shipping";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    private static final String OBJECT_TYPE = "payment_intent";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentIntent parse(JSONObject json) {
        String str;
        PaymentMethod paymentMethod;
        String str2;
        Intrinsics.checkNotNullParameter(json, "json");
        if (!Intrinsics.areEqual(OBJECT_TYPE, StripeJsonUtils.optString(json, "object"))) {
            return null;
        }
        String strOptString = StripeJsonUtils.optString(json, "id");
        List<String> listJsonArrayToList = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_PAYMENT_METHOD_TYPES));
        Long lOptLong = StripeJsonUtils.INSTANCE.optLong(json, "amount");
        long jOptLong = json.optLong(FIELD_CANCELED_AT);
        PaymentIntent.CancellationReason cancellationReasonFromCode = PaymentIntent.CancellationReason.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_CANCELLATION_REASON));
        PaymentIntent.CaptureMethod captureMethodFromCode = PaymentIntent.CaptureMethod.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_CAPTURE_METHOD));
        String strOptString2 = StripeJsonUtils.optString(json, "client_secret");
        PaymentIntent.ConfirmationMethod confirmationMethodFromCode = PaymentIntent.ConfirmationMethod.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_CONFIRMATION_METHOD));
        long jOptLong2 = json.optLong("created");
        String strOptCurrency = StripeJsonUtils.optCurrency(json, "currency");
        String strOptString3 = StripeJsonUtils.optString(json, "description");
        boolean zOptBoolean = StripeJsonUtils.INSTANCE.optBoolean(json, "livemode");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        PaymentMethod paymentMethod2 = jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null;
        String strOptString4 = StripeJsonUtils.optString(json, "payment_method");
        if (paymentMethod2 != null) {
            strOptString4 = null;
        }
        if (strOptString4 != null) {
            str = strOptString4;
        } else if (paymentMethod2 != null) {
            strOptString4 = paymentMethod2.id;
            str = strOptString4;
        } else {
            str = null;
        }
        String strOptString5 = StripeJsonUtils.optString(json, FIELD_RECEIPT_EMAIL);
        StripeIntent.Status statusFromCode$payments_core_release = StripeIntent.Status.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "status"));
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_PAYMENT_METHOD_OPTIONS);
        String string = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        StripeIntent.Usage usageFromCode$payments_core_release = StripeIntent.Usage.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "setup_future_usage"));
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(FIELD_LAST_PAYMENT_ERROR);
        PaymentIntent.Error error = jSONObjectOptJSONObject3 != null ? new ErrorJsonParser().parse(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(FIELD_SHIPPING);
        PaymentIntent.Shipping shipping = jSONObjectOptJSONObject4 != null ? new ShippingJsonParser().parse(jSONObjectOptJSONObject4) : null;
        JSONObject jSONObjectOptJSONObject5 = json.optJSONObject(FIELD_NEXT_ACTION);
        StripeIntent.NextActionData nextActionData = jSONObjectOptJSONObject5 != null ? new NextActionDataParser().parse(jSONObjectOptJSONObject5) : null;
        List<String> listJsonArrayToList2 = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList2, 10));
        Iterator it = listJsonArrayToList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
            it = it2;
        }
        ArrayList arrayList2 = arrayList;
        List<String> listJsonArrayToList3 = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList3, 10));
        Iterator it3 = listJsonArrayToList3.iterator();
        while (it3.hasNext()) {
            Iterator it4 = it3;
            String lowerCase2 = ((String) it3.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            arrayList3.add(lowerCase2);
            it3 = it4;
        }
        ArrayList arrayList4 = arrayList3;
        String strOptString6 = StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE);
        if (strOptString2 == null) {
            paymentMethod = paymentMethod2;
            str2 = PaymentIntent.VALUE_REDACTED_CLIENT_SECRET;
        } else {
            paymentMethod = paymentMethod2;
            str2 = strOptString2;
        }
        return new PaymentIntent(strOptString, listJsonArrayToList, lOptLong, jOptLong, cancellationReasonFromCode, captureMethodFromCode, str2, confirmationMethodFromCode, strOptString6, jOptLong2, strOptCurrency, strOptString3, zOptBoolean, paymentMethod, str, strOptString5, statusFromCode$payments_core_release, usageFromCode$payments_core_release, error, shipping, arrayList2, arrayList4, nextActionData, string);
    }

    /* compiled from: PaymentIntentJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Error;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorJsonParser implements ModelJsonParser<PaymentIntent.Error> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_CHARGE = "charge";
        private static final String FIELD_CODE = "code";
        private static final String FIELD_DECLINE_CODE = "decline_code";
        private static final String FIELD_DOC_URL = "doc_url";
        private static final String FIELD_MESSAGE = "message";
        private static final String FIELD_PARAM = "param";
        private static final String FIELD_PAYMENT_METHOD = "payment_method";
        private static final String FIELD_TYPE = "type";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentIntent.Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = StripeJsonUtils.optString(json, "charge");
            String strOptString2 = StripeJsonUtils.optString(json, "code");
            String strOptString3 = StripeJsonUtils.optString(json, "decline_code");
            String strOptString4 = StripeJsonUtils.optString(json, "doc_url");
            String strOptString5 = StripeJsonUtils.optString(json, "message");
            String strOptString6 = StripeJsonUtils.optString(json, "param");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
            return new PaymentIntent.Error(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null, PaymentIntent.Error.Type.INSTANCE.fromCode(StripeJsonUtils.optString(json, "type")));
        }

        /* compiled from: PaymentIntentJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser$Companion;", "", "<init>", "()V", "FIELD_CHARGE", "", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentIntentJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShippingJsonParser implements ModelJsonParser<PaymentIntent.Shipping> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ADDRESS = "address";
        private static final String FIELD_CARRIER = "carrier";
        private static final String FIELD_NAME = "name";
        private static final String FIELD_PHONE = "phone";
        private static final String FIELD_TRACKING_NUMBER = "tracking_number";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentIntent.Shipping parse(JSONObject json) {
            Address address;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("address");
            return new PaymentIntent.Shipping((jSONObjectOptJSONObject == null || (address = new AddressJsonParser().parse(jSONObjectOptJSONObject)) == null) ? new Address(null, null, null, null, null, null, 63, null) : address, StripeJsonUtils.optString(json, FIELD_CARRIER), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"), StripeJsonUtils.optString(json, FIELD_TRACKING_NUMBER));
        }

        /* compiled from: PaymentIntentJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser$Companion;", "", "<init>", "()V", "FIELD_ADDRESS", "", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentIntentJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$Companion;", "", "<init>", "()V", "OBJECT_TYPE", "", "FIELD_ID", "FIELD_OBJECT", "FIELD_AMOUNT", "FIELD_CREATED", "FIELD_CANCELED_AT", "FIELD_CANCELLATION_REASON", "FIELD_CAPTURE_METHOD", "FIELD_CLIENT_SECRET", "FIELD_CONFIRMATION_METHOD", "FIELD_COUNTRY_CODE", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_LAST_PAYMENT_ERROR", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_PAYMENT_METHOD_OPTIONS", "FIELD_RECEIPT_EMAIL", "FIELD_SHIPPING", "FIELD_STATUS", "FIELD_SETUP_FUTURE_USAGE", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "FIELD_LINK_FUNDING_SOURCES", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

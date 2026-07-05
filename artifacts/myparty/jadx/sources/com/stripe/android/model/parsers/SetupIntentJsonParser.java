package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
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

/* compiled from: SetupIntentJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "ErrorJsonParser", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SetupIntentJsonParser implements ModelJsonParser<SetupIntent> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    private static final String FIELD_COUNTRY_CODE = "country_code";
    private static final String FIELD_CREATED = "created";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LAST_SETUP_ERROR = "last_setup_error";
    private static final String FIELD_LINK_FUNDING_SOURCES = "link_funding_sources";
    private static final String FIELD_LIVEMODE = "livemode";
    private static final String FIELD_NEXT_ACTION = "next_action";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_PAYMENT_METHOD = "payment_method";
    private static final String FIELD_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    private static final String FIELD_USAGE = "usage";
    private static final String VALUE_SETUP_INTENT = "setup_intent";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SetupIntent parse(JSONObject json) {
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        if (!Intrinsics.areEqual(VALUE_SETUP_INTENT, StripeJsonUtils.optString(json, "object"))) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        PaymentMethod paymentMethod = jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null;
        String strOptString = StripeJsonUtils.optString(json, "payment_method");
        if (paymentMethod != null) {
            strOptString = null;
        }
        if (strOptString != null) {
            str = strOptString;
        } else if (paymentMethod != null) {
            strOptString = paymentMethod.id;
            str = strOptString;
        } else {
            str = null;
        }
        List<String> listJsonArrayToList = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList, 10));
        Iterator<T> it = listJsonArrayToList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        ArrayList arrayList2 = arrayList;
        List<String> listJsonArrayToList2 = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList2, 10));
        Iterator<T> it2 = listJsonArrayToList2.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            arrayList3.add(lowerCase2);
        }
        ArrayList arrayList4 = arrayList3;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_PAYMENT_METHOD_OPTIONS);
        String string = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        String strOptString2 = StripeJsonUtils.optString(json, "id");
        long jOptLong = json.optLong("created");
        String strOptString3 = StripeJsonUtils.optString(json, "client_secret");
        SetupIntent.CancellationReason cancellationReasonFromCode$payments_core_release = SetupIntent.CancellationReason.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, FIELD_CANCELLATION_REASON));
        String strOptString4 = StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE);
        String strOptString5 = StripeJsonUtils.optString(json, "description");
        boolean zOptBoolean = json.optBoolean("livemode");
        List<String> listJsonArrayToList3 = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_PAYMENT_METHOD_TYPES));
        StripeIntent.Status statusFromCode$payments_core_release = StripeIntent.Status.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "status"));
        StripeIntent.Usage usageFromCode$payments_core_release = StripeIntent.Usage.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "usage"));
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(FIELD_LAST_SETUP_ERROR);
        SetupIntent.Error error = jSONObjectOptJSONObject3 != null ? new ErrorJsonParser().parse(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(FIELD_NEXT_ACTION);
        return new SetupIntent(strOptString2, cancellationReasonFromCode$payments_core_release, jOptLong, strOptString4, strOptString3, strOptString5, zOptBoolean, paymentMethod, str, listJsonArrayToList3, statusFromCode$payments_core_release, usageFromCode$payments_core_release, error, arrayList2, arrayList4, jSONObjectOptJSONObject4 != null ? new NextActionDataParser().parse(jSONObjectOptJSONObject4) : null, string);
    }

    /* compiled from: SetupIntentJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent$Error;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorJsonParser implements ModelJsonParser<SetupIntent.Error> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_CODE = "code";
        private static final String FIELD_DECLINE_CODE = "decline_code";
        private static final String FIELD_DOC_URL = "doc_url";
        private static final String FIELD_MESSAGE = "message";
        private static final String FIELD_PARAM = "param";
        private static final String FIELD_PAYMENT_METHOD = "payment_method";
        private static final String FIELD_TYPE = "type";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SetupIntent.Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = StripeJsonUtils.optString(json, "code");
            String strOptString2 = StripeJsonUtils.optString(json, "decline_code");
            String strOptString3 = StripeJsonUtils.optString(json, "doc_url");
            String strOptString4 = StripeJsonUtils.optString(json, "message");
            String strOptString5 = StripeJsonUtils.optString(json, "param");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
            return new SetupIntent.Error(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, jSONObjectOptJSONObject != null ? new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject) : null, SetupIntent.Error.Type.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type")));
        }

        /* compiled from: SetupIntentJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser$Companion;", "", "<init>", "()V", "FIELD_CODE", "", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SetupIntentJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$Companion;", "", "<init>", "()V", "VALUE_SETUP_INTENT", "", "FIELD_ID", "FIELD_OBJECT", "FIELD_CANCELLATION_REASON", "FIELD_CREATED", "FIELD_CLIENT_SECRET", "FIELD_COUNTRY_CODE", "FIELD_DESCRIPTION", "FIELD_LAST_SETUP_ERROR", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_STATUS", "FIELD_USAGE", "FIELD_PAYMENT_METHOD", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "FIELD_LINK_FUNDING_SOURCES", "FIELD_PAYMENT_METHOD_OPTIONS", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

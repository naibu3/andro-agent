package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Stripe3ds2AuthResultJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "AresJsonParser", "MessageExtensionJsonParser", "ThreeDS2ErrorJsonParser", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Stripe3ds2AuthResultJsonParser implements ModelJsonParser<Stripe3ds2AuthResult> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_ARES = "ares";
    private static final String FIELD_CREATED = "created";
    private static final String FIELD_CREQ = "creq";
    private static final String FIELD_ERROR = "error";
    private static final String FIELD_FALLBACK_REDIRECT_URL = "fallback_redirect_url";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LIVEMODE = "livemode";
    private static final String FIELD_SOURCE = "source";
    private static final String FIELD_STATE = "state";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Stripe3ds2AuthResult parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        long j = json.getLong("created");
        boolean z = json.getBoolean("livemode");
        String string2 = json.getString("source");
        String strOptString = json.optString("state");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_ARES);
        Stripe3ds2AuthResult.Ares ares = jSONObjectOptJSONObject != null ? new AresJsonParser().parse(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("error");
        return new Stripe3ds2AuthResult(string, ares, Long.valueOf(j), string2, strOptString, z, jSONObjectOptJSONObject2 != null ? new ThreeDS2ErrorJsonParser().parse(jSONObjectOptJSONObject2) : null, StripeJsonUtils.optString(json, FIELD_FALLBACK_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_CREQ));
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AresJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.Ares> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ACS_CHALLENGE_MANDATED = "acsChallengeMandated";
        private static final String FIELD_ACS_SIGNED_CONTENT = "acsSignedContent";
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        private static final String FIELD_ACS_URL = "acsURL";
        private static final String FIELD_AUTHENTICATION_TYPE = "authenticationType";
        private static final String FIELD_CARDHOLDER_INFO = "cardholderInfo";
        private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";
        private static final String FIELD_TRANS_STATUS = "transStatus";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.Ares parse(JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = StripeJsonUtils.optString(json, "threeDSServerTransID");
            String strOptString2 = StripeJsonUtils.optString(json, FIELD_ACS_CHALLENGE_MANDATED);
            String strOptString3 = StripeJsonUtils.optString(json, FIELD_ACS_SIGNED_CONTENT);
            String string = json.getString("acsTransID");
            String strOptString4 = StripeJsonUtils.optString(json, "acsURL");
            String strOptString5 = StripeJsonUtils.optString(json, FIELD_AUTHENTICATION_TYPE);
            String strOptString6 = StripeJsonUtils.optString(json, FIELD_CARDHOLDER_INFO);
            String string2 = json.getString("messageType");
            String string3 = json.getString("messageVersion");
            String strOptString7 = StripeJsonUtils.optString(json, "sdkTransID");
            String strOptString8 = StripeJsonUtils.optString(json, FIELD_TRANS_STATUS);
            JSONArray jSONArrayOptJSONArray = json.optJSONArray(FIELD_MESSAGE_EXTENSION);
            return new Stripe3ds2AuthResult.Ares(strOptString, strOptString2, strOptString3, string, strOptString4, strOptString5, strOptString6, jSONArrayOptJSONArray != null ? new MessageExtensionJsonParser().parse(jSONArrayOptJSONArray) : null, string2, string3, strOptString7, strOptString8);
        }

        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser$Companion;", "", "<init>", "()V", "FIELD_ACS_CHALLENGE_MANDATED", "", "FIELD_ACS_SIGNED_CONTENT", "FIELD_ACS_TRANS_ID", "FIELD_ACS_URL", "FIELD_AUTHENTICATION_TYPE", "FIELD_CARDHOLDER_INFO", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_TRANS_STATUS", "FIELD_THREE_DS_SERVER_TRANS_ID", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "<init>", "()V", "parse", "", "jsonArray", "Lorg/json/JSONArray;", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MessageExtensionJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.MessageExtension> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
        private static final String FIELD_DATA = "data";
        private static final String FIELD_ID = "id";
        private static final String FIELD_NAME = "name";

        public final List<Stripe3ds2AuthResult.MessageExtension> parse(JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            IntRange intRangeUntil = RangesKt.until(0, jsonArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(((IntIterator) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(parse((JSONObject) it2.next()));
            }
            return arrayList3;
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.MessageExtension parse(JSONObject json) {
            Map mapEmptyMap;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
                if (jSONArrayNames == null) {
                    jSONArrayNames = new JSONArray();
                }
                IntRange intRangeUntil = RangesKt.until(0, jSONArrayNames.length());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArrayNames.getString(((IntIterator) it).nextInt()));
                }
                ArrayList<String> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (String str : arrayList2) {
                    arrayList3.add(MapsKt.mapOf(TuplesKt.to(str, jSONObjectOptJSONObject.getString(str))));
                }
                mapEmptyMap = MapsKt.emptyMap();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    mapEmptyMap = MapsKt.plus(mapEmptyMap, (Map) it2.next());
                }
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return new Stripe3ds2AuthResult.MessageExtension(StripeJsonUtils.optString(json, "name"), json.optBoolean("criticalityIndicator"), StripeJsonUtils.optString(json, "id"), MapsKt.toMap(mapEmptyMap));
        }

        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser$Companion;", "", "<init>", "()V", "FIELD_NAME", "", "FIELD_ID", "FIELD_CRITICALITY_INDICATOR", "FIELD_DATA", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ThreeDS2ErrorJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.ThreeDS2Error> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        private static final String FIELD_DS_TRANS_ID = "dsTransID";
        private static final String FIELD_ERROR_CODE = "errorCode";
        private static final String FIELD_ERROR_COMPONENT = "errorComponent";
        private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
        private static final String FIELD_ERROR_DETAIL = "errorDetail";
        private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.ThreeDS2Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Stripe3ds2AuthResult.ThreeDS2Error(json.getString("threeDSServerTransID"), StripeJsonUtils.optString(json, "acsTransID"), StripeJsonUtils.optString(json, FIELD_DS_TRANS_ID), json.getString(FIELD_ERROR_CODE), json.getString(FIELD_ERROR_COMPONENT), json.getString(FIELD_ERROR_DESCRIPTION), json.getString(FIELD_ERROR_DETAIL), StripeJsonUtils.optString(json, FIELD_ERROR_MESSAGE_TYPE), json.getString("messageType"), json.getString("messageVersion"), StripeJsonUtils.optString(json, "sdkTransID"));
        }

        /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser$Companion;", "", "<init>", "()V", "FIELD_THREE_DS_SERVER_TRANS_ID", "", "FIELD_ACS_TRANS_ID", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: Stripe3ds2AuthResultJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$Companion;", "", "<init>", "()V", "FIELD_ID", "", "FIELD_ARES", "FIELD_CREATED", "FIELD_CREQ", "FIELD_ERROR", "FIELD_FALLBACK_REDIRECT_URL", "FIELD_LIVEMODE", "FIELD_SOURCE", "FIELD_STATE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

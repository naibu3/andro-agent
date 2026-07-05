package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConsumerSessionJsonParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ConsumerSession;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseVerificationSession", "Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsumerSessionJsonParser implements ModelJsonParser<ConsumerSession> {
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_CONSUMER_SESSION = "consumer_session";
    private static final String FIELD_CONSUMER_SESSION_EMAIL = "email_address";
    private static final String FIELD_CONSUMER_SESSION_FORMATTED_PHONE = "redacted_formatted_phone_number";
    private static final String FIELD_CONSUMER_SESSION_PHONE = "redacted_phone_number";
    private static final String FIELD_CONSUMER_SESSION_PHONE_COUNTRY = "phone_number_country";
    private static final String FIELD_CONSUMER_SESSION_SECRET = "client_secret";
    private static final String FIELD_CONSUMER_SESSION_UNREDACTED_PHONE = "unredacted_phone_number";
    private static final String FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS = "verification_sessions";
    private static final String FIELD_VERIFICATION_SESSION_STATE = "state";
    private static final String FIELD_VERIFICATION_SESSION_TYPE = "type";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerSession parse(JSONObject json) throws JSONException {
        ArrayList arrayListEmptyList;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_CONSUMER_SESSION);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS);
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((IntIterator) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                Intrinsics.checkNotNull(jSONObject);
                ConsumerSession.VerificationSession verificationSession = parseVerificationSession(jSONObject);
                if (verificationSession != null) {
                    arrayList2.add(verificationSession);
                }
            }
            arrayListEmptyList = arrayList2;
        } else {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        String string = jSONObjectOptJSONObject.getString("client_secret");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObjectOptJSONObject.getString(FIELD_CONSUMER_SESSION_EMAIL);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObjectOptJSONObject.getString(FIELD_CONSUMER_SESSION_FORMATTED_PHONE);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = jSONObjectOptJSONObject.getString(FIELD_CONSUMER_SESSION_PHONE);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return new ConsumerSession(string, string2, string3, string4, StripeJsonUtils.optString(jSONObjectOptJSONObject, FIELD_CONSUMER_SESSION_UNREDACTED_PHONE), StripeJsonUtils.optString(jSONObjectOptJSONObject, FIELD_CONSUMER_SESSION_PHONE_COUNTRY), arrayListEmptyList);
    }

    private final ConsumerSession.VerificationSession parseVerificationSession(JSONObject json) throws JSONException {
        ConsumerSession.VerificationSession.SessionType.Companion companion = ConsumerSession.VerificationSession.SessionType.INSTANCE;
        String string = json.getString("type");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        ConsumerSession.VerificationSession.SessionType sessionTypeFromValue = companion.fromValue(lowerCase);
        ConsumerSession.VerificationSession.SessionState.Companion companion2 = ConsumerSession.VerificationSession.SessionState.INSTANCE;
        String string2 = json.getString("state");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return new ConsumerSession.VerificationSession(sessionTypeFromValue, companion2.fromValue(lowerCase2));
    }

    /* compiled from: ConsumerSessionJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser$Companion;", "", "<init>", "()V", "FIELD_CONSUMER_SESSION", "", "FIELD_CONSUMER_SESSION_SECRET", "FIELD_CONSUMER_SESSION_EMAIL", "FIELD_CONSUMER_SESSION_PHONE", "FIELD_CONSUMER_SESSION_FORMATTED_PHONE", "FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS", "FIELD_CONSUMER_SESSION_UNREDACTED_PHONE", "FIELD_CONSUMER_SESSION_PHONE_COUNTRY", "FIELD_VERIFICATION_SESSION_TYPE", "FIELD_VERIFICATION_SESSION_STATE", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

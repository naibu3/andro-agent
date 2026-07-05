package com.stripe.android.core.model.parsers;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.model.StripeJsonUtils;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* compiled from: StripeErrorJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/core/StripeError;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeErrorJsonParser implements ModelJsonParser<StripeError> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FIELD_CHARGE = "charge";
    public static final String FIELD_CODE = "code";
    public static final String FIELD_DECLINE_CODE = "decline_code";
    public static final String FIELD_DOC_URL = "doc_url";
    public static final String FIELD_ERROR = "error";
    public static final String FIELD_EXTRA_FIELDS = "extra_fields";
    public static final String FIELD_MESSAGE = "message";
    public static final String FIELD_PARAM = "param";
    public static final String FIELD_TYPE = "type";
    public static final String MALFORMED_RESPONSE_MESSAGE = "An improperly formatted error response was found.";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeError parse(JSONObject json) {
        Object objM9118constructorimpl;
        Map map;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeErrorJsonParser stripeErrorJsonParser = this;
            JSONObject jSONObject = json.getJSONObject("error");
            String strOptString = StripeJsonUtils.optString(jSONObject, FIELD_CHARGE);
            String strOptString2 = StripeJsonUtils.optString(jSONObject, "code");
            String strOptString3 = StripeJsonUtils.optString(jSONObject, FIELD_DECLINE_CODE);
            String strOptString4 = StripeJsonUtils.optString(jSONObject, "message");
            String strOptString5 = StripeJsonUtils.optString(jSONObject, FIELD_PARAM);
            String strOptString6 = StripeJsonUtils.optString(jSONObject, "type");
            String strOptString7 = StripeJsonUtils.optString(jSONObject, FIELD_DOC_URL);
            final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(FIELD_EXTRA_FIELDS);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                map = MapsKt.toMap(SequencesKt.map(SequencesKt.asSequence(itKeys), new Function1() { // from class: com.stripe.android.core.model.parsers.StripeErrorJsonParser$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StripeErrorJsonParser.parse$lambda$3$lambda$2$lambda$1$lambda$0(jSONObjectOptJSONObject, (String) obj);
                    }
                }));
            } else {
                map = null;
            }
            objM9118constructorimpl = Result.m9118constructorimpl(new StripeError(strOptString6, strOptString4, strOptString2, strOptString5, strOptString3, strOptString, strOptString7, map));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        StripeError stripeError = new StripeError(null, MALFORMED_RESPONSE_MESSAGE, null, null, null, null, null, null, 253, null);
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = stripeError;
        }
        return (StripeError) objM9118constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair parse$lambda$3$lambda$2$lambda$1$lambda$0(JSONObject jSONObject, String str) {
        return TuplesKt.to(str, jSONObject.get(str).toString());
    }

    /* compiled from: StripeErrorJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser$Companion;", "", "<init>", "()V", "MALFORMED_RESPONSE_MESSAGE", "", "getMALFORMED_RESPONSE_MESSAGE$stripe_core_release$annotations", "FIELD_CHARGE", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_EXTRA_FIELDS", "FIELD_DOC_URL", "FIELD_ERROR", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_TYPE", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMALFORMED_RESPONSE_MESSAGE$stripe_core_release$annotations() {
        }

        private Companion() {
        }
    }
}

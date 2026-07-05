package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.shoppay.bridge.HandleClickRequest;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: HandleClickRequestJsonParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/shoppay/bridge/HandleClickRequest;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseEventData", "Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandleClickRequestJsonParser implements ModelJsonParser<HandleClickRequest> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_EVENT_DATA = "eventData";
    private static final String FIELD_EXPRESS_PAYMENT_TYPE = "expressPaymentType";

    @Inject
    public HandleClickRequestJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public HandleClickRequest parse(JSONObject json) {
        HandleClickRequest.EventData eventData;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_EVENT_DATA);
        if (jSONObjectOptJSONObject == null || (eventData = parseEventData(jSONObjectOptJSONObject)) == null) {
            return null;
        }
        return new HandleClickRequest(eventData);
    }

    private final HandleClickRequest.EventData parseEventData(JSONObject json) {
        String strOptString = StripeJsonUtils.optString(json, FIELD_EXPRESS_PAYMENT_TYPE);
        if (strOptString == null) {
            return null;
        }
        return new HandleClickRequest.EventData(strOptString);
    }

    /* compiled from: HandleClickRequestJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser$Companion;", "", "<init>", "()V", "FIELD_EVENT_DATA", "", "FIELD_EXPRESS_PAYMENT_TYPE", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

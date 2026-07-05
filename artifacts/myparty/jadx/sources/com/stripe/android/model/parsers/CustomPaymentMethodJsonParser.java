package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ElementsSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CustomPaymentMethodJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomPaymentMethodJsonParser implements ModelJsonParser<ElementsSession.CustomPaymentMethod> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FIELD_DISPLAY_NAME = "display_name";

    @Deprecated
    public static final String FIELD_ERROR = "error";

    @Deprecated
    public static final String FIELD_LOGO_URL = "logo_url";

    @Deprecated
    public static final String FIELD_TYPE = "type";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ElementsSession.CustomPaymentMethod parse(JSONObject json) {
        String strOptString;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString2 = StripeJsonUtils.optString(json, "type");
        if (strOptString2 == null) {
            return null;
        }
        String strOptString3 = StripeJsonUtils.optString(json, "error");
        if (strOptString3 != null) {
            return new ElementsSession.CustomPaymentMethod.Unavailable(strOptString2, strOptString3);
        }
        String strOptString4 = StripeJsonUtils.optString(json, FIELD_DISPLAY_NAME);
        if (strOptString4 == null || (strOptString = StripeJsonUtils.optString(json, FIELD_LOGO_URL)) == null) {
            return null;
        }
        return new ElementsSession.CustomPaymentMethod.Available(strOptString2, strOptString4, strOptString);
    }

    /* compiled from: CustomPaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/CustomPaymentMethodJsonParser$Companion;", "", "<init>", "()V", "FIELD_TYPE", "", "FIELD_DISPLAY_NAME", "FIELD_LOGO_URL", "FIELD_ERROR", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

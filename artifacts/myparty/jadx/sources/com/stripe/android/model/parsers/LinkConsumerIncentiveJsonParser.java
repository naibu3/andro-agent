package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.LinkConsumerIncentive;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LinkConsumerIncentiveJsonParser.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/LinkConsumerIncentive;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "buildIncentiveParams", "Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkConsumerIncentiveJsonParser implements ModelJsonParser<LinkConsumerIncentive> {
    public static final LinkConsumerIncentiveJsonParser INSTANCE = new LinkConsumerIncentiveJsonParser();

    private LinkConsumerIncentiveJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public LinkConsumerIncentive parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = json.getJSONObject("incentive_params");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        return new LinkConsumerIncentive(buildIncentiveParams(jSONObject), StripeJsonUtils.optString(json, "incentive_display_text"));
    }

    private final LinkConsumerIncentive.IncentiveParams buildIncentiveParams(JSONObject json) {
        String strOptString = json.optString("payment_method");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new LinkConsumerIncentive.IncentiveParams(strOptString);
    }
}

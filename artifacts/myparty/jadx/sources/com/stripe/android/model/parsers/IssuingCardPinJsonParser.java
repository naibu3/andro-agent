package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.IssuingCardPin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: IssuingCardPinJsonParser.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/IssuingCardPinJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/IssuingCardPin;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IssuingCardPinJsonParser implements ModelJsonParser<IssuingCardPin> {
    public static final int $stable = 0;

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public IssuingCardPin parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "pin");
        if (strOptString != null) {
            return new IssuingCardPin(strOptString);
        }
        return null;
    }
}

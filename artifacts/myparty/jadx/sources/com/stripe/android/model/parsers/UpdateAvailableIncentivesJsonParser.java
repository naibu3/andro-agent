package com.stripe.android.model.parsers;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.UpdateAvailableIncentives;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UpdateAvailableIncentivesJsonParser.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/UpdateAvailableIncentivesJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/UpdateAvailableIncentives;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateAvailableIncentivesJsonParser implements ModelJsonParser<UpdateAvailableIncentives> {
    public static final UpdateAvailableIncentivesJsonParser INSTANCE = new UpdateAvailableIncentivesJsonParser();

    private UpdateAvailableIncentivesJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public UpdateAvailableIncentives parse(JSONObject json) throws JSONException {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList2 = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                LinkConsumerIncentiveJsonParser linkConsumerIncentiveJsonParser = LinkConsumerIncentiveJsonParser.INSTANCE;
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                arrayList2.add(linkConsumerIncentiveJsonParser.parse(jSONObject));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return new UpdateAvailableIncentives(arrayList);
        }
        return null;
    }
}

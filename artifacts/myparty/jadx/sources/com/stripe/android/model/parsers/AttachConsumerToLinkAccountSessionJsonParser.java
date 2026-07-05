package com.stripe.android.model.parsers;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AttachConsumerToLinkAccountSessionJsonParser.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/AttachConsumerToLinkAccountSessionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AttachConsumerToLinkAccountSessionJsonParser implements ModelJsonParser<AttachConsumerToLinkAccountSession> {
    public static final AttachConsumerToLinkAccountSessionJsonParser INSTANCE = new AttachConsumerToLinkAccountSessionJsonParser();

    private AttachConsumerToLinkAccountSessionJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public AttachConsumerToLinkAccountSession parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = json.getString("client_secret");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new AttachConsumerToLinkAccountSession(string, string2);
    }
}

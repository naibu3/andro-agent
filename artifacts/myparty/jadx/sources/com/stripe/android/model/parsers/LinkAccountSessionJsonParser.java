package com.stripe.android.model.parsers;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.LinkAccountSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LinkAccountSessionJsonParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/LinkAccountSessionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/LinkAccountSession;", "<init>", "()V", "FIELD_ID", "", "FIELD_CLIENT_SECRET", "parse", "json", "Lorg/json/JSONObject;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountSessionJsonParser implements ModelJsonParser<LinkAccountSession> {
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    private static final String FIELD_ID = "id";
    public static final LinkAccountSessionJsonParser INSTANCE = new LinkAccountSessionJsonParser();

    private LinkAccountSessionJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public LinkAccountSession parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = json.getString("client_secret");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new LinkAccountSession(string, string2);
    }
}

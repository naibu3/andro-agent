package com.stripe.android.model.parsers;

import com.stripe.android.EphemeralKey;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EphemeralKeyJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/EphemeralKey;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EphemeralKeyJsonParser implements ModelJsonParser<EphemeralKey> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_ASSOCIATED_OBJECTS = "associated_objects";
    private static final String FIELD_CREATED = "created";
    private static final String FIELD_EXPIRES = "expires";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LIVEMODE = "livemode";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_SECRET = "secret";
    private static final String FIELD_TYPE = "type";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public EphemeralKey parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        long j = json.getLong("created");
        long j2 = json.getLong("expires");
        String string = json.getString("id");
        boolean z = json.getBoolean("livemode");
        String string2 = json.getString("object");
        String string3 = json.getString(FIELD_SECRET);
        JSONObject jSONObject = json.getJSONArray(FIELD_ASSOCIATED_OBJECTS).getJSONObject(0);
        String string4 = jSONObject.getString("type");
        String string5 = jSONObject.getString("id");
        Intrinsics.checkNotNull(string5);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string4);
        return new EphemeralKey(string5, j, j2, string, z, string2, string3, string4);
    }

    /* compiled from: EphemeralKeyJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser$Companion;", "", "<init>", "()V", "FIELD_CREATED", "", "FIELD_EXPIRES", "FIELD_SECRET", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_ID", "FIELD_ASSOCIATED_OBJECTS", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

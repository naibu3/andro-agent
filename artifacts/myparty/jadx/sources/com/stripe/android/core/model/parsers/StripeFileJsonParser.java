package com.stripe.android.core.model.parsers;

import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFilePurpose;
import com.stripe.android.core.model.StripeJsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: StripeFileJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/core/model/parsers/StripeFileJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/core/model/StripeFile;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeFileJsonParser implements ModelJsonParser<StripeFile> {
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_CREATED = "created";
    private static final String FIELD_FILENAME = "filename";
    private static final String FIELD_ID = "id";
    private static final String FIELD_PURPOSE = "purpose";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TITLE = "title";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_URL = "url";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeFile parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new StripeFile(StripeJsonUtils.optString(json, "id"), StripeJsonUtils.INSTANCE.optLong(json, "created"), StripeJsonUtils.optString(json, FIELD_FILENAME), StripeFilePurpose.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_PURPOSE)), StripeJsonUtils.INSTANCE.optInteger(json, FIELD_SIZE), StripeJsonUtils.optString(json, "title"), StripeJsonUtils.optString(json, "type"), StripeJsonUtils.optString(json, "url"));
    }

    /* compiled from: StripeFileJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/core/model/parsers/StripeFileJsonParser$Companion;", "", "<init>", "()V", "FIELD_ID", "", "FIELD_CREATED", "FIELD_FILENAME", "FIELD_PURPOSE", "FIELD_SIZE", "FIELD_TITLE", "FIELD_TYPE", "FIELD_URL", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

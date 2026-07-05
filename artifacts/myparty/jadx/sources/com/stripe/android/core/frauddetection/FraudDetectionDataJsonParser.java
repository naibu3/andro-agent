package com.stripe.android.core.frauddetection;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: FraudDetectionDataJsonParser.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/frauddetection/FraudDetectionDataJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "timestampSupplier", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FraudDetectionDataJsonParser implements ModelJsonParser<FraudDetectionData> {
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_GUID = "guid";
    private static final String FIELD_MUID = "muid";
    private static final String FIELD_SID = "sid";
    private final Function0<Long> timestampSupplier;

    public FraudDetectionDataJsonParser(Function0<Long> timestampSupplier) {
        Intrinsics.checkNotNullParameter(timestampSupplier, "timestampSupplier");
        this.timestampSupplier = timestampSupplier;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public FraudDetectionData parse(JSONObject json) {
        String strOptString;
        String strOptString2;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString3 = StripeJsonUtils.optString(json, FIELD_GUID);
        if (strOptString3 == null || (strOptString = StripeJsonUtils.optString(json, FIELD_MUID)) == null || (strOptString2 = StripeJsonUtils.optString(json, FIELD_SID)) == null) {
            return null;
        }
        return new FraudDetectionData(strOptString3, strOptString, strOptString2, this.timestampSupplier.invoke().longValue());
    }

    /* compiled from: FraudDetectionDataJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/core/frauddetection/FraudDetectionDataJsonParser$Companion;", "", "<init>", "()V", "FIELD_GUID", "", "FIELD_MUID", "FIELD_SID", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

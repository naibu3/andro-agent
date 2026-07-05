package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ShippingRateChangeRequestJsonParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0017\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;", "shippingRateParser", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "<init>", "(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShippingRateChangeRequestJsonParser implements ModelJsonParser<ShippingRateChangeRequest> {
    private static final String FIELD_SHIPPING_RATE = "shippingRate";
    private final ModelJsonParser<ECEShippingRate> shippingRateParser;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public ShippingRateChangeRequestJsonParser(ModelJsonParser<ECEShippingRate> shippingRateParser) {
        Intrinsics.checkNotNullParameter(shippingRateParser, "shippingRateParser");
        this.shippingRateParser = shippingRateParser;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ShippingRateChangeRequest parse(JSONObject json) {
        ECEShippingRate eCEShippingRate;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_SHIPPING_RATE);
        if (jSONObjectOptJSONObject == null || (eCEShippingRate = (ECEShippingRate) this.shippingRateParser.parse(jSONObjectOptJSONObject)) == null) {
            return null;
        }
        return new ShippingRateChangeRequest(eCEShippingRate);
    }

    /* compiled from: ShippingRateChangeRequestJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser$Companion;", "", "<init>", "()V", "FIELD_SHIPPING_RATE", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

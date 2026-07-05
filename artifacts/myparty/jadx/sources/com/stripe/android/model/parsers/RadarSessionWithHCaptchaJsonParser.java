package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarSessionWithHCaptchaJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RadarSessionWithHCaptchaJsonParser implements ModelJsonParser<RadarSessionWithHCaptcha> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_ID = "id";
    private static final String FIELD_PASSIVE_CAPTCHA_RQDATA = "passive_captcha_rqdata";
    private static final String FIELD_PASSIVE_CAPTCHA_SITE_KEY = "passive_captcha_site_key";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public RadarSessionWithHCaptcha parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "id");
        if (strOptString != null) {
            return new RadarSessionWithHCaptcha(strOptString, StripeJsonUtils.optString(json, FIELD_PASSIVE_CAPTCHA_SITE_KEY), StripeJsonUtils.optString(json, FIELD_PASSIVE_CAPTCHA_RQDATA));
        }
        return null;
    }

    /* compiled from: RadarSessionWithHCaptchaJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/RadarSessionWithHCaptchaJsonParser$Companion;", "", "<init>", "()V", "FIELD_ID", "", "FIELD_PASSIVE_CAPTCHA_SITE_KEY", "FIELD_PASSIVE_CAPTCHA_RQDATA", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

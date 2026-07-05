package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.WeChat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: WeChatJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/WeChat;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WeChatJsonParser implements ModelJsonParser<WeChat> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_APPID = "android_appId";
    private static final String FIELD_NONCE = "android_nonceStr";
    private static final String FIELD_PACKAGE = "android_package";
    private static final String FIELD_PARTNERID = "android_partnerId";
    private static final String FIELD_PREPAYID = "android_prepayId";
    private static final String FIELD_QR_CODE_URL = "qr_code_url";
    private static final String FIELD_SIGN = "android_sign";
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    private static final String FIELD_TIMESTAMP = "android_timeStamp";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public WeChat parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new WeChat(StripeJsonUtils.optString(json, FIELD_STATEMENT_DESCRIPTOR), StripeJsonUtils.optString(json, FIELD_APPID), StripeJsonUtils.optString(json, FIELD_NONCE), StripeJsonUtils.optString(json, FIELD_PACKAGE), StripeJsonUtils.optString(json, FIELD_PARTNERID), StripeJsonUtils.optString(json, FIELD_PREPAYID), StripeJsonUtils.optString(json, FIELD_SIGN), StripeJsonUtils.optString(json, FIELD_TIMESTAMP), StripeJsonUtils.optString(json, FIELD_QR_CODE_URL));
    }

    /* compiled from: WeChatJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser$Companion;", "", "<init>", "()V", "FIELD_APPID", "", "FIELD_NONCE", "FIELD_PACKAGE", "FIELD_PARTNERID", "FIELD_PREPAYID", "FIELD_SIGN", "FIELD_TIMESTAMP", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_QR_CODE_URL", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

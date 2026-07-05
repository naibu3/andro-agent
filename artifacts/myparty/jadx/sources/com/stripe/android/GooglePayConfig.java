package com.stripe.android;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.ApiKeyValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayConfig.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0012\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/GooglePayConfig;", "", "publishableKey", "", "connectedAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "(Lcom/stripe/android/PaymentConfiguration;)V", "validPublishableKey", "sdkVersion", "tokenizationSpecification", "Lorg/json/JSONObject;", "getTokenizationSpecification", "()Lorg/json/JSONObject;", SDKConstants.PARAM_KEY, "getKey", "()Ljava/lang/String;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayConfig {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String USER_AGENT = "StripeAndroid";
    private final String connectedAccountId;
    private final String sdkVersion;
    private final String validPublishableKey;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GooglePayConfig(String publishableKey) {
        this(publishableKey, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    public GooglePayConfig(String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.connectedAccountId = str;
        this.validPublishableKey = ApiKeyValidator.INSTANCE.get().requireValid(publishableKey);
        this.sdkVersion = "21.22.2";
    }

    public /* synthetic */ GooglePayConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final JSONObject getTokenizationSpecification() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + this.sdkVersion).put("stripe:publishableKey", getKey()));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    private final String getKey() {
        String str = this.connectedAccountId;
        if (str != null) {
            String str2 = this.validPublishableKey + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.validPublishableKey;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayConfig(Context context) {
        this(PaymentConfiguration.INSTANCE.getInstance(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private GooglePayConfig(PaymentConfiguration paymentConfiguration) {
        this(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId());
    }

    /* compiled from: GooglePayConfig.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/GooglePayConfig$Companion;", "", "<init>", "()V", "USER_AGENT", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

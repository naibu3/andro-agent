package com.stripe.android.model.parsers;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrder;
import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.WeChat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: SourceJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "RedirectJsonParser", "CodeVerificationJsonParser", "ReceiverJsonParser", "OwnerJsonParser", "KlarnaJsonParser", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SourceJsonParser implements ModelJsonParser<Source> {
    public static final int $stable = 0;
    private static final String FIELD_AMOUNT = "amount";
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    private static final String FIELD_CODE_VERIFICATION = "code_verification";
    private static final String FIELD_CREATED = "created";
    private static final String FIELD_CURRENCY = "currency";
    private static final String FIELD_FLOW = "flow";
    private static final String FIELD_ID = "id";
    private static final String FIELD_KLARNA = "klarna";
    private static final String FIELD_LIVEMODE = "livemode";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_OWNER = "owner";
    private static final String FIELD_RECEIVER = "receiver";
    private static final String FIELD_REDIRECT = "redirect";
    private static final String FIELD_SOURCE_ORDER = "source_order";
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_USAGE = "usage";
    private static final String FIELD_WECHAT = "wechat";
    private static final String VALUE_CARD = "card";
    private static final String VALUE_SOURCE = "source";
    private static final Companion Companion = new Companion(null);
    private static final Set<String> MODELED_TYPES = SetsKt.setOf((Object[]) new String[]{"card", "sepa_debit"});

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Source parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = json.optString("object");
        if (!Intrinsics.areEqual(strOptString, "card")) {
            if (Intrinsics.areEqual(strOptString, "source")) {
                return Companion.fromSourceJson(json);
            }
            return null;
        }
        return Companion.fromCardJson(json);
    }

    /* compiled from: SourceJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Redirect;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RedirectJsonParser implements ModelJsonParser<Source.Redirect> {
        public static final int $stable = 0;
        private static final String FIELD_RETURN_URL = "return_url";
        private static final String FIELD_STATUS = "status";
        private static final String FIELD_URL = "url";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Redirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.Redirect(StripeJsonUtils.optString(json, "return_url"), Source.Redirect.Status.INSTANCE.fromCode(StripeJsonUtils.optString(json, "status")), StripeJsonUtils.optString(json, "url"));
        }
    }

    /* compiled from: SourceJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$CodeVerification;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CodeVerificationJsonParser implements ModelJsonParser<Source.CodeVerification> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ATTEMPTS_REMAINING = "attempts_remaining";
        private static final String FIELD_STATUS = "status";
        private static final int INVALID_ATTEMPTS_REMAINING = -1;

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.CodeVerification parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.CodeVerification(json.optInt(FIELD_ATTEMPTS_REMAINING, -1), Source.CodeVerification.Status.INSTANCE.fromCode(StripeJsonUtils.optString(json, "status")));
        }

        /* compiled from: SourceJsonParser.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser$Companion;", "", "<init>", "()V", "FIELD_ATTEMPTS_REMAINING", "", "FIELD_STATUS", "INVALID_ATTEMPTS_REMAINING", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SourceJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Receiver;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReceiverJsonParser implements ModelJsonParser<Source.Receiver> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ADDRESS = "address";
        private static final String FIELD_AMOUNT_CHARGED = "amount_charged";
        private static final String FIELD_AMOUNT_RECEIVED = "amount_received";
        private static final String FIELD_AMOUNT_RETURNED = "amount_returned";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Receiver parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.Receiver(StripeJsonUtils.optString(json, "address"), json.optLong(FIELD_AMOUNT_CHARGED), json.optLong(FIELD_AMOUNT_RECEIVED), json.optLong(FIELD_AMOUNT_RETURNED));
        }

        /* compiled from: SourceJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser$Companion;", "", "<init>", "()V", "FIELD_ADDRESS", "", "FIELD_AMOUNT_CHARGED", "FIELD_AMOUNT_RECEIVED", "FIELD_AMOUNT_RETURNED", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SourceJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Owner;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OwnerJsonParser implements ModelJsonParser<Source.Owner> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ADDRESS = "address";
        private static final String FIELD_EMAIL = "email";
        private static final String FIELD_NAME = "name";
        private static final String FIELD_PHONE = "phone";
        private static final String FIELD_VERIFIED_ADDRESS = "verified_address";
        private static final String FIELD_VERIFIED_EMAIL = "verified_email";
        private static final String FIELD_VERIFIED_NAME = "verified_name";
        private static final String FIELD_VERIFIED_PHONE = "verified_phone";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Owner parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("address");
            Address address = jSONObjectOptJSONObject != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject) : null;
            String strOptString = StripeJsonUtils.optString(json, "email");
            String strOptString2 = StripeJsonUtils.optString(json, "name");
            String strOptString3 = StripeJsonUtils.optString(json, "phone");
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_VERIFIED_ADDRESS);
            return new Source.Owner(address, strOptString, strOptString2, strOptString3, jSONObjectOptJSONObject2 != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject2) : null, StripeJsonUtils.optString(json, FIELD_VERIFIED_EMAIL), StripeJsonUtils.optString(json, FIELD_VERIFIED_NAME), StripeJsonUtils.optString(json, FIELD_VERIFIED_PHONE));
        }

        /* compiled from: SourceJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser$Companion;", "", "<init>", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "FIELD_VERIFIED_ADDRESS", "FIELD_VERIFIED_EMAIL", "FIELD_VERIFIED_NAME", "FIELD_VERIFIED_PHONE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SourceJsonParser.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Klarna;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseSet", "", "", SDKConstants.PARAM_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KlarnaJsonParser implements ModelJsonParser<Source.Klarna> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_CLIENT_TOKEN = "client_token";
        private static final String FIELD_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
        private static final String FIELD_FIRST_NAME = "first_name";
        private static final String FIELD_LAST_NAME = "last_name";
        private static final String FIELD_PAYMENT_METHOD_CATEGORIES = "payment_method_categories";
        private static final String FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE = "pay_later_asset_urls_descriptive";
        private static final String FIELD_PAY_LATER_ASSET_URLS_STANDARD = "pay_later_asset_urls_standard";
        private static final String FIELD_PAY_LATER_NAME = "pay_later_name";
        private static final String FIELD_PAY_LATER_REDIRECT_URL = "pay_later_redirect_url";
        private static final String FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE = "pay_now_asset_urls_descriptive";
        private static final String FIELD_PAY_NOW_ASSET_URLS_STANDARD = "pay_now_asset_urls_standard";
        private static final String FIELD_PAY_NOW_NAME = "pay_now_name";
        private static final String FIELD_PAY_NOW_REDIRECT_URL = "pay_now_redirect_url";
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE = "pay_over_time_asset_urls_descriptive";
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD = "pay_over_time_asset_urls_standard";
        private static final String FIELD_PAY_OVER_TIME_NAME = "pay_over_time_name";
        private static final String FIELD_PAY_OVER_TIME_REDIRECT_URL = "pay_over_time_redirect_url";
        private static final String FIELD_PURCHASE_COUNTRY = "purchase_country";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Klarna parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.Klarna(StripeJsonUtils.optString(json, FIELD_FIRST_NAME), StripeJsonUtils.optString(json, FIELD_LAST_NAME), StripeJsonUtils.optString(json, FIELD_PURCHASE_COUNTRY), StripeJsonUtils.optString(json, FIELD_CLIENT_TOKEN), StripeJsonUtils.optString(json, FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_NOW_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_NOW_NAME), StripeJsonUtils.optString(json, FIELD_PAY_NOW_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_LATER_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_LATER_NAME), StripeJsonUtils.optString(json, FIELD_PAY_LATER_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_NAME), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_REDIRECT_URL), parseSet(json, FIELD_PAYMENT_METHOD_CATEGORIES), parseSet(json, "custom_payment_methods"));
        }

        private final Set<String> parseSet(JSONObject json, String key) {
            List listSplit$default;
            String strOptString = StripeJsonUtils.optString(json, key);
            Set<String> set = (strOptString == null || (listSplit$default = StringsKt.split$default((CharSequence) strOptString, new String[]{","}, false, 0, 6, (Object) null)) == null) ? null : CollectionsKt.toSet(listSplit$default);
            return set == null ? SetsKt.emptySet() : set;
        }

        /* compiled from: SourceJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser$Companion;", "", "<init>", "()V", "FIELD_FIRST_NAME", "", "FIELD_LAST_NAME", "FIELD_PURCHASE_COUNTRY", "FIELD_CLIENT_TOKEN", "FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_LATER_ASSET_URLS_STANDARD", "FIELD_PAY_LATER_NAME", "FIELD_PAY_LATER_REDIRECT_URL", "FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_NOW_ASSET_URLS_STANDARD", "FIELD_PAY_NOW_NAME", "FIELD_PAY_NOW_REDIRECT_URL", "FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD", "FIELD_PAY_OVER_TIME_NAME", "FIELD_PAY_OVER_TIME_REDIRECT_URL", "FIELD_PAYMENT_METHOD_CATEGORIES", "FIELD_CUSTOM_PAYMENT_METHODS", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SourceJsonParser.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J.\u0010!\u001a\u0004\u0018\u0001H\"\"\n\b\u0000\u0010\"\u0018\u0001*\u00020#2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010$\u001a\u00020\u0005H\u0082\b¢\u0006\u0002\u0010%J\u0012\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;", "", "<init>", "()V", "VALUE_SOURCE", "", "VALUE_CARD", "MODELED_TYPES", "", "FIELD_ID", "FIELD_OBJECT", "FIELD_AMOUNT", "FIELD_CLIENT_SECRET", "FIELD_CODE_VERIFICATION", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_FLOW", "FIELD_LIVEMODE", "FIELD_OWNER", "FIELD_RECEIVER", "FIELD_REDIRECT", "FIELD_SOURCE_ORDER", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_STATUS", "FIELD_TYPE", "FIELD_USAGE", "FIELD_WECHAT", "FIELD_KLARNA", "fromCardJson", "Lcom/stripe/android/model/Source;", "jsonObject", "Lorg/json/JSONObject;", "fromSourceJson", "optStripeJsonModel", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/core/model/StripeModel;", SDKConstants.PARAM_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeModel;", "asSourceType", "sourceType", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Source fromCardJson(JSONObject jsonObject) {
            return new Source(StripeJsonUtils.optString(jsonObject, "id"), null, null, null, null, null, null, null, null, null, null, null, null, new SourceCardDataJsonParser().parse(jsonObject), "card", "card", null, null, null, null, null, 2039806, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x02d1 A[PHI: r20 r21
          0x02d1: PHI (r20v10 com.stripe.android.model.Source$Flow) = 
          (r20v2 com.stripe.android.model.Source$Flow)
          (r20v3 com.stripe.android.model.Source$Flow)
          (r20v4 com.stripe.android.model.Source$Flow)
          (r20v5 com.stripe.android.model.Source$Flow)
          (r20v6 com.stripe.android.model.Source$Flow)
          (r20v11 com.stripe.android.model.Source$Flow)
         binds: [B:174:0x02ba, B:166:0x029b, B:158:0x027c, B:150:0x025c, B:142:0x023b, B:132:0x020d] A[DONT_GENERATE, DONT_INLINE]
          0x02d1: PHI (r21v7 boolean) = (r21v0 boolean), (r21v1 boolean), (r21v2 boolean), (r21v3 boolean), (r21v4 boolean), (r21v8 boolean) binds: [B:174:0x02ba, B:166:0x029b, B:158:0x027c, B:150:0x025c, B:142:0x023b, B:132:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:240:0x03a5 A[PHI: r22
          0x03a5: PHI (r22v7 com.stripe.android.model.Source$Owner) = 
          (r22v0 com.stripe.android.model.Source$Owner)
          (r22v1 com.stripe.android.model.Source$Owner)
          (r22v2 com.stripe.android.model.Source$Owner)
          (r22v3 com.stripe.android.model.Source$Owner)
          (r22v4 com.stripe.android.model.Source$Owner)
          (r22v8 com.stripe.android.model.Source$Owner)
         binds: [B:233:0x038e, B:225:0x0371, B:217:0x0354, B:209:0x0336, B:201:0x0317, B:191:0x02ef] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:299:0x046a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Source fromSourceJson(JSONObject jsonObject) {
            SourceTypeModel sourceTypeModel;
            Source.Receiver receiver;
            Source.CodeVerification codeVerification;
            Source.Flow flow;
            boolean z;
            Parcelable parcelable;
            Source.Owner owner;
            Source.Owner owner2;
            Parcelable parcelable2;
            Source.Receiver receiver2;
            Source.Receiver receiver3;
            Source.Redirect redirect;
            WeChat weChat;
            Source.Klarna klarna;
            Source.Receiver receiver4;
            SourceTypeModel sourceTypeModel2;
            String strOptString = StripeJsonUtils.optString(jsonObject, "type");
            if (strOptString == null) {
                strOptString = "unknown";
            }
            String strAsSourceType = asSourceType(strOptString);
            Map mapJsonObjectToMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(jsonObject.optJSONObject(strOptString));
            if (SourceJsonParser.MODELED_TYPES.contains(strOptString)) {
                if (jsonObject.has(strOptString)) {
                    switch (strOptString.hashCode()) {
                        case -808719889:
                            if (!strOptString.equals("receiver")) {
                                receiver4 = null;
                                break;
                            } else {
                                JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("receiver");
                                receiver4 = jSONObjectOptJSONObject != null ? new ReceiverJsonParser().parse(jSONObjectOptJSONObject) : null;
                                break;
                            }
                        case -776144932:
                            if (strOptString.equals(SourceJsonParser.FIELD_REDIRECT)) {
                                JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject(SourceJsonParser.FIELD_REDIRECT);
                                receiver4 = jSONObjectOptJSONObject2 != null ? new RedirectJsonParser().parse(jSONObjectOptJSONObject2) : null;
                                break;
                            }
                            break;
                        case 3046160:
                            if (strOptString.equals("card")) {
                                JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject("card");
                                receiver4 = jSONObjectOptJSONObject3 != null ? new SourceCardDataJsonParser().parse(jSONObjectOptJSONObject3) : null;
                                break;
                            }
                            break;
                        case 106164915:
                            if (strOptString.equals(SourceJsonParser.FIELD_OWNER)) {
                                JSONObject jSONObjectOptJSONObject4 = jsonObject.optJSONObject(SourceJsonParser.FIELD_OWNER);
                                receiver4 = jSONObjectOptJSONObject4 != null ? new OwnerJsonParser().parse(jSONObjectOptJSONObject4) : null;
                                break;
                            }
                            break;
                        case 1615551277:
                            if (strOptString.equals(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                                JSONObject jSONObjectOptJSONObject5 = jsonObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION);
                                receiver4 = jSONObjectOptJSONObject5 != null ? new CodeVerificationJsonParser().parse(jSONObjectOptJSONObject5) : null;
                                break;
                            }
                            break;
                        case 1636477296:
                            if (strOptString.equals("sepa_debit")) {
                                JSONObject jSONObjectOptJSONObject6 = jsonObject.optJSONObject("sepa_debit");
                                receiver4 = jSONObjectOptJSONObject6 != null ? new SourceSepaDebitDataJsonParser().parse(jSONObjectOptJSONObject6) : null;
                                break;
                            }
                            break;
                    }
                    if (!(receiver4 instanceof SourceTypeModel)) {
                        receiver4 = null;
                    }
                    sourceTypeModel2 = (SourceTypeModel) receiver4;
                } else {
                    sourceTypeModel2 = null;
                }
                sourceTypeModel = sourceTypeModel2;
            } else {
                sourceTypeModel = null;
            }
            String strOptString2 = StripeJsonUtils.optString(jsonObject, "id");
            Long lOptLong = StripeJsonUtils.INSTANCE.optLong(jsonObject, "amount");
            String strOptString3 = StripeJsonUtils.optString(jsonObject, "client_secret");
            if (jsonObject.has(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                switch (SourceJsonParser.FIELD_CODE_VERIFICATION.hashCode()) {
                    case -808719889:
                        if (!SourceJsonParser.FIELD_CODE_VERIFICATION.equals("receiver")) {
                            receiver = null;
                            break;
                        } else {
                            JSONObject jSONObjectOptJSONObject7 = jsonObject.optJSONObject("receiver");
                            receiver = jSONObjectOptJSONObject7 != null ? new ReceiverJsonParser().parse(jSONObjectOptJSONObject7) : null;
                            break;
                        }
                    case -776144932:
                        if (SourceJsonParser.FIELD_CODE_VERIFICATION.equals(SourceJsonParser.FIELD_REDIRECT)) {
                            JSONObject jSONObjectOptJSONObject8 = jsonObject.optJSONObject(SourceJsonParser.FIELD_REDIRECT);
                            receiver = jSONObjectOptJSONObject8 != null ? new RedirectJsonParser().parse(jSONObjectOptJSONObject8) : null;
                            break;
                        }
                        break;
                    case 3046160:
                        if (SourceJsonParser.FIELD_CODE_VERIFICATION.equals("card")) {
                            JSONObject jSONObjectOptJSONObject9 = jsonObject.optJSONObject("card");
                            receiver = jSONObjectOptJSONObject9 != null ? new SourceCardDataJsonParser().parse(jSONObjectOptJSONObject9) : null;
                            break;
                        }
                        break;
                    case 106164915:
                        if (SourceJsonParser.FIELD_CODE_VERIFICATION.equals(SourceJsonParser.FIELD_OWNER)) {
                            JSONObject jSONObjectOptJSONObject10 = jsonObject.optJSONObject(SourceJsonParser.FIELD_OWNER);
                            receiver = jSONObjectOptJSONObject10 != null ? new OwnerJsonParser().parse(jSONObjectOptJSONObject10) : null;
                            break;
                        }
                        break;
                    case 1615551277:
                        if (SourceJsonParser.FIELD_CODE_VERIFICATION.equals(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                            JSONObject jSONObjectOptJSONObject11 = jsonObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION);
                            receiver = jSONObjectOptJSONObject11 != null ? new CodeVerificationJsonParser().parse(jSONObjectOptJSONObject11) : null;
                            break;
                        }
                        break;
                    case 1636477296:
                        if (SourceJsonParser.FIELD_CODE_VERIFICATION.equals("sepa_debit")) {
                            JSONObject jSONObjectOptJSONObject12 = jsonObject.optJSONObject("sepa_debit");
                            receiver = jSONObjectOptJSONObject12 != null ? new SourceSepaDebitDataJsonParser().parse(jSONObjectOptJSONObject12) : null;
                            break;
                        }
                        break;
                }
                if (!(receiver instanceof Source.CodeVerification)) {
                    receiver = null;
                }
                codeVerification = (Source.CodeVerification) receiver;
            } else {
                codeVerification = null;
            }
            Source.CodeVerification codeVerification2 = codeVerification;
            String str = strOptString;
            Long lOptLong2 = StripeJsonUtils.INSTANCE.optLong(jsonObject, "created");
            String strOptString4 = StripeJsonUtils.optString(jsonObject, "currency");
            Source.Flow flowFromCode = Source.Flow.INSTANCE.fromCode(StripeJsonUtils.optString(jsonObject, SourceJsonParser.FIELD_FLOW));
            boolean zOptBoolean = jsonObject.optBoolean("livemode");
            if (jsonObject.has(SourceJsonParser.FIELD_OWNER)) {
                switch (SourceJsonParser.FIELD_OWNER.hashCode()) {
                    case -808719889:
                        flow = flowFromCode;
                        z = zOptBoolean;
                        if (!SourceJsonParser.FIELD_OWNER.equals("receiver")) {
                            parcelable = null;
                            break;
                        } else {
                            JSONObject jSONObjectOptJSONObject13 = jsonObject.optJSONObject("receiver");
                            parcelable = (StripeModel) (jSONObjectOptJSONObject13 != null ? new ReceiverJsonParser().parse(jSONObjectOptJSONObject13) : null);
                            break;
                        }
                    case -776144932:
                        flow = flowFromCode;
                        z = zOptBoolean;
                        if (SourceJsonParser.FIELD_OWNER.equals(SourceJsonParser.FIELD_REDIRECT)) {
                            JSONObject jSONObjectOptJSONObject14 = jsonObject.optJSONObject(SourceJsonParser.FIELD_REDIRECT);
                            parcelable = (StripeModel) (jSONObjectOptJSONObject14 != null ? new RedirectJsonParser().parse(jSONObjectOptJSONObject14) : null);
                            break;
                        }
                        break;
                    case 3046160:
                        flow = flowFromCode;
                        z = zOptBoolean;
                        if (SourceJsonParser.FIELD_OWNER.equals("card")) {
                            JSONObject jSONObjectOptJSONObject15 = jsonObject.optJSONObject("card");
                            parcelable = (StripeModel) (jSONObjectOptJSONObject15 != null ? new SourceCardDataJsonParser().parse(jSONObjectOptJSONObject15) : null);
                            break;
                        }
                        break;
                    case 106164915:
                        flow = flowFromCode;
                        z = zOptBoolean;
                        if (SourceJsonParser.FIELD_OWNER.equals(SourceJsonParser.FIELD_OWNER)) {
                            JSONObject jSONObjectOptJSONObject16 = jsonObject.optJSONObject(SourceJsonParser.FIELD_OWNER);
                            parcelable = (StripeModel) (jSONObjectOptJSONObject16 != null ? new OwnerJsonParser().parse(jSONObjectOptJSONObject16) : null);
                            break;
                        }
                        break;
                    case 1615551277:
                        flow = flowFromCode;
                        z = zOptBoolean;
                        if (SourceJsonParser.FIELD_OWNER.equals(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                            JSONObject jSONObjectOptJSONObject17 = jsonObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION);
                            parcelable = (StripeModel) (jSONObjectOptJSONObject17 != null ? new CodeVerificationJsonParser().parse(jSONObjectOptJSONObject17) : null);
                            break;
                        }
                        break;
                    case 1636477296:
                        if (SourceJsonParser.FIELD_OWNER.equals("sepa_debit")) {
                            flow = flowFromCode;
                            JSONObject jSONObjectOptJSONObject18 = jsonObject.optJSONObject("sepa_debit");
                            z = zOptBoolean;
                            parcelable = (StripeModel) (jSONObjectOptJSONObject18 != null ? new SourceSepaDebitDataJsonParser().parse(jSONObjectOptJSONObject18) : null);
                            break;
                        }
                    default:
                        flow = flowFromCode;
                        z = zOptBoolean;
                        parcelable = null;
                        break;
                }
                if (!(parcelable instanceof Source.Owner)) {
                    parcelable = null;
                }
                owner = (Source.Owner) parcelable;
            } else {
                flow = flowFromCode;
                z = zOptBoolean;
                owner = null;
            }
            Source.Owner owner3 = owner;
            if (jsonObject.has("receiver")) {
                switch ("receiver".hashCode()) {
                    case -808719889:
                        owner2 = owner3;
                        if (!"receiver".equals("receiver")) {
                            parcelable2 = null;
                            break;
                        } else {
                            JSONObject jSONObjectOptJSONObject19 = jsonObject.optJSONObject("receiver");
                            parcelable2 = (StripeModel) (jSONObjectOptJSONObject19 != null ? new ReceiverJsonParser().parse(jSONObjectOptJSONObject19) : null);
                            break;
                        }
                    case -776144932:
                        owner2 = owner3;
                        if ("receiver".equals(SourceJsonParser.FIELD_REDIRECT)) {
                            JSONObject jSONObjectOptJSONObject20 = jsonObject.optJSONObject(SourceJsonParser.FIELD_REDIRECT);
                            parcelable2 = (StripeModel) (jSONObjectOptJSONObject20 != null ? new RedirectJsonParser().parse(jSONObjectOptJSONObject20) : null);
                            break;
                        }
                        break;
                    case 3046160:
                        owner2 = owner3;
                        if ("receiver".equals("card")) {
                            JSONObject jSONObjectOptJSONObject21 = jsonObject.optJSONObject("card");
                            parcelable2 = (StripeModel) (jSONObjectOptJSONObject21 != null ? new SourceCardDataJsonParser().parse(jSONObjectOptJSONObject21) : null);
                            break;
                        }
                        break;
                    case 106164915:
                        owner2 = owner3;
                        if ("receiver".equals(SourceJsonParser.FIELD_OWNER)) {
                            JSONObject jSONObjectOptJSONObject22 = jsonObject.optJSONObject(SourceJsonParser.FIELD_OWNER);
                            parcelable2 = (StripeModel) (jSONObjectOptJSONObject22 != null ? new OwnerJsonParser().parse(jSONObjectOptJSONObject22) : null);
                            break;
                        }
                        break;
                    case 1615551277:
                        owner2 = owner3;
                        if ("receiver".equals(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                            JSONObject jSONObjectOptJSONObject23 = jsonObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION);
                            parcelable2 = (StripeModel) (jSONObjectOptJSONObject23 != null ? new CodeVerificationJsonParser().parse(jSONObjectOptJSONObject23) : null);
                            break;
                        }
                        break;
                    case 1636477296:
                        if ("receiver".equals("sepa_debit")) {
                            JSONObject jSONObjectOptJSONObject24 = jsonObject.optJSONObject("sepa_debit");
                            owner2 = owner3;
                            parcelable2 = (StripeModel) (jSONObjectOptJSONObject24 != null ? new SourceSepaDebitDataJsonParser().parse(jSONObjectOptJSONObject24) : null);
                            break;
                        }
                    default:
                        owner2 = owner3;
                        parcelable2 = null;
                        break;
                }
                if (!(parcelable2 instanceof Source.Receiver)) {
                    parcelable2 = null;
                }
                receiver2 = (Source.Receiver) parcelable2;
            } else {
                owner2 = owner3;
                receiver2 = null;
            }
            Source.Receiver receiver5 = receiver2;
            if (jsonObject.has(SourceJsonParser.FIELD_REDIRECT)) {
                switch (SourceJsonParser.FIELD_REDIRECT.hashCode()) {
                    case -808719889:
                        if (!SourceJsonParser.FIELD_REDIRECT.equals("receiver")) {
                            receiver3 = null;
                            break;
                        } else {
                            JSONObject jSONObjectOptJSONObject25 = jsonObject.optJSONObject("receiver");
                            receiver3 = jSONObjectOptJSONObject25 != null ? new ReceiverJsonParser().parse(jSONObjectOptJSONObject25) : null;
                            break;
                        }
                    case -776144932:
                        if (SourceJsonParser.FIELD_REDIRECT.equals(SourceJsonParser.FIELD_REDIRECT)) {
                            JSONObject jSONObjectOptJSONObject26 = jsonObject.optJSONObject(SourceJsonParser.FIELD_REDIRECT);
                            receiver3 = jSONObjectOptJSONObject26 != null ? new RedirectJsonParser().parse(jSONObjectOptJSONObject26) : null;
                            break;
                        }
                        break;
                    case 3046160:
                        if (SourceJsonParser.FIELD_REDIRECT.equals("card")) {
                            JSONObject jSONObjectOptJSONObject27 = jsonObject.optJSONObject("card");
                            receiver3 = jSONObjectOptJSONObject27 != null ? new SourceCardDataJsonParser().parse(jSONObjectOptJSONObject27) : null;
                            break;
                        }
                        break;
                    case 106164915:
                        if (SourceJsonParser.FIELD_REDIRECT.equals(SourceJsonParser.FIELD_OWNER)) {
                            JSONObject jSONObjectOptJSONObject28 = jsonObject.optJSONObject(SourceJsonParser.FIELD_OWNER);
                            receiver3 = jSONObjectOptJSONObject28 != null ? new OwnerJsonParser().parse(jSONObjectOptJSONObject28) : null;
                            break;
                        }
                        break;
                    case 1615551277:
                        if (SourceJsonParser.FIELD_REDIRECT.equals(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                            JSONObject jSONObjectOptJSONObject29 = jsonObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION);
                            receiver3 = jSONObjectOptJSONObject29 != null ? new CodeVerificationJsonParser().parse(jSONObjectOptJSONObject29) : null;
                            break;
                        }
                        break;
                    case 1636477296:
                        if (SourceJsonParser.FIELD_REDIRECT.equals("sepa_debit")) {
                            JSONObject jSONObjectOptJSONObject30 = jsonObject.optJSONObject("sepa_debit");
                            receiver3 = jSONObjectOptJSONObject30 != null ? new SourceSepaDebitDataJsonParser().parse(jSONObjectOptJSONObject30) : null;
                            break;
                        }
                        break;
                }
                if (!(receiver3 instanceof Source.Redirect)) {
                    receiver3 = null;
                }
                redirect = (Source.Redirect) receiver3;
            } else {
                redirect = null;
            }
            Source.Redirect redirect2 = redirect;
            JSONObject jSONObjectOptJSONObject31 = jsonObject.optJSONObject(SourceJsonParser.FIELD_SOURCE_ORDER);
            SourceOrder sourceOrder = jSONObjectOptJSONObject31 != null ? new SourceOrderJsonParser().parse(jSONObjectOptJSONObject31) : null;
            String strOptString5 = StripeJsonUtils.optString(jsonObject, SourceJsonParser.FIELD_STATEMENT_DESCRIPTOR);
            Source.Status statusFromCode = Source.Status.INSTANCE.fromCode(StripeJsonUtils.optString(jsonObject, "status"));
            Source.Usage usageFromCode = Source.Usage.INSTANCE.fromCode(StripeJsonUtils.optString(jsonObject, "usage"));
            if (Intrinsics.areEqual("wechat", strAsSourceType)) {
                WeChatJsonParser weChatJsonParser = new WeChatJsonParser();
                JSONObject jSONObjectOptJSONObject32 = jsonObject.optJSONObject("wechat");
                if (jSONObjectOptJSONObject32 == null) {
                    jSONObjectOptJSONObject32 = new JSONObject();
                }
                weChat = weChatJsonParser.parse(jSONObjectOptJSONObject32);
            } else {
                weChat = null;
            }
            if (Intrinsics.areEqual("klarna", strAsSourceType)) {
                KlarnaJsonParser klarnaJsonParser = new KlarnaJsonParser();
                JSONObject jSONObjectOptJSONObject33 = jsonObject.optJSONObject("klarna");
                if (jSONObjectOptJSONObject33 == null) {
                    jSONObjectOptJSONObject33 = new JSONObject();
                }
                klarna = klarnaJsonParser.parse(jSONObjectOptJSONObject33);
            } else {
                klarna = null;
            }
            return new Source(strOptString2, lOptLong, strOptString3, codeVerification2, lOptLong2, strOptString4, flow, Boolean.valueOf(z), owner2, receiver5, redirect2, statusFromCode, mapJsonObjectToMap, sourceTypeModel, strAsSourceType, str, usageFromCode, weChat, klarna, sourceOrder, strOptString5);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final /* synthetic */ <T extends StripeModel> T optStripeJsonModel(JSONObject jsonObject, String key) {
            T t = null;
            if (!jsonObject.has(key)) {
                return null;
            }
            switch (key.hashCode()) {
                case -808719889:
                    if (!key.equals("receiver")) {
                        break;
                    } else {
                        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("receiver");
                        if (jSONObjectOptJSONObject != null) {
                            t = new ReceiverJsonParser().parse(jSONObjectOptJSONObject);
                        }
                        t = t;
                        break;
                    }
                case -776144932:
                    if (key.equals(SourceJsonParser.FIELD_REDIRECT)) {
                        JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject(SourceJsonParser.FIELD_REDIRECT);
                        if (jSONObjectOptJSONObject2 != null) {
                            t = new RedirectJsonParser().parse(jSONObjectOptJSONObject2);
                        }
                        t = t;
                        break;
                    }
                    break;
                case 3046160:
                    if (key.equals("card")) {
                        JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject("card");
                        if (jSONObjectOptJSONObject3 != null) {
                            t = new SourceCardDataJsonParser().parse(jSONObjectOptJSONObject3);
                        }
                        t = t;
                        break;
                    }
                    break;
                case 106164915:
                    if (key.equals(SourceJsonParser.FIELD_OWNER)) {
                        JSONObject jSONObjectOptJSONObject4 = jsonObject.optJSONObject(SourceJsonParser.FIELD_OWNER);
                        if (jSONObjectOptJSONObject4 != null) {
                            t = new OwnerJsonParser().parse(jSONObjectOptJSONObject4);
                        }
                        t = t;
                        break;
                    }
                    break;
                case 1615551277:
                    if (key.equals(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                        JSONObject jSONObjectOptJSONObject5 = jsonObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION);
                        if (jSONObjectOptJSONObject5 != null) {
                            t = new CodeVerificationJsonParser().parse(jSONObjectOptJSONObject5);
                        }
                        t = t;
                        break;
                    }
                    break;
                case 1636477296:
                    if (key.equals("sepa_debit")) {
                        JSONObject jSONObjectOptJSONObject6 = jsonObject.optJSONObject("sepa_debit");
                        if (jSONObjectOptJSONObject6 != null) {
                            t = new SourceSepaDebitDataJsonParser().parse(jSONObjectOptJSONObject6);
                        }
                        t = t;
                        break;
                    }
                    break;
            }
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            return t;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        private final String asSourceType(String sourceType) {
            if (sourceType != null) {
                switch (sourceType.hashCode()) {
                    case -1920743119:
                        if (sourceType.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (sourceType.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -1128905083:
                        if (sourceType.equals("klarna")) {
                            return "klarna";
                        }
                        break;
                    case -896955097:
                        if (sourceType.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (sourceType.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (sourceType.equals("wechat")) {
                            return "wechat";
                        }
                        break;
                    case -284840886:
                        sourceType.equals("unknown");
                        break;
                    case 100648:
                        if (sourceType.equals("eps")) {
                            return "eps";
                        }
                        break;
                    case 109234:
                        if (sourceType.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (sourceType.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (sourceType.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (sourceType.equals("ideal")) {
                            return "ideal";
                        }
                        break;
                    case 1251821346:
                        if (sourceType.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (sourceType.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }
    }
}

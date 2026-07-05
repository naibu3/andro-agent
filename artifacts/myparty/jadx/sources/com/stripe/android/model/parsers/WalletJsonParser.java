package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.wallets.Wallet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: WalletJsonParser.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/WalletJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/wallets/Wallet;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseMasterpassWallet", "Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "parseVisaCheckoutWallet", "Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "dynamicLast4", "", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletJsonParser implements ModelJsonParser<Wallet> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_BILLING_ADDRESS = "billing_address";
    private static final String FIELD_DYNAMIC_LAST4 = "dynamic_last4";
    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SHIPPING_ADDRESS = "shipping_address";
    private static final String FIELD_TYPE = "type";

    /* compiled from: WalletJsonParser.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Wallet.Type.values().length];
            try {
                iArr[Wallet.Type.AmexExpressCheckout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Wallet.Type.ApplePay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Wallet.Type.SamsungPay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Wallet.Type.GooglePay.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Wallet.Type.Masterpass.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Wallet.Type.VisaCheckout.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Wallet.Type.Link.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Wallet parse(JSONObject json) {
        JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(json, "json");
        Wallet.Type typeFromCode$payments_core_release = Wallet.Type.INSTANCE.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type"));
        if (typeFromCode$payments_core_release == null || (jSONObjectOptJSONObject = json.optJSONObject(typeFromCode$payments_core_release.getCode())) == null) {
            return null;
        }
        String strOptString = StripeJsonUtils.optString(json, FIELD_DYNAMIC_LAST4);
        switch (WhenMappings.$EnumSwitchMapping$0[typeFromCode$payments_core_release.ordinal()]) {
            case 1:
                return new Wallet.AmexExpressCheckoutWallet(strOptString);
            case 2:
                return new Wallet.ApplePayWallet(strOptString);
            case 3:
                return new Wallet.SamsungPayWallet(strOptString);
            case 4:
                return new Wallet.GooglePayWallet(strOptString);
            case 5:
                return parseMasterpassWallet(jSONObjectOptJSONObject);
            case 6:
                return parseVisaCheckoutWallet(jSONObjectOptJSONObject, strOptString);
            case 7:
                return new Wallet.LinkWallet(strOptString);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Wallet.MasterpassWallet parseMasterpassWallet(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_BILLING_ADDRESS);
        Address address = jSONObjectOptJSONObject != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject) : null;
        String strOptString = StripeJsonUtils.optString(json, "email");
        String strOptString2 = StripeJsonUtils.optString(json, "name");
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_SHIPPING_ADDRESS);
        return new Wallet.MasterpassWallet(address, strOptString, strOptString2, jSONObjectOptJSONObject2 != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject2) : null);
    }

    private final Wallet.VisaCheckoutWallet parseVisaCheckoutWallet(JSONObject json, String dynamicLast4) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_BILLING_ADDRESS);
        Address address = jSONObjectOptJSONObject != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject) : null;
        String strOptString = StripeJsonUtils.optString(json, "email");
        String strOptString2 = StripeJsonUtils.optString(json, "name");
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_SHIPPING_ADDRESS);
        return new Wallet.VisaCheckoutWallet(address, strOptString, strOptString2, jSONObjectOptJSONObject2 != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject2) : null, dynamicLast4);
    }

    /* compiled from: WalletJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/WalletJsonParser$Companion;", "", "<init>", "()V", "FIELD_TYPE", "", "FIELD_DYNAMIC_LAST4", "FIELD_BILLING_ADDRESS", "FIELD_EMAIL", "FIELD_NAME", "FIELD_SHIPPING_ADDRESS", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

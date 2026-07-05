package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.wallets.Wallet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: PaymentMethodJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "BillingDetails", "CardJsonParser", "IdealJsonParser", "FpxJsonParser", "NetbankingJsonParser", "USBankAccountJsonParser", "SepaDebitJsonParser", "AuBecsDebitJsonParser", "BacsDebitJsonParser", "SofortJsonParser", "UpiJsonParser", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodJsonParser implements ModelJsonParser<PaymentMethod> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_ALLOW_REDISPLAY = "allow_redisplay";
    private static final String FIELD_BILLING_DETAILS = "billing_details";
    private static final String FIELD_CREATED = "created";
    private static final String FIELD_CUSTOMER = "customer";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LIVEMODE = "livemode";
    private static final String FIELD_TYPE = "type";

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.CardPresent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.Ideal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.Type.BacsDebit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentMethod.Type.Sofort.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentMethod.Type.Upi.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentMethod.Type.Netbanking.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentMethod parse(JSONObject json) {
        PaymentMethod.AllowRedisplay allowRedisplay;
        PaymentMethod.AllowRedisplay next;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "type");
        PaymentMethod.Type typeFromCode = PaymentMethod.Type.INSTANCE.fromCode(strOptString);
        PaymentMethod.Builder created = new PaymentMethod.Builder().setId(StripeJsonUtils.optString(json, "id")).setType(typeFromCode).setCode(strOptString).setCreated(StripeJsonUtils.INSTANCE.optLong(json, "created"));
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_BILLING_DETAILS);
        PaymentMethod.Builder billingDetails = created.setBillingDetails(jSONObjectOptJSONObject != null ? new BillingDetails().parse(jSONObjectOptJSONObject) : null);
        String strOptString2 = StripeJsonUtils.optString(json, "allow_redisplay");
        if (strOptString2 != null) {
            Iterator<PaymentMethod.AllowRedisplay> it = PaymentMethod.AllowRedisplay.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(strOptString2, next.getValue())) {
                    break;
                }
            }
            allowRedisplay = next;
        } else {
            allowRedisplay = null;
        }
        PaymentMethod.Builder liveMode = billingDetails.setAllowRedisplay(allowRedisplay).setCustomerId(StripeJsonUtils.optString(json, "customer")).setLiveMode(json.optBoolean("livemode"));
        switch (typeFromCode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeFromCode.ordinal()]) {
            case 1:
                JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(typeFromCode.code);
                liveMode.setCard(jSONObjectOptJSONObject2 != null ? new CardJsonParser().parse(jSONObjectOptJSONObject2) : null);
                break;
            case 2:
                liveMode.setCardPresent(PaymentMethod.CardPresent.INSTANCE.getEMPTY$payments_core_release());
                break;
            case 3:
                JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(typeFromCode.code);
                liveMode.setIdeal(jSONObjectOptJSONObject3 != null ? new IdealJsonParser().parse(jSONObjectOptJSONObject3) : null);
                break;
            case 4:
                JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(typeFromCode.code);
                liveMode.setFpx(jSONObjectOptJSONObject4 != null ? new FpxJsonParser().parse(jSONObjectOptJSONObject4) : null);
                break;
            case 5:
                JSONObject jSONObjectOptJSONObject5 = json.optJSONObject(typeFromCode.code);
                liveMode.setSepaDebit(jSONObjectOptJSONObject5 != null ? new SepaDebitJsonParser().parse(jSONObjectOptJSONObject5) : null);
                break;
            case 6:
                JSONObject jSONObjectOptJSONObject6 = json.optJSONObject(typeFromCode.code);
                liveMode.setAuBecsDebit(jSONObjectOptJSONObject6 != null ? new AuBecsDebitJsonParser().parse(jSONObjectOptJSONObject6) : null);
                break;
            case 7:
                JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(typeFromCode.code);
                liveMode.setBacsDebit(jSONObjectOptJSONObject7 != null ? new BacsDebitJsonParser().parse(jSONObjectOptJSONObject7) : null);
                break;
            case 8:
                JSONObject jSONObjectOptJSONObject8 = json.optJSONObject(typeFromCode.code);
                liveMode.setSofort(jSONObjectOptJSONObject8 != null ? new SofortJsonParser().parse(jSONObjectOptJSONObject8) : null);
                break;
            case 9:
                JSONObject jSONObjectOptJSONObject9 = json.optJSONObject(typeFromCode.code);
                liveMode.setUpi(jSONObjectOptJSONObject9 != null ? new UpiJsonParser().parse(jSONObjectOptJSONObject9) : null);
                break;
            case 10:
                JSONObject jSONObjectOptJSONObject10 = json.optJSONObject(typeFromCode.code);
                liveMode.setNetbanking(jSONObjectOptJSONObject10 != null ? new NetbankingJsonParser().parse(jSONObjectOptJSONObject10) : null);
                break;
            case 11:
                JSONObject jSONObjectOptJSONObject11 = json.optJSONObject(typeFromCode.code);
                liveMode.setUSBankAccount(jSONObjectOptJSONObject11 != null ? new USBankAccountJsonParser().parse(jSONObjectOptJSONObject11) : null);
                break;
            default:
                Unit unit = Unit.INSTANCE;
                break;
        }
        return liveMode.build();
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BillingDetails implements ModelJsonParser<PaymentMethod.BillingDetails> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ADDRESS = "address";
        private static final String FIELD_EMAIL = "email";
        private static final String FIELD_NAME = "name";
        private static final String FIELD_PHONE = "phone";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BillingDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("address");
            return new PaymentMethod.BillingDetails(jSONObjectOptJSONObject != null ? new AddressJsonParser().parse(jSONObjectOptJSONObject) : null, StripeJsonUtils.optString(json, "email"), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails$Companion;", "", "<init>", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "ChecksJsonParser", "ThreeDSecureUsageJsonParser", "NetworksJsonParser", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardJsonParser implements ModelJsonParser<PaymentMethod.Card> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_BRAND = "brand";
        private static final String FIELD_CHECKS = "checks";
        private static final String FIELD_COUNTRY = "country";
        private static final String FIELD_DISPLAY_BRAND = "display_brand";
        private static final String FIELD_EXP_MONTH = "exp_month";
        private static final String FIELD_EXP_YEAR = "exp_year";
        private static final String FIELD_FINGERPRINT = "fingerprint";
        private static final String FIELD_FUNDING = "funding";
        private static final String FIELD_LAST4 = "last4";
        private static final String FIELD_NETWORKS = "networks";
        private static final String FIELD_THREE_D_SECURE_USAGE = "three_d_secure_usage";
        private static final String FIELD_WALLET = "wallet";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Card parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            CardBrand cardBrandFromCode = CardBrand.INSTANCE.fromCode(StripeJsonUtils.optString(json, "brand"));
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_CHECKS);
            PaymentMethod.Card.Checks checks = jSONObjectOptJSONObject != null ? new ChecksJsonParser().parse(jSONObjectOptJSONObject) : null;
            String strOptString = StripeJsonUtils.optString(json, "country");
            Integer numOptInteger = StripeJsonUtils.INSTANCE.optInteger(json, FIELD_EXP_MONTH);
            Integer numOptInteger2 = StripeJsonUtils.INSTANCE.optInteger(json, FIELD_EXP_YEAR);
            String strOptString2 = StripeJsonUtils.optString(json, "fingerprint");
            String strOptString3 = StripeJsonUtils.optString(json, FIELD_FUNDING);
            String strOptString4 = StripeJsonUtils.optString(json, "last4");
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_THREE_D_SECURE_USAGE);
            PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsage = jSONObjectOptJSONObject2 != null ? new ThreeDSecureUsageJsonParser().parse(jSONObjectOptJSONObject2) : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(FIELD_WALLET);
            Wallet wallet = jSONObjectOptJSONObject3 != null ? new WalletJsonParser().parse(jSONObjectOptJSONObject3) : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(FIELD_NETWORKS);
            return new PaymentMethod.Card(cardBrandFromCode, checks, strOptString, numOptInteger, numOptInteger2, strOptString2, strOptString3, strOptString4, threeDSecureUsage, wallet, jSONObjectOptJSONObject4 != null ? new NetworksJsonParser().parse(jSONObjectOptJSONObject4) : null, StripeJsonUtils.optString(json, FIELD_DISPLAY_BRAND));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ChecksJsonParser implements ModelJsonParser<PaymentMethod.Card.Checks> {
            public static final int $stable = 0;
            private static final Companion Companion = new Companion(null);
            private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
            private static final String FIELD_ADDRESS_POSTAL_CODE_CHECK = "address_postal_code_check";
            private static final String FIELD_CVC_CHECK = "cvc_check";

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Checks parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                return new PaymentMethod.Card.Checks(StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK), StripeJsonUtils.optString(json, FIELD_ADDRESS_POSTAL_CODE_CHECK), StripeJsonUtils.optString(json, FIELD_CVC_CHECK));
            }

            /* compiled from: PaymentMethodJsonParser.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser$Companion;", "", "<init>", "()V", "FIELD_ADDRESS_LINE1_CHECK", "", "FIELD_ADDRESS_POSTAL_CODE_CHECK", "FIELD_CVC_CHECK", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ThreeDSecureUsageJsonParser implements ModelJsonParser<PaymentMethod.Card.ThreeDSecureUsage> {
            public static final int $stable = 0;
            private static final Companion Companion = new Companion(null);
            private static final String FIELD_IS_SUPPORTED = "supported";

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.ThreeDSecureUsage parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                return new PaymentMethod.Card.ThreeDSecureUsage(StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_IS_SUPPORTED));
            }

            /* compiled from: PaymentMethodJsonParser.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser$Companion;", "", "<init>", "()V", "FIELD_IS_SUPPORTED", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NetworksJsonParser implements ModelJsonParser<PaymentMethod.Card.Networks> {
            public static final int $stable = 0;
            private static final Companion Companion = new Companion(null);
            private static final String FIELD_AVAIABLE = "available";
            private static final String FIELD_PREFERRED = "preferred";
            private static final String FIELD_SELECTION_MANDATORY = "selection_mandatory";

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Networks parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                List listJsonArrayToList = StripeJsonUtils.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_AVAIABLE));
                if (listJsonArrayToList == null) {
                    listJsonArrayToList = CollectionsKt.emptyList();
                }
                List list = listJsonArrayToList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return new PaymentMethod.Card.Networks(CollectionsKt.toSet(arrayList), StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_SELECTION_MANDATORY), StripeJsonUtils.optString(json, "preferred"));
            }

            /* compiled from: PaymentMethodJsonParser.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser$Companion;", "", "<init>", "()V", "FIELD_AVAIABLE", "", "FIELD_SELECTION_MANDATORY", "FIELD_PREFERRED", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$Companion;", "", "<init>", "()V", "FIELD_BRAND", "", "FIELD_CHECKS", "FIELD_COUNTRY", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_LAST4", "FIELD_THREE_D_SECURE_USAGE", "FIELD_WALLET", "FIELD_DISPLAY_BRAND", "FIELD_NETWORKS", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdealJsonParser implements ModelJsonParser<PaymentMethod.Ideal> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_BANK = "bank";
        private static final String FIELD_BIC = "bic";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Ideal parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Ideal(StripeJsonUtils.optString(json, FIELD_BANK), StripeJsonUtils.optString(json, FIELD_BIC));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser$Companion;", "", "<init>", "()V", "FIELD_BANK", "", "FIELD_BIC", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FpxJsonParser implements ModelJsonParser<PaymentMethod.Fpx> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        private static final String FIELD_BANK = "bank";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Fpx parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Fpx(StripeJsonUtils.optString(json, FIELD_BANK), StripeJsonUtils.optString(json, "account_holder_type"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser$Companion;", "", "<init>", "()V", "FIELD_ACCOUNT_HOLDER_TYPE", "", "FIELD_BANK", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetbankingJsonParser implements ModelJsonParser<PaymentMethod.Netbanking> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_BANK = "bank";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Netbanking parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Netbanking(StripeJsonUtils.optString(json, FIELD_BANK));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser$Companion;", "", "<init>", "()V", "FIELD_BANK", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class USBankAccountJsonParser implements ModelJsonParser<PaymentMethod.USBankAccount> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        private static final String FIELD_ACCOUNT_TYPE = "account_type";
        private static final String FIELD_BANK_NAME = "bank_name";
        private static final String FIELD_FINANCIAL_CONNECTIONS_ACCOUNT = "financial_connections_account";
        private static final String FIELD_FINGERPRINT = "fingerprint";
        private static final String FIELD_LAST4 = "last4";
        private static final String FIELD_NETWORKS = "networks";
        private static final String FIELD_NETWORKS_PREFERRED = "preferred";
        private static final String FIELD_NETWORKS_SUPPORTED = "supported";
        private static final String FIELD_ROUTING_NUMBER = "routing_number";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.USBankAccount parse(JSONObject json) {
            PaymentMethod.USBankAccount.USBankAccountHolderType next;
            PaymentMethod.USBankAccount.USBankAccountType next2;
            PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
            Intrinsics.checkNotNullParameter(json, "json");
            Iterator<PaymentMethod.USBankAccount.USBankAccountHolderType> it = PaymentMethod.USBankAccount.USBankAccountHolderType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(StripeJsonUtils.optString(json, "account_holder_type"), next.getValue())) {
                    break;
                }
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = next;
            if (uSBankAccountHolderType == null) {
                uSBankAccountHolderType = PaymentMethod.USBankAccount.USBankAccountHolderType.UNKNOWN;
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType2 = uSBankAccountHolderType;
            Iterator<PaymentMethod.USBankAccount.USBankAccountType> it2 = PaymentMethod.USBankAccount.USBankAccountType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.areEqual(StripeJsonUtils.optString(json, FIELD_ACCOUNT_TYPE), next2.getValue())) {
                    break;
                }
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = next2;
            if (uSBankAccountType == null) {
                uSBankAccountType = PaymentMethod.USBankAccount.USBankAccountType.UNKNOWN;
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType2 = uSBankAccountType;
            String strOptString = StripeJsonUtils.optString(json, "bank_name");
            String strOptString2 = StripeJsonUtils.optString(json, "fingerprint");
            String strOptString3 = StripeJsonUtils.optString(json, "last4");
            String strOptString4 = StripeJsonUtils.optString(json, FIELD_FINANCIAL_CONNECTIONS_ACCOUNT);
            if (json.has(FIELD_NETWORKS)) {
                String strOptString5 = StripeJsonUtils.optString(json.optJSONObject(FIELD_NETWORKS), "preferred");
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_NETWORKS);
                List listJsonArrayToList = stripeJsonUtils.jsonArrayToList(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getJSONArray(FIELD_NETWORKS_SUPPORTED) : null);
                if (listJsonArrayToList == null) {
                    listJsonArrayToList = CollectionsKt.emptyList();
                }
                List list = listJsonArrayToList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().toString());
                }
                uSBankNetworks = new PaymentMethod.USBankAccount.USBankNetworks(strOptString5, arrayList);
            } else {
                uSBankNetworks = null;
            }
            return new PaymentMethod.USBankAccount(uSBankAccountHolderType2, uSBankAccountType2, strOptString, strOptString2, strOptString3, strOptString4, uSBankNetworks, StripeJsonUtils.optString(json, "routing_number"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser$Companion;", "", "<init>", "()V", "FIELD_ACCOUNT_HOLDER_TYPE", "", "FIELD_ACCOUNT_TYPE", "FIELD_BANK_NAME", "FIELD_FINGERPRINT", "FIELD_LAST4", "FIELD_FINANCIAL_CONNECTIONS_ACCOUNT", "FIELD_NETWORKS", "FIELD_NETWORKS_PREFERRED", "FIELD_NETWORKS_SUPPORTED", "FIELD_ROUTING_NUMBER", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SepaDebitJsonParser implements ModelJsonParser<PaymentMethod.SepaDebit> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_BANK_CODE = "bank_code";
        private static final String FIELD_BRANCH_CODE = "branch_code";
        private static final String FIELD_COUNTRY = "country";
        private static final String FIELD_FINGERPRINT = "fingerprint";
        private static final String FIELD_LAST4 = "last4";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.SepaDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.SepaDebit(StripeJsonUtils.optString(json, FIELD_BANK_CODE), StripeJsonUtils.optString(json, FIELD_BRANCH_CODE), StripeJsonUtils.optString(json, "country"), StripeJsonUtils.optString(json, "fingerprint"), StripeJsonUtils.optString(json, "last4"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser$Companion;", "", "<init>", "()V", "FIELD_BANK_CODE", "", "FIELD_BRANCH_CODE", "FIELD_COUNTRY", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuBecsDebitJsonParser implements ModelJsonParser<PaymentMethod.AuBecsDebit> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_BSB_NUMBER = "bsb_number";
        private static final String FIELD_FINGERPRINT = "fingerprint";
        private static final String FIELD_LAST4 = "last4";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.AuBecsDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.AuBecsDebit(StripeJsonUtils.optString(json, FIELD_BSB_NUMBER), StripeJsonUtils.optString(json, "fingerprint"), StripeJsonUtils.optString(json, "last4"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser$Companion;", "", "<init>", "()V", "FIELD_BSB_NUMBER", "", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BacsDebitJsonParser implements ModelJsonParser<PaymentMethod.BacsDebit> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_FINGERPRINT = "fingerprint";
        private static final String FIELD_LAST4 = "last4";
        private static final String FIELD_SORT_CODE = "sort_code";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BacsDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.BacsDebit(StripeJsonUtils.optString(json, "fingerprint"), StripeJsonUtils.optString(json, "last4"), StripeJsonUtils.optString(json, FIELD_SORT_CODE));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser$Companion;", "", "<init>", "()V", "FIELD_FINGERPRINT", "", "FIELD_LAST4", "FIELD_SORT_CODE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SofortJsonParser implements ModelJsonParser<PaymentMethod.Sofort> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_COUNTRY = "country";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Sofort parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Sofort(StripeJsonUtils.optString(json, "country"));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser$Companion;", "", "<init>", "()V", "FIELD_COUNTRY", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpiJsonParser implements ModelJsonParser<PaymentMethod.Upi> {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private static final String FIELD_VPA = "vpa";

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Upi parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Upi(StripeJsonUtils.optString(json, FIELD_VPA));
        }

        /* compiled from: PaymentMethodJsonParser.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser$Companion;", "", "<init>", "()V", "FIELD_VPA", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$Companion;", "", "<init>", "()V", "FIELD_ID", "", "FIELD_BILLING_DETAILS", "FIELD_CREATED", "FIELD_CUSTOMER", "FIELD_LIVEMODE", "FIELD_ALLOW_REDISPLAY", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

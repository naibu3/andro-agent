package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.appstate.AppStateModule;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsumerPaymentDetailsCreateParams.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "Card", "BankAccount", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$BankAccount;", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConsumerPaymentDetailsCreateParams extends StripeParamsModel, Parcelable {

    /* compiled from: ConsumerPaymentDetailsCreateParams.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB(\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u001a\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u0004HÂ\u0003J.\u0010\r\u001a\u00020\u00002\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u001f\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card;", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "cardPaymentMethodCreateParamsMap", "", "", "", "Lkotlinx/parcelize/RawValue;", "email", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "toParamMap", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card implements ConsumerPaymentDetailsCreateParams {
        private static final String BASE_PARAM_CARD = "card";
        private static final String BASE_PARAM_CARD_EXPIRY_MONTH = "exp_month";
        private static final String BASE_PARAM_CARD_EXPIRY_YEAR = "exp_year";
        private static final String BASE_PARAM_CARD_NUMBER = "number";
        private static final String BASE_PARAM_NETWORKS = "networks";
        private static final String BASE_PARAM_PREFERRED = "preferred";
        private static final String LINK_PARAM_BILLING_EMAIL_ADDRESS = "billing_email_address";
        private static final String LINK_PARAM_CARD = "card";
        private static final String LINK_PARAM_PREFERRED_NETWORK = "preferred_network";
        private final Map<String, Object> cardPaymentMethodCreateParamsMap;
        private final String email;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        /* compiled from: ConsumerPaymentDetailsCreateParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(Card.class.getClassLoader()));
                }
                return new Card(linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        private final Map<String, Object> component1() {
            return this.cardPaymentMethodCreateParamsMap;
        }

        /* renamed from: component2, reason: from getter */
        private final String getEmail() {
            return this.email;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Card copy$default(Card card, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = card.cardPaymentMethodCreateParamsMap;
            }
            if ((i & 2) != 0) {
                str = card.email;
            }
            return card.copy(map, str);
        }

        public final Card copy(Map<String, ? extends Object> cardPaymentMethodCreateParamsMap, String email) {
            Intrinsics.checkNotNullParameter(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            Intrinsics.checkNotNullParameter(email, "email");
            return new Card(cardPaymentMethodCreateParamsMap, email);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.cardPaymentMethodCreateParamsMap, card.cardPaymentMethodCreateParamsMap) && Intrinsics.areEqual(this.email, card.email);
        }

        public int hashCode() {
            return (this.cardPaymentMethodCreateParamsMap.hashCode() * 31) + this.email.hashCode();
        }

        public String toString() {
            return "Card(cardPaymentMethodCreateParamsMap=" + this.cardPaymentMethodCreateParamsMap + ", email=" + this.email + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<String, Object> map = this.cardPaymentMethodCreateParamsMap;
            dest.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeValue(entry.getValue());
            }
            dest.writeString(this.email);
        }

        public Card(Map<String, ? extends Object> cardPaymentMethodCreateParamsMap, String email) {
            Intrinsics.checkNotNullParameter(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            Intrinsics.checkNotNullParameter(email, "email");
            this.cardPaymentMethodCreateParamsMap = cardPaymentMethodCreateParamsMap;
            this.email = email;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("type", "card"), TuplesKt.to(AppStateModule.APP_STATE_ACTIVE, true), TuplesKt.to(LINK_PARAM_BILLING_EMAIL_ADDRESS, this.email));
            Pair<String, Object> consumerPaymentDetailsAddressFromPaymentMethodCreateParams = ConsumerPaymentDetailsCreateParamsKt.getConsumerPaymentDetailsAddressFromPaymentMethodCreateParams(this.cardPaymentMethodCreateParamsMap);
            if (consumerPaymentDetailsAddressFromPaymentMethodCreateParams != null) {
                mapMutableMapOf.put(consumerPaymentDetailsAddressFromPaymentMethodCreateParams.getFirst(), consumerPaymentDetailsAddressFromPaymentMethodCreateParams.getSecond());
            }
            Object obj = this.cardPaymentMethodCreateParamsMap.get("card");
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (CollectionsKt.contains(SetsKt.setOf((Object[]) new String[]{BASE_PARAM_CARD_NUMBER, BASE_PARAM_CARD_EXPIRY_MONTH, BASE_PARAM_CARD_EXPIRY_YEAR}), entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                Object obj2 = map.get(BASE_PARAM_NETWORKS);
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                Object obj3 = map2 != null ? map2.get("preferred") : null;
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str != null) {
                    mutableMap.put(LINK_PARAM_PREFERRED_NETWORK, str);
                }
                mapMutableMapOf.put("card", MapsKt.toMap(mutableMap));
            }
            return mapMutableMapOf;
        }

        /* compiled from: ConsumerPaymentDetailsCreateParams.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card$Companion;", "", "<init>", "()V", "BASE_PARAM_CARD", "", "BASE_PARAM_CARD_NUMBER", "BASE_PARAM_CARD_EXPIRY_MONTH", "BASE_PARAM_CARD_EXPIRY_YEAR", "BASE_PARAM_NETWORKS", "BASE_PARAM_PREFERRED", "LINK_PARAM_CARD", "LINK_PARAM_BILLING_EMAIL_ADDRESS", "LINK_PARAM_PREFERRED_NETWORK", "extraConfirmationParams", "", "paymentMethodCreateParams", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Map<String, Map<String, Object>> extraConfirmationParams(Map<String, ? extends Object> paymentMethodCreateParams) {
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Object obj = paymentMethodCreateParams.get("card");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map != null) {
                    return MapsKt.mapOf(TuplesKt.to("card", MapsKt.mapOf(TuplesKt.to("cvc", map.get("cvc")))));
                }
                return null;
            }
        }
    }

    /* compiled from: ConsumerPaymentDetailsCreateParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B4\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0019\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u001c\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J<\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001b\b\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$BankAccount;", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "bankAccountId", "", "billingAddress", "", "", "Lkotlinx/parcelize/RawValue;", "billingEmailAddress", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toParamMap", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BankAccount implements ConsumerPaymentDetailsCreateParams {
        public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();
        private final String bankAccountId;
        private final Map<String, Object> billingAddress;
        private final String billingEmailAddress;

        /* compiled from: ConsumerPaymentDetailsCreateParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(BankAccount.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new BankAccount(string, linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount[] newArray(int i) {
                return new BankAccount[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final String getBankAccountId() {
            return this.bankAccountId;
        }

        private final Map<String, Object> component2() {
            return this.billingAddress;
        }

        /* renamed from: component3, reason: from getter */
        private final String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, Map map, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.bankAccountId;
            }
            if ((i & 2) != 0) {
                map = bankAccount.billingAddress;
            }
            if ((i & 4) != 0) {
                str2 = bankAccount.billingEmailAddress;
            }
            return bankAccount.copy(str, map, str2);
        }

        public final BankAccount copy(String bankAccountId, Map<String, ? extends Object> billingAddress, String billingEmailAddress) {
            Intrinsics.checkNotNullParameter(bankAccountId, "bankAccountId");
            return new BankAccount(bankAccountId, billingAddress, billingEmailAddress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankAccount)) {
                return false;
            }
            BankAccount bankAccount = (BankAccount) other;
            return Intrinsics.areEqual(this.bankAccountId, bankAccount.bankAccountId) && Intrinsics.areEqual(this.billingAddress, bankAccount.billingAddress) && Intrinsics.areEqual(this.billingEmailAddress, bankAccount.billingEmailAddress);
        }

        public int hashCode() {
            int iHashCode = this.bankAccountId.hashCode() * 31;
            Map<String, Object> map = this.billingAddress;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.billingEmailAddress;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "BankAccount(bankAccountId=" + this.bankAccountId + ", billingAddress=" + this.billingAddress + ", billingEmailAddress=" + this.billingEmailAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bankAccountId);
            Map<String, Object> map = this.billingAddress;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeValue(entry.getValue());
                }
            }
            dest.writeString(this.billingEmailAddress);
        }

        public BankAccount(String bankAccountId, Map<String, ? extends Object> map, String str) {
            Intrinsics.checkNotNullParameter(bankAccountId, "bankAccountId");
            this.bankAccountId = bankAccountId;
            this.billingAddress = map;
            this.billingEmailAddress = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            String str = this.billingEmailAddress;
            if (str != null) {
                mapCreateMapBuilder.put("billing_email_address", str);
            }
            Map<String, Object> map = this.billingAddress;
            if (map != null && !map.isEmpty()) {
                mapCreateMapBuilder.put("billing_address", this.billingAddress);
            }
            return MapsKt.plus(MapsKt.mapOf(TuplesKt.to("type", "bank_account"), TuplesKt.to("bank_account", MapsKt.mapOf(TuplesKt.to("account", this.bankAccountId)))), MapsKt.build(mapCreateMapBuilder));
        }
    }
}

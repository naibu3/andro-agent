package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodUpdateParams.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u0017H ¢\u0006\u0002\b\u0019J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000eX \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0001\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/PaymentMethodUpdateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "<init>", "(Lcom/stripe/android/model/PaymentMethod$Type;)V", "getType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "allowRedisplay", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "getAllowRedisplay$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "productUsageTokens", "", "", "getProductUsageTokens$payments_core_release", "()Ljava/util/Set;", "generateTypeParams", "", "", "generateTypeParams$payments_core_release", "toParamMap", "Card", "Companion", "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PaymentMethodUpdateParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PARAM_ALLOW_REDISPLAY = "allow_redisplay";
    private static final String PARAM_BILLING_DETAILS = "billing_details";
    private final PaymentMethod.Type type;

    public /* synthetic */ PaymentMethodUpdateParams(PaymentMethod.Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard() {
        return INSTANCE.createCard();
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num) {
        return INSTANCE.createCard(num);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2) {
        return INSTANCE.createCard(num, num2);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks) {
        return INSTANCE.createCard(num, num2, networks);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails) {
        return INSTANCE.createCard(num, num2, networks, billingDetails);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay) {
        return INSTANCE.createCard(num, num2, networks, billingDetails, allowRedisplay);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Set<String> set) {
        return INSTANCE.createCard(num, num2, networks, billingDetails, allowRedisplay, set);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, Set<String> set) {
        return INSTANCE.createCard(num, num2, networks, billingDetails, set);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, Set<String> set) {
        return INSTANCE.createCard(num, num2, networks, set);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Set<String> set) {
        return INSTANCE.createCard(num, num2, set);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Integer num, Set<String> set) {
        return INSTANCE.createCard(num, set);
    }

    @JvmStatic
    public static final PaymentMethodUpdateParams createCard(Set<String> set) {
        return INSTANCE.createCard(set);
    }

    public abstract Map<String, Object> generateTypeParams$payments_core_release();

    /* renamed from: getAllowRedisplay$payments_core_release */
    public abstract PaymentMethod.AllowRedisplay getAllowRedisplay();

    /* renamed from: getBillingDetails$payments_core_release */
    public abstract PaymentMethod.BillingDetails getBillingDetails();

    public abstract Set<String> getProductUsageTokens$payments_core_release();

    private PaymentMethodUpdateParams(PaymentMethod.Type type) {
        this.type = type;
    }

    /* renamed from: getType$payments_core_release, reason: from getter */
    public final PaymentMethod.Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(this.type.code, generateTypeParams$payments_core_release()));
        PaymentMethod.BillingDetails billingDetails = getBillingDetails();
        Map mapMapOf2 = billingDetails != null ? MapsKt.mapOf(TuplesKt.to(PARAM_BILLING_DETAILS, billingDetails.toParamMap())) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        PaymentMethod.AllowRedisplay allowRedisplay = getAllowRedisplay();
        Map mapMapOf3 = allowRedisplay != null ? MapsKt.mapOf(TuplesKt.to("allow_redisplay", allowRedisplay.getValue())) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        return MapsKt.plus(MapsKt.plus(mapMapOf2, mapMapOf3), mapMapOf);
    }

    /* compiled from: PaymentMethodUpdateParams.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002+,BS\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0010¢\u0006\u0002\b\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u000bH\u0016J\u0006\u0010%\u001a\u00020\u0003J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;", "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "expiryMonth", "", "expiryYear", Card.PARAM_NETWORKS, "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "productUsageTokens", "", "", "allowRedisplay", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V", "getExpiryMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear", "getNetworks", "()Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;", "getBillingDetails$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getProductUsageTokens$payments_core_release", "()Ljava/util/Set;", "getAllowRedisplay$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "generateTypeParams", "", "", "generateTypeParams$payments_core_release", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Networks", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Card extends PaymentMethodUpdateParams {
        private static final String PARAM_EXP_MONTH = "exp_month";
        private static final String PARAM_EXP_YEAR = "exp_year";
        private static final String PARAM_NETWORKS = "networks";
        private final PaymentMethod.AllowRedisplay allowRedisplay;
        private final PaymentMethod.BillingDetails billingDetails;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final Networks networks;
        private final Set<String> productUsageTokens;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethodUpdateParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Networks networksCreateFromParcel = parcel.readInt() == 0 ? null : Networks.CREATOR.createFromParcel(parcel);
                PaymentMethod.BillingDetails billingDetailsCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Card(numValueOf, numValueOf2, networksCreateFromParcel, billingDetailsCreateFromParcel, linkedHashSet, parcel.readInt() != 0 ? PaymentMethod.AllowRedisplay.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.expiryMonth;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            Networks networks = this.networks;
            if (networks == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                networks.writeToParcel(dest, flags);
            }
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            if (billingDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingDetails.writeToParcel(dest, flags);
            }
            Set<String> set = this.productUsageTokens;
            dest.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next());
            }
            PaymentMethod.AllowRedisplay allowRedisplay = this.allowRedisplay;
            if (allowRedisplay == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                allowRedisplay.writeToParcel(dest, flags);
            }
        }

        public final Integer getExpiryMonth() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear() {
            return this.expiryYear;
        }

        public final Networks getNetworks() {
            return this.networks;
        }

        @Override // com.stripe.android.model.PaymentMethodUpdateParams
        /* renamed from: getBillingDetails$payments_core_release, reason: from getter */
        public PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public /* synthetic */ Card(Integer num, Integer num2, Networks networks, PaymentMethod.BillingDetails billingDetails, Set set, PaymentMethod.AllowRedisplay allowRedisplay, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : networks, billingDetails, (i & 16) != 0 ? SetsKt.emptySet() : set, (i & 32) != 0 ? null : allowRedisplay);
        }

        @Override // com.stripe.android.model.PaymentMethodUpdateParams
        public Set<String> getProductUsageTokens$payments_core_release() {
            return this.productUsageTokens;
        }

        @Override // com.stripe.android.model.PaymentMethodUpdateParams
        /* renamed from: getAllowRedisplay$payments_core_release, reason: from getter */
        public PaymentMethod.AllowRedisplay getAllowRedisplay() {
            return this.allowRedisplay;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(Integer num, Integer num2, Networks networks, PaymentMethod.BillingDetails billingDetails, Set<String> productUsageTokens, PaymentMethod.AllowRedisplay allowRedisplay) {
            super(PaymentMethod.Type.Card, null);
            Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.networks = networks;
            this.billingDetails = billingDetails;
            this.productUsageTokens = productUsageTokens;
            this.allowRedisplay = allowRedisplay;
        }

        @Override // com.stripe.android.model.PaymentMethodUpdateParams
        public Map<String, Object> generateTypeParams$payments_core_release() {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to(PARAM_EXP_MONTH, this.expiryMonth);
            pairArr[1] = TuplesKt.to(PARAM_EXP_YEAR, this.expiryYear);
            Networks networks = this.networks;
            pairArr[2] = TuplesKt.to(PARAM_NETWORKS, networks != null ? networks.toParamMap() : null);
            List<Pair> listListOf = CollectionsKt.listOf((Object[]) pairArr);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listListOf) {
                Object second = pair.getSecond();
                Pair pair2 = second != null ? TuplesKt.to(pair.getFirst(), second) : null;
                if (pair2 != null) {
                    arrayList.add(pair2);
                }
            }
            return MapsKt.toMap(arrayList);
        }

        public boolean equals(Object other) {
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(card.expiryMonth, this.expiryMonth) && Intrinsics.areEqual(card.expiryYear, this.expiryYear) && Intrinsics.areEqual(card.networks, this.networks) && Intrinsics.areEqual(card.getBillingDetails(), getBillingDetails());
        }

        public int hashCode() {
            return Objects.hash(this.expiryMonth, this.expiryYear, this.networks, getBillingDetails());
        }

        public String toString() {
            return "PaymentMethodCreateParams.Card.(expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", networks=" + this.networks + ", billingDetails=" + getBillingDetails() + ")";
        }

        /* compiled from: PaymentMethodUpdateParams.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0006\u0010\u0012\u001a\u00020\u0010J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "preferred", "", "<init>", "(Ljava/lang/String;)V", "getPreferred", "()Ljava/lang/String;", "toParamMap", "", "", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Networks implements StripeParamsModel, Parcelable {
            private static final String PARAM_PREFERRED = "preferred";
            private final String preferred;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Networks> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentMethodUpdateParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Networks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Networks(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks[] newArray(int i) {
                    return new Networks[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Networks() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.preferred);
            }

            public Networks(String str) {
                this.preferred = str;
            }

            public /* synthetic */ Networks(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getPreferred() {
                return this.preferred;
            }

            @Override // com.stripe.android.model.StripeParamsModel
            public Map<String, Object> toParamMap() {
                String str = this.preferred;
                if (str != null) {
                    return MapsKt.mapOf(TuplesKt.to("preferred", str));
                }
                return MapsKt.emptyMap();
            }

            public boolean equals(Object other) {
                return (other instanceof Networks) && Intrinsics.areEqual(((Networks) other).preferred, this.preferred);
            }

            public int hashCode() {
                return Objects.hash(this.preferred);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.preferred + ")";
            }

            /* compiled from: PaymentMethodUpdateParams.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks$Companion;", "", "<init>", "()V", "PARAM_PREFERRED", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: PaymentMethodUpdateParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Companion;", "", "<init>", "()V", "PARAM_EXP_MONTH", "", "PARAM_EXP_YEAR", "PARAM_NETWORKS", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodUpdateParams.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012JW\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0007¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;", "", "<init>", "()V", "PARAM_ALLOW_REDISPLAY", "", "PARAM_BILLING_DETAILS", "createCard", "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "expiryMonth", "", "expiryYear", "networks", "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "allowRedisplay", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodUpdateParams;", "productUsageTokens", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard() {
            return createCard$default(this, null, null, null, null, null, 31, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num) {
            return createCard$default(this, num, null, null, null, null, 30, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num, Integer num2) {
            return createCard$default(this, num, num2, null, null, null, 28, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks) {
            return createCard$default(this, num, num2, networks, null, null, 24, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails) {
            return createCard$default(this, num, num2, networks, billingDetails, null, 16, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, Set<String> productUsageTokens) {
            Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
            return createCard$default(this, num, num2, networks, billingDetails, null, productUsageTokens, 16, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Card.Networks networks, Set<String> productUsageTokens) {
            Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
            return createCard$default(this, num, num2, networks, null, null, productUsageTokens, 24, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num, Integer num2, Set<String> productUsageTokens) {
            Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
            return createCard$default(this, num, num2, null, null, null, productUsageTokens, 28, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer num, Set<String> productUsageTokens) {
            Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
            return createCard$default(this, num, null, null, null, null, productUsageTokens, 30, null);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Set<String> productUsageTokens) {
            Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
            return createCard$default(this, null, null, null, null, null, productUsageTokens, 31, null);
        }

        private Companion() {
        }

        public static /* synthetic */ PaymentMethodUpdateParams createCard$default(Companion companion, Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                num2 = null;
            }
            if ((i & 4) != 0) {
                networks = null;
            }
            if ((i & 8) != 0) {
                billingDetails = null;
            }
            if ((i & 16) != 0) {
                allowRedisplay = null;
            }
            return companion.createCard(num, num2, networks, billingDetails, allowRedisplay);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer expiryMonth, Integer expiryYear, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay) {
            return new Card(expiryMonth, expiryYear, networks, billingDetails, SetsKt.emptySet(), allowRedisplay);
        }

        public static /* synthetic */ PaymentMethodUpdateParams createCard$default(Companion companion, Integer num, Integer num2, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                num2 = null;
            }
            if ((i & 4) != 0) {
                networks = null;
            }
            if ((i & 8) != 0) {
                billingDetails = null;
            }
            if ((i & 16) != 0) {
                allowRedisplay = null;
            }
            return companion.createCard(num, num2, networks, billingDetails, allowRedisplay, set);
        }

        @JvmStatic
        public final PaymentMethodUpdateParams createCard(Integer expiryMonth, Integer expiryYear, Card.Networks networks, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Set<String> productUsageTokens) {
            Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
            return new Card(expiryMonth, expiryYear, networks, billingDetails, productUsageTokens, allowRedisplay);
        }
    }
}

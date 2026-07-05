package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.utils.DateUtils;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsumerPaymentDetails.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u001dB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails;", "Lcom/stripe/android/core/model/StripeModel;", "paymentDetails", "", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "<init>", "(Ljava/util/List;)V", "getPaymentDetails", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "PaymentDetails", "Card", "Passthrough", "BankAccount", "BillingAddress", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConsumerPaymentDetails implements StripeModel {
    public static final Parcelable.Creator<ConsumerPaymentDetails> CREATOR = new Creator();
    private final List<PaymentDetails> paymentDetails;

    /* compiled from: ConsumerPaymentDetails.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsumerPaymentDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ConsumerPaymentDetails.class.getClassLoader()));
            }
            return new ConsumerPaymentDetails(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetails[] newArray(int i) {
            return new ConsumerPaymentDetails[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsumerPaymentDetails copy$default(ConsumerPaymentDetails consumerPaymentDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = consumerPaymentDetails.paymentDetails;
        }
        return consumerPaymentDetails.copy(list);
    }

    public final List<PaymentDetails> component1() {
        return this.paymentDetails;
    }

    public final ConsumerPaymentDetails copy(List<? extends PaymentDetails> paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        return new ConsumerPaymentDetails(paymentDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConsumerPaymentDetails) && Intrinsics.areEqual(this.paymentDetails, ((ConsumerPaymentDetails) other).paymentDetails);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.paymentDetails.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetails(paymentDetails=" + this.paymentDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<PaymentDetails> list = this.paymentDetails;
        dest.writeInt(list.size());
        Iterator<PaymentDetails> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerPaymentDetails(List<? extends PaymentDetails> paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        this.paymentDetails = paymentDetails;
    }

    public final List<PaymentDetails> getPaymentDetails() {
        return this.paymentDetails;
    }

    /* compiled from: ConsumerPaymentDetails.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B?\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0012\u0010\u0015\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "Landroid/os/Parcelable;", "id", "", "isDefault", "", "type", "nickname", "billingAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "billingEmailAddress", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getType", "getNickname", "getBillingAddress", "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "getBillingEmailAddress", "last4", "getLast4", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PaymentDetails implements Parcelable {
        private final BillingAddress billingAddress;
        private final String billingEmailAddress;
        private final String id;
        private final boolean isDefault;
        private final String nickname;
        private final String type;

        public /* synthetic */ PaymentDetails(String str, boolean z, String str2, String str3, BillingAddress billingAddress, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, str3, billingAddress, str4);
        }

        public abstract String getLast4();

        private PaymentDetails(String str, boolean z, String str2, String str3, BillingAddress billingAddress, String str4) {
            this.id = str;
            this.isDefault = z;
            this.type = str2;
            this.nickname = str3;
            this.billingAddress = billingAddress;
            this.billingEmailAddress = str4;
        }

        public String getId() {
            return this.id;
        }

        /* renamed from: isDefault, reason: from getter */
        public boolean getIsDefault() {
            return this.isDefault;
        }

        public String getType() {
            return this.type;
        }

        public String getNickname() {
            return this.nickname;
        }

        public BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        public String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }
    }

    /* compiled from: ConsumerPaymentDetails.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FBw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u008d\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0006\u0010;\u001a\u00020\fJ\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\fHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00118F¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006G"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "id", "", "last4", "isDefault", "", "nickname", "billingAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "billingEmailAddress", "expiryYear", "", "expiryMonth", "brand", "Lcom/stripe/android/model/CardBrand;", "networks", "", "cvcCheck", "Lcom/stripe/android/model/CvcCheck;", "funding", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLast4", "()Z", "getNickname", "getBillingAddress", "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "getBillingEmailAddress", "getExpiryYear", "()I", "getExpiryMonth", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getNetworks", "()Ljava/util/List;", "getCvcCheck", "()Lcom/stripe/android/model/CvcCheck;", "getFunding", "requiresCardDetailsRecollection", "getRequiresCardDetailsRecollection", "isExpired", "availableNetworks", "getAvailableNetworks", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card extends PaymentDetails {
        public static final String TYPE = "card";
        private final BillingAddress billingAddress;
        private final String billingEmailAddress;
        private final CardBrand brand;
        private final CvcCheck cvcCheck;
        private final int expiryMonth;
        private final int expiryYear;
        private final String funding;
        private final String id;
        private final boolean isDefault;
        private final String last4;
        private final List<String> networks;
        private final String nickname;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        /* compiled from: ConsumerPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : BillingAddress.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), CardBrand.valueOf(parcel.readString()), parcel.createStringArrayList(), CvcCheck.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public static /* synthetic */ Card copy$default(Card card, String str, String str2, boolean z, String str3, BillingAddress billingAddress, String str4, int i, int i2, CardBrand cardBrand, List list, CvcCheck cvcCheck, String str5, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = card.id;
            }
            if ((i3 & 2) != 0) {
                str2 = card.last4;
            }
            if ((i3 & 4) != 0) {
                z = card.isDefault;
            }
            if ((i3 & 8) != 0) {
                str3 = card.nickname;
            }
            if ((i3 & 16) != 0) {
                billingAddress = card.billingAddress;
            }
            if ((i3 & 32) != 0) {
                str4 = card.billingEmailAddress;
            }
            if ((i3 & 64) != 0) {
                i = card.expiryYear;
            }
            if ((i3 & 128) != 0) {
                i2 = card.expiryMonth;
            }
            if ((i3 & 256) != 0) {
                cardBrand = card.brand;
            }
            if ((i3 & 512) != 0) {
                list = card.networks;
            }
            if ((i3 & 1024) != 0) {
                cvcCheck = card.cvcCheck;
            }
            if ((i3 & 2048) != 0) {
                str5 = card.funding;
            }
            CvcCheck cvcCheck2 = cvcCheck;
            String str6 = str5;
            CardBrand cardBrand2 = cardBrand;
            List list2 = list;
            int i4 = i;
            int i5 = i2;
            BillingAddress billingAddress2 = billingAddress;
            String str7 = str4;
            return card.copy(str, str2, z, str3, billingAddress2, str7, i4, i5, cardBrand2, list2, cvcCheck2, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final List<String> component10() {
            return this.networks;
        }

        /* renamed from: component11, reason: from getter */
        public final CvcCheck getCvcCheck() {
            return this.cvcCheck;
        }

        /* renamed from: component12, reason: from getter */
        public final String getFunding() {
            return this.funding;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDefault() {
            return this.isDefault;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* renamed from: component5, reason: from getter */
        public final BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }

        /* renamed from: component7, reason: from getter */
        public final int getExpiryYear() {
            return this.expiryYear;
        }

        /* renamed from: component8, reason: from getter */
        public final int getExpiryMonth() {
            return this.expiryMonth;
        }

        /* renamed from: component9, reason: from getter */
        public final CardBrand getBrand() {
            return this.brand;
        }

        public final Card copy(String id, String last4, boolean isDefault, String nickname, BillingAddress billingAddress, String billingEmailAddress, int expiryYear, int expiryMonth, CardBrand brand, List<String> networks, CvcCheck cvcCheck, String funding) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(last4, "last4");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(networks, "networks");
            Intrinsics.checkNotNullParameter(cvcCheck, "cvcCheck");
            Intrinsics.checkNotNullParameter(funding, "funding");
            return new Card(id, last4, isDefault, nickname, billingAddress, billingEmailAddress, expiryYear, expiryMonth, brand, networks, cvcCheck, funding);
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
            return Intrinsics.areEqual(this.id, card.id) && Intrinsics.areEqual(this.last4, card.last4) && this.isDefault == card.isDefault && Intrinsics.areEqual(this.nickname, card.nickname) && Intrinsics.areEqual(this.billingAddress, card.billingAddress) && Intrinsics.areEqual(this.billingEmailAddress, card.billingEmailAddress) && this.expiryYear == card.expiryYear && this.expiryMonth == card.expiryMonth && this.brand == card.brand && Intrinsics.areEqual(this.networks, card.networks) && this.cvcCheck == card.cvcCheck && Intrinsics.areEqual(this.funding, card.funding);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.last4.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31;
            String str = this.nickname;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            BillingAddress billingAddress = this.billingAddress;
            int iHashCode3 = (iHashCode2 + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
            String str2 = this.billingEmailAddress;
            return ((((((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.expiryYear)) * 31) + Integer.hashCode(this.expiryMonth)) * 31) + this.brand.hashCode()) * 31) + this.networks.hashCode()) * 31) + this.cvcCheck.hashCode()) * 31) + this.funding.hashCode();
        }

        public String toString() {
            return "Card(id=" + this.id + ", last4=" + this.last4 + ", isDefault=" + this.isDefault + ", nickname=" + this.nickname + ", billingAddress=" + this.billingAddress + ", billingEmailAddress=" + this.billingEmailAddress + ", expiryYear=" + this.expiryYear + ", expiryMonth=" + this.expiryMonth + ", brand=" + this.brand + ", networks=" + this.networks + ", cvcCheck=" + this.cvcCheck + ", funding=" + this.funding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.last4);
            dest.writeInt(this.isDefault ? 1 : 0);
            dest.writeString(this.nickname);
            BillingAddress billingAddress = this.billingAddress;
            if (billingAddress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingAddress.writeToParcel(dest, flags);
            }
            dest.writeString(this.billingEmailAddress);
            dest.writeInt(this.expiryYear);
            dest.writeInt(this.expiryMonth);
            dest.writeString(this.brand.name());
            dest.writeStringList(this.networks);
            dest.writeString(this.cvcCheck.name());
            dest.writeString(this.funding);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Card(String str, String str2, boolean z, String str3, BillingAddress billingAddress, String str4, int i, int i2, CardBrand cardBrand, List list, CvcCheck cvcCheck, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            CvcCheck cvcCheck2;
            List list2;
            CardBrand cardBrand2;
            int i4;
            int i5;
            String str7;
            billingAddress = (i3 & 16) != 0 ? null : billingAddress;
            if ((i3 & 32) != 0) {
                str6 = str5;
                cvcCheck2 = cvcCheck;
                list2 = list;
                cardBrand2 = cardBrand;
                i4 = i2;
                i5 = i;
                str7 = null;
            } else {
                str6 = str5;
                cvcCheck2 = cvcCheck;
                list2 = list;
                cardBrand2 = cardBrand;
                i4 = i2;
                i5 = i;
                str7 = str4;
            }
            this(str, str2, z, str3, billingAddress, str7, i5, i4, cardBrand2, list2, cvcCheck2, str6);
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getId() {
            return this.id;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getLast4() {
            return this.last4;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        /* renamed from: isDefault */
        public boolean getIsDefault() {
            return this.isDefault;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getNickname() {
            return this.nickname;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }

        public final int getExpiryYear() {
            return this.expiryYear;
        }

        public final int getExpiryMonth() {
            return this.expiryMonth;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final List<String> getNetworks() {
            return this.networks;
        }

        public final CvcCheck getCvcCheck() {
            return this.cvcCheck;
        }

        public final String getFunding() {
            return this.funding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String id, String last4, boolean z, String str, BillingAddress billingAddress, String str2, int i, int i2, CardBrand brand, List<String> networks, CvcCheck cvcCheck, String funding) {
            super(id, z, "card", str, billingAddress, str2, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(last4, "last4");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(networks, "networks");
            Intrinsics.checkNotNullParameter(cvcCheck, "cvcCheck");
            Intrinsics.checkNotNullParameter(funding, "funding");
            this.id = id;
            this.last4 = last4;
            this.isDefault = z;
            this.nickname = str;
            this.billingAddress = billingAddress;
            this.billingEmailAddress = str2;
            this.expiryYear = i;
            this.expiryMonth = i2;
            this.brand = brand;
            this.networks = networks;
            this.cvcCheck = cvcCheck;
            this.funding = funding;
        }

        public final boolean getRequiresCardDetailsRecollection() {
            return isExpired() || this.cvcCheck.getRequiresRecollection();
        }

        public final boolean isExpired() {
            return !DateUtils.isExpiryDataValid(this.expiryMonth, this.expiryYear);
        }

        public final List<CardBrand> getAvailableNetworks() {
            List<String> list = this.networks;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CardBrand.INSTANCE.fromCode((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((CardBrand) obj) != CardBrand.Unknown) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
    }

    /* compiled from: ConsumerPaymentDetails.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "id", "", "paymentMethodId", "last4", "billingAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "billingEmailAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPaymentMethodId", "getLast4", "getBillingAddress", "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "getBillingEmailAddress", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Passthrough extends PaymentDetails {
        public static final String TYPE = "card";
        private final BillingAddress billingAddress;
        private final String billingEmailAddress;
        private final String id;
        private final String last4;
        private final String paymentMethodId;
        public static final Parcelable.Creator<Passthrough> CREATOR = new Creator();

        /* compiled from: ConsumerPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Passthrough> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Passthrough createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Passthrough(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BillingAddress.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Passthrough[] newArray(int i) {
                return new Passthrough[i];
            }
        }

        public static /* synthetic */ Passthrough copy$default(Passthrough passthrough, String str, String str2, String str3, BillingAddress billingAddress, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = passthrough.id;
            }
            if ((i & 2) != 0) {
                str2 = passthrough.paymentMethodId;
            }
            if ((i & 4) != 0) {
                str3 = passthrough.last4;
            }
            if ((i & 8) != 0) {
                billingAddress = passthrough.billingAddress;
            }
            if ((i & 16) != 0) {
                str4 = passthrough.billingEmailAddress;
            }
            String str5 = str4;
            String str6 = str3;
            return passthrough.copy(str, str2, str6, billingAddress, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component4, reason: from getter */
        public final BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }

        public final Passthrough copy(String id, String paymentMethodId, String last4, BillingAddress billingAddress, String billingEmailAddress) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(last4, "last4");
            return new Passthrough(id, paymentMethodId, last4, billingAddress, billingEmailAddress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passthrough)) {
                return false;
            }
            Passthrough passthrough = (Passthrough) other;
            return Intrinsics.areEqual(this.id, passthrough.id) && Intrinsics.areEqual(this.paymentMethodId, passthrough.paymentMethodId) && Intrinsics.areEqual(this.last4, passthrough.last4) && Intrinsics.areEqual(this.billingAddress, passthrough.billingAddress) && Intrinsics.areEqual(this.billingEmailAddress, passthrough.billingEmailAddress);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.paymentMethodId.hashCode()) * 31) + this.last4.hashCode()) * 31;
            BillingAddress billingAddress = this.billingAddress;
            int iHashCode2 = (iHashCode + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
            String str = this.billingEmailAddress;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Passthrough(id=" + this.id + ", paymentMethodId=" + this.paymentMethodId + ", last4=" + this.last4 + ", billingAddress=" + this.billingAddress + ", billingEmailAddress=" + this.billingEmailAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.paymentMethodId);
            dest.writeString(this.last4);
            BillingAddress billingAddress = this.billingAddress;
            if (billingAddress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingAddress.writeToParcel(dest, flags);
            }
            dest.writeString(this.billingEmailAddress);
        }

        public /* synthetic */ Passthrough(String str, String str2, String str3, BillingAddress billingAddress, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : billingAddress, (i & 16) != 0 ? null : str4);
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getId() {
            return this.id;
        }

        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getLast4() {
            return this.last4;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Passthrough(String id, String paymentMethodId, String last4, BillingAddress billingAddress, String str) {
            super(id, false, "card", null, billingAddress, str, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(last4, "last4");
            this.id = id;
            this.paymentMethodId = paymentMethodId;
            this.last4 = last4;
            this.billingAddress = billingAddress;
            this.billingEmailAddress = str;
        }
    }

    /* compiled from: ConsumerPaymentDetails.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006/"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "id", "", "last4", "isDefault", "", "nickname", "bankName", "bankIconCode", "billingAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "billingEmailAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLast4", "()Z", "getNickname", "getBankName", "getBankIconCode", "getBillingAddress", "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "getBillingEmailAddress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BankAccount extends PaymentDetails {
        public static final String TYPE = "bank_account";
        private final String bankIconCode;
        private final String bankName;
        private final BillingAddress billingAddress;
        private final String billingEmailAddress;
        private final String id;
        private final boolean isDefault;
        private final String last4;
        private final String nickname;
        public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();

        /* compiled from: ConsumerPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BillingAddress.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount[] newArray(int i) {
                return new BankAccount[i];
            }
        }

        public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, String str2, boolean z, String str3, String str4, String str5, BillingAddress billingAddress, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.last4;
            }
            if ((i & 4) != 0) {
                z = bankAccount.isDefault;
            }
            if ((i & 8) != 0) {
                str3 = bankAccount.nickname;
            }
            if ((i & 16) != 0) {
                str4 = bankAccount.bankName;
            }
            if ((i & 32) != 0) {
                str5 = bankAccount.bankIconCode;
            }
            if ((i & 64) != 0) {
                billingAddress = bankAccount.billingAddress;
            }
            if ((i & 128) != 0) {
                str6 = bankAccount.billingEmailAddress;
            }
            BillingAddress billingAddress2 = billingAddress;
            String str7 = str6;
            String str8 = str4;
            String str9 = str5;
            return bankAccount.copy(str, str2, z, str3, str8, str9, billingAddress2, str7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDefault() {
            return this.isDefault;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBankIconCode() {
            return this.bankIconCode;
        }

        /* renamed from: component7, reason: from getter */
        public final BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }

        public final BankAccount copy(String id, String last4, boolean isDefault, String nickname, String bankName, String bankIconCode, BillingAddress billingAddress, String billingEmailAddress) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(last4, "last4");
            return new BankAccount(id, last4, isDefault, nickname, bankName, bankIconCode, billingAddress, billingEmailAddress);
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
            return Intrinsics.areEqual(this.id, bankAccount.id) && Intrinsics.areEqual(this.last4, bankAccount.last4) && this.isDefault == bankAccount.isDefault && Intrinsics.areEqual(this.nickname, bankAccount.nickname) && Intrinsics.areEqual(this.bankName, bankAccount.bankName) && Intrinsics.areEqual(this.bankIconCode, bankAccount.bankIconCode) && Intrinsics.areEqual(this.billingAddress, bankAccount.billingAddress) && Intrinsics.areEqual(this.billingEmailAddress, bankAccount.billingEmailAddress);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.last4.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31;
            String str = this.nickname;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bankName;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bankIconCode;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BillingAddress billingAddress = this.billingAddress;
            int iHashCode5 = (iHashCode4 + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
            String str4 = this.billingEmailAddress;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "BankAccount(id=" + this.id + ", last4=" + this.last4 + ", isDefault=" + this.isDefault + ", nickname=" + this.nickname + ", bankName=" + this.bankName + ", bankIconCode=" + this.bankIconCode + ", billingAddress=" + this.billingAddress + ", billingEmailAddress=" + this.billingEmailAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.last4);
            dest.writeInt(this.isDefault ? 1 : 0);
            dest.writeString(this.nickname);
            dest.writeString(this.bankName);
            dest.writeString(this.bankIconCode);
            BillingAddress billingAddress = this.billingAddress;
            if (billingAddress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingAddress.writeToParcel(dest, flags);
            }
            dest.writeString(this.billingEmailAddress);
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getId() {
            return this.id;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getLast4() {
            return this.last4;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        /* renamed from: isDefault */
        public boolean getIsDefault() {
            return this.isDefault;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getNickname() {
            return this.nickname;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getBankIconCode() {
            return this.bankIconCode;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getBillingEmailAddress() {
            return this.billingEmailAddress;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(String id, String last4, boolean z, String str, String str2, String str3, BillingAddress billingAddress, String str4) {
            super(id, z, "bank_account", str, billingAddress, str4, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(last4, "last4");
            this.id = id;
            this.last4 = last4;
            this.isDefault = z;
            this.nickname = str;
            this.bankName = str2;
            this.bankIconCode = str3;
            this.billingAddress = billingAddress;
            this.billingEmailAddress = str4;
        }
    }

    /* compiled from: ConsumerPaymentDetails.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "Landroid/os/Parcelable;", "name", "", "line1", "line2", "administrativeArea", "locality", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V", "getName", "()Ljava/lang/String;", "getLine1", "getLine2", "getAdministrativeArea", "getLocality", "getPostalCode", "getCountryCode", "()Lcom/stripe/android/core/model/CountryCode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingAddress implements Parcelable {
        public static final Parcelable.Creator<BillingAddress> CREATOR = new Creator();
        private final String administrativeArea;
        private final CountryCode countryCode;
        private final String line1;
        private final String line2;
        private final String locality;
        private final String name;
        private final String postalCode;

        /* compiled from: ConsumerPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CountryCode) parcel.readParcelable(BillingAddress.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddress[] newArray(int i) {
                return new BillingAddress[i];
            }
        }

        public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, String str3, String str4, String str5, String str6, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = billingAddress.name;
            }
            if ((i & 2) != 0) {
                str2 = billingAddress.line1;
            }
            if ((i & 4) != 0) {
                str3 = billingAddress.line2;
            }
            if ((i & 8) != 0) {
                str4 = billingAddress.administrativeArea;
            }
            if ((i & 16) != 0) {
                str5 = billingAddress.locality;
            }
            if ((i & 32) != 0) {
                str6 = billingAddress.postalCode;
            }
            if ((i & 64) != 0) {
                countryCode = billingAddress.countryCode;
            }
            String str7 = str6;
            CountryCode countryCode2 = countryCode;
            String str8 = str5;
            String str9 = str3;
            return billingAddress.copy(str, str2, str9, str4, str8, str7, countryCode2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLine1() {
            return this.line1;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLine2() {
            return this.line2;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAdministrativeArea() {
            return this.administrativeArea;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component7, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final BillingAddress copy(String name, String line1, String line2, String administrativeArea, String locality, String postalCode, CountryCode countryCode) {
            return new BillingAddress(name, line1, line2, administrativeArea, locality, postalCode, countryCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingAddress)) {
                return false;
            }
            BillingAddress billingAddress = (BillingAddress) other;
            return Intrinsics.areEqual(this.name, billingAddress.name) && Intrinsics.areEqual(this.line1, billingAddress.line1) && Intrinsics.areEqual(this.line2, billingAddress.line2) && Intrinsics.areEqual(this.administrativeArea, billingAddress.administrativeArea) && Intrinsics.areEqual(this.locality, billingAddress.locality) && Intrinsics.areEqual(this.postalCode, billingAddress.postalCode) && Intrinsics.areEqual(this.countryCode, billingAddress.countryCode);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.line1;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.line2;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.administrativeArea;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locality;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.postalCode;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            CountryCode countryCode = this.countryCode;
            return iHashCode6 + (countryCode != null ? countryCode.hashCode() : 0);
        }

        public String toString() {
            return "BillingAddress(name=" + this.name + ", line1=" + this.line1 + ", line2=" + this.line2 + ", administrativeArea=" + this.administrativeArea + ", locality=" + this.locality + ", postalCode=" + this.postalCode + ", countryCode=" + this.countryCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.line1);
            dest.writeString(this.line2);
            dest.writeString(this.administrativeArea);
            dest.writeString(this.locality);
            dest.writeString(this.postalCode);
            dest.writeParcelable(this.countryCode, flags);
        }

        public BillingAddress(String str, String str2, String str3, String str4, String str5, String str6, CountryCode countryCode) {
            this.name = str;
            this.line1 = str2;
            this.line2 = str3;
            this.administrativeArea = str4;
            this.locality = str5;
            this.postalCode = str6;
            this.countryCode = countryCode;
        }

        public final String getName() {
            return this.name;
        }

        public final String getLine1() {
            return this.line1;
        }

        public final String getLine2() {
            return this.line2;
        }

        public final String getAdministrativeArea() {
            return this.administrativeArea;
        }

        public final String getLocality() {
            return this.locality;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }
    }
}

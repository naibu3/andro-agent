package com.stripe.android.link.ui.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPaymentUI.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;", "Landroid/os/Parcelable;", "paymentType", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;", "last4", "", "<init>", "(Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;Ljava/lang/String;)V", "getPaymentType", "()Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;", "getLast4", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "PaymentType", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DefaultPaymentUI implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DefaultPaymentUI> CREATOR = new Creator();
    private final String last4;
    private final PaymentType paymentType;

    /* compiled from: DefaultPaymentUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DefaultPaymentUI> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPaymentUI createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DefaultPaymentUI((PaymentType) parcel.readParcelable(DefaultPaymentUI.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPaymentUI[] newArray(int i) {
            return new DefaultPaymentUI[i];
        }
    }

    public static /* synthetic */ DefaultPaymentUI copy$default(DefaultPaymentUI defaultPaymentUI, PaymentType paymentType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentType = defaultPaymentUI.paymentType;
        }
        if ((i & 2) != 0) {
            str = defaultPaymentUI.last4;
        }
        return defaultPaymentUI.copy(paymentType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    public final DefaultPaymentUI copy(PaymentType paymentType, String last4) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(last4, "last4");
        return new DefaultPaymentUI(paymentType, last4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultPaymentUI)) {
            return false;
        }
        DefaultPaymentUI defaultPaymentUI = (DefaultPaymentUI) other;
        return Intrinsics.areEqual(this.paymentType, defaultPaymentUI.paymentType) && Intrinsics.areEqual(this.last4, defaultPaymentUI.last4);
    }

    public int hashCode() {
        return (this.paymentType.hashCode() * 31) + this.last4.hashCode();
    }

    public String toString() {
        return "DefaultPaymentUI(paymentType=" + this.paymentType + ", last4=" + this.last4 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.paymentType, flags);
        dest.writeString(this.last4);
    }

    public DefaultPaymentUI(PaymentType paymentType, String last4) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(last4, "last4");
        this.paymentType = paymentType;
        this.last4 = last4;
    }

    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    public final String getLast4() {
        return this.last4;
    }

    /* compiled from: DefaultPaymentUI.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;", "Landroid/os/Parcelable;", "Card", "BankAccount", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PaymentType extends Parcelable {

        /* compiled from: DefaultPaymentUI.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;", "iconRes", "", "<init>", "(I)V", "getIconRes", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Card implements PaymentType {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Card> CREATOR = new Creator();
            private final int iconRes;

            /* compiled from: DefaultPaymentUI.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Card> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Card(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card[] newArray(int i) {
                    return new Card[i];
                }
            }

            public static /* synthetic */ Card copy$default(Card card, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = card.iconRes;
                }
                return card.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getIconRes() {
                return this.iconRes;
            }

            public final Card copy(int iconRes) {
                return new Card(iconRes);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Card) && this.iconRes == ((Card) other).iconRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.iconRes);
            }

            public String toString() {
                return "Card(iconRes=" + this.iconRes + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.iconRes);
            }

            public Card(int i) {
                this.iconRes = i;
            }

            public final int getIconRes() {
                return this.iconRes;
            }
        }

        /* compiled from: DefaultPaymentUI.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;", "bankIconCode", "", "<init>", "(Ljava/lang/String;)V", "getBankIconCode", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BankAccount implements PaymentType {
            public static final int $stable = 0;
            public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();
            private final String bankIconCode;

            /* compiled from: DefaultPaymentUI.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BankAccount> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BankAccount createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BankAccount(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BankAccount[] newArray(int i) {
                    return new BankAccount[i];
                }
            }

            public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bankAccount.bankIconCode;
                }
                return bankAccount.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBankIconCode() {
                return this.bankIconCode;
            }

            public final BankAccount copy(String bankIconCode) {
                return new BankAccount(bankIconCode);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BankAccount) && Intrinsics.areEqual(this.bankIconCode, ((BankAccount) other).bankIconCode);
            }

            public int hashCode() {
                String str = this.bankIconCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "BankAccount(bankIconCode=" + this.bankIconCode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.bankIconCode);
            }

            public BankAccount(String str) {
                this.bankIconCode = str;
            }

            public final String getBankIconCode() {
                return this.bankIconCode;
            }
        }
    }
}

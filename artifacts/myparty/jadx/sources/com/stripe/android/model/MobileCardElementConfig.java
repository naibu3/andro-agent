package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.MobileCardElementConfigParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileCardElementConfig.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/MobileCardElementConfig;", "Lcom/stripe/android/core/model/StripeModel;", "cardBrandChoice", "Lcom/stripe/android/model/MobileCardElementConfig$CardBrandChoice;", "<init>", "(Lcom/stripe/android/model/MobileCardElementConfig$CardBrandChoice;)V", "getCardBrandChoice", "()Lcom/stripe/android/model/MobileCardElementConfig$CardBrandChoice;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "CardBrandChoice", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MobileCardElementConfig implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MobileCardElementConfig> CREATOR = new Creator();
    private final CardBrandChoice cardBrandChoice;

    /* compiled from: MobileCardElementConfig.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MobileCardElementConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileCardElementConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MobileCardElementConfig(CardBrandChoice.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileCardElementConfig[] newArray(int i) {
            return new MobileCardElementConfig[i];
        }
    }

    public static /* synthetic */ MobileCardElementConfig copy$default(MobileCardElementConfig mobileCardElementConfig, CardBrandChoice cardBrandChoice, int i, Object obj) {
        if ((i & 1) != 0) {
            cardBrandChoice = mobileCardElementConfig.cardBrandChoice;
        }
        return mobileCardElementConfig.copy(cardBrandChoice);
    }

    /* renamed from: component1, reason: from getter */
    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    public final MobileCardElementConfig copy(CardBrandChoice cardBrandChoice) {
        Intrinsics.checkNotNullParameter(cardBrandChoice, "cardBrandChoice");
        return new MobileCardElementConfig(cardBrandChoice);
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
        return (other instanceof MobileCardElementConfig) && Intrinsics.areEqual(this.cardBrandChoice, ((MobileCardElementConfig) other).cardBrandChoice);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.cardBrandChoice.hashCode();
    }

    public String toString() {
        return "MobileCardElementConfig(cardBrandChoice=" + this.cardBrandChoice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.cardBrandChoice.writeToParcel(dest, flags);
    }

    public MobileCardElementConfig(CardBrandChoice cardBrandChoice) {
        Intrinsics.checkNotNullParameter(cardBrandChoice, "cardBrandChoice");
        this.cardBrandChoice = cardBrandChoice;
    }

    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    /* compiled from: MobileCardElementConfig.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/MobileCardElementConfig$CardBrandChoice;", "Landroid/os/Parcelable;", MobileCardElementConfigParser.FIELD_ELIGIBLE, "", "<init>", "(Z)V", "getEligible", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardBrandChoice implements Parcelable {
        private final boolean eligible;
        public static final Parcelable.Creator<CardBrandChoice> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: MobileCardElementConfig.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardBrandChoice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBrandChoice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardBrandChoice(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBrandChoice[] newArray(int i) {
                return new CardBrandChoice[i];
            }
        }

        public static /* synthetic */ CardBrandChoice copy$default(CardBrandChoice cardBrandChoice, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cardBrandChoice.eligible;
            }
            return cardBrandChoice.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEligible() {
            return this.eligible;
        }

        public final CardBrandChoice copy(boolean eligible) {
            return new CardBrandChoice(eligible);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardBrandChoice) && this.eligible == ((CardBrandChoice) other).eligible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.eligible);
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.eligible + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.eligible ? 1 : 0);
        }

        public CardBrandChoice(boolean z) {
            this.eligible = z;
        }

        public final boolean getEligible() {
            return this.eligible;
        }
    }
}

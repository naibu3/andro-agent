package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkConsumerIncentive.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/LinkConsumerIncentive;", "Lcom/stripe/android/core/model/StripeModel;", "incentiveParams", "Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;", "incentiveDisplayText", "", "<init>", "(Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;Ljava/lang/String;)V", "getIncentiveParams", "()Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;", "getIncentiveDisplayText", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "IncentiveParams", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkConsumerIncentive implements StripeModel {
    public static final Parcelable.Creator<LinkConsumerIncentive> CREATOR = new Creator();
    private final String incentiveDisplayText;
    private final IncentiveParams incentiveParams;

    /* compiled from: LinkConsumerIncentive.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkConsumerIncentive> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkConsumerIncentive createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkConsumerIncentive(IncentiveParams.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkConsumerIncentive[] newArray(int i) {
            return new LinkConsumerIncentive[i];
        }
    }

    public static /* synthetic */ LinkConsumerIncentive copy$default(LinkConsumerIncentive linkConsumerIncentive, IncentiveParams incentiveParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            incentiveParams = linkConsumerIncentive.incentiveParams;
        }
        if ((i & 2) != 0) {
            str = linkConsumerIncentive.incentiveDisplayText;
        }
        return linkConsumerIncentive.copy(incentiveParams, str);
    }

    /* renamed from: component1, reason: from getter */
    public final IncentiveParams getIncentiveParams() {
        return this.incentiveParams;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIncentiveDisplayText() {
        return this.incentiveDisplayText;
    }

    public final LinkConsumerIncentive copy(IncentiveParams incentiveParams, String incentiveDisplayText) {
        Intrinsics.checkNotNullParameter(incentiveParams, "incentiveParams");
        return new LinkConsumerIncentive(incentiveParams, incentiveDisplayText);
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
        if (!(other instanceof LinkConsumerIncentive)) {
            return false;
        }
        LinkConsumerIncentive linkConsumerIncentive = (LinkConsumerIncentive) other;
        return Intrinsics.areEqual(this.incentiveParams, linkConsumerIncentive.incentiveParams) && Intrinsics.areEqual(this.incentiveDisplayText, linkConsumerIncentive.incentiveDisplayText);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = this.incentiveParams.hashCode() * 31;
        String str = this.incentiveDisplayText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LinkConsumerIncentive(incentiveParams=" + this.incentiveParams + ", incentiveDisplayText=" + this.incentiveDisplayText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.incentiveParams.writeToParcel(dest, flags);
        dest.writeString(this.incentiveDisplayText);
    }

    public LinkConsumerIncentive(IncentiveParams incentiveParams, String str) {
        Intrinsics.checkNotNullParameter(incentiveParams, "incentiveParams");
        this.incentiveParams = incentiveParams;
        this.incentiveDisplayText = str;
    }

    public final IncentiveParams getIncentiveParams() {
        return this.incentiveParams;
    }

    public final String getIncentiveDisplayText() {
        return this.incentiveDisplayText;
    }

    /* compiled from: LinkConsumerIncentive.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;", "Lcom/stripe/android/core/model/StripeModel;", "paymentMethod", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethod", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IncentiveParams implements StripeModel {
        public static final Parcelable.Creator<IncentiveParams> CREATOR = new Creator();
        private final String paymentMethod;

        /* compiled from: LinkConsumerIncentive.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IncentiveParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IncentiveParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncentiveParams(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IncentiveParams[] newArray(int i) {
                return new IncentiveParams[i];
            }
        }

        public static /* synthetic */ IncentiveParams copy$default(IncentiveParams incentiveParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = incentiveParams.paymentMethod;
            }
            return incentiveParams.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final IncentiveParams copy(String paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new IncentiveParams(paymentMethod);
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
            return (other instanceof IncentiveParams) && Intrinsics.areEqual(this.paymentMethod, ((IncentiveParams) other).paymentMethod);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return this.paymentMethod.hashCode();
        }

        public String toString() {
            return "IncentiveParams(paymentMethod=" + this.paymentMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.paymentMethod);
        }

        public IncentiveParams(String paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }
    }
}

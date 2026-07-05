package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.link.LinkAccountUpdate;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeLinkArgs.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/stripe/android/link/NativeLinkArgs;", "Landroid/os/Parcelable;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "linkExpressMode", "Lcom/stripe/android/link/LinkExpressMode;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "paymentElementCallbackIdentifier", "launchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Ljava/lang/String;Lcom/stripe/android/link/LinkLaunchMode;)V", "getConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getLinkExpressMode", "()Lcom/stripe/android/link/LinkExpressMode;", "getLinkAccountInfo", "()Lcom/stripe/android/link/LinkAccountUpdate$Value;", "getPaymentElementCallbackIdentifier", "getLaunchMode", "()Lcom/stripe/android/link/LinkLaunchMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeLinkArgs implements Parcelable {
    private final LinkConfiguration configuration;
    private final LinkLaunchMode launchMode;
    private final LinkAccountUpdate.Value linkAccountInfo;
    private final LinkExpressMode linkExpressMode;
    private final String paymentElementCallbackIdentifier;
    private final String publishableKey;
    private final String stripeAccountId;
    public static final Parcelable.Creator<NativeLinkArgs> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: NativeLinkArgs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NativeLinkArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NativeLinkArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NativeLinkArgs(LinkConfiguration.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), LinkExpressMode.valueOf(parcel.readString()), LinkAccountUpdate.Value.CREATOR.createFromParcel(parcel), parcel.readString(), (LinkLaunchMode) parcel.readParcelable(NativeLinkArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NativeLinkArgs[] newArray(int i) {
            return new NativeLinkArgs[i];
        }
    }

    public static /* synthetic */ NativeLinkArgs copy$default(NativeLinkArgs nativeLinkArgs, LinkConfiguration linkConfiguration, String str, String str2, LinkExpressMode linkExpressMode, LinkAccountUpdate.Value value, String str3, LinkLaunchMode linkLaunchMode, int i, Object obj) {
        if ((i & 1) != 0) {
            linkConfiguration = nativeLinkArgs.configuration;
        }
        if ((i & 2) != 0) {
            str = nativeLinkArgs.publishableKey;
        }
        if ((i & 4) != 0) {
            str2 = nativeLinkArgs.stripeAccountId;
        }
        if ((i & 8) != 0) {
            linkExpressMode = nativeLinkArgs.linkExpressMode;
        }
        if ((i & 16) != 0) {
            value = nativeLinkArgs.linkAccountInfo;
        }
        if ((i & 32) != 0) {
            str3 = nativeLinkArgs.paymentElementCallbackIdentifier;
        }
        if ((i & 64) != 0) {
            linkLaunchMode = nativeLinkArgs.launchMode;
        }
        String str4 = str3;
        LinkLaunchMode linkLaunchMode2 = linkLaunchMode;
        LinkAccountUpdate.Value value2 = value;
        String str5 = str2;
        return nativeLinkArgs.copy(linkConfiguration, str, str5, linkExpressMode, value2, str4, linkLaunchMode2);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    /* renamed from: component4, reason: from getter */
    public final LinkExpressMode getLinkExpressMode() {
        return this.linkExpressMode;
    }

    /* renamed from: component5, reason: from getter */
    public final LinkAccountUpdate.Value getLinkAccountInfo() {
        return this.linkAccountInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    /* renamed from: component7, reason: from getter */
    public final LinkLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final NativeLinkArgs copy(LinkConfiguration configuration, String publishableKey, String stripeAccountId, LinkExpressMode linkExpressMode, LinkAccountUpdate.Value linkAccountInfo, String paymentElementCallbackIdentifier, LinkLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(linkExpressMode, "linkExpressMode");
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new NativeLinkArgs(configuration, publishableKey, stripeAccountId, linkExpressMode, linkAccountInfo, paymentElementCallbackIdentifier, launchMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeLinkArgs)) {
            return false;
        }
        NativeLinkArgs nativeLinkArgs = (NativeLinkArgs) other;
        return Intrinsics.areEqual(this.configuration, nativeLinkArgs.configuration) && Intrinsics.areEqual(this.publishableKey, nativeLinkArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, nativeLinkArgs.stripeAccountId) && this.linkExpressMode == nativeLinkArgs.linkExpressMode && Intrinsics.areEqual(this.linkAccountInfo, nativeLinkArgs.linkAccountInfo) && Intrinsics.areEqual(this.paymentElementCallbackIdentifier, nativeLinkArgs.paymentElementCallbackIdentifier) && Intrinsics.areEqual(this.launchMode, nativeLinkArgs.launchMode);
    }

    public int hashCode() {
        int iHashCode = ((this.configuration.hashCode() * 31) + this.publishableKey.hashCode()) * 31;
        String str = this.stripeAccountId;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.linkExpressMode.hashCode()) * 31) + this.linkAccountInfo.hashCode()) * 31) + this.paymentElementCallbackIdentifier.hashCode()) * 31) + this.launchMode.hashCode();
    }

    public String toString() {
        return "NativeLinkArgs(configuration=" + this.configuration + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", linkExpressMode=" + this.linkExpressMode + ", linkAccountInfo=" + this.linkAccountInfo + ", paymentElementCallbackIdentifier=" + this.paymentElementCallbackIdentifier + ", launchMode=" + this.launchMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.configuration.writeToParcel(dest, flags);
        dest.writeString(this.publishableKey);
        dest.writeString(this.stripeAccountId);
        dest.writeString(this.linkExpressMode.name());
        this.linkAccountInfo.writeToParcel(dest, flags);
        dest.writeString(this.paymentElementCallbackIdentifier);
        dest.writeParcelable(this.launchMode, flags);
    }

    public NativeLinkArgs(LinkConfiguration configuration, String publishableKey, String str, LinkExpressMode linkExpressMode, LinkAccountUpdate.Value linkAccountInfo, String paymentElementCallbackIdentifier, LinkLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(linkExpressMode, "linkExpressMode");
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.configuration = configuration;
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.linkExpressMode = linkExpressMode;
        this.linkAccountInfo = linkAccountInfo;
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.launchMode = launchMode;
    }

    public final LinkConfiguration getConfiguration() {
        return this.configuration;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public final LinkExpressMode getLinkExpressMode() {
        return this.linkExpressMode;
    }

    public final LinkAccountUpdate.Value getLinkAccountInfo() {
        return this.linkAccountInfo;
    }

    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    public final LinkLaunchMode getLaunchMode() {
        return this.launchMode;
    }
}

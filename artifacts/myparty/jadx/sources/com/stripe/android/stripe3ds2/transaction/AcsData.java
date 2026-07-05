package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcsData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "Landroid/os/Parcelable;", "acsUrl", "", DefaultAcsDataParser.FIELD_ACS_EPHEM_PUB_KEY, "Ljava/security/interfaces/ECPublicKey;", DefaultAcsDataParser.FIELD_SDK_EPHEM_PUB_KEY, "<init>", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)V", "getAcsUrl", "()Ljava/lang/String;", "getAcsEphemPubKey", "()Ljava/security/interfaces/ECPublicKey;", "getSdkEphemPubKey", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AcsData implements Parcelable {
    public static final Parcelable.Creator<AcsData> CREATOR = new Creator();
    private final ECPublicKey acsEphemPubKey;
    private final String acsUrl;
    private final ECPublicKey sdkEphemPubKey;

    /* compiled from: AcsData.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AcsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcsData(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcsData[] newArray(int i) {
            return new AcsData[i];
        }
    }

    public static /* synthetic */ AcsData copy$default(AcsData acsData, String str, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acsData.acsUrl;
        }
        if ((i & 2) != 0) {
            eCPublicKey = acsData.acsEphemPubKey;
        }
        if ((i & 4) != 0) {
            eCPublicKey2 = acsData.sdkEphemPubKey;
        }
        return acsData.copy(str, eCPublicKey, eCPublicKey2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAcsUrl() {
        return this.acsUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    /* renamed from: component3, reason: from getter */
    public final ECPublicKey getSdkEphemPubKey() {
        return this.sdkEphemPubKey;
    }

    public final AcsData copy(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
        Intrinsics.checkNotNullParameter(acsEphemPubKey, "acsEphemPubKey");
        Intrinsics.checkNotNullParameter(sdkEphemPubKey, "sdkEphemPubKey");
        return new AcsData(acsUrl, acsEphemPubKey, sdkEphemPubKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcsData)) {
            return false;
        }
        AcsData acsData = (AcsData) other;
        return Intrinsics.areEqual(this.acsUrl, acsData.acsUrl) && Intrinsics.areEqual(this.acsEphemPubKey, acsData.acsEphemPubKey) && Intrinsics.areEqual(this.sdkEphemPubKey, acsData.sdkEphemPubKey);
    }

    public int hashCode() {
        return (((this.acsUrl.hashCode() * 31) + this.acsEphemPubKey.hashCode()) * 31) + this.sdkEphemPubKey.hashCode();
    }

    public String toString() {
        return "AcsData(acsUrl=" + this.acsUrl + ", acsEphemPubKey=" + this.acsEphemPubKey + ", sdkEphemPubKey=" + this.sdkEphemPubKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.acsUrl);
        dest.writeSerializable(this.acsEphemPubKey);
        dest.writeSerializable(this.sdkEphemPubKey);
    }

    public AcsData(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
        Intrinsics.checkNotNullParameter(acsEphemPubKey, "acsEphemPubKey");
        Intrinsics.checkNotNullParameter(sdkEphemPubKey, "sdkEphemPubKey");
        this.acsUrl = acsUrl;
        this.acsEphemPubKey = acsEphemPubKey;
        this.sdkEphemPubKey = sdkEphemPubKey;
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    public final ECPublicKey getSdkEphemPubKey() {
        return this.sdkEphemPubKey;
    }
}

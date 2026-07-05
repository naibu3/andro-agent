package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeParameters.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006)"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "Landroid/os/Parcelable;", "threeDsServerTransactionId", "", "acsTransactionId", "acsRefNumber", "acsSignedContent", ChallengeRequestData.FIELD_THREE_DS_REQUESTOR_APP_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getThreeDsServerTransactionId", "()Ljava/lang/String;", "setThreeDsServerTransactionId", "(Ljava/lang/String;)V", "getAcsTransactionId", "setAcsTransactionId", "getAcsRefNumber", "setAcsRefNumber", "getAcsSignedContent", "setAcsSignedContent", "getThreeDSRequestorAppURL", "setThreeDSRequestorAppURL", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeParameters implements Parcelable {
    public static final Parcelable.Creator<ChallengeParameters> CREATOR = new Creator();
    private String acsRefNumber;
    private String acsSignedContent;
    private String acsTransactionId;
    private String threeDSRequestorAppURL;
    private String threeDsServerTransactionId;

    /* compiled from: ChallengeParameters.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeParameters[] newArray(int i) {
            return new ChallengeParameters[i];
        }
    }

    public ChallengeParameters() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ChallengeParameters copy$default(ChallengeParameters challengeParameters, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeParameters.threeDsServerTransactionId;
        }
        if ((i & 2) != 0) {
            str2 = challengeParameters.acsTransactionId;
        }
        if ((i & 4) != 0) {
            str3 = challengeParameters.acsRefNumber;
        }
        if ((i & 8) != 0) {
            str4 = challengeParameters.acsSignedContent;
        }
        if ((i & 16) != 0) {
            str5 = challengeParameters.threeDSRequestorAppURL;
        }
        String str6 = str5;
        String str7 = str3;
        return challengeParameters.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAcsRefNumber() {
        return this.acsRefNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    /* renamed from: component5, reason: from getter */
    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    public final ChallengeParameters copy(String threeDsServerTransactionId, String acsTransactionId, String acsRefNumber, String acsSignedContent, String threeDSRequestorAppURL) {
        return new ChallengeParameters(threeDsServerTransactionId, acsTransactionId, acsRefNumber, acsSignedContent, threeDSRequestorAppURL);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeParameters)) {
            return false;
        }
        ChallengeParameters challengeParameters = (ChallengeParameters) other;
        return Intrinsics.areEqual(this.threeDsServerTransactionId, challengeParameters.threeDsServerTransactionId) && Intrinsics.areEqual(this.acsTransactionId, challengeParameters.acsTransactionId) && Intrinsics.areEqual(this.acsRefNumber, challengeParameters.acsRefNumber) && Intrinsics.areEqual(this.acsSignedContent, challengeParameters.acsSignedContent) && Intrinsics.areEqual(this.threeDSRequestorAppURL, challengeParameters.threeDSRequestorAppURL);
    }

    public int hashCode() {
        String str = this.threeDsServerTransactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransactionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acsRefNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acsSignedContent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDSRequestorAppURL;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + this.threeDsServerTransactionId + ", acsTransactionId=" + this.acsTransactionId + ", acsRefNumber=" + this.acsRefNumber + ", acsSignedContent=" + this.acsSignedContent + ", threeDSRequestorAppURL=" + this.threeDSRequestorAppURL + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.threeDsServerTransactionId);
        dest.writeString(this.acsTransactionId);
        dest.writeString(this.acsRefNumber);
        dest.writeString(this.acsSignedContent);
        dest.writeString(this.threeDSRequestorAppURL);
    }

    public ChallengeParameters(String str, String str2, String str3, String str4, String str5) {
        this.threeDsServerTransactionId = str;
        this.acsTransactionId = str2;
        this.acsRefNumber = str3;
        this.acsSignedContent = str4;
        this.threeDSRequestorAppURL = str5;
    }

    public /* synthetic */ ChallengeParameters(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    public final void setThreeDsServerTransactionId(String str) {
        this.threeDsServerTransactionId = str;
    }

    public final String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    public final void setAcsTransactionId(String str) {
        this.acsTransactionId = str;
    }

    public final String getAcsRefNumber() {
        return this.acsRefNumber;
    }

    public final void setAcsRefNumber(String str) {
        this.acsRefNumber = str;
    }

    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final void setAcsSignedContent(String str) {
        this.acsSignedContent = str;
    }

    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    public final void setThreeDSRequestorAppURL(String str) {
        this.threeDSRequestorAppURL = str;
    }
}

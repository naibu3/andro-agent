package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsumerSessionRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006#"}, d2 = {"Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;", "Landroid/os/Parcelable;", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "clientSecret", "publishableKey", "isVerified", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEmailAddress", "()Ljava/lang/String;", "getPhoneNumber", "getClientSecret", "getPublishableKey", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CachedConsumerSession implements Parcelable {
    private final String clientSecret;
    private final String emailAddress;
    private final boolean isVerified;
    private final String phoneNumber;
    private final String publishableKey;
    public static final Parcelable.Creator<CachedConsumerSession> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CachedConsumerSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CachedConsumerSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CachedConsumerSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CachedConsumerSession[] newArray(int i) {
            return new CachedConsumerSession[i];
        }
    }

    public static /* synthetic */ CachedConsumerSession copy$default(CachedConsumerSession cachedConsumerSession, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cachedConsumerSession.emailAddress;
        }
        if ((i & 2) != 0) {
            str2 = cachedConsumerSession.phoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = cachedConsumerSession.clientSecret;
        }
        if ((i & 8) != 0) {
            str4 = cachedConsumerSession.publishableKey;
        }
        if ((i & 16) != 0) {
            z = cachedConsumerSession.isVerified;
        }
        boolean z2 = z;
        String str5 = str3;
        return cachedConsumerSession.copy(str, str2, str5, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    public final CachedConsumerSession copy(String emailAddress, String phoneNumber, String clientSecret, String publishableKey, boolean isVerified) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new CachedConsumerSession(emailAddress, phoneNumber, clientSecret, publishableKey, isVerified);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedConsumerSession)) {
            return false;
        }
        CachedConsumerSession cachedConsumerSession = (CachedConsumerSession) other;
        return Intrinsics.areEqual(this.emailAddress, cachedConsumerSession.emailAddress) && Intrinsics.areEqual(this.phoneNumber, cachedConsumerSession.phoneNumber) && Intrinsics.areEqual(this.clientSecret, cachedConsumerSession.clientSecret) && Intrinsics.areEqual(this.publishableKey, cachedConsumerSession.publishableKey) && this.isVerified == cachedConsumerSession.isVerified;
    }

    public int hashCode() {
        int iHashCode = ((((this.emailAddress.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.clientSecret.hashCode()) * 31;
        String str = this.publishableKey;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isVerified);
    }

    public String toString() {
        return "CachedConsumerSession(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ", clientSecret=" + this.clientSecret + ", publishableKey=" + this.publishableKey + ", isVerified=" + this.isVerified + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.emailAddress);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.clientSecret);
        dest.writeString(this.publishableKey);
        dest.writeInt(this.isVerified ? 1 : 0);
    }

    public CachedConsumerSession(String emailAddress, String phoneNumber, String clientSecret, String str, boolean z) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.clientSecret = clientSecret;
        this.publishableKey = str;
        this.isVerified = z;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }
}

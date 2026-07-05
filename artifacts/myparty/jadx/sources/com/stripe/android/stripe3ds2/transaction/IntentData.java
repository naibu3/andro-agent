package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentData.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "Landroid/os/Parcelable;", "clientSecret", "", "sourceId", "publishableKey", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getSourceId", "getPublishableKey", "getAccountId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IntentData implements Parcelable {
    private final String accountId;
    private final String clientSecret;
    private final String publishableKey;
    private final String sourceId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<IntentData> CREATOR = new Creator();
    private static final IntentData EMPTY = new IntentData("", "", "", null);

    /* compiled from: IntentData.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IntentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentData[] newArray(int i) {
            return new IntentData[i];
        }
    }

    public static /* synthetic */ IntentData copy$default(IntentData intentData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intentData.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = intentData.sourceId;
        }
        if ((i & 4) != 0) {
            str3 = intentData.publishableKey;
        }
        if ((i & 8) != 0) {
            str4 = intentData.accountId;
        }
        return intentData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    public final IntentData copy(String clientSecret, String sourceId, String publishableKey, String accountId) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        return new IntentData(clientSecret, sourceId, publishableKey, accountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntentData)) {
            return false;
        }
        IntentData intentData = (IntentData) other;
        return Intrinsics.areEqual(this.clientSecret, intentData.clientSecret) && Intrinsics.areEqual(this.sourceId, intentData.sourceId) && Intrinsics.areEqual(this.publishableKey, intentData.publishableKey) && Intrinsics.areEqual(this.accountId, intentData.accountId);
    }

    public int hashCode() {
        int iHashCode = ((((this.clientSecret.hashCode() * 31) + this.sourceId.hashCode()) * 31) + this.publishableKey.hashCode()) * 31;
        String str = this.accountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.clientSecret + ", sourceId=" + this.sourceId + ", publishableKey=" + this.publishableKey + ", accountId=" + this.accountId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.clientSecret);
        dest.writeString(this.sourceId);
        dest.writeString(this.publishableKey);
        dest.writeString(this.accountId);
    }

    public IntentData(String clientSecret, String sourceId, String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.clientSecret = clientSecret;
        this.sourceId = sourceId;
        this.publishableKey = publishableKey;
        this.accountId = str;
    }

    public /* synthetic */ IntentData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    /* compiled from: IntentData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/IntentData$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getEMPTY", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntentData getEMPTY() {
            return IntentData.EMPTY;
        }
    }
}

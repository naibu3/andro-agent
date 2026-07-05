package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeModel;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EphemeralKey.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001a\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000e\u0010'\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b(J^\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b*J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\f\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u00067"}, d2 = {"Lcom/stripe/android/EphemeralKey;", "Lcom/stripe/android/core/model/StripeModel;", "objectId", "", "created", "", PermissionsResponse.EXPIRES_KEY, "id", NamedConstantsKt.IS_LIVE_MODE, "", "objectType", "secret", "type", "<init>", "(Ljava/lang/String;JJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getObjectId$payments_core_release", "()Ljava/lang/String;", "getCreated$payments_core_release", "()J", "getExpires$payments_core_release", "getId$payments_core_release", "isLiveMode$payments_core_release", "()Z", "getObjectType$payments_core_release", "getSecret", "getType$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "component8", "component8$payments_core_release", "copy", "copy$payments_core_release", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EphemeralKey implements StripeModel {
    private final long created;
    private final long expires;
    private final String id;
    private final boolean isLiveMode;
    private final String objectId;
    private final String objectType;
    private final String secret;
    private final String type;
    public static final Parcelable.Creator<EphemeralKey> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: EphemeralKey.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EphemeralKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EphemeralKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EphemeralKey(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EphemeralKey[] newArray(int i) {
            return new EphemeralKey[i];
        }
    }

    public static /* synthetic */ EphemeralKey copy$payments_core_release$default(EphemeralKey ephemeralKey, String str, long j, long j2, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ephemeralKey.objectId;
        }
        if ((i & 2) != 0) {
            j = ephemeralKey.created;
        }
        if ((i & 4) != 0) {
            j2 = ephemeralKey.expires;
        }
        if ((i & 8) != 0) {
            str2 = ephemeralKey.id;
        }
        if ((i & 16) != 0) {
            z = ephemeralKey.isLiveMode;
        }
        if ((i & 32) != 0) {
            str3 = ephemeralKey.objectType;
        }
        if ((i & 64) != 0) {
            str4 = ephemeralKey.secret;
        }
        if ((i & 128) != 0) {
            str5 = ephemeralKey.type;
        }
        String str6 = str5;
        String str7 = str3;
        String str8 = str2;
        long j3 = j2;
        return ephemeralKey.copy$payments_core_release(str, j, j3, str8, z, str7, str4, str6);
    }

    /* renamed from: component1$payments_core_release, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* renamed from: component2$payments_core_release, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    /* renamed from: component3$payments_core_release, reason: from getter */
    public final long getExpires() {
        return this.expires;
    }

    /* renamed from: component4$payments_core_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component5$payments_core_release, reason: from getter */
    public final boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    /* renamed from: component6$payments_core_release, reason: from getter */
    public final String getObjectType() {
        return this.objectType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    /* renamed from: component8$payments_core_release, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final EphemeralKey copy$payments_core_release(String objectId, long created, long expires, String id, boolean isLiveMode, String objectType, String secret, String type) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(type, "type");
        return new EphemeralKey(objectId, created, expires, id, isLiveMode, objectType, secret, type);
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
        if (!(other instanceof EphemeralKey)) {
            return false;
        }
        EphemeralKey ephemeralKey = (EphemeralKey) other;
        return Intrinsics.areEqual(this.objectId, ephemeralKey.objectId) && this.created == ephemeralKey.created && this.expires == ephemeralKey.expires && Intrinsics.areEqual(this.id, ephemeralKey.id) && this.isLiveMode == ephemeralKey.isLiveMode && Intrinsics.areEqual(this.objectType, ephemeralKey.objectType) && Intrinsics.areEqual(this.secret, ephemeralKey.secret) && Intrinsics.areEqual(this.type, ephemeralKey.type);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (((((((((((((this.objectId.hashCode() * 31) + Long.hashCode(this.created)) * 31) + Long.hashCode(this.expires)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.isLiveMode)) * 31) + this.objectType.hashCode()) * 31) + this.secret.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "EphemeralKey(objectId=" + this.objectId + ", created=" + this.created + ", expires=" + this.expires + ", id=" + this.id + ", isLiveMode=" + this.isLiveMode + ", objectType=" + this.objectType + ", secret=" + this.secret + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.objectId);
        dest.writeLong(this.created);
        dest.writeLong(this.expires);
        dest.writeString(this.id);
        dest.writeInt(this.isLiveMode ? 1 : 0);
        dest.writeString(this.objectType);
        dest.writeString(this.secret);
        dest.writeString(this.type);
    }

    public EphemeralKey(String objectId, long j, long j2, String id, boolean z, String objectType, String secret, String type) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(type, "type");
        this.objectId = objectId;
        this.created = j;
        this.expires = j2;
        this.id = id;
        this.isLiveMode = z;
        this.objectType = objectType;
        this.secret = secret;
        this.type = type;
    }

    public final String getObjectId$payments_core_release() {
        return this.objectId;
    }

    public final long getCreated$payments_core_release() {
        return this.created;
    }

    public final long getExpires$payments_core_release() {
        return this.expires;
    }

    public final String getId$payments_core_release() {
        return this.id;
    }

    public final boolean isLiveMode$payments_core_release() {
        return this.isLiveMode;
    }

    public final String getObjectType$payments_core_release() {
        return this.objectType;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final String getType$payments_core_release() {
        return this.type;
    }
}

package com.stripe.android.core.frauddetection;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FraudDetectionData.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006+"}, d2 = {"Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "Lcom/stripe/android/core/model/StripeModel;", FraudDetectionData.KEY_GUID, "", FraudDetectionData.KEY_MUID, FraudDetectionData.KEY_SID, "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getGuid", "()Ljava/lang/String;", "getMuid", "getSid", "getTimestamp", "()J", NativeProtocol.WEB_DIALOG_PARAMS, "", "getParams", "()Ljava/util/Map;", "toJson", "Lorg/json/JSONObject;", "isExpired", "", "currentTime", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FraudDetectionData implements StripeModel {
    private static final String KEY_GUID = "guid";
    private static final String KEY_MUID = "muid";
    private static final String KEY_SID = "sid";
    public static final String KEY_TIMESTAMP = "timestamp";
    private final String guid;
    private final String muid;
    private final String sid;
    private final long timestamp;
    public static final Parcelable.Creator<FraudDetectionData> CREATOR = new Creator();
    private static final long TTL = TimeUnit.MINUTES.toMillis(30);

    /* compiled from: FraudDetectionData.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudDetectionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FraudDetectionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData[] newArray(int i) {
            return new FraudDetectionData[i];
        }
    }

    public static /* synthetic */ FraudDetectionData copy$default(FraudDetectionData fraudDetectionData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fraudDetectionData.guid;
        }
        if ((i & 2) != 0) {
            str2 = fraudDetectionData.muid;
        }
        if ((i & 4) != 0) {
            str3 = fraudDetectionData.sid;
        }
        if ((i & 8) != 0) {
            j = fraudDetectionData.timestamp;
        }
        String str4 = str3;
        return fraudDetectionData.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMuid() {
        return this.muid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final FraudDetectionData copy(String guid, String muid, String sid, long timestamp) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(muid, "muid");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new FraudDetectionData(guid, muid, sid, timestamp);
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
        if (!(other instanceof FraudDetectionData)) {
            return false;
        }
        FraudDetectionData fraudDetectionData = (FraudDetectionData) other;
        return Intrinsics.areEqual(this.guid, fraudDetectionData.guid) && Intrinsics.areEqual(this.muid, fraudDetectionData.muid) && Intrinsics.areEqual(this.sid, fraudDetectionData.sid) && this.timestamp == fraudDetectionData.timestamp;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (((((this.guid.hashCode() * 31) + this.muid.hashCode()) * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "FraudDetectionData(guid=" + this.guid + ", muid=" + this.muid + ", sid=" + this.sid + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.guid);
        dest.writeString(this.muid);
        dest.writeString(this.sid);
        dest.writeLong(this.timestamp);
    }

    public FraudDetectionData(String guid, String muid, String sid, long j) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(muid, "muid");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.guid = guid;
        this.muid = muid;
        this.sid = sid;
        this.timestamp = j;
    }

    public /* synthetic */ FraudDetectionData(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0L : j);
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getMuid() {
        return this.muid;
    }

    public final String getSid() {
        return this.sid;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Map<String, String> getParams() {
        return MapsKt.mapOf(TuplesKt.to(KEY_GUID, this.guid), TuplesKt.to(KEY_MUID, this.muid), TuplesKt.to(KEY_SID, this.sid));
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(KEY_GUID, this.guid).put(KEY_MUID, this.muid).put(KEY_SID, this.sid).put("timestamp", this.timestamp);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final boolean isExpired(long currentTime) {
        return currentTime - this.timestamp > TTL;
    }
}

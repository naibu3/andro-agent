package com.qonversion.android.sdk.internal.dto.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendPushTokenRequest.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;", "", "accessToken", "", "clientUid", "deviceId", "pushToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getClientUid", "getDeviceId", "getPushToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class SendPushTokenRequest {
    private final String accessToken;
    private final String clientUid;
    private final String deviceId;
    private final String pushToken;

    public static /* synthetic */ SendPushTokenRequest copy$default(SendPushTokenRequest sendPushTokenRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendPushTokenRequest.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = sendPushTokenRequest.clientUid;
        }
        if ((i & 4) != 0) {
            str3 = sendPushTokenRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = sendPushTokenRequest.pushToken;
        }
        return sendPushTokenRequest.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClientUid() {
        return this.clientUid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    public final SendPushTokenRequest copy(@Json(name = "access_token") String accessToken, @Json(name = "q_uid") String clientUid, @Json(name = "device_id") String deviceId, @Json(name = "push_token") String pushToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        return new SendPushTokenRequest(accessToken, clientUid, deviceId, pushToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendPushTokenRequest)) {
            return false;
        }
        SendPushTokenRequest sendPushTokenRequest = (SendPushTokenRequest) other;
        return Intrinsics.areEqual(this.accessToken, sendPushTokenRequest.accessToken) && Intrinsics.areEqual(this.clientUid, sendPushTokenRequest.clientUid) && Intrinsics.areEqual(this.deviceId, sendPushTokenRequest.deviceId) && Intrinsics.areEqual(this.pushToken, sendPushTokenRequest.pushToken);
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        String str = this.clientUid;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.deviceId.hashCode()) * 31) + this.pushToken.hashCode();
    }

    public String toString() {
        return "SendPushTokenRequest(accessToken=" + this.accessToken + ", clientUid=" + this.clientUid + ", deviceId=" + this.deviceId + ", pushToken=" + this.pushToken + ")";
    }

    public SendPushTokenRequest(@Json(name = "access_token") String accessToken, @Json(name = "q_uid") String str, @Json(name = "device_id") String deviceId, @Json(name = "push_token") String pushToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        this.accessToken = accessToken;
        this.clientUid = str;
        this.deviceId = deviceId;
        this.pushToken = pushToken;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getClientUid() {
        return this.clientUid;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getPushToken() {
        return this.pushToken;
    }
}

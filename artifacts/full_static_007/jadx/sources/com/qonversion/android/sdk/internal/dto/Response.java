package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Response.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/Response;", "", "clientId", "", "clientUid", "clientTargetId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getClientTargetId", "getClientUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class Response {
    private final String clientId;
    private final String clientTargetId;
    private final String clientUid;

    public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = response.clientId;
        }
        if ((i & 2) != 0) {
            str2 = response.clientUid;
        }
        if ((i & 4) != 0) {
            str3 = response.clientTargetId;
        }
        return response.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClientUid() {
        return this.clientUid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientTargetId() {
        return this.clientTargetId;
    }

    public final Response copy(@Json(name = "client_id") String clientId, @Json(name = "client_uid") String clientUid, @Json(name = "client_target_id") String clientTargetId) {
        return new Response(clientId, clientUid, clientTargetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return Intrinsics.areEqual(this.clientId, response.clientId) && Intrinsics.areEqual(this.clientUid, response.clientUid) && Intrinsics.areEqual(this.clientTargetId, response.clientTargetId);
    }

    public int hashCode() {
        String str = this.clientId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientUid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientTargetId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Response(clientId=" + this.clientId + ", clientUid=" + this.clientUid + ", clientTargetId=" + this.clientTargetId + ")";
    }

    public Response(@Json(name = "client_id") String str, @Json(name = "client_uid") String str2, @Json(name = "client_target_id") String str3) {
        this.clientId = str;
        this.clientUid = str2;
        this.clientTargetId = str3;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientUid() {
        return this.clientUid;
    }

    public final String getClientTargetId() {
        return this.clientTargetId;
    }
}

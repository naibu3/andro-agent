package com.qonversion.android.sdk.internal.dto.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.ProviderData;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributionRequest.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "", "d", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "v", "", "accessToken", "providerData", "Lcom/qonversion/android/sdk/internal/dto/ProviderData;", "clientUid", "(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getClientUid", "setClientUid", "(Ljava/lang/String;)V", "getD", "()Lcom/qonversion/android/sdk/internal/dto/Environment;", "getProviderData", "()Lcom/qonversion/android/sdk/internal/dto/ProviderData;", "getV", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class AttributionRequest {
    private final String accessToken;
    private String clientUid;
    private final Environment d;
    private final ProviderData providerData;
    private final String v;

    public static /* synthetic */ AttributionRequest copy$default(AttributionRequest attributionRequest, Environment environment, String str, String str2, ProviderData providerData, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            environment = attributionRequest.d;
        }
        if ((i & 2) != 0) {
            str = attributionRequest.v;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = attributionRequest.accessToken;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            providerData = attributionRequest.providerData;
        }
        ProviderData providerData2 = providerData;
        if ((i & 16) != 0) {
            str3 = attributionRequest.clientUid;
        }
        return attributionRequest.copy(environment, str4, str5, providerData2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Environment getD() {
        return this.d;
    }

    /* renamed from: component2, reason: from getter */
    public final String getV() {
        return this.v;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component4, reason: from getter */
    public final ProviderData getProviderData() {
        return this.providerData;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientUid() {
        return this.clientUid;
    }

    public final AttributionRequest copy(@Json(name = "d") Environment d, @Json(name = "v") String v, @Json(name = "access_token") String accessToken, @Json(name = "provider_data") ProviderData providerData, @Json(name = "client_uid") String clientUid) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(providerData, "providerData");
        return new AttributionRequest(d, v, accessToken, providerData, clientUid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributionRequest)) {
            return false;
        }
        AttributionRequest attributionRequest = (AttributionRequest) other;
        return Intrinsics.areEqual(this.d, attributionRequest.d) && Intrinsics.areEqual(this.v, attributionRequest.v) && Intrinsics.areEqual(this.accessToken, attributionRequest.accessToken) && Intrinsics.areEqual(this.providerData, attributionRequest.providerData) && Intrinsics.areEqual(this.clientUid, attributionRequest.clientUid);
    }

    public int hashCode() {
        int iHashCode = ((((((this.d.hashCode() * 31) + this.v.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.providerData.hashCode()) * 31;
        String str = this.clientUid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AttributionRequest(d=" + this.d + ", v=" + this.v + ", accessToken=" + this.accessToken + ", providerData=" + this.providerData + ", clientUid=" + this.clientUid + ")";
    }

    public AttributionRequest(@Json(name = "d") Environment d, @Json(name = "v") String v, @Json(name = "access_token") String accessToken, @Json(name = "provider_data") ProviderData providerData, @Json(name = "client_uid") String str) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(providerData, "providerData");
        this.d = d;
        this.v = v;
        this.accessToken = accessToken;
        this.providerData = providerData;
        this.clientUid = str;
    }

    public final Environment getD() {
        return this.d;
    }

    public final String getV() {
        return this.v;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final ProviderData getProviderData() {
        return this.providerData;
    }

    public final String getClientUid() {
        return this.clientUid;
    }

    public final void setClientUid(String str) {
        this.clientUid = str;
    }
}

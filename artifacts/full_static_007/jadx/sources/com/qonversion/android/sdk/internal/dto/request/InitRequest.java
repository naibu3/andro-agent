package com.qonversion.android.sdk.internal.dto.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.purchase.Inapp;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitRequest.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00072\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;", "Lcom/qonversion/android/sdk/internal/dto/request/RequestData;", "installDate", "", "device", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "version", "", "accessToken", "clientUid", "receipt", "debugMode", "purchases", "", "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;", "(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccessToken", "()Ljava/lang/String;", "getClientUid", "getDebugMode", "getDevice", "()Lcom/qonversion/android/sdk/internal/dto/Environment;", "getInstallDate", "()J", "getPurchases", "()Ljava/util/List;", "getReceipt", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class InitRequest extends RequestData {
    private final String accessToken;
    private final String clientUid;
    private final String debugMode;
    private final Environment device;
    private final long installDate;
    private final List<Inapp> purchases;
    private final String receipt;
    private final String version;

    /* renamed from: component1, reason: from getter */
    public final long getInstallDate() {
        return this.installDate;
    }

    /* renamed from: component2, reason: from getter */
    public final Environment getDevice() {
        return this.device;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientUid() {
        return this.clientUid;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReceipt() {
        return this.receipt;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDebugMode() {
        return this.debugMode;
    }

    public final List<Inapp> component8() {
        return this.purchases;
    }

    public final InitRequest copy(@Json(name = "install_date") long installDate, @Json(name = "device") Environment device, @Json(name = "version") String version, @Json(name = "access_token") String accessToken, @Json(name = "q_uid") String clientUid, @Json(name = "receipt") String receipt, @Json(name = "debug_mode") String debugMode, @Json(name = "purchases") List<Inapp> purchases) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(debugMode, "debugMode");
        return new InitRequest(installDate, device, version, accessToken, clientUid, receipt, debugMode, purchases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitRequest)) {
            return false;
        }
        InitRequest initRequest = (InitRequest) other;
        return this.installDate == initRequest.installDate && Intrinsics.areEqual(this.device, initRequest.device) && Intrinsics.areEqual(this.version, initRequest.version) && Intrinsics.areEqual(this.accessToken, initRequest.accessToken) && Intrinsics.areEqual(this.clientUid, initRequest.clientUid) && Intrinsics.areEqual(this.receipt, initRequest.receipt) && Intrinsics.areEqual(this.debugMode, initRequest.debugMode) && Intrinsics.areEqual(this.purchases, initRequest.purchases);
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.installDate) * 31) + this.device.hashCode()) * 31) + this.version.hashCode()) * 31) + this.accessToken.hashCode()) * 31;
        String str = this.clientUid;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.receipt.hashCode()) * 31) + this.debugMode.hashCode()) * 31;
        List<Inapp> list = this.purchases;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "InitRequest(installDate=" + this.installDate + ", device=" + this.device + ", version=" + this.version + ", accessToken=" + this.accessToken + ", clientUid=" + this.clientUid + ", receipt=" + this.receipt + ", debugMode=" + this.debugMode + ", purchases=" + this.purchases + ")";
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public long getInstallDate() {
        return this.installDate;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public Environment getDevice() {
        return this.device;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public String getVersion() {
        return this.version;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public String getClientUid() {
        return this.clientUid;
    }

    public /* synthetic */ InitRequest(long j, Environment environment, String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, environment, str, str2, str3, (i & 32) != 0 ? "" : str4, str5, (i & 128) != 0 ? null : list);
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public String getReceipt() {
        return this.receipt;
    }

    @Override // com.qonversion.android.sdk.internal.dto.request.RequestData
    public String getDebugMode() {
        return this.debugMode;
    }

    public final List<Inapp> getPurchases() {
        return this.purchases;
    }

    public InitRequest(@Json(name = "install_date") long j, @Json(name = "device") Environment device, @Json(name = "version") String version, @Json(name = "access_token") String accessToken, @Json(name = "q_uid") String str, @Json(name = "receipt") String receipt, @Json(name = "debug_mode") String debugMode, @Json(name = "purchases") List<Inapp> list) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(debugMode, "debugMode");
        this.installDate = j;
        this.device = device;
        this.version = version;
        this.accessToken = accessToken;
        this.clientUid = str;
        this.receipt = receipt;
        this.debugMode = debugMode;
        this.purchases = list;
    }
}

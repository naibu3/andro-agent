package com.qonversion.android.sdk.internal.purchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Purchase.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "", "storeProductId", "", "orderId", "originalOrderId", "purchaseTime", "", "purchaseToken", "contextKeys", "", "screenUid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContextKeys", "()Ljava/util/List;", "getOrderId", "()Ljava/lang/String;", "getOriginalOrderId", "getPurchaseTime", "()J", "getPurchaseToken", "getScreenUid", "getStoreProductId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class Purchase {
    private final List<String> contextKeys;
    private final String orderId;
    private final String originalOrderId;
    private final long purchaseTime;
    private final String purchaseToken;
    private final String screenUid;
    private final String storeProductId;

    /* renamed from: component1, reason: from getter */
    public final String getStoreProductId() {
        return this.storeProductId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final List<String> component6() {
        return this.contextKeys;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScreenUid() {
        return this.screenUid;
    }

    public final Purchase copy(String storeProductId, String orderId, String originalOrderId, long purchaseTime, String purchaseToken, List<String> contextKeys, String screenUid) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(originalOrderId, "originalOrderId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new Purchase(storeProductId, orderId, originalOrderId, purchaseTime, purchaseToken, contextKeys, screenUid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) other;
        return Intrinsics.areEqual(this.storeProductId, purchase.storeProductId) && Intrinsics.areEqual(this.orderId, purchase.orderId) && Intrinsics.areEqual(this.originalOrderId, purchase.originalOrderId) && this.purchaseTime == purchase.purchaseTime && Intrinsics.areEqual(this.purchaseToken, purchase.purchaseToken) && Intrinsics.areEqual(this.contextKeys, purchase.contextKeys) && Intrinsics.areEqual(this.screenUid, purchase.screenUid);
    }

    public int hashCode() {
        String str = this.storeProductId;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.originalOrderId.hashCode()) * 31) + Long.hashCode(this.purchaseTime)) * 31) + this.purchaseToken.hashCode()) * 31;
        List<String> list = this.contextKeys;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.screenUid;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Purchase(storeProductId=" + this.storeProductId + ", orderId=" + this.orderId + ", originalOrderId=" + this.originalOrderId + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", contextKeys=" + this.contextKeys + ", screenUid=" + this.screenUid + ")";
    }

    public Purchase(String str, String orderId, String originalOrderId, long j, String purchaseToken, List<String> list, String str2) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(originalOrderId, "originalOrderId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.storeProductId = str;
        this.orderId = orderId;
        this.originalOrderId = originalOrderId;
        this.purchaseTime = j;
        this.purchaseToken = purchaseToken;
        this.contextKeys = list;
        this.screenUid = str2;
    }

    public final String getStoreProductId() {
        return this.storeProductId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final List<String> getContextKeys() {
        return this.contextKeys;
    }

    public final String getScreenUid() {
        return this.screenUid;
    }
}

package com.qonversion.android.sdk.internal.dto.purchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Inapp.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006("}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "", "purchaseToken", "", "purchaseTime", "", "transactionId", "originalTransactionId", "storeProductId", "qProductId", "contextKeys", "", "screenUid", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContextKeys", "()Ljava/util/List;", "getOriginalTransactionId", "()Ljava/lang/String;", "getPurchaseTime", "()J", "getPurchaseToken", "getQProductId", "getScreenUid", "getStoreProductId", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class PurchaseDetails {
    private final List<String> contextKeys;
    private final String originalTransactionId;
    private final long purchaseTime;
    private final String purchaseToken;
    private final String qProductId;
    private final String screenUid;
    private final String storeProductId;
    private final String transactionId;

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStoreProductId() {
        return this.storeProductId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getQProductId() {
        return this.qProductId;
    }

    public final List<String> component7() {
        return this.contextKeys;
    }

    /* renamed from: component8, reason: from getter */
    public final String getScreenUid() {
        return this.screenUid;
    }

    public final PurchaseDetails copy(@Json(name = "purchase_token") String purchaseToken, @Json(name = "purchase_time") long purchaseTime, @Json(name = "transaction_id") String transactionId, @Json(name = "original_transaction_id") String originalTransactionId, @Json(name = "product") String storeProductId, @Json(name = "product_id") String qProductId, @Json(name = "context_keys") List<String> contextKeys, @Json(name = "screen_uid") String screenUid) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(originalTransactionId, "originalTransactionId");
        Intrinsics.checkNotNullParameter(storeProductId, "storeProductId");
        Intrinsics.checkNotNullParameter(qProductId, "qProductId");
        return new PurchaseDetails(purchaseToken, purchaseTime, transactionId, originalTransactionId, storeProductId, qProductId, contextKeys, screenUid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseDetails)) {
            return false;
        }
        PurchaseDetails purchaseDetails = (PurchaseDetails) other;
        return Intrinsics.areEqual(this.purchaseToken, purchaseDetails.purchaseToken) && this.purchaseTime == purchaseDetails.purchaseTime && Intrinsics.areEqual(this.transactionId, purchaseDetails.transactionId) && Intrinsics.areEqual(this.originalTransactionId, purchaseDetails.originalTransactionId) && Intrinsics.areEqual(this.storeProductId, purchaseDetails.storeProductId) && Intrinsics.areEqual(this.qProductId, purchaseDetails.qProductId) && Intrinsics.areEqual(this.contextKeys, purchaseDetails.contextKeys) && Intrinsics.areEqual(this.screenUid, purchaseDetails.screenUid);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.purchaseToken.hashCode() * 31) + Long.hashCode(this.purchaseTime)) * 31) + this.transactionId.hashCode()) * 31) + this.originalTransactionId.hashCode()) * 31) + this.storeProductId.hashCode()) * 31) + this.qProductId.hashCode()) * 31;
        List<String> list = this.contextKeys;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.screenUid;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseDetails(purchaseToken=" + this.purchaseToken + ", purchaseTime=" + this.purchaseTime + ", transactionId=" + this.transactionId + ", originalTransactionId=" + this.originalTransactionId + ", storeProductId=" + this.storeProductId + ", qProductId=" + this.qProductId + ", contextKeys=" + this.contextKeys + ", screenUid=" + this.screenUid + ")";
    }

    public PurchaseDetails(@Json(name = "purchase_token") String purchaseToken, @Json(name = "purchase_time") long j, @Json(name = "transaction_id") String transactionId, @Json(name = "original_transaction_id") String originalTransactionId, @Json(name = "product") String storeProductId, @Json(name = "product_id") String qProductId, @Json(name = "context_keys") List<String> list, @Json(name = "screen_uid") String str) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(originalTransactionId, "originalTransactionId");
        Intrinsics.checkNotNullParameter(storeProductId, "storeProductId");
        Intrinsics.checkNotNullParameter(qProductId, "qProductId");
        this.purchaseToken = purchaseToken;
        this.purchaseTime = j;
        this.transactionId = transactionId;
        this.originalTransactionId = originalTransactionId;
        this.storeProductId = storeProductId;
        this.qProductId = qProductId;
        this.contextKeys = list;
        this.screenUid = str;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    public final String getStoreProductId() {
        return this.storeProductId;
    }

    public final String getQProductId() {
        return this.qProductId;
    }

    public final List<String> getContextKeys() {
        return this.contextKeys;
    }

    public final String getScreenUid() {
        return this.screenUid;
    }
}

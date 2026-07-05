package com.qonversion.android.sdk.internal.dto.purchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: History.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/History;", "", "product", "", "purchaseToken", "purchaseTime", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getProduct", "()Ljava/lang/String;", "getPurchaseTime", "()J", "getPurchaseToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class History {
    private final String product;
    private final long purchaseTime;
    private final String purchaseToken;

    public static /* synthetic */ History copy$default(History history, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = history.product;
        }
        if ((i & 2) != 0) {
            str2 = history.purchaseToken;
        }
        if ((i & 4) != 0) {
            j = history.purchaseTime;
        }
        return history.copy(str, str2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final History copy(@Json(name = "product") String product, @Json(name = "purchase_token") String purchaseToken, @Json(name = "purchase_time") long purchaseTime) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new History(product, purchaseToken, purchaseTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof History)) {
            return false;
        }
        History history = (History) other;
        return Intrinsics.areEqual(this.product, history.product) && Intrinsics.areEqual(this.purchaseToken, history.purchaseToken) && this.purchaseTime == history.purchaseTime;
    }

    public int hashCode() {
        return (((this.product.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + Long.hashCode(this.purchaseTime);
    }

    public String toString() {
        return "History(product=" + this.product + ", purchaseToken=" + this.purchaseToken + ", purchaseTime=" + this.purchaseTime + ")";
    }

    public History(@Json(name = "product") String product, @Json(name = "purchase_token") String purchaseToken, @Json(name = "purchase_time") long j) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.product = product;
        this.purchaseToken = purchaseToken;
        this.purchaseTime = j;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }
}

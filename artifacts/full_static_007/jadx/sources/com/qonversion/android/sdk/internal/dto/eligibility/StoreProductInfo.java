package com.qonversion.android.sdk.internal.dto.eligibility;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreProductInfo.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/eligibility/StoreProductInfo;", "", "storeId", "", "(Ljava/lang/String;)V", "getStoreId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class StoreProductInfo {
    private final String storeId;

    public static /* synthetic */ StoreProductInfo copy$default(StoreProductInfo storeProductInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storeProductInfo.storeId;
        }
        return storeProductInfo.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    public final StoreProductInfo copy(@Json(name = "store_id") String storeId) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        return new StoreProductInfo(storeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoreProductInfo) && Intrinsics.areEqual(this.storeId, ((StoreProductInfo) other).storeId);
    }

    public int hashCode() {
        return this.storeId.hashCode();
    }

    public String toString() {
        return "StoreProductInfo(storeId=" + this.storeId + ")";
    }

    public StoreProductInfo(@Json(name = "store_id") String storeId) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        this.storeId = storeId;
    }

    public final String getStoreId() {
        return this.storeId;
    }
}

package com.qonversion.android.sdk.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QFallbackObject.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u001c\b\u0001\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001d\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003JU\u0010\u0018\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\b\u0003\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/qonversion/android/sdk/dto/QFallbackObject;", "", "products", "", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "offerings", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "productPermissions", "", "remoteConfigList", "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/offerings/QOfferings;Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V", "getOfferings", "()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "getProductPermissions", "()Ljava/util/Map;", "getProducts", "getRemoteConfigList", "()Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QFallbackObject {
    private final QOfferings offerings;
    private final Map<String, List<String>> productPermissions;
    private final Map<String, QProduct> products;
    private final QRemoteConfigList remoteConfigList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QFallbackObject copy$default(QFallbackObject qFallbackObject, Map map, QOfferings qOfferings, Map map2, QRemoteConfigList qRemoteConfigList, int i, Object obj) {
        if ((i & 1) != 0) {
            map = qFallbackObject.products;
        }
        if ((i & 2) != 0) {
            qOfferings = qFallbackObject.offerings;
        }
        if ((i & 4) != 0) {
            map2 = qFallbackObject.productPermissions;
        }
        if ((i & 8) != 0) {
            qRemoteConfigList = qFallbackObject.remoteConfigList;
        }
        return qFallbackObject.copy(map, qOfferings, map2, qRemoteConfigList);
    }

    public final Map<String, QProduct> component1() {
        return this.products;
    }

    /* renamed from: component2, reason: from getter */
    public final QOfferings getOfferings() {
        return this.offerings;
    }

    public final Map<String, List<String>> component3() {
        return this.productPermissions;
    }

    /* renamed from: component4, reason: from getter */
    public final QRemoteConfigList getRemoteConfigList() {
        return this.remoteConfigList;
    }

    public final QFallbackObject copy(@Json(name = "products") Map<String, QProduct> products, @Json(name = "offerings") QOfferings offerings, @Json(name = "products_permissions") Map<String, ? extends List<String>> productPermissions, @Json(name = "remote_config_list") QRemoteConfigList remoteConfigList) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new QFallbackObject(products, offerings, productPermissions, remoteConfigList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QFallbackObject)) {
            return false;
        }
        QFallbackObject qFallbackObject = (QFallbackObject) other;
        return Intrinsics.areEqual(this.products, qFallbackObject.products) && Intrinsics.areEqual(this.offerings, qFallbackObject.offerings) && Intrinsics.areEqual(this.productPermissions, qFallbackObject.productPermissions) && Intrinsics.areEqual(this.remoteConfigList, qFallbackObject.remoteConfigList);
    }

    public int hashCode() {
        int iHashCode = this.products.hashCode() * 31;
        QOfferings qOfferings = this.offerings;
        int iHashCode2 = (iHashCode + (qOfferings == null ? 0 : qOfferings.hashCode())) * 31;
        Map<String, List<String>> map = this.productPermissions;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        QRemoteConfigList qRemoteConfigList = this.remoteConfigList;
        return iHashCode3 + (qRemoteConfigList != null ? qRemoteConfigList.hashCode() : 0);
    }

    public String toString() {
        return "QFallbackObject(products=" + this.products + ", offerings=" + this.offerings + ", productPermissions=" + this.productPermissions + ", remoteConfigList=" + this.remoteConfigList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QFallbackObject(@Json(name = "products") Map<String, QProduct> products, @Json(name = "offerings") QOfferings qOfferings, @Json(name = "products_permissions") Map<String, ? extends List<String>> map, @Json(name = "remote_config_list") QRemoteConfigList qRemoteConfigList) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.products = products;
        this.offerings = qOfferings;
        this.productPermissions = map;
        this.remoteConfigList = qRemoteConfigList;
    }

    public /* synthetic */ QFallbackObject(Map map, QOfferings qOfferings, Map map2, QRemoteConfigList qRemoteConfigList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, qOfferings, map2, qRemoteConfigList);
    }

    public final Map<String, QProduct> getProducts() {
        return this.products;
    }

    public final QOfferings getOfferings() {
        return this.offerings;
    }

    public final Map<String, List<String>> getProductPermissions() {
        return this.productPermissions;
    }

    public final QRemoteConfigList getRemoteConfigList() {
        return this.remoteConfigList;
    }
}

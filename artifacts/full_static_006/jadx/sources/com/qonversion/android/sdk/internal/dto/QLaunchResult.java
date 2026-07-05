package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QLaunchResult.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0001\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0003\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0007HÀ\u0003¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\"\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b&J\u0089\u0001\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00072\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u001c\b\u0003\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006."}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "", "uid", "", "date", "Ljava/util/Date;", "products", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "permissions", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "userProducts", "offerings", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "productPermissions", "", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/qonversion/android/sdk/dto/offerings/QOfferings;Ljava/util/Map;)V", "getDate", "()Ljava/util/Date;", "getOfferings", "()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "getPermissions$sdk_release", "()Ljava/util/Map;", "setPermissions$sdk_release", "(Ljava/util/Map;)V", "getProductPermissions$sdk_release", "getProducts", "getUid", "()Ljava/lang/String;", "getUserProducts", "component1", "component2", "component3", "component4", "component4$sdk_release", "component5", "component6", "component7", "component7$sdk_release", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QLaunchResult {
    private final Date date;
    private final QOfferings offerings;
    private Map<String, QPermission> permissions;
    private final Map<String, List<String>> productPermissions;
    private final Map<String, QProduct> products;
    private final String uid;
    private final Map<String, QProduct> userProducts;

    public static /* synthetic */ QLaunchResult copy$default(QLaunchResult qLaunchResult, String str, Date date, Map map, Map map2, Map map3, QOfferings qOfferings, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qLaunchResult.uid;
        }
        if ((i & 2) != 0) {
            date = qLaunchResult.date;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            map = qLaunchResult.products;
        }
        Map map5 = map;
        if ((i & 8) != 0) {
            map2 = qLaunchResult.permissions;
        }
        Map map6 = map2;
        if ((i & 16) != 0) {
            map3 = qLaunchResult.userProducts;
        }
        Map map7 = map3;
        if ((i & 32) != 0) {
            qOfferings = qLaunchResult.offerings;
        }
        QOfferings qOfferings2 = qOfferings;
        if ((i & 64) != 0) {
            map4 = qLaunchResult.productPermissions;
        }
        return qLaunchResult.copy(str, date2, map5, map6, map7, qOfferings2, map4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    public final Map<String, QProduct> component3() {
        return this.products;
    }

    public final Map<String, QPermission> component4$sdk_release() {
        return this.permissions;
    }

    public final Map<String, QProduct> component5() {
        return this.userProducts;
    }

    /* renamed from: component6, reason: from getter */
    public final QOfferings getOfferings() {
        return this.offerings;
    }

    public final Map<String, List<String>> component7$sdk_release() {
        return this.productPermissions;
    }

    public final QLaunchResult copy(@Json(name = "uid") String uid, @Json(name = "timestamp") Date date, @Json(name = "products") Map<String, QProduct> products, @Json(name = "permissions") Map<String, QPermission> permissions, @Json(name = "user_products") Map<String, QProduct> userProducts, @Json(name = "offerings") QOfferings offerings, @Json(name = "products_permissions") Map<String, ? extends List<String>> productPermissions) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(userProducts, "userProducts");
        return new QLaunchResult(uid, date, products, permissions, userProducts, offerings, productPermissions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QLaunchResult)) {
            return false;
        }
        QLaunchResult qLaunchResult = (QLaunchResult) other;
        return Intrinsics.areEqual(this.uid, qLaunchResult.uid) && Intrinsics.areEqual(this.date, qLaunchResult.date) && Intrinsics.areEqual(this.products, qLaunchResult.products) && Intrinsics.areEqual(this.permissions, qLaunchResult.permissions) && Intrinsics.areEqual(this.userProducts, qLaunchResult.userProducts) && Intrinsics.areEqual(this.offerings, qLaunchResult.offerings) && Intrinsics.areEqual(this.productPermissions, qLaunchResult.productPermissions);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.uid.hashCode() * 31) + this.date.hashCode()) * 31) + this.products.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.userProducts.hashCode()) * 31;
        QOfferings qOfferings = this.offerings;
        int iHashCode2 = (iHashCode + (qOfferings == null ? 0 : qOfferings.hashCode())) * 31;
        Map<String, List<String>> map = this.productPermissions;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "QLaunchResult(uid=" + this.uid + ", date=" + this.date + ", products=" + this.products + ", permissions=" + this.permissions + ", userProducts=" + this.userProducts + ", offerings=" + this.offerings + ", productPermissions=" + this.productPermissions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QLaunchResult(@Json(name = "uid") String uid, @Json(name = "timestamp") Date date, @Json(name = "products") Map<String, QProduct> products, @Json(name = "permissions") Map<String, QPermission> permissions, @Json(name = "user_products") Map<String, QProduct> userProducts, @Json(name = "offerings") QOfferings qOfferings, @Json(name = "products_permissions") Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(userProducts, "userProducts");
        this.uid = uid;
        this.date = date;
        this.products = products;
        this.permissions = permissions;
        this.userProducts = userProducts;
        this.offerings = qOfferings;
        this.productPermissions = map;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Date getDate() {
        return this.date;
    }

    public /* synthetic */ QLaunchResult(String str, Date date, Map map, Map map2, Map map3, QOfferings qOfferings, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? MapsKt.emptyMap() : map2, (i & 16) != 0 ? MapsKt.emptyMap() : map3, qOfferings, (i & 64) != 0 ? null : map4);
    }

    public final Map<String, QProduct> getProducts() {
        return this.products;
    }

    public final Map<String, QPermission> getPermissions$sdk_release() {
        return this.permissions;
    }

    public final void setPermissions$sdk_release(Map<String, QPermission> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.permissions = map;
    }

    public final Map<String, QProduct> getUserProducts() {
        return this.userProducts;
    }

    public final QOfferings getOfferings() {
        return this.offerings;
    }

    public final Map<String, List<String>> getProductPermissions$sdk_release() {
        return this.productPermissions;
    }
}

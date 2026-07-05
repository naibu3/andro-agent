package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionMappingAdapters.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QProductsAdapter;", "", "()V", "fromJson", "", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "products", "", "toJson", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QProductsAdapter {
    @ToJson
    private final List<QProduct> toJson(Map<String, QProduct> products) {
        return CollectionsKt.toList(products.values());
    }

    @FromJson
    public final Map<String, QProduct> fromJson(List<QProduct> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (QProduct qProduct : products) {
            linkedHashMap.put(qProduct.getQonversionID(), qProduct);
        }
        return linkedHashMap;
    }
}

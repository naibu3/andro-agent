package com.qonversion.android.sdk.internal.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchasesCache.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0016\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "", "preferences", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V", "collectionPurchaseOptionsType", "Ljava/lang/reflect/Type;", "collectionPurchaseType", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "purchasesJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchasesOptionsJsonAdapter", "", "", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "clearPurchase", "", PurchasesCache.PURCHASE_KEY, "loadProcessingPurchasesOptions", "loadPurchases", "saveProcessingPurchasesOptions", "options", "savePurchase", "savePurchasesAsJson", "purchases", "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PurchasesCache {
    private static final int MAX_OLD_PURCHASES_NUMBER = 1;
    private static final int MAX_PURCHASES_NUMBER = 5;
    private static final String PURCHASE_KEY = "purchase";
    private static final String PURCHASE_OPTIONS_KEY = "purchase_options";
    private final Type collectionPurchaseOptionsType;
    private final Type collectionPurchaseType;
    private final Moshi moshi;
    private final SharedPreferencesCache preferences;
    private final JsonAdapter<Set<Purchase>> purchasesJsonAdapter;
    private final JsonAdapter<Map<String, QPurchaseOptions>> purchasesOptionsJsonAdapter;

    public PurchasesCache(SharedPreferencesCache preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        Moshi moshiBuild = new Moshi.Builder().build();
        this.moshi = moshiBuild;
        ParameterizedType parameterizedTypeNewParameterizedType = Types.newParameterizedType(Set.class, Purchase.class);
        Intrinsics.checkNotNullExpressionValue(parameterizedTypeNewParameterizedType, "newParameterizedType(...)");
        ParameterizedType parameterizedType = parameterizedTypeNewParameterizedType;
        this.collectionPurchaseType = parameterizedType;
        ParameterizedType parameterizedTypeNewParameterizedType2 = Types.newParameterizedType(Map.class, String.class, QPurchaseOptions.class);
        Intrinsics.checkNotNullExpressionValue(parameterizedTypeNewParameterizedType2, "newParameterizedType(...)");
        ParameterizedType parameterizedType2 = parameterizedTypeNewParameterizedType2;
        this.collectionPurchaseOptionsType = parameterizedType2;
        JsonAdapter<Set<Purchase>> jsonAdapterAdapter = moshiBuild.adapter(parameterizedType);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.purchasesJsonAdapter = jsonAdapterAdapter;
        JsonAdapter<Map<String, QPurchaseOptions>> jsonAdapterAdapter2 = moshiBuild.adapter(parameterizedType2);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.purchasesOptionsJsonAdapter = jsonAdapterAdapter2;
    }

    public final void savePurchase(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Set<Purchase> mutableSet = CollectionsKt.toMutableSet(loadPurchases());
        mutableSet.add(purchase);
        if (mutableSet.size() >= 5) {
            mutableSet.removeAll(CollectionsKt.toSet(CollectionsKt.take(CollectionsKt.toMutableList((Collection) mutableSet), 1)));
        }
        savePurchasesAsJson(mutableSet);
    }

    public final Set<Purchase> loadPurchases() {
        String string = this.preferences.getString(PURCHASE_KEY, "");
        String str = string;
        if (str == null || str.length() == 0) {
            return SetsKt.emptySet();
        }
        try {
            Set<Purchase> setFromJson = this.purchasesJsonAdapter.fromJson(string);
            return setFromJson == null ? SetsKt.emptySet() : setFromJson;
        } catch (IOException unused) {
            return SetsKt.emptySet();
        }
    }

    public final void clearPurchase(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Set<Purchase> mutableSet = CollectionsKt.toMutableSet(loadPurchases());
        mutableSet.remove(purchase);
        savePurchasesAsJson(mutableSet);
    }

    public final void saveProcessingPurchasesOptions(Map<String, QPurchaseOptions> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.preferences.putObject(PURCHASE_OPTIONS_KEY, options, this.purchasesOptionsJsonAdapter);
    }

    public final Map<String, QPurchaseOptions> loadProcessingPurchasesOptions() {
        Map<String, QPurchaseOptions> map = (Map) this.preferences.getObject(PURCHASE_OPTIONS_KEY, this.purchasesOptionsJsonAdapter);
        return map == null ? MapsKt.emptyMap() : map;
    }

    private final void savePurchasesAsJson(Set<Purchase> purchases) {
        String json = this.purchasesJsonAdapter.toJson(purchases);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        this.preferences.putString(PURCHASE_KEY, json);
    }
}

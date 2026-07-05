package com.qonversion.android.sdk.internal.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QFallbackObject;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.UtilsKt;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.QPermission;
import com.qonversion.android.sdk.internal.provider.CacheConfigProvider;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LaunchResultCacheWrapper.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015J\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\u0015J\b\u0010$\u001a\u00020%H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\u0013H\u0002J\u0016\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015H\u0002J\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160)\u0018\u00010\u0015J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020%H\u0002J\b\u0010.\u001a\u00020+H\u0002J\u0006\u0010/\u001a\u00020\u001eJ\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0013J\u001c\u00102\u001a\u00020\u001e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0002J\u001a\u00103\u001a\u00020\u001e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "", "moshi", "Lcom/squareup/moshi/Moshi;", "cache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "cacheConfigProvider", "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;", "fallbacksService", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "(Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V", "fallbackData", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "getFallbackData", "()Lcom/qonversion/android/sdk/dto/QFallbackObject;", "fallbackData$delegate", "Lkotlin/Lazy;", "launchResultAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "permissions", "", "", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "permissionsAdapter", "<set-?>", "sessionLaunchResult", "getSessionLaunchResult", "()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "clearPermissionsCache", "", "getActualOfferings", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "getActualPermissions", "getActualProducts", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "getCurrentTimeInSec", "", "getLaunchResult", "getPermissions", "getProductPermissions", "", "isCacheOutdated", "", "timeKey", "lifetimeSec", "isPermissionsCacheOutdated", "resetSessionCache", "save", "launchResult", "savePermissions", "updatePermissions", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LaunchResultCacheWrapper {
    private final SharedPreferencesCache cache;
    private final CacheConfigProvider cacheConfigProvider;

    /* renamed from: fallbackData$delegate, reason: from kotlin metadata */
    private final Lazy fallbackData;
    private final QFallbacksService fallbacksService;
    private final JsonAdapter<QLaunchResult> launchResultAdapter;
    private Map<String, QPermission> permissions;
    private final JsonAdapter<Map<String, QPermission>> permissionsAdapter;
    private QLaunchResult sessionLaunchResult;

    public LaunchResultCacheWrapper(Moshi moshi, SharedPreferencesCache cache, CacheConfigProvider cacheConfigProvider, QFallbacksService fallbacksService) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(cacheConfigProvider, "cacheConfigProvider");
        Intrinsics.checkNotNullParameter(fallbacksService, "fallbacksService");
        this.cache = cache;
        this.cacheConfigProvider = cacheConfigProvider;
        this.fallbacksService = fallbacksService;
        JsonAdapter<QLaunchResult> jsonAdapterAdapter = moshi.adapter(QLaunchResult.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.launchResultAdapter = jsonAdapterAdapter;
        this.fallbackData = LazyKt.lazy(new Function0<QFallbackObject>() { // from class: com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper$fallbackData$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final QFallbackObject invoke() {
                return this.this$0.fallbacksService.obtainFallbackData();
            }
        });
        JsonAdapter<Map<String, QPermission>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, QPermission.class));
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.permissionsAdapter = jsonAdapterAdapter2;
    }

    private final QFallbackObject getFallbackData() {
        return (QFallbackObject) this.fallbackData.getValue();
    }

    public final QLaunchResult getSessionLaunchResult() {
        return this.sessionLaunchResult;
    }

    public final Map<String, QPermission> getActualPermissions() {
        Map<String, QPermission> map = this.permissions;
        if (map != null) {
            return map;
        }
        if (isPermissionsCacheOutdated()) {
            return null;
        }
        return getPermissions();
    }

    public final void resetSessionCache() {
        this.sessionLaunchResult = null;
        this.permissions = null;
    }

    public final void clearPermissionsCache() {
        this.permissions = null;
        this.cache.remove("last_loaded_permissions");
    }

    private final QLaunchResult getLaunchResult() {
        QLaunchResult qLaunchResult = this.sessionLaunchResult;
        return qLaunchResult == null ? (QLaunchResult) this.cache.getObject("launchResult", this.launchResultAdapter) : qLaunchResult;
    }

    public final Map<String, QProduct> getActualProducts() {
        Map<String, QProduct> products;
        QLaunchResult launchResult = getLaunchResult();
        if (launchResult != null && (products = launchResult.getProducts()) != null) {
            return products;
        }
        QFallbackObject fallbackData = getFallbackData();
        if (fallbackData != null) {
            return fallbackData.getProducts();
        }
        return null;
    }

    public final Map<String, List<String>> getProductPermissions() {
        Map<String, List<String>> productPermissions$sdk_release;
        QLaunchResult launchResult = getLaunchResult();
        if (launchResult != null && (productPermissions$sdk_release = launchResult.getProductPermissions$sdk_release()) != null) {
            return productPermissions$sdk_release;
        }
        QFallbackObject fallbackData = getFallbackData();
        if (fallbackData != null) {
            return fallbackData.getProductPermissions();
        }
        return null;
    }

    public final QOfferings getActualOfferings() {
        QOfferings offerings;
        QLaunchResult launchResult = getLaunchResult();
        if (launchResult != null && (offerings = launchResult.getOfferings()) != null) {
            return offerings;
        }
        QFallbackObject fallbackData = getFallbackData();
        if (fallbackData != null) {
            return fallbackData.getOfferings();
        }
        return null;
    }

    private final Map<String, QPermission> getPermissions() {
        if (this.permissions == null) {
            this.permissions = (Map) this.cache.getObject("last_loaded_permissions", this.permissionsAdapter);
        }
        return this.permissions;
    }

    public final void save(QLaunchResult launchResult) {
        Intrinsics.checkNotNullParameter(launchResult, "launchResult");
        this.sessionLaunchResult = launchResult;
        this.cache.putObject("launchResult", launchResult, this.launchResultAdapter);
        this.cache.putLong("timestamp", getCurrentTimeInSec());
        this.permissions = launchResult.getPermissions$sdk_release();
        savePermissions(launchResult.getPermissions$sdk_release());
    }

    public final void updatePermissions(Map<String, QPermission> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        savePermissions(permissions);
    }

    private final void savePermissions(Map<String, QPermission> permissions) {
        this.permissions = permissions;
        this.cache.putObject("last_loaded_permissions", permissions, this.permissionsAdapter);
        this.cache.putLong("permissions_timestamp", getCurrentTimeInSec());
    }

    private final boolean isPermissionsCacheOutdated() {
        return isCacheOutdated("permissions_timestamp", UtilsKt.getDaysToSeconds(this.cacheConfigProvider.getCacheConfig().getEntitlementsCacheLifetime().getDays()));
    }

    private final boolean isCacheOutdated(String timeKey, long lifetimeSec) {
        return getCurrentTimeInSec() - this.cache.getLong(timeKey, 0L) >= lifetimeSec;
    }

    private final long getCurrentTimeInSec() {
        return ExtensionsKt.milliSecondsToSeconds(System.currentTimeMillis());
    }
}

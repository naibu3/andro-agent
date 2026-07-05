package com.qonversion.android.sdk.internal.dto.config;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementsCacheLifetime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CacheConfig.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "", "entitlementsCacheLifetime", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "fallbackFileIdentifier", "", "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)V", "getEntitlementsCacheLifetime", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "getFallbackFileIdentifier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "equals", "", "other", "hashCode", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class CacheConfig {
    private final QEntitlementsCacheLifetime entitlementsCacheLifetime;
    private final Integer fallbackFileIdentifier;

    public static /* synthetic */ CacheConfig copy$default(CacheConfig cacheConfig, QEntitlementsCacheLifetime qEntitlementsCacheLifetime, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            qEntitlementsCacheLifetime = cacheConfig.entitlementsCacheLifetime;
        }
        if ((i & 2) != 0) {
            num = cacheConfig.fallbackFileIdentifier;
        }
        return cacheConfig.copy(qEntitlementsCacheLifetime, num);
    }

    /* renamed from: component1, reason: from getter */
    public final QEntitlementsCacheLifetime getEntitlementsCacheLifetime() {
        return this.entitlementsCacheLifetime;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getFallbackFileIdentifier() {
        return this.fallbackFileIdentifier;
    }

    public final CacheConfig copy(QEntitlementsCacheLifetime entitlementsCacheLifetime, Integer fallbackFileIdentifier) {
        Intrinsics.checkNotNullParameter(entitlementsCacheLifetime, "entitlementsCacheLifetime");
        return new CacheConfig(entitlementsCacheLifetime, fallbackFileIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheConfig)) {
            return false;
        }
        CacheConfig cacheConfig = (CacheConfig) other;
        return this.entitlementsCacheLifetime == cacheConfig.entitlementsCacheLifetime && Intrinsics.areEqual(this.fallbackFileIdentifier, cacheConfig.fallbackFileIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.entitlementsCacheLifetime.hashCode() * 31;
        Integer num = this.fallbackFileIdentifier;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "CacheConfig(entitlementsCacheLifetime=" + this.entitlementsCacheLifetime + ", fallbackFileIdentifier=" + this.fallbackFileIdentifier + ")";
    }

    public CacheConfig(QEntitlementsCacheLifetime entitlementsCacheLifetime, Integer num) {
        Intrinsics.checkNotNullParameter(entitlementsCacheLifetime, "entitlementsCacheLifetime");
        this.entitlementsCacheLifetime = entitlementsCacheLifetime;
        this.fallbackFileIdentifier = num;
    }

    public final QEntitlementsCacheLifetime getEntitlementsCacheLifetime() {
        return this.entitlementsCacheLifetime;
    }

    public final Integer getFallbackFileIdentifier() {
        return this.fallbackFileIdentifier;
    }
}

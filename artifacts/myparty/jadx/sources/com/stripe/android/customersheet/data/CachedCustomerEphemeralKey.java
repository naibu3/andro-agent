package com.stripe.android.customersheet.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: CachedCustomerEphemeralKey.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;", "", "customerId", "", "customerSessionClientSecret", "ephemeralKey", "expiresAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCustomerId", "()Ljava/lang/String;", "getCustomerSessionClientSecret", "getEphemeralKey", "shouldRefresh", "", "currentTimeInMillis", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CachedCustomerEphemeralKey {
    public static final int $stable = 0;
    private final String customerId;
    private final String customerSessionClientSecret;
    private final String ephemeralKey;
    private final int expiresAt;

    /* renamed from: component4, reason: from getter */
    private final int getExpiresAt() {
        return this.expiresAt;
    }

    public static /* synthetic */ CachedCustomerEphemeralKey copy$default(CachedCustomerEphemeralKey cachedCustomerEphemeralKey, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cachedCustomerEphemeralKey.customerId;
        }
        if ((i2 & 2) != 0) {
            str2 = cachedCustomerEphemeralKey.customerSessionClientSecret;
        }
        if ((i2 & 4) != 0) {
            str3 = cachedCustomerEphemeralKey.ephemeralKey;
        }
        if ((i2 & 8) != 0) {
            i = cachedCustomerEphemeralKey.expiresAt;
        }
        return cachedCustomerEphemeralKey.copy(str, str2, str3, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final CachedCustomerEphemeralKey copy(String customerId, String customerSessionClientSecret, String ephemeralKey, int expiresAt) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        return new CachedCustomerEphemeralKey(customerId, customerSessionClientSecret, ephemeralKey, expiresAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedCustomerEphemeralKey)) {
            return false;
        }
        CachedCustomerEphemeralKey cachedCustomerEphemeralKey = (CachedCustomerEphemeralKey) other;
        return Intrinsics.areEqual(this.customerId, cachedCustomerEphemeralKey.customerId) && Intrinsics.areEqual(this.customerSessionClientSecret, cachedCustomerEphemeralKey.customerSessionClientSecret) && Intrinsics.areEqual(this.ephemeralKey, cachedCustomerEphemeralKey.ephemeralKey) && this.expiresAt == cachedCustomerEphemeralKey.expiresAt;
    }

    public int hashCode() {
        return (((((this.customerId.hashCode() * 31) + this.customerSessionClientSecret.hashCode()) * 31) + this.ephemeralKey.hashCode()) * 31) + Integer.hashCode(this.expiresAt);
    }

    public String toString() {
        return "CachedCustomerEphemeralKey(customerId=" + this.customerId + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", ephemeralKey=" + this.ephemeralKey + ", expiresAt=" + this.expiresAt + ")";
    }

    public CachedCustomerEphemeralKey(String customerId, String customerSessionClientSecret, String ephemeralKey, int i) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        this.customerId = customerId;
        this.customerSessionClientSecret = customerSessionClientSecret;
        this.ephemeralKey = ephemeralKey;
        this.expiresAt = i;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    public final String getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final boolean shouldRefresh(long currentTimeInMillis) {
        long j = this.expiresAt;
        Duration.Companion companion = Duration.INSTANCE;
        long jM10496getInWholeSecondsimpl = j - Duration.m10496getInWholeSecondsimpl(DurationKt.toDuration(currentTimeInMillis, DurationUnit.MILLISECONDS));
        Duration.Companion companion2 = Duration.INSTANCE;
        return jM10496getInWholeSecondsimpl <= Duration.m10496getInWholeSecondsimpl(DurationKt.toDuration(5, DurationUnit.MINUTES));
    }
}

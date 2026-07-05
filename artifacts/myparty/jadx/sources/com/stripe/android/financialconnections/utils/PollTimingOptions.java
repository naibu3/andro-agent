package com.stripe.android.financialconnections.utils;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.imagepipeline.common.RotationOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/utils/PollTimingOptions;", "", "initialDelayMs", "", "maxNumberOfRetries", "", "retryInterval", "<init>", "(JIJ)V", "getInitialDelayMs", "()J", "getMaxNumberOfRetries", "()I", "getRetryInterval", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PollTimingOptions {
    public static final int $stable = 0;
    private final long initialDelayMs;
    private final int maxNumberOfRetries;
    private final long retryInterval;

    public PollTimingOptions() {
        this(0L, 0, 0L, 7, null);
    }

    public static /* synthetic */ PollTimingOptions copy$default(PollTimingOptions pollTimingOptions, long j, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = pollTimingOptions.initialDelayMs;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = pollTimingOptions.maxNumberOfRetries;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = pollTimingOptions.retryInterval;
        }
        return pollTimingOptions.copy(j3, i3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getInitialDelayMs() {
        return this.initialDelayMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxNumberOfRetries() {
        return this.maxNumberOfRetries;
    }

    /* renamed from: component3, reason: from getter */
    public final long getRetryInterval() {
        return this.retryInterval;
    }

    public final PollTimingOptions copy(long initialDelayMs, int maxNumberOfRetries, long retryInterval) {
        return new PollTimingOptions(initialDelayMs, maxNumberOfRetries, retryInterval);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollTimingOptions)) {
            return false;
        }
        PollTimingOptions pollTimingOptions = (PollTimingOptions) other;
        return this.initialDelayMs == pollTimingOptions.initialDelayMs && this.maxNumberOfRetries == pollTimingOptions.maxNumberOfRetries && this.retryInterval == pollTimingOptions.retryInterval;
    }

    public int hashCode() {
        return (((Long.hashCode(this.initialDelayMs) * 31) + Integer.hashCode(this.maxNumberOfRetries)) * 31) + Long.hashCode(this.retryInterval);
    }

    public String toString() {
        return "PollTimingOptions(initialDelayMs=" + this.initialDelayMs + ", maxNumberOfRetries=" + this.maxNumberOfRetries + ", retryInterval=" + this.retryInterval + ")";
    }

    public PollTimingOptions(long j, int i, long j2) {
        this.initialDelayMs = j;
        this.maxNumberOfRetries = i;
        this.retryInterval = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PollTimingOptions(long j, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j = Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(1.75d, DurationUnit.SECONDS));
        }
        long j3 = j;
        int i3 = (i2 & 2) != 0 ? RotationOptions.ROTATE_180 : i;
        if ((i2 & 4) != 0) {
            Duration.Companion companion2 = Duration.INSTANCE;
            j2 = Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(0.25d, DurationUnit.SECONDS));
        }
        this(j3, i3, j2);
    }

    public final long getInitialDelayMs() {
        return this.initialDelayMs;
    }

    public final int getMaxNumberOfRetries() {
        return this.maxNumberOfRetries;
    }

    public final long getRetryInterval() {
        return this.retryInterval;
    }
}

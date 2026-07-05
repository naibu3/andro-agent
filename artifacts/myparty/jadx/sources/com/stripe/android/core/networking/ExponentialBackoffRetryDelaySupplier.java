package com.stripe.android.core.networking;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: ExponentialBackoffRetryDelaySupplier.kt */
@Singleton
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0017¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "incrementDuration", "Lkotlin/time/Duration;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "()V", "J", "maxDuration", "maxRetries", "", "maxDuration-5sfh64U", "(I)J", "getDelay", "remainingRetries", "getDelay-3nIYWDw", "(II)J", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExponentialBackoffRetryDelaySupplier implements RetryDelaySupplier {
    private static final Companion Companion = new Companion(null);
    private static final long DEFAULT_INCREMENT_SECONDS = 2;
    private final long incrementDuration;

    public /* synthetic */ ExponentialBackoffRetryDelaySupplier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private ExponentialBackoffRetryDelaySupplier(long j) {
        this.incrementDuration = j;
    }

    @Inject
    public ExponentialBackoffRetryDelaySupplier() {
        this(DurationKt.toDuration(2L, DurationUnit.SECONDS), null);
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: maxDuration-5sfh64U, reason: not valid java name */
    public long mo7236maxDuration5sfh64U(int maxRetries) {
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(0, DurationUnit.SECONDS);
        for (int i = maxRetries; i > 0; i--) {
            duration = Duration.m10511plusLRDsOJo(duration, mo7235getDelay3nIYWDw(maxRetries, i));
        }
        return duration;
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: getDelay-3nIYWDw, reason: not valid java name */
    public long mo7235getDelay3nIYWDw(int maxRetries, int remainingRetries) {
        return DurationKt.toDuration(Math.pow(Duration.m10518toDoubleimpl(this.incrementDuration, DurationUnit.SECONDS), (maxRetries - RangesKt.coerceIn(remainingRetries, 1, maxRetries)) + 1), DurationUnit.SECONDS);
    }

    /* compiled from: ExponentialBackoffRetryDelaySupplier.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier$Companion;", "", "<init>", "()V", "DEFAULT_INCREMENT_SECONDS", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

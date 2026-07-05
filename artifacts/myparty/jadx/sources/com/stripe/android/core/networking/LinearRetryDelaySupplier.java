package com.stripe.android.core.networking;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: LinearRetryDelaySupplier.kt */
@Singleton
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0017¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "delay", "Lkotlin/time/Duration;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "()V", "J", "maxDuration", "maxRetries", "", "maxDuration-5sfh64U", "(I)J", "getDelay", "remainingRetries", "getDelay-3nIYWDw", "(II)J", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinearRetryDelaySupplier implements RetryDelaySupplier {
    private static final Companion Companion = new Companion(null);
    private static final long DEFAULT_DELAY = 3;
    private final long delay;

    public /* synthetic */ LinearRetryDelaySupplier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private LinearRetryDelaySupplier(long j) {
        this.delay = j;
    }

    @Inject
    public LinearRetryDelaySupplier() {
        this(DurationKt.toDuration(3L, DurationUnit.SECONDS), null);
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: maxDuration-5sfh64U */
    public long mo7236maxDuration5sfh64U(int maxRetries) {
        return Duration.m10513timesUwyO8pc(this.delay, maxRetries);
    }

    @Override // com.stripe.android.core.networking.RetryDelaySupplier
    /* renamed from: getDelay-3nIYWDw */
    public long mo7235getDelay3nIYWDw(int maxRetries, int remainingRetries) {
        return this.delay;
    }

    /* compiled from: LinearRetryDelaySupplier.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/networking/LinearRetryDelaySupplier$Companion;", "", "<init>", "()V", "DEFAULT_DELAY", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

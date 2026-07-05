package com.stripe.android.core.networking;

import kotlin.Metadata;

/* compiled from: RetryDelaySupplier.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/networking/RetryDelaySupplier;", "", "maxDuration", "Lkotlin/time/Duration;", "maxRetries", "", "maxDuration-5sfh64U", "(I)J", "getDelay", "remainingRetries", "getDelay-3nIYWDw", "(II)J", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RetryDelaySupplier {
    /* renamed from: getDelay-3nIYWDw */
    long mo7235getDelay3nIYWDw(int maxRetries, int remainingRetries);

    /* renamed from: maxDuration-5sfh64U */
    long mo7236maxDuration5sfh64U(int maxRetries);
}

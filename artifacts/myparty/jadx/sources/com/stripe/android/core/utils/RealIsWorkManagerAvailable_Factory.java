package com.stripe.android.core.utils;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class RealIsWorkManagerAvailable_Factory implements Factory<RealIsWorkManagerAvailable> {
    private final Provider<Function1<? super Continuation<? super Boolean>, ?>> isEnabledForMerchantProvider;

    public RealIsWorkManagerAvailable_Factory(Provider<Function1<? super Continuation<? super Boolean>, ?>> provider) {
        this.isEnabledForMerchantProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealIsWorkManagerAvailable get() {
        return newInstance(this.isEnabledForMerchantProvider.get());
    }

    public static RealIsWorkManagerAvailable_Factory create(javax.inject.Provider<Function1<? super Continuation<? super Boolean>, ?>> provider) {
        return new RealIsWorkManagerAvailable_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealIsWorkManagerAvailable_Factory create(Provider<Function1<? super Continuation<? super Boolean>, ?>> provider) {
        return new RealIsWorkManagerAvailable_Factory(provider);
    }

    public static RealIsWorkManagerAvailable newInstance(Function1<? super Continuation<? super Boolean>, ?> function1) {
        return new RealIsWorkManagerAvailable(function1);
    }
}

package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.api.RateLimiter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class NetworkModule_ProvideRateLimiterFactory implements Factory<RateLimiter> {
    private final NetworkModule module;

    public NetworkModule_ProvideRateLimiterFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    @Override // javax.inject.Provider
    public RateLimiter get() {
        return provideRateLimiter(this.module);
    }

    public static NetworkModule_ProvideRateLimiterFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideRateLimiterFactory(networkModule);
    }

    public static RateLimiter provideRateLimiter(NetworkModule networkModule) {
        return (RateLimiter) Preconditions.checkNotNull(networkModule.provideRateLimiter(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

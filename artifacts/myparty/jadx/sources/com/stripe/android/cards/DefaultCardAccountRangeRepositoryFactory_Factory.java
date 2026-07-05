package com.stripe.android.cards;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DefaultCardAccountRangeRepositoryFactory_Factory implements Factory<DefaultCardAccountRangeRepositoryFactory> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Set<String>> productUsageTokensProvider;

    public DefaultCardAccountRangeRepositoryFactory_Factory(Provider<Context> provider, Provider<Set<String>> provider2, Provider<AnalyticsRequestExecutor> provider3) {
        this.contextProvider = provider;
        this.productUsageTokensProvider = provider2;
        this.analyticsRequestExecutorProvider = provider3;
    }

    @Override // javax.inject.Provider
    public DefaultCardAccountRangeRepositoryFactory get() {
        return newInstance(this.contextProvider.get(), this.productUsageTokensProvider.get(), this.analyticsRequestExecutorProvider.get());
    }

    public static DefaultCardAccountRangeRepositoryFactory_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<Set<String>> provider2, javax.inject.Provider<AnalyticsRequestExecutor> provider3) {
        return new DefaultCardAccountRangeRepositoryFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static DefaultCardAccountRangeRepositoryFactory_Factory create(Provider<Context> provider, Provider<Set<String>> provider2, Provider<AnalyticsRequestExecutor> provider3) {
        return new DefaultCardAccountRangeRepositoryFactory_Factory(provider, provider2, provider3);
    }

    public static DefaultCardAccountRangeRepositoryFactory newInstance(Context context, Set<String> set, AnalyticsRequestExecutor analyticsRequestExecutor) {
        return new DefaultCardAccountRangeRepositoryFactory(context, set, analyticsRequestExecutor);
    }
}

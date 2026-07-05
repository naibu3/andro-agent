package com.stripe.android.link.injection;

import com.stripe.android.core.Logger;
import com.stripe.android.repository.ConsumersApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideConsumersApiServiceFactory implements Factory<ConsumersApiService> {
    private final Provider<Logger> loggerProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public NativeLinkModule_Companion_ProvideConsumersApiServiceFactory(Provider<Logger> provider, Provider<CoroutineContext> provider2) {
        this.loggerProvider = provider;
        this.workContextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ConsumersApiService get() {
        return provideConsumersApiService(this.loggerProvider.get(), this.workContextProvider.get());
    }

    public static NativeLinkModule_Companion_ProvideConsumersApiServiceFactory create(javax.inject.Provider<Logger> provider, javax.inject.Provider<CoroutineContext> provider2) {
        return new NativeLinkModule_Companion_ProvideConsumersApiServiceFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static NativeLinkModule_Companion_ProvideConsumersApiServiceFactory create(Provider<Logger> provider, Provider<CoroutineContext> provider2) {
        return new NativeLinkModule_Companion_ProvideConsumersApiServiceFactory(provider, provider2);
    }

    public static ConsumersApiService provideConsumersApiService(Logger logger, CoroutineContext coroutineContext) {
        return (ConsumersApiService) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.provideConsumersApiService(logger, coroutineContext));
    }
}

package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CoreAuthorizationPendingNetworkingRepairRepository_Factory implements Factory<CoreAuthorizationPendingNetworkingRepairRepository> {
    private final Provider<Logger> loggerProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public CoreAuthorizationPendingNetworkingRepairRepository_Factory(Provider<SavedStateHandle> provider, Provider<Logger> provider2) {
        this.savedStateHandleProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public CoreAuthorizationPendingNetworkingRepairRepository get() {
        return newInstance(this.savedStateHandleProvider.get(), this.loggerProvider.get());
    }

    public static CoreAuthorizationPendingNetworkingRepairRepository_Factory create(javax.inject.Provider<SavedStateHandle> provider, javax.inject.Provider<Logger> provider2) {
        return new CoreAuthorizationPendingNetworkingRepairRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static CoreAuthorizationPendingNetworkingRepairRepository_Factory create(Provider<SavedStateHandle> provider, Provider<Logger> provider2) {
        return new CoreAuthorizationPendingNetworkingRepairRepository_Factory(provider, provider2);
    }

    public static CoreAuthorizationPendingNetworkingRepairRepository newInstance(SavedStateHandle savedStateHandle, Logger logger) {
        return new CoreAuthorizationPendingNetworkingRepairRepository(savedStateHandle, logger);
    }
}

package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealIsNetworkingRelinkSession_Factory implements Factory<RealIsNetworkingRelinkSession> {
    private final Provider<CoreAuthorizationPendingNetworkingRepairRepository> pendingRepairRepositoryProvider;

    public RealIsNetworkingRelinkSession_Factory(Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider) {
        this.pendingRepairRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealIsNetworkingRelinkSession get() {
        return newInstance(this.pendingRepairRepositoryProvider.get());
    }

    public static RealIsNetworkingRelinkSession_Factory create(javax.inject.Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider) {
        return new RealIsNetworkingRelinkSession_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealIsNetworkingRelinkSession_Factory create(Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider) {
        return new RealIsNetworkingRelinkSession_Factory(provider);
    }

    public static RealIsNetworkingRelinkSession newInstance(CoreAuthorizationPendingNetworkingRepairRepository coreAuthorizationPendingNetworkingRepairRepository) {
        return new RealIsNetworkingRelinkSession(coreAuthorizationPendingNetworkingRepairRepository);
    }
}

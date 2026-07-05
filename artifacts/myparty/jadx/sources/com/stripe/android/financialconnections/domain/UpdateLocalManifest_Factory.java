package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class UpdateLocalManifest_Factory implements Factory<UpdateLocalManifest> {
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public UpdateLocalManifest_Factory(Provider<FinancialConnectionsManifestRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public UpdateLocalManifest get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static UpdateLocalManifest_Factory create(javax.inject.Provider<FinancialConnectionsManifestRepository> provider) {
        return new UpdateLocalManifest_Factory(Providers.asDaggerProvider(provider));
    }

    public static UpdateLocalManifest_Factory create(Provider<FinancialConnectionsManifestRepository> provider) {
        return new UpdateLocalManifest_Factory(provider);
    }

    public static UpdateLocalManifest newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository) {
        return new UpdateLocalManifest(financialConnectionsManifestRepository);
    }
}

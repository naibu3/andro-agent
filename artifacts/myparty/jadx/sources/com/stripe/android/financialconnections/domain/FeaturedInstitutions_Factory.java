package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FeaturedInstitutions_Factory implements Factory<FeaturedInstitutions> {
    private final Provider<FinancialConnectionsInstitutionsRepository> repositoryProvider;

    public FeaturedInstitutions_Factory(Provider<FinancialConnectionsInstitutionsRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public FeaturedInstitutions get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static FeaturedInstitutions_Factory create(javax.inject.Provider<FinancialConnectionsInstitutionsRepository> provider) {
        return new FeaturedInstitutions_Factory(Providers.asDaggerProvider(provider));
    }

    public static FeaturedInstitutions_Factory create(Provider<FinancialConnectionsInstitutionsRepository> provider) {
        return new FeaturedInstitutions_Factory(provider);
    }

    public static FeaturedInstitutions newInstance(FinancialConnectionsInstitutionsRepository financialConnectionsInstitutionsRepository) {
        return new FeaturedInstitutions(financialConnectionsInstitutionsRepository);
    }
}

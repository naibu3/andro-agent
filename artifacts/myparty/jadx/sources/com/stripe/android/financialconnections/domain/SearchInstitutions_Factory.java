package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class SearchInstitutions_Factory implements Factory<SearchInstitutions> {
    private final Provider<FinancialConnectionsInstitutionsRepository> repositoryProvider;

    public SearchInstitutions_Factory(Provider<FinancialConnectionsInstitutionsRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public SearchInstitutions get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static SearchInstitutions_Factory create(javax.inject.Provider<FinancialConnectionsInstitutionsRepository> provider) {
        return new SearchInstitutions_Factory(Providers.asDaggerProvider(provider));
    }

    public static SearchInstitutions_Factory create(Provider<FinancialConnectionsInstitutionsRepository> provider) {
        return new SearchInstitutions_Factory(provider);
    }

    public static SearchInstitutions newInstance(FinancialConnectionsInstitutionsRepository financialConnectionsInstitutionsRepository) {
        return new SearchInstitutions(financialConnectionsInstitutionsRepository);
    }
}

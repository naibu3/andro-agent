package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory implements Factory<FinancialConnectionsRepository> {
    private final Provider<FinancialConnectionsRepositoryImpl> repositoryProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory(Provider<FinancialConnectionsRepositoryImpl> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsRepository get() {
        return provideConnectionsRepository(this.repositoryProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory create(javax.inject.Provider<FinancialConnectionsRepositoryImpl> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory create(Provider<FinancialConnectionsRepositoryImpl> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory(provider);
    }

    public static FinancialConnectionsRepository provideConnectionsRepository(FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl) {
        return (FinancialConnectionsRepository) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideConnectionsRepository(financialConnectionsRepositoryImpl));
    }
}

package com.stripe.android.financialconnections.di;

import com.stripe.android.core.utils.IsWorkManagerAvailable;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory implements Factory<IsWorkManagerAvailable> {
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory(Provider<GetOrFetchSync> provider) {
        this.getOrFetchSyncProvider = provider;
    }

    @Override // javax.inject.Provider
    public IsWorkManagerAvailable get() {
        return providesIsWorkManagerAvailable$financial_connections_release(this.getOrFetchSyncProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory create(javax.inject.Provider<GetOrFetchSync> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory create(Provider<GetOrFetchSync> provider) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory(provider);
    }

    public static IsWorkManagerAvailable providesIsWorkManagerAvailable$financial_connections_release(GetOrFetchSync getOrFetchSync) {
        return (IsWorkManagerAvailable) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.providesIsWorkManagerAvailable$financial_connections_release(getOrFetchSync));
    }
}

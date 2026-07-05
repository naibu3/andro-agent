package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsErrorRepository_Factory implements Factory<FinancialConnectionsErrorRepository> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public FinancialConnectionsErrorRepository_Factory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsErrorRepository get() {
        return newInstance(this.savedStateHandleProvider.get());
    }

    public static FinancialConnectionsErrorRepository_Factory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new FinancialConnectionsErrorRepository_Factory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsErrorRepository_Factory create(Provider<SavedStateHandle> provider) {
        return new FinancialConnectionsErrorRepository_Factory(provider);
    }

    public static FinancialConnectionsErrorRepository newInstance(SavedStateHandle savedStateHandle) {
        return new FinancialConnectionsErrorRepository(savedStateHandle);
    }
}

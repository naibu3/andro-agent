package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class AccountUpdateRequiredContentRepository_Factory implements Factory<AccountUpdateRequiredContentRepository> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public AccountUpdateRequiredContentRepository_Factory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public AccountUpdateRequiredContentRepository get() {
        return newInstance(this.savedStateHandleProvider.get());
    }

    public static AccountUpdateRequiredContentRepository_Factory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new AccountUpdateRequiredContentRepository_Factory(Providers.asDaggerProvider(provider));
    }

    public static AccountUpdateRequiredContentRepository_Factory create(Provider<SavedStateHandle> provider) {
        return new AccountUpdateRequiredContentRepository_Factory(provider);
    }

    public static AccountUpdateRequiredContentRepository newInstance(SavedStateHandle savedStateHandle) {
        return new AccountUpdateRequiredContentRepository(savedStateHandle);
    }
}

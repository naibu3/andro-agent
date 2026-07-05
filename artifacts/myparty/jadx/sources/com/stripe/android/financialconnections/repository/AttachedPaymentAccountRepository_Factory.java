package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class AttachedPaymentAccountRepository_Factory implements Factory<AttachedPaymentAccountRepository> {
    private final Provider<Logger> loggerProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public AttachedPaymentAccountRepository_Factory(Provider<SavedStateHandle> provider, Provider<Logger> provider2) {
        this.savedStateHandleProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AttachedPaymentAccountRepository get() {
        return newInstance(this.savedStateHandleProvider.get(), this.loggerProvider.get());
    }

    public static AttachedPaymentAccountRepository_Factory create(javax.inject.Provider<SavedStateHandle> provider, javax.inject.Provider<Logger> provider2) {
        return new AttachedPaymentAccountRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static AttachedPaymentAccountRepository_Factory create(Provider<SavedStateHandle> provider, Provider<Logger> provider2) {
        return new AttachedPaymentAccountRepository_Factory(provider, provider2);
    }

    public static AttachedPaymentAccountRepository newInstance(SavedStateHandle savedStateHandle, Logger logger) {
        return new AttachedPaymentAccountRepository(savedStateHandle, logger);
    }
}

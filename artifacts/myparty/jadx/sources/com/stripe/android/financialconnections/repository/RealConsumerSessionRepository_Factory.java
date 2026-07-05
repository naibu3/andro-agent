package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealConsumerSessionRepository_Factory implements Factory<RealConsumerSessionRepository> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public RealConsumerSessionRepository_Factory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealConsumerSessionRepository get() {
        return newInstance(this.savedStateHandleProvider.get());
    }

    public static RealConsumerSessionRepository_Factory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new RealConsumerSessionRepository_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealConsumerSessionRepository_Factory create(Provider<SavedStateHandle> provider) {
        return new RealConsumerSessionRepository_Factory(provider);
    }

    public static RealConsumerSessionRepository newInstance(SavedStateHandle savedStateHandle) {
        return new RealConsumerSessionRepository(savedStateHandle);
    }
}

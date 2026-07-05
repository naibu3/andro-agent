package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class SuccessContentRepository_Factory implements Factory<SuccessContentRepository> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public SuccessContentRepository_Factory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public SuccessContentRepository get() {
        return newInstance(this.savedStateHandleProvider.get());
    }

    public static SuccessContentRepository_Factory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new SuccessContentRepository_Factory(Providers.asDaggerProvider(provider));
    }

    public static SuccessContentRepository_Factory create(Provider<SavedStateHandle> provider) {
        return new SuccessContentRepository_Factory(provider);
    }

    public static SuccessContentRepository newInstance(SavedStateHandle savedStateHandle) {
        return new SuccessContentRepository(savedStateHandle);
    }
}

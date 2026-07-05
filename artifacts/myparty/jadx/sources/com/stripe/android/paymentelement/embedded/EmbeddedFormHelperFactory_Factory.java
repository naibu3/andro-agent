package com.stripe.android.paymentelement.embedded;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.link.LinkConfigurationCoordinator;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class EmbeddedFormHelperFactory_Factory implements Factory<EmbeddedFormHelperFactory> {
    private final Provider<CardAccountRangeRepository.Factory> cardAccountRangeRepositoryFactoryProvider;
    private final Provider<EmbeddedSelectionHolder> embeddedSelectionHolderProvider;
    private final Provider<LinkConfigurationCoordinator> linkConfigurationCoordinatorProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public EmbeddedFormHelperFactory_Factory(Provider<LinkConfigurationCoordinator> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<CardAccountRangeRepository.Factory> provider3, Provider<SavedStateHandle> provider4) {
        this.linkConfigurationCoordinatorProvider = provider;
        this.embeddedSelectionHolderProvider = provider2;
        this.cardAccountRangeRepositoryFactoryProvider = provider3;
        this.savedStateHandleProvider = provider4;
    }

    @Override // javax.inject.Provider
    public EmbeddedFormHelperFactory get() {
        return newInstance(this.linkConfigurationCoordinatorProvider.get(), this.embeddedSelectionHolderProvider.get(), this.cardAccountRangeRepositoryFactoryProvider.get(), this.savedStateHandleProvider.get());
    }

    public static EmbeddedFormHelperFactory_Factory create(javax.inject.Provider<LinkConfigurationCoordinator> provider, javax.inject.Provider<EmbeddedSelectionHolder> provider2, javax.inject.Provider<CardAccountRangeRepository.Factory> provider3, javax.inject.Provider<SavedStateHandle> provider4) {
        return new EmbeddedFormHelperFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static EmbeddedFormHelperFactory_Factory create(Provider<LinkConfigurationCoordinator> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<CardAccountRangeRepository.Factory> provider3, Provider<SavedStateHandle> provider4) {
        return new EmbeddedFormHelperFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static EmbeddedFormHelperFactory newInstance(LinkConfigurationCoordinator linkConfigurationCoordinator, EmbeddedSelectionHolder embeddedSelectionHolder, CardAccountRangeRepository.Factory factory, SavedStateHandle savedStateHandle) {
        return new EmbeddedFormHelperFactory(linkConfigurationCoordinator, embeddedSelectionHolder, factory, savedStateHandle);
    }
}

package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedConfigurationCoordinator_Factory implements Factory<DefaultEmbeddedConfigurationCoordinator> {
    private final Provider<EmbeddedConfigurationHandler> configurationHandlerProvider;
    private final Provider<EmbeddedConfirmationStateHolder> confirmationStateHolderProvider;
    private final Provider<EmbeddedSelectionChooser> selectionChooserProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;
    private final Provider<EmbeddedStateHelper> stateHelperProvider;
    private final Provider<CoroutineScope> viewModelScopeProvider;

    public DefaultEmbeddedConfigurationCoordinator_Factory(Provider<EmbeddedConfirmationStateHolder> provider, Provider<EmbeddedConfigurationHandler> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<EmbeddedSelectionChooser> provider4, Provider<EmbeddedStateHelper> provider5, Provider<CoroutineScope> provider6) {
        this.confirmationStateHolderProvider = provider;
        this.configurationHandlerProvider = provider2;
        this.selectionHolderProvider = provider3;
        this.selectionChooserProvider = provider4;
        this.stateHelperProvider = provider5;
        this.viewModelScopeProvider = provider6;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedConfigurationCoordinator get() {
        return newInstance(this.confirmationStateHolderProvider.get(), this.configurationHandlerProvider.get(), this.selectionHolderProvider.get(), this.selectionChooserProvider.get(), this.stateHelperProvider.get(), this.viewModelScopeProvider.get());
    }

    public static DefaultEmbeddedConfigurationCoordinator_Factory create(javax.inject.Provider<EmbeddedConfirmationStateHolder> provider, javax.inject.Provider<EmbeddedConfigurationHandler> provider2, javax.inject.Provider<EmbeddedSelectionHolder> provider3, javax.inject.Provider<EmbeddedSelectionChooser> provider4, javax.inject.Provider<EmbeddedStateHelper> provider5, javax.inject.Provider<CoroutineScope> provider6) {
        return new DefaultEmbeddedConfigurationCoordinator_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static DefaultEmbeddedConfigurationCoordinator_Factory create(Provider<EmbeddedConfirmationStateHolder> provider, Provider<EmbeddedConfigurationHandler> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<EmbeddedSelectionChooser> provider4, Provider<EmbeddedStateHelper> provider5, Provider<CoroutineScope> provider6) {
        return new DefaultEmbeddedConfigurationCoordinator_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultEmbeddedConfigurationCoordinator newInstance(EmbeddedConfirmationStateHolder embeddedConfirmationStateHolder, EmbeddedConfigurationHandler embeddedConfigurationHandler, EmbeddedSelectionHolder embeddedSelectionHolder, EmbeddedSelectionChooser embeddedSelectionChooser, EmbeddedStateHelper embeddedStateHelper, CoroutineScope coroutineScope) {
        return new DefaultEmbeddedConfigurationCoordinator(embeddedConfirmationStateHolder, embeddedConfigurationHandler, embeddedSelectionHolder, embeddedSelectionChooser, embeddedStateHelper, coroutineScope);
    }
}

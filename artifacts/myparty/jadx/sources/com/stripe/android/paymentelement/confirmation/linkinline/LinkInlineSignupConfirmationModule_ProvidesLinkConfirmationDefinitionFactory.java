package com.stripe.android.paymentelement.confirmation.linkinline;

import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory implements Factory<ConfirmationDefinition<?, ?, ?, ?>> {
    private final Provider<LinkAnalyticsComponent.Builder> linkAnalyticsComponentBuilderProvider;
    private final Provider<LinkConfigurationCoordinator> linkConfigurationCoordinatorProvider;
    private final Provider<LinkStore> linkStoreProvider;

    public LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory(Provider<LinkStore> provider, Provider<LinkConfigurationCoordinator> provider2, Provider<LinkAnalyticsComponent.Builder> provider3) {
        this.linkStoreProvider = provider;
        this.linkConfigurationCoordinatorProvider = provider2;
        this.linkAnalyticsComponentBuilderProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ConfirmationDefinition<?, ?, ?, ?> get() {
        return providesLinkConfirmationDefinition(this.linkStoreProvider.get(), this.linkConfigurationCoordinatorProvider.get(), this.linkAnalyticsComponentBuilderProvider.get());
    }

    public static LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory create(javax.inject.Provider<LinkStore> provider, javax.inject.Provider<LinkConfigurationCoordinator> provider2, javax.inject.Provider<LinkAnalyticsComponent.Builder> provider3) {
        return new LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory create(Provider<LinkStore> provider, Provider<LinkConfigurationCoordinator> provider2, Provider<LinkAnalyticsComponent.Builder> provider3) {
        return new LinkInlineSignupConfirmationModule_ProvidesLinkConfirmationDefinitionFactory(provider, provider2, provider3);
    }

    public static ConfirmationDefinition<?, ?, ?, ?> providesLinkConfirmationDefinition(LinkStore linkStore, LinkConfigurationCoordinator linkConfigurationCoordinator, LinkAnalyticsComponent.Builder builder) {
        return (ConfirmationDefinition) Preconditions.checkNotNullFromProvides(LinkInlineSignupConfirmationModule.INSTANCE.providesLinkConfirmationDefinition(linkStore, linkConfigurationCoordinator, builder));
    }
}

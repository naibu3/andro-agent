package com.stripe.android.link.injection;

import com.stripe.android.link.account.DefaultLinkAccountManager;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory implements Factory<ConfirmationDefinition<?, ?, ?, ?>> {
    private final Provider<DefaultLinkAccountManager> linkAccountManagerProvider;

    public NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory(Provider<DefaultLinkAccountManager> provider) {
        this.linkAccountManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConfirmationDefinition<?, ?, ?, ?> get() {
        return providesLinkPassthroughConfirmationDefinition(this.linkAccountManagerProvider.get());
    }

    public static NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory create(javax.inject.Provider<DefaultLinkAccountManager> provider) {
        return new NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory(Providers.asDaggerProvider(provider));
    }

    public static NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory create(Provider<DefaultLinkAccountManager> provider) {
        return new NativeLinkModule_Companion_ProvidesLinkPassthroughConfirmationDefinitionFactory(provider);
    }

    public static ConfirmationDefinition<?, ?, ?, ?> providesLinkPassthroughConfirmationDefinition(DefaultLinkAccountManager defaultLinkAccountManager) {
        return (ConfirmationDefinition) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.providesLinkPassthroughConfirmationDefinition(defaultLinkAccountManager));
    }
}

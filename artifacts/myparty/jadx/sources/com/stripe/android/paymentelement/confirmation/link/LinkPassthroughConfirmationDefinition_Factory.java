package com.stripe.android.paymentelement.confirmation.link;

import com.stripe.android.link.account.LinkAccountManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkPassthroughConfirmationDefinition_Factory implements Factory<LinkPassthroughConfirmationDefinition> {
    private final Provider<LinkAccountManager> linkAccountManagerProvider;

    public LinkPassthroughConfirmationDefinition_Factory(Provider<LinkAccountManager> provider) {
        this.linkAccountManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public LinkPassthroughConfirmationDefinition get() {
        return newInstance(this.linkAccountManagerProvider.get());
    }

    public static LinkPassthroughConfirmationDefinition_Factory create(javax.inject.Provider<LinkAccountManager> provider) {
        return new LinkPassthroughConfirmationDefinition_Factory(Providers.asDaggerProvider(provider));
    }

    public static LinkPassthroughConfirmationDefinition_Factory create(Provider<LinkAccountManager> provider) {
        return new LinkPassthroughConfirmationDefinition_Factory(provider);
    }

    public static LinkPassthroughConfirmationDefinition newInstance(LinkAccountManager linkAccountManager) {
        return new LinkPassthroughConfirmationDefinition(linkAccountManager);
    }
}

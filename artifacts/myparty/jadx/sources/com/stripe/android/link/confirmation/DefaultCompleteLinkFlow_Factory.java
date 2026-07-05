package com.stripe.android.link.confirmation;

import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.account.LinkAccountManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultCompleteLinkFlow_Factory implements Factory<DefaultCompleteLinkFlow> {
    private final Provider<LinkDismissalCoordinator> dismissalCoordinatorProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkConfirmationHandler> linkConfirmationHandlerProvider;
    private final Provider<LinkLaunchMode> linkLaunchModeProvider;

    public DefaultCompleteLinkFlow_Factory(Provider<LinkConfirmationHandler> provider, Provider<LinkAccountManager> provider2, Provider<LinkDismissalCoordinator> provider3, Provider<LinkLaunchMode> provider4) {
        this.linkConfirmationHandlerProvider = provider;
        this.linkAccountManagerProvider = provider2;
        this.dismissalCoordinatorProvider = provider3;
        this.linkLaunchModeProvider = provider4;
    }

    @Override // javax.inject.Provider
    public DefaultCompleteLinkFlow get() {
        return newInstance(this.linkConfirmationHandlerProvider.get(), this.linkAccountManagerProvider.get(), this.dismissalCoordinatorProvider.get(), this.linkLaunchModeProvider.get());
    }

    public static DefaultCompleteLinkFlow_Factory create(javax.inject.Provider<LinkConfirmationHandler> provider, javax.inject.Provider<LinkAccountManager> provider2, javax.inject.Provider<LinkDismissalCoordinator> provider3, javax.inject.Provider<LinkLaunchMode> provider4) {
        return new DefaultCompleteLinkFlow_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static DefaultCompleteLinkFlow_Factory create(Provider<LinkConfirmationHandler> provider, Provider<LinkAccountManager> provider2, Provider<LinkDismissalCoordinator> provider3, Provider<LinkLaunchMode> provider4) {
        return new DefaultCompleteLinkFlow_Factory(provider, provider2, provider3, provider4);
    }

    public static DefaultCompleteLinkFlow newInstance(LinkConfirmationHandler linkConfirmationHandler, LinkAccountManager linkAccountManager, LinkDismissalCoordinator linkDismissalCoordinator, LinkLaunchMode linkLaunchMode) {
        return new DefaultCompleteLinkFlow(linkConfirmationHandler, linkAccountManager, linkDismissalCoordinator, linkLaunchMode);
    }
}

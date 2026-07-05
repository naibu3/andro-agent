package com.stripe.android.paymentsheet.state;

import com.stripe.android.link.LinkConfigurationCoordinator;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class DefaultLinkAccountStatusProvider_Factory implements Factory<DefaultLinkAccountStatusProvider> {
    private final Provider<LinkConfigurationCoordinator> linkConfigurationCoordinatorProvider;

    public DefaultLinkAccountStatusProvider_Factory(Provider<LinkConfigurationCoordinator> provider) {
        this.linkConfigurationCoordinatorProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultLinkAccountStatusProvider get() {
        return newInstance(this.linkConfigurationCoordinatorProvider.get());
    }

    public static DefaultLinkAccountStatusProvider_Factory create(javax.inject.Provider<LinkConfigurationCoordinator> provider) {
        return new DefaultLinkAccountStatusProvider_Factory(Providers.asDaggerProvider(provider));
    }

    public static DefaultLinkAccountStatusProvider_Factory create(Provider<LinkConfigurationCoordinator> provider) {
        return new DefaultLinkAccountStatusProvider_Factory(provider);
    }

    public static DefaultLinkAccountStatusProvider newInstance(LinkConfigurationCoordinator linkConfigurationCoordinator) {
        return new DefaultLinkAccountStatusProvider(linkConfigurationCoordinator);
    }
}

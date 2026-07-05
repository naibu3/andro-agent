package com.stripe.android.link;

import com.stripe.android.link.injection.LinkComponent;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealLinkConfigurationCoordinator_Factory implements Factory<RealLinkConfigurationCoordinator> {
    private final Provider<LinkComponent.Builder> linkComponentBuilderProvider;

    public RealLinkConfigurationCoordinator_Factory(Provider<LinkComponent.Builder> provider) {
        this.linkComponentBuilderProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealLinkConfigurationCoordinator get() {
        return newInstance(this.linkComponentBuilderProvider.get());
    }

    public static RealLinkConfigurationCoordinator_Factory create(javax.inject.Provider<LinkComponent.Builder> provider) {
        return new RealLinkConfigurationCoordinator_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealLinkConfigurationCoordinator_Factory create(Provider<LinkComponent.Builder> provider) {
        return new RealLinkConfigurationCoordinator_Factory(provider);
    }

    public static RealLinkConfigurationCoordinator newInstance(LinkComponent.Builder builder) {
        return new RealLinkConfigurationCoordinator(builder);
    }
}

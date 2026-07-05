package com.stripe.android.link.account;

import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultLinkAccountManager_Factory implements Factory<DefaultLinkAccountManager> {
    private final Provider<LinkConfiguration> configProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<LinkAccountHolder> linkAccountHolderProvider;
    private final Provider<LinkEventsReporter> linkEventsReporterProvider;
    private final Provider<LinkRepository> linkRepositoryProvider;

    public DefaultLinkAccountManager_Factory(Provider<LinkAccountHolder> provider, Provider<LinkConfiguration> provider2, Provider<LinkRepository> provider3, Provider<LinkEventsReporter> provider4, Provider<ErrorReporter> provider5) {
        this.linkAccountHolderProvider = provider;
        this.configProvider = provider2;
        this.linkRepositoryProvider = provider3;
        this.linkEventsReporterProvider = provider4;
        this.errorReporterProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultLinkAccountManager get() {
        return newInstance(this.linkAccountHolderProvider.get(), this.configProvider.get(), this.linkRepositoryProvider.get(), this.linkEventsReporterProvider.get(), this.errorReporterProvider.get());
    }

    public static DefaultLinkAccountManager_Factory create(javax.inject.Provider<LinkAccountHolder> provider, javax.inject.Provider<LinkConfiguration> provider2, javax.inject.Provider<LinkRepository> provider3, javax.inject.Provider<LinkEventsReporter> provider4, javax.inject.Provider<ErrorReporter> provider5) {
        return new DefaultLinkAccountManager_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static DefaultLinkAccountManager_Factory create(Provider<LinkAccountHolder> provider, Provider<LinkConfiguration> provider2, Provider<LinkRepository> provider3, Provider<LinkEventsReporter> provider4, Provider<ErrorReporter> provider5) {
        return new DefaultLinkAccountManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultLinkAccountManager newInstance(LinkAccountHolder linkAccountHolder, LinkConfiguration linkConfiguration, LinkRepository linkRepository, LinkEventsReporter linkEventsReporter, ErrorReporter errorReporter) {
        return new DefaultLinkAccountManager(linkAccountHolder, linkConfiguration, linkRepository, linkEventsReporter, errorReporter);
    }
}

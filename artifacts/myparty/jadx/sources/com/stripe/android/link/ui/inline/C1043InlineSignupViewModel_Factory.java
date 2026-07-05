package com.stripe.android.link.ui.inline;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1043InlineSignupViewModel_Factory {
    private final Provider<LinkConfiguration> configProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkEventsReporter> linkEventsReporterProvider;
    private final Provider<Logger> loggerProvider;

    public C1043InlineSignupViewModel_Factory(Provider<LinkConfiguration> provider, Provider<LinkAccountManager> provider2, Provider<LinkEventsReporter> provider3, Provider<Logger> provider4) {
        this.configProvider = provider;
        this.linkAccountManagerProvider = provider2;
        this.linkEventsReporterProvider = provider3;
        this.loggerProvider = provider4;
    }

    public InlineSignupViewModel get(UserInput userInput, LinkSignupMode linkSignupMode) {
        return newInstance(userInput, linkSignupMode, this.configProvider.get(), this.linkAccountManagerProvider.get(), this.linkEventsReporterProvider.get(), this.loggerProvider.get());
    }

    public static C1043InlineSignupViewModel_Factory create(javax.inject.Provider<LinkConfiguration> provider, javax.inject.Provider<LinkAccountManager> provider2, javax.inject.Provider<LinkEventsReporter> provider3, javax.inject.Provider<Logger> provider4) {
        return new C1043InlineSignupViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static C1043InlineSignupViewModel_Factory create(Provider<LinkConfiguration> provider, Provider<LinkAccountManager> provider2, Provider<LinkEventsReporter> provider3, Provider<Logger> provider4) {
        return new C1043InlineSignupViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static InlineSignupViewModel newInstance(UserInput userInput, LinkSignupMode linkSignupMode, LinkConfiguration linkConfiguration, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger) {
        return new InlineSignupViewModel(userInput, linkSignupMode, linkConfiguration, linkAccountManager, linkEventsReporter, logger);
    }
}

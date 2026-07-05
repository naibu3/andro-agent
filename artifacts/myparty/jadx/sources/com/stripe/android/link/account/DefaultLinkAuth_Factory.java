package com.stripe.android.link.account;

import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultLinkAuth_Factory implements Factory<DefaultLinkAuth> {
    private final Provider<String> applicationIdProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<IntegrityRequestManager> integrityRequestManagerProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkGate> linkGateProvider;

    public DefaultLinkAuth_Factory(Provider<LinkGate> provider, Provider<LinkAccountManager> provider2, Provider<IntegrityRequestManager> provider3, Provider<ErrorReporter> provider4, Provider<String> provider5) {
        this.linkGateProvider = provider;
        this.linkAccountManagerProvider = provider2;
        this.integrityRequestManagerProvider = provider3;
        this.errorReporterProvider = provider4;
        this.applicationIdProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultLinkAuth get() {
        return newInstance(this.linkGateProvider.get(), this.linkAccountManagerProvider.get(), this.integrityRequestManagerProvider.get(), this.errorReporterProvider.get(), this.applicationIdProvider.get());
    }

    public static DefaultLinkAuth_Factory create(javax.inject.Provider<LinkGate> provider, javax.inject.Provider<LinkAccountManager> provider2, javax.inject.Provider<IntegrityRequestManager> provider3, javax.inject.Provider<ErrorReporter> provider4, javax.inject.Provider<String> provider5) {
        return new DefaultLinkAuth_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static DefaultLinkAuth_Factory create(Provider<LinkGate> provider, Provider<LinkAccountManager> provider2, Provider<IntegrityRequestManager> provider3, Provider<ErrorReporter> provider4, Provider<String> provider5) {
        return new DefaultLinkAuth_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultLinkAuth newInstance(LinkGate linkGate, LinkAccountManager linkAccountManager, IntegrityRequestManager integrityRequestManager, ErrorReporter errorReporter, String str) {
        return new DefaultLinkAuth(linkGate, linkAccountManager, integrityRequestManager, errorReporter, str);
    }
}

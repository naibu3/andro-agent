package com.stripe.android.link.attestation;

import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class DefaultLinkAttestationCheck_Factory implements Factory<DefaultLinkAttestationCheck> {
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<IntegrityRequestManager> integrityRequestManagerProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkAuth> linkAuthProvider;
    private final Provider<LinkConfiguration> linkConfigurationProvider;
    private final Provider<LinkGate> linkGateProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public DefaultLinkAttestationCheck_Factory(Provider<LinkGate> provider, Provider<LinkAuth> provider2, Provider<IntegrityRequestManager> provider3, Provider<LinkAccountManager> provider4, Provider<LinkConfiguration> provider5, Provider<ErrorReporter> provider6, Provider<CoroutineContext> provider7) {
        this.linkGateProvider = provider;
        this.linkAuthProvider = provider2;
        this.integrityRequestManagerProvider = provider3;
        this.linkAccountManagerProvider = provider4;
        this.linkConfigurationProvider = provider5;
        this.errorReporterProvider = provider6;
        this.workContextProvider = provider7;
    }

    @Override // javax.inject.Provider
    public DefaultLinkAttestationCheck get() {
        return newInstance(this.linkGateProvider.get(), this.linkAuthProvider.get(), this.integrityRequestManagerProvider.get(), this.linkAccountManagerProvider.get(), this.linkConfigurationProvider.get(), this.errorReporterProvider.get(), this.workContextProvider.get());
    }

    public static DefaultLinkAttestationCheck_Factory create(javax.inject.Provider<LinkGate> provider, javax.inject.Provider<LinkAuth> provider2, javax.inject.Provider<IntegrityRequestManager> provider3, javax.inject.Provider<LinkAccountManager> provider4, javax.inject.Provider<LinkConfiguration> provider5, javax.inject.Provider<ErrorReporter> provider6, javax.inject.Provider<CoroutineContext> provider7) {
        return new DefaultLinkAttestationCheck_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static DefaultLinkAttestationCheck_Factory create(Provider<LinkGate> provider, Provider<LinkAuth> provider2, Provider<IntegrityRequestManager> provider3, Provider<LinkAccountManager> provider4, Provider<LinkConfiguration> provider5, Provider<ErrorReporter> provider6, Provider<CoroutineContext> provider7) {
        return new DefaultLinkAttestationCheck_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DefaultLinkAttestationCheck newInstance(LinkGate linkGate, LinkAuth linkAuth, IntegrityRequestManager integrityRequestManager, LinkAccountManager linkAccountManager, LinkConfiguration linkConfiguration, ErrorReporter errorReporter, CoroutineContext coroutineContext) {
        return new DefaultLinkAttestationCheck(linkGate, linkAuth, integrityRequestManager, linkAccountManager, linkConfiguration, errorReporter, coroutineContext);
    }
}

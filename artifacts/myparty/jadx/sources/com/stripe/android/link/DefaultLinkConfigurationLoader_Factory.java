package com.stripe.android.link;

import com.stripe.android.core.Logger;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultLinkConfigurationLoader_Factory implements Factory<DefaultLinkConfigurationLoader> {
    private final Provider<LinkGate.Factory> linkGateFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PaymentElementLoader> paymentElementLoaderProvider;

    public DefaultLinkConfigurationLoader_Factory(Provider<Logger> provider, Provider<PaymentElementLoader> provider2, Provider<LinkGate.Factory> provider3) {
        this.loggerProvider = provider;
        this.paymentElementLoaderProvider = provider2;
        this.linkGateFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public DefaultLinkConfigurationLoader get() {
        return newInstance(this.loggerProvider.get(), this.paymentElementLoaderProvider.get(), this.linkGateFactoryProvider.get());
    }

    public static DefaultLinkConfigurationLoader_Factory create(javax.inject.Provider<Logger> provider, javax.inject.Provider<PaymentElementLoader> provider2, javax.inject.Provider<LinkGate.Factory> provider3) {
        return new DefaultLinkConfigurationLoader_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static DefaultLinkConfigurationLoader_Factory create(Provider<Logger> provider, Provider<PaymentElementLoader> provider2, Provider<LinkGate.Factory> provider3) {
        return new DefaultLinkConfigurationLoader_Factory(provider, provider2, provider3);
    }

    public static DefaultLinkConfigurationLoader newInstance(Logger logger, PaymentElementLoader paymentElementLoader, LinkGate.Factory factory) {
        return new DefaultLinkConfigurationLoader(logger, paymentElementLoader, factory);
    }
}

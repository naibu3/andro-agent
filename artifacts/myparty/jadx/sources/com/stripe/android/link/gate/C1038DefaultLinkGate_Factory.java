package com.stripe.android.link.gate;

import com.stripe.android.link.LinkConfiguration;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.link.gate.DefaultLinkGate_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1038DefaultLinkGate_Factory implements Factory<DefaultLinkGate> {
    private final Provider<LinkConfiguration> configurationProvider;

    public C1038DefaultLinkGate_Factory(Provider<LinkConfiguration> provider) {
        this.configurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultLinkGate get() {
        return newInstance(this.configurationProvider.get());
    }

    public static C1038DefaultLinkGate_Factory create(javax.inject.Provider<LinkConfiguration> provider) {
        return new C1038DefaultLinkGate_Factory(Providers.asDaggerProvider(provider));
    }

    public static C1038DefaultLinkGate_Factory create(Provider<LinkConfiguration> provider) {
        return new C1038DefaultLinkGate_Factory(provider);
    }

    public static DefaultLinkGate newInstance(LinkConfiguration linkConfiguration) {
        return new DefaultLinkGate(linkConfiguration);
    }
}

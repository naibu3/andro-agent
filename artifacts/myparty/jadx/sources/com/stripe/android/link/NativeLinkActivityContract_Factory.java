package com.stripe.android.link;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class NativeLinkActivityContract_Factory implements Factory<NativeLinkActivityContract> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public NativeLinkActivityContract_Factory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public NativeLinkActivityContract get() {
        return newInstance(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static NativeLinkActivityContract_Factory create(javax.inject.Provider<String> provider) {
        return new NativeLinkActivityContract_Factory(Providers.asDaggerProvider(provider));
    }

    public static NativeLinkActivityContract_Factory create(Provider<String> provider) {
        return new NativeLinkActivityContract_Factory(provider);
    }

    public static NativeLinkActivityContract newInstance(String str) {
        return new NativeLinkActivityContract(str);
    }
}

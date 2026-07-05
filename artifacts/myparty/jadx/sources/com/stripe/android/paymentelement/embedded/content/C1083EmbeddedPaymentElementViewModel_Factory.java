package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementSubcomponent;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1083EmbeddedPaymentElementViewModel_Factory implements Factory<EmbeddedPaymentElementViewModel> {
    private final Provider<CoroutineScope> customViewModelScopeProvider;
    private final Provider<EmbeddedPaymentElementSubcomponent.Factory> embeddedPaymentElementSubcomponentFactoryProvider;

    public C1083EmbeddedPaymentElementViewModel_Factory(Provider<EmbeddedPaymentElementSubcomponent.Factory> provider, Provider<CoroutineScope> provider2) {
        this.embeddedPaymentElementSubcomponentFactoryProvider = provider;
        this.customViewModelScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public EmbeddedPaymentElementViewModel get() {
        return newInstance(this.embeddedPaymentElementSubcomponentFactoryProvider.get(), this.customViewModelScopeProvider.get());
    }

    public static C1083EmbeddedPaymentElementViewModel_Factory create(javax.inject.Provider<EmbeddedPaymentElementSubcomponent.Factory> provider, javax.inject.Provider<CoroutineScope> provider2) {
        return new C1083EmbeddedPaymentElementViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static C1083EmbeddedPaymentElementViewModel_Factory create(Provider<EmbeddedPaymentElementSubcomponent.Factory> provider, Provider<CoroutineScope> provider2) {
        return new C1083EmbeddedPaymentElementViewModel_Factory(provider, provider2);
    }

    public static EmbeddedPaymentElementViewModel newInstance(EmbeddedPaymentElementSubcomponent.Factory factory, CoroutineScope coroutineScope) {
        return new EmbeddedPaymentElementViewModel(factory, coroutineScope);
    }
}

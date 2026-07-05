package com.stripe.android.paymentelement.embedded.content;

import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvidePrefsRepositoryFactoryFactory implements Factory<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> {
    private final Provider<Context> appContextProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvidePrefsRepositoryFactoryFactory(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.appContextProvider = provider;
        this.workContextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> get() {
        return providePrefsRepositoryFactory(this.appContextProvider.get(), this.workContextProvider.get());
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidePrefsRepositoryFactoryFactory create(javax.inject.Provider<Context> provider, javax.inject.Provider<CoroutineContext> provider2) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidePrefsRepositoryFactoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidePrefsRepositoryFactoryFactory create(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidePrefsRepositoryFactoryFactory(provider, provider2);
    }

    public static Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(Context context, CoroutineContext coroutineContext) {
        return (Function1) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.providePrefsRepositoryFactory(context, coroutineContext));
    }
}

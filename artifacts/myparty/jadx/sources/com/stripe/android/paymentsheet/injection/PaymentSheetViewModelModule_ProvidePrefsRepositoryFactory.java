package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory implements Factory<PrefsRepository> {
    private final Provider<Context> appContextProvider;
    private final PaymentSheetViewModelModule module;
    private final Provider<CoroutineContext> workContextProvider;

    public PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(PaymentSheetViewModelModule paymentSheetViewModelModule, Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.module = paymentSheetViewModelModule;
        this.appContextProvider = provider;
        this.workContextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PrefsRepository get() {
        return providePrefsRepository(this.module, this.appContextProvider.get(), this.workContextProvider.get());
    }

    public static PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule, javax.inject.Provider<Context> provider, javax.inject.Provider<CoroutineContext> provider2) {
        return new PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(paymentSheetViewModelModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule, Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(paymentSheetViewModelModule, provider, provider2);
    }

    public static PrefsRepository providePrefsRepository(PaymentSheetViewModelModule paymentSheetViewModelModule, Context context, CoroutineContext coroutineContext) {
        return (PrefsRepository) Preconditions.checkNotNullFromProvides(paymentSheetViewModelModule.providePrefsRepository(context, coroutineContext));
    }
}

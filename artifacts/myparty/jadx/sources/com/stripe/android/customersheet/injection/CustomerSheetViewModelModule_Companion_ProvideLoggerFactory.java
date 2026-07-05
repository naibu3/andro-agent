package com.stripe.android.customersheet.injection;

import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvideLoggerFactory implements Factory<Logger> {
    private final Provider<Boolean> enableLoggingProvider;

    public CustomerSheetViewModelModule_Companion_ProvideLoggerFactory(Provider<Boolean> provider) {
        this.enableLoggingProvider = provider;
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return provideLogger(this.enableLoggingProvider.get().booleanValue());
    }

    public static CustomerSheetViewModelModule_Companion_ProvideLoggerFactory create(javax.inject.Provider<Boolean> provider) {
        return new CustomerSheetViewModelModule_Companion_ProvideLoggerFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetViewModelModule_Companion_ProvideLoggerFactory create(Provider<Boolean> provider) {
        return new CustomerSheetViewModelModule_Companion_ProvideLoggerFactory(provider);
    }

    public static Logger provideLogger(boolean z) {
        return (Logger) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.provideLogger(z));
    }
}

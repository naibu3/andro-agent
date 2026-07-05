package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class PollingViewModelModule_Companion_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
    private final Provider<Context> appContextProvider;

    public PollingViewModelModule_Companion_ProvidePublishableKeyFactory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return providePublishableKey(this.appContextProvider.get());
    }

    public static PollingViewModelModule_Companion_ProvidePublishableKeyFactory create(javax.inject.Provider<Context> provider) {
        return new PollingViewModelModule_Companion_ProvidePublishableKeyFactory(Providers.asDaggerProvider(provider));
    }

    public static PollingViewModelModule_Companion_ProvidePublishableKeyFactory create(Provider<Context> provider) {
        return new PollingViewModelModule_Companion_ProvidePublishableKeyFactory(provider);
    }

    public static Function0<String> providePublishableKey(Context context) {
        return (Function0) Preconditions.checkNotNullFromProvides(PollingViewModelModule.INSTANCE.providePublishableKey(context));
    }
}

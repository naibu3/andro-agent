package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory implements Factory<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> {
    private final Provider<Context> appContextProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.appContextProvider = provider;
        this.workContextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> get() {
        return providePrefsRepositoryFactory(this.appContextProvider.get(), this.workContextProvider.get());
    }

    public static PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory create(javax.inject.Provider<Context> provider, javax.inject.Provider<CoroutineContext> provider2) {
        return new PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory create(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new PaymentSheetCommonModule_Companion_ProvidePrefsRepositoryFactoryFactory(provider, provider2);
    }

    public static Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(Context context, CoroutineContext coroutineContext) {
        return (Function1) Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.INSTANCE.providePrefsRepositoryFactory(context, coroutineContext));
    }
}

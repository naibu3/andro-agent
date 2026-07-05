package com.stripe.android.googlepaylauncher;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1024GooglePayPaymentMethodLauncherViewModel_Factory implements Factory<GooglePayPaymentMethodLauncherViewModel> {
    private final Provider<GooglePayPaymentMethodLauncherContractV2.Args> argsProvider;
    private final Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;
    private final Provider<GooglePayRepository> googlePayRepositoryProvider;
    private final Provider<PaymentsClient> paymentsClientProvider;
    private final Provider<ApiRequest.Options> requestOptionsProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public C1024GooglePayPaymentMethodLauncherViewModel_Factory(Provider<PaymentsClient> provider, Provider<ApiRequest.Options> provider2, Provider<GooglePayPaymentMethodLauncherContractV2.Args> provider3, Provider<StripeRepository> provider4, Provider<GooglePayJsonFactory> provider5, Provider<GooglePayRepository> provider6, Provider<SavedStateHandle> provider7) {
        this.paymentsClientProvider = provider;
        this.requestOptionsProvider = provider2;
        this.argsProvider = provider3;
        this.stripeRepositoryProvider = provider4;
        this.googlePayJsonFactoryProvider = provider5;
        this.googlePayRepositoryProvider = provider6;
        this.savedStateHandleProvider = provider7;
    }

    @Override // javax.inject.Provider
    public GooglePayPaymentMethodLauncherViewModel get() {
        return newInstance(this.paymentsClientProvider.get(), this.requestOptionsProvider.get(), this.argsProvider.get(), this.stripeRepositoryProvider.get(), this.googlePayJsonFactoryProvider.get(), this.googlePayRepositoryProvider.get(), this.savedStateHandleProvider.get());
    }

    public static C1024GooglePayPaymentMethodLauncherViewModel_Factory create(javax.inject.Provider<PaymentsClient> provider, javax.inject.Provider<ApiRequest.Options> provider2, javax.inject.Provider<GooglePayPaymentMethodLauncherContractV2.Args> provider3, javax.inject.Provider<StripeRepository> provider4, javax.inject.Provider<GooglePayJsonFactory> provider5, javax.inject.Provider<GooglePayRepository> provider6, javax.inject.Provider<SavedStateHandle> provider7) {
        return new C1024GooglePayPaymentMethodLauncherViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static C1024GooglePayPaymentMethodLauncherViewModel_Factory create(Provider<PaymentsClient> provider, Provider<ApiRequest.Options> provider2, Provider<GooglePayPaymentMethodLauncherContractV2.Args> provider3, Provider<StripeRepository> provider4, Provider<GooglePayJsonFactory> provider5, Provider<GooglePayRepository> provider6, Provider<SavedStateHandle> provider7) {
        return new C1024GooglePayPaymentMethodLauncherViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static GooglePayPaymentMethodLauncherViewModel newInstance(PaymentsClient paymentsClient, ApiRequest.Options options, GooglePayPaymentMethodLauncherContractV2.Args args, StripeRepository stripeRepository, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, SavedStateHandle savedStateHandle) {
        return new GooglePayPaymentMethodLauncherViewModel(paymentsClient, options, args, stripeRepository, googlePayJsonFactory, googlePayRepository, savedStateHandle);
    }
}

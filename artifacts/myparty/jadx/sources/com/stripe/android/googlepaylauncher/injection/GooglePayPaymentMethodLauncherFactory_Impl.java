package com.stripe.android.googlepaylauncher.injection;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class GooglePayPaymentMethodLauncherFactory_Impl implements GooglePayPaymentMethodLauncherFactory {
    private final GooglePayPaymentMethodLauncher_Factory delegateFactory;

    GooglePayPaymentMethodLauncherFactory_Impl(GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_Factory) {
        this.delegateFactory = googlePayPaymentMethodLauncher_Factory;
    }

    @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory
    public GooglePayPaymentMethodLauncher create(CoroutineScope coroutineScope, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean z, CardBrandFilter cardBrandFilter) {
        return this.delegateFactory.get(coroutineScope, config, readyCallback, activityResultLauncher, z, cardBrandFilter);
    }

    public static Provider<GooglePayPaymentMethodLauncherFactory> create(GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_Factory) {
        return InstanceFactory.create(new GooglePayPaymentMethodLauncherFactory_Impl(googlePayPaymentMethodLauncher_Factory));
    }

    public static dagger.internal.Provider<GooglePayPaymentMethodLauncherFactory> createFactoryProvider(GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_Factory) {
        return InstanceFactory.create(new GooglePayPaymentMethodLauncherFactory_Impl(googlePayPaymentMethodLauncher_Factory));
    }
}

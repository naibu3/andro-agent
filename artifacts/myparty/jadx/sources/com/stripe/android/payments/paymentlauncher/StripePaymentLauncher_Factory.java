package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class StripePaymentLauncher_Factory {
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<Set<String>> productUsageProvider;

    public StripePaymentLauncher_Factory(Provider<Boolean> provider, Provider<Set<String>> provider2) {
        this.enableLoggingProvider = provider;
        this.productUsageProvider = provider2;
    }

    public StripePaymentLauncher get(Function0<String> function0, Function0<String> function02, ActivityResultLauncher<PaymentLauncherContract.Args> activityResultLauncher, Integer num, boolean z) {
        return newInstance(function0, function02, activityResultLauncher, num, z, this.enableLoggingProvider.get().booleanValue(), this.productUsageProvider.get());
    }

    public static StripePaymentLauncher_Factory create(javax.inject.Provider<Boolean> provider, javax.inject.Provider<Set<String>> provider2) {
        return new StripePaymentLauncher_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static StripePaymentLauncher_Factory create(Provider<Boolean> provider, Provider<Set<String>> provider2) {
        return new StripePaymentLauncher_Factory(provider, provider2);
    }

    public static StripePaymentLauncher newInstance(Function0<String> function0, Function0<String> function02, ActivityResultLauncher<PaymentLauncherContract.Args> activityResultLauncher, Integer num, boolean z, boolean z2, Set<String> set) {
        return new StripePaymentLauncher(function0, function02, activityResultLauncher, num, z, z2, set);
    }
}

package com.stripe.android.networking;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class PaymentAnalyticsRequestFactory_Factory implements Factory<PaymentAnalyticsRequestFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<Set<String>> defaultProductUsageTokensProvider;
    private final Provider<Function0<String>> publishableKeyProvider;

    public PaymentAnalyticsRequestFactory_Factory(Provider<Context> provider, Provider<Function0<String>> provider2, Provider<Set<String>> provider3) {
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.defaultProductUsageTokensProvider = provider3;
    }

    @Override // javax.inject.Provider
    public PaymentAnalyticsRequestFactory get() {
        return newInstance(this.contextProvider.get(), this.publishableKeyProvider.get(), this.defaultProductUsageTokensProvider.get());
    }

    public static PaymentAnalyticsRequestFactory_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<Function0<String>> provider2, javax.inject.Provider<Set<String>> provider3) {
        return new PaymentAnalyticsRequestFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static PaymentAnalyticsRequestFactory_Factory create(Provider<Context> provider, Provider<Function0<String>> provider2, Provider<Set<String>> provider3) {
        return new PaymentAnalyticsRequestFactory_Factory(provider, provider2, provider3);
    }

    public static PaymentAnalyticsRequestFactory newInstance(Context context, Function0<String> function0, Set<String> set) {
        return new PaymentAnalyticsRequestFactory(context, function0, set);
    }
}

package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentelement.AnalyticEventCallback;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory implements Factory<AnalyticEventCallback> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticEventCallback get() {
        return providesAnalyticEventCallback(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory create(javax.inject.Provider<String> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory(Providers.asDaggerProvider(provider));
    }

    public static PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory create(Provider<String> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidesAnalyticEventCallbackFactory(provider);
    }

    public static AnalyticEventCallback providesAnalyticEventCallback(String str) {
        return PaymentSheetCommonModule.INSTANCE.providesAnalyticEventCallback(str);
    }
}

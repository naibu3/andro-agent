package com.stripe.android.paymentsheet.injection;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule_ProvidesStatusBarColorFactory implements Factory<Integer> {
    private final PaymentSheetViewModelModule module;

    public PaymentSheetViewModelModule_ProvidesStatusBarColorFactory(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        this.module = paymentSheetViewModelModule;
    }

    @Override // javax.inject.Provider
    public Integer get() {
        return providesStatusBarColor(this.module);
    }

    public static PaymentSheetViewModelModule_ProvidesStatusBarColorFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return new PaymentSheetViewModelModule_ProvidesStatusBarColorFactory(paymentSheetViewModelModule);
    }

    public static Integer providesStatusBarColor(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return paymentSheetViewModelModule.providesStatusBarColor();
    }
}

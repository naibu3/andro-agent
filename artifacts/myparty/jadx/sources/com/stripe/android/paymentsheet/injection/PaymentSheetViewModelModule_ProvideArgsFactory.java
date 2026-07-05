package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule_ProvideArgsFactory implements Factory<PaymentSheetContractV2.Args> {
    private final PaymentSheetViewModelModule module;

    public PaymentSheetViewModelModule_ProvideArgsFactory(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        this.module = paymentSheetViewModelModule;
    }

    @Override // javax.inject.Provider
    public PaymentSheetContractV2.Args get() {
        return provideArgs(this.module);
    }

    public static PaymentSheetViewModelModule_ProvideArgsFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return new PaymentSheetViewModelModule_ProvideArgsFactory(paymentSheetViewModelModule);
    }

    public static PaymentSheetContractV2.Args provideArgs(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return (PaymentSheetContractV2.Args) Preconditions.checkNotNullFromProvides(paymentSheetViewModelModule.getStarterArgs());
    }
}

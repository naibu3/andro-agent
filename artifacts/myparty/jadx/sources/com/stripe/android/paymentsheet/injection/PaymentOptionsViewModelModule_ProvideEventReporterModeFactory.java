package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class PaymentOptionsViewModelModule_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
    private final PaymentOptionsViewModelModule module;

    public PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        this.module = paymentOptionsViewModelModule;
    }

    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode(this.module);
    }

    public static PaymentOptionsViewModelModule_ProvideEventReporterModeFactory create(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return new PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(paymentOptionsViewModelModule);
    }

    public static EventReporter.Mode provideEventReporterMode(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return (EventReporter.Mode) Preconditions.checkNotNullFromProvides(paymentOptionsViewModelModule.provideEventReporterMode());
    }
}

package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class AddressElementViewModelModule_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvideEventReporterModeFactory(AddressElementViewModelModule addressElementViewModelModule) {
        this.module = addressElementViewModelModule;
    }

    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode(this.module);
    }

    public static AddressElementViewModelModule_ProvideEventReporterModeFactory create(AddressElementViewModelModule addressElementViewModelModule) {
        return new AddressElementViewModelModule_ProvideEventReporterModeFactory(addressElementViewModelModule);
    }

    public static EventReporter.Mode provideEventReporterMode(AddressElementViewModelModule addressElementViewModelModule) {
        return (EventReporter.Mode) Preconditions.checkNotNullFromProvides(addressElementViewModelModule.provideEventReporterMode());
    }
}

package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class AutocompleteViewModelModule_Companion_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }

    public static AutocompleteViewModelModule_Companion_ProvideEventReporterModeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) Preconditions.checkNotNullFromProvides(AutocompleteViewModelModule.INSTANCE.provideEventReporterMode());
    }

    private static final class InstanceHolder {
        static final AutocompleteViewModelModule_Companion_ProvideEventReporterModeFactory INSTANCE = new AutocompleteViewModelModule_Companion_ProvideEventReporterModeFactory();

        private InstanceHolder() {
        }
    }
}

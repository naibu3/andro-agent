package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }

    public static PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) Preconditions.checkNotNullFromProvides(PaymentSheetLauncherModule.INSTANCE.provideEventReporterMode());
    }

    private static final class InstanceHolder {
        static final PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory INSTANCE = new PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory();

        private InstanceHolder() {
        }
    }
}

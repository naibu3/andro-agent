package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }

    public static FlowControllerModule_ProvideEventReporterModeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) Preconditions.checkNotNullFromProvides(FlowControllerModule.INSTANCE.provideEventReporterMode());
    }

    private static final class InstanceHolder {
        static final FlowControllerModule_ProvideEventReporterModeFactory INSTANCE = new FlowControllerModule_ProvideEventReporterModeFactory();

        private InstanceHolder() {
        }
    }
}

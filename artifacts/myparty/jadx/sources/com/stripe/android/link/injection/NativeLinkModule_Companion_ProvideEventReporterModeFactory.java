package com.stripe.android.link.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }

    public static NativeLinkModule_Companion_ProvideEventReporterModeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.provideEventReporterMode());
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_ProvideEventReporterModeFactory INSTANCE = new NativeLinkModule_Companion_ProvideEventReporterModeFactory();

        private InstanceHolder() {
        }
    }
}

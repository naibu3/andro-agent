package com.stripe.android.shoppay.di;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class ShopPayModule_Companion_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }

    public static ShopPayModule_Companion_ProvideEventReporterModeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) Preconditions.checkNotNullFromProvides(ShopPayModule.INSTANCE.provideEventReporterMode());
    }

    private static final class InstanceHolder {
        static final ShopPayModule_Companion_ProvideEventReporterModeFactory INSTANCE = new ShopPayModule_Companion_ProvideEventReporterModeFactory();

        private InstanceHolder() {
        }
    }
}

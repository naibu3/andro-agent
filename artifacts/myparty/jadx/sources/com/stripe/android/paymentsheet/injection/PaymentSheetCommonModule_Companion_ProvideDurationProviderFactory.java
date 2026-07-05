package com.stripe.android.paymentsheet.injection;

import com.stripe.android.core.utils.DurationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory implements Factory<DurationProvider> {
    @Override // javax.inject.Provider
    public DurationProvider get() {
        return provideDurationProvider();
    }

    public static PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DurationProvider provideDurationProvider() {
        return (DurationProvider) Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.INSTANCE.provideDurationProvider());
    }

    private static final class InstanceHolder {
        static final PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvideDurationProviderFactory();

        private InstanceHolder() {
        }
    }
}

package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory implements Factory<CvcRecollectionHandler> {
    @Override // javax.inject.Provider
    public CvcRecollectionHandler get() {
        return provideCVCRecollectionHandler();
    }

    public static PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CvcRecollectionHandler provideCVCRecollectionHandler() {
        return (CvcRecollectionHandler) Preconditions.checkNotNullFromProvides(PaymentSheetLauncherModule.INSTANCE.provideCVCRecollectionHandler());
    }

    private static final class InstanceHolder {
        static final PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory INSTANCE = new PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory();

        private InstanceHolder() {
        }
    }
}

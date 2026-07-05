package com.stripe.android.paymentelement.confirmation.cvc;

import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionLauncherFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionLauncherFactoryFactory implements Factory<CvcRecollectionLauncherFactory> {
    @Override // javax.inject.Provider
    public CvcRecollectionLauncherFactory get() {
        return provideCvcRecollectionLauncherFactory();
    }

    public static CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionLauncherFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CvcRecollectionLauncherFactory provideCvcRecollectionLauncherFactory() {
        return (CvcRecollectionLauncherFactory) Preconditions.checkNotNullFromProvides(CvcRecollectionConfirmationModule.INSTANCE.provideCvcRecollectionLauncherFactory());
    }

    private static final class InstanceHolder {
        static final CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionLauncherFactoryFactory INSTANCE = new CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionLauncherFactoryFactory();

        private InstanceHolder() {
        }
    }
}

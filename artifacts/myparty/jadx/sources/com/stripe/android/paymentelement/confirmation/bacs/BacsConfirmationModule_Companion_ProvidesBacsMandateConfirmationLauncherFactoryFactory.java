package com.stripe.android.paymentelement.confirmation.bacs;

import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationLauncherFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory implements Factory<BacsMandateConfirmationLauncherFactory> {
    @Override // javax.inject.Provider
    public BacsMandateConfirmationLauncherFactory get() {
        return providesBacsMandateConfirmationLauncherFactory();
    }

    public static BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BacsMandateConfirmationLauncherFactory providesBacsMandateConfirmationLauncherFactory() {
        return (BacsMandateConfirmationLauncherFactory) Preconditions.checkNotNullFromProvides(BacsConfirmationModule.INSTANCE.providesBacsMandateConfirmationLauncherFactory());
    }

    private static final class InstanceHolder {
        static final BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory INSTANCE = new BacsConfirmationModule_Companion_ProvidesBacsMandateConfirmationLauncherFactoryFactory();

        private InstanceHolder() {
        }
    }
}

package com.stripe.android.paymentelement.confirmation.bacs;

import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationLauncherFactory;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class BacsConfirmationDefinition_Factory implements Factory<BacsConfirmationDefinition> {
    private final Provider<BacsMandateConfirmationLauncherFactory> bacsMandateConfirmationLauncherFactoryProvider;

    public BacsConfirmationDefinition_Factory(Provider<BacsMandateConfirmationLauncherFactory> provider) {
        this.bacsMandateConfirmationLauncherFactoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public BacsConfirmationDefinition get() {
        return newInstance(this.bacsMandateConfirmationLauncherFactoryProvider.get());
    }

    public static BacsConfirmationDefinition_Factory create(javax.inject.Provider<BacsMandateConfirmationLauncherFactory> provider) {
        return new BacsConfirmationDefinition_Factory(Providers.asDaggerProvider(provider));
    }

    public static BacsConfirmationDefinition_Factory create(Provider<BacsMandateConfirmationLauncherFactory> provider) {
        return new BacsConfirmationDefinition_Factory(provider);
    }

    public static BacsConfirmationDefinition newInstance(BacsMandateConfirmationLauncherFactory bacsMandateConfirmationLauncherFactory) {
        return new BacsConfirmationDefinition(bacsMandateConfirmationLauncherFactory);
    }
}

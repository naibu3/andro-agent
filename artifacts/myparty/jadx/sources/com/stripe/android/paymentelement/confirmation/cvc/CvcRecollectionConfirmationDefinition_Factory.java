package com.stripe.android.paymentelement.confirmation.cvc;

import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionLauncherFactory;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CvcRecollectionConfirmationDefinition_Factory implements Factory<CvcRecollectionConfirmationDefinition> {
    private final Provider<CvcRecollectionLauncherFactory> factoryProvider;
    private final Provider<CvcRecollectionHandler> handlerProvider;

    public CvcRecollectionConfirmationDefinition_Factory(Provider<CvcRecollectionHandler> provider, Provider<CvcRecollectionLauncherFactory> provider2) {
        this.handlerProvider = provider;
        this.factoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public CvcRecollectionConfirmationDefinition get() {
        return newInstance(this.handlerProvider.get(), this.factoryProvider.get());
    }

    public static CvcRecollectionConfirmationDefinition_Factory create(javax.inject.Provider<CvcRecollectionHandler> provider, javax.inject.Provider<CvcRecollectionLauncherFactory> provider2) {
        return new CvcRecollectionConfirmationDefinition_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static CvcRecollectionConfirmationDefinition_Factory create(Provider<CvcRecollectionHandler> provider, Provider<CvcRecollectionLauncherFactory> provider2) {
        return new CvcRecollectionConfirmationDefinition_Factory(provider, provider2);
    }

    public static CvcRecollectionConfirmationDefinition newInstance(CvcRecollectionHandler cvcRecollectionHandler, CvcRecollectionLauncherFactory cvcRecollectionLauncherFactory) {
        return new CvcRecollectionConfirmationDefinition(cvcRecollectionHandler, cvcRecollectionLauncherFactory);
    }
}

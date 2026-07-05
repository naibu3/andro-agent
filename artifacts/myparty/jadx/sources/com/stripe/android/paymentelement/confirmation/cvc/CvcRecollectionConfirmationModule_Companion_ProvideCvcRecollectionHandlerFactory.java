package com.stripe.android.paymentelement.confirmation.cvc;

import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory implements Factory<CvcRecollectionHandler> {
    @Override // javax.inject.Provider
    public CvcRecollectionHandler get() {
        return provideCvcRecollectionHandler();
    }

    public static CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CvcRecollectionHandler provideCvcRecollectionHandler() {
        return (CvcRecollectionHandler) Preconditions.checkNotNullFromProvides(CvcRecollectionConfirmationModule.INSTANCE.provideCvcRecollectionHandler());
    }

    private static final class InstanceHolder {
        static final CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory INSTANCE = new CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory();

        private InstanceHolder() {
        }
    }
}

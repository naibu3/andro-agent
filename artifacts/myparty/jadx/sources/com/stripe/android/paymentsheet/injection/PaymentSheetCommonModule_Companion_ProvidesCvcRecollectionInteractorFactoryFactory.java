package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory implements Factory<CvcRecollectionInteractor.Factory> {
    @Override // javax.inject.Provider
    public CvcRecollectionInteractor.Factory get() {
        return providesCvcRecollectionInteractorFactory();
    }

    public static PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CvcRecollectionInteractor.Factory providesCvcRecollectionInteractorFactory() {
        return (CvcRecollectionInteractor.Factory) Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.INSTANCE.providesCvcRecollectionInteractorFactory());
    }

    private static final class InstanceHolder {
        static final PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory();

        private InstanceHolder() {
        }
    }
}

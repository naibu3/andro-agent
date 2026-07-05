package com.stripe.android.financialconnections.features.streamlinedconsent;

import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class IDConsentContentViewModel_Factory_Impl implements IDConsentContentViewModel.Factory {
    private final C0969IDConsentContentViewModel_Factory delegateFactory;

    IDConsentContentViewModel_Factory_Impl(C0969IDConsentContentViewModel_Factory c0969IDConsentContentViewModel_Factory) {
        this.delegateFactory = c0969IDConsentContentViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel.Factory
    public IDConsentContentViewModel create(IDConsentContentState iDConsentContentState) {
        return this.delegateFactory.get(iDConsentContentState);
    }

    public static Provider<IDConsentContentViewModel.Factory> create(C0969IDConsentContentViewModel_Factory c0969IDConsentContentViewModel_Factory) {
        return InstanceFactory.create(new IDConsentContentViewModel_Factory_Impl(c0969IDConsentContentViewModel_Factory));
    }

    public static dagger.internal.Provider<IDConsentContentViewModel.Factory> createFactoryProvider(C0969IDConsentContentViewModel_Factory c0969IDConsentContentViewModel_Factory) {
        return InstanceFactory.create(new IDConsentContentViewModel_Factory_Impl(c0969IDConsentContentViewModel_Factory));
    }
}

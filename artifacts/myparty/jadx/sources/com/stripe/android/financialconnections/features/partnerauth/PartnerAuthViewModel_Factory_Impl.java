package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class PartnerAuthViewModel_Factory_Impl implements PartnerAuthViewModel.Factory {
    private final C0964PartnerAuthViewModel_Factory delegateFactory;

    PartnerAuthViewModel_Factory_Impl(C0964PartnerAuthViewModel_Factory c0964PartnerAuthViewModel_Factory) {
        this.delegateFactory = c0964PartnerAuthViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel.Factory
    public PartnerAuthViewModel create(SharedPartnerAuthState sharedPartnerAuthState) {
        return this.delegateFactory.get(sharedPartnerAuthState);
    }

    public static Provider<PartnerAuthViewModel.Factory> create(C0964PartnerAuthViewModel_Factory c0964PartnerAuthViewModel_Factory) {
        return InstanceFactory.create(new PartnerAuthViewModel_Factory_Impl(c0964PartnerAuthViewModel_Factory));
    }

    public static dagger.internal.Provider<PartnerAuthViewModel.Factory> createFactoryProvider(C0964PartnerAuthViewModel_Factory c0964PartnerAuthViewModel_Factory) {
        return InstanceFactory.create(new PartnerAuthViewModel_Factory_Impl(c0964PartnerAuthViewModel_Factory));
    }
}

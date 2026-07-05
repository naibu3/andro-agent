package com.stripe.android.financialconnections.features.attachpayment;

import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class AttachPaymentViewModel_Factory_Impl implements AttachPaymentViewModel.Factory {
    private final C0874AttachPaymentViewModel_Factory delegateFactory;

    AttachPaymentViewModel_Factory_Impl(C0874AttachPaymentViewModel_Factory c0874AttachPaymentViewModel_Factory) {
        this.delegateFactory = c0874AttachPaymentViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel.Factory
    public AttachPaymentViewModel create(AttachPaymentState attachPaymentState) {
        return this.delegateFactory.get(attachPaymentState);
    }

    public static Provider<AttachPaymentViewModel.Factory> create(C0874AttachPaymentViewModel_Factory c0874AttachPaymentViewModel_Factory) {
        return InstanceFactory.create(new AttachPaymentViewModel_Factory_Impl(c0874AttachPaymentViewModel_Factory));
    }

    public static dagger.internal.Provider<AttachPaymentViewModel.Factory> createFactoryProvider(C0874AttachPaymentViewModel_Factory c0874AttachPaymentViewModel_Factory) {
        return InstanceFactory.create(new AttachPaymentViewModel_Factory_Impl(c0874AttachPaymentViewModel_Factory));
    }
}

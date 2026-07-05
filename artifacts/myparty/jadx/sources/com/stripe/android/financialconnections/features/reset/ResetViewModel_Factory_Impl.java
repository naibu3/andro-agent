package com.stripe.android.financialconnections.features.reset;

import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ResetViewModel_Factory_Impl implements ResetViewModel.Factory {
    private final C0966ResetViewModel_Factory delegateFactory;

    ResetViewModel_Factory_Impl(C0966ResetViewModel_Factory c0966ResetViewModel_Factory) {
        this.delegateFactory = c0966ResetViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.reset.ResetViewModel.Factory
    public ResetViewModel create(ResetState resetState) {
        return this.delegateFactory.get(resetState);
    }

    public static Provider<ResetViewModel.Factory> create(C0966ResetViewModel_Factory c0966ResetViewModel_Factory) {
        return InstanceFactory.create(new ResetViewModel_Factory_Impl(c0966ResetViewModel_Factory));
    }

    public static dagger.internal.Provider<ResetViewModel.Factory> createFactoryProvider(C0966ResetViewModel_Factory c0966ResetViewModel_Factory) {
        return InstanceFactory.create(new ResetViewModel_Factory_Impl(c0966ResetViewModel_Factory));
    }
}

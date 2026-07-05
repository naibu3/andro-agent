package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class SuccessViewModel_Factory_Impl implements SuccessViewModel.Factory {
    private final C0973SuccessViewModel_Factory delegateFactory;

    SuccessViewModel_Factory_Impl(C0973SuccessViewModel_Factory c0973SuccessViewModel_Factory) {
        this.delegateFactory = c0973SuccessViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.success.SuccessViewModel.Factory
    public SuccessViewModel create(SuccessState successState) {
        return this.delegateFactory.get(successState);
    }

    public static Provider<SuccessViewModel.Factory> create(C0973SuccessViewModel_Factory c0973SuccessViewModel_Factory) {
        return InstanceFactory.create(new SuccessViewModel_Factory_Impl(c0973SuccessViewModel_Factory));
    }

    public static dagger.internal.Provider<SuccessViewModel.Factory> createFactoryProvider(C0973SuccessViewModel_Factory c0973SuccessViewModel_Factory) {
        return InstanceFactory.create(new SuccessViewModel_Factory_Impl(c0973SuccessViewModel_Factory));
    }
}

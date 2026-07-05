package com.stripe.android.financialconnections.features.error;

import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ErrorViewModel_Factory_Impl implements ErrorViewModel.Factory {
    private final C0893ErrorViewModel_Factory delegateFactory;

    ErrorViewModel_Factory_Impl(C0893ErrorViewModel_Factory c0893ErrorViewModel_Factory) {
        this.delegateFactory = c0893ErrorViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.error.ErrorViewModel.Factory
    public ErrorViewModel create(ErrorState errorState) {
        return this.delegateFactory.get(errorState);
    }

    public static Provider<ErrorViewModel.Factory> create(C0893ErrorViewModel_Factory c0893ErrorViewModel_Factory) {
        return InstanceFactory.create(new ErrorViewModel_Factory_Impl(c0893ErrorViewModel_Factory));
    }

    public static dagger.internal.Provider<ErrorViewModel.Factory> createFactoryProvider(C0893ErrorViewModel_Factory c0893ErrorViewModel_Factory) {
        return InstanceFactory.create(new ErrorViewModel_Factory_Impl(c0893ErrorViewModel_Factory));
    }
}

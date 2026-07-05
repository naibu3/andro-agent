package com.stripe.android.financialconnections.features.exit;

import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ExitViewModel_Factory_Impl implements ExitViewModel.Factory {
    private final C0896ExitViewModel_Factory delegateFactory;

    ExitViewModel_Factory_Impl(C0896ExitViewModel_Factory c0896ExitViewModel_Factory) {
        this.delegateFactory = c0896ExitViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.exit.ExitViewModel.Factory
    public ExitViewModel create(ExitState exitState) {
        return this.delegateFactory.get(exitState);
    }

    public static Provider<ExitViewModel.Factory> create(C0896ExitViewModel_Factory c0896ExitViewModel_Factory) {
        return InstanceFactory.create(new ExitViewModel_Factory_Impl(c0896ExitViewModel_Factory));
    }

    public static dagger.internal.Provider<ExitViewModel.Factory> createFactoryProvider(C0896ExitViewModel_Factory c0896ExitViewModel_Factory) {
        return InstanceFactory.create(new ExitViewModel_Factory_Impl(c0896ExitViewModel_Factory));
    }
}

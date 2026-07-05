package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ManualEntryViewModel_Factory_Impl implements ManualEntryViewModel.Factory {
    private final C0922ManualEntryViewModel_Factory delegateFactory;

    ManualEntryViewModel_Factory_Impl(C0922ManualEntryViewModel_Factory c0922ManualEntryViewModel_Factory) {
        this.delegateFactory = c0922ManualEntryViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel.Factory
    public ManualEntryViewModel create(ManualEntryState manualEntryState) {
        return this.delegateFactory.get(manualEntryState);
    }

    public static Provider<ManualEntryViewModel.Factory> create(C0922ManualEntryViewModel_Factory c0922ManualEntryViewModel_Factory) {
        return InstanceFactory.create(new ManualEntryViewModel_Factory_Impl(c0922ManualEntryViewModel_Factory));
    }

    public static dagger.internal.Provider<ManualEntryViewModel.Factory> createFactoryProvider(C0922ManualEntryViewModel_Factory c0922ManualEntryViewModel_Factory) {
        return InstanceFactory.create(new ManualEntryViewModel_Factory_Impl(c0922ManualEntryViewModel_Factory));
    }
}

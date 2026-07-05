package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class InstitutionPickerViewModel_Factory_Impl implements InstitutionPickerViewModel.Factory {
    private final C0903InstitutionPickerViewModel_Factory delegateFactory;

    InstitutionPickerViewModel_Factory_Impl(C0903InstitutionPickerViewModel_Factory c0903InstitutionPickerViewModel_Factory) {
        this.delegateFactory = c0903InstitutionPickerViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel.Factory
    public InstitutionPickerViewModel create(InstitutionPickerState institutionPickerState) {
        return this.delegateFactory.get(institutionPickerState);
    }

    public static Provider<InstitutionPickerViewModel.Factory> create(C0903InstitutionPickerViewModel_Factory c0903InstitutionPickerViewModel_Factory) {
        return InstanceFactory.create(new InstitutionPickerViewModel_Factory_Impl(c0903InstitutionPickerViewModel_Factory));
    }

    public static dagger.internal.Provider<InstitutionPickerViewModel.Factory> createFactoryProvider(C0903InstitutionPickerViewModel_Factory c0903InstitutionPickerViewModel_Factory) {
        return InstanceFactory.create(new InstitutionPickerViewModel_Factory_Impl(c0903InstitutionPickerViewModel_Factory));
    }
}

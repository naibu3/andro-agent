package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class AccountPickerViewModel_Factory_Impl implements AccountPickerViewModel.Factory {
    private final C0870AccountPickerViewModel_Factory delegateFactory;

    AccountPickerViewModel_Factory_Impl(C0870AccountPickerViewModel_Factory c0870AccountPickerViewModel_Factory) {
        this.delegateFactory = c0870AccountPickerViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel.Factory
    public AccountPickerViewModel create(AccountPickerState accountPickerState) {
        return this.delegateFactory.get(accountPickerState);
    }

    public static Provider<AccountPickerViewModel.Factory> create(C0870AccountPickerViewModel_Factory c0870AccountPickerViewModel_Factory) {
        return InstanceFactory.create(new AccountPickerViewModel_Factory_Impl(c0870AccountPickerViewModel_Factory));
    }

    public static dagger.internal.Provider<AccountPickerViewModel.Factory> createFactoryProvider(C0870AccountPickerViewModel_Factory c0870AccountPickerViewModel_Factory) {
        return InstanceFactory.create(new AccountPickerViewModel_Factory_Impl(c0870AccountPickerViewModel_Factory));
    }
}

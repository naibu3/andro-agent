package com.stripe.android.financialconnections.features.accountupdate;

import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class AccountUpdateRequiredViewModel_Factory_Impl implements AccountUpdateRequiredViewModel.Factory {
    private final C0872AccountUpdateRequiredViewModel_Factory delegateFactory;

    AccountUpdateRequiredViewModel_Factory_Impl(C0872AccountUpdateRequiredViewModel_Factory c0872AccountUpdateRequiredViewModel_Factory) {
        this.delegateFactory = c0872AccountUpdateRequiredViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel.Factory
    public AccountUpdateRequiredViewModel create(AccountUpdateRequiredState accountUpdateRequiredState) {
        return this.delegateFactory.get(accountUpdateRequiredState);
    }

    public static Provider<AccountUpdateRequiredViewModel.Factory> create(C0872AccountUpdateRequiredViewModel_Factory c0872AccountUpdateRequiredViewModel_Factory) {
        return InstanceFactory.create(new AccountUpdateRequiredViewModel_Factory_Impl(c0872AccountUpdateRequiredViewModel_Factory));
    }

    public static dagger.internal.Provider<AccountUpdateRequiredViewModel.Factory> createFactoryProvider(C0872AccountUpdateRequiredViewModel_Factory c0872AccountUpdateRequiredViewModel_Factory) {
        return InstanceFactory.create(new AccountUpdateRequiredViewModel_Factory_Impl(c0872AccountUpdateRequiredViewModel_Factory));
    }
}

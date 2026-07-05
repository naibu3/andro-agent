package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ManualEntrySuccessViewModel_Factory_Impl implements ManualEntrySuccessViewModel.Factory {
    private final C0924ManualEntrySuccessViewModel_Factory delegateFactory;

    ManualEntrySuccessViewModel_Factory_Impl(C0924ManualEntrySuccessViewModel_Factory c0924ManualEntrySuccessViewModel_Factory) {
        this.delegateFactory = c0924ManualEntrySuccessViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel.Factory
    public ManualEntrySuccessViewModel create(ManualEntrySuccessState manualEntrySuccessState) {
        return this.delegateFactory.get(manualEntrySuccessState);
    }

    public static Provider<ManualEntrySuccessViewModel.Factory> create(C0924ManualEntrySuccessViewModel_Factory c0924ManualEntrySuccessViewModel_Factory) {
        return InstanceFactory.create(new ManualEntrySuccessViewModel_Factory_Impl(c0924ManualEntrySuccessViewModel_Factory));
    }

    public static dagger.internal.Provider<ManualEntrySuccessViewModel.Factory> createFactoryProvider(C0924ManualEntrySuccessViewModel_Factory c0924ManualEntrySuccessViewModel_Factory) {
        return InstanceFactory.create(new ManualEntrySuccessViewModel_Factory_Impl(c0924ManualEntrySuccessViewModel_Factory));
    }
}

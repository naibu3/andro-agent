package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidesProductUsageFactory implements Factory<Set<String>> {
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesProductUsageFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        this.module = uSBankAccountFormViewModelModule;
    }

    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage(this.module);
    }

    public static USBankAccountFormViewModelModule_ProvidesProductUsageFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return new USBankAccountFormViewModelModule_ProvidesProductUsageFactory(uSBankAccountFormViewModelModule);
    }

    public static Set<String> providesProductUsage(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return (Set) Preconditions.checkNotNullFromProvides(uSBankAccountFormViewModelModule.providesProductUsage());
    }
}

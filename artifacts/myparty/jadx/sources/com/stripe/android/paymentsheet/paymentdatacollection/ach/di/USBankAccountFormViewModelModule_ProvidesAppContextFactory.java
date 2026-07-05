package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidesAppContextFactory implements Factory<Context> {
    private final Provider<Application> applicationProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesAppContextFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Application> provider) {
        this.module = uSBankAccountFormViewModelModule;
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesAppContext(this.module, this.applicationProvider.get());
    }

    public static USBankAccountFormViewModelModule_ProvidesAppContextFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, javax.inject.Provider<Application> provider) {
        return new USBankAccountFormViewModelModule_ProvidesAppContextFactory(uSBankAccountFormViewModelModule, Providers.asDaggerProvider(provider));
    }

    public static USBankAccountFormViewModelModule_ProvidesAppContextFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Application> provider) {
        return new USBankAccountFormViewModelModule_ProvidesAppContextFactory(uSBankAccountFormViewModelModule, provider);
    }

    public static Context providesAppContext(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(uSBankAccountFormViewModelModule.providesAppContext(application));
    }
}

package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
    private final Provider<Context> appContextProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidePublishableKeyFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        this.module = uSBankAccountFormViewModelModule;
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return providePublishableKey(this.module, this.appContextProvider.get());
    }

    public static USBankAccountFormViewModelModule_ProvidePublishableKeyFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, javax.inject.Provider<Context> provider) {
        return new USBankAccountFormViewModelModule_ProvidePublishableKeyFactory(uSBankAccountFormViewModelModule, Providers.asDaggerProvider(provider));
    }

    public static USBankAccountFormViewModelModule_ProvidePublishableKeyFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        return new USBankAccountFormViewModelModule_ProvidePublishableKeyFactory(uSBankAccountFormViewModelModule, provider);
    }

    public static Function0<String> providePublishableKey(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Context context) {
        return (Function0) Preconditions.checkNotNullFromProvides(uSBankAccountFormViewModelModule.providePublishableKey(context));
    }
}

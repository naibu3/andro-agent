package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory implements Factory<SavedPaymentMethodMutator> {
    private final Provider<ManageSavedPaymentMethodMutatorFactory> factoryProvider;

    public ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory(Provider<ManageSavedPaymentMethodMutatorFactory> provider) {
        this.factoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public SavedPaymentMethodMutator get() {
        return provideSavedPaymentMethodMutator(this.factoryProvider.get());
    }

    public static ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory create(javax.inject.Provider<ManageSavedPaymentMethodMutatorFactory> provider) {
        return new ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory(Providers.asDaggerProvider(provider));
    }

    public static ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory create(Provider<ManageSavedPaymentMethodMutatorFactory> provider) {
        return new ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory(provider);
    }

    public static SavedPaymentMethodMutator provideSavedPaymentMethodMutator(ManageSavedPaymentMethodMutatorFactory manageSavedPaymentMethodMutatorFactory) {
        return (SavedPaymentMethodMutator) Preconditions.checkNotNullFromProvides(ManageModule.INSTANCE.provideSavedPaymentMethodMutator(manageSavedPaymentMethodMutatorFactory));
    }
}

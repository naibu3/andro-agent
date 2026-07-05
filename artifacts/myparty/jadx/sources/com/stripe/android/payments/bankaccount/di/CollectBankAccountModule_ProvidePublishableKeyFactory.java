package com.stripe.android.payments.bankaccount.di;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
    private final Provider<CollectBankAccountContract.Args> argsProvider;

    public CollectBankAccountModule_ProvidePublishableKeyFactory(Provider<CollectBankAccountContract.Args> provider) {
        this.argsProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return providePublishableKey(this.argsProvider.get());
    }

    public static CollectBankAccountModule_ProvidePublishableKeyFactory create(javax.inject.Provider<CollectBankAccountContract.Args> provider) {
        return new CollectBankAccountModule_ProvidePublishableKeyFactory(Providers.asDaggerProvider(provider));
    }

    public static CollectBankAccountModule_ProvidePublishableKeyFactory create(Provider<CollectBankAccountContract.Args> provider) {
        return new CollectBankAccountModule_ProvidePublishableKeyFactory(provider);
    }

    public static Function0<String> providePublishableKey(CollectBankAccountContract.Args args) {
        return (Function0) Preconditions.checkNotNullFromProvides(CollectBankAccountModule.INSTANCE.providePublishableKey(args));
    }
}

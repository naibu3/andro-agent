package com.stripe.android.payments.core.injection;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory implements Factory<InitChallengeRepository> {
    private final Provider<Application> applicationProvider;
    private final Provider<Stripe3ds2TransactionContract.Args> argsProvider;
    private final Stripe3dsTransactionViewModelModule module;
    private final Provider<CoroutineContext> workContextProvider;

    public Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Provider<Application> provider, Provider<Stripe3ds2TransactionContract.Args> provider2, Provider<CoroutineContext> provider3) {
        this.module = stripe3dsTransactionViewModelModule;
        this.applicationProvider = provider;
        this.argsProvider = provider2;
        this.workContextProvider = provider3;
    }

    @Override // javax.inject.Provider
    public InitChallengeRepository get() {
        return providesInitChallengeRepository(this.module, this.applicationProvider.get(), this.argsProvider.get(), this.workContextProvider.get());
    }

    public static Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory create(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, javax.inject.Provider<Application> provider, javax.inject.Provider<Stripe3ds2TransactionContract.Args> provider2, javax.inject.Provider<CoroutineContext> provider3) {
        return new Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory(stripe3dsTransactionViewModelModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory create(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Provider<Application> provider, Provider<Stripe3ds2TransactionContract.Args> provider2, Provider<CoroutineContext> provider3) {
        return new Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory(stripe3dsTransactionViewModelModule, provider, provider2, provider3);
    }

    public static InitChallengeRepository providesInitChallengeRepository(Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Application application, Stripe3ds2TransactionContract.Args args, CoroutineContext coroutineContext) {
        return (InitChallengeRepository) Preconditions.checkNotNullFromProvides(stripe3dsTransactionViewModelModule.providesInitChallengeRepository(application, args, coroutineContext));
    }
}

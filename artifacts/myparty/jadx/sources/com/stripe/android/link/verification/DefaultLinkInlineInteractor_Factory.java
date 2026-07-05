package com.stripe.android.link.verification;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.LinkPaymentLauncher;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultLinkInlineInteractor_Factory implements Factory<DefaultLinkInlineInteractor> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<LinkConfigurationCoordinator> linkConfigurationCoordinatorProvider;
    private final Provider<LinkPaymentLauncher> linkLauncherProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public DefaultLinkInlineInteractor_Factory(Provider<CoroutineScope> provider, Provider<LinkConfigurationCoordinator> provider2, Provider<LinkPaymentLauncher> provider3, Provider<Logger> provider4, Provider<SavedStateHandle> provider5) {
        this.coroutineScopeProvider = provider;
        this.linkConfigurationCoordinatorProvider = provider2;
        this.linkLauncherProvider = provider3;
        this.loggerProvider = provider4;
        this.savedStateHandleProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultLinkInlineInteractor get() {
        return newInstance(this.coroutineScopeProvider.get(), this.linkConfigurationCoordinatorProvider.get(), this.linkLauncherProvider.get(), this.loggerProvider.get(), this.savedStateHandleProvider.get());
    }

    public static DefaultLinkInlineInteractor_Factory create(javax.inject.Provider<CoroutineScope> provider, javax.inject.Provider<LinkConfigurationCoordinator> provider2, javax.inject.Provider<LinkPaymentLauncher> provider3, javax.inject.Provider<Logger> provider4, javax.inject.Provider<SavedStateHandle> provider5) {
        return new DefaultLinkInlineInteractor_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static DefaultLinkInlineInteractor_Factory create(Provider<CoroutineScope> provider, Provider<LinkConfigurationCoordinator> provider2, Provider<LinkPaymentLauncher> provider3, Provider<Logger> provider4, Provider<SavedStateHandle> provider5) {
        return new DefaultLinkInlineInteractor_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultLinkInlineInteractor newInstance(CoroutineScope coroutineScope, LinkConfigurationCoordinator linkConfigurationCoordinator, LinkPaymentLauncher linkPaymentLauncher, Logger logger, SavedStateHandle savedStateHandle) {
        return new DefaultLinkInlineInteractor(coroutineScope, linkConfigurationCoordinator, linkPaymentLauncher, logger, savedStateHandle);
    }
}

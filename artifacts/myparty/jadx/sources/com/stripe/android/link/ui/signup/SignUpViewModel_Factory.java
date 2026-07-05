package com.stripe.android.link.ui.signup;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.analytics.LinkEventsReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
    private final Provider<LinkConfiguration> configurationProvider;
    private final Provider<Function1<? super LinkActivityResult, Unit>> dismissWithResultProvider;
    private final Provider<LinkDismissalCoordinator> dismissalCoordinatorProvider;
    private final Provider<LinkAuth> linkAuthProvider;
    private final Provider<LinkEventsReporter> linkEventsReporterProvider;
    private final Provider<LinkLaunchMode> linkLaunchModeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Function1<? super Throwable, Unit>> moveToWebProvider;
    private final Provider<Function1<? super LinkScreen, Unit>> navigateAndClearStackProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public SignUpViewModel_Factory(Provider<LinkConfiguration> provider, Provider<LinkEventsReporter> provider2, Provider<Logger> provider3, Provider<LinkAuth> provider4, Provider<SavedStateHandle> provider5, Provider<LinkDismissalCoordinator> provider6, Provider<Function1<? super LinkScreen, Unit>> provider7, Provider<Function1<? super Throwable, Unit>> provider8, Provider<LinkLaunchMode> provider9, Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        this.configurationProvider = provider;
        this.linkEventsReporterProvider = provider2;
        this.loggerProvider = provider3;
        this.linkAuthProvider = provider4;
        this.savedStateHandleProvider = provider5;
        this.dismissalCoordinatorProvider = provider6;
        this.navigateAndClearStackProvider = provider7;
        this.moveToWebProvider = provider8;
        this.linkLaunchModeProvider = provider9;
        this.dismissWithResultProvider = provider10;
    }

    @Override // javax.inject.Provider
    public SignUpViewModel get() {
        return newInstance(this.configurationProvider.get(), this.linkEventsReporterProvider.get(), this.loggerProvider.get(), this.linkAuthProvider.get(), this.savedStateHandleProvider.get(), this.dismissalCoordinatorProvider.get(), this.navigateAndClearStackProvider.get(), this.moveToWebProvider.get(), this.linkLaunchModeProvider.get(), this.dismissWithResultProvider.get());
    }

    public static SignUpViewModel_Factory create(javax.inject.Provider<LinkConfiguration> provider, javax.inject.Provider<LinkEventsReporter> provider2, javax.inject.Provider<Logger> provider3, javax.inject.Provider<LinkAuth> provider4, javax.inject.Provider<SavedStateHandle> provider5, javax.inject.Provider<LinkDismissalCoordinator> provider6, javax.inject.Provider<Function1<? super LinkScreen, Unit>> provider7, javax.inject.Provider<Function1<? super Throwable, Unit>> provider8, javax.inject.Provider<LinkLaunchMode> provider9, javax.inject.Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        return new SignUpViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10));
    }

    public static SignUpViewModel_Factory create(Provider<LinkConfiguration> provider, Provider<LinkEventsReporter> provider2, Provider<Logger> provider3, Provider<LinkAuth> provider4, Provider<SavedStateHandle> provider5, Provider<LinkDismissalCoordinator> provider6, Provider<Function1<? super LinkScreen, Unit>> provider7, Provider<Function1<? super Throwable, Unit>> provider8, Provider<LinkLaunchMode> provider9, Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        return new SignUpViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static SignUpViewModel newInstance(LinkConfiguration linkConfiguration, LinkEventsReporter linkEventsReporter, Logger logger, LinkAuth linkAuth, SavedStateHandle savedStateHandle, LinkDismissalCoordinator linkDismissalCoordinator, Function1<? super LinkScreen, Unit> function1, Function1<? super Throwable, Unit> function12, LinkLaunchMode linkLaunchMode, Function1<? super LinkActivityResult, Unit> function13) {
        return new SignUpViewModel(linkConfiguration, linkEventsReporter, logger, linkAuth, savedStateHandle, linkDismissalCoordinator, function1, function12, linkLaunchMode, function13);
    }
}

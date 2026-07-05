package com.stripe.android.link.ui.verification;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.LinkAccount;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class VerificationViewModel_Factory implements Factory<VerificationViewModel> {
    private final Provider<Function1<? super LinkActivityResult, Unit>> dismissWithResultProvider;
    private final Provider<Boolean> isDialogProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkAccount> linkAccountProvider;
    private final Provider<LinkEventsReporter> linkEventsReporterProvider;
    private final Provider<LinkLaunchMode> linkLaunchModeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Function0<Unit>> onChangeEmailRequestedProvider;
    private final Provider<Function0<Unit>> onDismissClickedProvider;
    private final Provider<Function0<Unit>> onVerificationSucceededProvider;

    public VerificationViewModel_Factory(Provider<LinkAccount> provider, Provider<LinkAccountManager> provider2, Provider<LinkEventsReporter> provider3, Provider<Logger> provider4, Provider<LinkLaunchMode> provider5, Provider<Boolean> provider6, Provider<Function0<Unit>> provider7, Provider<Function0<Unit>> provider8, Provider<Function0<Unit>> provider9, Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        this.linkAccountProvider = provider;
        this.linkAccountManagerProvider = provider2;
        this.linkEventsReporterProvider = provider3;
        this.loggerProvider = provider4;
        this.linkLaunchModeProvider = provider5;
        this.isDialogProvider = provider6;
        this.onVerificationSucceededProvider = provider7;
        this.onChangeEmailRequestedProvider = provider8;
        this.onDismissClickedProvider = provider9;
        this.dismissWithResultProvider = provider10;
    }

    @Override // javax.inject.Provider
    public VerificationViewModel get() {
        return newInstance(this.linkAccountProvider.get(), this.linkAccountManagerProvider.get(), this.linkEventsReporterProvider.get(), this.loggerProvider.get(), this.linkLaunchModeProvider.get(), this.isDialogProvider.get().booleanValue(), this.onVerificationSucceededProvider.get(), this.onChangeEmailRequestedProvider.get(), this.onDismissClickedProvider.get(), this.dismissWithResultProvider.get());
    }

    public static VerificationViewModel_Factory create(javax.inject.Provider<LinkAccount> provider, javax.inject.Provider<LinkAccountManager> provider2, javax.inject.Provider<LinkEventsReporter> provider3, javax.inject.Provider<Logger> provider4, javax.inject.Provider<LinkLaunchMode> provider5, javax.inject.Provider<Boolean> provider6, javax.inject.Provider<Function0<Unit>> provider7, javax.inject.Provider<Function0<Unit>> provider8, javax.inject.Provider<Function0<Unit>> provider9, javax.inject.Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        return new VerificationViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10));
    }

    public static VerificationViewModel_Factory create(Provider<LinkAccount> provider, Provider<LinkAccountManager> provider2, Provider<LinkEventsReporter> provider3, Provider<Logger> provider4, Provider<LinkLaunchMode> provider5, Provider<Boolean> provider6, Provider<Function0<Unit>> provider7, Provider<Function0<Unit>> provider8, Provider<Function0<Unit>> provider9, Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        return new VerificationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static VerificationViewModel newInstance(LinkAccount linkAccount, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger, LinkLaunchMode linkLaunchMode, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super LinkActivityResult, Unit> function1) {
        return new VerificationViewModel(linkAccount, linkAccountManager, linkEventsReporter, logger, linkLaunchMode, z, function0, function02, function03, function1);
    }
}

package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class ManageModule_Companion_ProvideManageNavigatorFactory implements Factory<ManageNavigator> {
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<InitialManageScreenFactory> initialManageScreenFactoryProvider;
    private final Provider<CoroutineScope> viewModelScopeProvider;

    public ManageModule_Companion_ProvideManageNavigatorFactory(Provider<InitialManageScreenFactory> provider, Provider<CoroutineScope> provider2, Provider<EventReporter> provider3) {
        this.initialManageScreenFactoryProvider = provider;
        this.viewModelScopeProvider = provider2;
        this.eventReporterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ManageNavigator get() {
        return provideManageNavigator(this.initialManageScreenFactoryProvider.get(), this.viewModelScopeProvider.get(), this.eventReporterProvider.get());
    }

    public static ManageModule_Companion_ProvideManageNavigatorFactory create(javax.inject.Provider<InitialManageScreenFactory> provider, javax.inject.Provider<CoroutineScope> provider2, javax.inject.Provider<EventReporter> provider3) {
        return new ManageModule_Companion_ProvideManageNavigatorFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static ManageModule_Companion_ProvideManageNavigatorFactory create(Provider<InitialManageScreenFactory> provider, Provider<CoroutineScope> provider2, Provider<EventReporter> provider3) {
        return new ManageModule_Companion_ProvideManageNavigatorFactory(provider, provider2, provider3);
    }

    public static ManageNavigator provideManageNavigator(InitialManageScreenFactory initialManageScreenFactory, CoroutineScope coroutineScope, EventReporter eventReporter) {
        return (ManageNavigator) Preconditions.checkNotNullFromProvides(ManageModule.INSTANCE.provideManageNavigator(initialManageScreenFactory, coroutineScope, eventReporter));
    }
}

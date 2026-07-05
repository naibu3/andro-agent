package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.automations.internal.ActivityProvider;
import com.qonversion.android.sdk.automations.internal.AutomationsEventMapper;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.internal.repository.QRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ManagersModule_ProvideAutomationsManagerFactory implements Factory<QAutomationsManager> {
    private final Provider<ActivityProvider> activityProvider;
    private final Provider<Application> appContextProvider;
    private final Provider<AutomationsEventMapper> eventMapperProvider;
    private final ManagersModule module;
    private final Provider<QRepository> repositoryProvider;

    public ManagersModule_ProvideAutomationsManagerFactory(ManagersModule managersModule, Provider<QRepository> provider, Provider<AutomationsEventMapper> provider2, Provider<Application> provider3, Provider<ActivityProvider> provider4) {
        this.module = managersModule;
        this.repositoryProvider = provider;
        this.eventMapperProvider = provider2;
        this.appContextProvider = provider3;
        this.activityProvider = provider4;
    }

    @Override // javax.inject.Provider
    public QAutomationsManager get() {
        return provideAutomationsManager(this.module, this.repositoryProvider.get(), this.eventMapperProvider.get(), this.appContextProvider.get(), this.activityProvider.get());
    }

    public static ManagersModule_ProvideAutomationsManagerFactory create(ManagersModule managersModule, Provider<QRepository> provider, Provider<AutomationsEventMapper> provider2, Provider<Application> provider3, Provider<ActivityProvider> provider4) {
        return new ManagersModule_ProvideAutomationsManagerFactory(managersModule, provider, provider2, provider3, provider4);
    }

    public static QAutomationsManager provideAutomationsManager(ManagersModule managersModule, QRepository qRepository, AutomationsEventMapper automationsEventMapper, Application application, ActivityProvider activityProvider) {
        return (QAutomationsManager) Preconditions.checkNotNull(managersModule.provideAutomationsManager(qRepository, automationsEventMapper, application, activityProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package com.qonversion.android.sdk.automations.internal;

import android.app.Application;
import com.qonversion.android.sdk.internal.repository.QRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QAutomationsManager_Factory implements Factory<QAutomationsManager> {
    private final Provider<ActivityProvider> activityProvider;
    private final Provider<Application> appContextProvider;
    private final Provider<AutomationsEventMapper> eventMapperProvider;
    private final Provider<QRepository> repositoryProvider;

    public QAutomationsManager_Factory(Provider<QRepository> provider, Provider<AutomationsEventMapper> provider2, Provider<Application> provider3, Provider<ActivityProvider> provider4) {
        this.repositoryProvider = provider;
        this.eventMapperProvider = provider2;
        this.appContextProvider = provider3;
        this.activityProvider = provider4;
    }

    @Override // javax.inject.Provider
    public QAutomationsManager get() {
        return new QAutomationsManager(this.repositoryProvider.get(), this.eventMapperProvider.get(), this.appContextProvider.get(), this.activityProvider.get());
    }

    public static QAutomationsManager_Factory create(Provider<QRepository> provider, Provider<AutomationsEventMapper> provider2, Provider<Application> provider3, Provider<ActivityProvider> provider4) {
        return new QAutomationsManager_Factory(provider, provider2, provider3, provider4);
    }

    public static QAutomationsManager newInstance(QRepository qRepository, AutomationsEventMapper automationsEventMapper, Application application, ActivityProvider activityProvider) {
        return new QAutomationsManager(qRepository, automationsEventMapper, application, activityProvider);
    }
}

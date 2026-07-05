package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.QUserPropertiesManager;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ManagersModule_ProvideUserPropertiesManagerFactory implements Factory<QUserPropertiesManager> {
    private final Provider<Application> appContextProvider;
    private final Provider<AppStateProvider> appStateProvider;
    private final Provider<IncrementalDelayCalculator> incrementalDelayCalculatorProvider;
    private final Provider<Logger> loggerProvider;
    private final ManagersModule module;
    private final Provider<UserPropertiesStorage> propertiesStorageProvider;
    private final Provider<QRepository> repositoryProvider;

    public ManagersModule_ProvideUserPropertiesManagerFactory(ManagersModule managersModule, Provider<Application> provider, Provider<QRepository> provider2, Provider<UserPropertiesStorage> provider3, Provider<IncrementalDelayCalculator> provider4, Provider<AppStateProvider> provider5, Provider<Logger> provider6) {
        this.module = managersModule;
        this.appContextProvider = provider;
        this.repositoryProvider = provider2;
        this.propertiesStorageProvider = provider3;
        this.incrementalDelayCalculatorProvider = provider4;
        this.appStateProvider = provider5;
        this.loggerProvider = provider6;
    }

    @Override // javax.inject.Provider
    public QUserPropertiesManager get() {
        return provideUserPropertiesManager(this.module, this.appContextProvider.get(), this.repositoryProvider.get(), this.propertiesStorageProvider.get(), this.incrementalDelayCalculatorProvider.get(), this.appStateProvider.get(), this.loggerProvider.get());
    }

    public static ManagersModule_ProvideUserPropertiesManagerFactory create(ManagersModule managersModule, Provider<Application> provider, Provider<QRepository> provider2, Provider<UserPropertiesStorage> provider3, Provider<IncrementalDelayCalculator> provider4, Provider<AppStateProvider> provider5, Provider<Logger> provider6) {
        return new ManagersModule_ProvideUserPropertiesManagerFactory(managersModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static QUserPropertiesManager provideUserPropertiesManager(ManagersModule managersModule, Application application, QRepository qRepository, UserPropertiesStorage userPropertiesStorage, IncrementalDelayCalculator incrementalDelayCalculator, AppStateProvider appStateProvider, Logger logger) {
        return (QUserPropertiesManager) Preconditions.checkNotNull(managersModule.provideUserPropertiesManager(application, qRepository, userPropertiesStorage, incrementalDelayCalculator, appStateProvider, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package com.qonversion.android.sdk.internal;

import android.app.Application;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.storage.PropertiesStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QUserPropertiesManager_Factory implements Factory<QUserPropertiesManager> {
    private final Provider<AppStateProvider> appStateProvider;
    private final Provider<Application> contextProvider;
    private final Provider<IncrementalDelayCalculator> delayCalculatorProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PropertiesStorage> propertiesStorageProvider;
    private final Provider<QRepository> repositoryProvider;

    public QUserPropertiesManager_Factory(Provider<Application> provider, Provider<QRepository> provider2, Provider<PropertiesStorage> provider3, Provider<IncrementalDelayCalculator> provider4, Provider<AppStateProvider> provider5, Provider<Logger> provider6) {
        this.contextProvider = provider;
        this.repositoryProvider = provider2;
        this.propertiesStorageProvider = provider3;
        this.delayCalculatorProvider = provider4;
        this.appStateProvider = provider5;
        this.loggerProvider = provider6;
    }

    @Override // javax.inject.Provider
    public QUserPropertiesManager get() {
        return new QUserPropertiesManager(this.contextProvider.get(), this.repositoryProvider.get(), this.propertiesStorageProvider.get(), this.delayCalculatorProvider.get(), this.appStateProvider.get(), this.loggerProvider.get());
    }

    public static QUserPropertiesManager_Factory create(Provider<Application> provider, Provider<QRepository> provider2, Provider<PropertiesStorage> provider3, Provider<IncrementalDelayCalculator> provider4, Provider<AppStateProvider> provider5, Provider<Logger> provider6) {
        return new QUserPropertiesManager_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static QUserPropertiesManager newInstance(Application application, QRepository qRepository, PropertiesStorage propertiesStorage, IncrementalDelayCalculator incrementalDelayCalculator, AppStateProvider appStateProvider, Logger logger) {
        return new QUserPropertiesManager(application, qRepository, propertiesStorage, incrementalDelayCalculator, appStateProvider, logger);
    }
}

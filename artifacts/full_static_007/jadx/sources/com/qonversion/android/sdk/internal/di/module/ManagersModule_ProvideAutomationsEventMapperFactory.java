package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.automations.internal.AutomationsEventMapper;
import com.qonversion.android.sdk.internal.logger.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ManagersModule_ProvideAutomationsEventMapperFactory implements Factory<AutomationsEventMapper> {
    private final Provider<Logger> loggerProvider;
    private final ManagersModule module;

    public ManagersModule_ProvideAutomationsEventMapperFactory(ManagersModule managersModule, Provider<Logger> provider) {
        this.module = managersModule;
        this.loggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public AutomationsEventMapper get() {
        return provideAutomationsEventMapper(this.module, this.loggerProvider.get());
    }

    public static ManagersModule_ProvideAutomationsEventMapperFactory create(ManagersModule managersModule, Provider<Logger> provider) {
        return new ManagersModule_ProvideAutomationsEventMapperFactory(managersModule, provider);
    }

    public static AutomationsEventMapper provideAutomationsEventMapper(ManagersModule managersModule, Logger logger) {
        return (AutomationsEventMapper) Preconditions.checkNotNull(managersModule.provideAutomationsEventMapper(logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}

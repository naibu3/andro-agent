package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class AppModule_ProvideConfigFactory implements Factory<InternalConfig> {
    private final AppModule module;

    public AppModule_ProvideConfigFactory(AppModule appModule) {
        this.module = appModule;
    }

    @Override // javax.inject.Provider
    public InternalConfig get() {
        return provideConfig(this.module);
    }

    public static AppModule_ProvideConfigFactory create(AppModule appModule) {
        return new AppModule_ProvideConfigFactory(appModule);
    }

    public static InternalConfig provideConfig(AppModule appModule) {
        return (InternalConfig) Preconditions.checkNotNull(appModule.getInternalConfig(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

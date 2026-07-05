package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class RepositoryModule_ProvideEnvironmentFactory implements Factory<EnvironmentProvider> {
    private final Provider<Application> contextProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideEnvironmentFactory(RepositoryModule repositoryModule, Provider<Application> provider) {
        this.module = repositoryModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public EnvironmentProvider get() {
        return provideEnvironment(this.module, this.contextProvider.get());
    }

    public static RepositoryModule_ProvideEnvironmentFactory create(RepositoryModule repositoryModule, Provider<Application> provider) {
        return new RepositoryModule_ProvideEnvironmentFactory(repositoryModule, provider);
    }

    public static EnvironmentProvider provideEnvironment(RepositoryModule repositoryModule, Application application) {
        return (EnvironmentProvider) Preconditions.checkNotNull(repositoryModule.provideEnvironment(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}

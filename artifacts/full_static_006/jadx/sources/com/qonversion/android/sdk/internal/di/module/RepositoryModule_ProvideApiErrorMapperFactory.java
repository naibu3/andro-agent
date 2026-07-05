package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class RepositoryModule_ProvideApiErrorMapperFactory implements Factory<ApiErrorMapper> {
    private final Provider<ApiHelper> apiHelperProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideApiErrorMapperFactory(RepositoryModule repositoryModule, Provider<ApiHelper> provider) {
        this.module = repositoryModule;
        this.apiHelperProvider = provider;
    }

    @Override // javax.inject.Provider
    public ApiErrorMapper get() {
        return provideApiErrorMapper(this.module, this.apiHelperProvider.get());
    }

    public static RepositoryModule_ProvideApiErrorMapperFactory create(RepositoryModule repositoryModule, Provider<ApiHelper> provider) {
        return new RepositoryModule_ProvideApiErrorMapperFactory(repositoryModule, provider);
    }

    public static ApiErrorMapper provideApiErrorMapper(RepositoryModule repositoryModule, ApiHelper apiHelper) {
        return (ApiErrorMapper) Preconditions.checkNotNull(repositoryModule.provideApiErrorMapper(apiHelper), "Cannot return null from a non-@Nullable @Provides method");
    }
}

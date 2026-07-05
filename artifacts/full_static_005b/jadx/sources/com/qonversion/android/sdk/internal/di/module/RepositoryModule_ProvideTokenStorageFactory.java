package com.qonversion.android.sdk.internal.di.module;

import android.content.SharedPreferences;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class RepositoryModule_ProvideTokenStorageFactory implements Factory<TokenStorage> {
    private final RepositoryModule module;
    private final Provider<SharedPreferences> preferencesProvider;

    public RepositoryModule_ProvideTokenStorageFactory(RepositoryModule repositoryModule, Provider<SharedPreferences> provider) {
        this.module = repositoryModule;
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public TokenStorage get() {
        return provideTokenStorage(this.module, this.preferencesProvider.get());
    }

    public static RepositoryModule_ProvideTokenStorageFactory create(RepositoryModule repositoryModule, Provider<SharedPreferences> provider) {
        return new RepositoryModule_ProvideTokenStorageFactory(repositoryModule, provider);
    }

    public static TokenStorage provideTokenStorage(RepositoryModule repositoryModule, SharedPreferences sharedPreferences) {
        return (TokenStorage) Preconditions.checkNotNull(repositoryModule.provideTokenStorage(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}

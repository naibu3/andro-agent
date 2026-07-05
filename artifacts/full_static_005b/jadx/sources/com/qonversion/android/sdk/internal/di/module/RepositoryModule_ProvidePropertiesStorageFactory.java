package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class RepositoryModule_ProvidePropertiesStorageFactory implements Factory<UserPropertiesStorage> {
    private final RepositoryModule module;

    public RepositoryModule_ProvidePropertiesStorageFactory(RepositoryModule repositoryModule) {
        this.module = repositoryModule;
    }

    @Override // javax.inject.Provider
    public UserPropertiesStorage get() {
        return providePropertiesStorage(this.module);
    }

    public static RepositoryModule_ProvidePropertiesStorageFactory create(RepositoryModule repositoryModule) {
        return new RepositoryModule_ProvidePropertiesStorageFactory(repositoryModule);
    }

    public static UserPropertiesStorage providePropertiesStorage(RepositoryModule repositoryModule) {
        return (UserPropertiesStorage) Preconditions.checkNotNull(repositoryModule.providePropertiesStorage(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

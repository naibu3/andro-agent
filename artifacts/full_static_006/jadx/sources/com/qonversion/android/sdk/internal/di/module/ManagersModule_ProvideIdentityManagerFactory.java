package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.QIdentityManager;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ManagersModule_ProvideIdentityManagerFactory implements Factory<QIdentityManager> {
    private final ManagersModule module;
    private final Provider<QRepository> repositoryProvider;
    private final Provider<QUserInfoService> userInfoServiceProvider;

    public ManagersModule_ProvideIdentityManagerFactory(ManagersModule managersModule, Provider<QRepository> provider, Provider<QUserInfoService> provider2) {
        this.module = managersModule;
        this.repositoryProvider = provider;
        this.userInfoServiceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public QIdentityManager get() {
        return provideIdentityManager(this.module, this.repositoryProvider.get(), this.userInfoServiceProvider.get());
    }

    public static ManagersModule_ProvideIdentityManagerFactory create(ManagersModule managersModule, Provider<QRepository> provider, Provider<QUserInfoService> provider2) {
        return new ManagersModule_ProvideIdentityManagerFactory(managersModule, provider, provider2);
    }

    public static QIdentityManager provideIdentityManager(ManagersModule managersModule, QRepository qRepository, QUserInfoService qUserInfoService) {
        return (QIdentityManager) Preconditions.checkNotNull(managersModule.provideIdentityManager(qRepository, qUserInfoService), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QIdentityManager_Factory implements Factory<QIdentityManager> {
    private final Provider<QRepository> repositoryProvider;
    private final Provider<QUserInfoService> userInfoServiceProvider;

    public QIdentityManager_Factory(Provider<QRepository> provider, Provider<QUserInfoService> provider2) {
        this.repositoryProvider = provider;
        this.userInfoServiceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public QIdentityManager get() {
        return new QIdentityManager(this.repositoryProvider.get(), this.userInfoServiceProvider.get());
    }

    public static QIdentityManager_Factory create(Provider<QRepository> provider, Provider<QUserInfoService> provider2) {
        return new QIdentityManager_Factory(provider, provider2);
    }

    public static QIdentityManager newInstance(QRepository qRepository, QUserInfoService qUserInfoService) {
        return new QIdentityManager(qRepository, qUserInfoService);
    }
}

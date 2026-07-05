package com.qonversion.android.sdk.internal.services;

import com.qonversion.android.sdk.internal.repository.QRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QRemoteConfigService_Factory implements Factory<QRemoteConfigService> {
    private final Provider<QRepository> repositoryProvider;

    public QRemoteConfigService_Factory(Provider<QRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public QRemoteConfigService get() {
        return new QRemoteConfigService(this.repositoryProvider.get());
    }

    public static QRemoteConfigService_Factory create(Provider<QRepository> provider) {
        return new QRemoteConfigService_Factory(provider);
    }

    public static QRemoteConfigService newInstance(QRepository qRepository) {
        return new QRemoteConfigService(qRepository);
    }
}

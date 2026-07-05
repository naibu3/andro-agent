package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QRemoteConfigService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QRemoteConfigManager_Factory implements Factory<QRemoteConfigManager> {
    private final Provider<QFallbacksService> fallbacksServiceProvider;
    private final Provider<QRemoteConfigService> remoteConfigServiceProvider;

    public QRemoteConfigManager_Factory(Provider<QRemoteConfigService> provider, Provider<QFallbacksService> provider2) {
        this.remoteConfigServiceProvider = provider;
        this.fallbacksServiceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public QRemoteConfigManager get() {
        return new QRemoteConfigManager(this.remoteConfigServiceProvider.get(), this.fallbacksServiceProvider.get());
    }

    public static QRemoteConfigManager_Factory create(Provider<QRemoteConfigService> provider, Provider<QFallbacksService> provider2) {
        return new QRemoteConfigManager_Factory(provider, provider2);
    }

    public static QRemoteConfigManager newInstance(QRemoteConfigService qRemoteConfigService, QFallbacksService qFallbacksService) {
        return new QRemoteConfigManager(qRemoteConfigService, qFallbacksService);
    }
}

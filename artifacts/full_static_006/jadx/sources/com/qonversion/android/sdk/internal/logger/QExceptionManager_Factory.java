package com.qonversion.android.sdk.internal.logger;

import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QExceptionManager_Factory implements Factory<QExceptionManager> {
    private final Provider<ApiHeadersProvider> headersProvider;
    private final Provider<InternalConfig> intervalConfigProvider;
    private final Provider<Moshi> moshiProvider;
    private final Provider<QRepository> repositoryProvider;

    public QExceptionManager_Factory(Provider<QRepository> provider, Provider<InternalConfig> provider2, Provider<ApiHeadersProvider> provider3, Provider<Moshi> provider4) {
        this.repositoryProvider = provider;
        this.intervalConfigProvider = provider2;
        this.headersProvider = provider3;
        this.moshiProvider = provider4;
    }

    @Override // javax.inject.Provider
    public QExceptionManager get() {
        return new QExceptionManager(this.repositoryProvider.get(), this.intervalConfigProvider.get(), this.headersProvider.get(), this.moshiProvider.get());
    }

    public static QExceptionManager_Factory create(Provider<QRepository> provider, Provider<InternalConfig> provider2, Provider<ApiHeadersProvider> provider3, Provider<Moshi> provider4) {
        return new QExceptionManager_Factory(provider, provider2, provider3, provider4);
    }

    public static QExceptionManager newInstance(QRepository qRepository, InternalConfig internalConfig, ApiHeadersProvider apiHeadersProvider, Moshi moshi) {
        return new QExceptionManager(qRepository, internalConfig, apiHeadersProvider, moshi);
    }
}

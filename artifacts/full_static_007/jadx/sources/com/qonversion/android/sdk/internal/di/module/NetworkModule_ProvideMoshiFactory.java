package com.qonversion.android.sdk.internal.di.module;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class NetworkModule_ProvideMoshiFactory implements Factory<Moshi> {
    private final NetworkModule module;

    public NetworkModule_ProvideMoshiFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    @Override // javax.inject.Provider
    public Moshi get() {
        return provideMoshi(this.module);
    }

    public static NetworkModule_ProvideMoshiFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideMoshiFactory(networkModule);
    }

    public static Moshi provideMoshi(NetworkModule networkModule) {
        return (Moshi) Preconditions.checkNotNull(networkModule.provideMoshi(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

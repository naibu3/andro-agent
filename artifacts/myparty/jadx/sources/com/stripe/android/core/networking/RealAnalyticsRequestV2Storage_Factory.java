package com.stripe.android.core.networking;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealAnalyticsRequestV2Storage_Factory implements Factory<RealAnalyticsRequestV2Storage> {
    private final Provider<Context> contextProvider;

    public RealAnalyticsRequestV2Storage_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealAnalyticsRequestV2Storage get() {
        return newInstance(this.contextProvider.get());
    }

    public static RealAnalyticsRequestV2Storage_Factory create(javax.inject.Provider<Context> provider) {
        return new RealAnalyticsRequestV2Storage_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealAnalyticsRequestV2Storage_Factory create(Provider<Context> provider) {
        return new RealAnalyticsRequestV2Storage_Factory(provider);
    }

    public static RealAnalyticsRequestV2Storage newInstance(Context context) {
        return new RealAnalyticsRequestV2Storage(context);
    }
}

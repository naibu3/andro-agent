package com.stripe.android.core.utils;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealUserFacingLogger_Factory implements Factory<RealUserFacingLogger> {
    private final Provider<Context> contextProvider;

    public RealUserFacingLogger_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealUserFacingLogger get() {
        return newInstance(this.contextProvider.get());
    }

    public static RealUserFacingLogger_Factory create(javax.inject.Provider<Context> provider) {
        return new RealUserFacingLogger_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealUserFacingLogger_Factory create(Provider<Context> provider) {
        return new RealUserFacingLogger_Factory(provider);
    }

    public static RealUserFacingLogger newInstance(Context context) {
        return new RealUserFacingLogger(context);
    }
}

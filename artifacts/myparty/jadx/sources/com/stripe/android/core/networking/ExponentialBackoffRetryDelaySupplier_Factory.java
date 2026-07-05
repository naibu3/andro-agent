package com.stripe.android.core.networking;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class ExponentialBackoffRetryDelaySupplier_Factory implements Factory<ExponentialBackoffRetryDelaySupplier> {
    @Override // javax.inject.Provider
    public ExponentialBackoffRetryDelaySupplier get() {
        return newInstance();
    }

    public static ExponentialBackoffRetryDelaySupplier_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ExponentialBackoffRetryDelaySupplier newInstance() {
        return new ExponentialBackoffRetryDelaySupplier();
    }

    private static final class InstanceHolder {
        static final ExponentialBackoffRetryDelaySupplier_Factory INSTANCE = new ExponentialBackoffRetryDelaySupplier_Factory();

        private InstanceHolder() {
        }
    }
}

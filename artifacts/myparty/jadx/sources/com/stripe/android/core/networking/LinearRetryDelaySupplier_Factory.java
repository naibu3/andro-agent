package com.stripe.android.core.networking;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class LinearRetryDelaySupplier_Factory implements Factory<LinearRetryDelaySupplier> {
    @Override // javax.inject.Provider
    public LinearRetryDelaySupplier get() {
        return newInstance();
    }

    public static LinearRetryDelaySupplier_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LinearRetryDelaySupplier newInstance() {
        return new LinearRetryDelaySupplier();
    }

    private static final class InstanceHolder {
        static final LinearRetryDelaySupplier_Factory INSTANCE = new LinearRetryDelaySupplier_Factory();

        private InstanceHolder() {
        }
    }
}

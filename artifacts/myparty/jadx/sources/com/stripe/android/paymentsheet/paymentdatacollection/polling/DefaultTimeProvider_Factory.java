package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class DefaultTimeProvider_Factory implements Factory<DefaultTimeProvider> {
    @Override // javax.inject.Provider
    public DefaultTimeProvider get() {
        return newInstance();
    }

    public static DefaultTimeProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultTimeProvider newInstance() {
        return new DefaultTimeProvider();
    }

    private static final class InstanceHolder {
        static final DefaultTimeProvider_Factory INSTANCE = new DefaultTimeProvider_Factory();

        private InstanceHolder() {
        }
    }
}

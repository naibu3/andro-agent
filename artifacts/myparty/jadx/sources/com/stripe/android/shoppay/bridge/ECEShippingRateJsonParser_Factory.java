package com.stripe.android.shoppay.bridge;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class ECEShippingRateJsonParser_Factory implements Factory<ECEShippingRateJsonParser> {
    @Override // javax.inject.Provider
    public ECEShippingRateJsonParser get() {
        return newInstance();
    }

    public static ECEShippingRateJsonParser_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ECEShippingRateJsonParser newInstance() {
        return new ECEShippingRateJsonParser();
    }

    private static final class InstanceHolder {
        static final ECEShippingRateJsonParser_Factory INSTANCE = new ECEShippingRateJsonParser_Factory();

        private InstanceHolder() {
        }
    }
}

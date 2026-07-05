package com.stripe.android.shoppay.bridge;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class ShippingCalculationRequestJsonParser_Factory implements Factory<ShippingCalculationRequestJsonParser> {
    @Override // javax.inject.Provider
    public ShippingCalculationRequestJsonParser get() {
        return newInstance();
    }

    public static ShippingCalculationRequestJsonParser_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ShippingCalculationRequestJsonParser newInstance() {
        return new ShippingCalculationRequestJsonParser();
    }

    private static final class InstanceHolder {
        static final ShippingCalculationRequestJsonParser_Factory INSTANCE = new ShippingCalculationRequestJsonParser_Factory();

        private InstanceHolder() {
        }
    }
}

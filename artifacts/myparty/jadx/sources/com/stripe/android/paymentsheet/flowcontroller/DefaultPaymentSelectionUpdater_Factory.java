package com.stripe.android.paymentsheet.flowcontroller;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class DefaultPaymentSelectionUpdater_Factory implements Factory<DefaultPaymentSelectionUpdater> {
    @Override // javax.inject.Provider
    public DefaultPaymentSelectionUpdater get() {
        return newInstance();
    }

    public static DefaultPaymentSelectionUpdater_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultPaymentSelectionUpdater newInstance() {
        return new DefaultPaymentSelectionUpdater();
    }

    private static final class InstanceHolder {
        static final DefaultPaymentSelectionUpdater_Factory INSTANCE = new DefaultPaymentSelectionUpdater_Factory();

        private InstanceHolder() {
        }
    }
}

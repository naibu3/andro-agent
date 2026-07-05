package com.stripe.android.paymentsheet.addresselement;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class NavHostAddressElementNavigator_Factory implements Factory<NavHostAddressElementNavigator> {
    @Override // javax.inject.Provider
    public NavHostAddressElementNavigator get() {
        return newInstance();
    }

    public static NavHostAddressElementNavigator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NavHostAddressElementNavigator newInstance() {
        return new NavHostAddressElementNavigator();
    }

    private static final class InstanceHolder {
        static final NavHostAddressElementNavigator_Factory INSTANCE = new NavHostAddressElementNavigator_Factory();

        private InstanceHolder() {
        }
    }
}

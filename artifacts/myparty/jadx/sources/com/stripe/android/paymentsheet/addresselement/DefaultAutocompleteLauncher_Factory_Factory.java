package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher;
import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class DefaultAutocompleteLauncher_Factory_Factory implements Factory<DefaultAutocompleteLauncher.Factory> {
    @Override // javax.inject.Provider
    public DefaultAutocompleteLauncher.Factory get() {
        return newInstance();
    }

    public static DefaultAutocompleteLauncher_Factory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultAutocompleteLauncher.Factory newInstance() {
        return new DefaultAutocompleteLauncher.Factory();
    }

    private static final class InstanceHolder {
        static final DefaultAutocompleteLauncher_Factory_Factory INSTANCE = new DefaultAutocompleteLauncher_Factory_Factory();

        private InstanceHolder() {
        }
    }
}

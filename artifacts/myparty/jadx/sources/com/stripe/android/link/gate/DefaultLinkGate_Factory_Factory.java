package com.stripe.android.link.gate;

import com.stripe.android.link.gate.DefaultLinkGate;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class DefaultLinkGate_Factory_Factory implements Factory<DefaultLinkGate.Factory> {
    @Override // javax.inject.Provider
    public DefaultLinkGate.Factory get() {
        return newInstance();
    }

    public static DefaultLinkGate_Factory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultLinkGate.Factory newInstance() {
        return new DefaultLinkGate.Factory();
    }

    private static final class InstanceHolder {
        static final DefaultLinkGate_Factory_Factory INSTANCE = new DefaultLinkGate_Factory_Factory();

        private InstanceHolder() {
        }
    }
}

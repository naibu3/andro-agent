package com.stripe.android.lpmfoundations.luxe;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class LpmRepository_Factory implements Factory<LpmRepository> {
    @Override // javax.inject.Provider
    public LpmRepository get() {
        return newInstance();
    }

    public static LpmRepository_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LpmRepository newInstance() {
        return new LpmRepository();
    }

    private static final class InstanceHolder {
        static final LpmRepository_Factory INSTANCE = new LpmRepository_Factory();

        private InstanceHolder() {
        }
    }
}

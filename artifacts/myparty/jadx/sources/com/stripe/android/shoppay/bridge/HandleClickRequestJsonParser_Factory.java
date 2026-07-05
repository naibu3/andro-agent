package com.stripe.android.shoppay.bridge;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class HandleClickRequestJsonParser_Factory implements Factory<HandleClickRequestJsonParser> {
    @Override // javax.inject.Provider
    public HandleClickRequestJsonParser get() {
        return newInstance();
    }

    public static HandleClickRequestJsonParser_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HandleClickRequestJsonParser newInstance() {
        return new HandleClickRequestJsonParser();
    }

    private static final class InstanceHolder {
        static final HandleClickRequestJsonParser_Factory INSTANCE = new HandleClickRequestJsonParser_Factory();

        private InstanceHolder() {
        }
    }
}

package com.stripe.android.financialconnections.domain;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class NativeAuthFlowCoordinator_Factory implements Factory<NativeAuthFlowCoordinator> {
    @Override // javax.inject.Provider
    public NativeAuthFlowCoordinator get() {
        return newInstance();
    }

    public static NativeAuthFlowCoordinator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NativeAuthFlowCoordinator newInstance() {
        return new NativeAuthFlowCoordinator();
    }

    private static final class InstanceHolder {
        static final NativeAuthFlowCoordinator_Factory INSTANCE = new NativeAuthFlowCoordinator_Factory();

        private InstanceHolder() {
        }
    }
}

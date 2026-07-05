package com.stripe.android.uicore.navigation;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class NavigationManagerImpl_Factory implements Factory<NavigationManagerImpl> {
    @Override // javax.inject.Provider
    public NavigationManagerImpl get() {
        return newInstance();
    }

    public static NavigationManagerImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NavigationManagerImpl newInstance() {
        return new NavigationManagerImpl();
    }

    private static final class InstanceHolder {
        static final NavigationManagerImpl_Factory INSTANCE = new NavigationManagerImpl_Factory();

        private InstanceHolder() {
        }
    }
}

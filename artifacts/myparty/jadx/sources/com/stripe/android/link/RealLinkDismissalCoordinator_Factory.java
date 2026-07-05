package com.stripe.android.link;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class RealLinkDismissalCoordinator_Factory implements Factory<RealLinkDismissalCoordinator> {
    @Override // javax.inject.Provider
    public RealLinkDismissalCoordinator get() {
        return newInstance();
    }

    public static RealLinkDismissalCoordinator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RealLinkDismissalCoordinator newInstance() {
        return new RealLinkDismissalCoordinator();
    }

    private static final class InstanceHolder {
        static final RealLinkDismissalCoordinator_Factory INSTANCE = new RealLinkDismissalCoordinator_Factory();

        private InstanceHolder() {
        }
    }
}

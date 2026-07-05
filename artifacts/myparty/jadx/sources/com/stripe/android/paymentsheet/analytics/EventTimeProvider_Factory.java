package com.stripe.android.paymentsheet.analytics;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class EventTimeProvider_Factory implements Factory<EventTimeProvider> {
    @Override // javax.inject.Provider
    public EventTimeProvider get() {
        return newInstance();
    }

    public static EventTimeProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventTimeProvider newInstance() {
        return new EventTimeProvider();
    }

    private static final class InstanceHolder {
        static final EventTimeProvider_Factory INSTANCE = new EventTimeProvider_Factory();

        private InstanceHolder() {
        }
    }
}

package com.qonversion.android.sdk.automations.internal;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ActivityProvider_Factory implements Factory<ActivityProvider> {
    private final Provider<Application> applicationProvider;

    public ActivityProvider_Factory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public ActivityProvider get() {
        return new ActivityProvider(this.applicationProvider.get());
    }

    public static ActivityProvider_Factory create(Provider<Application> provider) {
        return new ActivityProvider_Factory(provider);
    }

    public static ActivityProvider newInstance(Application application) {
        return new ActivityProvider(application);
    }
}

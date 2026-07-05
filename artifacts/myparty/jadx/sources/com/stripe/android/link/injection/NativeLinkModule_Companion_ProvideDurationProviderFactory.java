package com.stripe.android.link.injection;

import com.stripe.android.core.utils.DurationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideDurationProviderFactory implements Factory<DurationProvider> {
    @Override // javax.inject.Provider
    public DurationProvider get() {
        return provideDurationProvider();
    }

    public static NativeLinkModule_Companion_ProvideDurationProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DurationProvider provideDurationProvider() {
        return (DurationProvider) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.provideDurationProvider());
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_ProvideDurationProviderFactory INSTANCE = new NativeLinkModule_Companion_ProvideDurationProviderFactory();

        private InstanceHolder() {
        }
    }
}

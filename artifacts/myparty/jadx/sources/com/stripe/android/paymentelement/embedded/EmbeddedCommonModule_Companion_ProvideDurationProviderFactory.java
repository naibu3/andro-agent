package com.stripe.android.paymentelement.embedded;

import com.stripe.android.core.utils.DurationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class EmbeddedCommonModule_Companion_ProvideDurationProviderFactory implements Factory<DurationProvider> {
    @Override // javax.inject.Provider
    public DurationProvider get() {
        return provideDurationProvider();
    }

    public static EmbeddedCommonModule_Companion_ProvideDurationProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DurationProvider provideDurationProvider() {
        return (DurationProvider) Preconditions.checkNotNullFromProvides(EmbeddedCommonModule.INSTANCE.provideDurationProvider());
    }

    private static final class InstanceHolder {
        static final EmbeddedCommonModule_Companion_ProvideDurationProviderFactory INSTANCE = new EmbeddedCommonModule_Companion_ProvideDurationProviderFactory();

        private InstanceHolder() {
        }
    }
}

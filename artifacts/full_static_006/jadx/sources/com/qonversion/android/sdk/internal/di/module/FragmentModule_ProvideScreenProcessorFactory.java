package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class FragmentModule_ProvideScreenProcessorFactory implements Factory<ScreenProcessor> {
    private final FragmentModule module;

    public FragmentModule_ProvideScreenProcessorFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    @Override // javax.inject.Provider
    public ScreenProcessor get() {
        return provideScreenProcessor(this.module);
    }

    public static FragmentModule_ProvideScreenProcessorFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideScreenProcessorFactory(fragmentModule);
    }

    public static ScreenProcessor provideScreenProcessor(FragmentModule fragmentModule) {
        return (ScreenProcessor) Preconditions.checkNotNull(fragmentModule.provideScreenProcessor(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

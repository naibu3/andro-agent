package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class FragmentModule_ProvideScreenViewFactory implements Factory<ScreenContract.View> {
    private final FragmentModule module;

    public FragmentModule_ProvideScreenViewFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    @Override // javax.inject.Provider
    public ScreenContract.View get() {
        return provideScreenView(this.module);
    }

    public static FragmentModule_ProvideScreenViewFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideScreenViewFactory(fragmentModule);
    }

    public static ScreenContract.View provideScreenView(FragmentModule fragmentModule) {
        return (ScreenContract.View) Preconditions.checkNotNull(fragmentModule.getView(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

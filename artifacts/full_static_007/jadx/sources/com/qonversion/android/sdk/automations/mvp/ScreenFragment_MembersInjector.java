package com.qonversion.android.sdk.automations.mvp;

import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ScreenFragment_MembersInjector implements MembersInjector<ScreenFragment> {
    private final Provider<QAutomationsManager> automationsManagerProvider;
    private final Provider<ScreenPresenter> presenterProvider;
    private final Provider<ScreenProcessor> screenProcessorProvider;

    public ScreenFragment_MembersInjector(Provider<QAutomationsManager> provider, Provider<ScreenPresenter> provider2, Provider<ScreenProcessor> provider3) {
        this.automationsManagerProvider = provider;
        this.presenterProvider = provider2;
        this.screenProcessorProvider = provider3;
    }

    public static MembersInjector<ScreenFragment> create(Provider<QAutomationsManager> provider, Provider<ScreenPresenter> provider2, Provider<ScreenProcessor> provider3) {
        return new ScreenFragment_MembersInjector(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ScreenFragment screenFragment) {
        injectAutomationsManager(screenFragment, this.automationsManagerProvider.get());
        injectPresenter(screenFragment, this.presenterProvider.get());
        injectScreenProcessor(screenFragment, this.screenProcessorProvider.get());
    }

    public static void injectAutomationsManager(ScreenFragment screenFragment, QAutomationsManager qAutomationsManager) {
        screenFragment.automationsManager = qAutomationsManager;
    }

    public static void injectPresenter(ScreenFragment screenFragment, ScreenPresenter screenPresenter) {
        screenFragment.presenter = screenPresenter;
    }

    public static void injectScreenProcessor(ScreenFragment screenFragment, ScreenProcessor screenProcessor) {
        screenFragment.screenProcessor = screenProcessor;
    }
}

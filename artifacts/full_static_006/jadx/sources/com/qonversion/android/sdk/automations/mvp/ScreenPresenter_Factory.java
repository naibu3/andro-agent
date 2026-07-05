package com.qonversion.android.sdk.automations.mvp;

import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.internal.repository.QRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ScreenPresenter_Factory implements Factory<ScreenPresenter> {
    private final Provider<QRepository> repositoryProvider;
    private final Provider<ScreenContract.View> viewProvider;

    public ScreenPresenter_Factory(Provider<QRepository> provider, Provider<ScreenContract.View> provider2) {
        this.repositoryProvider = provider;
        this.viewProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ScreenPresenter get() {
        return new ScreenPresenter(this.repositoryProvider.get(), this.viewProvider.get());
    }

    public static ScreenPresenter_Factory create(Provider<QRepository> provider, Provider<ScreenContract.View> provider2) {
        return new ScreenPresenter_Factory(provider, provider2);
    }

    public static ScreenPresenter newInstance(QRepository qRepository, ScreenContract.View view) {
        return new ScreenPresenter(qRepository, view);
    }
}

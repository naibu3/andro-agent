package com.stripe.android.paymentelement.embedded.manage;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1086ManageViewModel_Factory implements Factory<ManageViewModel> {
    private final Provider<ManageComponent> componentProvider;
    private final Provider<CoroutineScope> customViewModelScopeProvider;

    public C1086ManageViewModel_Factory(Provider<ManageComponent> provider, Provider<CoroutineScope> provider2) {
        this.componentProvider = provider;
        this.customViewModelScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ManageViewModel get() {
        return newInstance(this.componentProvider.get(), this.customViewModelScopeProvider.get());
    }

    public static C1086ManageViewModel_Factory create(javax.inject.Provider<ManageComponent> provider, javax.inject.Provider<CoroutineScope> provider2) {
        return new C1086ManageViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static C1086ManageViewModel_Factory create(Provider<ManageComponent> provider, Provider<CoroutineScope> provider2) {
        return new C1086ManageViewModel_Factory(provider, provider2);
    }

    public static ManageViewModel newInstance(ManageComponent manageComponent, CoroutineScope coroutineScope) {
        return new ManageViewModel(manageComponent, coroutineScope);
    }
}

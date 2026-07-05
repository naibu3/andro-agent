package com.stripe.android.paymentelement.embedded.form;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.stripe.android.paymentelement.embedded.form.FormActivityViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1084FormActivityViewModel_Factory implements Factory<FormActivityViewModel> {
    private final Provider<FormActivityViewModelComponent> componentProvider;
    private final Provider<CoroutineScope> customViewModelScopeProvider;

    public C1084FormActivityViewModel_Factory(Provider<FormActivityViewModelComponent> provider, Provider<CoroutineScope> provider2) {
        this.componentProvider = provider;
        this.customViewModelScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public FormActivityViewModel get() {
        return newInstance(this.componentProvider.get(), this.customViewModelScopeProvider.get());
    }

    public static C1084FormActivityViewModel_Factory create(javax.inject.Provider<FormActivityViewModelComponent> provider, javax.inject.Provider<CoroutineScope> provider2) {
        return new C1084FormActivityViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static C1084FormActivityViewModel_Factory create(Provider<FormActivityViewModelComponent> provider, Provider<CoroutineScope> provider2) {
        return new C1084FormActivityViewModel_Factory(provider, provider2);
    }

    public static FormActivityViewModel newInstance(FormActivityViewModelComponent formActivityViewModelComponent, CoroutineScope coroutineScope) {
        return new FormActivityViewModel(formActivityViewModelComponent, coroutineScope);
    }
}

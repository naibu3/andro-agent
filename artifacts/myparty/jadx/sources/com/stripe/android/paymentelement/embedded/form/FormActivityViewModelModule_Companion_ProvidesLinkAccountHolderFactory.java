package com.stripe.android.paymentelement.embedded.form;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.account.LinkAccountHolder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FormActivityViewModelModule_Companion_ProvidesLinkAccountHolderFactory implements Factory<LinkAccountHolder> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public FormActivityViewModelModule_Companion_ProvidesLinkAccountHolderFactory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public LinkAccountHolder get() {
        return providesLinkAccountHolder(this.savedStateHandleProvider.get());
    }

    public static FormActivityViewModelModule_Companion_ProvidesLinkAccountHolderFactory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new FormActivityViewModelModule_Companion_ProvidesLinkAccountHolderFactory(Providers.asDaggerProvider(provider));
    }

    public static FormActivityViewModelModule_Companion_ProvidesLinkAccountHolderFactory create(Provider<SavedStateHandle> provider) {
        return new FormActivityViewModelModule_Companion_ProvidesLinkAccountHolderFactory(provider);
    }

    public static LinkAccountHolder providesLinkAccountHolder(SavedStateHandle savedStateHandle) {
        return (LinkAccountHolder) Preconditions.checkNotNullFromProvides(FormActivityViewModelModule.INSTANCE.providesLinkAccountHolder(savedStateHandle));
    }
}

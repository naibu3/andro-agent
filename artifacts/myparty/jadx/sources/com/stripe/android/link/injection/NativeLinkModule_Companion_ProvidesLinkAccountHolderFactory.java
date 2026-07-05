package com.stripe.android.link.injection;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.account.LinkAccountHolder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory implements Factory<LinkAccountHolder> {
    private final Provider<LinkAccountUpdate.Value> linkAccountInfoProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory(Provider<SavedStateHandle> provider, Provider<LinkAccountUpdate.Value> provider2) {
        this.savedStateHandleProvider = provider;
        this.linkAccountInfoProvider = provider2;
    }

    @Override // javax.inject.Provider
    public LinkAccountHolder get() {
        return providesLinkAccountHolder(this.savedStateHandleProvider.get(), this.linkAccountInfoProvider.get());
    }

    public static NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory create(javax.inject.Provider<SavedStateHandle> provider, javax.inject.Provider<LinkAccountUpdate.Value> provider2) {
        return new NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory create(Provider<SavedStateHandle> provider, Provider<LinkAccountUpdate.Value> provider2) {
        return new NativeLinkModule_Companion_ProvidesLinkAccountHolderFactory(provider, provider2);
    }

    public static LinkAccountHolder providesLinkAccountHolder(SavedStateHandle savedStateHandle, LinkAccountUpdate.Value value) {
        return (LinkAccountHolder) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.providesLinkAccountHolder(savedStateHandle, value));
    }
}

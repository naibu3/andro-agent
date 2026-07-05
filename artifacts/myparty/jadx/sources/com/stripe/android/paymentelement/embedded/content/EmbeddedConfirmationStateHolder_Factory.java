package com.stripe.android.paymentelement.embedded.content;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class EmbeddedConfirmationStateHolder_Factory implements Factory<EmbeddedConfirmationStateHolder> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;

    public EmbeddedConfirmationStateHolder_Factory(Provider<SavedStateHandle> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<CoroutineScope> provider3) {
        this.savedStateHandleProvider = provider;
        this.selectionHolderProvider = provider2;
        this.coroutineScopeProvider = provider3;
    }

    @Override // javax.inject.Provider
    public EmbeddedConfirmationStateHolder get() {
        return newInstance(this.savedStateHandleProvider.get(), this.selectionHolderProvider.get(), this.coroutineScopeProvider.get());
    }

    public static EmbeddedConfirmationStateHolder_Factory create(javax.inject.Provider<SavedStateHandle> provider, javax.inject.Provider<EmbeddedSelectionHolder> provider2, javax.inject.Provider<CoroutineScope> provider3) {
        return new EmbeddedConfirmationStateHolder_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static EmbeddedConfirmationStateHolder_Factory create(Provider<SavedStateHandle> provider, Provider<EmbeddedSelectionHolder> provider2, Provider<CoroutineScope> provider3) {
        return new EmbeddedConfirmationStateHolder_Factory(provider, provider2, provider3);
    }

    public static EmbeddedConfirmationStateHolder newInstance(SavedStateHandle savedStateHandle, EmbeddedSelectionHolder embeddedSelectionHolder, CoroutineScope coroutineScope) {
        return new EmbeddedConfirmationStateHolder(savedStateHandle, embeddedSelectionHolder, coroutineScope);
    }
}

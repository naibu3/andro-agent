package com.stripe.android.paymentelement.embedded.content;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class SheetStateHolder_Factory implements Factory<SheetStateHolder> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public SheetStateHolder_Factory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public SheetStateHolder get() {
        return newInstance(this.savedStateHandleProvider.get());
    }

    public static SheetStateHolder_Factory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new SheetStateHolder_Factory(Providers.asDaggerProvider(provider));
    }

    public static SheetStateHolder_Factory create(Provider<SavedStateHandle> provider) {
        return new SheetStateHolder_Factory(provider);
    }

    public static SheetStateHolder newInstance(SavedStateHandle savedStateHandle) {
        return new SheetStateHolder(savedStateHandle);
    }
}

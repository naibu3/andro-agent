package com.stripe.android.paymentsheet.injection;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.account.LinkAccountHolder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory implements Factory<LinkAccountHolder> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public LinkAccountHolder get() {
        return providesLinkAccountHolder(this.savedStateHandleProvider.get());
    }

    public static PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory(Providers.asDaggerProvider(provider));
    }

    public static PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory create(Provider<SavedStateHandle> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidesLinkAccountHolderFactory(provider);
    }

    public static LinkAccountHolder providesLinkAccountHolder(SavedStateHandle savedStateHandle) {
        return (LinkAccountHolder) Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.INSTANCE.providesLinkAccountHolder(savedStateHandle));
    }
}

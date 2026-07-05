package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.paymentsheet.CreateIntentCallback;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory implements Factory<CreateIntentCallback> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public CreateIntentCallback get() {
        return providesCreateIntentCallback(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory create(javax.inject.Provider<String> provider) {
        return new IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory(Providers.asDaggerProvider(provider));
    }

    public static IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory create(Provider<String> provider) {
        return new IntentConfirmationModule_Companion_ProvidesCreateIntentCallbackFactory(provider);
    }

    public static CreateIntentCallback providesCreateIntentCallback(String str) {
        return IntentConfirmationModule.INSTANCE.providesCreateIntentCallback(str);
    }
}

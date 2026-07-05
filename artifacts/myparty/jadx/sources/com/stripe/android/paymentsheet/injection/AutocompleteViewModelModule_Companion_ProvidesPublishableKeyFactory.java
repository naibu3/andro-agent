package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory implements Factory<Function0<String>> {
    private final Provider<Context> contextProvider;

    public AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return providesPublishableKey(this.contextProvider.get());
    }

    public static AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory create(javax.inject.Provider<Context> provider) {
        return new AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory(Providers.asDaggerProvider(provider));
    }

    public static AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory create(Provider<Context> provider) {
        return new AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory(provider);
    }

    public static Function0<String> providesPublishableKey(Context context) {
        return (Function0) Preconditions.checkNotNullFromProvides(AutocompleteViewModelModule.INSTANCE.providesPublishableKey(context));
    }
}

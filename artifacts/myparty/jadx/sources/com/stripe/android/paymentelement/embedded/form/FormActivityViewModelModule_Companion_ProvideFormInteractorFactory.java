package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.paymentsheet.verticalmode.DefaultVerticalModeFormInteractor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FormActivityViewModelModule_Companion_ProvideFormInteractorFactory implements Factory<DefaultVerticalModeFormInteractor> {
    private final Provider<EmbeddedFormInteractorFactory> interactorFactoryProvider;

    public FormActivityViewModelModule_Companion_ProvideFormInteractorFactory(Provider<EmbeddedFormInteractorFactory> provider) {
        this.interactorFactoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultVerticalModeFormInteractor get() {
        return provideFormInteractor(this.interactorFactoryProvider.get());
    }

    public static FormActivityViewModelModule_Companion_ProvideFormInteractorFactory create(javax.inject.Provider<EmbeddedFormInteractorFactory> provider) {
        return new FormActivityViewModelModule_Companion_ProvideFormInteractorFactory(Providers.asDaggerProvider(provider));
    }

    public static FormActivityViewModelModule_Companion_ProvideFormInteractorFactory create(Provider<EmbeddedFormInteractorFactory> provider) {
        return new FormActivityViewModelModule_Companion_ProvideFormInteractorFactory(provider);
    }

    public static DefaultVerticalModeFormInteractor provideFormInteractor(EmbeddedFormInteractorFactory embeddedFormInteractorFactory) {
        return (DefaultVerticalModeFormInteractor) Preconditions.checkNotNullFromProvides(FormActivityViewModelModule.INSTANCE.provideFormInteractor(embeddedFormInteractorFactory));
    }
}

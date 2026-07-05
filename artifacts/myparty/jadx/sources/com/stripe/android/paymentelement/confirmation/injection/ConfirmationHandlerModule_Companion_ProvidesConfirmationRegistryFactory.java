package com.stripe.android.paymentelement.confirmation.injection;

import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;

/* loaded from: classes5.dex */
public final class ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory implements Factory<ConfirmationRegistry> {
    private final Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> definitionsProvider;

    public ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory(Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> provider) {
        this.definitionsProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConfirmationRegistry get() {
        return providesConfirmationRegistry(this.definitionsProvider.get());
    }

    public static ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory create(javax.inject.Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> provider) {
        return new ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory(Providers.asDaggerProvider(provider));
    }

    public static ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory create(Provider<Set<ConfirmationDefinition<?, ?, ?, ?>>> provider) {
        return new ConfirmationHandlerModule_Companion_ProvidesConfirmationRegistryFactory(provider);
    }

    public static ConfirmationRegistry providesConfirmationRegistry(Set<ConfirmationDefinition<?, ?, ?, ?>> set) {
        return (ConfirmationRegistry) Preconditions.checkNotNullFromProvides(ConfirmationHandlerModule.INSTANCE.providesConfirmationRegistry(set));
    }
}

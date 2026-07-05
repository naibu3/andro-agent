package com.stripe.android.paymentelement.embedded.content;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedSelectionChooser_Factory implements Factory<DefaultEmbeddedSelectionChooser> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<EmbeddedFormHelperFactory> formHelperFactoryProvider;
    private final Provider<Function0<Unit>> internalRowSelectionCallbackProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public DefaultEmbeddedSelectionChooser_Factory(Provider<SavedStateHandle> provider, Provider<EmbeddedFormHelperFactory> provider2, Provider<EventReporter> provider3, Provider<CoroutineScope> provider4, Provider<Function0<Unit>> provider5) {
        this.savedStateHandleProvider = provider;
        this.formHelperFactoryProvider = provider2;
        this.eventReporterProvider = provider3;
        this.coroutineScopeProvider = provider4;
        this.internalRowSelectionCallbackProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedSelectionChooser get() {
        return newInstance(this.savedStateHandleProvider.get(), this.formHelperFactoryProvider.get(), this.eventReporterProvider.get(), this.coroutineScopeProvider.get(), this.internalRowSelectionCallbackProvider);
    }

    public static DefaultEmbeddedSelectionChooser_Factory create(javax.inject.Provider<SavedStateHandle> provider, javax.inject.Provider<EmbeddedFormHelperFactory> provider2, javax.inject.Provider<EventReporter> provider3, javax.inject.Provider<CoroutineScope> provider4, javax.inject.Provider<Function0<Unit>> provider5) {
        return new DefaultEmbeddedSelectionChooser_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static DefaultEmbeddedSelectionChooser_Factory create(Provider<SavedStateHandle> provider, Provider<EmbeddedFormHelperFactory> provider2, Provider<EventReporter> provider3, Provider<CoroutineScope> provider4, Provider<Function0<Unit>> provider5) {
        return new DefaultEmbeddedSelectionChooser_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultEmbeddedSelectionChooser newInstance(SavedStateHandle savedStateHandle, EmbeddedFormHelperFactory embeddedFormHelperFactory, EventReporter eventReporter, CoroutineScope coroutineScope, javax.inject.Provider<Function0<Unit>> provider) {
        return new DefaultEmbeddedSelectionChooser(savedStateHandle, embeddedFormHelperFactory, eventReporter, coroutineScope, provider);
    }
}

package com.stripe.android.paymentelement.embedded.content;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedConfigurationHandler_Factory implements Factory<DefaultEmbeddedConfigurationHandler> {
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<Function0<Unit>> internalRowSelectionCallbackProvider;
    private final Provider<Function0<Boolean>> isLiveModeProvider;
    private final Provider<PaymentElementLoader> paymentElementLoaderProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<SheetStateHolder> sheetStateHolderProvider;

    public DefaultEmbeddedConfigurationHandler_Factory(Provider<PaymentElementLoader> provider, Provider<SavedStateHandle> provider2, Provider<SheetStateHolder> provider3, Provider<EventReporter> provider4, Provider<Function0<Unit>> provider5, Provider<Function0<Boolean>> provider6) {
        this.paymentElementLoaderProvider = provider;
        this.savedStateHandleProvider = provider2;
        this.sheetStateHolderProvider = provider3;
        this.eventReporterProvider = provider4;
        this.internalRowSelectionCallbackProvider = provider5;
        this.isLiveModeProvider = provider6;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedConfigurationHandler get() {
        return newInstance(this.paymentElementLoaderProvider.get(), this.savedStateHandleProvider.get(), this.sheetStateHolderProvider.get(), this.eventReporterProvider.get(), this.internalRowSelectionCallbackProvider, this.isLiveModeProvider.get());
    }

    public static DefaultEmbeddedConfigurationHandler_Factory create(javax.inject.Provider<PaymentElementLoader> provider, javax.inject.Provider<SavedStateHandle> provider2, javax.inject.Provider<SheetStateHolder> provider3, javax.inject.Provider<EventReporter> provider4, javax.inject.Provider<Function0<Unit>> provider5, javax.inject.Provider<Function0<Boolean>> provider6) {
        return new DefaultEmbeddedConfigurationHandler_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static DefaultEmbeddedConfigurationHandler_Factory create(Provider<PaymentElementLoader> provider, Provider<SavedStateHandle> provider2, Provider<SheetStateHolder> provider3, Provider<EventReporter> provider4, Provider<Function0<Unit>> provider5, Provider<Function0<Boolean>> provider6) {
        return new DefaultEmbeddedConfigurationHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultEmbeddedConfigurationHandler newInstance(PaymentElementLoader paymentElementLoader, SavedStateHandle savedStateHandle, SheetStateHolder sheetStateHolder, EventReporter eventReporter, javax.inject.Provider<Function0<Unit>> provider, Function0<Boolean> function0) {
        return new DefaultEmbeddedConfigurationHandler(paymentElementLoader, savedStateHandle, sheetStateHolder, eventReporter, provider, function0);
    }
}

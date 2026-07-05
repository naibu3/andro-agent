package com.stripe.android.paymentelement.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class DefaultConfirmationHandler_Factory_Factory implements Factory<DefaultConfirmationHandler.Factory> {
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<CoroutineContext> ioContextProvider;
    private final Provider<ConfirmationRegistry> registryProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public DefaultConfirmationHandler_Factory_Factory(Provider<ConfirmationRegistry> provider, Provider<SavedStateHandle> provider2, Provider<ErrorReporter> provider3, Provider<CoroutineContext> provider4) {
        this.registryProvider = provider;
        this.savedStateHandleProvider = provider2;
        this.errorReporterProvider = provider3;
        this.ioContextProvider = provider4;
    }

    @Override // javax.inject.Provider
    public DefaultConfirmationHandler.Factory get() {
        return newInstance(this.registryProvider.get(), this.savedStateHandleProvider.get(), this.errorReporterProvider.get(), this.ioContextProvider.get());
    }

    public static DefaultConfirmationHandler_Factory_Factory create(javax.inject.Provider<ConfirmationRegistry> provider, javax.inject.Provider<SavedStateHandle> provider2, javax.inject.Provider<ErrorReporter> provider3, javax.inject.Provider<CoroutineContext> provider4) {
        return new DefaultConfirmationHandler_Factory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static DefaultConfirmationHandler_Factory_Factory create(Provider<ConfirmationRegistry> provider, Provider<SavedStateHandle> provider2, Provider<ErrorReporter> provider3, Provider<CoroutineContext> provider4) {
        return new DefaultConfirmationHandler_Factory_Factory(provider, provider2, provider3, provider4);
    }

    public static DefaultConfirmationHandler.Factory newInstance(ConfirmationRegistry confirmationRegistry, SavedStateHandle savedStateHandle, ErrorReporter errorReporter, CoroutineContext coroutineContext) {
        return new DefaultConfirmationHandler.Factory(confirmationRegistry, savedStateHandle, errorReporter, coroutineContext);
    }
}

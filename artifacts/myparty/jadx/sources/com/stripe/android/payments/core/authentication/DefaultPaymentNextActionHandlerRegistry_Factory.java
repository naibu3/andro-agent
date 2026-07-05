package com.stripe.android.payments.core.authentication;

import android.content.Context;
import com.stripe.android.model.StripeIntent;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Map;

/* loaded from: classes6.dex */
public final class DefaultPaymentNextActionHandlerRegistry_Factory implements Factory<DefaultPaymentNextActionHandlerRegistry> {
    private final Provider<Context> applicationContextProvider;
    private final Provider<Boolean> includePaymentSheetNextActionHandlersProvider;
    private final Provider<NoOpIntentNextActionHandler> noOpIntentNextActionHandlerProvider;
    private final Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>>> paymentNextActionHandlersProvider;
    private final Provider<SourceNextActionHandler> sourceNextActionHandlerProvider;

    public DefaultPaymentNextActionHandlerRegistry_Factory(Provider<NoOpIntentNextActionHandler> provider, Provider<SourceNextActionHandler> provider2, Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>>> provider3, Provider<Boolean> provider4, Provider<Context> provider5) {
        this.noOpIntentNextActionHandlerProvider = provider;
        this.sourceNextActionHandlerProvider = provider2;
        this.paymentNextActionHandlersProvider = provider3;
        this.includePaymentSheetNextActionHandlersProvider = provider4;
        this.applicationContextProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultPaymentNextActionHandlerRegistry get() {
        return newInstance(this.noOpIntentNextActionHandlerProvider.get(), this.sourceNextActionHandlerProvider.get(), this.paymentNextActionHandlersProvider.get(), this.includePaymentSheetNextActionHandlersProvider.get().booleanValue(), this.applicationContextProvider.get());
    }

    public static DefaultPaymentNextActionHandlerRegistry_Factory create(javax.inject.Provider<NoOpIntentNextActionHandler> provider, javax.inject.Provider<SourceNextActionHandler> provider2, javax.inject.Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>>> provider3, javax.inject.Provider<Boolean> provider4, javax.inject.Provider<Context> provider5) {
        return new DefaultPaymentNextActionHandlerRegistry_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static DefaultPaymentNextActionHandlerRegistry_Factory create(Provider<NoOpIntentNextActionHandler> provider, Provider<SourceNextActionHandler> provider2, Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>>> provider3, Provider<Boolean> provider4, Provider<Context> provider5) {
        return new DefaultPaymentNextActionHandlerRegistry_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultPaymentNextActionHandlerRegistry newInstance(NoOpIntentNextActionHandler noOpIntentNextActionHandler, SourceNextActionHandler sourceNextActionHandler, Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> map, boolean z, Context context) {
        return new DefaultPaymentNextActionHandlerRegistry(noOpIntentNextActionHandler, sourceNextActionHandler, map, z, context);
    }
}

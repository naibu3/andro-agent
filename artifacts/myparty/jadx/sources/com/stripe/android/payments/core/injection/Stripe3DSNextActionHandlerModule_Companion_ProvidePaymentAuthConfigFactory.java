package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory implements Factory<PaymentAuthConfig> {
    @Override // javax.inject.Provider
    public PaymentAuthConfig get() {
        return providePaymentAuthConfig();
    }

    public static Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PaymentAuthConfig providePaymentAuthConfig() {
        return (PaymentAuthConfig) Preconditions.checkNotNullFromProvides(Stripe3DSNextActionHandlerModule.INSTANCE.providePaymentAuthConfig());
    }

    private static final class InstanceHolder {
        static final Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory INSTANCE = new Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory();

        private InstanceHolder() {
        }
    }
}

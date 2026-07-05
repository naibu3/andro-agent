package com.stripe.android.payments.core.injection;

import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory implements Factory<MessageVersionRegistry> {
    @Override // javax.inject.Provider
    public MessageVersionRegistry get() {
        return provideMessageVersionRegistry();
    }

    public static Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MessageVersionRegistry provideMessageVersionRegistry() {
        return (MessageVersionRegistry) Preconditions.checkNotNullFromProvides(Stripe3ds2TransactionModule.INSTANCE.provideMessageVersionRegistry());
    }

    private static final class InstanceHolder {
        static final Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory INSTANCE = new Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory();

        private InstanceHolder() {
        }
    }
}

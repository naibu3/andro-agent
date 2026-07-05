package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.UnsupportedNextActionHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class WeChatPayNextActionHandlerModule_ProvideWeChatNextActionHandler$payments_core_releaseFactory implements Factory<PaymentNextActionHandler<StripeIntent>> {
    private final WeChatPayNextActionHandlerModule module;
    private final Provider<UnsupportedNextActionHandler> unsupportedNextActionHandlerProvider;

    public WeChatPayNextActionHandlerModule_ProvideWeChatNextActionHandler$payments_core_releaseFactory(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, Provider<UnsupportedNextActionHandler> provider) {
        this.module = weChatPayNextActionHandlerModule;
        this.unsupportedNextActionHandlerProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentNextActionHandler<StripeIntent> get() {
        return provideWeChatNextActionHandler$payments_core_release(this.module, this.unsupportedNextActionHandlerProvider.get());
    }

    public static WeChatPayNextActionHandlerModule_ProvideWeChatNextActionHandler$payments_core_releaseFactory create(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, javax.inject.Provider<UnsupportedNextActionHandler> provider) {
        return new WeChatPayNextActionHandlerModule_ProvideWeChatNextActionHandler$payments_core_releaseFactory(weChatPayNextActionHandlerModule, Providers.asDaggerProvider(provider));
    }

    public static WeChatPayNextActionHandlerModule_ProvideWeChatNextActionHandler$payments_core_releaseFactory create(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, Provider<UnsupportedNextActionHandler> provider) {
        return new WeChatPayNextActionHandlerModule_ProvideWeChatNextActionHandler$payments_core_releaseFactory(weChatPayNextActionHandlerModule, provider);
    }

    public static PaymentNextActionHandler<StripeIntent> provideWeChatNextActionHandler$payments_core_release(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, UnsupportedNextActionHandler unsupportedNextActionHandler) {
        return (PaymentNextActionHandler) Preconditions.checkNotNullFromProvides(weChatPayNextActionHandlerModule.provideWeChatNextActionHandler$payments_core_release(unsupportedNextActionHandler));
    }
}

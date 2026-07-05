package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.RealRedirectResolver;
import com.stripe.android.payments.core.authentication.RedirectResolver;
import com.stripe.android.payments.core.authentication.VoucherNextActionHandler;
import com.stripe.android.payments.core.authentication.WebIntentNextActionHandler;
import com.stripe.android.payments.core.injection.NextActionHandlerModule;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NextActionHandlerModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\rH'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\rH'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\rH'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\rH'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H'¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerModule;", "", "<init>", "()V", "binds3DS1NextActionHandler", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "webIntentNextActionHandler", "Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;", "bindsRedirectNextActionHandler", "bindsAlipayRedirectNextActionHandler", "bindsMultibancoNextActionHandler", "voucherNextActionHandler", "Lcom/stripe/android/payments/core/authentication/VoucherNextActionHandler;", "bindsOxxoNextActionHandler", "bindsKonbiniNextActionHandler", "bindsBoletoNextActionHandler", "bindsCashAppRedirectNextActionHandler", "bindsSwishRedirectNextActionHandler", "bindsRedirectResolver", "Lcom/stripe/android/payments/core/authentication/RedirectResolver;", "impl", "Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class NextActionHandlerModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.SdkData.Use3DS1.class)
    public abstract PaymentNextActionHandler<StripeIntent> binds3DS1NextActionHandler(WebIntentNextActionHandler webIntentNextActionHandler);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.AlipayRedirect.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsAlipayRedirectNextActionHandler(WebIntentNextActionHandler webIntentNextActionHandler);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.DisplayBoletoDetails.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsBoletoNextActionHandler(VoucherNextActionHandler voucherNextActionHandler);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.CashAppRedirect.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsCashAppRedirectNextActionHandler(WebIntentNextActionHandler webIntentNextActionHandler);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.DisplayKonbiniDetails.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsKonbiniNextActionHandler(VoucherNextActionHandler voucherNextActionHandler);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.DisplayMultibancoDetails.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsMultibancoNextActionHandler(VoucherNextActionHandler voucherNextActionHandler);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.DisplayOxxoDetails.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsOxxoNextActionHandler(VoucherNextActionHandler voucherNextActionHandler);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.RedirectToUrl.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsRedirectNextActionHandler(WebIntentNextActionHandler webIntentNextActionHandler);

    @Binds
    public abstract RedirectResolver bindsRedirectResolver(RealRedirectResolver impl);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.SwishRedirect.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsSwishRedirectNextActionHandler(WebIntentNextActionHandler webIntentNextActionHandler);

    /* compiled from: NextActionHandlerModule.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J*\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion;", "", "<init>", "()V", "provideDefaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "context", "Landroid/content/Context;", "providePaymentRelayStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentRelayStarter;", "lazyRegistry", "Ldagger/Lazy;", "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "providePaymentBrowserAuthStarterFactory", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "defaultReturnUrl", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final DefaultReturnUrl provideDefaultReturnUrl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return DefaultReturnUrl.INSTANCE.create(context);
        }

        @Provides
        @Singleton
        public final Function1<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(final Lazy<DefaultPaymentNextActionHandlerRegistry> lazyRegistry) {
            Intrinsics.checkNotNullParameter(lazyRegistry, "lazyRegistry");
            return new Function1() { // from class: com.stripe.android.payments.core.injection.NextActionHandlerModule$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NextActionHandlerModule.Companion.providePaymentRelayStarterFactory$lambda$1(lazyRegistry, (AuthActivityStarterHost) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentRelayStarter providePaymentRelayStarterFactory$lambda$1(Lazy lazy, AuthActivityStarterHost host) {
            Intrinsics.checkNotNullParameter(host, "host");
            ActivityResultLauncher<PaymentRelayStarter.Args> paymentRelayLauncher$payments_core_release = ((DefaultPaymentNextActionHandlerRegistry) lazy.get()).getPaymentRelayLauncher$payments_core_release();
            if (paymentRelayLauncher$payments_core_release != null) {
                return new PaymentRelayStarter.Modern(paymentRelayLauncher$payments_core_release);
            }
            return new PaymentRelayStarter.Legacy(host);
        }

        @Provides
        @Singleton
        public final Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(final Lazy<DefaultPaymentNextActionHandlerRegistry> lazyRegistry, final DefaultReturnUrl defaultReturnUrl) {
            Intrinsics.checkNotNullParameter(lazyRegistry, "lazyRegistry");
            Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
            return new Function1() { // from class: com.stripe.android.payments.core.injection.NextActionHandlerModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NextActionHandlerModule.Companion.providePaymentBrowserAuthStarterFactory$lambda$3(lazyRegistry, defaultReturnUrl, (AuthActivityStarterHost) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentBrowserAuthStarter providePaymentBrowserAuthStarterFactory$lambda$3(Lazy lazy, DefaultReturnUrl defaultReturnUrl, AuthActivityStarterHost host) {
            Intrinsics.checkNotNullParameter(host, "host");
            ActivityResultLauncher<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher$payments_core_release = ((DefaultPaymentNextActionHandlerRegistry) lazy.get()).getPaymentBrowserAuthLauncher$payments_core_release();
            if (paymentBrowserAuthLauncher$payments_core_release != null) {
                return new PaymentBrowserAuthStarter.Modern(paymentBrowserAuthLauncher$payments_core_release);
            }
            return new PaymentBrowserAuthStarter.Legacy(host, defaultReturnUrl);
        }
    }
}

package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2NextActionHandler;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Stripe3DSNextActionHandlerModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\n"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule;", "", "<init>", "()V", "bindsStripe3DSNextActionHandler", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "stripe3ds2NextActionHandler", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {Stripe3ds2TransactionModule.class})
/* loaded from: classes6.dex */
public abstract class Stripe3DSNextActionHandlerModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @IntentAuthenticatorMap
    @Binds
    @IntoMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.SdkData.Use3DS2.class)
    public abstract PaymentNextActionHandler<StripeIntent> bindsStripe3DSNextActionHandler(Stripe3DS2NextActionHandler stripe3ds2NextActionHandler);

    /* compiled from: Stripe3DSNextActionHandlerModule.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule$Companion;", "", "<init>", "()V", "providePaymentAuthConfig", "Lcom/stripe/android/PaymentAuthConfig;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final PaymentAuthConfig providePaymentAuthConfig() {
            return PaymentAuthConfig.INSTANCE.get();
        }
    }
}

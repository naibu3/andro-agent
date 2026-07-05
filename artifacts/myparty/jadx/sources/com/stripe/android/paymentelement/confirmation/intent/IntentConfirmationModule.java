package com.stripe.android.paymentelement.confirmation.intent;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentConfirmationModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule;", "", "bindsIntentConfirmationInterceptor", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;", "defaultConfirmationHandlerFactory", "Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface IntentConfirmationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    IntentConfirmationInterceptor bindsIntentConfirmationInterceptor(DefaultIntentConfirmationInterceptor defaultConfirmationHandlerFactory);

    /* compiled from: IntentConfirmationModule.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007JG\u0010\n\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;", "", "<init>", "()V", "providesCreateIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "paymentElementCallbackIdentifier", "", "providesPreparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "providesIntentConfirmationDefinition", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "intentConfirmationInterceptor", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;", "stripePaymentLauncherAssistedFactory", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "statusBarColor", "", "paymentConfigurationProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Ljava/lang/Integer;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final CreateIntentCallback providesCreateIntentCallback(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(paymentElementCallbackIdentifier);
            if (paymentElementCallbacks != null) {
                return paymentElementCallbacks.getCreateIntentCallback();
            }
            return null;
        }

        @Provides
        public final PreparePaymentMethodHandler providesPreparePaymentMethodHandler(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(paymentElementCallbackIdentifier);
            if (paymentElementCallbacks != null) {
                return paymentElementCallbacks.getPreparePaymentMethodHandler();
            }
            return null;
        }

        @Provides
        @IntoSet
        public final ConfirmationDefinition<?, ?, ?, ?> providesIntentConfirmationDefinition(IntentConfirmationInterceptor intentConfirmationInterceptor, final StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, @Named(NamedConstantsKt.STATUS_BAR_COLOR) final Integer statusBarColor, final Provider<PaymentConfiguration> paymentConfigurationProvider) {
            Intrinsics.checkNotNullParameter(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            Intrinsics.checkNotNullParameter(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            Intrinsics.checkNotNullParameter(paymentConfigurationProvider, "paymentConfigurationProvider");
            return new IntentConfirmationDefinition(intentConfirmationInterceptor, new Function1() { // from class: com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntentConfirmationModule.Companion.providesIntentConfirmationDefinition$lambda$2(stripePaymentLauncherAssistedFactory, statusBarColor, paymentConfigurationProvider, (ActivityResultLauncher) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentLauncher providesIntentConfirmationDefinition$lambda$2(StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, Integer num, final Provider provider, ActivityResultLauncher hostActivityLauncher) {
            Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
            return stripePaymentLauncherAssistedFactory.create(new Function0() { // from class: com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IntentConfirmationModule.Companion.providesIntentConfirmationDefinition$lambda$2$lambda$0(provider);
                }
            }, new Function0() { // from class: com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IntentConfirmationModule.Companion.providesIntentConfirmationDefinition$lambda$2$lambda$1(provider);
                }
            }, num, true, hostActivityLauncher);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String providesIntentConfirmationDefinition$lambda$2$lambda$0(Provider provider) {
            return ((PaymentConfiguration) provider.get()).getPublishableKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String providesIntentConfirmationDefinition$lambda$2$lambda$1(Provider provider) {
            return ((PaymentConfiguration) provider.get()).getStripeAccountId();
        }
    }
}

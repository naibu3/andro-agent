package com.stripe.android.paymentelement.embedded;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.paymentelement.confirmation.ConfirmationConstantsKt;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.uicore.utils.StateFlowsKt;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedCommonModule.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule;", "", "bindsEventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "bindsErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;", "bindsCustomerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "repository", "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "bindsPaymentAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {StripeRepositoryModule.class, CoreCommonModule.class})
/* loaded from: classes5.dex */
public interface EmbeddedCommonModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    CustomerRepository bindsCustomerRepository(CustomerApiRepository repository);

    @Binds
    ErrorReporter bindsErrorReporter(RealErrorReporter errorReporter);

    @Singleton
    @Binds
    EventReporter bindsEventReporter(DefaultEventReporter eventReporter);

    @Binds
    AnalyticsRequestFactory bindsPaymentAnalyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

    /* compiled from: EmbeddedCommonModule.kt */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0007J\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0007J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0007J\b\u0010\"\u001a\u00020\u0007H\u0007J\u0014\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0001\u0010%\u001a\u00020\fH\u0007¨\u0006&"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/EmbeddedCommonModule$Companion;", "", "<init>", "()V", "provideEnabledLogging", "", "ioContext", "Lkotlin/coroutines/CoroutineContext;", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideProductUsageTokens", "", "", "provideDurationProvider", "Lcom/stripe/android/core/utils/DurationProvider;", "provideAllowsManualConfirmation", "providePaymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "appContext", "Landroid/content/Context;", "providePublishableKey", "Lkotlin/Function0;", "paymentConfiguration", "Ljavax/inject/Provider;", "provideStripeAccountId", "provideCustomerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "paymentMethodMetadataFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "provideUiContext", "providesAnalyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "paymentElementCallbackIdentifier", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Provides
        @Singleton
        @Named(ConfirmationConstantsKt.ALLOWS_MANUAL_CONFIRMATION)
        public final boolean provideAllowsManualConfirmation() {
            return true;
        }

        @Provides
        @Named(NamedConstantsKt.ENABLE_LOGGING)
        public final boolean provideEnabledLogging() {
            return false;
        }

        private Companion() {
        }

        @Provides
        @IOContext
        public final CoroutineContext ioContext() {
            return Dispatchers.getIO();
        }

        @Provides
        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Embedded;
        }

        @Provides
        @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> provideProductUsageTokens() {
            return SetsKt.setOf("EmbeddedPaymentElement");
        }

        @Provides
        public final DurationProvider provideDurationProvider() {
            return DefaultDurationProvider.INSTANCE.getInstance();
        }

        @Provides
        public final PaymentConfiguration providePaymentConfiguration(Context appContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            return PaymentConfiguration.INSTANCE.getInstance(appContext);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String providePublishableKey$lambda$0(Provider provider) {
            return ((PaymentConfiguration) provider.get()).getPublishableKey();
        }

        @Provides
        @Named("publishableKey")
        public final Function0<String> providePublishableKey(final Provider<PaymentConfiguration> paymentConfiguration) {
            Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
            return new Function0() { // from class: com.stripe.android.paymentelement.embedded.EmbeddedCommonModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EmbeddedCommonModule.Companion.providePublishableKey$lambda$0(paymentConfiguration);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String provideStripeAccountId$lambda$1(Provider provider) {
            return ((PaymentConfiguration) provider.get()).getStripeAccountId();
        }

        @Provides
        @Named(NamedConstantsKt.STRIPE_ACCOUNT_ID)
        public final Function0<String> provideStripeAccountId(final Provider<PaymentConfiguration> paymentConfiguration) {
            Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
            return new Function0() { // from class: com.stripe.android.paymentelement.embedded.EmbeddedCommonModule$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EmbeddedCommonModule.Companion.provideStripeAccountId$lambda$1(paymentConfiguration);
                }
            };
        }

        @Provides
        @Singleton
        public final CustomerStateHolder provideCustomerStateHolder(SavedStateHandle savedStateHandle, EmbeddedSelectionHolder selectionHolder, StateFlow<PaymentMethodMetadata> paymentMethodMetadataFlow) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
            Intrinsics.checkNotNullParameter(paymentMethodMetadataFlow, "paymentMethodMetadataFlow");
            return new CustomerStateHolder(StateFlowsKt.mapAsStateFlow(paymentMethodMetadataFlow, new Function1() { // from class: com.stripe.android.paymentelement.embedded.EmbeddedCommonModule$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmbeddedCommonModule.Companion.provideCustomerStateHolder$lambda$2((PaymentMethodMetadata) obj);
                }
            }), savedStateHandle, selectionHolder.getSelection());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CustomerMetadata.Permissions provideCustomerStateHolder$lambda$2(PaymentMethodMetadata paymentMethodMetadata) {
            CustomerMetadata customerMetadata;
            if (paymentMethodMetadata == null || (customerMetadata = paymentMethodMetadata.getCustomerMetadata()) == null) {
                return null;
            }
            return customerMetadata.getPermissions();
        }

        @UIContext
        @Provides
        @Singleton
        public final CoroutineContext provideUiContext() {
            return Dispatchers.getMain();
        }

        @Provides
        public final AnalyticEventCallback providesAnalyticEventCallback(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(paymentElementCallbackIdentifier);
            if (paymentElementCallbacks != null) {
                return paymentElementCallbacks.getAnalyticEventCallback();
            }
            return null;
        }
    }
}

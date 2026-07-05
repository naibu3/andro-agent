package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.RealLinkConfigurationCoordinator;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.gate.DefaultLinkGate;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import com.stripe.android.link.injection.LinkCommonModule;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.flowcontroller.DefaultPaymentSelectionUpdater;
import com.stripe.android.paymentsheet.flowcontroller.PaymentSelectionUpdater;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.DefaultCvcRecollectionInteractor;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository;
import com.stripe.android.paymentsheet.state.DefaultLinkAccountStatusProvider;
import com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader;
import com.stripe.android.paymentsheet.state.DefaultRetrieveCustomerEmail;
import com.stripe.android.paymentsheet.state.LinkAccountStatusProvider;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.RetrieveCustomerEmail;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetCommonModule.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u001cH'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u001fH'J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\"H'J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020%H'J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H'J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H'J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H'¨\u00063"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;", "", "<init>", "()V", "bindsEventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "bindsCustomerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "repository", "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "bindsErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;", "bindsStripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "impl", "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;", "bindsPaymentSheetLoader", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;", "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;", "bindsRetrieveCustomerEmail", "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;", "Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;", "bindsUserFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "Lcom/stripe/android/core/utils/RealUserFacingLogger;", "bindsLinkAccountStatusProvider", "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;", "bindsPaymentSheetUpdater", "Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultPaymentSelectionUpdater;", "bindsLinkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "Lcom/stripe/android/link/RealLinkConfigurationCoordinator;", "bindsAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "bindLinkGateFactory", "Lcom/stripe/android/link/gate/LinkGate$Factory;", "linkGateFactory", "Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;", "bindsCardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "defaultCardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {LinkCommonModule.class}, subcomponents = {LinkAnalyticsComponent.class, LinkComponent.class})
/* loaded from: classes6.dex */
public abstract class PaymentSheetCommonModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Binds
    public abstract LinkGate.Factory bindLinkGateFactory(DefaultLinkGate.Factory linkGateFactory);

    @Binds
    public abstract AnalyticsRequestFactory bindsAnalyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

    @Binds
    public abstract CardAccountRangeRepository.Factory bindsCardAccountRangeRepositoryFactory(DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory);

    @Binds
    public abstract CustomerRepository bindsCustomerRepository(CustomerApiRepository repository);

    @Binds
    public abstract ErrorReporter bindsErrorReporter(RealErrorReporter errorReporter);

    @Singleton
    @Binds
    public abstract EventReporter bindsEventReporter(DefaultEventReporter eventReporter);

    @Binds
    public abstract LinkAccountStatusProvider bindsLinkAccountStatusProvider(DefaultLinkAccountStatusProvider impl);

    @Binds
    public abstract LinkConfigurationCoordinator bindsLinkConfigurationCoordinator(RealLinkConfigurationCoordinator impl);

    @Binds
    public abstract PaymentElementLoader bindsPaymentSheetLoader(DefaultPaymentElementLoader impl);

    @Binds
    public abstract PaymentSelectionUpdater bindsPaymentSheetUpdater(DefaultPaymentSelectionUpdater impl);

    @Binds
    public abstract RetrieveCustomerEmail bindsRetrieveCustomerEmail(DefaultRetrieveCustomerEmail impl);

    @Binds
    public abstract ElementsSessionRepository bindsStripeIntentRepository(RealElementsSessionRepository impl);

    @Binds
    public abstract UserFacingLogger bindsUserFacingLogger(RealUserFacingLogger impl);

    /* compiled from: PaymentSheetCommonModule.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0007J\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J(\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0001\u0010 \u001a\u00020\u000eH\u0007¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;", "", "<init>", "()V", "providesLinkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "providePaymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "appContext", "Landroid/content/Context;", "providePublishableKey", "Lkotlin/Function0;", "", "paymentConfiguration", "Ljavax/inject/Provider;", "provideStripeAccountId", "provideEnabledLogging", "", "providePrefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "provideDurationProvider", "Lcom/stripe/android/core/utils/DurationProvider;", "providesCvcRecollectionInteractorFactory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionInteractor$Factory;", "providesAnalyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "paymentElementCallbackIdentifier", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @Singleton
        @Named(NamedConstantsKt.ENABLE_LOGGING)
        public final boolean provideEnabledLogging() {
            return false;
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final LinkAccountHolder providesLinkAccountHolder(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new LinkAccountHolder(savedStateHandle);
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
            return new Function0() { // from class: com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentSheetCommonModule.Companion.providePublishableKey$lambda$0(paymentConfiguration);
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
            return new Function0() { // from class: com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentSheetCommonModule.Companion.provideStripeAccountId$lambda$1(paymentConfiguration);
                }
            };
        }

        @Provides
        @Singleton
        public final Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(final Context appContext, @IOContext final CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            return new Function1() { // from class: com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PaymentSheetCommonModule.Companion.providePrefsRepositoryFactory$lambda$2(appContext, workContext, (PaymentSheet.CustomerConfiguration) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DefaultPrefsRepository providePrefsRepositoryFactory$lambda$2(Context context, CoroutineContext coroutineContext, PaymentSheet.CustomerConfiguration customerConfiguration) {
            return new DefaultPrefsRepository(context, customerConfiguration != null ? customerConfiguration.getId() : null, coroutineContext);
        }

        @Provides
        @Singleton
        public final DurationProvider provideDurationProvider() {
            return DefaultDurationProvider.INSTANCE.getInstance();
        }

        @Provides
        public final CvcRecollectionInteractor.Factory providesCvcRecollectionInteractorFactory() {
            return DefaultCvcRecollectionInteractor.Factory.INSTANCE;
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

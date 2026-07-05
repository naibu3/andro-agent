package com.stripe.android.customersheet.injection;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.core.os.LocaleListCompat;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.customersheet.CustomerSheetLoader;
import com.stripe.android.customersheet.DefaultCustomerSheetLoader;
import com.stripe.android.customersheet.analytics.CustomerSheetEventReporter;
import com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter;
import com.stripe.android.customersheet.injection.CustomerSheetViewModelModule;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.confirmation.ConfirmationConstantsKt;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.financialconnections.DefaultIsFinancialConnectionsAvailable;
import com.stripe.android.payments.financialconnections.IsFinancialConnectionsSdkAvailable;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CustomerSheetViewModelModule.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000fH'¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;", "", "bindsCustomerSheetEventReporter", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;", "impl", "Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;", "bindsCustomerSheetLoader", "Lcom/stripe/android/customersheet/CustomerSheetLoader;", "Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;", "bindsAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "bindsStripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface CustomerSheetViewModelModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    AnalyticsRequestFactory bindsAnalyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

    @Binds
    CustomerSheetEventReporter bindsCustomerSheetEventReporter(DefaultCustomerSheetEventReporter impl);

    @Binds
    CustomerSheetLoader bindsCustomerSheetLoader(DefaultCustomerSheetLoader impl);

    @Binds
    ElementsSessionRepository bindsStripeIntentRepository(RealElementsSessionRepository impl);

    /* compiled from: CustomerSheetViewModelModule.kt */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0007J\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0007J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020 H\u0007J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0#H\u0007J\b\u0010$\u001a\u00020\u0011H\u0007J\u0012\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\u0011H\u0007J\n\u0010(\u001a\u0004\u0018\u00010)H\u0007J\b\u0010*\u001a\u00020\u0011H\u0007J\n\u0010+\u001a\u0004\u0018\u00010,H\u0007R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;", "", "<init>", "()V", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "application", "Landroid/app/Application;", "providesPaymentElementCallbackIdentifier", "", "providesIsFinancialConnectionsAvailable", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;", "providePublishableKey", "Lkotlin/Function0;", "Ljavax/inject/Provider;", "provideStripeAccountId", NamedConstantsKt.IS_LIVE_MODE, "", "providesUserFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "providesErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "analyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "providesErrorReporter$paymentsheet_release", "resources", "Landroid/content/res/Resources;", "context", "Landroid/content/Context;", "ioContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "provideProductUsageTokens", "", "providesEnableLogging", "provideLogger", "Lcom/stripe/android/core/Logger;", NamedConstantsKt.ENABLE_LOGGING, "provideLocale", "Ljava/util/Locale;", "provideAllowsManualConfirmation", "savedPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PaymentSelection savedPaymentSelection = null;

        @Provides
        @Named(ConfirmationConstantsKt.ALLOWS_MANUAL_CONFIRMATION)
        public final boolean provideAllowsManualConfirmation() {
            return false;
        }

        @Provides
        @Named(NamedConstantsKt.ENABLE_LOGGING)
        public final boolean providesEnableLogging() {
            return false;
        }

        @Provides
        public final UserFacingLogger providesUserFacingLogger() {
            return null;
        }

        private Companion() {
        }

        @Provides
        public final PaymentConfiguration paymentConfiguration(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            return PaymentConfiguration.INSTANCE.getInstance(application);
        }

        @Provides
        @PaymentElementCallbackIdentifier
        public final String providesPaymentElementCallbackIdentifier() {
            return "CustomerSheet";
        }

        @Provides
        public final IsFinancialConnectionsSdkAvailable providesIsFinancialConnectionsAvailable() {
            return DefaultIsFinancialConnectionsAvailable.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String providePublishableKey$lambda$0(Provider provider) {
            return ((PaymentConfiguration) provider.get()).getPublishableKey();
        }

        @Provides
        @Named("publishableKey")
        public final Function0<String> providePublishableKey(final Provider<PaymentConfiguration> paymentConfiguration) {
            Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
            return new Function0() { // from class: com.stripe.android.customersheet.injection.CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheetViewModelModule.Companion.providePublishableKey$lambda$0(paymentConfiguration);
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
            return new Function0() { // from class: com.stripe.android.customersheet.injection.CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheetViewModelModule.Companion.provideStripeAccountId$lambda$1(paymentConfiguration);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean isLiveMode$lambda$2(Provider provider) {
            return StringsKt.startsWith$default(((PaymentConfiguration) provider.get()).getPublishableKey(), "pk_live", false, 2, (Object) null);
        }

        @Provides
        @Named(NamedConstantsKt.IS_LIVE_MODE)
        public final Function0<Boolean> isLiveMode(final Provider<PaymentConfiguration> paymentConfiguration) {
            Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
            return new Function0() { // from class: com.stripe.android.customersheet.injection.CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(CustomerSheetViewModelModule.Companion.isLiveMode$lambda$2(paymentConfiguration));
                }
            };
        }

        @Provides
        public final ErrorReporter providesErrorReporter$paymentsheet_release(AnalyticsRequestFactory analyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor) {
            Intrinsics.checkNotNullParameter(analyticsRequestFactory, "analyticsRequestFactory");
            Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
            return new RealErrorReporter(analyticsRequestExecutor, analyticsRequestFactory);
        }

        @Provides
        public final Resources resources(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            Resources resources = application.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return resources;
        }

        @Provides
        public final Context context(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            return application;
        }

        @Provides
        @IOContext
        public final CoroutineContext ioContext() {
            return Dispatchers.getIO();
        }

        @UIContext
        @Provides
        public final CoroutineContext uiContext() {
            return Dispatchers.getMain();
        }

        @Provides
        @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> provideProductUsageTokens() {
            return SetsKt.setOf("CustomerSheet");
        }

        @Provides
        public final Logger provideLogger(@Named(NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging) {
            return Logger.INSTANCE.getInstance(enableLogging);
        }

        @Provides
        public final Locale provideLocale() {
            LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
            if (adjustedDefault.isEmpty()) {
                adjustedDefault = null;
            }
            if (adjustedDefault != null) {
                return adjustedDefault.get(0);
            }
            return null;
        }

        @Provides
        public final PaymentSelection savedPaymentSelection() {
            return savedPaymentSelection;
        }
    }
}

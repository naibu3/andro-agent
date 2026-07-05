package com.stripe.android.customersheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Calendar;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetDataCommonModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule;", "", "bindsCustomerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "repository", "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "bindsAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "bindsErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface CustomerSheetDataCommonModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    AnalyticsRequestFactory bindsAnalyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

    @Binds
    CustomerRepository bindsCustomerRepository(CustomerApiRepository repository);

    @Binds
    ErrorReporter bindsErrorReporter(RealErrorReporter errorReporter);

    /* compiled from: CustomerSheetDataCommonModule.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007J\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;", "", "<init>", "()V", "providePaymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "appContext", "Landroid/content/Context;", "providePublishableKey", "Lkotlin/Function0;", "", "paymentConfiguration", "Ljavax/inject/Provider;", "provideStripeAccountId", "providesProductUsage", "", "providesEnableLogging", "", "provideTimeProvider", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Provides
        public final Function0<Long> provideTimeProvider() {
            return new Function0() { // from class: com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(CustomerSheetDataCommonModule.Companion.provideTimeProvider$lambda$2());
                }
            };
        }

        @Provides
        @Named(NamedConstantsKt.ENABLE_LOGGING)
        public final boolean providesEnableLogging() {
            return false;
        }

        private Companion() {
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
            return new Function0() { // from class: com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheetDataCommonModule.Companion.providePublishableKey$lambda$0(paymentConfiguration);
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
            return new Function0() { // from class: com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheetDataCommonModule.Companion.provideStripeAccountId$lambda$1(paymentConfiguration);
                }
            };
        }

        @Provides
        @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> providesProductUsage() {
            return SetsKt.setOf("CustomerSheet");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long provideTimeProvider$lambda$2() {
            return Calendar.getInstance().getTimeInMillis();
        }
    }
}

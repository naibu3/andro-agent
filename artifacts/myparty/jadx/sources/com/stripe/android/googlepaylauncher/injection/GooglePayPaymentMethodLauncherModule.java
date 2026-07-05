package com.stripe.android.googlepaylauncher.injection;

import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayPaymentMethodLauncherModule.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherModule;", "", "<init>", "()V", "bindsGooglePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "defaultGooglePayRepository", "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "bindsPaymentsClientFactory", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "defaultPaymentsClientFactory", "Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;", "bindsAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "bindsErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "realErrorReporter", "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {GooglePayPaymentMethodLauncherViewModelSubcomponent.class})
/* loaded from: classes5.dex */
public abstract class GooglePayPaymentMethodLauncherModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Singleton
    @Binds
    public abstract AnalyticsRequestFactory bindsAnalyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

    @Singleton
    @Binds
    public abstract ErrorReporter bindsErrorReporter(RealErrorReporter realErrorReporter);

    @Singleton
    @Binds
    public abstract GooglePayRepository bindsGooglePayRepository(DefaultGooglePayRepository defaultGooglePayRepository);

    @Singleton
    @Binds
    public abstract PaymentsClientFactory bindsPaymentsClientFactory(DefaultPaymentsClientFactory defaultPaymentsClientFactory);

    /* compiled from: GooglePayPaymentMethodLauncherModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherModule$Companion;", "", "<init>", "()V", "providePaymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "paymentsClientFactory", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final PaymentsClient providePaymentsClient(GooglePayPaymentMethodLauncher.Config googlePayConfig, PaymentsClientFactory paymentsClientFactory) {
            Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
            Intrinsics.checkNotNullParameter(paymentsClientFactory, "paymentsClientFactory");
            return paymentsClientFactory.create(googlePayConfig.getEnvironment());
        }
    }
}

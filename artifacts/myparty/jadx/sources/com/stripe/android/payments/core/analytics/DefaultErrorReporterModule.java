package com.stripe.android.payments.core.analytics;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.DefaultErrorReporterModule;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ErrorReporter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule;", "", "bindRealErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;", "providesAnalyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "executor", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "providePaymentAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "requestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface DefaultErrorReporterModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    ErrorReporter bindRealErrorReporter(RealErrorReporter errorReporter);

    @Binds
    AnalyticsRequestFactory providePaymentAnalyticsRequestFactory(PaymentAnalyticsRequestFactory requestFactory);

    @Binds
    AnalyticsRequestExecutor providesAnalyticsRequestExecutor(DefaultAnalyticsRequestExecutor executor);

    /* compiled from: ErrorReporter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;", "", "<init>", "()V", "provideLogger", "Lcom/stripe/android/core/Logger;", "provideIoContext", "Lkotlin/coroutines/CoroutineContext;", "providePublishableKey", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final Logger provideLogger() {
            return Logger.INSTANCE.getInstance(false);
        }

        @Provides
        @IOContext
        public final CoroutineContext provideIoContext() {
            return Dispatchers.getIO();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String providePublishableKey$lambda$0(Context context) {
            return PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey();
        }

        @Provides
        @Named("publishableKey")
        public final Function0<String> providePublishableKey(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Function0() { // from class: com.stripe.android.payments.core.analytics.DefaultErrorReporterModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultErrorReporterModule.Companion.providePublishableKey$lambda$0(context);
                }
            };
        }
    }
}

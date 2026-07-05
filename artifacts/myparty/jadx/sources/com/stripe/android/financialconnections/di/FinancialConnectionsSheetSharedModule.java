package com.stripe.android.financialconnections.di;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.os.LocaleListCompat;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.AnalyticsRequestV2Storage;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.NetworkTypeDetector;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.core.utils.IsWorkManagerAvailable;
import com.stripe.android.core.utils.RealIsWorkManagerAvailable;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.domain.IsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.domain.RealIsNetworkingRelinkSession;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.repository.ConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.utils.FinancialConnectionsFraudDetectionRepositoryFactoryKt;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: FinancialConnectionsSheetSharedModule.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H'¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;", "", "bindsAnalyticsRequestV2Storage", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;", "impl", "Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;", "bindsAnalyticsRequestV2Executor", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;", "bindsConsumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;", "Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;", "bindsConsumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "bindsIsLinkWithStripe", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;", "bindsIsNetworkingRelinkSession", "Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;", "Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;", "bindsContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {FinancialConnectionsSheetConfigurationModule.class})
/* loaded from: classes5.dex */
public interface FinancialConnectionsSheetSharedModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @ActivityRetainedScope
    @Binds
    AnalyticsRequestV2Executor bindsAnalyticsRequestV2Executor(DefaultAnalyticsRequestV2Executor impl);

    @ActivityRetainedScope
    @Binds
    AnalyticsRequestV2Storage bindsAnalyticsRequestV2Storage(RealAnalyticsRequestV2Storage impl);

    @ActivityRetainedScope
    @Binds
    ConsumerSessionProvider bindsConsumerSessionProvider(RealConsumerSessionRepository impl);

    @ActivityRetainedScope
    @Binds
    ConsumerSessionRepository bindsConsumerSessionRepository(RealConsumerSessionRepository impl);

    @Binds
    Context bindsContext(Application application);

    @Binds
    IsLinkWithStripe bindsIsLinkWithStripe(RealIsLinkWithStripe impl);

    @Binds
    IsNetworkingRelinkSession bindsIsNetworkingRelinkSession(RealIsNetworkingRelinkSession impl);

    /* compiled from: FinancialConnectionsSheetSharedModule.kt */
    @Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0017\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\b\u000eJ#\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bH\u0007J2\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0007J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0007J\u0015\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6J\u001f\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001e2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b=J\r\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020B2\u0006\u00109\u001a\u00020\u001eH\u0001¢\u0006\u0002\bC¨\u0006D"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$Companion;", "", "<init>", "()V", "provideWorkContext", "Lkotlin/coroutines/CoroutineContext;", "provideUIContext", "provideLogger", "Lcom/stripe/android/core/Logger;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "provideLogger$financial_connections_release", "provideLocale", "Ljava/util/Locale;", "provideLocale$financial_connections_release", "providesApiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "publishableKey", "", com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID, "providesApiOptions$financial_connections_release", "providesJson", "Lkotlinx/serialization/json/Json;", "providesJson$financial_connections_release", "provideStripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "context", "logger", "providesAnalyticsTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Landroid/app/Application;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "locale", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "requestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;", "providesApiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "apiVersion", "Lcom/stripe/android/core/ApiVersion;", "provideConnectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;", "provideEventReporter", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "defaultFinancialConnectionsEventReporter", "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;", "providesAnalyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "executor", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "providesAnalyticsRequestExecutor$financial_connections_release", "provideAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "application", "provideAnalyticsRequestFactory$financial_connections_release", "providesIsWorkManagerAvailable", "Lcom/stripe/android/core/utils/IsWorkManagerAvailable;", "providesIsWorkManagerAvailable$financial_connections_release", "providesIoDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIoDispatcher$financial_connections_release", "provideFraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "provideFraudDetectionDataRepository$financial_connections_release", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: Access modifiers changed from: private */
        public static final String provideAnalyticsRequestFactory$lambda$2(String str) {
            return str;
        }

        private Companion() {
        }

        @Provides
        @ActivityRetainedScope
        @IOContext
        public final CoroutineContext provideWorkContext() {
            return Dispatchers.getIO();
        }

        @UIContext
        @Provides
        @ActivityRetainedScope
        public final CoroutineContext provideUIContext() {
            return Dispatchers.getMain();
        }

        @Provides
        @ActivityRetainedScope
        public final Logger provideLogger$financial_connections_release(@Named(com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging) {
            return Logger.INSTANCE.getInstance(enableLogging);
        }

        @Provides
        @ActivityRetainedScope
        public final Locale provideLocale$financial_connections_release() {
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
        @ActivityRetainedScope
        public final ApiRequest.Options providesApiOptions$financial_connections_release(@Named("publishableKey") String publishableKey, @Named(com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID) String stripeAccountId) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            return new ApiRequest.Options(publishableKey, stripeAccountId, null, 4, null);
        }

        @Provides
        @ActivityRetainedScope
        public final Json providesJson$financial_connections_release() {
            return JsonKt.Json$default(null, new Function1() { // from class: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetSharedModule.Companion.providesJson$lambda$1((JsonBuilder) obj);
                }
            }, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit providesJson$lambda$1(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setCoerceInputValues(true);
            Json.setIgnoreUnknownKeys(true);
            Json.setLenient(true);
            Json.setEncodeDefaults(true);
            return Unit.INSTANCE;
        }

        @Provides
        @ActivityRetainedScope
        public final StripeNetworkClient provideStripeNetworkClient(@IOContext CoroutineContext context, Logger logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new DefaultStripeNetworkClient(context, null, null, 0, logger, 14, null);
        }

        @Provides
        @ActivityRetainedScope
        public final FinancialConnectionsAnalyticsTracker providesAnalyticsTracker(Application context, GetOrFetchSync getOrFetchSync, Locale locale, FinancialConnectionsSheetConfiguration configuration, AnalyticsRequestV2Executor requestExecutor) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Locale locale2 = locale;
            Intrinsics.checkNotNull(locale2);
            return new FinancialConnectionsAnalyticsTrackerImpl(getOrFetchSync, configuration, locale2, context, requestExecutor);
        }

        @Provides
        @ActivityRetainedScope
        public final ApiRequest.Factory providesApiRequestFactory(ApiVersion apiVersion) {
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            return new ApiRequest.Factory(null, apiVersion.getCode(), null, 5, null);
        }

        @Provides
        @ActivityRetainedScope
        public final FinancialConnectionsRepository provideConnectionsRepository(FinancialConnectionsRepositoryImpl repository) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            return repository;
        }

        @Provides
        @ActivityRetainedScope
        public final FinancialConnectionsEventReporter provideEventReporter(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter) {
            Intrinsics.checkNotNullParameter(defaultFinancialConnectionsEventReporter, "defaultFinancialConnectionsEventReporter");
            return defaultFinancialConnectionsEventReporter;
        }

        @Provides
        @ActivityRetainedScope
        public final AnalyticsRequestExecutor providesAnalyticsRequestExecutor$financial_connections_release(DefaultAnalyticsRequestExecutor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            return executor;
        }

        @Provides
        @ActivityRetainedScope
        public final AnalyticsRequestFactory provideAnalyticsRequestFactory$financial_connections_release(Application application, @Named("publishableKey") final String publishableKey) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            String str = packageName;
            Application application2 = application;
            PackageInfo packageInfo = ContextUtils.INSTANCE.getPackageInfo(application2);
            Provider provider = new Provider() { // from class: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule$Companion$$ExternalSyntheticLambda1
                @Override // javax.inject.Provider
                public final Object get() {
                    return FinancialConnectionsSheetSharedModule.Companion.provideAnalyticsRequestFactory$lambda$2(publishableKey);
                }
            };
            final NetworkTypeDetector networkTypeDetector = new NetworkTypeDetector(application2);
            return new AnalyticsRequestFactory(packageManager, packageInfo, str, provider, new Provider() { // from class: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule$Companion$$ExternalSyntheticLambda2
                @Override // javax.inject.Provider
                public final Object get() {
                    return networkTypeDetector.invoke();
                }
            }, null, 32, null);
        }

        @Provides
        @ActivityRetainedScope
        public final IsWorkManagerAvailable providesIsWorkManagerAvailable$financial_connections_release(GetOrFetchSync getOrFetchSync) {
            Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
            return new RealIsWorkManagerAvailable(new FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1(getOrFetchSync, null));
        }

        @Provides
        @ActivityRetainedScope
        public final CoroutineDispatcher providesIoDispatcher$financial_connections_release() {
            return Dispatchers.getIO();
        }

        @Provides
        public final FraudDetectionDataRepository provideFraudDetectionDataRepository$financial_connections_release(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            return FinancialConnectionsFraudDetectionRepositoryFactoryKt.DefaultFraudDetectionDataRepository(application);
        }
    }
}

package com.stripe.android.shoppay.di;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.injection.StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory;
import com.stripe.android.paymentsheet.ShopPayHandlers;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.shoppay.ShopPayArgs;
import com.stripe.android.shoppay.ShopPayViewModel;
import com.stripe.android.shoppay.bridge.ConfirmationRequestJsonParser;
import com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler;
import com.stripe.android.shoppay.bridge.ECEShippingRateJsonParser;
import com.stripe.android.shoppay.bridge.HandleClickRequestJsonParser;
import com.stripe.android.shoppay.bridge.ShippingCalculationRequestJsonParser;
import com.stripe.android.shoppay.bridge.ShippingRateChangeRequestJsonParser;
import com.stripe.android.shoppay.di.ShopPayComponent;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class DaggerShopPayComponent {
    private DaggerShopPayComponent() {
    }

    public static ShopPayComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements ShopPayComponent.Builder {
        private Context context;
        private String paymentElementCallbackIdentifier;
        private Function0<String> publishableKeyProvider;
        private ShopPayArgs shopPayArgs;
        private Integer statusBarColor;
        private Function0<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public /* bridge */ /* synthetic */ ShopPayComponent.Builder publishableKeyProvider(Function0 function0) {
            return publishableKeyProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public /* bridge */ /* synthetic */ ShopPayComponent.Builder stripeAccountIdProvider(Function0 function0) {
            return stripeAccountIdProvider((Function0<String>) function0);
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public Builder statusBarColor(Integer num) {
            this.statusBarColor = num;
            return this;
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public Builder stripeAccountIdProvider(Function0<String> function0) {
            this.stripeAccountIdProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public Builder publishableKeyProvider(Function0<String> function0) {
            this.publishableKeyProvider = (Function0) Preconditions.checkNotNull(function0);
            return this;
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public Builder paymentElementCallbackIdentifier(String str) {
            this.paymentElementCallbackIdentifier = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public Builder shopPayArgs(ShopPayArgs shopPayArgs) {
            this.shopPayArgs = (ShopPayArgs) Preconditions.checkNotNull(shopPayArgs);
            return this;
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent.Builder
        public ShopPayComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.stripeAccountIdProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.publishableKeyProvider, Function0.class);
            Preconditions.checkBuilderRequirement(this.paymentElementCallbackIdentifier, String.class);
            Preconditions.checkBuilderRequirement(this.shopPayArgs, ShopPayArgs.class);
            return new ShopPayComponentImpl(new CoreCommonModule(), new CoroutineContextModule(), this.context, this.statusBarColor, this.stripeAccountIdProvider, this.publishableKeyProvider, this.paymentElementCallbackIdentifier, this.shopPayArgs);
        }
    }

    private static final class ShopPayComponentImpl implements ShopPayComponent {
        private final Context context;
        private final String paymentElementCallbackIdentifier;
        private Provider<String> paymentElementCallbackIdentifierProvider;
        private Provider<AnalyticEventCallback> provideAnalyticEventCallbackProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PreparePaymentMethodHandler> providePreparePaymentMethodHandlerProvider;
        private Provider<CoroutineContext> provideUIContextProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private final Function0<String> publishableKeyProvider;
        private final ShopPayArgs shopPayArgs;
        private final ShopPayComponentImpl shopPayComponentImpl;
        private final Function0<String> stripeAccountIdProvider;

        private ShopPayComponentImpl(CoreCommonModule coreCommonModule, CoroutineContextModule coroutineContextModule, Context context, Integer num, Function0<String> function0, Function0<String> function02, String str, ShopPayArgs shopPayArgs) {
            this.shopPayComponentImpl = this;
            this.shopPayArgs = shopPayArgs;
            this.paymentElementCallbackIdentifier = str;
            this.context = context;
            this.publishableKeyProvider = function02;
            this.stripeAccountIdProvider = function0;
            initialize(coreCommonModule, coroutineContextModule, context, num, function0, function02, str, shopPayArgs);
        }

        private ShippingRateChangeRequestJsonParser shippingRateChangeRequestJsonParser() {
            return new ShippingRateChangeRequestJsonParser(new ECEShippingRateJsonParser());
        }

        private ConfirmationRequestJsonParser confirmationRequestJsonParser() {
            return new ConfirmationRequestJsonParser(new ECEShippingRateJsonParser());
        }

        private ShopPayHandlers shopPayHandlers() {
            return ShopPayModule_Companion_ProvideShopPayHandlersFactory.provideShopPayHandlers(this.paymentElementCallbackIdentifier);
        }

        private DefaultShopPayBridgeHandler defaultShopPayBridgeHandler() {
            return new DefaultShopPayBridgeHandler(new HandleClickRequestJsonParser(), new ShippingCalculationRequestJsonParser(), shippingRateChangeRequestJsonParser(), confirmationRequestJsonParser(), this.shopPayArgs, shopPayHandlers());
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, ShopPayModule_Companion_ProvideProductUsageTokensFactory.provideProductUsageTokens());
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.get(), ShopPayModule_Companion_ProvideProductUsageTokensFactory.provideProductUsageTokens(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        private ApiRequest.Options options() {
            return new ApiRequest.Options(this.publishableKeyProvider, this.stripeAccountIdProvider);
        }

        private AnalyticsRequestV2Executor analyticsRequestV2Executor() {
            return StripeRepositoryModule_Companion_ProvidesAnalyticsRequestV2ExecutorFactory.providesAnalyticsRequestV2Executor(this.context, this.provideWorkContextProvider.get(), this.provideLoggerProvider.get());
        }

        private RealUserFacingLogger realUserFacingLogger() {
            return new RealUserFacingLogger(this.context);
        }

        private DefaultEventReporter defaultEventReporter() {
            return new DefaultEventReporter(this.context, ShopPayModule_Companion_ProvideEventReporterModeFactory.provideEventReporterMode(), defaultAnalyticsRequestExecutor(), analyticsRequestV2Executor(), paymentAnalyticsRequestFactory(), ShopPayModule_Companion_ProvideDurationProviderFactory.provideDurationProvider(), this.provideAnalyticEventCallbackProvider, this.provideWorkContextProvider.get(), ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory.provideIsStripeCardScanAvailable(), realUserFacingLogger());
        }

        private ErrorReporter errorReporter() {
            return ShopPayModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory.providesErrorReporter$paymentsheet_release(paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor());
        }

        private void initialize(CoreCommonModule coreCommonModule, CoroutineContextModule coroutineContextModule, Context context, Integer num, Function0<String> function0, Function0<String> function02, String str, ShopPayArgs shopPayArgs) {
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) ShopPayModule_Companion_ProvidesEnableLoggingFactory.create()));
            Factory factoryCreate = InstanceFactory.create(str);
            this.paymentElementCallbackIdentifierProvider = factoryCreate;
            this.providePreparePaymentMethodHandlerProvider = ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory.create((Provider<String>) factoryCreate);
            this.provideAnalyticEventCallbackProvider = ShopPayModule_Companion_ProvideAnalyticEventCallbackFactory.create(this.paymentElementCallbackIdentifierProvider);
            this.provideUIContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
        }

        @Override // com.stripe.android.shoppay.di.ShopPayComponent
        public ShopPayViewModel getViewModel() {
            return new ShopPayViewModel(defaultShopPayBridgeHandler(), stripeApiRepository(), options(), this.providePreparePaymentMethodHandlerProvider, defaultEventReporter(), errorReporter(), this.provideUIContextProvider.get());
        }
    }
}

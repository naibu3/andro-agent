package com.stripe.android.shoppay.di;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.PaymentSheetConstantsKt;
import com.stripe.android.paymentsheet.ShopPayHandlers;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.shoppay.bridge.ConfirmationRequest;
import com.stripe.android.shoppay.bridge.ConfirmationRequestJsonParser;
import com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler;
import com.stripe.android.shoppay.bridge.ECEShippingRate;
import com.stripe.android.shoppay.bridge.ECEShippingRateJsonParser;
import com.stripe.android.shoppay.bridge.HandleClickRequest;
import com.stripe.android.shoppay.bridge.HandleClickRequestJsonParser;
import com.stripe.android.shoppay.bridge.ShippingCalculationRequest;
import com.stripe.android.shoppay.bridge.ShippingCalculationRequestJsonParser;
import com.stripe.android.shoppay.bridge.ShippingRateChangeRequest;
import com.stripe.android.shoppay.bridge.ShippingRateChangeRequestJsonParser;
import com.stripe.android.shoppay.bridge.ShopPayBridgeHandler;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayModule.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 #2\u00020\u0001:\u0001#J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0011\u001a\u00020\u0015H'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u0011\u001a\u00020\u0018H'J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\u0011\u001a\u00020\u001bH'J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f2\u0006\u0010\u0011\u001a\u00020\u001eH'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H'¨\u0006$"}, d2 = {"Lcom/stripe/android/shoppay/di/ShopPayModule;", "", "bindBridgeHandler", "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;", "bridgeHandler", "Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;", "bindEventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "bindUserFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "logger", "Lcom/stripe/android/core/utils/RealUserFacingLogger;", "bindsHandleClickRequestJsonParser", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/shoppay/bridge/HandleClickRequest;", "parser", "Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;", "bindsShippingCalculationRequestJsonParser", "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;", "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;", "bindsShippingRateChangeRequestJsonParser", "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;", "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;", "bindsConfirmationRequestJsonParser", "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;", "Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;", "bindsECEShippingRateJsonParser", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;", "bindsAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {StripeRepositoryModule.class})
/* loaded from: classes6.dex */
public interface ShopPayModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    ShopPayBridgeHandler bindBridgeHandler(DefaultShopPayBridgeHandler bridgeHandler);

    @Binds
    EventReporter bindEventReporter(DefaultEventReporter eventReporter);

    @Binds
    UserFacingLogger bindUserFacingLogger(RealUserFacingLogger logger);

    @Binds
    AnalyticsRequestFactory bindsAnalyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

    @Binds
    ModelJsonParser<ConfirmationRequest> bindsConfirmationRequestJsonParser(ConfirmationRequestJsonParser parser);

    @Binds
    ModelJsonParser<ECEShippingRate> bindsECEShippingRateJsonParser(ECEShippingRateJsonParser parser);

    @Binds
    ModelJsonParser<HandleClickRequest> bindsHandleClickRequestJsonParser(HandleClickRequestJsonParser parser);

    @Binds
    ModelJsonParser<ShippingCalculationRequest> bindsShippingCalculationRequestJsonParser(ShippingCalculationRequestJsonParser parser);

    @Binds
    ModelJsonParser<ShippingRateChangeRequest> bindsShippingRateChangeRequestJsonParser(ShippingRateChangeRequestJsonParser parser);

    /* compiled from: ShopPayModule.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;", "", "<init>", "()V", "provideShopPayHandlers", "Lcom/stripe/android/paymentsheet/ShopPayHandlers;", "paymentElementCallbackIdentifier", "", "providePreparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "provideProductUsageTokens", "", "providesEnableLogging", "", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideDurationProvider", "Lcom/stripe/android/core/utils/DurationProvider;", "providesErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "analyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "providesErrorReporter$paymentsheet_release", "provideAnalyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "provideIsStripeCardScanAvailable", "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Provides
        @Named(NamedConstantsKt.ENABLE_LOGGING)
        public final boolean providesEnableLogging() {
            return false;
        }

        private Companion() {
        }

        @Provides
        public final ShopPayHandlers provideShopPayHandlers(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
            ShopPayHandlers shopPayHandlers;
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(paymentElementCallbackIdentifier);
            if (paymentElementCallbacks == null || (shopPayHandlers = paymentElementCallbacks.getShopPayHandlers()) == null) {
                throw new IllegalStateException("ShopPayHandlers not found");
            }
            return shopPayHandlers;
        }

        @Provides
        public final PreparePaymentMethodHandler providePreparePaymentMethodHandler(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(paymentElementCallbackIdentifier);
            if (paymentElementCallbacks != null) {
                return paymentElementCallbacks.getPreparePaymentMethodHandler();
            }
            return null;
        }

        @Provides
        @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> provideProductUsageTokens() {
            return SetsKt.setOf(PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER);
        }

        @Provides
        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Custom;
        }

        @Provides
        public final DurationProvider provideDurationProvider() {
            return DefaultDurationProvider.INSTANCE.getInstance();
        }

        @Provides
        public final ErrorReporter providesErrorReporter$paymentsheet_release(AnalyticsRequestFactory analyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor) {
            Intrinsics.checkNotNullParameter(analyticsRequestFactory, "analyticsRequestFactory");
            Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
            return new RealErrorReporter(analyticsRequestExecutor, analyticsRequestFactory);
        }

        @Provides
        public final AnalyticEventCallback provideAnalyticEventCallback(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(paymentElementCallbackIdentifier);
            if (paymentElementCallbacks != null) {
                return paymentElementCallbacks.getAnalyticEventCallback();
            }
            return null;
        }

        @Provides
        public final IsStripeCardScanAvailable provideIsStripeCardScanAvailable() {
            return new IsStripeCardScanAvailable() { // from class: com.stripe.android.shoppay.di.ShopPayModule$Companion$provideIsStripeCardScanAvailable$1
                @Override // com.stripe.android.ui.core.IsStripeCardScanAvailable
                public boolean invoke() {
                    return false;
                }
            };
        }
    }
}

package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import com.stripe.android.common.analytics.experiment.LoggableExperiment;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentelement.AnalyticEvent;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: DefaultEventReporter.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 ~2\u00020\u0001:\u0001~Bc\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\u001aH\u0016J\u0091\u0001\u00102\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u00105\u001a\u0002062\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u00107\u001a\u0002082\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u00109\u001a\b\u0012\u0004\u0012\u00020!0:2\u0006\u0010;\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010\u001a2\b\u0010=\u001a\u0004\u0018\u00010\u001a2\u0006\u0010>\u001a\u00020\u001a2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010F\u001a\u00020'H\u0016J\b\u0010G\u001a\u00020'H\u0016J\b\u0010H\u001a\u00020'H\u0016J\b\u0010I\u001a\u00020'H\u0016J\u0014\u0010J\u001a\u00020'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0014\u0010M\u001a\u00020'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0014\u0010N\u001a\u00020'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0014\u0010O\u001a\u00020'2\n\u0010K\u001a\u00060!j\u0002`LH\u0016J\u0010\u0010P\u001a\u00020'2\u0006\u0010K\u001a\u00020!H\u0016J\b\u0010Q\u001a\u00020'H\u0016J\u0010\u0010R\u001a\u00020'2\u0006\u00103\u001a\u000204H\u0016J\u0010\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020'2\u0006\u00103\u001a\u000204H\u0016J\u001a\u0010W\u001a\u00020'2\u0006\u00103\u001a\u0002042\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0018\u0010Z\u001a\u00020'2\u0006\u00103\u001a\u0002042\u0006\u0010C\u001a\u00020[H\u0016J\u0012\u0010\\\u001a\u00020'2\b\u0010]\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010^\u001a\u00020'2\u0006\u0010_\u001a\u00020!H\u0016J\b\u0010`\u001a\u00020'H\u0016J\b\u0010a\u001a\u00020'H\u0016J\u0018\u0010b\u001a\u00020'2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020UH\u0016J\u0012\u0010f\u001a\u00020'2\b\u0010e\u001a\u0004\u0018\u00010UH\u0016J\u001a\u0010g\u001a\u00020'2\b\u0010e\u001a\u0004\u0018\u00010U2\u0006\u0010C\u001a\u00020DH\u0016J\u0012\u0010h\u001a\u00020'2\b\u0010i\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010j\u001a\u00020'2\u0006\u0010k\u001a\u00020lH\u0016J\u001a\u0010m\u001a\u00020'2\b\u0010i\u001a\u0004\u0018\u00010!2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010n\u001a\u00020'H\u0016J\u0010\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020qH\u0016J\u0010\u0010r\u001a\u00020'2\u0006\u0010p\u001a\u00020sH\u0016J\b\u0010t\u001a\u00020'H\u0016J\b\u0010u\u001a\u00020'H\u0016J\u0010\u0010v\u001a\u00020'2\u0006\u0010w\u001a\u00020\u001aH\u0016J\u0010\u0010x\u001a\u00020'2\u0006\u0010p\u001a\u00020yH\u0002J\u0010\u0010z\u001a\u00020'2\u0006\u0010p\u001a\u00020yH\u0002J\u0010\u0010{\u001a\u00020'2\u0006\u0010p\u001a\u00020|H\u0002J\u0012\u0010}\u001a\u0004\u0018\u00010!2\u0006\u0010K\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u007f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "context", "Landroid/content/Context;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestV2Executor", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "durationProvider", "Lcom/stripe/android/core/utils/DurationProvider;", "analyticEventCallbackProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "isStripeCardScanAvailable", "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;", "logger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/utils/DurationProvider;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;Lcom/stripe/android/core/utils/UserFacingLogger;)V", "isDeferred", "", "isSpt", "linkEnabled", "linkMode", "Lcom/stripe/android/model/LinkMode;", "googlePaySupported", "currency", "", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "analyticsRequestV2Factory", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;", "onInit", "", "commonConfiguration", "Lcom/stripe/android/common/model/CommonConfiguration;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonColor", "configurationSpecificPayload", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;Z)V", "onLoadStarted", "initializedViaCompose", "onLoadSucceeded", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "linkDisplay", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "orderedLpms", "", "requireCvcRecollection", "hasDefaultPaymentMethod", "setAsDefaultEnabled", "paymentMethodOptionsSetupFutureUsage", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/model/LinkMode;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Ljava/lang/String;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/stripe/android/model/StripeIntent$Usage;)V", "onLoadFailed", "error", "", "onElementsSessionLoadFailed", "onDismiss", "onShowExistingPaymentOptions", "onShowManageSavedPaymentMethods", "onShowNewPaymentOptions", "onSelectPaymentMethod", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "onRemoveSavedPaymentMethod", "onPaymentMethodFormShown", "onPaymentMethodFormInteraction", "onPaymentMethodFormCompleted", "onCardNumberCompleted", "onSelectPaymentOption", "onDisallowedCardBrandEntered", "brand", "Lcom/stripe/android/model/CardBrand;", "onPressConfirmButton", "onPaymentSuccess", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "onPaymentFailure", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "onLpmSpecFailure", "errorMessage", "onAutofill", "type", "onShowEditablePaymentOption", "onHideEditablePaymentOption", "onBrandChoiceSelected", "source", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;", "selectedBrand", "onUpdatePaymentMethodSucceeded", "onUpdatePaymentMethodFailed", "onSetAsDefaultPaymentMethodSucceeded", "paymentMethodType", "onExperimentExposure", "experiment", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;", "onSetAsDefaultPaymentMethodFailed", "onCannotProperlyReturnFromLinkAndOtherLPMs", "onUsBankAccountFormEvent", "event", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;", "onAnalyticsEvent", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "onShopPayWebViewLoadAttempt", "onShopPayWebViewConfirmSuccess", "onShopPayWebViewCancelled", "didReceiveECEClick", "fireEvent", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "fireV2Event", "fireAnalyticEvent", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "determineLinkContextForPaymentMethodType", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultEventReporter implements EventReporter {

    @Deprecated
    public static final String CLIENT_ID = "stripe-mobile-sdk";

    @Deprecated
    public static final String ORIGIN = "stripe-mobile-sdk-android";
    private final Provider<AnalyticEventCallback> analyticEventCallbackProvider;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestV2Executor analyticsRequestV2Executor;
    private final AnalyticsRequestV2Factory analyticsRequestV2Factory;
    private String currency;
    private final DurationProvider durationProvider;
    private FinancialConnectionsAvailability financialConnectionsAvailability;
    private boolean googlePaySupported;
    private boolean isDeferred;
    private boolean isSpt;
    private final IsStripeCardScanAvailable isStripeCardScanAvailable;
    private boolean linkEnabled;
    private LinkMode linkMode;
    private final UserFacingLogger logger;
    private final EventReporter.Mode mode;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DefaultEventReporter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventReporter.CardBrandChoiceEventSource.values().length];
            try {
                iArr[EventReporter.CardBrandChoiceEventSource.Edit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventReporter.CardBrandChoiceEventSource.Add.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultEventReporter(Context context, EventReporter.Mode mode, AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestV2Executor analyticsRequestV2Executor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, DurationProvider durationProvider, Provider<AnalyticEventCallback> analyticEventCallbackProvider, @IOContext CoroutineContext workContext, IsStripeCardScanAvailable isStripeCardScanAvailable, UserFacingLogger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(analyticsRequestV2Executor, "analyticsRequestV2Executor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(durationProvider, "durationProvider");
        Intrinsics.checkNotNullParameter(analyticEventCallbackProvider, "analyticEventCallbackProvider");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(isStripeCardScanAvailable, "isStripeCardScanAvailable");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.mode = mode;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestV2Executor = analyticsRequestV2Executor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.durationProvider = durationProvider;
        this.analyticEventCallbackProvider = analyticEventCallbackProvider;
        this.workContext = workContext;
        this.isStripeCardScanAvailable = isStripeCardScanAvailable;
        this.logger = logger;
        this.analyticsRequestV2Factory = new AnalyticsRequestV2Factory(context, CLIENT_ID, ORIGIN, null, 8, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onInit(CommonConfiguration commonConfiguration, PaymentSheet.Appearance appearance, Boolean primaryButtonColor, PaymentSheetEvent.ConfigurationSpecificPayload configurationSpecificPayload, boolean isDeferred) {
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(configurationSpecificPayload, "configurationSpecificPayload");
        this.isDeferred = isDeferred;
        fireEvent(new PaymentSheetEvent.Init(this.mode, commonConfiguration, appearance, primaryButtonColor, configurationSpecificPayload, this.linkEnabled, this.googlePaySupported, isDeferred, this.isSpt, this.isStripeCardScanAvailable.invoke(), this.analyticEventCallbackProvider.get() != null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onLoadStarted(boolean initializedViaCompose) {
        DurationProvider.DefaultImpls.start$default(this.durationProvider, DurationProvider.Key.Loading, false, 2, null);
        fireEvent(new PaymentSheetEvent.LoadStarted(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, initializedViaCompose));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onLoadSucceeded(PaymentSelection paymentSelection, boolean linkEnabled, LinkMode linkMode, boolean googlePaySupported, PaymentSheet.LinkConfiguration.Display linkDisplay, String currency, PaymentElementLoader.InitializationMode initializationMode, FinancialConnectionsAvailability financialConnectionsAvailability, List<String> orderedLpms, boolean requireCvcRecollection, Boolean hasDefaultPaymentMethod, Boolean setAsDefaultEnabled, boolean paymentMethodOptionsSetupFutureUsage, StripeIntent.Usage setupFutureUsage) {
        Intrinsics.checkNotNullParameter(linkDisplay, "linkDisplay");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        Intrinsics.checkNotNullParameter(orderedLpms, "orderedLpms");
        this.currency = currency;
        this.linkEnabled = linkEnabled;
        this.linkMode = linkMode;
        this.isSpt = (initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent) && (((PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration().getIntentBehavior() instanceof PaymentSheet.IntentConfiguration.IntentBehavior.SharedPaymentToken);
        this.googlePaySupported = googlePaySupported;
        this.financialConnectionsAvailability = financialConnectionsAvailability;
        DurationProvider.DefaultImpls.start$default(this.durationProvider, DurationProvider.Key.Checkout, false, 2, null);
        fireEvent(new PaymentSheetEvent.LoadSucceeded(paymentSelection, initializationMode, orderedLpms, this.durationProvider.mo7239endLV8wdWc(DurationProvider.Key.Loading), linkMode, linkEnabled, this.isDeferred, this.isSpt, googlePaySupported, linkDisplay, financialConnectionsAvailability, requireCvcRecollection, hasDefaultPaymentMethod, setAsDefaultEnabled, setupFutureUsage, paymentMethodOptionsSetupFutureUsage, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onLoadFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(new PaymentSheetEvent.LoadFailed(this.durationProvider.mo7239endLV8wdWc(DurationProvider.Key.Loading), error, this.isDeferred, this.linkEnabled, this.isSpt, this.googlePaySupported, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onElementsSessionLoadFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(new PaymentSheetEvent.ElementsSessionLoadFailed(error, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        fireEvent(new PaymentSheetEvent.Dismiss(this.isDeferred, this.linkEnabled, this.isSpt, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowExistingPaymentOptions() {
        fireAnalyticEvent(new AnalyticEvent.PresentedSheet());
        fireEvent(new PaymentSheetEvent.ShowExistingPaymentOptions(this.mode, this.currency, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowManageSavedPaymentMethods() {
        fireEvent(new PaymentSheetEvent.ShowManagePaymentMethods(this.mode, this.currency, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowNewPaymentOptions() {
        fireAnalyticEvent(new AnalyticEvent.PresentedSheet());
        fireEvent(new PaymentSheetEvent.ShowNewPaymentOptions(this.mode, this.currency, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onSelectPaymentMethod(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        fireAnalyticEvent(new AnalyticEvent.SelectedPaymentMethodType(code));
        boolean z = this.isDeferred;
        boolean z2 = this.isSpt;
        fireEvent(new PaymentSheetEvent.SelectPaymentMethod(code, this.currency, determineLinkContextForPaymentMethodType(code), this.financialConnectionsAvailability, z, z2, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onRemoveSavedPaymentMethod(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        fireAnalyticEvent(new AnalyticEvent.RemovedSavedPaymentMethod(code));
        fireEvent(new PaymentSheetEvent.RemovePaymentOption(this.mode, code, this.currency, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentMethodFormShown(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        DurationProvider.DefaultImpls.start$default(this.durationProvider, DurationProvider.Key.ConfirmButtonClicked, false, 2, null);
        fireAnalyticEvent(new AnalyticEvent.DisplayedPaymentMethodForm(code));
        fireEvent(new PaymentSheetEvent.ShowPaymentOptionForm(code, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentMethodFormInteraction(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        fireAnalyticEvent(new AnalyticEvent.StartedInteractionWithPaymentMethodForm(code));
        fireEvent(new PaymentSheetEvent.PaymentOptionFormInteraction(code, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentMethodFormCompleted(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        fireAnalyticEvent(new AnalyticEvent.CompletedPaymentMethodForm(code));
        fireEvent(new PaymentSheetEvent.PaymentMethodFormCompleted(code, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onCardNumberCompleted() {
        fireEvent(new PaymentSheetEvent.CardNumberCompleted(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onSelectPaymentOption(PaymentSelection paymentSelection) {
        String strCode;
        Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
        if (PaymentSelectionKt.isSaved(paymentSelection) && (strCode = PaymentSheetEventKt.code(paymentSelection)) != null) {
            fireAnalyticEvent(new AnalyticEvent.SelectedSavedPaymentMethod(strCode));
        }
        fireEvent(new PaymentSheetEvent.SelectPaymentOption(this.mode, paymentSelection, this.currency, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDisallowedCardBrandEntered(CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        fireEvent(new PaymentSheetEvent.CardBrandDisallowed(brand, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPressConfirmButton(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
        Duration durationMo7239endLV8wdWc = this.durationProvider.mo7239endLV8wdWc(DurationProvider.Key.ConfirmButtonClicked);
        fireAnalyticEvent(new AnalyticEvent.TappedConfirmButton(PaymentSheetEventKt.code(paymentSelection)));
        fireEvent(new PaymentSheetEvent.PressConfirmButton(this.currency, durationMo7239endLV8wdWc, PaymentSheetEventKt.code(paymentSelection), PaymentSheetEventKt.linkContext(paymentSelection), this.financialConnectionsAvailability, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentSuccess(PaymentSelection paymentSelection, DeferredIntentConfirmationType deferredIntentConfirmationType) {
        PaymentSelection.Saved.WalletType walletType;
        PaymentSelection paymentSelection2;
        Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
        PaymentSelection.Saved saved = paymentSelection instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) paymentSelection : null;
        PaymentSelection paymentSelection3 = (saved == null || (walletType = saved.getWalletType()) == null || (paymentSelection2 = walletType.getPaymentSelection()) == null) ? paymentSelection : paymentSelection2;
        fireEvent(new PaymentSheetEvent.Payment(this.mode, PaymentSheetEvent.Payment.Result.Success.INSTANCE, this.durationProvider.mo7239endLV8wdWc(DurationProvider.Key.Checkout), paymentSelection3, this.currency, deferredIntentConfirmationType != null, this.isSpt, this.linkEnabled, this.googlePaySupported, deferredIntentConfirmationType, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onPaymentFailure(PaymentSelection paymentSelection, PaymentSheetConfirmationError error) {
        Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
        Intrinsics.checkNotNullParameter(error, "error");
        Duration durationMo7239endLV8wdWc = this.durationProvider.mo7239endLV8wdWc(DurationProvider.Key.Checkout);
        fireEvent(new PaymentSheetEvent.Payment(this.mode, new PaymentSheetEvent.Payment.Result.Failure(error), durationMo7239endLV8wdWc, paymentSelection, this.currency, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, null, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onLpmSpecFailure(String errorMessage) {
        fireEvent(new PaymentSheetEvent.LpmSerializeFailureEvent(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, errorMessage));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onAutofill(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        fireEvent(new PaymentSheetEvent.AutofillEvent(type, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShowEditablePaymentOption() {
        fireEvent(new PaymentSheetEvent.ShowEditablePaymentOption(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onHideEditablePaymentOption() {
        fireEvent(new PaymentSheetEvent.HideEditablePaymentOption(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onBrandChoiceSelected(EventReporter.CardBrandChoiceEventSource source, CardBrand selectedBrand) {
        PaymentSheetEvent.CardBrandSelected.Source source2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(selectedBrand, "selectedBrand");
        int i = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
        if (i == 1) {
            source2 = PaymentSheetEvent.CardBrandSelected.Source.Edit;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source2 = PaymentSheetEvent.CardBrandSelected.Source.Add;
        }
        fireEvent(new PaymentSheetEvent.CardBrandSelected(source2, selectedBrand, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onUpdatePaymentMethodSucceeded(CardBrand selectedBrand) {
        fireEvent(new PaymentSheetEvent.UpdatePaymentOptionSucceeded(selectedBrand, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onUpdatePaymentMethodFailed(CardBrand selectedBrand, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(new PaymentSheetEvent.UpdatePaymentOptionFailed(selectedBrand, error, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onSetAsDefaultPaymentMethodSucceeded(String paymentMethodType) {
        fireEvent(new PaymentSheetEvent.SetAsDefaultPaymentMethodSucceeded(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, paymentMethodType));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onExperimentExposure(LoggableExperiment experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        fireV2Event(new PaymentSheetEvent.ExperimentExposure(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, experiment));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onSetAsDefaultPaymentMethodFailed(String paymentMethodType, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(new PaymentSheetEvent.SetAsDefaultPaymentMethodFailed(error, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, paymentMethodType));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onCannotProperlyReturnFromLinkAndOtherLPMs() {
        fireEvent(new PaymentSheetEvent.CannotProperlyReturnFromLinkAndLPMs(this.mode));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onUsBankAccountFormEvent(USBankAccountFormViewModel.AnalyticsEvent event) {
        PaymentSheetEvent.BankAccountCollectorFinished bankAccountCollectorFinished;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof USBankAccountFormViewModel.AnalyticsEvent.Started) {
            bankAccountCollectorFinished = new PaymentSheetEvent.BankAccountCollectorStarted(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, this.financialConnectionsAvailability);
        } else {
            if (!(event instanceof USBankAccountFormViewModel.AnalyticsEvent.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            bankAccountCollectorFinished = new PaymentSheetEvent.BankAccountCollectorFinished((USBankAccountFormViewModel.AnalyticsEvent.Finished) event, this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, this.financialConnectionsAvailability);
        }
        fireEvent(bankAccountCollectorFinished);
    }

    /* compiled from: DefaultEventReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.DefaultEventReporter$onAnalyticsEvent$1", f = "DefaultEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.analytics.DefaultEventReporter$onAnalyticsEvent$1, reason: invalid class name and case insensitive filesystem */
    static final class C11241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11241(AnalyticsEvent analyticsEvent, Continuation<? super C11241> continuation) {
            super(2, continuation);
            this.$event = analyticsEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEventReporter.this.new C11241(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DefaultEventReporter.this.analyticsRequestExecutor.executeAsync(DefaultEventReporter.this.paymentAnalyticsRequestFactory.createRequest(this.$event, MapsKt.emptyMap()));
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onAnalyticsEvent(AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C11241(event, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShopPayWebViewLoadAttempt() {
        fireEvent(new PaymentSheetEvent.ShopPayWebviewLoadAttempt(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShopPayWebViewConfirmSuccess() {
        fireEvent(new PaymentSheetEvent.ShopPayWebviewConfirmSuccess(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onShopPayWebViewCancelled(boolean didReceiveECEClick) {
        fireEvent(new PaymentSheetEvent.ShopPayWebviewCancelled(this.isDeferred, this.isSpt, this.linkEnabled, this.googlePaySupported, didReceiveECEClick));
    }

    /* compiled from: DefaultEventReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireEvent$1", f = "DefaultEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireEvent$1, reason: invalid class name and case insensitive filesystem */
    static final class C11221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSheetEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11221(PaymentSheetEvent paymentSheetEvent, Continuation<? super C11221> continuation) {
            super(2, continuation);
            this.$event = paymentSheetEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEventReporter.this.new C11221(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AnalyticsRequestExecutor analyticsRequestExecutor = DefaultEventReporter.this.analyticsRequestExecutor;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = DefaultEventReporter.this.paymentAnalyticsRequestFactory;
                PaymentSheetEvent paymentSheetEvent = this.$event;
                analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(paymentSheetEvent, paymentSheetEvent.getParams()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void fireEvent(PaymentSheetEvent event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C11221(event, null), 3, null);
    }

    /* compiled from: DefaultEventReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireV2Event$1", f = "DefaultEventReporter.kt", i = {}, l = {651}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireV2Event$1, reason: invalid class name and case insensitive filesystem */
    static final class C11231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSheetEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11231(PaymentSheetEvent paymentSheetEvent, Continuation<? super C11231> continuation) {
            super(2, continuation);
            this.$event = paymentSheetEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEventReporter.this.new C11231(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DefaultEventReporter.this.analyticsRequestV2Executor.enqueue(AnalyticsRequestV2Factory.createRequest$default(DefaultEventReporter.this.analyticsRequestV2Factory, this.$event.getEventName(), this.$event.getParams(), false, 4, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fireV2Event(PaymentSheetEvent event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C11231(event, null), 3, null);
    }

    /* compiled from: DefaultEventReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireAnalyticEvent$1", f = "DefaultEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireAnalyticEvent$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnalyticEvent analyticEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = analyticEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEventReporter.this.new AnonymousClass1(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AnalyticEventCallback analyticEventCallback = (AnalyticEventCallback) DefaultEventReporter.this.analyticEventCallbackProvider.get();
                if (analyticEventCallback != null) {
                    AnalyticEvent analyticEvent = this.$event;
                    DefaultEventReporter defaultEventReporter = DefaultEventReporter.this;
                    try {
                        analyticEventCallback.onEvent(analyticEvent);
                    } catch (Throwable unused) {
                        defaultEventReporter.logger.logWarningWithoutPii("AnalyticEventCallback.onEvent() failed for event: " + analyticEvent);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void fireAnalyticEvent(AnalyticEvent event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(event, null), 3, null);
    }

    private final String determineLinkContextForPaymentMethodType(String code) {
        if (!Intrinsics.areEqual(code, "link")) {
            return null;
        }
        if (this.linkMode == LinkMode.LinkCardBrand) {
            return "link_card_brand";
        }
        return "instant_debits";
    }

    /* compiled from: DefaultEventReporter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$Companion;", "", "<init>", "()V", "CLIENT_ID", "", "ORIGIN", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

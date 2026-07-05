package com.stripe.android.payments.core.analytics;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.FraudDetectionErrorReporter;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.utils.MapUtilsKt;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorReporter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u0000 \r2\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;", "report", "", "errorEvent", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "additionalNonPiiParams", "", "", "reportFraudDetectionError", "error", "Companion", "ErrorEvent", "ExpectedErrorEvent", "UnexpectedErrorEvent", "SuccessEvent", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ErrorReporter extends FraudDetectionErrorReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ErrorReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ErrorEvent extends AnalyticsEvent {
    }

    void report(ErrorEvent errorEvent, StripeException stripeException, Map<String, String> additionalNonPiiParams);

    @Override // com.stripe.android.core.frauddetection.FraudDetectionErrorReporter
    void reportFraudDetectionError(StripeException error);

    /* compiled from: ErrorReporter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void report$default(ErrorReporter errorReporter, ErrorEvent errorEvent, StripeException stripeException, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
            }
            if ((i & 2) != 0) {
                stripeException = null;
            }
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            errorReporter.report(errorEvent, stripeException, map);
        }

        public static void reportFraudDetectionError(ErrorReporter errorReporter, StripeException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            report$default(errorReporter, ExpectedErrorEvent.FRAUD_DETECTION_API_FAILURE, error, null, 4, null);
        }
    }

    /* compiled from: ErrorReporter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;", "", "<init>", "()V", "createFallbackInstance", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "context", "Landroid/content/Context;", NamedConstantsKt.PRODUCT_USAGE, "", "", "getAdditionalParamsFromError", "", "error", "", "getAdditionalParamsFromStripeException", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ErrorReporter createFallbackInstance$default(Companion companion, Context context, Set set, int i, Object obj) {
            if ((i & 2) != 0) {
                set = SetsKt.emptySet();
            }
            return companion.createFallbackInstance(context, set);
        }

        public final ErrorReporter createFallbackInstance(Context context, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            DefaultErrorReporterComponent.Builder builder = DaggerDefaultErrorReporterComponent.builder();
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return builder.context(applicationContext).productUsage(productUsage).build().getErrorReporter();
        }

        public final Map<String, String> getAdditionalParamsFromError(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return error instanceof StripeException ? getAdditionalParamsFromStripeException((StripeException) error) : getAdditionalParamsFromStripeException(StripeException.INSTANCE.create(error));
        }

        public final Map<String, String> getAdditionalParamsFromStripeException(StripeException stripeException) {
            Intrinsics.checkNotNullParameter(stripeException, "stripeException");
            Integer numValueOf = stripeException.getStatusCode() == 0 ? null : Integer.valueOf(stripeException.getStatusCode());
            Pair[] pairArr = new Pair[5];
            pairArr[0] = TuplesKt.to("analytics_value", stripeException.analyticsValue());
            pairArr[1] = TuplesKt.to("status_code", numValueOf != null ? numValueOf.toString() : null);
            pairArr[2] = TuplesKt.to(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, stripeException.getRequestId());
            StripeError stripeError = stripeException.getStripeError();
            pairArr[3] = TuplesKt.to("error_type", stripeError != null ? stripeError.getType() : null);
            StripeError stripeError2 = stripeException.getStripeError();
            pairArr[4] = TuplesKt.to("error_code", stripeError2 != null ? stripeError2.getCode() : null);
            return MapUtilsKt.filterNotNullValues(MapsKt.mapOf(pairArr));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorReporter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "AUTH_WEB_VIEW_FAILURE", "AUTH_WEB_VIEW_NULL_ARGS", "GET_SAVED_PAYMENT_METHODS_FAILURE", "GOOGLE_PAY_IS_READY_API_CALL", "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE", "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE", "CUSTOMER_SHEET_ADAPTER_NOT_FOUND", "PLACES_FIND_AUTOCOMPLETE_ERROR", "PLACES_FETCH_PLACE_ERROR", "LINK_CREATE_PAYMENT_DETAILS_FAILURE", "LINK_SHARE_CARD_FAILURE", "LINK_LOG_OUT_FAILURE", "LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN", "LINK_NATIVE_FAILED_TO_ATTEST_REQUEST", "LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER", "PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", "PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS", "BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", "BROWSER_LAUNCHER_NULL_ARGS", "GOOGLE_PAY_FAILED", "FRAUD_DETECTION_API_FAILURE", "SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE", "EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", "CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", "EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", "CREATE_INTENT_CALLBACK_NULL", "PREPARE_PAYMENT_METHOD_HANDLER_NULL", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExpectedErrorEvent implements ErrorEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ExpectedErrorEvent[] $VALUES;
        private final String eventName;
        public static final ExpectedErrorEvent AUTH_WEB_VIEW_FAILURE = new ExpectedErrorEvent("AUTH_WEB_VIEW_FAILURE", 0, "payments.auth_web_view.failure");
        public static final ExpectedErrorEvent AUTH_WEB_VIEW_NULL_ARGS = new ExpectedErrorEvent("AUTH_WEB_VIEW_NULL_ARGS", 1, "payments.auth_web_view.null_args");
        public static final ExpectedErrorEvent GET_SAVED_PAYMENT_METHODS_FAILURE = new ExpectedErrorEvent("GET_SAVED_PAYMENT_METHODS_FAILURE", 2, "elements.customer_repository.get_saved_payment_methods_failure");
        public static final ExpectedErrorEvent GOOGLE_PAY_IS_READY_API_CALL = new ExpectedErrorEvent("GOOGLE_PAY_IS_READY_API_CALL", 3, "elements.google_pay_repository.is_ready_request_api_call_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE = new ExpectedErrorEvent("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", 4, "elements.customer_sheet.elements_session.load_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE = new ExpectedErrorEvent("CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE", 5, "elements.customer_sheet.customer_session.elements_session.load_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE = new ExpectedErrorEvent("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", 6, "elements.customer_sheet.payment_methods.load_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE = new ExpectedErrorEvent("CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE", 7, "elements.customer_sheet.payment_methods.refresh_failure");
        public static final ExpectedErrorEvent CUSTOMER_SHEET_ADAPTER_NOT_FOUND = new ExpectedErrorEvent("CUSTOMER_SHEET_ADAPTER_NOT_FOUND", 8, "elements.customer_sheet.customer_adapter.not_found");
        public static final ExpectedErrorEvent PLACES_FIND_AUTOCOMPLETE_ERROR = new ExpectedErrorEvent("PLACES_FIND_AUTOCOMPLETE_ERROR", 9, "address_element.find_autocomplete.error");
        public static final ExpectedErrorEvent PLACES_FETCH_PLACE_ERROR = new ExpectedErrorEvent("PLACES_FETCH_PLACE_ERROR", 10, "address_element.fetch_place.error");
        public static final ExpectedErrorEvent LINK_CREATE_PAYMENT_DETAILS_FAILURE = new ExpectedErrorEvent("LINK_CREATE_PAYMENT_DETAILS_FAILURE", 11, "link.create_new_card.create_payment_details_failure");
        public static final ExpectedErrorEvent LINK_SHARE_CARD_FAILURE = new ExpectedErrorEvent("LINK_SHARE_CARD_FAILURE", 12, "link.create_new_card.share_payment_details_failure");
        public static final ExpectedErrorEvent LINK_LOG_OUT_FAILURE = new ExpectedErrorEvent("LINK_LOG_OUT_FAILURE", 13, "link.log_out.failure");
        public static final ExpectedErrorEvent LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN = new ExpectedErrorEvent("LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN", 14, "link.native.failed_to_get_integrity_token");
        public static final ExpectedErrorEvent LINK_NATIVE_FAILED_TO_ATTEST_REQUEST = new ExpectedErrorEvent("LINK_NATIVE_FAILED_TO_ATTEST_REQUEST", 15, "link.native.failed_to_attest_request");
        public static final ExpectedErrorEvent LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER = new ExpectedErrorEvent("LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER", 16, "link.native.integrity.preparation_failed");
        public static final ExpectedErrorEvent PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS = new ExpectedErrorEvent("PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", 17, "payments.paymentlauncherconfirmation.null_args");
        public static final ExpectedErrorEvent PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS = new ExpectedErrorEvent("PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS", 18, "payments.paymentlauncherconfirmation.invalid_args");
        public static final ExpectedErrorEvent BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND = new ExpectedErrorEvent("BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", 19, "payments.browserlauncher.activity_not_found");
        public static final ExpectedErrorEvent BROWSER_LAUNCHER_NULL_ARGS = new ExpectedErrorEvent("BROWSER_LAUNCHER_NULL_ARGS", 20, "payments.browserlauncher.null_args");
        public static final ExpectedErrorEvent GOOGLE_PAY_FAILED = new ExpectedErrorEvent("GOOGLE_PAY_FAILED", 21, "google_pay.confirm.error");
        public static final ExpectedErrorEvent FRAUD_DETECTION_API_FAILURE = new ExpectedErrorEvent("FRAUD_DETECTION_API_FAILURE", 22, "fraud_detection_data_repository.api_failure");
        public static final ExpectedErrorEvent SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE = new ExpectedErrorEvent("SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE", 23, "stripe_android.saved_payment_method_radar_session_failure");
        public static final ExpectedErrorEvent EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL = new ExpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 24, "paymentsheet.external_payment_method.confirm_handler_is_null");
        public static final ExpectedErrorEvent CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL = new ExpectedErrorEvent("CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 25, "paymentsheet.custom_payment_method.confirm_handler_is_null");
        public static final ExpectedErrorEvent EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL = new ExpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", 26, "paymentsheet.external_payment_method.launcher_is_null");
        public static final ExpectedErrorEvent CREATE_INTENT_CALLBACK_NULL = new ExpectedErrorEvent("CREATE_INTENT_CALLBACK_NULL", 27, "paymentsheet.create_intent_callback.is_null");
        public static final ExpectedErrorEvent PREPARE_PAYMENT_METHOD_HANDLER_NULL = new ExpectedErrorEvent("PREPARE_PAYMENT_METHOD_HANDLER_NULL", 28, "paymentsheet.prepare_payment_method_handler.is_null");

        private static final /* synthetic */ ExpectedErrorEvent[] $values() {
            return new ExpectedErrorEvent[]{AUTH_WEB_VIEW_FAILURE, AUTH_WEB_VIEW_NULL_ARGS, GET_SAVED_PAYMENT_METHODS_FAILURE, GOOGLE_PAY_IS_READY_API_CALL, CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE, CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE, CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE, CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE, CUSTOMER_SHEET_ADAPTER_NOT_FOUND, PLACES_FIND_AUTOCOMPLETE_ERROR, PLACES_FETCH_PLACE_ERROR, LINK_CREATE_PAYMENT_DETAILS_FAILURE, LINK_SHARE_CARD_FAILURE, LINK_LOG_OUT_FAILURE, LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN, LINK_NATIVE_FAILED_TO_ATTEST_REQUEST, LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER, PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS, PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS, BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND, BROWSER_LAUNCHER_NULL_ARGS, GOOGLE_PAY_FAILED, FRAUD_DETECTION_API_FAILURE, SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE, EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL, CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL, EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL, CREATE_INTENT_CALLBACK_NULL, PREPARE_PAYMENT_METHOD_HANDLER_NULL};
        }

        public static EnumEntries<ExpectedErrorEvent> getEntries() {
            return $ENTRIES;
        }

        private ExpectedErrorEvent(String str, int i, String str2) {
            this.eventName = str2;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        static {
            ExpectedErrorEvent[] expectedErrorEventArr$values = $values();
            $VALUES = expectedErrorEventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(expectedErrorEventArr$values);
        }

        public static ExpectedErrorEvent valueOf(String str) {
            return (ExpectedErrorEvent) Enum.valueOf(ExpectedErrorEvent.class, str);
        }

        public static ExpectedErrorEvent[] values() {
            return (ExpectedErrorEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorReporter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010&\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006("}, d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "", "partialEventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPartialEventName", "()Ljava/lang/String;", "AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", "MISSING_CARDSCAN_DEPENDENCY", "MISSING_HOSTED_VOUCHER_URL", "MISSING_POLLING_AUTHENTICATOR", "LINK_INVALID_SESSION_STATE", "GOOGLE_PAY_JSON_REQUEST_PARSING", "GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", "GOOGLE_PAY_MISSING_INTENT_DATA", "FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", "FETCH_PLACE_WITHOUT_DEPENDENCY", "LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", "LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT", "LINK_WEB_FAILED_TO_PARSE_RESULT_URI", "LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST", "PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", "PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", "EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", "PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", "PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", "FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", "INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", "EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", "CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", "CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION", "CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD", "EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL", "WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM", "WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM", "INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnexpectedErrorEvent implements ErrorEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnexpectedErrorEvent[] $VALUES;
        private final String partialEventName;
        public static final UnexpectedErrorEvent AUTH_WEB_VIEW_BLANK_CLIENT_SECRET = new UnexpectedErrorEvent("AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", 0, "payments.auth_web_view.blank_client_secret");
        public static final UnexpectedErrorEvent MISSING_CARDSCAN_DEPENDENCY = new UnexpectedErrorEvent("MISSING_CARDSCAN_DEPENDENCY", 1, "cardscan.missing_dependency");
        public static final UnexpectedErrorEvent MISSING_HOSTED_VOUCHER_URL = new UnexpectedErrorEvent("MISSING_HOSTED_VOUCHER_URL", 2, "payments.missing_hosted_voucher_url");
        public static final UnexpectedErrorEvent MISSING_POLLING_AUTHENTICATOR = new UnexpectedErrorEvent("MISSING_POLLING_AUTHENTICATOR", 3, "payments.missing_polling_authenticator");
        public static final UnexpectedErrorEvent LINK_INVALID_SESSION_STATE = new UnexpectedErrorEvent("LINK_INVALID_SESSION_STATE", 4, "link.signup.failure.invalidSessionState");
        public static final UnexpectedErrorEvent GOOGLE_PAY_JSON_REQUEST_PARSING = new UnexpectedErrorEvent("GOOGLE_PAY_JSON_REQUEST_PARSING", 5, "google_pay_repository.is_ready_request_json_parsing_failure");
        public static final UnexpectedErrorEvent GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT = new UnexpectedErrorEvent("GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", 6, "google_pay.confirm.unexpected_result");
        public static final UnexpectedErrorEvent GOOGLE_PAY_MISSING_INTENT_DATA = new UnexpectedErrorEvent("GOOGLE_PAY_MISSING_INTENT_DATA", 7, "google_pay.on_result.missing_data");
        public static final UnexpectedErrorEvent FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY = new UnexpectedErrorEvent("FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", 8, "address_element.find_autocomplete.without_dependency");
        public static final UnexpectedErrorEvent FETCH_PLACE_WITHOUT_DEPENDENCY = new UnexpectedErrorEvent("FETCH_PLACE_WITHOUT_DEPENDENCY", 9, "address_element.fetch_place.without_dependency");
        public static final UnexpectedErrorEvent LINK_ATTACH_CARD_WITH_NULL_ACCOUNT = new UnexpectedErrorEvent("LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", 10, "link.create_new_card.missing_link_account");
        public static final UnexpectedErrorEvent LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT = new UnexpectedErrorEvent("LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT", 11, "link.create_new_bank_account.missing_link_account");
        public static final UnexpectedErrorEvent LINK_WEB_FAILED_TO_PARSE_RESULT_URI = new UnexpectedErrorEvent("LINK_WEB_FAILED_TO_PARSE_RESULT_URI", 12, "link.web.result.parsing_failed");
        public static final UnexpectedErrorEvent LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST = new UnexpectedErrorEvent("LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST", 13, "link.native.signup.failed_to_attest_request");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND = new UnexpectedErrorEvent("PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", 14, "paymentsheet.authenticators.not_found");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND = new UnexpectedErrorEvent("PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", 15, "paymentsheet.loader.elements_session.customer.not_found");
        public static final UnexpectedErrorEvent EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE = new UnexpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", 16, "elements.external_payment_methods_serializer.error");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT = new UnexpectedErrorEvent("PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", 17, "paymentsheet.no_payment_selection");
        public static final UnexpectedErrorEvent PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT = new UnexpectedErrorEvent("PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 18, "paymentsheet.invalid_payment_selection");
        public static final UnexpectedErrorEvent FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT = new UnexpectedErrorEvent("FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 19, "flow_controller.invalid_payment_selection");
        public static final UnexpectedErrorEvent INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION = new UnexpectedErrorEvent("INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", 20, "intent_confirmation_handler.invalid_payment_confirmation_option");
        public static final UnexpectedErrorEvent EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE = new UnexpectedErrorEvent("EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", 21, "paymentsheet.external_payment_method.unexpected_result_code");
        public static final UnexpectedErrorEvent CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION = new UnexpectedErrorEvent("CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", 22, "payments.cvc_recollection_unexpected_payment_selection");
        public static final UnexpectedErrorEvent CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION = new UnexpectedErrorEvent("CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION", 23, "customersheet.customer_session.attach_called");
        public static final UnexpectedErrorEvent CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD = new UnexpectedErrorEvent("CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD", 24, "customersheet.customer_session.elements_session.no_customer_field");
        public static final UnexpectedErrorEvent EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL = new UnexpectedErrorEvent("EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL", 25, "embedded.embedded_sheet_launcher.embedded_state_is_null");
        public static final UnexpectedErrorEvent WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM = new UnexpectedErrorEvent("WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM", 26, "wallet_buttons.wallet_arguments.null_on_confirm");
        public static final UnexpectedErrorEvent WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM = new UnexpectedErrorEvent("WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM", 27, "wallet_buttons.confirmation_arguments.null_on_confirm");
        public static final UnexpectedErrorEvent INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL = new UnexpectedErrorEvent("INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL", 28, "intent_confirmation_handler.passive_challenge.params_null");

        private static final /* synthetic */ UnexpectedErrorEvent[] $values() {
            return new UnexpectedErrorEvent[]{AUTH_WEB_VIEW_BLANK_CLIENT_SECRET, MISSING_CARDSCAN_DEPENDENCY, MISSING_HOSTED_VOUCHER_URL, MISSING_POLLING_AUTHENTICATOR, LINK_INVALID_SESSION_STATE, GOOGLE_PAY_JSON_REQUEST_PARSING, GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT, GOOGLE_PAY_MISSING_INTENT_DATA, FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY, FETCH_PLACE_WITHOUT_DEPENDENCY, LINK_ATTACH_CARD_WITH_NULL_ACCOUNT, LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT, LINK_WEB_FAILED_TO_PARSE_RESULT_URI, LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST, PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND, PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND, EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE, PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT, PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT, FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT, INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION, EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE, CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION, CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION, CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD, EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL, WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM, WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM, INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL};
        }

        public static EnumEntries<UnexpectedErrorEvent> getEntries() {
            return $ENTRIES;
        }

        private UnexpectedErrorEvent(String str, int i, String str2) {
            this.partialEventName = str2;
        }

        public final String getPartialEventName() {
            return this.partialEventName;
        }

        static {
            UnexpectedErrorEvent[] unexpectedErrorEventArr$values = $values();
            $VALUES = unexpectedErrorEventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(unexpectedErrorEventArr$values);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return "unexpected_error." + this.partialEventName;
        }

        public static UnexpectedErrorEvent valueOf(String str) {
            return (UnexpectedErrorEvent) Enum.valueOf(UnexpectedErrorEvent.class, str);
        }

        public static UnexpectedErrorEvent[] values() {
            return (UnexpectedErrorEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorReporter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS", "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS", "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS", "GET_SAVED_PAYMENT_METHODS_SUCCESS", "PLACES_FIND_AUTOCOMPLETE_SUCCESS", "PLACES_FETCH_PLACE_SUCCESS", "LINK_CREATE_CARD_SUCCESS", "LINK_LOG_OUT_SUCCESS", "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS", "EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS", "CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS", "FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING", "FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SuccessEvent implements ErrorEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SuccessEvent[] $VALUES;
        private final String eventName;
        public static final SuccessEvent CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS = new SuccessEvent("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS", 0, "elements.customer_sheet.elements_session.load_success");
        public static final SuccessEvent CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS = new SuccessEvent("CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS", 1, "elements.customer_sheet.customer_session.elements_session.load_success");
        public static final SuccessEvent CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS = new SuccessEvent("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS", 2, "elements.customer_sheet.payment_methods.load_success");
        public static final SuccessEvent GET_SAVED_PAYMENT_METHODS_SUCCESS = new SuccessEvent("GET_SAVED_PAYMENT_METHODS_SUCCESS", 3, "elements.customer_repository.get_saved_payment_methods_success");
        public static final SuccessEvent PLACES_FIND_AUTOCOMPLETE_SUCCESS = new SuccessEvent("PLACES_FIND_AUTOCOMPLETE_SUCCESS", 4, "address_element.find_autocomplete.success");
        public static final SuccessEvent PLACES_FETCH_PLACE_SUCCESS = new SuccessEvent("PLACES_FETCH_PLACE_SUCCESS", 5, "address_element.fetch_place.success");
        public static final SuccessEvent LINK_CREATE_CARD_SUCCESS = new SuccessEvent("LINK_CREATE_CARD_SUCCESS", 6, "link.create_new_card.success");
        public static final SuccessEvent LINK_LOG_OUT_SUCCESS = new SuccessEvent("LINK_LOG_OUT_SUCCESS", 7, "link.log_out.success");
        public static final SuccessEvent CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS = new SuccessEvent("CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS", 8, "elements.customer_sheet.payment_methods.refresh_success");
        public static final SuccessEvent EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS = new SuccessEvent("EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS", 9, "paymentsheet.external_payment_method.launch_success");
        public static final SuccessEvent CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS = new SuccessEvent("CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS", 10, "paymentsheet.custom_payment_method.launch_success");
        public static final SuccessEvent FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING = new SuccessEvent("FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING", 11, "paymentsheet.polling_for_create_intent_callback.found");
        public static final SuccessEvent FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING = new SuccessEvent("FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING", 12, "paymentsheet.polling_for_prepare_payment_method_handler.found");

        private static final /* synthetic */ SuccessEvent[] $values() {
            return new SuccessEvent[]{CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS, CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS, CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS, GET_SAVED_PAYMENT_METHODS_SUCCESS, PLACES_FIND_AUTOCOMPLETE_SUCCESS, PLACES_FETCH_PLACE_SUCCESS, LINK_CREATE_CARD_SUCCESS, LINK_LOG_OUT_SUCCESS, CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS, EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS, CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS, FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING, FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING};
        }

        public static EnumEntries<SuccessEvent> getEntries() {
            return $ENTRIES;
        }

        private SuccessEvent(String str, int i, String str2) {
            this.eventName = str2;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        static {
            SuccessEvent[] successEventArr$values = $values();
            $VALUES = successEventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(successEventArr$values);
        }

        public static SuccessEvent valueOf(String str) {
            return (SuccessEvent) Enum.valueOf(SuccessEvent.class, str);
        }

        public static SuccessEvent[] values() {
            return (SuccessEvent[]) $VALUES.clone();
        }
    }
}

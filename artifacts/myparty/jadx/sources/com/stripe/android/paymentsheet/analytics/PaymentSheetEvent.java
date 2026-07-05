package com.stripe.android.paymentsheet.analytics;

import com.facebook.GraphResponse;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginLogger;
import com.stripe.android.common.analytics.AnalyticsKtxKt;
import com.stripe.android.common.analytics.experiment.LoggableExperiment;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.LinkModeKt;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConstantsKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetLoadingExceptionKt;
import com.stripe.android.paymentsheet.utils.SelectionUtilsKt;
import com.stripe.android.utils.MapUtilsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.Duration;

/* compiled from: PaymentSheetEvent.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 :2\u00020\u0001:%\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000bX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\u000bX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0012\u0010\u0010\u001a\u00020\u000bX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR \u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\u0082\u0001#;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]¨\u0006^"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "<init>", "()V", NativeProtocol.WEB_DIALOG_PARAMS, "", "", "", "getParams", "()Ljava/util/Map;", "isDeferred", "", "()Z", "isSpt", "linkEnabled", "getLinkEnabled", "googlePaySupported", "getGooglePaySupported", "additionalParams", "getAdditionalParams", "standardParams", "isDecoupled", "ConfigurationSpecificPayload", "LoadStarted", "LoadSucceeded", "LoadFailed", "ElementsSessionLoadFailed", "Init", "Dismiss", "ShowNewPaymentOptions", "ShowExistingPaymentOptions", "ShowManagePaymentMethods", "SelectPaymentMethod", "RemovePaymentOption", "SelectPaymentOption", "ShowPaymentOptionForm", "PaymentOptionFormInteraction", "PaymentMethodFormCompleted", "CardNumberCompleted", "CardBrandDisallowed", "PressConfirmButton", "Payment", "LpmSerializeFailureEvent", "AutofillEvent", "ShowEditablePaymentOption", "HideEditablePaymentOption", "CardBrandSelected", "SetAsDefaultPaymentMethodSucceeded", "SetAsDefaultPaymentMethodFailed", "UpdatePaymentOptionSucceeded", "UpdatePaymentOptionFailed", "CannotProperlyReturnFromLinkAndLPMs", "BankAccountCollectorStarted", "BankAccountCollectorFinished", "ExperimentExposure", "ShopPayWebviewLoadAttempt", "ShopPayWebviewConfirmSuccess", "ShopPayWebviewCancelled", "Companion", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorFinished;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorStarted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CannotProperlyReturnFromLinkAndLPMs;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandDisallowed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardNumberCompleted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ElementsSessionLoadFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$HideEditablePaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadStarted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentMethodFormCompleted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentOptionFormInteraction;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$RemovePaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentMethod;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodSucceeded;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewCancelled;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewConfirmSuccess;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewLoadAttempt;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowEditablePaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowManagePaymentMethods;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowPaymentOptionForm;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionSucceeded;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentSheetEvent implements AnalyticsEvent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FC_SDK_AVAILABILITY = "fc_sdk_availability";
    public static final String FC_SDK_RESULT = "fc_sdk_result";
    public static final String FIELD_ALLOWS_PAYMENT_METHODS_REQUIRING_SHIPPING_ADDRESS = "allows_payment_methods_requiring_shipping_address";
    public static final String FIELD_ALLOWS_REMOVAL_OF_LAST_SAVED_PAYMENT_METHOD = "allows_removal_of_last_saved_payment_method";
    public static final String FIELD_ANALYTIC_CALLBACK_SET = "analytic_callback_set";
    public static final String FIELD_APPEARANCE = "appearance";
    public static final String FIELD_BILLING = "default_billing_details";
    public static final String FIELD_BILLING_DETAILS_COLLECTION_CONFIGURATION = "billing_details_collection_configuration";
    public static final String FIELD_CARD_BRAND_ACCEPTANCE = "card_brand_acceptance";
    public static final String FIELD_CARD_SCAN_AVAILABLE = "card_scan_available";
    public static final String FIELD_CBC_EVENT_SOURCE = "cbc_event_source";
    public static final String FIELD_COMPOSE = "compose";
    public static final String FIELD_CURRENCY = "currency";
    public static final String FIELD_CUSTOMER = "customer";
    public static final String FIELD_CUSTOMER_ACCESS_PROVIDER = "customer_access_provider";
    public static final String FIELD_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
    public static final String FIELD_DEFERRED_INTENT_CONFIRMATION_TYPE = "deferred_intent_confirmation_type";
    public static final String FIELD_DELAYED_PMS = "allows_delayed_payment_methods";
    public static final String FIELD_DURATION = "duration";
    public static final String FIELD_ERROR_CODE = "error_code";
    public static final String FIELD_ERROR_MESSAGE = "error_message";
    public static final String FIELD_EXTERNAL_PAYMENT_METHODS = "external_payment_methods";
    public static final String FIELD_GOOGLE_PAY = "googlepay";
    public static final String FIELD_GOOGLE_PAY_ENABLED = "google_pay_enabled";
    public static final String FIELD_HAS_DEFAULT_PAYMENT_METHOD = "has_default_payment_method";
    public static final String FIELD_INTENT_TYPE = "intent_type";
    public static final String FIELD_IS_DECOUPLED = "is_decoupled";
    public static final String FIELD_IS_SPT = "is_spt";
    public static final String FIELD_LINK_CONTEXT = "link_context";
    public static final String FIELD_LINK_DISPLAY = "link_display";
    public static final String FIELD_LINK_ENABLED = "link_enabled";
    public static final String FIELD_LINK_MODE = "link_mode";
    public static final String FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION = "mpe_config";
    public static final String FIELD_ORDERED_LPMS = "ordered_lpms";
    public static final String FIELD_PAYMENT_METHOD_LAYOUT = "payment_method_layout";
    public static final String FIELD_PAYMENT_METHOD_OPTIONS_SETUP_FUTURE_USAGE = "payment_method_options_setup_future_usage";
    public static final String FIELD_PAYMENT_METHOD_ORDER = "payment_method_order";
    public static final String FIELD_PAYMENT_METHOD_TYPE = "payment_method_type";
    public static final String FIELD_PREFERRED_NETWORKS = "preferred_networks";
    public static final String FIELD_PRIMARY_BUTTON_COLOR = "primary_button_color";
    public static final String FIELD_REQUIRE_CVC_RECOLLECTION = "require_cvc_recollection";
    public static final String FIELD_ROW_SELECTION_BEHAVIOR = "row_selection_behavior";
    public static final String FIELD_SELECTED_CARD_BRAND = "selected_card_brand";
    public static final String FIELD_SELECTED_LPM = "selected_lpm";
    public static final String FIELD_SETUP_FUTURE_USAGE = "setup_future_usage";
    public static final String FIELD_SET_AS_DEFAULT = "set_as_default";
    public static final String FIELD_SET_AS_DEFAULT_ENABLED = "set_as_default_enabled";
    public static final String INTENT_ID = "intent_id";
    public static final String INTENT_TYPE = "intent_type";
    public static final String LINK_ACCOUNT_SESSION_ID = "link_account_session_id";
    public static final int MAX_EXTERNAL_PAYMENT_METHODS = 10;
    public static final String VALUE_ADD_CBC_EVENT_SOURCE = "add";
    public static final String VALUE_CARD_BRAND = "brand";
    public static final String VALUE_EDIT_CBC_EVENT_SOURCE = "edit";

    public /* synthetic */ PaymentSheetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract Map<String, Object> getAdditionalParams();

    protected abstract boolean getGooglePaySupported();

    protected abstract boolean getLinkEnabled();

    /* renamed from: isDeferred */
    protected abstract boolean getIsDeferred();

    /* renamed from: isSpt */
    protected abstract boolean getIsSpt();

    private PaymentSheetEvent() {
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bR \u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;", "", "payload", "", "", "getPayload", "()Ljava/util/Map;", PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER, "Embedded", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$PaymentSheet;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConfigurationSpecificPayload {
        Map<String, Object> getPayload();

        /* compiled from: PaymentSheetEvent.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$PaymentSheet;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "payload", "", "", "", "getPayload", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PaymentSheet implements ConfigurationSpecificPayload {
            public static final int $stable = 8;
            private final PaymentSheet.Configuration configuration;

            /* renamed from: component1, reason: from getter */
            private final PaymentSheet.Configuration getConfiguration() {
                return this.configuration;
            }

            public static /* synthetic */ PaymentSheet copy$default(PaymentSheet paymentSheet, PaymentSheet.Configuration configuration, int i, Object obj) {
                if ((i & 1) != 0) {
                    configuration = paymentSheet.configuration;
                }
                return paymentSheet.copy(configuration);
            }

            public final PaymentSheet copy(PaymentSheet.Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new PaymentSheet(configuration);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentSheet) && Intrinsics.areEqual(this.configuration, ((PaymentSheet) other).configuration);
            }

            public int hashCode() {
                return this.configuration.hashCode();
            }

            public String toString() {
                return "PaymentSheet(configuration=" + this.configuration + ")";
            }

            public PaymentSheet(PaymentSheet.Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.configuration = configuration;
            }

            @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.ConfigurationSpecificPayload
            public Map<String, Object> getPayload() {
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_PAYMENT_METHOD_LAYOUT, AnalyticsKtxKt.toAnalyticsValue(this.configuration.getPaymentMethodLayout$paymentsheet_release()));
                return MapsKt.build(mapCreateMapBuilder);
            }
        }

        /* compiled from: PaymentSheetEvent.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\nHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$Embedded;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;", "isRowSelectionImmediateAction", "", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "<init>", "(ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)V", "payload", "", "", "", "getPayload", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Embedded implements ConfigurationSpecificPayload {
            public static final int $stable = 8;
            private final EmbeddedPaymentElement.Configuration configuration;
            private final boolean isRowSelectionImmediateAction;

            /* compiled from: PaymentSheetEvent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EmbeddedPaymentElement.FormSheetAction.values().length];
                    try {
                        iArr[EmbeddedPaymentElement.FormSheetAction.Continue.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EmbeddedPaymentElement.FormSheetAction.Confirm.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* renamed from: component1, reason: from getter */
            private final boolean getIsRowSelectionImmediateAction() {
                return this.isRowSelectionImmediateAction;
            }

            /* renamed from: component2, reason: from getter */
            private final EmbeddedPaymentElement.Configuration getConfiguration() {
                return this.configuration;
            }

            public static /* synthetic */ Embedded copy$default(Embedded embedded, boolean z, EmbeddedPaymentElement.Configuration configuration, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = embedded.isRowSelectionImmediateAction;
                }
                if ((i & 2) != 0) {
                    configuration = embedded.configuration;
                }
                return embedded.copy(z, configuration);
            }

            public final Embedded copy(boolean isRowSelectionImmediateAction, EmbeddedPaymentElement.Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new Embedded(isRowSelectionImmediateAction, configuration);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Embedded)) {
                    return false;
                }
                Embedded embedded = (Embedded) other;
                return this.isRowSelectionImmediateAction == embedded.isRowSelectionImmediateAction && Intrinsics.areEqual(this.configuration, embedded.configuration);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isRowSelectionImmediateAction) * 31) + this.configuration.hashCode();
            }

            public String toString() {
                return "Embedded(isRowSelectionImmediateAction=" + this.isRowSelectionImmediateAction + ", configuration=" + this.configuration + ")";
            }

            public Embedded(boolean z, EmbeddedPaymentElement.Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.isRowSelectionImmediateAction = z;
                this.configuration = configuration;
            }

            @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.ConfigurationSpecificPayload
            public Map<String, Object> getPayload() {
                String str;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                int i = WhenMappings.$EnumSwitchMapping$0[this.configuration.getFormSheetAction().ordinal()];
                if (i == 1) {
                    str = "continue";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "confirm";
                }
                mapCreateMapBuilder.put("form_sheet_action", str);
                mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_ROW_SELECTION_BEHAVIOR, this.isRowSelectionImmediateAction ? "immediate_action" : Constants.COLLATION_DEFAULT);
                mapCreateMapBuilder.put("embedded_view_displays_mandate_text", Boolean.valueOf(this.configuration.getEmbeddedViewDisplaysMandateText()));
                return MapsKt.build(mapCreateMapBuilder);
            }
        }
    }

    public final Map<String, Object> getParams() {
        return MapsKt.plus(standardParams(getIsDeferred(), getIsSpt(), getLinkEnabled(), getGooglePaySupported()), getAdditionalParams());
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadStarted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "initializedViaCompose", "<init>", "(ZZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadStarted extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public LoadStarted(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_load_started";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to(PaymentSheetEvent.FIELD_COMPOSE, Boolean.valueOf(z5)));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B£\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000eX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000eX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\u000eX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u000eX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010&0%X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\b*\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010)\u001a\u00020\b*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "orderedLpms", "", "", "duration", "Lkotlin/time/Duration;", "linkMode", "Lcom/stripe/android/model/LinkMode;", "linkEnabled", "", "isDeferred", "isSpt", "googlePaySupported", "linkDisplay", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "requireCvcRecollection", "hasDefaultPaymentMethod", "setAsDefaultEnabled", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "paymentMethodOptionsSetupFutureUsage", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/util/List;Lkotlin/time/Duration;Lcom/stripe/android/model/LinkMode;ZZZZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/model/StripeIntent$Usage;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLinkEnabled", "()Z", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "defaultAnalyticsValue", "getDefaultAnalyticsValue", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadSucceeded extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        public /* synthetic */ LoadSucceeded(PaymentSelection paymentSelection, PaymentElementLoader.InitializationMode initializationMode, List list, Duration duration, LinkMode linkMode, boolean z, boolean z2, boolean z3, boolean z4, PaymentSheet.LinkConfiguration.Display display, FinancialConnectionsAvailability financialConnectionsAvailability, boolean z5, Boolean bool, Boolean bool2, StripeIntent.Usage usage, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSelection, initializationMode, list, duration, linkMode, z, z2, z3, z4, display, financialConnectionsAvailability, z5, bool, bool2, usage, z6);
        }

        public /* synthetic */ LoadSucceeded(PaymentSelection paymentSelection, PaymentElementLoader.InitializationMode initializationMode, List list, Duration duration, LinkMode linkMode, boolean z, boolean z2, boolean z3, boolean z4, PaymentSheet.LinkConfiguration.Display display, FinancialConnectionsAvailability financialConnectionsAvailability, boolean z5, Boolean bool, Boolean bool2, StripeIntent.Usage usage, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSelection, initializationMode, list, duration, linkMode, z, z2, z3, z4, display, financialConnectionsAvailability, (i & 2048) != 0 ? false : z5, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : usage, z6, null);
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private LoadSucceeded(PaymentSelection paymentSelection, PaymentElementLoader.InitializationMode initializationMode, List<String> orderedLpms, Duration duration, LinkMode linkMode, boolean z, boolean z2, boolean z3, boolean z4, PaymentSheet.LinkConfiguration.Display linkDisplay, FinancialConnectionsAvailability financialConnectionsAvailability, boolean z5, Boolean bool, Boolean bool2, StripeIntent.Usage usage, boolean z6) {
            super(null == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            Intrinsics.checkNotNullParameter(orderedLpms, "orderedLpms");
            Intrinsics.checkNotNullParameter(linkDisplay, "linkDisplay");
            this.linkEnabled = z;
            this.isDeferred = z2;
            this.isSpt = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_load_succeeded";
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("duration", duration != null ? Float.valueOf(PaymentSheetEventKt.m8256getAsSecondsLRDsOJo(duration.getRawValue())) : null);
            mapCreateMapBuilder.put("selected_lpm", getDefaultAnalyticsValue(paymentSelection));
            mapCreateMapBuilder.put("intent_type", getDefaultAnalyticsValue(initializationMode));
            mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_ORDERED_LPMS, CollectionsKt.joinToString$default(orderedLpms, ",", null, null, 0, null, null, 62, null));
            mapCreateMapBuilder.put("require_cvc_recollection", Boolean.valueOf(z5));
            mapCreateMapBuilder.put(PaymentSheetEvent.FC_SDK_AVAILABILITY, PaymentSheetEventKt.toAnalyticsParam(financialConnectionsAvailability));
            mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_PAYMENT_METHOD_OPTIONS_SETUP_FUTURE_USAGE, Boolean.valueOf(z6));
            mapCreateMapBuilder.put("setup_future_usage", usage != null ? usage.getCode() : null);
            if (linkMode != null) {
                mapCreateMapBuilder.put("link_mode", LinkModeKt.getAnalyticsValue(linkMode));
            }
            if (bool2 != null) {
                mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_SET_AS_DEFAULT_ENABLED, Boolean.valueOf(bool2.booleanValue()));
            }
            mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_LINK_DISPLAY, linkDisplay.getAnalyticsValue$paymentsheet_release());
            if (Intrinsics.areEqual((Object) bool2, (Object) true) && bool != null) {
                mapCreateMapBuilder.put("has_default_payment_method", bool);
            }
            this.additionalParams = MapsKt.build(mapCreateMapBuilder);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        private final String getDefaultAnalyticsValue(PaymentSelection paymentSelection) {
            String str;
            if (paymentSelection instanceof PaymentSelection.GooglePay) {
                return "google_pay";
            }
            if (paymentSelection instanceof PaymentSelection.Link) {
                return "link";
            }
            if (!(paymentSelection instanceof PaymentSelection.Saved)) {
                return "none";
            }
            PaymentMethod.Type type = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().type;
            return (type == null || (str = type.code) == null) ? "saved" : str;
        }

        private final String getDefaultAnalyticsValue(PaymentElementLoader.InitializationMode initializationMode) {
            if (initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent) {
                PaymentSheet.IntentConfiguration.Mode mode = ((PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration().getMode();
                if (mode instanceof PaymentSheet.IntentConfiguration.Mode.Payment) {
                    return "deferred_payment_intent";
                }
                if (mode instanceof PaymentSheet.IntentConfiguration.Mode.Setup) {
                    return "deferred_setup_intent";
                }
                throw new NoWhenBranchMatchedException();
            }
            if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
                return "payment_intent";
            }
            if (initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent) {
                return "setup_intent";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\t\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0014\u0010\n\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "duration", "Lkotlin/time/Duration;", "error", "", "isDeferred", "", "linkEnabled", "isSpt", "googlePaySupported", "<init>", "(Lkotlin/time/Duration;Ljava/lang/Throwable;ZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadFailed extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        public /* synthetic */ LoadFailed(Duration duration, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
            this(duration, th, z, z2, z3, z4);
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private LoadFailed(Duration duration, Throwable error, boolean z, boolean z2, boolean z3, boolean z4) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(error, "error");
            this.isDeferred = z;
            this.linkEnabled = z2;
            this.isSpt = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_load_failed";
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("duration", duration != null ? Float.valueOf(PaymentSheetEventKt.m8256getAsSecondsLRDsOJo(duration.getRawValue())) : null);
            pairArr[1] = TuplesKt.to("error_message", PaymentSheetLoadingExceptionKt.getAsPaymentSheetLoadingException(error).getType());
            this.additionalParams = MapsKt.plus(MapsKt.mapOf(pairArr), ErrorReporter.INSTANCE.getAdditionalParamsFromError(error));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ElementsSessionLoadFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "error", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/Throwable;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ElementsSessionLoadFailed extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ElementsSessionLoadFailed(Throwable error, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_elements_session_load_failed";
            this.additionalParams = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("error_message", PaymentSheetLoadingExceptionKt.getAsPaymentSheetLoadingException(error).getType())), ErrorReporter.INSTANCE.getAdditionalParamsFromError(error));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0016R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonColor", "", "configurationSpecificPayload", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;", "linkEnabled", "googlePaySupported", "isDeferred", "isSpt", "isStripeCardScanAvailable", "isAnalyticEventCallbackSet", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;ZZZZZZ)V", "Ljava/lang/Boolean;", "getLinkEnabled", "()Z", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Init extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final PaymentSheet.Appearance appearance;
        private final CommonConfiguration configuration;
        private final ConfigurationSpecificPayload configurationSpecificPayload;
        private final boolean googlePaySupported;
        private final boolean isAnalyticEventCallbackSet;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean isStripeCardScanAvailable;
        private final boolean linkEnabled;
        private final EventReporter.Mode mode;
        private final Boolean primaryButtonColor;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Init(EventReporter.Mode mode, CommonConfiguration configuration, PaymentSheet.Appearance appearance, Boolean bool, ConfigurationSpecificPayload configurationSpecificPayload, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(configurationSpecificPayload, "configurationSpecificPayload");
            this.mode = mode;
            this.configuration = configuration;
            this.appearance = appearance;
            this.primaryButtonColor = bool;
            this.configurationSpecificPayload = configurationSpecificPayload;
            this.linkEnabled = z;
            this.googlePaySupported = z2;
            this.isDeferred = z3;
            this.isSpt = z4;
            this.isStripeCardScanAvailable = z5;
            this.isAnalyticEventCallbackSet = z6;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            String strJoinToString$default;
            if (this.mode != EventReporter.Mode.Embedded) {
                String[] strArr = new String[2];
                strArr[0] = this.configuration.getCustomer() != null ? "customer" : null;
                strArr[1] = this.configuration.getGooglePay() != null ? PaymentSheetEvent.FIELD_GOOGLE_PAY : null;
                List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) strArr);
                List list = listListOfNotNull.isEmpty() ? null : listListOfNotNull;
                if (list == null || (strJoinToString$default = CollectionsKt.joinToString$default(list, "_", null, null, 0, null, null, 62, null)) == null) {
                    strJoinToString$default = Constants.COLLATION_DEFAULT;
                }
                return PaymentSheetEvent.INSTANCE.formatEventName(this.mode, "init_" + strJoinToString$default);
            }
            return PaymentSheetEvent.INSTANCE.formatEventName(this.mode, "init");
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            PaymentSheet.CustomerAccessType accessType$paymentsheet_release;
            Pair[] pairArr = new Pair[17];
            pairArr[0] = TuplesKt.to("customer", Boolean.valueOf(this.configuration.getCustomer() != null));
            PaymentSheet.CustomerConfiguration customer = this.configuration.getCustomer();
            pairArr[1] = TuplesKt.to("customer_access_provider", (customer == null || (accessType$paymentsheet_release = customer.getAccessType$paymentsheet_release()) == null) ? null : accessType$paymentsheet_release.getAnalyticsValue());
            pairArr[2] = TuplesKt.to(PaymentSheetEvent.FIELD_GOOGLE_PAY, Boolean.valueOf(this.configuration.getGooglePay() != null));
            pairArr[3] = TuplesKt.to(PaymentSheetEvent.FIELD_PRIMARY_BUTTON_COLOR, this.primaryButtonColor);
            PaymentSheet.BillingDetails defaultBillingDetails = this.configuration.getDefaultBillingDetails();
            pairArr[4] = TuplesKt.to("default_billing_details", Boolean.valueOf(defaultBillingDetails != null && defaultBillingDetails.isFilledOut$paymentsheet_release()));
            pairArr[5] = TuplesKt.to(PaymentSheetEvent.FIELD_DELAYED_PMS, Boolean.valueOf(this.configuration.getAllowsDelayedPaymentMethods()));
            pairArr[6] = TuplesKt.to("appearance", AnalyticsKtxKt.toAnalyticsMap(this.appearance, this.mode == EventReporter.Mode.Embedded));
            pairArr[7] = TuplesKt.to("payment_method_order", this.configuration.getPaymentMethodOrder());
            pairArr[8] = TuplesKt.to(PaymentSheetEvent.FIELD_ALLOWS_PAYMENT_METHODS_REQUIRING_SHIPPING_ADDRESS, Boolean.valueOf(this.configuration.getAllowsPaymentMethodsRequiringShippingAddress()));
            pairArr[9] = TuplesKt.to("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.configuration.getAllowsRemovalOfLastSavedPaymentMethod()));
            pairArr[10] = TuplesKt.to("billing_details_collection_configuration", AnalyticsKtxKt.toAnalyticsMap(this.configuration.getBillingDetailsCollectionConfiguration()));
            pairArr[11] = TuplesKt.to("preferred_networks", AnalyticsKtxKt.toAnalyticsValue(this.configuration.getPreferredNetworks()));
            pairArr[12] = TuplesKt.to(PaymentSheetEvent.FIELD_CUSTOM_PAYMENT_METHODS, AnalyticsKtxKt.getCustomPaymentMethodsAnalyticsValue(this.configuration));
            pairArr[13] = TuplesKt.to(PaymentSheetEvent.FIELD_EXTERNAL_PAYMENT_METHODS, AnalyticsKtxKt.getExternalPaymentMethodsAnalyticsValue(this.configuration));
            pairArr[14] = TuplesKt.to("card_brand_acceptance", Boolean.valueOf(AnalyticsKtxKt.toAnalyticsValue(this.configuration.getCardBrandAcceptance())));
            pairArr[15] = TuplesKt.to(PaymentSheetEvent.FIELD_CARD_SCAN_AVAILABLE, Boolean.valueOf(this.isStripeCardScanAvailable));
            pairArr[16] = TuplesKt.to(PaymentSheetEvent.FIELD_ANALYTIC_CALLBACK_SET, Boolean.valueOf(this.isAnalyticEventCallbackSet));
            return MapsKt.mapOf(TuplesKt.to(PaymentSheetEvent.FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION, MapsKt.plus(MapsKt.mapOf(pairArr), this.configurationSpecificPayload.getPayload())));
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "linkEnabled", "isSpt", "googlePaySupported", "<init>", "(ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dismiss extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public Dismiss(boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.isDeferred = z;
            this.linkEnabled = z2;
            this.isSpt = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_dismiss";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\t\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\n\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "currency", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowNewPaymentOptions extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowNewPaymentOptions(EventReporter.Mode mode, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "sheet_newpm_show");
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("currency", str));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\t\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\n\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "currency", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowExistingPaymentOptions extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowExistingPaymentOptions(EventReporter.Mode mode, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "sheet_savedpm_show");
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("currency", str));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\t\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\n\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowManagePaymentMethods;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "currency", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowManagePaymentMethods extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowManagePaymentMethods(EventReporter.Mode mode, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "manage_savedpm_show");
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("currency", str));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0014\u0010\n\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\f\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentMethod;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "code", "", "currency", "linkContext", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectPaymentMethod extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentMethod(String code, String str, String str2, FinancialConnectionsAvailability financialConnectionsAvailability, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_carousel_payment_method_tapped";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("currency", str), TuplesKt.to("selected_lpm", code), TuplesKt.to(PaymentSheetEvent.FIELD_LINK_CONTEXT, str2), TuplesKt.to(PaymentSheetEvent.FC_SDK_AVAILABILITY, PaymentSheetEventKt.toAnalyticsParam(financialConnectionsAvailability)));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0014\u0010\t\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0014\u0010\n\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$RemovePaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "code", "", "currency", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemovePaymentOption extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemovePaymentOption(EventReporter.Mode mode, String code, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(code, "code");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "paymentoption_removed");
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("currency", str), TuplesKt.to("selected_lpm", code));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0014\u0010\n\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\f\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "currency", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectPaymentOption extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentOption(EventReporter.Mode mode, PaymentSelection paymentSelection, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "paymentoption_" + PaymentSheetEvent.INSTANCE.analyticsValue(paymentSelection) + "_select");
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("currency", str));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowPaymentOptionForm;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "code", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowPaymentOptionForm extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPaymentOptionForm(String code, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_form_shown";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("selected_lpm", code));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentOptionFormInteraction;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "code", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentOptionFormInteraction extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentOptionFormInteraction(String code, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_form_interacted";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("selected_lpm", code));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentMethodFormCompleted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "code", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethodFormCompleted extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodFormCompleted(String code, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_form_completed";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("selected_lpm", code));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardNumberCompleted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardNumberCompleted extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public CardNumberCompleted(boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_card_number_completed";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandDisallowed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/model/CardBrand;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardBrandDisallowed extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardBrandDisallowed(CardBrand cardBrand, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_disallowed_card_brand";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("brand", cardBrand.getCode()));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\n\u001a\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0014\u0010\f\u001a\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0014\u0010\r\u001a\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "currency", "", "duration", "Lkotlin/time/Duration;", "selectedLpm", "linkContext", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PressConfirmButton extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        public /* synthetic */ PressConfirmButton(String str, Duration duration, String str2, String str3, FinancialConnectionsAvailability financialConnectionsAvailability, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, duration, str2, str3, financialConnectionsAvailability, z, z2, z3, z4);
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PressConfirmButton(String str, Duration duration, String str2, String str3, FinancialConnectionsAvailability financialConnectionsAvailability, boolean z, boolean z2, boolean z3, boolean z4) {
            super(0 == true ? 1 : 0);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_confirm_button_tapped";
            Pair[] pairArr = new Pair[5];
            pairArr[0] = TuplesKt.to("duration", duration != null ? Float.valueOf(PaymentSheetEventKt.m8256getAsSecondsLRDsOJo(duration.getRawValue())) : null);
            pairArr[1] = TuplesKt.to("currency", str);
            pairArr[2] = TuplesKt.to("selected_lpm", str2);
            pairArr[3] = TuplesKt.to(PaymentSheetEvent.FIELD_LINK_CONTEXT, str3);
            pairArr[4] = TuplesKt.to(PaymentSheetEvent.FC_SDK_AVAILABILITY, PaymentSheetEventKt.toAnalyticsParam(financialConnectionsAvailability));
            this.additionalParams = MapUtilsKt.filterNotNullValues(MapsKt.mapOf(pairArr));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001 B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0010\u001a\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "duration", "Lkotlin/time/Duration;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "currency", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lkotlin/time/Duration;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Payment extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final DeferredIntentConfirmationType deferredIntentConfirmationType;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;
        private final Result result;

        public /* synthetic */ Payment(EventReporter.Mode mode, Result result, Duration duration, PaymentSelection paymentSelection, String str, boolean z, boolean z2, boolean z3, boolean z4, DeferredIntentConfirmationType deferredIntentConfirmationType, DefaultConstructorMarker defaultConstructorMarker) {
            this(mode, result, duration, paymentSelection, str, z, z2, z3, z4, deferredIntentConfirmationType);
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private Payment(EventReporter.Mode mode, Result result, Duration duration, PaymentSelection paymentSelection, String str, boolean z, boolean z2, boolean z3, boolean z4, DeferredIntentConfirmationType deferredIntentConfirmationType) {
            String eventName;
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            this.result = result;
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.deferredIntentConfirmationType = deferredIntentConfirmationType;
            if (mode != EventReporter.Mode.Embedded) {
                eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "payment_" + PaymentSheetEvent.INSTANCE.analyticsValue(paymentSelection) + "_" + result.getAnalyticsValue());
            } else {
                eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "payment_" + result.getAnalyticsValue());
            }
            this.eventName = eventName;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("duration", duration != null ? Float.valueOf(PaymentSheetEventKt.m8256getAsSecondsLRDsOJo(duration.getRawValue())) : null);
            mapCreateMapBuilder.put("currency", str);
            if (deferredIntentConfirmationType != null) {
                mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_DEFERRED_INTENT_CONFIRMATION_TYPE, deferredIntentConfirmationType.getValue());
            }
            if (result instanceof Result.Failure) {
                mapCreateMapBuilder.put("error_message", ((Result.Failure) result).getError().getAnalyticsValue());
                String errorCode = ((Result.Failure) result).getError().getErrorCode();
                if (errorCode != null) {
                    mapCreateMapBuilder.put("error_code", errorCode);
                }
            }
            mapCreateMapBuilder.put("selected_lpm", PaymentSheetEventKt.code(paymentSelection));
            String strLinkContext = PaymentSheetEventKt.linkContext(paymentSelection);
            if (strLinkContext != null) {
                mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_LINK_CONTEXT, strLinkContext);
            }
            Boolean setAsDefaultPaymentMethodFromPaymentSelection = SelectionUtilsKt.getSetAsDefaultPaymentMethodFromPaymentSelection(paymentSelection);
            if (setAsDefaultPaymentMethodFromPaymentSelection != null) {
                mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_SET_AS_DEFAULT, Boolean.valueOf(setAsDefaultPaymentMethodFromPaymentSelection.booleanValue()));
            }
            this.additionalParams = MapsKt.build(mapCreateMapBuilder);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        /* compiled from: PaymentSheetEvent.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "", "analyticsValue", "", "getAnalyticsValue", "()Ljava/lang/String;", "Success", "Failure", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface Result {
            String getAnalyticsValue();

            /* compiled from: PaymentSheetEvent.kt */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Success;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Success implements Result {
                public static final int $stable = 0;
                public static final Success INSTANCE = new Success();

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Success)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 1616357393;
                }

                public String toString() {
                    return "Success";
                }

                private Success() {
                }

                @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.Payment.Result
                public String getAnalyticsValue() {
                    return DefaultImpls.getAnalyticsValue(this);
                }
            }

            /* compiled from: PaymentSheetEvent.kt */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "error", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;)V", "getError", "()Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Failure implements Result {
                public static final int $stable = 0;
                private final PaymentSheetConfirmationError error;

                public static /* synthetic */ Failure copy$default(Failure failure, PaymentSheetConfirmationError paymentSheetConfirmationError, int i, Object obj) {
                    if ((i & 1) != 0) {
                        paymentSheetConfirmationError = failure.error;
                    }
                    return failure.copy(paymentSheetConfirmationError);
                }

                /* renamed from: component1, reason: from getter */
                public final PaymentSheetConfirmationError getError() {
                    return this.error;
                }

                public final Failure copy(PaymentSheetConfirmationError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    return new Failure(error);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "Failure(error=" + this.error + ")";
                }

                public Failure(PaymentSheetConfirmationError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.error = error;
                }

                @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.Payment.Result
                public String getAnalyticsValue() {
                    return DefaultImpls.getAnalyticsValue(this);
                }

                public final PaymentSheetConfirmationError getError() {
                    return this.error;
                }
            }

            /* compiled from: PaymentSheetEvent.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class DefaultImpls {
                public static String getAnalyticsValue(Result result) {
                    if (result instanceof Success) {
                        return GraphResponse.SUCCESS_KEY;
                    }
                    if (result instanceof Failure) {
                        return LoginLogger.EVENT_EXTRAS_FAILURE;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "errorMessage", "", "<init>", "(ZZZZLjava/lang/String;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", "getErrorMessage", "()Ljava/lang/String;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LpmSerializeFailureEvent extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String errorMessage;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public LpmSerializeFailureEvent(boolean z, boolean z2, boolean z3, boolean z4, String str) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.errorMessage = str;
            this.eventName = "luxe_serialize_failure";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("error_message", str));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000e\u001a\u00020\u0003*\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "type", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", "toSnakeCase", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AutofillEvent extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutofillEvent(String type, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "autofill_" + toSnakeCase(type);
            this.additionalParams = MapsKt.emptyMap();
        }

        private final String toSnakeCase(String str) {
            String lowerCase = new Regex("(?<=.)(?=\\p{Upper})").replace(str, "_").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowEditablePaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowEditablePaymentOption extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public ShowEditablePaymentOption(boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_open_edit_screen";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$HideEditablePaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HideEditablePaymentOption extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public HideEditablePaymentOption(boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_cancel_edit_screen";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\t\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\n\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "source", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;", "selectedBrand", "Lcom/stripe/android/model/CardBrand;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;Lcom/stripe/android/model/CardBrand;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "Source", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardBrandSelected extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardBrandSelected(Source source, CardBrand selectedBrand, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(selectedBrand, "selectedBrand");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_cbc_selected";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("cbc_event_source", source.getValue()), TuplesKt.to("selected_card_brand", selectedBrand.getCode()));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheetEvent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected$Source;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Edit", "Add", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Source {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            private final String value;
            public static final Source Edit = new Source("Edit", 0, "edit");
            public static final Source Add = new Source("Add", 1, "add");

            private static final /* synthetic */ Source[] $values() {
                return new Source[]{Edit, Add};
            }

            public static EnumEntries<Source> getEntries() {
                return $ENTRIES;
            }

            private Source(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                Source[] sourceArr$values = $values();
                $VALUES = sourceArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(sourceArr$values);
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodSucceeded;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "paymentMethodType", "", "<init>", "(ZZZZLjava/lang/String;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", "getPaymentMethodType", "()Ljava/lang/String;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SetAsDefaultPaymentMethodSucceeded extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;
        private final String paymentMethodType;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        public SetAsDefaultPaymentMethodSucceeded(boolean z, boolean z2, boolean z3, boolean z4, String str) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.paymentMethodType = str;
            this.eventName = "mc_set_default_payment_method";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("payment_method_type", str));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "error", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "paymentMethodType", "", "<init>", "(Ljava/lang/Throwable;ZZZZLjava/lang/String;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SetAsDefaultPaymentMethodFailed extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetAsDefaultPaymentMethodFailed(Throwable error, boolean z, boolean z2, boolean z3, boolean z4, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_set_default_payment_method_failed";
            this.additionalParams = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("error_message", error.getMessage()), TuplesKt.to("payment_method_type", str)), ErrorReporter.INSTANCE.getAdditionalParamsFromError(error));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionSucceeded;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "selectedBrand", "Lcom/stripe/android/model/CardBrand;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/model/CardBrand;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatePaymentOptionSucceeded extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public UpdatePaymentOptionSucceeded(CardBrand cardBrand, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_update_card";
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            if (cardBrand != null) {
                mapCreateMapBuilder.put("selected_card_brand", cardBrand.getCode());
            }
            this.additionalParams = MapsKt.build(mapCreateMapBuilder);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\b\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\t\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\n\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionFailed;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "selectedBrand", "Lcom/stripe/android/model/CardBrand;", "error", "", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatePaymentOptionFailed extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePaymentOptionFailed(CardBrand cardBrand, Throwable error, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_update_card_failed";
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            if (cardBrand != null) {
                mapCreateMapBuilder.put("selected_card_brand", cardBrand.getCode());
            }
            mapCreateMapBuilder.put("error_message", error.getMessage());
            this.additionalParams = MapsKt.plus(MapsKt.build(mapCreateMapBuilder), ErrorReporter.INSTANCE.getAdditionalParamsFromError(error));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u0007X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u0007X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CannotProperlyReturnFromLinkAndLPMs;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "linkEnabled", "", "getLinkEnabled", "()Z", "isDeferred", "googlePaySupported", "getGooglePaySupported", "isSpt", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CannotProperlyReturnFromLinkAndLPMs extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CannotProperlyReturnFromLinkAndLPMs(EventReporter.Mode mode) {
            super(null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.eventName = PaymentSheetEvent.INSTANCE.formatEventName(mode, "cannot_return_from_link_and_lpms");
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorStarted;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "<init>", "(ZZZZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BankAccountCollectorStarted extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public BankAccountCollectorStarted(boolean z, boolean z2, boolean z3, boolean z4, FinancialConnectionsAvailability financialConnectionsAvailability) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "stripe_android.bankaccountcollector.started";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to(PaymentSheetEvent.FC_SDK_AVAILABILITY, PaymentSheetEventKt.toAnalyticsParam(financialConnectionsAvailability)));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u0011*\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorFinished;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "event", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;ZZZZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentIntentType", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BankAccountCollectorFinished extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BankAccountCollectorFinished(USBankAccountFormViewModel.AnalyticsEvent.Finished event, boolean z, boolean z2, boolean z3, boolean z4, FinancialConnectionsAvailability financialConnectionsAvailability) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(event, "event");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "stripe_android.bankaccountcollector.finished";
            Pair[] pairArr = new Pair[5];
            pairArr[0] = TuplesKt.to(PaymentSheetEvent.FC_SDK_AVAILABILITY, PaymentSheetEventKt.toAnalyticsParam(financialConnectionsAvailability));
            StripeIntent intent = event.getIntent();
            pairArr[1] = TuplesKt.to(PaymentSheetEvent.INTENT_ID, intent != null ? intent.getId() : null);
            pairArr[2] = TuplesKt.to("intent_type", paymentIntentType(event));
            pairArr[3] = TuplesKt.to(PaymentSheetEvent.LINK_ACCOUNT_SESSION_ID, event.getLinkAccountSessionId());
            pairArr[4] = TuplesKt.to(PaymentSheetEvent.FC_SDK_RESULT, event.getResult());
            this.additionalParams = MapsKt.mapOf(pairArr);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        private final String paymentIntentType(USBankAccountFormViewModel.AnalyticsEvent.Finished finished) {
            if (getIsDeferred()) {
                return "deferred";
            }
            if (finished.getIntent() instanceof PaymentIntent) {
                return "payment";
            }
            if (finished.getIntent() instanceof SetupIntent) {
                return "setup";
            }
            return null;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "experiment", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;", "<init>", "(ZZZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment;)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExperimentExposure extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExperimentExposure(boolean z, boolean z2, boolean z3, boolean z4, LoggableExperiment experiment) {
            super(null);
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "elements.experiment_exposure";
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("experiment_retrieved", experiment.getExperiment().getExperimentValue()), TuplesKt.to("arb_id", experiment.getArbId()), TuplesKt.to("assignment_group", experiment.getGroup()));
            Map<String, String> dimensions = experiment.getDimensions();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(dimensions.size()));
            Iterator<T> it = dimensions.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put("dimensions-" + entry.getKey(), entry.getValue());
            }
            this.additionalParams = MapsKt.plus(mapMapOf, linkedHashMap);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewLoadAttempt;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopPayWebviewLoadAttempt extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public ShopPayWebviewLoadAttempt(boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_shoppay_webview_load_attempt";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewConfirmSuccess;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "<init>", "(ZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopPayWebviewConfirmSuccess extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public ShopPayWebviewConfirmSuccess(boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_shoppay_webview_confirm_success";
            this.additionalParams = MapsKt.emptyMap();
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewCancelled;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "isDeferred", "", "isSpt", "linkEnabled", "googlePaySupported", "didReceiveECEClick", "<init>", "(ZZZZZ)V", "()Z", "getLinkEnabled", "getGooglePaySupported", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopPayWebviewCancelled extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;
        private final boolean googlePaySupported;
        private final boolean isDeferred;
        private final boolean isSpt;
        private final boolean linkEnabled;

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isDeferred, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        /* renamed from: isSpt, reason: from getter */
        protected boolean getIsSpt() {
            return this.isSpt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        public ShopPayWebviewCancelled(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super(null);
            this.isDeferred = z;
            this.isSpt = z2;
            this.linkEnabled = z3;
            this.googlePaySupported = z4;
            this.eventName = "mc_shoppay_webview_cancelled";
            this.additionalParams = MapsKt.mapOf(TuplesKt.to("did_receive_ece_click", Boolean.valueOf(z5)));
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        protected Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }
    }

    private final Map<String, Object> standardParams(boolean isDecoupled, boolean isSpt, boolean linkEnabled, boolean googlePaySupported) {
        return MapsKt.mapOf(TuplesKt.to(FIELD_IS_DECOUPLED, Boolean.valueOf(isDecoupled)), TuplesKt.to(FIELD_IS_SPT, Boolean.valueOf(isSpt)), TuplesKt.to(FIELD_LINK_ENABLED, Boolean.valueOf(linkEnabled)), TuplesKt.to("google_pay_enabled", Boolean.valueOf(googlePaySupported)));
    }

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0086T¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;", "", "<init>", "()V", "analyticsValue", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "formatEventName", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "FIELD_CUSTOMER", "FIELD_CUSTOMER_ACCESS_PROVIDER", "FIELD_GOOGLE_PAY", "FIELD_GOOGLE_PAY_ENABLED", "FIELD_PRIMARY_BUTTON_COLOR", "FIELD_BILLING", "FIELD_PREFERRED_NETWORKS", "FIELD_DELAYED_PMS", "FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION", "FIELD_APPEARANCE", "FIELD_ALLOWS_PAYMENT_METHODS_REQUIRING_SHIPPING_ADDRESS", "FIELD_ALLOWS_REMOVAL_OF_LAST_SAVED_PAYMENT_METHOD", "FIELD_BILLING_DETAILS_COLLECTION_CONFIGURATION", "FIELD_CUSTOM_PAYMENT_METHODS", "FIELD_PAYMENT_METHOD_ORDER", "FIELD_IS_DECOUPLED", "FIELD_IS_SPT", "FIELD_DEFERRED_INTENT_CONFIRMATION_TYPE", "FIELD_DURATION", "FIELD_LINK_ENABLED", "FIELD_CURRENCY", "FIELD_SELECTED_LPM", "FIELD_ERROR_MESSAGE", "FIELD_ERROR_CODE", "FIELD_CBC_EVENT_SOURCE", "FIELD_PAYMENT_METHOD_TYPE", "FIELD_SET_AS_DEFAULT_ENABLED", "FIELD_HAS_DEFAULT_PAYMENT_METHOD", "FIELD_SELECTED_CARD_BRAND", "FIELD_SET_AS_DEFAULT", "FIELD_LINK_CONTEXT", "FIELD_EXTERNAL_PAYMENT_METHODS", "FIELD_PAYMENT_METHOD_LAYOUT", "FIELD_COMPOSE", "FIELD_INTENT_TYPE", "FIELD_LINK_MODE", "FIELD_ORDERED_LPMS", "FIELD_REQUIRE_CVC_RECOLLECTION", "FC_SDK_AVAILABILITY", "INTENT_ID", "INTENT_TYPE", "LINK_ACCOUNT_SESSION_ID", "FC_SDK_RESULT", "FIELD_CARD_BRAND_ACCEPTANCE", "FIELD_CARD_SCAN_AVAILABLE", "FIELD_ANALYTIC_CALLBACK_SET", "FIELD_LINK_DISPLAY", "FIELD_PAYMENT_METHOD_OPTIONS_SETUP_FUTURE_USAGE", "FIELD_SETUP_FUTURE_USAGE", "FIELD_ROW_SELECTION_BEHAVIOR", "VALUE_EDIT_CBC_EVENT_SOURCE", "VALUE_ADD_CBC_EVENT_SOURCE", "VALUE_CARD_BRAND", "MAX_EXTERNAL_PAYMENT_METHODS", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String analyticsValue(PaymentSelection paymentSelection) {
            if (paymentSelection instanceof PaymentSelection.GooglePay) {
                return PaymentSheetEvent.FIELD_GOOGLE_PAY;
            }
            if (paymentSelection instanceof PaymentSelection.Saved) {
                return "savedpm";
            }
            if ((paymentSelection instanceof PaymentSelection.Link) || (paymentSelection instanceof PaymentSelection.New.LinkInline)) {
                return "link";
            }
            if ((paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) || (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) || (paymentSelection instanceof PaymentSelection.New)) {
                return "newpm";
            }
            if (paymentSelection == null) {
                return "unknown";
            }
            if (paymentSelection instanceof PaymentSelection.ShopPay) {
                return "shop_pay";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String formatEventName(EventReporter.Mode mode, String eventName) {
            return "mc_" + mode + "_" + eventName;
        }
    }
}

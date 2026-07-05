.class public abstract Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.super Ljava/lang/Object;
.source "PaymentSheetEvent.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorFinished;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorStarted;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CannotProperlyReturnFromLinkAndLPMs;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandDisallowed;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardNumberCompleted;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ElementsSessionLoadFailed;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$HideEditablePaymentOption;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadFailed;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadStarted;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentMethodFormCompleted;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentOptionFormInteraction;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$RemovePaymentOption;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentMethod;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodFailed;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodSucceeded;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewCancelled;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewConfirmSuccess;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewLoadAttempt;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowEditablePaymentOption;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowManagePaymentMethods;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptions;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowPaymentOptionForm;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionFailed;,
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionSucceeded;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 :2\u00020\u0001:%\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./0123456789:B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J6\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000cR\u0012\u0010\r\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000cR\u0012\u0010\u000e\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u000cR\u0012\u0010\u0010\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000cR \u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\t\u0082\u0001#;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]\u00a8\u0006^"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "<init>",
        "()V",
        "params",
        "",
        "",
        "",
        "getParams",
        "()Ljava/util/Map;",
        "isDeferred",
        "",
        "()Z",
        "isSpt",
        "linkEnabled",
        "getLinkEnabled",
        "googlePaySupported",
        "getGooglePaySupported",
        "additionalParams",
        "getAdditionalParams",
        "standardParams",
        "isDecoupled",
        "ConfigurationSpecificPayload",
        "LoadStarted",
        "LoadSucceeded",
        "LoadFailed",
        "ElementsSessionLoadFailed",
        "Init",
        "Dismiss",
        "ShowNewPaymentOptions",
        "ShowExistingPaymentOptions",
        "ShowManagePaymentMethods",
        "SelectPaymentMethod",
        "RemovePaymentOption",
        "SelectPaymentOption",
        "ShowPaymentOptionForm",
        "PaymentOptionFormInteraction",
        "PaymentMethodFormCompleted",
        "CardNumberCompleted",
        "CardBrandDisallowed",
        "PressConfirmButton",
        "Payment",
        "LpmSerializeFailureEvent",
        "AutofillEvent",
        "ShowEditablePaymentOption",
        "HideEditablePaymentOption",
        "CardBrandSelected",
        "SetAsDefaultPaymentMethodSucceeded",
        "SetAsDefaultPaymentMethodFailed",
        "UpdatePaymentOptionSucceeded",
        "UpdatePaymentOptionFailed",
        "CannotProperlyReturnFromLinkAndLPMs",
        "BankAccountCollectorStarted",
        "BankAccountCollectorFinished",
        "ExperimentExposure",
        "ShopPayWebviewLoadAttempt",
        "ShopPayWebviewConfirmSuccess",
        "ShopPayWebviewCancelled",
        "Companion",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorFinished;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$BankAccountCollectorStarted;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CannotProperlyReturnFromLinkAndLPMs;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandDisallowed;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardBrandSelected;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$CardNumberCompleted;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ElementsSessionLoadFailed;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$HideEditablePaymentOption;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadFailed;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadStarted;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LoadSucceeded;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentMethodFormCompleted;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PaymentOptionFormInteraction;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$RemovePaymentOption;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentMethod;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodFailed;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SetAsDefaultPaymentMethodSucceeded;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewCancelled;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewConfirmSuccess;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShopPayWebviewLoadAttempt;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowEditablePaymentOption;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowManagePaymentMethods;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptions;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowPaymentOptionForm;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionFailed;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$UpdatePaymentOptionSucceeded;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

.field public static final FC_SDK_AVAILABILITY:Ljava/lang/String; = "fc_sdk_availability"

.field public static final FC_SDK_RESULT:Ljava/lang/String; = "fc_sdk_result"

.field public static final FIELD_ALLOWS_PAYMENT_METHODS_REQUIRING_SHIPPING_ADDRESS:Ljava/lang/String; = "allows_payment_methods_requiring_shipping_address"

.field public static final FIELD_ALLOWS_REMOVAL_OF_LAST_SAVED_PAYMENT_METHOD:Ljava/lang/String; = "allows_removal_of_last_saved_payment_method"

.field public static final FIELD_ANALYTIC_CALLBACK_SET:Ljava/lang/String; = "analytic_callback_set"

.field public static final FIELD_APPEARANCE:Ljava/lang/String; = "appearance"

.field public static final FIELD_BILLING:Ljava/lang/String; = "default_billing_details"

.field public static final FIELD_BILLING_DETAILS_COLLECTION_CONFIGURATION:Ljava/lang/String; = "billing_details_collection_configuration"

.field public static final FIELD_CARD_BRAND_ACCEPTANCE:Ljava/lang/String; = "card_brand_acceptance"

.field public static final FIELD_CARD_SCAN_AVAILABLE:Ljava/lang/String; = "card_scan_available"

.field public static final FIELD_CBC_EVENT_SOURCE:Ljava/lang/String; = "cbc_event_source"

.field public static final FIELD_COMPOSE:Ljava/lang/String; = "compose"

.field public static final FIELD_CURRENCY:Ljava/lang/String; = "currency"

.field public static final FIELD_CUSTOMER:Ljava/lang/String; = "customer"

.field public static final FIELD_CUSTOMER_ACCESS_PROVIDER:Ljava/lang/String; = "customer_access_provider"

.field public static final FIELD_CUSTOM_PAYMENT_METHODS:Ljava/lang/String; = "custom_payment_methods"

.field public static final FIELD_DEFERRED_INTENT_CONFIRMATION_TYPE:Ljava/lang/String; = "deferred_intent_confirmation_type"

.field public static final FIELD_DELAYED_PMS:Ljava/lang/String; = "allows_delayed_payment_methods"

.field public static final FIELD_DURATION:Ljava/lang/String; = "duration"

.field public static final FIELD_ERROR_CODE:Ljava/lang/String; = "error_code"

.field public static final FIELD_ERROR_MESSAGE:Ljava/lang/String; = "error_message"

.field public static final FIELD_EXTERNAL_PAYMENT_METHODS:Ljava/lang/String; = "external_payment_methods"

.field public static final FIELD_GOOGLE_PAY:Ljava/lang/String; = "googlepay"

.field public static final FIELD_GOOGLE_PAY_ENABLED:Ljava/lang/String; = "google_pay_enabled"

.field public static final FIELD_HAS_DEFAULT_PAYMENT_METHOD:Ljava/lang/String; = "has_default_payment_method"

.field public static final FIELD_INTENT_TYPE:Ljava/lang/String; = "intent_type"

.field public static final FIELD_IS_DECOUPLED:Ljava/lang/String; = "is_decoupled"

.field public static final FIELD_IS_SPT:Ljava/lang/String; = "is_spt"

.field public static final FIELD_LINK_CONTEXT:Ljava/lang/String; = "link_context"

.field public static final FIELD_LINK_DISPLAY:Ljava/lang/String; = "link_display"

.field public static final FIELD_LINK_ENABLED:Ljava/lang/String; = "link_enabled"

.field public static final FIELD_LINK_MODE:Ljava/lang/String; = "link_mode"

.field public static final FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION:Ljava/lang/String; = "mpe_config"

.field public static final FIELD_ORDERED_LPMS:Ljava/lang/String; = "ordered_lpms"

.field public static final FIELD_PAYMENT_METHOD_LAYOUT:Ljava/lang/String; = "payment_method_layout"

.field public static final FIELD_PAYMENT_METHOD_OPTIONS_SETUP_FUTURE_USAGE:Ljava/lang/String; = "payment_method_options_setup_future_usage"

.field public static final FIELD_PAYMENT_METHOD_ORDER:Ljava/lang/String; = "payment_method_order"

.field public static final FIELD_PAYMENT_METHOD_TYPE:Ljava/lang/String; = "payment_method_type"

.field public static final FIELD_PREFERRED_NETWORKS:Ljava/lang/String; = "preferred_networks"

.field public static final FIELD_PRIMARY_BUTTON_COLOR:Ljava/lang/String; = "primary_button_color"

.field public static final FIELD_REQUIRE_CVC_RECOLLECTION:Ljava/lang/String; = "require_cvc_recollection"

.field public static final FIELD_ROW_SELECTION_BEHAVIOR:Ljava/lang/String; = "row_selection_behavior"

.field public static final FIELD_SELECTED_CARD_BRAND:Ljava/lang/String; = "selected_card_brand"

.field public static final FIELD_SELECTED_LPM:Ljava/lang/String; = "selected_lpm"

.field public static final FIELD_SETUP_FUTURE_USAGE:Ljava/lang/String; = "setup_future_usage"

.field public static final FIELD_SET_AS_DEFAULT:Ljava/lang/String; = "set_as_default"

.field public static final FIELD_SET_AS_DEFAULT_ENABLED:Ljava/lang/String; = "set_as_default_enabled"

.field public static final INTENT_ID:Ljava/lang/String; = "intent_id"

.field public static final INTENT_TYPE:Ljava/lang/String; = "intent_type"

.field public static final LINK_ACCOUNT_SESSION_ID:Ljava/lang/String; = "link_account_session_id"

.field public static final MAX_EXTERNAL_PAYMENT_METHODS:I = 0xa

.field public static final VALUE_ADD_CBC_EVENT_SOURCE:Ljava/lang/String; = "add"

.field public static final VALUE_CARD_BRAND:Ljava/lang/String; = "brand"

.field public static final VALUE_EDIT_CBC_EVENT_SOURCE:Ljava/lang/String; = "edit"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;-><init>()V

    return-void
.end method

.method private final standardParams(ZZZZ)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 715
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "is_decoupled"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 716
    const-string p1, "is_spt"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    .line 717
    const-string p1, "link_enabled"

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v0, p2

    .line 718
    const-string p1, "google_pay_enabled"

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v0, p2

    .line 714
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected abstract getAdditionalParams()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract getGooglePaySupported()Z
.end method

.method protected abstract getLinkEnabled()Z
.end method

.method public final getParams()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 67
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->isDeferred()Z

    move-result v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->isSpt()Z

    move-result v1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->getLinkEnabled()Z

    move-result v2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->getGooglePaySupported()Z

    move-result v3

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->standardParams(ZZZZ)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->getAdditionalParams()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected abstract isDeferred()Z
.end method

.method protected abstract isSpt()Z
.end method

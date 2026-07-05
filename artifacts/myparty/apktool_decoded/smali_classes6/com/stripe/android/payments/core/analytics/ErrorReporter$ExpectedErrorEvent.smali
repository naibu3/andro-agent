.class public final enum Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;
.super Ljava/lang/Enum;
.source "ErrorReporter.kt"

# interfaces
.implements Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/analytics/ErrorReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ExpectedErrorEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;",
        ">;",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\"\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;",
        "",
        "eventName",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getEventName",
        "()Ljava/lang/String;",
        "AUTH_WEB_VIEW_FAILURE",
        "AUTH_WEB_VIEW_NULL_ARGS",
        "GET_SAVED_PAYMENT_METHODS_FAILURE",
        "GOOGLE_PAY_IS_READY_API_CALL",
        "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE",
        "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE",
        "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE",
        "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE",
        "CUSTOMER_SHEET_ADAPTER_NOT_FOUND",
        "PLACES_FIND_AUTOCOMPLETE_ERROR",
        "PLACES_FETCH_PLACE_ERROR",
        "LINK_CREATE_PAYMENT_DETAILS_FAILURE",
        "LINK_SHARE_CARD_FAILURE",
        "LINK_LOG_OUT_FAILURE",
        "LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN",
        "LINK_NATIVE_FAILED_TO_ATTEST_REQUEST",
        "LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER",
        "PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS",
        "PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS",
        "BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND",
        "BROWSER_LAUNCHER_NULL_ARGS",
        "GOOGLE_PAY_FAILED",
        "FRAUD_DETECTION_API_FAILURE",
        "SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE",
        "EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL",
        "CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL",
        "EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL",
        "CREATE_INTENT_CALLBACK_NULL",
        "PREPARE_PAYMENT_METHOD_HANDLER_NULL",
        "payments-core_release"
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum AUTH_WEB_VIEW_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum AUTH_WEB_VIEW_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum BROWSER_LAUNCHER_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum CREATE_INTENT_CALLBACK_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum CUSTOMER_SHEET_ADAPTER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum FRAUD_DETECTION_API_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum GET_SAVED_PAYMENT_METHODS_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum GOOGLE_PAY_FAILED:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum GOOGLE_PAY_IS_READY_API_CALL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum LINK_CREATE_PAYMENT_DETAILS_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum LINK_LOG_OUT_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum LINK_NATIVE_FAILED_TO_ATTEST_REQUEST:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum LINK_SHARE_CARD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum PLACES_FETCH_PLACE_ERROR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum PLACES_FIND_AUTOCOMPLETE_ERROR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum PREPARE_PAYMENT_METHOD_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

.field public static final enum SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;


# instance fields
.field private final eventName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;
    .locals 30

    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->AUTH_WEB_VIEW_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->AUTH_WEB_VIEW_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GET_SAVED_PAYMENT_METHODS_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v4, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GOOGLE_PAY_IS_READY_API_CALL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v6, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v7, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v8, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v9, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_ADAPTER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v10, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PLACES_FIND_AUTOCOMPLETE_ERROR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v11, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PLACES_FETCH_PLACE_ERROR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v12, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_CREATE_PAYMENT_DETAILS_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v13, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_SHARE_CARD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v14, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_LOG_OUT_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v15, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v16, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_ATTEST_REQUEST:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v17, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v18, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v19, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v20, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v21, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->BROWSER_LAUNCHER_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v22, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GOOGLE_PAY_FAILED:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v23, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->FRAUD_DETECTION_API_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v24, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v25, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v26, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v27, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v28, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CREATE_INTENT_CALLBACK_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    sget-object v29, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PREPARE_PAYMENT_METHOD_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    filled-new-array/range {v1 .. v29}, [Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 92
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x0

    .line 93
    const-string v2, "payments.auth_web_view.failure"

    .line 92
    const-string v3, "AUTH_WEB_VIEW_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->AUTH_WEB_VIEW_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 95
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x1

    .line 96
    const-string v2, "payments.auth_web_view.null_args"

    .line 95
    const-string v3, "AUTH_WEB_VIEW_NULL_ARGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->AUTH_WEB_VIEW_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 98
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x2

    .line 99
    const-string v2, "elements.customer_repository.get_saved_payment_methods_failure"

    .line 98
    const-string v3, "GET_SAVED_PAYMENT_METHODS_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GET_SAVED_PAYMENT_METHODS_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 101
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x3

    .line 102
    const-string v2, "elements.google_pay_repository.is_ready_request_api_call_failure"

    .line 101
    const-string v3, "GOOGLE_PAY_IS_READY_API_CALL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GOOGLE_PAY_IS_READY_API_CALL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 104
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x4

    .line 105
    const-string v2, "elements.customer_sheet.elements_session.load_failure"

    .line 104
    const-string v3, "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 107
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x5

    .line 108
    const-string v2, "elements.customer_sheet.customer_session.elements_session.load_failure"

    .line 107
    const-string v3, "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 110
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x6

    .line 111
    const-string v2, "elements.customer_sheet.payment_methods.load_failure"

    .line 110
    const-string v3, "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 113
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/4 v1, 0x7

    .line 114
    const-string v2, "elements.customer_sheet.payment_methods.refresh_failure"

    .line 113
    const-string v3, "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 116
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x8

    .line 117
    const-string v2, "elements.customer_sheet.customer_adapter.not_found"

    .line 116
    const-string v3, "CUSTOMER_SHEET_ADAPTER_NOT_FOUND"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_ADAPTER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 119
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x9

    .line 120
    const-string v2, "address_element.find_autocomplete.error"

    .line 119
    const-string v3, "PLACES_FIND_AUTOCOMPLETE_ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PLACES_FIND_AUTOCOMPLETE_ERROR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 122
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0xa

    .line 123
    const-string v2, "address_element.fetch_place.error"

    .line 122
    const-string v3, "PLACES_FETCH_PLACE_ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PLACES_FETCH_PLACE_ERROR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 125
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0xb

    .line 126
    const-string v2, "link.create_new_card.create_payment_details_failure"

    .line 125
    const-string v3, "LINK_CREATE_PAYMENT_DETAILS_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_CREATE_PAYMENT_DETAILS_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 128
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0xc

    .line 129
    const-string v2, "link.create_new_card.share_payment_details_failure"

    .line 128
    const-string v3, "LINK_SHARE_CARD_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_SHARE_CARD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 131
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0xd

    .line 132
    const-string v2, "link.log_out.failure"

    .line 131
    const-string v3, "LINK_LOG_OUT_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_LOG_OUT_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 134
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0xe

    .line 135
    const-string v2, "link.native.failed_to_get_integrity_token"

    .line 134
    const-string v3, "LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 137
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0xf

    .line 138
    const-string v2, "link.native.failed_to_attest_request"

    .line 137
    const-string v3, "LINK_NATIVE_FAILED_TO_ATTEST_REQUEST"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_ATTEST_REQUEST:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 140
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x10

    .line 141
    const-string v2, "link.native.integrity.preparation_failed"

    .line 140
    const-string v3, "LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 143
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x11

    .line 144
    const-string v2, "payments.paymentlauncherconfirmation.null_args"

    .line 143
    const-string v3, "PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 146
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x12

    .line 147
    const-string v2, "payments.paymentlauncherconfirmation.invalid_args"

    .line 146
    const-string v3, "PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 149
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x13

    .line 150
    const-string v2, "payments.browserlauncher.activity_not_found"

    .line 149
    const-string v3, "BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 152
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x14

    .line 153
    const-string v2, "payments.browserlauncher.null_args"

    .line 152
    const-string v3, "BROWSER_LAUNCHER_NULL_ARGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->BROWSER_LAUNCHER_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 155
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x15

    .line 156
    const-string v2, "google_pay.confirm.error"

    .line 155
    const-string v3, "GOOGLE_PAY_FAILED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GOOGLE_PAY_FAILED:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 158
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x16

    .line 159
    const-string v2, "fraud_detection_data_repository.api_failure"

    .line 158
    const-string v3, "FRAUD_DETECTION_API_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->FRAUD_DETECTION_API_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 161
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x17

    .line 162
    const-string v2, "stripe_android.saved_payment_method_radar_session_failure"

    .line 161
    const-string v3, "SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 164
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x18

    .line 165
    const-string v2, "paymentsheet.external_payment_method.confirm_handler_is_null"

    .line 164
    const-string v3, "EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 167
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x19

    .line 168
    const-string v2, "paymentsheet.custom_payment_method.confirm_handler_is_null"

    .line 167
    const-string v3, "CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 170
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x1a

    .line 171
    const-string v2, "paymentsheet.external_payment_method.launcher_is_null"

    .line 170
    const-string v3, "EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 173
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x1b

    .line 174
    const-string v2, "paymentsheet.create_intent_callback.is_null"

    .line 173
    const-string v3, "CREATE_INTENT_CALLBACK_NULL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CREATE_INTENT_CALLBACK_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    .line 176
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    const/16 v1, 0x1c

    .line 177
    const-string v2, "paymentsheet.prepare_payment_method_handler.is_null"

    .line 176
    const-string v3, "PREPARE_PAYMENT_METHOD_HANDLER_NULL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->PREPARE_PAYMENT_METHOD_HANDLER_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    invoke-static {}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->$values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->$VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 91
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->eventName:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;
    .locals 1

    const-class v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 179
    check-cast p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->$VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 179
    check-cast v0, [Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    return-object v0
.end method


# virtual methods
.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->eventName:Ljava/lang/String;

    return-object v0
.end method

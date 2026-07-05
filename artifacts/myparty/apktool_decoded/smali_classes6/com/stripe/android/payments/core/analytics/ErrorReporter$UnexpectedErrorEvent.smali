.class public final enum Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;
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
    name = "UnexpectedErrorEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;",
        ">;",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008$\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010&\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;",
        "",
        "partialEventName",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getPartialEventName",
        "()Ljava/lang/String;",
        "AUTH_WEB_VIEW_BLANK_CLIENT_SECRET",
        "MISSING_CARDSCAN_DEPENDENCY",
        "MISSING_HOSTED_VOUCHER_URL",
        "MISSING_POLLING_AUTHENTICATOR",
        "LINK_INVALID_SESSION_STATE",
        "GOOGLE_PAY_JSON_REQUEST_PARSING",
        "GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT",
        "GOOGLE_PAY_MISSING_INTENT_DATA",
        "FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY",
        "FETCH_PLACE_WITHOUT_DEPENDENCY",
        "LINK_ATTACH_CARD_WITH_NULL_ACCOUNT",
        "LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT",
        "LINK_WEB_FAILED_TO_PARSE_RESULT_URI",
        "LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST",
        "PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND",
        "PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND",
        "EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE",
        "PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT",
        "PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT",
        "FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT",
        "INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION",
        "EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE",
        "CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION",
        "CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION",
        "CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD",
        "EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL",
        "WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM",
        "WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM",
        "INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL",
        "eventName",
        "getEventName",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum AUTH_WEB_VIEW_BLANK_CLIENT_SECRET:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum FETCH_PLACE_WITHOUT_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum GOOGLE_PAY_JSON_REQUEST_PARSING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum GOOGLE_PAY_MISSING_INTENT_DATA:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum LINK_ATTACH_CARD_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum LINK_INVALID_SESSION_STATE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum LINK_WEB_FAILED_TO_PARSE_RESULT_URI:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum MISSING_CARDSCAN_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum MISSING_HOSTED_VOUCHER_URL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum MISSING_POLLING_AUTHENTICATOR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

.field public static final enum WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;


# instance fields
.field private final partialEventName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;
    .locals 30

    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->AUTH_WEB_VIEW_BLANK_CLIENT_SECRET:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->MISSING_CARDSCAN_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->MISSING_HOSTED_VOUCHER_URL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v4, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->MISSING_POLLING_AUTHENTICATOR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_INVALID_SESSION_STATE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v6, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_JSON_REQUEST_PARSING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v7, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v8, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_MISSING_INTENT_DATA:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v9, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v10, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->FETCH_PLACE_WITHOUT_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v11, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_ATTACH_CARD_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v12, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v13, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_WEB_FAILED_TO_PARSE_RESULT_URI:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v14, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v15, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v16, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v17, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v18, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v19, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v20, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v21, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v22, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v23, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v24, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v25, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v26, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v27, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v28, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    sget-object v29, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    filled-new-array/range {v1 .. v29}, [Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 183
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x0

    .line 184
    const-string v2, "payments.auth_web_view.blank_client_secret"

    .line 183
    const-string v3, "AUTH_WEB_VIEW_BLANK_CLIENT_SECRET"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->AUTH_WEB_VIEW_BLANK_CLIENT_SECRET:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 186
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x1

    .line 187
    const-string v2, "cardscan.missing_dependency"

    .line 186
    const-string v3, "MISSING_CARDSCAN_DEPENDENCY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->MISSING_CARDSCAN_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 189
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x2

    .line 190
    const-string v2, "payments.missing_hosted_voucher_url"

    .line 189
    const-string v3, "MISSING_HOSTED_VOUCHER_URL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->MISSING_HOSTED_VOUCHER_URL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 192
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x3

    .line 193
    const-string v2, "payments.missing_polling_authenticator"

    .line 192
    const-string v3, "MISSING_POLLING_AUTHENTICATOR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->MISSING_POLLING_AUTHENTICATOR:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 195
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x4

    .line 196
    const-string v2, "link.signup.failure.invalidSessionState"

    .line 195
    const-string v3, "LINK_INVALID_SESSION_STATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_INVALID_SESSION_STATE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 198
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x5

    .line 199
    const-string v2, "google_pay_repository.is_ready_request_json_parsing_failure"

    .line 198
    const-string v3, "GOOGLE_PAY_JSON_REQUEST_PARSING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_JSON_REQUEST_PARSING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 201
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x6

    .line 202
    const-string v2, "google_pay.confirm.unexpected_result"

    .line 201
    const-string v3, "GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 204
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/4 v1, 0x7

    .line 205
    const-string v2, "google_pay.on_result.missing_data"

    .line 204
    const-string v3, "GOOGLE_PAY_MISSING_INTENT_DATA"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_MISSING_INTENT_DATA:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 207
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x8

    .line 208
    const-string v2, "address_element.find_autocomplete.without_dependency"

    .line 207
    const-string v3, "FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 210
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x9

    .line 211
    const-string v2, "address_element.fetch_place.without_dependency"

    .line 210
    const-string v3, "FETCH_PLACE_WITHOUT_DEPENDENCY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->FETCH_PLACE_WITHOUT_DEPENDENCY:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 213
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0xa

    .line 214
    const-string v2, "link.create_new_card.missing_link_account"

    .line 213
    const-string v3, "LINK_ATTACH_CARD_WITH_NULL_ACCOUNT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_ATTACH_CARD_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 216
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0xb

    .line 217
    const-string v2, "link.create_new_bank_account.missing_link_account"

    .line 216
    const-string v3, "LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 219
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0xc

    .line 220
    const-string v2, "link.web.result.parsing_failed"

    .line 219
    const-string v3, "LINK_WEB_FAILED_TO_PARSE_RESULT_URI"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_WEB_FAILED_TO_PARSE_RESULT_URI:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 222
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0xd

    .line 223
    const-string v2, "link.native.signup.failed_to_attest_request"

    .line 222
    const-string v3, "LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_NATIVE_FAILED_TO_ATTEST_SIGNUP_REQUEST:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 225
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0xe

    .line 226
    const-string v2, "paymentsheet.authenticators.not_found"

    .line 225
    const-string v3, "PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 228
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0xf

    .line 229
    const-string v2, "paymentsheet.loader.elements_session.customer.not_found"

    .line 228
    const-string v3, "PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 231
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x10

    .line 232
    const-string v2, "elements.external_payment_methods_serializer.error"

    .line 231
    const-string v3, "EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 234
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x11

    .line 235
    const-string v2, "paymentsheet.no_payment_selection"

    .line 234
    const-string v3, "PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 237
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x12

    .line 238
    const-string v2, "paymentsheet.invalid_payment_selection"

    .line 237
    const-string v3, "PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 240
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x13

    .line 241
    const-string v2, "flow_controller.invalid_payment_selection"

    .line 240
    const-string v3, "FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 243
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x14

    .line 244
    const-string v2, "intent_confirmation_handler.invalid_payment_confirmation_option"

    .line 243
    const-string v3, "INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 246
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x15

    .line 247
    const-string v2, "paymentsheet.external_payment_method.unexpected_result_code"

    .line 246
    const-string v3, "EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 249
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x16

    .line 250
    const-string v2, "payments.cvc_recollection_unexpected_payment_selection"

    .line 249
    const-string v3, "CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 252
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x17

    .line 253
    const-string v2, "customersheet.customer_session.attach_called"

    .line 252
    const-string v3, "CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 255
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x18

    .line 256
    const-string v2, "customersheet.customer_session.elements_session.no_customer_field"

    .line 255
    const-string v3, "CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 258
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x19

    .line 259
    const-string v2, "embedded.embedded_sheet_launcher.embedded_state_is_null"

    .line 258
    const-string v3, "EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 261
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x1a

    .line 262
    const-string v2, "wallet_buttons.wallet_arguments.null_on_confirm"

    .line 261
    const-string v3, "WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 264
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x1b

    .line 265
    const-string v2, "wallet_buttons.confirmation_arguments.null_on_confirm"

    .line 264
    const-string v3, "WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    .line 267
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    const/16 v1, 0x1c

    .line 268
    const-string v2, "intent_confirmation_handler.passive_challenge.params_null"

    .line 267
    const-string v3, "INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    invoke-static {}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->$values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->$VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 182
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->partialEventName:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;
    .locals 1

    const-class v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 274
    check-cast p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->$VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 274
    check-cast v0, [Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    return-object v0
.end method


# virtual methods
.method public getEventName()Ljava/lang/String;
    .locals 3

    .line 273
    iget-object v0, p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->partialEventName:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected_error."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPartialEventName()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->partialEventName:Ljava/lang/String;

    return-object v0
.end method

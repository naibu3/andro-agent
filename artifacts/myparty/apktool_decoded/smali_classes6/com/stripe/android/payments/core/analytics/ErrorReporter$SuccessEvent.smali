.class public final enum Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;
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
    name = "SuccessEvent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;",
        ">;",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;",
        "",
        "eventName",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getEventName",
        "()Ljava/lang/String;",
        "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS",
        "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS",
        "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS",
        "GET_SAVED_PAYMENT_METHODS_SUCCESS",
        "PLACES_FIND_AUTOCOMPLETE_SUCCESS",
        "PLACES_FETCH_PLACE_SUCCESS",
        "LINK_CREATE_CARD_SUCCESS",
        "LINK_LOG_OUT_SUCCESS",
        "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS",
        "EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS",
        "CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS",
        "FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING",
        "FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum GET_SAVED_PAYMENT_METHODS_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum LINK_CREATE_CARD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum LINK_LOG_OUT_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum PLACES_FETCH_PLACE_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

.field public static final enum PLACES_FIND_AUTOCOMPLETE_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;


# instance fields
.field private final eventName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;
    .locals 13

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->GET_SAVED_PAYMENT_METHODS_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v4, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->PLACES_FIND_AUTOCOMPLETE_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->PLACES_FETCH_PLACE_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v6, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->LINK_CREATE_CARD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v7, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->LINK_LOG_OUT_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v8, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v9, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v10, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v11, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    sget-object v12, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    filled-new-array/range {v0 .. v12}, [Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 283
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x0

    .line 284
    const-string v2, "elements.customer_sheet.elements_session.load_success"

    .line 283
    const-string v3, "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 286
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x1

    .line 287
    const-string v2, "elements.customer_sheet.customer_session.elements_session.load_success"

    .line 286
    const-string v3, "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 289
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x2

    .line 290
    const-string v2, "elements.customer_sheet.payment_methods.load_success"

    .line 289
    const-string v3, "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 292
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x3

    .line 293
    const-string v2, "elements.customer_repository.get_saved_payment_methods_success"

    .line 292
    const-string v3, "GET_SAVED_PAYMENT_METHODS_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->GET_SAVED_PAYMENT_METHODS_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 295
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x4

    .line 296
    const-string v2, "address_element.find_autocomplete.success"

    .line 295
    const-string v3, "PLACES_FIND_AUTOCOMPLETE_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->PLACES_FIND_AUTOCOMPLETE_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 298
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x5

    .line 299
    const-string v2, "address_element.fetch_place.success"

    .line 298
    const-string v3, "PLACES_FETCH_PLACE_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->PLACES_FETCH_PLACE_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 301
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x6

    .line 302
    const-string v2, "link.create_new_card.success"

    .line 301
    const-string v3, "LINK_CREATE_CARD_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->LINK_CREATE_CARD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 304
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/4 v1, 0x7

    .line 305
    const-string v2, "link.log_out.success"

    .line 304
    const-string v3, "LINK_LOG_OUT_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->LINK_LOG_OUT_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 307
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/16 v1, 0x8

    .line 308
    const-string v2, "elements.customer_sheet.payment_methods.refresh_success"

    .line 307
    const-string v3, "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 310
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/16 v1, 0x9

    .line 311
    const-string v2, "paymentsheet.external_payment_method.launch_success"

    .line 310
    const-string v3, "EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 313
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/16 v1, 0xa

    .line 314
    const-string v2, "paymentsheet.custom_payment_method.launch_success"

    .line 313
    const-string v3, "CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 316
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/16 v1, 0xb

    .line 317
    const-string v2, "paymentsheet.polling_for_create_intent_callback.found"

    .line 316
    const-string v3, "FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    .line 319
    new-instance v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    const/16 v1, 0xc

    .line 320
    const-string v2, "paymentsheet.polling_for_prepare_payment_method_handler.found"

    .line 319
    const-string v3, "FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    invoke-static {}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->$values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->$VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 282
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->eventName:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;
    .locals 1

    const-class v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 322
    check-cast p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->$VALUES:[Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 322
    check-cast v0, [Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    return-object v0
.end method


# virtual methods
.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->eventName:Ljava/lang/String;

    return-object v0
.end method

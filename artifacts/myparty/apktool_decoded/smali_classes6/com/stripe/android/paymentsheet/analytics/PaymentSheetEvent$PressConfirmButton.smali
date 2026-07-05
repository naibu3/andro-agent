.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;
.super Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.source "PaymentSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PressConfirmButton"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001BY\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\n\u001a\u00020\u000bX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0011R\u0014\u0010\u000c\u001a\u00020\u000bX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0011R\u0014\u0010\r\u001a\u00020\u000bX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u000bX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "currency",
        "",
        "duration",
        "Lkotlin/time/Duration;",
        "selectedLpm",
        "linkContext",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "isDeferred",
        "",
        "isSpt",
        "linkEnabled",
        "googlePaySupported",
        "<init>",
        "(Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "()Z",
        "getLinkEnabled",
        "getGooglePaySupported",
        "eventName",
        "getEventName",
        "()Ljava/lang/String;",
        "additionalParams",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final additionalParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final eventName:Ljava/lang/String;

.field private final googlePaySupported:Z

.field private final isDeferred:Z

.field private final isSpt:Z

.field private final linkEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZ)V
    .locals 1

    const/4 v0, 0x0

    .line 410
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 406
    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->isDeferred:Z

    .line 407
    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->isSpt:Z

    .line 408
    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->linkEnabled:Z

    .line 409
    iput-boolean p9, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->googlePaySupported:Z

    .line 411
    const-string p6, "mc_confirm_button_tapped"

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->eventName:Ljava/lang/String;

    const/4 p6, 0x5

    .line 413
    new-array p6, p6, [Lkotlin/Pair;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide p7

    invoke-static {p7, p8}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->access$getAsSeconds-LRDsOJo(J)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :cond_0
    const-string p2, "duration"

    invoke-static {p2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p7, 0x0

    aput-object p2, p6, p7

    .line 414
    const-string p2, "currency"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, p6, p2

    .line 415
    const-string p1, "selected_lpm"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, p6, p2

    .line 416
    const-string p1, "link_context"

    invoke-static {p1, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, p6, p2

    .line 417
    const-string p1, "fc_sdk_availability"

    invoke-static {p5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->access$toAnalyticsParam(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, p6, p2

    .line 412
    invoke-static {p6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 418
    invoke-static {p1}, Lcom/stripe/android/utils/MapUtilsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->additionalParams:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;-><init>(Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ZZZZ)V

    return-void
.end method


# virtual methods
.method protected getAdditionalParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 412
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->additionalParams:Ljava/util/Map;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 411
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method protected getGooglePaySupported()Z
    .locals 1

    .line 409
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->googlePaySupported:Z

    return v0
.end method

.method protected getLinkEnabled()Z
    .locals 1

    .line 408
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->linkEnabled:Z

    return v0
.end method

.method protected isDeferred()Z
    .locals 1

    .line 406
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->isDeferred:Z

    return v0
.end method

.method protected isSpt()Z
    .locals 1

    .line 407
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$PressConfirmButton;->isSpt:Z

    return v0
.end method

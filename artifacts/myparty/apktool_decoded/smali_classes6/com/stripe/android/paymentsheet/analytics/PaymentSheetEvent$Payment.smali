.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;
.super Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.source "PaymentSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payment"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001 B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u00020\rX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\rX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\rX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0014\u0010\u0010\u001a\u00020\rX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "mode",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
        "result",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;",
        "duration",
        "Lkotlin/time/Duration;",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "currency",
        "",
        "isDeferred",
        "",
        "isSpt",
        "linkEnabled",
        "googlePaySupported",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lkotlin/time/Duration;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Result",
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

.field private final deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

.field private final eventName:Ljava/lang/String;

.field private final googlePaySupported:Z

.field private final isDeferred:Z

.field private final isSpt:Z

.field private final linkEnabled:Z

.field private final result:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lkotlin/time/Duration;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V
    .locals 2

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSelection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 432
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 423
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->result:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;

    .line 427
    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->isDeferred:Z

    .line 428
    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->isSpt:Z

    .line 429
    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->linkEnabled:Z

    .line 430
    iput-boolean p9, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->googlePaySupported:Z

    .line 431
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    .line 435
    sget-object p6, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->Embedded:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const-string p7, "payment_"

    if-ne p1, p6, :cond_0

    .line 436
    sget-object p6, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

    invoke-interface {p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;->getAnalyticsValue()Ljava/lang/String;

    move-result-object p8

    new-instance p9, Ljava/lang/StringBuilder;

    invoke-direct {p9, p7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p9, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p7

    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    invoke-static {p6, p1, p7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;->access$formatEventName(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 438
    :cond_0
    sget-object p6, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

    sget-object p8, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;->Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;

    invoke-static {p8, p4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;->access$analyticsValue(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object p8

    invoke-interface {p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;->getAnalyticsValue()Ljava/lang/String;

    move-result-object p9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p7

    const-string p8, "_"

    invoke-virtual {p7, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p7

    invoke-virtual {p7, p9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p7

    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    invoke-static {p6, p1, p7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;->access$formatEventName(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 435
    :goto_0
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->eventName:Ljava/lang/String;

    .line 441
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object p1

    if-eqz p3, :cond_1

    .line 442
    invoke-virtual {p3}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide p6

    invoke-static {p6, p7}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->access$getAsSeconds-LRDsOJo(J)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :cond_1
    const-string p3, "duration"

    invoke-interface {p1, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    const-string p3, "currency"

    invoke-interface {p1, p3, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p10, :cond_2

    .line 445
    const-string p3, "deferred_intent_confirmation_type"

    invoke-virtual {p10}, Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;->getValue()Ljava/lang/String;

    move-result-object p5

    invoke-interface {p1, p3, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    :cond_2
    instance-of p3, p2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;

    if-eqz p3, :cond_3

    .line 448
    move-object p3, p2

    check-cast p3, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;->getError()Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;->getAnalyticsValue()Ljava/lang/String;

    move-result-object p3

    const-string p5, "error_message"

    invoke-interface {p1, p5, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    check-cast p2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result$Failure;->getError()Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;->getErrorCode()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 450
    const-string p3, "error_code"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    :cond_3
    const-string p2, "selected_lpm"

    invoke-static {p4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->code(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    invoke-static {p4}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->linkContext(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 455
    const-string p3, "link_context"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    :cond_4
    invoke-static {p4}, Lcom/stripe/android/paymentsheet/utils/SelectionUtilsKt;->getSetAsDefaultPaymentMethodFromPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 458
    const-string p3, "set_as_default"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    :cond_5
    invoke-static {p1}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->additionalParams:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lkotlin/time/Duration;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lkotlin/time/Duration;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;ZZZZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V

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

    .line 441
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->additionalParams:Ljava/util/Map;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 434
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method protected getGooglePaySupported()Z
    .locals 1

    .line 430
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->googlePaySupported:Z

    return v0
.end method

.method protected getLinkEnabled()Z
    .locals 1

    .line 429
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->linkEnabled:Z

    return v0
.end method

.method protected isDeferred()Z
    .locals 1

    .line 427
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->isDeferred:Z

    return v0
.end method

.method protected isSpt()Z
    .locals 1

    .line 428
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;->isSpt:Z

    return v0
.end method

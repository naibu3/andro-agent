.class public final Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
.super Ljava/lang/Object;
.source "PaymentElementCallbacks.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0008\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00002\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u001a\u001a\u00020\u001bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;",
        "",
        "<init>",
        "()V",
        "createIntentCallback",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "confirmCustomPaymentMethodCallback",
        "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
        "externalPaymentMethodConfirmHandler",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
        "analyticEventCallback",
        "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "rowSelectionCallback",
        "Lkotlin/Function0;",
        "",
        "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;",
        "shopPayHandlers",
        "Lcom/stripe/android/paymentsheet/ShopPayHandlers;",
        "preparePaymentMethodHandler",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "handler",
        "rowSelectionImmediateActionCallback",
        "rowSelectionBehavior",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;",
        "element",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
        "build",
        "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;",
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
.field private analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

.field private confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

.field private createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

.field private externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

.field private preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

.field private rowSelectionCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final analyticEventCallback(Lcom/stripe/android/paymentelement/AnalyticEventCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    .locals 1

    .line 57
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 58
    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    return-object p0
.end method

.method public final build()Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;
    .locals 9

    .line 81
    new-instance v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    .line 82
    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    .line 83
    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    .line 84
    iget-object v3, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    .line 85
    iget-object v4, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    .line 86
    iget-object v5, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    .line 87
    iget-object v6, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    .line 88
    iget-object v7, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    const/4 v8, 0x0

    .line 81
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;-><init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    .locals 1

    .line 47
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 48
    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    return-object p0
.end method

.method public final createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    .locals 1

    .line 41
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 42
    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-object p0
.end method

.method public final externalPaymentMethodConfirmHandler(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    .locals 1

    .line 53
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 54
    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    return-object p0
.end method

.method public final preparePaymentMethodHandler(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    .locals 1

    .line 61
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 62
    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    return-object p0
.end method

.method public final rowSelectionImmediateActionCallback(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    .locals 1

    const-string v0, "rowSelectionBehavior"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 69
    sget-object v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;->Companion:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;->getInternalRowSelectionCallback$paymentsheet_release(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/jvm/functions/Function0;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public final shopPayHandlers(Lcom/stripe/android/paymentsheet/ShopPayHandlers;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    .locals 1

    .line 76
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 77
    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    return-object p0
.end method

.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0006\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001fH\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%J\r\u0010 \u001a\u00020!H\u0007\u00a2\u0006\u0002\u0010&J\u0008\u0010\'\u001a\u00020(H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;",
        "",
        "resultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "paymentOptionResultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;)V",
        "paymentOptionCallback",
        "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)V",
        "getResultCallback$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "getPaymentOptionResultCallback$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;",
        "callbacksBuilder",
        "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;",
        "externalPaymentMethodConfirmHandler",
        "handler",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
        "confirmCustomPaymentMethodCallback",
        "callback",
        "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
        "createIntentCallback",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "analyticEventCallback",
        "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "shopPayHandlers",
        "handlers",
        "Lcom/stripe/android/paymentsheet/ShopPayHandlers;",
        "preparePaymentMethodHandler",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "build",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;",
        "initializeCallbacks",
        "",
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
.field private final callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

.field private final paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

.field private final resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)V
    .locals 1

    const-string v0, "resultCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3414
    invoke-static {p2}, Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt;->toResultCallback(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    move-result-object p2

    .line 3412
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;)V
    .locals 1

    const-string v0, "resultCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionResultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3400
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    .line 3401
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    .line 3417
    new-instance p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-direct {p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-void
.end method

.method private final initializeCallbacks()V
    .locals 2

    .line 3504
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->build()Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;->access$setFlowControllerCallbacks(Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V

    return-void
.end method


# virtual methods
.method public final analyticEventCallback(Lcom/stripe/android/paymentelement/AnalyticEventCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3445
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    .line 3446
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->analyticEventCallback(Lcom/stripe/android/paymentelement/AnalyticEventCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final build(Landroidx/activity/ComponentActivity;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3474
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->initializeCallbacks()V

    .line 3475
    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    invoke-direct {v0, p1, v1, v2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;-><init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->create()Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    move-result-object p1

    return-object p1
.end method

.method public final build(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;
    .locals 3

    const v0, 0x6d26194f

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.PaymentSheet.FlowController.Builder.build (PaymentSheet.kt:3491)"

    .line 3492
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3497
    :cond_0
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->build()Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object p2

    .line 3498
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    .line 3499
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    const/4 v2, 0x0

    .line 3496
    invoke-static {p2, v0, v1, p1, v2}, Lcom/stripe/android/paymentsheet/FlowControllerComposeKt;->internalRememberPaymentSheetFlowController(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    move-result-object p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method public final build(Landroidx/fragment/app/Fragment;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;
    .locals 3

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3484
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->initializeCallbacks()V

    .line 3485
    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    invoke-direct {v0, p1, v1, v2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->create()Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    move-result-object p1

    return-object p1
.end method

.method public final confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3430
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    .line 3431
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3437
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    .line 3438
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final externalPaymentMethodConfirmHandler(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3422
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    .line 3423
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->externalPaymentMethodConfirmHandler(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final getPaymentOptionResultCallback$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;
    .locals 1

    .line 3401
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    return-object v0
.end method

.method public final getResultCallback$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;
    .locals 1

    .line 3400
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    return-object v0
.end method

.method public final preparePaymentMethodHandler(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3464
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    .line 3465
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->preparePaymentMethodHandler(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final shopPayHandlers(Lcom/stripe/android/paymentsheet/ShopPayHandlers;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;
    .locals 1

    const-string v0, "handlers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3453
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    .line 3454
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->shopPayHandlers(Lcom/stripe/android/paymentsheet/ShopPayHandlers;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

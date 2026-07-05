.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cJ\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0015H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\r\u0010\u0016\u001a\u00020\u0017H\u0007\u00a2\u0006\u0002\u0010\u001cJ\u0008\u0010\u001d\u001a\u00020\u001eH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;",
        "",
        "resultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "getResultCallback$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
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
        "preparePaymentMethodHandler",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "build",
        "Lcom/stripe/android/paymentsheet/PaymentSheet;",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet;",
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

.field private final resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1

    const-string v0, "resultCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    .line 294
    new-instance p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-direct {p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-void
.end method

.method private final initializeCallbacks()V
    .locals 2

    .line 375
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->build()Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;->access$setPaymentSheetCallbacks(Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V

    return-void
.end method


# virtual methods
.method public final analyticEventCallback(Lcom/stripe/android/paymentelement/AnalyticEventCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    .line 326
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->analyticEventCallback(Lcom/stripe/android/paymentelement/AnalyticEventCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final build(Landroidx/activity/ComponentActivity;)Lcom/stripe/android/paymentsheet/PaymentSheet;
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->initializeCallbacks()V

    .line 347
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet;

    new-instance v1, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    return-object v0
.end method

.method public final build(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet;
    .locals 3

    const v0, -0x3c66c00c

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.PaymentSheet.Builder.build (PaymentSheet.kt:363)"

    .line 364
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 369
    :cond_0
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->build()Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object p2

    .line 370
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    const/4 v1, 0x0

    .line 368
    invoke-static {p2, v0, p1, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetComposeKt;->internalRememberPaymentSheet(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet;

    move-result-object p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method public final build(Landroidx/fragment/app/Fragment;)Lcom/stripe/android/paymentsheet/PaymentSheet;
    .locals 3

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->initializeCallbacks()V

    .line 357
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet;

    new-instance v1, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V

    return-object v0
.end method

.method public final confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    .line 310
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    .line 318
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final externalPaymentMethodConfirmHandler(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    .line 301
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->externalPaymentMethodConfirmHandler(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

.method public final getResultCallback$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->resultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    return-object v0
.end method

.method public final preparePaymentMethodHandler(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    .line 337
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->callbacksBuilder:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->preparePaymentMethodHandler(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    return-object p0
.end method

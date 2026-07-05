.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;
.super Ljava/lang/Object;
.source "FlowControllerConfigurationHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFlowControllerConfigurationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowControllerConfigurationHandler.kt\ncom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001+BC\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0008\u0001\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J.\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!J.\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0082@\u00a2\u0006\u0002\u0010#J&\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(H\u0082@\u00a2\u0006\u0002\u0010)J\u0008\u0010*\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
        "",
        "paymentElementLoader",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
        "uiContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
        "paymentSelectionUpdater",
        "Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;",
        "isLiveModeProvider",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;Lkotlin/jvm/functions/Function0;)V",
        "job",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lkotlinx/coroutines/Job;",
        "didLastConfigurationFail",
        "isConfigured",
        "()Z",
        "configure",
        "",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "initializedViaCompose",
        "callback",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;",
        "configureInternal",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onInitSuccess",
        "state",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
        "configureRequest",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;",
        "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "resetJob",
        "ConfigureRequest",
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
.field private didLastConfigurationFail:Z

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final isLiveModeProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final job:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentElementLoader:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;

.field private final paymentSelectionUpdater:Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;

.field private final uiContext:Lkotlin/coroutines/CoroutineContext;

.field private final viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "isLiveMode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            "Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "paymentElementLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSelectionUpdater"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLiveModeProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->paymentElementLoader:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;

    .line 26
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->uiContext:Lkotlin/coroutines/CoroutineContext;

    .line 27
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 28
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    .line 29
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->paymentSelectionUpdater:Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;

    .line 30
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    .line 33
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->job:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic access$configureInternal(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 23
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$configureInternal$onConfigured(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 23
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal$onConfigured(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel$p(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    return-object p0
.end method

.method public static final synthetic access$onInitSuccess(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->onInitSuccess(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$resetJob(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->resetJob()V

    return-void
.end method

.method public static final synthetic access$setDidLastConfigurationFail$p(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Z)V
    .locals 0

    .line 23
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->didLastConfigurationFail:Z

    return-void
.end method

.method private final configureInternal(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Z",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p5, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 63
    iget v0, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    move-object p4, p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

    iget-object p2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p4, p0

    move-object v2, p1

    goto/16 :goto_3

    :pswitch_1
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p4, p0

    goto/16 :goto_4

    :pswitch_2
    iget-object p1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;

    iget-object p2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$2:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

    iget-object p2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object p3, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$0:Ljava/lang/Object;

    check-cast p3, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p5, Lkotlin/Result;

    invoke-virtual {p5}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p5

    move-object v2, p3

    move-object p3, p2

    move-object p2, v2

    move-object v2, p4

    move-object p4, p0

    goto/16 :goto_2

    :pswitch_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p4, p0

    goto :goto_1

    :pswitch_4
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p4, p0

    goto/16 :goto_6

    :pswitch_5
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 78
    :try_start_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;->validate()V

    .line 79
    invoke-static {p2}, Lcom/stripe/android/common/model/CommonConfigurationKt;->asCommonConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object p5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p5, v0}, Lcom/stripe/android/common/model/CommonConfiguration;->validate(Z)V

    .line 80
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p5

    invoke-static {p5}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->parseAppearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    new-instance p5, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;

    invoke-direct {p5, p1, p2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;-><init>(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    .line 87
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getPreviousConfigureRequest()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;

    move-result-object v0

    invoke-static {v0, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x2

    .line 90
    iput p1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p4

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal$onConfigured$default(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p4, v1

    if-ne p1, v7, :cond_1

    goto/16 :goto_5

    .line 91
    :cond_1
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_2
    move-object v2, p4

    move-object p4, p0

    .line 94
    iget-object v0, p4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->resetSession()V

    .line 96
    iget-object v0, p4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->paymentElementLoader:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;

    .line 98
    invoke-static {p2}, Lcom/stripe/android/common/model/CommonConfigurationKt;->asCommonConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v3

    .line 99
    new-instance v5, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;

    const/4 v6, 0x0

    invoke-direct {v5, v6, p3}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;-><init>(ZZ)V

    .line 96
    iput-object p4, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$0:Ljava/lang/Object;

    iput-object p2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$1:Ljava/lang/Object;

    iput-object v2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$2:Ljava/lang/Object;

    iput-object p5, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$3:Ljava/lang/Object;

    const/4 p3, 0x3

    iput p3, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    invoke-interface {v0, p1, v3, v5, v4}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;->load-BWLJW6A(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_3

    goto/16 :goto_5

    :cond_3
    move-object p3, p5

    move-object p5, p1

    move-object p1, p3

    move-object p3, p2

    move-object p2, p4

    .line 103
    :goto_2
    invoke-static {p5}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_6

    check-cast p5, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;

    .line 105
    invoke-virtual {p5}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getValidationError()Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 106
    invoke-virtual {p5}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;->getValidationError()Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$1:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$2:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$3:Ljava/lang/Object;

    const/4 p3, 0x4

    iput p3, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    invoke-static {p2, v2, p1, v4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal$onConfigured(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_7

    goto :goto_5

    .line 108
    :cond_4
    iget-object v0, p2, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->setPreviousConfigureRequest(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)V

    .line 109
    new-instance v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    invoke-direct {v0, p5}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;-><init>(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V

    iput-object p2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$0:Ljava/lang/Object;

    iput-object v2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$1:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$2:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$3:Ljava/lang/Object;

    const/4 p5, 0x5

    iput p5, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    invoke-direct {p2, v0, p3, p1, v4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->onInitSuccess(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_5

    goto :goto_5

    .line 110
    :cond_5
    :goto_3
    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$1:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal$onConfigured$default(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_7

    goto :goto_5

    .line 114
    :cond_6
    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$1:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$2:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->L$3:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    invoke-static {p2, v2, v0, v4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal$onConfigured(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_7

    goto :goto_5

    .line 117
    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catch_0
    move-exception v0

    move-object v2, p4

    move-object p4, p0

    move-object p1, v0

    .line 82
    check-cast p1, Ljava/lang/Throwable;

    const/4 p2, 0x1

    iput p2, v4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$1;->label:I

    invoke-static {p0, v2, p1, v4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal$onConfigured(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_8

    :goto_5
    return-object v7

    .line 83
    :cond_8
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static final configureInternal$onConfigured(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$onConfigured$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configureInternal$onConfigured$2;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Ljava/lang/Throwable;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static synthetic configureInternal$onConfigured$default(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 69
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->configureInternal$onConfigured(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final onInitSuccess(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 124
    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object p3

    instance-of v5, p3, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    .line 126
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 127
    invoke-static {p2}, Lcom/stripe/android/common/model/CommonConfigurationKt;->asCommonConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v1

    .line 128
    invoke-static {p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEventKt;->primaryButtonColorUsage(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p3

    .line 129
    new-instance v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$PaymentSheet;

    invoke-direct {v2, p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload$PaymentSheet;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    move-object v3, v2

    .line 131
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v2

    .line 128
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p3

    .line 129
    move-object v4, v3

    check-cast v4, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;

    move-object v3, p3

    .line 126
    invoke-interface/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onInit(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;Z)V

    .line 134
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->paymentSelectionUpdater:Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;

    .line 135
    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v1

    .line 136
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getState()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;

    move-result-object v2

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;->getConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v6

    .line 139
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getWalletButtonsRendered()Z

    move-result v5

    move-object v3, p1

    move-object v4, p2

    .line 134
    invoke-interface/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/flowcontroller/PaymentSelectionUpdater;->invoke(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Z)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->setPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 142
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance p2, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$onInitSuccess$2;

    invoke-direct {p2, p0, v3, v4, v6}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$onInitSuccess$2;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function2;

    invoke-static {p1, p2, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final resetJob()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->job:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final configure(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V
    .locals 8

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializationMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->job:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    new-instance v1, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$oldJob$1;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$oldJob$1;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    .line 50
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/Job;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 60
    invoke-static {p1, p3, p2, p3}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final isConfigured()Z
    .locals 3

    .line 39
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->job:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/Job;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isCompleted()Z

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    .line 40
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->didLastConfigurationFail:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    return v2
.end method

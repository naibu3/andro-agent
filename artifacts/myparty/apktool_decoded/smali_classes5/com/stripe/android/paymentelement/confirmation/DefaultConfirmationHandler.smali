.class public final Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;
.super Ljava/lang/Object;
.source "DefaultConfirmationHandler.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;,
        Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Companion;,
        Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultConfirmationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultConfirmationHandler.kt\ncom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n263#1:305\n1863#2,2:303\n*S KotlinDebug\n*F\n+ 1 DefaultConfirmationHandler.kt\ncom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler\n*L\n103#1:305\n68#1:303,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 C2\u00020\u0001:\u0003ABCBE\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0096@\u00a2\u0006\u0002\u0010%J\u0010\u0010&\u001a\u0004\u0018\u00010\'H\u0096@\u00a2\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0082@\u00a2\u0006\u0002\u0010%J6\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0016\u0010/\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0004H\u0082@\u00a2\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\'H\u0002J \u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\u0008\u0010:\u001a\u00020\u001dH\u0002J\n\u0010;\u001a\u0004\u0018\u00010\u0010H\u0002J\u000c\u0010<\u001a\u00020.*\u00020$H\u0002J\u001e\u0010=\u001a\u0002H>\"\u0006\u0008\u0000\u0010>\u0018\u0001*\u0006\u0012\u0002\u0008\u00030?H\u0082H\u00a2\u0006\u0002\u0010@R$\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0019X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006D"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "mediators",
        "",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "ioContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "isInitiallyAwaitingForResultData",
        "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;",
        "hasReloadedFromProcessDeath",
        "",
        "getHasReloadedFromProcessDeath",
        "()Z",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "register",
        "",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "start",
        "arguments",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;",
        "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "awaitResult",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirm",
        "handleMediatorAction",
        "confirmationOption",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
        "parameters",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
        "mediator",
        "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onResult",
        "result",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;",
        "onHandlerResult",
        "storeIsAwaitingForResult",
        "key",
        "",
        "option",
        "receivesResultInProcess",
        "removeIsAwaitingForResult",
        "retrieveIsAwaitingForResultData",
        "toParameters",
        "firstInstanceOf",
        "T",
        "Lkotlinx/coroutines/flow/Flow;",
        "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "AwaitingConfirmationResultData",
        "Factory",
        "Companion",
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
.field public static final $stable:I

.field private static final AWAITING_CONFIRMATION_RESULT_KEY:Ljava/lang/String; = "AwaitingConfirmationResult"

.field public static final Companion:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Companion;


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final hasReloadedFromProcessDeath:Z

.field private final ioContext:Lkotlin/coroutines/CoroutineContext;

.field private final isInitiallyAwaitingForResultData:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;

.field private final mediators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator<",
            "****>;>;"
        }
    .end annotation
.end field

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->Companion:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator<",
            "****>;>;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "mediators"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->mediators:Ljava/util/List;

    .line 29
    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 30
    iput-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 31
    iput-object p4, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 32
    iput-object p5, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->ioContext:Lkotlin/coroutines/CoroutineContext;

    .line 34
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->retrieveIsAwaitingForResultData()Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->isInitiallyAwaitingForResultData:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;

    if-eqz p1, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 36
    :goto_0
    iput-boolean p3, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->hasReloadedFromProcessDeath:Z

    if-eqz p1, :cond_1

    .line 40
    new-instance p3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;->getConfirmationOption()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)V

    .line 39
    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;

    goto :goto_1

    .line 41
    :cond_1
    sget-object p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Idle;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Idle;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;

    .line 38
    :goto_1
    invoke-static {p3}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 43
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 46
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->getHasReloadedFromProcessDeath()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 47
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$1;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_2
    return-void
.end method

.method public static final synthetic access$confirm(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->confirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMediators$p(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;)Ljava/util/List;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->mediators:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$handleMediatorAction(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->handleMediatorAction(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isInitiallyAwaitingForResultData$p(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;)Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->isInitiallyAwaitingForResultData:Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;

    return-object p0
.end method

.method public static final synthetic access$onHandlerResult(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->onHandlerResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V

    return-void
.end method

.method public static final synthetic access$onResult(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->onResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;)V

    return-void
.end method

.method public static final synthetic access$retrieveIsAwaitingForResultData(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;)Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->retrieveIsAwaitingForResultData()Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;

    move-result-object p0

    return-object p0
.end method

.method private final confirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 113
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;->getConfirmationOption()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object v0

    .line 115
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;->getConfirmationOption()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 117
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->toParameters(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;

    move-result-object p1

    .line 119
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->mediators:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;

    .line 120
    invoke-virtual {v3, v0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;->canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 119
    :goto_0
    check-cast v2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;

    if-nez v2, :cond_2

    .line 121
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;

    .line 122
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 125
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 126
    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    .line 127
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 128
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Attempting to confirm intent for invalid confirmation option: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 127
    invoke-direct {p2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    .line 126
    invoke-virtual {p1, p2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 122
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 134
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    .line 135
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempted to confirm invalid "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " confirmation type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 135
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    .line 138
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_something_went_wrong:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 139
    sget-object v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Internal;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Internal;

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;

    .line 134
    invoke-direct {p1, p2, v0, v1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    .line 133
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->onHandlerResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V

    .line 143
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 146
    :cond_2
    invoke-direct {p0, v0, p1, v2, p2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->handleMediatorAction(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final synthetic firstInstanceOf(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/Flow<",
            "*>;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 263
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$firstInstanceOf$2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$firstInstanceOf$2;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {p1, v0, p2}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    const-string v0, "T"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Object;

    return-object p1
.end method

.method private final handleMediatorAction(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator<",
            "****>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 149
    iget v2, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->L$2:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;

    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    iget-object p2, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 154
    iget-object p4, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->ioContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$action$1;

    const/4 v4, 0x0

    invoke-direct {v2, p3, p1, p2, v4}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$action$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$handleMediatorAction$1;->label:I

    invoke-static {p4, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p2, p0

    .line 149
    :goto_1
    check-cast p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;

    .line 158
    instance-of v0, p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;

    if-eqz v0, :cond_4

    .line 160
    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;->getKey()Ljava/lang/String;

    move-result-object p3

    .line 162
    check-cast p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;

    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;->getReceivesResultInProcess()Z

    move-result v0

    .line 159
    invoke-direct {p2, p3, p1, v0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->storeIsAwaitingForResult(Ljava/lang/String;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Z)V

    .line 165
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;->getLaunch()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_2

    .line 167
    :cond_4
    instance-of p1, p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Fail;

    if-eqz p1, :cond_5

    .line 169
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    .line 170
    check-cast p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Fail;

    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Fail;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    .line 171
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Fail;->getMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 172
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Fail;->getErrorType()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;

    move-result-object p4

    .line 169
    invoke-direct {p1, p3, v0, p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    .line 168
    invoke-direct {p2, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->onHandlerResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V

    goto :goto_2

    .line 176
    :cond_5
    instance-of p1, p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Complete;

    if-eqz p1, :cond_6

    .line 178
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;

    .line 179
    check-cast p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Complete;

    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Complete;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p3

    .line 180
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Complete;->getDeferredIntentConfirmationType()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    move-result-object v0

    .line 181
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Complete;->getCompletedFullPaymentFlow()Z

    move-result p4

    .line 178
    invoke-direct {p1, p3, v0, p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    .line 177
    invoke-direct {p2, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->onHandlerResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V

    .line 186
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 157
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final onHandlerResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V
    .locals 2

    .line 228
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 230
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->removeIsAwaitingForResult()V

    return-void
.end method

.method private final onResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;)V
    .locals 7

    .line 190
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;

    if-eqz v0, :cond_0

    .line 191
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->removeIsAwaitingForResult()V

    .line 193
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$onResult$confirmationResult$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void

    .line 209
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;

    .line 210
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    .line 211
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;->getDeferredIntentConfirmationType()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    move-result-object v2

    .line 212
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;->getCompletedFullPaymentFlow()Z

    move-result p1

    .line 209
    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    goto :goto_0

    .line 214
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;

    if-eqz v0, :cond_2

    .line 215
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 216
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;->getType()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;

    move-result-object v1

    .line 217
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;->getMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    .line 214
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    invoke-direct {v2, v0, p1, v1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V

    move-object v0, v2

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    goto :goto_0

    .line 219
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;

    .line 220
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;->getAction()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;

    move-result-object p1

    .line 219
    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    .line 224
    :goto_0
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->onHandlerResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V

    return-void

    .line 189
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final removeIsAwaitingForResult()V
    .locals 2

    .line 246
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "AwaitingConfirmationResult"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method private final retrieveIsAwaitingForResultData()Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;
    .locals 2

    .line 250
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "AwaitingConfirmationResult"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;

    return-object v0
.end method

.method private final storeIsAwaitingForResult(Ljava/lang/String;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Z)V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;

    invoke-direct {v1, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Z)V

    const-string p1, "AwaitingConfirmationResult"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final toParameters(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;
    .locals 4

    .line 255
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v0

    .line 256
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v1

    .line 257
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v2

    .line 258
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    .line 254
    new-instance v3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;

    invoke-direct {v3, p1, v0, v2, v1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-object v3
.end method


# virtual methods
.method public awaitResult(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 98
    iget v2, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 99
    iget-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;

    .line 100
    instance-of v2, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Idle;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    return-object v4

    .line 101
    :cond_3
    instance-of v2, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;

    if-eqz v2, :cond_4

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;->getResult()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    move-result-object p1

    return-object p1

    .line 102
    :cond_4
    instance-of p1, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    if-eqz p1, :cond_7

    .line 103
    iget-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 305
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1;

    invoke-direct {v2, v4}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$awaitResult$1;->label:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;

    .line 105
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;->getResult()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    move-result-object p1

    return-object p1

    .line 305
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.stripe.android.paymentelement.confirmation.ConfirmationHandler.State.Complete"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 99
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public getHasReloadedFromProcessDeath()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->hasReloadedFromProcessDeath:Z

    return v0
.end method

.method public getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 3

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->mediators:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 303
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;

    .line 69
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$1$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, p1, v2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;->register(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 72
    :cond_0
    invoke-interface {p2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    .line 73
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2;

    invoke-direct {p2, p0}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$register$2;-><init>(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;)V

    check-cast p2, Landroidx/lifecycle/LifecycleObserver;

    .line 72
    invoke-virtual {p1, p2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void
.end method

.method public start(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    invoke-interface {v0}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$start$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$start$2;-><init>(Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

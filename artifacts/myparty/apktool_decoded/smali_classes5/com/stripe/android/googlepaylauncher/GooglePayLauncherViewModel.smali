.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "GooglePayLauncherViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGooglePayLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ResultKtx.kt\ncom/stripe/android/utils/ResultKtxKt\n*L\n1#1,345:1\n1#2:346\n6#3,3:347\n*S KotlinDebug\n*F\n+ 1 GooglePayLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel\n*L\n186#1:347,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 P2\u00020\u0001:\u0002OPBW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!J\u000e\u0010.\u001a\u00020\u0019H\u0087@\u00a2\u0006\u0002\u0010/J\u001e\u00100\u001a\u0008\u0012\u0004\u0012\u000202012\u0006\u0010\u0006\u001a\u00020\u0007H\u0087@\u00a2\u0006\u0004\u00083\u00104J7\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002022\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\u0008\u0002\u0010<\u001a\u0004\u0018\u000102H\u0001\u00a2\u0006\u0004\u0008=\u0010>J\u001c\u0010?\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020(0\'01H\u0082@\u00a2\u0006\u0004\u0008@\u0010/J\u0016\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EJ\u0016\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JJ \u0010K\u001a\u00020!2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0081@\u00a2\u0006\u0004\u0008L\u0010MJ\u0006\u0010N\u001a\u00020,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0#X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u001c\u0010&\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\'0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010)\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\'0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010%\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "paymentsClient",
        "Lcom/google/android/gms/wallet/PaymentsClient;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "args",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "paymentController",
        "Lcom/stripe/android/PaymentController;",
        "googlePayJsonFactory",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "googlePayRepository",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "value",
        "",
        "hasLaunched",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "_googleResult",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
        "googlePayResult",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getGooglePayResult$payments_core_release",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "_googlePayLaunchTask",
        "Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/wallet/PaymentData;",
        "googlePayLaunchTask",
        "getGooglePayLaunchTask",
        "updateResult",
        "",
        "result",
        "isReadyToPay",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentDataRequest",
        "Lkotlin/Result;",
        "",
        "createPaymentDataRequest-gIAlu-s",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createTransactionInfo",
        "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "currencyCode",
        "amount",
        "",
        "label",
        "createTransactionInfo$payments_core_release",
        "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;",
        "resolveLoadPaymentDataTask",
        "resolveLoadPaymentDataTask-IoAF18A",
        "confirmStripeIntent",
        "host",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "params",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "onConfirmResult",
        "requestCode",
        "",
        "data",
        "Landroid/content/Intent;",
        "getResultFromConfirmation",
        "getResultFromConfirmation$payments_core_release",
        "(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "markTaskAsLaunched",
        "Factory",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;

.field public static final HAS_LAUNCHED_KEY:Ljava/lang/String; = "has_launched"


# instance fields
.field private final _googlePayLaunchTask:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;>;"
        }
    .end annotation
.end field

.field private final _googleResult:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

.field private final googlePayLaunchTask:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;>;"
        }
    .end annotation
.end field

.field private final googlePayRepository:Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

.field private final googlePayResult:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentController:Lcom/stripe/android/PaymentController;

.field private final paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

.field private final requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "paymentsClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentController"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayJsonFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

    .line 47
    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 48
    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    .line 49
    iput-object p4, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 50
    iput-object p5, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    .line 51
    iput-object p6, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    .line 52
    iput-object p7, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayRepository:Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    .line 53
    iput-object p8, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 54
    iput-object p9, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 55
    iput-object p10, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x6

    .line 66
    invoke-static {p1, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googleResult:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 67
    invoke-static {p5}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayResult:Lkotlinx/coroutines/flow/SharedFlow;

    .line 69
    invoke-static {p1, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googlePayLaunchTask:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 70
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayLaunchTask:Lkotlinx/coroutines/flow/SharedFlow;

    .line 73
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p4

    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$1;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    const/4 p8, 0x2

    const/4 p9, 0x0

    const/4 p6, 0x0

    move-object p5, p10

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    return-object p0
.end method

.method public static final synthetic access$getHasLaunched(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Z
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->getHasLaunched()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getPaymentController$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/PaymentController;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    return-object p0
.end method

.method public static final synthetic access$getRequestOptions$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-object p0
.end method

.method public static final synthetic access$get_googlePayLaunchTask$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googlePayLaunchTask:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method public static final synthetic access$get_googleResult$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googleResult:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method public static final synthetic access$resolveLoadPaymentDataTask-IoAF18A(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->resolveLoadPaymentDataTask-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createTransactionInfo$payments_core_release$default(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 150
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->createTransactionInfo$payments_core_release(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    move-result-object p0

    return-object p0
.end method

.method private final getHasLaunched()Z
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "has_launched"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final resolveLoadPaymentDataTask-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;

    iget v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 183
    iget v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_3
    iget-object v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 184
    :try_start_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    .line 185
    iput-object p0, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->label:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->isReadyToPay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object v2, p0

    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 186
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 184
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    .line 185
    :cond_6
    const-string p1, "Google Pay is unavailable."

    new-instance v6, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception p1

    move-object v2, p0

    .line 184
    :goto_2
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 347
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_7

    .line 348
    check-cast p1, Lkotlin/Unit;

    .line 187
    iget-object p1, v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iput-object v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->label:I

    invoke-virtual {v2, p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->createPaymentDataRequest-gIAlu-s(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_6

    .line 349
    :cond_7
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v6}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 188
    :cond_8
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    :try_start_3
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Ljava/lang/String;

    .line 189
    invoke-static {p1}, Lcom/google/android/gms/wallet/PaymentDataRequest;->fromJson(Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentDataRequest;

    move-result-object p1

    .line 188
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception p1

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_9
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 190
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/google/android/gms/wallet/PaymentDataRequest;

    .line 191
    iget-object v2, v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/wallet/PaymentsClient;->loadPaymentData(Lcom/google/android/gms/wallet/PaymentDataRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v2, "loadPaymentData(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1;->label:I

    invoke-static {p1, v2, v0, v5, v2}, Lcom/stripe/android/googlepaylauncher/TasksKt;->awaitTask$default(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_6
    return-object v1

    :cond_a
    :goto_7
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    .line 190
    :cond_b
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final setHasLaunched(Z)V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "has_launched"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final confirmStripeIntent(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;)V
    .locals 7

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p2, p1, v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/view/AuthActivityStarterHost;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final createPaymentDataRequest-gIAlu-s(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;

    iget v4, v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v3

    iget-object v2, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 98
    iget v4, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v12, :cond_2

    if-ne v4, v11, :cond_1

    iget-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iget-object v3, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iget-object v3, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 103
    instance-of v2, v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;

    if-eqz v2, :cond_7

    .line 104
    iget-object v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 105
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;

    invoke-virtual {v2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 106
    iget-object v6, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 104
    iput-object v0, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    iput-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    iput v12, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    const/4 v7, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/networking/StripeRepository$DefaultImpls;->retrievePaymentIntent-BWLJW6A$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v3, v0

    .line 107
    :goto_1
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v2, Lcom/stripe/android/model/PaymentIntent;

    .line 109
    move-object v4, v2

    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    .line 110
    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    const-string v2, ""

    :cond_5
    move-object v5, v2

    .line 111
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;

    invoke-virtual {v2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;->getLabel$payments_core_release()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    .line 108
    invoke-static/range {v3 .. v9}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->createTransactionInfo$payments_core_release$default(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    move-result-object v2

    .line 107
    :cond_6
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_4

    .line 115
    :cond_7
    instance-of v2, v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    if-eqz v2, :cond_d

    .line 116
    iget-object v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 117
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    invoke-virtual {v2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 118
    iget-object v6, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 116
    iput-object v0, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    iput-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    iput v11, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    const/4 v7, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/networking/StripeRepository$DefaultImpls;->retrieveSetupIntent-BWLJW6A$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    :goto_2
    return-object v3

    :cond_8
    move-object v3, v0

    .line 119
    :goto_3
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v2, Lcom/stripe/android/model/SetupIntent;

    .line 121
    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    .line 122
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;->getCurrencyCode$payments_core_release()Ljava/lang/String;

    move-result-object v5

    .line 123
    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;->getAmount$payments_core_release()Ljava/lang/Long;

    move-result-object v6

    .line 124
    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;->getLabel$payments_core_release()Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-virtual {v3, v2, v5, v6, v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->createTransactionInfo$payments_core_release(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    move-result-object v2

    .line 119
    :cond_9
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 130
    :goto_4
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v14, v2

    check-cast v14, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    .line 131
    iget-object v13, v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    .line 133
    new-instance v2, Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;

    .line 134
    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getMerchantName()Ljava/lang/String;

    move-result-object v3

    .line 133
    invoke-direct {v2, v3}, Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;-><init>(Ljava/lang/String;)V

    .line 136
    new-instance v15, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    .line 137
    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;->isRequired$payments_core_release()Z

    move-result v3

    .line 138
    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;->getFormat$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;->ordinal()I

    move-result v4

    aget v4, v5, v4

    if-eq v4, v12, :cond_b

    if-ne v4, v11, :cond_a

    .line 140
    sget-object v4, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;->Full:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;

    goto :goto_5

    .line 138
    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 139
    :cond_b
    sget-object v4, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;->Min:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;

    .line 142
    :goto_5
    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;->isPhoneNumberRequired$payments_core_release()Z

    move-result v5

    .line 136
    invoke-direct {v15, v3, v4, v5}, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;-><init>(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V

    .line 144
    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->isEmailRequired()Z

    move-result v17

    .line 145
    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getAllowCreditCards()Z

    move-result v1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v19

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v2

    .line 131
    invoke-static/range {v13 .. v21}, Lcom/stripe/android/GooglePayJsonFactory;->createPaymentDataRequest$default(Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;ZLcom/stripe/android/GooglePayJsonFactory$MerchantInfo;Ljava/lang/Boolean;ILjava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 146
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 130
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_c
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 102
    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final createTransactionInfo$payments_core_release(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;
    .locals 10

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currencyCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_0

    .line 159
    new-instance v1, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    .line 161
    sget-object v3, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Final:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    .line 162
    iget-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getMerchantCountryCode()Ljava/lang/String;

    move-result-object v4

    .line 163
    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getId()Ljava/lang/String;

    move-result-object v5

    .line 164
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x0

    .line 166
    sget-object v8, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;->CompleteImmediatePurchase:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;

    move-object v2, p2

    .line 159
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;-><init>(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)V

    return-object v1

    :cond_0
    move-object v2, p2

    .line 169
    instance-of p2, p1, Lcom/stripe/android/model/SetupIntent;

    if-eqz p2, :cond_2

    move-object v3, v2

    .line 170
    new-instance v2, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    .line 172
    sget-object v4, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Estimated:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    .line 173
    iget-object p2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getMerchantCountryCode()Ljava/lang/String;

    move-result-object v5

    .line 174
    check-cast p1, Lcom/stripe/android/model/SetupIntent;

    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getId()Ljava/lang/String;

    move-result-object v6

    if-eqz p3, :cond_1

    .line 175
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    const-wide/16 p1, 0x0

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 177
    sget-object v9, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;->Default:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;

    move-object v8, p4

    .line 170
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;-><init>(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)V

    return-object v2

    .line 157
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getGooglePayLaunchTask()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;>;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayLaunchTask:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getGooglePayResult$payments_core_release()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayResult:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getResultFromConfirmation$payments_core_release(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;

    iget v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 231
    iget v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 237
    iget-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    invoke-interface {p3, p1, p2}, Lcom/stripe/android/PaymentController;->shouldHandlePaymentResult(ILandroid/content/Intent;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 238
    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    iput v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    invoke-interface {p1, p2, v0}, Lcom/stripe/android/PaymentController;->getPaymentIntentResult-gIAlu-s(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    .line 240
    :cond_4
    iget-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    invoke-interface {p3, p1, p2}, Lcom/stripe/android/PaymentController;->shouldHandleSetupResult(ILandroid/content/Intent;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 241
    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    iput v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    invoke-interface {p1, p2, v0}, Lcom/stripe/android/PaymentController;->getSetupIntentResult-gIAlu-s(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    .line 244
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Unexpected confirmation result."

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 245
    iget-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 246
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    check-cast v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 247
    sget-object v1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {v1, p2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    .line 248
    const-string v2, "request_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 245
    invoke-interface {p3, v0, v1, p1}, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->report(Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V

    .line 250
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 254
    :cond_6
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    check-cast p1, Lcom/stripe/android/StripeIntentResult;

    .line 255
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;->INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    return-object p1

    .line 256
    :cond_7
    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    invoke-direct {p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;

    return-object p1
.end method

.method public final isReadyToPay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayRepository:Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    invoke-interface {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;->isReady()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final markTaskAsLaunched()V
    .locals 2

    const/4 v0, 0x1

    .line 261
    invoke-direct {p0, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->setHasLaunched(Z)V

    .line 262
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googlePayLaunchTask:Lkotlinx/coroutines/flow/MutableSharedFlow;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onConfirmResult(ILandroid/content/Intent;)V
    .locals 7

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$onConfirmResult$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, p2, v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$onConfirmResult$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googleResult:Lkotlinx/coroutines/flow/MutableSharedFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void
.end method

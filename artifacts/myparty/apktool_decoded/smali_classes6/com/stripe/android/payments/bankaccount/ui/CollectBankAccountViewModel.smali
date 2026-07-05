.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "CollectBankAccountViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;,
        Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCollectBankAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountViewModel.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 ;2\u00020\u0001:\u0002:;BG\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u0007\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020$J\u0016\u0010%\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020&H\u0082@\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020,H\u0002J\u000e\u0010-\u001a\u0004\u0018\u00010.*\u00020/H\u0002J\u001e\u00100\u001a\u00020\u001e2\u0014\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020402H\u0002J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0002J\u0016\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0082@\u00a2\u0006\u0002\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006<"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "args",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "_viewEffect",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
        "createFinancialConnectionsSession",
        "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
        "attachFinancialConnectionsSession",
        "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
        "retrieveStripeIntent",
        "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V",
        "value",
        "",
        "hasLaunched",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "viewEffect",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getViewEffect",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onConnectionsForACHResult",
        "result",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
        "onConnectionsForInstantDebitsResult",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;",
        "finishWithResult",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;",
        "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "finishWithSession",
        "financialConnectionsSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "finishWithPaymentMethodId",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;",
        "parsePaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "",
        "finishWithRefreshedIntent",
        "action",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/model/StripeIntent;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;",
        "attachSessionToIntent",
        "finishWithError",
        "throwable",
        "",
        "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

.field public static final Companion:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;

.field private static final KEY_HAS_LAUNCHED:Ljava/lang/String; = "key_has_launched"


# instance fields
.field private final _viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

.field private final attachFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

.field private final createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final retrieveStripeIntent:Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final viewEffect:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$X44aOgO-nRyIrITMRWpgwifWP4o(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithSession$lambda$3(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$k_ncs1uKpPewQkkC9SEpsGEZhZI(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithPaymentMethodId$lambda$5(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->Companion:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/core/Logger;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_viewEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createFinancialConnectionsSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachFinancialConnectionsSession"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrieveStripeIntent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    .line 45
    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->_viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 47
    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    .line 48
    iput-object p4, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->attachFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    .line 49
    iput-object p5, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->retrieveStripeIntent:Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    .line 50
    iput-object p6, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 51
    iput-object p7, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 58
    check-cast p2, Lkotlinx/coroutines/flow/SharedFlow;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->viewEffect:Lkotlinx/coroutines/flow/SharedFlow;

    .line 61
    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->getHasLaunched()Z

    move-result p1

    if-nez p1, :cond_0

    .line 62
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p2

    new-instance p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$1;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    const/4 p6, 0x3

    const/4 p7, 0x0

    const/4 p4, 0x0

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_0
    return-void
.end method

.method public static final synthetic access$attachSessionToIntent(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->attachSessionToIntent(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    return-void
.end method

.method public static final synthetic access$createFinancialConnectionsSession(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$finishWithError(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$finishWithPaymentMethodId(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithPaymentMethodId(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;)V

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$finishWithSession(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithSession(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    return-void
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    return-object p0
.end method

.method public static final synthetic access$getAttachFinancialConnectionsSession$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->attachFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getRetrieveStripeIntent$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->retrieveStripeIntent:Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    return-object p0
.end method

.method private final attachSessionToIntent(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 7

    .line 242
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachSessionToIntent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachSessionToIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final createFinancialConnectionsSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;

    iget v3, v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v14, v2

    iget-object v0, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 68
    iget v3, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    const/4 v15, 0x1

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v2, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget-object v3, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iget-object v5, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object v3, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_2

    :pswitch_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    .line 70
    instance-of v3, v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    if-eqz v3, :cond_3

    .line 71
    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModelKt;->access$retrieveElementsSessionContext(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v0

    .line 72
    iget-object v3, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    .line 73
    iget-object v5, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v5, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v5}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getPublishableKey()Ljava/lang/String;

    move-result-object v5

    .line 74
    iget-object v6, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v6, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v6}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    .line 75
    iget-object v7, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v7, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v7}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getHostedSurface()Ljava/lang/String;

    move-result-object v9

    .line 76
    iget-object v7, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v7, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v7}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getElementsSessionId()Ljava/lang/String;

    move-result-object v7

    .line 77
    iget-object v8, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v8, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v8}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getCustomerId()Ljava/lang/String;

    move-result-object v8

    .line 78
    iget-object v10, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v10, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v10}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getOnBehalfOf()Ljava/lang/String;

    move-result-object v10

    if-eqz v0, :cond_1

    .line 79
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v4

    .line 80
    :goto_1
    iget-object v11, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v11, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v11}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getAmount()Ljava/lang/Integer;

    move-result-object v11

    .line 81
    iget-object v12, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v12, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;

    invoke-virtual {v12}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v12

    .line 82
    iget-object v13, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v13}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getProduct()Ljava/lang/String;

    move-result-object v13

    .line 72
    iput-object v1, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput v15, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    move-object v10, v0

    invoke-virtual/range {v3 .. v14}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->forDeferredIntent-5p_uFSQ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2

    goto/16 :goto_7

    :cond_2
    move-object v3, v1

    :goto_2
    move-object v5, v3

    goto/16 :goto_4

    .line 86
    :cond_3
    instance-of v3, v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    if-eqz v3, :cond_5

    .line 87
    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModelKt;->access$retrieveElementsSessionContext(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v0

    .line 88
    iget-object v3, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    .line 89
    iget-object v4, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v4, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    invoke-virtual {v4}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    .line 90
    iget-object v5, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v5, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    invoke-virtual {v5}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;->getStripeAccountId()Ljava/lang/String;

    move-result-object v5

    .line 91
    iget-object v6, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v6, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    invoke-virtual {v6}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;->getHostedSurface()Ljava/lang/String;

    move-result-object v9

    .line 92
    iget-object v6, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v6, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    invoke-virtual {v6}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;->getElementsSessionId()Ljava/lang/String;

    move-result-object v6

    .line 93
    iget-object v7, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v7, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    invoke-virtual {v7}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;->getCustomerId()Ljava/lang/String;

    move-result-object v7

    .line 94
    iget-object v8, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v8, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;

    invoke-virtual {v8}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;->getOnBehalfOf()Ljava/lang/String;

    move-result-object v8

    if-eqz v0, :cond_4

    .line 95
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v0

    move-object v10, v0

    goto :goto_3

    :cond_4
    const/4 v10, 0x0

    .line 98
    :goto_3
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getProduct()Ljava/lang/String;

    move-result-object v13

    .line 88
    iput-object v1, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual/range {v3 .. v14}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->forDeferredIntent-5p_uFSQ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2

    goto/16 :goto_7

    .line 102
    :cond_5
    instance-of v3, v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    if-eqz v3, :cond_6

    .line 103
    iget-object v3, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    .line 104
    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    .line 105
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    .line 106
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;->getHostedSurface()Ljava/lang/String;

    move-result-object v7

    .line 107
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 108
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object v8

    .line 103
    iput-object v1, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    move-object v9, v14

    invoke-virtual/range {v3 .. v9}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->forPaymentIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2

    goto/16 :goto_7

    .line 111
    :cond_6
    instance-of v3, v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    if-eqz v3, :cond_b

    .line 112
    iget-object v3, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->createFinancialConnectionsSession:Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    .line 113
    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    .line 114
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    .line 115
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;->getHostedSurface()Ljava/lang/String;

    move-result-object v7

    .line 116
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 117
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object v8

    .line 112
    iput-object v1, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    move-object v9, v14

    invoke-virtual/range {v3 .. v9}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->forSetupIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2

    goto/16 :goto_7

    .line 120
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/model/FinancialConnectionsSession;

    invoke-virtual {v0}, Lcom/stripe/android/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_7
    const-string v0, "Required value was null."

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    move-object v3, v0

    .line 121
    invoke-static {v3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    .line 122
    iget-object v4, v5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Bank account session created! "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 123
    invoke-direct {v5, v15}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->setHasLaunched(Z)V

    .line 125
    iget-object v4, v5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v4}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object v4

    invoke-static {v4}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModelKt;->access$retrieveElementsSessionContext(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v4

    .line 126
    iget-object v6, v5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->_viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 129
    iget-object v7, v5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v7}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getPublishableKey()Ljava/lang/String;

    move-result-object v7

    .line 130
    iget-object v8, v5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->args:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-virtual {v8}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v8

    .line 127
    new-instance v9, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;

    invoke-direct {v9, v7, v0, v8, v4}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V

    .line 126
    iput-object v5, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object v3, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x5

    iput v0, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    invoke-interface {v6, v9, v14}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    goto :goto_7

    .line 135
    :cond_9
    :goto_6
    invoke-static {v3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_a

    iput-object v3, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    const/4 v3, 0x6

    iput v3, v14, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$createFinancialConnectionsSession$1;->label:I

    invoke-direct {v5, v0, v14}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_a

    :goto_7
    return-object v2

    .line 136
    :cond_a
    :goto_8
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 69
    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final finishWithError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 282
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Ljava/lang/Throwable;

    const-string v2, "Error"

    invoke-interface {v0, v2, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 283
    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;

    invoke-direct {p0, v0, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final finishWithPaymentMethodId(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;)V
    .locals 1

    .line 192
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithRefreshedIntent(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final finishWithPaymentMethodId$lambda$5(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
    .locals 4

    .line 193
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;->getEncodedPaymentMethod()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->parsePaymentMethod(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 199
    new-instance v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    .line 201
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;->getLast4()Ljava/lang/String;

    move-result-object v2

    .line 202
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;->getBankName()Ljava/lang/String;

    move-result-object v3

    .line 203
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;->getEligibleForIncentive()Z

    move-result p1

    .line 199
    invoke-direct {v1, p0, v2, v3, p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;-><init>(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 195
    :goto_0
    new-instance p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    invoke-direct {p0, p2, v0, v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)V

    return-object p0
.end method

.method private final finishWithRefreshedIntent(Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;",
            ">;)V"
        }
    .end annotation

    .line 222
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$finishWithRefreshedIntent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$finishWithRefreshedIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 172
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->_viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;

    new-instance v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;

    invoke-direct {v1, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V

    invoke-interface {v0, v1, p2}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final finishWithSession(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 1

    .line 178
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->finishWithRefreshedIntent(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final finishWithSession$lambda$3(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
    .locals 2

    .line 179
    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    .line 181
    new-instance v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    invoke-direct {v1, p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    const/4 p0, 0x0

    .line 179
    invoke-direct {v0, p1, v1, p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)V

    return-object v0
.end method

.method private final getHasLaunched()Z
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "key_has_launched"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final parsePaymentMethod(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;
    .locals 2

    .line 211
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 212
    new-instance p1, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 215
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Failed to parse PaymentMethod"

    check-cast p1, Ljava/lang/Throwable;

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final setHasLaunched(Z)V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "key_has_launched"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getViewEffect()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->viewEffect:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 139
    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->setHasLaunched(Z)V

    .line 140
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsForACHResult$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsForACHResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 155
    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->setHasLaunched(Z)V

    .line 156
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsForInstantDebitsResult$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsForInstantDebitsResult$1;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

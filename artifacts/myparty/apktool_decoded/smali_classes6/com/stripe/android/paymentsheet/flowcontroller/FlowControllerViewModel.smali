.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;
.super Landroidx/lifecycle/AndroidViewModel;
.source "FlowControllerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;,
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 ;2\u00020\u0001:\u0002:;B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010+\u001a\u00020,2\u0016\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010%0.J\u0006\u00109\u001a\u00020,R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR(\u0010 \u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R(\u0010&\u001a\u0004\u0018\u00010%2\u0008\u0010\u001e\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u0016\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f00X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f02\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%02\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00104R\u0014\u00107\u001a\u0008\u0012\u0004\u0012\u00020,08X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
        "Landroidx/lifecycle/AndroidViewModel;",
        "application",
        "Landroid/app/Application;",
        "handle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "paymentElementCallbackIdentifier",
        "",
        "statusBarColor",
        "",
        "<init>",
        "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Integer;)V",
        "getHandle",
        "()Landroidx/lifecycle/SavedStateHandle;",
        "flowControllerStateComponent",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "getFlowControllerStateComponent",
        "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "walletButtonsRendered",
        "",
        "getWalletButtonsRendered",
        "()Z",
        "setWalletButtonsRendered",
        "(Z)V",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "setPaymentSelection",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V",
        "value",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;",
        "previousConfigureRequest",
        "getPreviousConfigureRequest",
        "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;",
        "setPreviousConfigureRequest",
        "(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)V",
        "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;",
        "state",
        "getState",
        "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;",
        "setState",
        "(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;)V",
        "updateState",
        "",
        "block",
        "Lkotlin/Function1;",
        "_configureRequest",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "configureRequest",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getConfigureRequest",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "stateFlow",
        "getStateFlow",
        "restartSession",
        "Lkotlin/Function0;",
        "resetSession",
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

.field private static final Companion:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;

.field private static final STATE_KEY:Ljava/lang/String; = "state"


# instance fields
.field private final _configureRequest:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final configureRequest:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final flowControllerStateComponent:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

.field private final handle:Landroidx/lifecycle/SavedStateHandle;

.field private volatile paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field private final restartSession:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final stateFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;",
            ">;"
        }
    .end annotation
.end field

.field private walletButtonsRendered:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->Companion:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 6

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0, p1}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 23
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/SavedStateHandle;

    .line 30
    invoke-static {}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent;->builder()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object v0

    .line 31
    invoke-interface {v0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object p1

    .line 32
    invoke-interface {p1, p4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object p1

    .line 33
    invoke-interface {p1, p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object p1

    .line 34
    invoke-interface {p1, p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->flowControllerViewModel(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object p1

    .line 35
    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->build()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->flowControllerStateComponent:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    const/4 p1, 0x0

    .line 59
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->_configureRequest:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 61
    invoke-static {p3}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->configureRequest:Lkotlinx/coroutines/flow/StateFlow;

    .line 63
    const-string p3, "state"

    invoke-virtual {p2, p3, p1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->stateFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 64
    sget-object p3, Lcom/stripe/android/analytics/SessionSavedStateHandler;->INSTANCE:Lcom/stripe/android/analytics/SessionSavedStateHandler;

    move-object p4, p0

    check-cast p4, Landroidx/lifecycle/ViewModel;

    invoke-virtual {p3, p4, p2}, Lcom/stripe/android/analytics/SessionSavedStateHandler;->attachTo(Landroidx/lifecycle/ViewModel;Landroidx/lifecycle/SavedStateHandle;)Lkotlin/jvm/functions/Function0;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->restartSession:Lkotlin/jvm/functions/Function0;

    .line 67
    invoke-static {p4}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    new-instance p2, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$1;

    invoke-direct {p2, p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public final getConfigureRequest()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->configureRequest:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getFlowControllerStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->flowControllerStateComponent:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    return-object v0
.end method

.method public final getHandle()Landroidx/lifecycle/SavedStateHandle;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/SavedStateHandle;

    return-object v0
.end method

.method public final getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final getPreviousConfigureRequest()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->_configureRequest:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;

    return-object v0
.end method

.method public final getState()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "state"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;

    return-object v0
.end method

.method public final getStateFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->stateFlow:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getWalletButtonsRendered()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->walletButtonsRendered:Z

    return v0
.end method

.method public final resetSession()V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->restartSession:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final setPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-void
.end method

.method public final setPreviousConfigureRequest(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->_configureRequest:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setState(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;)V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final setWalletButtonsRendered(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->walletButtonsRendered:Z

    return-void
.end method

.method public final updateState(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;",
            "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/SavedStateHandle;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getState()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.class public final Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;
.super Ljava/lang/Object;
.source "NavigationManager.kt"

# interfaces
.implements Lcom/stripe/android/uicore/navigation/NavigationManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010\u0013\u001a\u00020\u000cH\u0016R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "<init>",
        "()V",
        "_navigationFlow",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
        "navigationFlow",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getNavigationFlow",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "tryNavigateTo",
        "",
        "route",
        "",
        "popUpTo",
        "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;",
        "isSingleTop",
        "",
        "tryNavigateBack",
        "stripe-ui-core_release"
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
.field private final _navigationFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 59
    invoke-static {v2, v3, v0, v1, v0}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;->_navigationFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 61
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;->navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;

    return-void
.end method


# virtual methods
.method public getNavigationFlow()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;->navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public tryNavigateBack()V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;->_navigationFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    sget-object v1, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateBack;->INSTANCE:Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateBack;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void
.end method

.method public tryNavigateTo(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V
    .locals 2

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;->_navigationFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 69
    new-instance v1, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;

    invoke-direct {v1, p1, p2, p3}, Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V

    .line 68
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void
.end method

.class public final Lcom/stripe/android/link/LinkControllerCoordinator;
.super Ljava/lang/Object;
.source "LinkControllerCoordinator.kt"


# annotations
.annotation runtime Lcom/stripe/android/link/injection/LinkControllerPresenterScope;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B9\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkControllerCoordinator;",
        "",
        "interactor",
        "Lcom/stripe/android/link/LinkControllerInteractor;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "activityResultRegistryOwner",
        "Landroidx/activity/result/ActivityResultRegistryOwner;",
        "linkActivityContract",
        "Lcom/stripe/android/link/NativeLinkActivityContract;",
        "selectedPaymentMethodCallback",
        "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;",
        "authenticationCallback",
        "Lcom/stripe/android/link/LinkController$AuthenticationCallback;",
        "<init>",
        "(Lcom/stripe/android/link/LinkControllerInteractor;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V",
        "linkActivityResultLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "getLinkActivityResultLauncher",
        "()Landroidx/activity/result/ActivityResultLauncher;",
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
.field private final authenticationCallback:Lcom/stripe/android/link/LinkController$AuthenticationCallback;

.field private final interactor:Lcom/stripe/android/link/LinkControllerInteractor;

.field private final lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

.field private final linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedPaymentMethodCallback:Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;


# direct methods
.method public static synthetic $r8$lambda$BnNoUwKlUla_iCciNeOHPNBhcOQ(Lcom/stripe/android/link/LinkControllerCoordinator;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkControllerCoordinator;->_init_$lambda$0(Lcom/stripe/android/link/LinkControllerCoordinator;Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkControllerInteractor;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V
    .locals 6
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultRegistryOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkActivityContract"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedPaymentMethodCallback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticationCallback"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->interactor:Lcom/stripe/android/link/LinkControllerInteractor;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 20
    iput-object p5, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->selectedPaymentMethodCallback:Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;

    .line 21
    iput-object p6, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->authenticationCallback:Lcom/stripe/android/link/LinkController$AuthenticationCallback;

    .line 26
    invoke-interface {p2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object p1

    sget-object p5, Landroidx/lifecycle/Lifecycle$State;->INITIALIZED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {p1, p5}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 28
    invoke-interface {p3}, Landroidx/activity/result/ActivityResultRegistryOwner;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object p1

    .line 30
    check-cast p4, Landroidx/activity/result/contract/ActivityResultContract;

    .line 28
    new-instance p3, Lcom/stripe/android/link/LinkControllerCoordinator$$ExternalSyntheticLambda0;

    invoke-direct {p3, p0}, Lcom/stripe/android/link/LinkControllerCoordinator$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/LinkControllerCoordinator;)V

    const-string p5, "LinkController_LinkActivityResultLauncher"

    invoke-virtual {p1, p5, p4, p3}, Landroidx/activity/result/ActivityResultRegistry;->register(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 35
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    new-instance p1, Lcom/stripe/android/link/LinkControllerCoordinator$2;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/link/LinkControllerCoordinator$2;-><init>(Lcom/stripe/android/link/LinkControllerCoordinator;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 48
    invoke-interface {p2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    .line 49
    new-instance p2, Lcom/stripe/android/link/LinkControllerCoordinator$3;

    invoke-direct {p2, p0}, Lcom/stripe/android/link/LinkControllerCoordinator$3;-><init>(Lcom/stripe/android/link/LinkControllerCoordinator;)V

    check-cast p2, Landroidx/lifecycle/LifecycleObserver;

    .line 48
    invoke-virtual {p1, p2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/link/LinkControllerCoordinator;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->interactor:Lcom/stripe/android/link/LinkControllerInteractor;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method public static final synthetic access$getAuthenticationCallback$p(Lcom/stripe/android/link/LinkControllerCoordinator;)Lcom/stripe/android/link/LinkController$AuthenticationCallback;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->authenticationCallback:Lcom/stripe/android/link/LinkController$AuthenticationCallback;

    return-object p0
.end method

.method public static final synthetic access$getInteractor$p(Lcom/stripe/android/link/LinkControllerCoordinator;)Lcom/stripe/android/link/LinkControllerInteractor;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->interactor:Lcom/stripe/android/link/LinkControllerInteractor;

    return-object p0
.end method

.method public static final synthetic access$getLifecycleOwner$p(Lcom/stripe/android/link/LinkControllerCoordinator;)Landroidx/lifecycle/LifecycleOwner;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    return-object p0
.end method

.method public static final synthetic access$getSelectedPaymentMethodCallback$p(Lcom/stripe/android/link/LinkControllerCoordinator;)Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->selectedPaymentMethodCallback:Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;

    return-object p0
.end method


# virtual methods
.method public final getLinkActivityResultLauncher()Landroidx/activity/result/ActivityResultLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerCoordinator;->linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object v0
.end method

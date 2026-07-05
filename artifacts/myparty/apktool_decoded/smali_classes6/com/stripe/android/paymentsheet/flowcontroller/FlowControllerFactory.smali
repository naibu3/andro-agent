.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;
.super Ljava/lang/Object;
.source "FlowControllerFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B!\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0017B!\u0008\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;",
        "",
        "viewModelStoreOwner",
        "Landroidx/lifecycle/ViewModelStoreOwner;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "activityResultRegistryOwner",
        "Landroidx/activity/result/ActivityResultRegistryOwner;",
        "statusBarColor",
        "Lkotlin/Function0;",
        "",
        "paymentOptionResultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;",
        "paymentResultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "paymentElementCallbackIdentifier",
        "",
        "initializedViaCompose",
        "",
        "<init>",
        "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "create",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;",
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
.field private final activityResultRegistryOwner:Landroidx/activity/result/ActivityResultRegistryOwner;

.field private final initializedViaCompose:Z

.field private final lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

.field private final paymentElementCallbackIdentifier:Ljava/lang/String;

.field private final paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

.field private final paymentResultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

.field private final statusBarColor:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;


# direct methods
.method public static synthetic $r8$lambda$PWbw88heHu3rpTr32ovN93F_AEc(Landroidx/activity/ComponentActivity;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->_init_$lambda$0(Landroidx/activity/ComponentActivity;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QmEozEoScMr7a3jd_XrmZc1gyN8(Landroidx/fragment/app/Fragment;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->_init_$lambda$1(Landroidx/fragment/app/Fragment;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 12

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionResultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    move-object v2, p1

    check-cast v2, Landroidx/lifecycle/ViewModelStoreOwner;

    .line 29
    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/LifecycleOwner;

    .line 30
    move-object v4, p1

    check-cast v4, Landroidx/activity/result/ActivityResultRegistryOwner;

    .line 31
    new-instance v5, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$$ExternalSyntheticLambda1;

    invoke-direct {v5, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$$ExternalSyntheticLambda1;-><init>(Landroidx/activity/ComponentActivity;)V

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v6, p2

    move-object v7, p3

    .line 27
    invoke-direct/range {v1 .. v11}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 12

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionResultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    move-object v2, p1

    check-cast v2, Landroidx/lifecycle/ViewModelStoreOwner;

    .line 42
    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/LifecycleOwner;

    .line 43
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getHost()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroidx/activity/result/ActivityResultRegistryOwner;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/activity/result/ActivityResultRegistryOwner;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "requireActivity(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/activity/result/ActivityResultRegistryOwner;

    :cond_1
    move-object v4, v0

    .line 44
    new-instance v5, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$$ExternalSyntheticLambda0;

    invoke-direct {v5, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$$ExternalSyntheticLambda0;-><init>(Landroidx/fragment/app/Fragment;)V

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v6, p2

    move-object v7, p3

    .line 40
    invoke-direct/range {v1 .. v11}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/ViewModelStoreOwner;",
            "Landroidx/lifecycle/LifecycleOwner;",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, "viewModelStoreOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultRegistryOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusBarColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionResultCallback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 16
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->activityResultRegistryOwner:Landroidx/activity/result/ActivityResultRegistryOwner;

    .line 17
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->statusBarColor:Lkotlin/jvm/functions/Function0;

    .line 18
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    .line 19
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentResultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    .line 20
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 21
    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->initializedViaCompose:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    .line 20
    const-string v1, "FlowController"

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object/from16 v9, p7

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v10, v0

    goto :goto_1

    :cond_1
    move/from16 v10, p8

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    .line 13
    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V

    return-void
.end method

.method private static final _init_$lambda$0(Landroidx/activity/ComponentActivity;)Ljava/lang/Integer;
    .locals 0

    .line 31
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getStatusBarColor()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$1(Landroidx/fragment/app/Fragment;)Ljava/lang/Integer;
    .locals 0

    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/Window;->getStatusBarColor()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final create()Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;
    .locals 10

    .line 50
    sget-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->Companion:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Companion;

    .line 51
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    .line 52
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 53
    new-instance v3, Lcom/stripe/android/common/ui/PaymentElementActivityResultCaller;

    .line 54
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentElementCallbackIdentifier:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "FlowController(instance = "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 55
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->activityResultRegistryOwner:Landroidx/activity/result/ActivityResultRegistryOwner;

    .line 53
    invoke-direct {v3, v4, v5}, Lcom/stripe/android/common/ui/PaymentElementActivityResultCaller;-><init>(Ljava/lang/String;Landroidx/activity/result/ActivityResultRegistryOwner;)V

    .line 57
    iget-object v9, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->activityResultRegistryOwner:Landroidx/activity/result/ActivityResultRegistryOwner;

    .line 58
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->statusBarColor:Lkotlin/jvm/functions/Function0;

    .line 59
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentOptionResultCallback:Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;

    .line 60
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentResultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    .line 61
    iget-object v7, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 62
    iget-boolean v8, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->initializedViaCompose:Z

    .line 53
    check-cast v3, Landroidx/activity/result/ActivityResultCaller;

    .line 50
    invoke-virtual/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Companion;->getInstance(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZLandroidx/activity/result/ActivityResultRegistryOwner;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    move-result-object v0

    return-object v0
.end method

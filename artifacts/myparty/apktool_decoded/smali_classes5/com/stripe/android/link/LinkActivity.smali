.class public final Lcom/stripe/android/link/LinkActivity;
.super Landroidx/activity/ComponentActivity;
.source "LinkActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u000c\u0010\u0018\u001a\u00020\u0015*\u00020\u0019H\u0002J\u0008\u0010\u001a\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0008\u0010\u001e\u001a\u00020\u0015H\u0014J\u0008\u0010\u001f\u001a\u00020\u0015H\u0016J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"R$\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "viewModelFactory",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "getViewModelFactory$paymentsheet_release$annotations",
        "getViewModelFactory$paymentsheet_release",
        "()Landroidx/lifecycle/ViewModelProvider$Factory;",
        "setViewModelFactory$paymentsheet_release",
        "(Landroidx/lifecycle/ViewModelProvider$Factory;)V",
        "viewModel",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "getViewModel$paymentsheet_release",
        "()Lcom/stripe/android/link/LinkActivityViewModel;",
        "setViewModel$paymentsheet_release",
        "(Lcom/stripe/android/link/LinkActivityViewModel;)V",
        "webLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "setTheme",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "observeBackPress",
        "dismissWithResult",
        "result",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "onDestroy",
        "finish",
        "launchWebFlow",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
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

.field public static final Companion:Lcom/stripe/android/link/LinkActivity$Companion;

.field public static final EXTRA_ARGS:Ljava/lang/String; = "native_link_args"

.field public static final RESULT_COMPLETE:I = 0x11f5b


# instance fields
.field private viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

.field private viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

.field private webLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$PDgbSjps0L2f0uz6KKwJ97kSdZA(Lcom/stripe/android/link/LinkActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkActivity;->observeBackPress$lambda$1(Lcom/stripe/android/link/LinkActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$sOfHXjg-Gja70L6nHdLtdONjs_0(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkActivity;->onCreate$lambda$0(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkActivity;->Companion:Lcom/stripe/android/link/LinkActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 22
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 24
    sget-object v0, Lcom/stripe/android/link/LinkActivityViewModel;->Companion:Lcom/stripe/android/link/LinkActivityViewModel$Companion;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;->factory$default(Lcom/stripe/android/link/LinkActivityViewModel$Companion;Landroidx/lifecycle/SavedStateHandle;ILjava/lang/Object;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

.method public static final synthetic access$dismissWithResult(Lcom/stripe/android/link/LinkActivity;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivity;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method private final dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 2

    const/4 v0, 0x1

    .line 96
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "com.stripe.android.link.LinkActivityContract.extra_result"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 95
    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object p1

    .line 100
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const v0, 0x11f5b

    .line 98
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/link/LinkActivity;->setResult(ILandroid/content/Intent;)V

    .line 102
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivity;->finish()V

    return-void
.end method

.method public static synthetic getViewModelFactory$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final observeBackPress()V
    .locals 6

    .line 91
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    new-instance v3, Lcom/stripe/android/link/LinkActivity$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lcom/stripe/android/link/LinkActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/LinkActivity;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    return-void
.end method

.method private static final observeBackPress$lambda$1(Lcom/stripe/android/link/LinkActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    iget-object p0, p0, Lcom/stripe/android/link/LinkActivity;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->handleBackPressed()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onCreate$lambda$0(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->handleResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method private final setTheme(Lcom/stripe/android/link/LinkLaunchMode;)V
    .locals 1

    .line 82
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$Full;

    if-nez v0, :cond_2

    .line 83
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-nez v0, :cond_2

    .line 84
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    if-eqz p1, :cond_1

    sget p1, Lcom/stripe/android/R$style;->StripeTransparentTheme:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivity;->setTheme(I)V

    goto :goto_1

    .line 81
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 84
    :cond_2
    :goto_0
    sget p1, Lcom/stripe/android/R$style;->StripePaymentSheetDefaultTheme:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivity;->setTheme(I)V

    .line 87
    :goto_1
    move-object p1, p0

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/utils/EdgeToEdgeKt;->renderEdgeToEdge(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 111
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->finish()V

    .line 112
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/AnimationConstantsKt;->fadeOut(Landroid/app/Activity;)V

    return-void
.end method

.method public final getViewModel$paymentsheet_release()Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    return-object v0
.end method

.method public final getViewModelFactory$paymentsheet_release()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method public final launchWebFlow(Lcom/stripe/android/link/LinkConfiguration;)V
    .locals 5

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->webLauncher:Landroidx/activity/result/ActivityResultLauncher;

    if-eqz v0, :cond_0

    .line 117
    new-instance v1, Lcom/stripe/android/link/LinkActivityContract$Args;

    .line 119
    sget-object v2, Lcom/stripe/android/link/LinkExpressMode;->DISABLED:Lcom/stripe/android/link/LinkExpressMode;

    .line 120
    new-instance v3, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V

    .line 124
    sget-object v4, Lcom/stripe/android/link/LinkLaunchMode$Full;->INSTANCE:Lcom/stripe/android/link/LinkLaunchMode$Full;

    check-cast v4, Lcom/stripe/android/link/LinkLaunchMode;

    .line 117
    invoke-direct {v1, p1, v2, v3, v4}, Lcom/stripe/android/link/LinkActivityContract$Args;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)V

    .line 116
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 31
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    :try_start_0
    new-instance p1, Landroidx/lifecycle/ViewModelProvider;

    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModelStoreOwner;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    invoke-direct {p1, v0, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkActivityViewModel;

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;
    :try_end_0
    .catch Lcom/stripe/android/link/NoArgsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 36
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v2, "Failed to create LinkActivityViewModel"

    check-cast p1, Ljava/lang/Throwable;

    invoke-interface {v0, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    invoke-virtual {p0, v1}, Lcom/stripe/android/link/LinkActivity;->setResult(I)V

    .line 38
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivity;->finish()V

    .line 41
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivity;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    if-nez p1, :cond_0

    return-void

    .line 43
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivity;->setTheme(Lcom/stripe/android/link/LinkLaunchMode;)V

    .line 46
    move-object v0, p0

    check-cast v0, Landroidx/activity/result/ActivityResultCaller;

    .line 47
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 45
    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/link/LinkActivityViewModel;->registerForActivityResult(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    .line 50
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityViewModel;->getActivityRetainedComponent()Lcom/stripe/android/link/injection/NativeLinkComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getWebLinkActivityContract()Lcom/stripe/android/link/WebLinkActivityContract;

    move-result-object v0

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v1, Lcom/stripe/android/link/LinkActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;)V

    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/link/LinkActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkActivity;->webLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 54
    new-instance v0, Lcom/stripe/android/link/LinkActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/LinkActivity$onCreate$2;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->setLaunchWebFlow(Lkotlin/jvm/functions/Function1;)V

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivity;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroidx/lifecycle/LifecycleObserver;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 56
    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivity;->observeBackPress()V

    .line 58
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/link/LinkActivity$onCreate$3;

    invoke-direct {v1, p1, p0}, Lcom/stripe/android/link/LinkActivity$onCreate$3;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkActivity;)V

    const p1, 0x5a46c849

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, v2, v1}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 106
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onDestroy()V

    .line 107
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityViewModel;->unregisterActivity()V

    :cond_0
    return-void
.end method

.method public final setViewModel$paymentsheet_release(Lcom/stripe/android/link/LinkActivityViewModel;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity;->viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    return-void
.end method

.method public final setViewModelFactory$paymentsheet_release(Landroidx/lifecycle/ViewModelProvider$Factory;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

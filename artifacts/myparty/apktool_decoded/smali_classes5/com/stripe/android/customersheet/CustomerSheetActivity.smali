.class public final Lcom/stripe/android/customersheet/CustomerSheetActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "CustomerSheetActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetActivity.kt\ncom/stripe/android/customersheet/CustomerSheetActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,113:1\n75#2,13:114\n*S KotlinDebug\n*F\n+ 1 CustomerSheetActivity.kt\ncom/stripe/android/customersheet/CustomerSheetActivity\n*L\n44#1:114,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0008\u0010\u001e\u001a\u00020\u0018H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R*\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\r\u0010\u0003\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\t\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001f\u00b2\u0006\u000c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "args",
        "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
        "getArgs",
        "()Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
        "args$delegate",
        "Lkotlin/Lazy;",
        "viewModelFactoryProducer",
        "Lkotlin/Function0;",
        "Landroidx/lifecycle/ViewModelProvider$Factory;",
        "getViewModelFactoryProducer$paymentsheet_release$annotations",
        "getViewModelFactoryProducer$paymentsheet_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setViewModelFactoryProducer$paymentsheet_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "viewModel",
        "Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
        "viewModel$delegate",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "finishWithResult",
        "result",
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
        "finish",
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
.field private final args$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private viewModelFactoryProducer:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$-fWKU6u8k5zfQzISTjymSB8PzXM(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->args_delegate$lambda$0(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Y2n3kPK0JCBVPG-lKTLdaEGwKuY(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModelFactoryProducer$lambda$1(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yQx3rxTkK2FqAo3Ui7mi21ne5no(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModel_delegate$lambda$2(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 24
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 26
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->args$delegate:Lkotlin/Lazy;

    .line 32
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    iput-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModelFactoryProducer:Lkotlin/jvm/functions/Function0;

    .line 44
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    .line 122
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 124
    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 126
    new-instance v5, Lcom/stripe/android/customersheet/CustomerSheetActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 122
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 44
    iput-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/customersheet/CustomerSheetActivity;Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->finishWithResult(Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V

    return-void
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel;
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->getViewModel()Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-result-object p0

    return-object p0
.end method

.method private static final args_delegate$lambda$0(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
    .locals 2

    .line 27
    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;->Companion:Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private final finishWithResult(Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V
    .locals 1

    .line 104
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;->toBundle$paymentsheet_release()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->setResult(ILandroid/content/Intent;)V

    .line 105
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->finish()V

    return-void
.end method

.method private final getArgs()Lcom/stripe/android/customersheet/CustomerSheetContract$Args;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/customersheet/CustomerSheetViewModel;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    return-object v0
.end method

.method public static synthetic getViewModelFactoryProducer$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private static final viewModelFactoryProducer$lambda$1(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;
    .locals 1

    .line 33
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->getArgs()Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;-><init>(Lcom/stripe/android/customersheet/CustomerSheetContract$Args;)V

    return-object v0
.end method

.method private static final viewModel_delegate$lambda$2(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModelFactoryProducer:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object p0
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 109
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->finish()V

    .line 110
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/AnimationConstantsKt;->fadeOut(Landroid/app/Activity;)V

    return-void
.end method

.method public final getViewModelFactoryProducer$paymentsheet_release()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModelFactoryProducer:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 50
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/core/view/WindowCompat;->setDecorFitsSystemWindows(Landroid/view/Window;Z)V

    .line 54
    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->getArgs()Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    .line 56
    new-instance p1, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Error;

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No CustomerSheetContract.Args provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 56
    invoke-direct {p1, v0}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Error;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;

    .line 55
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->finishWithResult(Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V

    return-void

    .line 63
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->getViewModel()Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-result-object p1

    .line 64
    move-object v0, p0

    check-cast v0, Landroidx/activity/result/ActivityResultCaller;

    .line 65
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 63
    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->registerFromActivity(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    .line 68
    move-object p1, p0

    check-cast p1, Landroidx/activity/ComponentActivity;

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    const v1, 0x23e57354

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2, v1}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final setViewModelFactoryProducer$paymentsheet_release(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/lifecycle/ViewModelProvider$Factory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->viewModelFactoryProducer:Lkotlin/jvm/functions/Function0;

    return-void
.end method

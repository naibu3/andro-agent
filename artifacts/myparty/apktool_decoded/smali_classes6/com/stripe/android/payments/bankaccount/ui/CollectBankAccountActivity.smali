.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "CollectBankAccountActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCollectBankAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountActivity.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,82:1\n75#2,13:83\n*S KotlinDebug\n*F\n+ 1 CollectBankAccountActivity.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity\n*L\n29#1:83,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u000c\u0010\u0015\u001a\u00020\u0012*\u00020\u0016H\u0002J\u000c\u0010\u0015\u001a\u00020\u0012*\u00020\u0017H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\t\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "starterArgs",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "getStarterArgs",
        "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "starterArgs$delegate",
        "Lkotlin/Lazy;",
        "financialConnectionsLauncher",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;",
        "viewModel",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        "viewModel$delegate",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "launch",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private financialConnectionsLauncher:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$-898-edXOpnrBCgTv1geJZV2iQU(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->viewModel_delegate$lambda$2$lambda$1(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Eg64Akf2gVE-AXN3orwkOsVNgKU(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->starterArgs_delegate$lambda$0(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ceRp___kCFwd255bfRFhjD6Lyhg(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->viewModel_delegate$lambda$2(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 21
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 23
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->starterArgs$delegate:Lkotlin/Lazy;

    .line 29
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)V

    .line 91
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 93
    new-instance v4, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 95
    new-instance v5, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 91
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 29
    iput-object v2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;)V

    return-void
.end method

.method public static final synthetic access$launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;)V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    return-object v0
.end method

.method private final launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;)V
    .locals 2

    .line 75
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 76
    new-instance v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;->getResult()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    .line 75
    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 73
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->setResult(ILandroid/content/Intent;)V

    .line 79
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->finish()V

    return-void
.end method

.method private final launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;)V
    .locals 5

    .line 62
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->financialConnectionsLauncher:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

    if-nez v0, :cond_0

    const-string v0, "financialConnectionsLauncher"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 63
    :cond_0
    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    .line 64
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->getFinancialConnectionsSessionSecret()Ljava/lang/String;

    move-result-object v2

    .line 65
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->getPublishableKey()Ljava/lang/String;

    move-result-object v3

    .line 66
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->getStripeAccountId()Ljava/lang/String;

    move-result-object v4

    .line 63
    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p1

    .line 62
    invoke-interface {v0, v1, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;->present(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V

    return-void
.end method

.method private static final starterArgs_delegate$lambda$0(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 2

    .line 24
    sget-object v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->Companion:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private static final viewModel_delegate$lambda$2(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 30
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;

    new-instance v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method private static final viewModel_delegate$lambda$2$lambda$1(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getStarterArgs()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 36
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 37
    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getStarterArgs()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    .line 38
    new-instance p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Configuration not provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {p1, v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;-><init>(Ljava/lang/Throwable;)V

    .line 39
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;

    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;)V

    return-void

    .line 41
    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getStarterArgs()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    const-string v1, "Required value was null."

    if-eqz p1, :cond_3

    .line 42
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 43
    sget-object v2, Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;->INSTANCE:Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;

    .line 44
    move-object v3, p0

    check-cast v3, Landroidx/activity/ComponentActivity;

    .line 45
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object v4

    .line 47
    new-instance p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$1;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$1;-><init>(Ljava/lang/Object;)V

    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 48
    new-instance p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$2;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$2;-><init>(Ljava/lang/Object;)V

    move-object v7, p1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 43
    invoke-virtual/range {v2 .. v7}, Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;->invoke(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->financialConnectionsLauncher:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

    .line 50
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/LifecycleOwner;

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$3;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$3;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    return-void

    .line 42
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

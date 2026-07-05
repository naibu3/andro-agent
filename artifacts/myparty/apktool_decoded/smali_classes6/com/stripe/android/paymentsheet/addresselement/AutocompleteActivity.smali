.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "AutocompleteActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAutocompleteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,112:1\n75#2,13:113\n*S KotlinDebug\n*F\n+ 1 AutocompleteActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteActivity\n*L\n26#1:113,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0008\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "starterArgs",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
        "getStarterArgs",
        "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
        "starterArgs$delegate",
        "Lkotlin/Lazy;",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
        "viewModel$delegate",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onStop",
        "setResult",
        "result",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;",
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
.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$BtL_8FysdWHmZND4U1hoosJ1c5k(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->viewModel_delegate$lambda$1(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$T9AIGuoadXE3SMvxhLBrVc6KweI(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->starterArgs_delegate$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

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

    .line 22
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->starterArgs$delegate:Lkotlin/Lazy;

    .line 26
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)V

    .line 121
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 123
    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 125
    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 121
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 26
    iput-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->getViewModel()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setResult(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->setResult(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    return-object v0
.end method

.method private final setResult(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V
    .locals 1

    .line 108
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 106
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private static final starterArgs_delegate$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;
    .locals 2

    .line 23
    sget-object v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;->Companion:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args$Companion;->fromIntent$paymentsheet_release(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private static final viewModel_delegate$lambda$1(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 27
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0

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
    .locals 3

    .line 31
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 33
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    .line 35
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->finish()V

    return-void

    .line 39
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/core/view/WindowCompat;->setDecorFitsSystemWindows(Landroid/view/Window;Z)V

    .line 41
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;->getAppearanceContext$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    move-result-object v0

    .line 43
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;->applyAppearance()V

    .line 45
    move-object v1, p0

    check-cast v1, Landroidx/activity/ComponentActivity;

    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V

    const p1, -0x32f4ea68

    const/4 v0, 0x1

    invoke-static {p1, v0, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, v0, v2}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method protected onStop()V
    .locals 3

    .line 92
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 94
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->isChangingConfigurations()Z

    move-result v0

    if-nez v0, :cond_2

    .line 96
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;

    .line 97
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;->getId$paymentsheet_release()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    const/4 v2, 0x0

    .line 96
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;

    .line 95
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->setResult(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V

    .line 101
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->finish()V

    :cond_2
    return-void
.end method

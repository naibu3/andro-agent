.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;
.super Landroidx/activity/ComponentActivity;
.source "AddressElementActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddressElementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,141:1\n75#2,13:142\n*S KotlinDebug\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity\n*L\n42#1:142,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020\u00172\u0008\u0008\u0002\u0010!\u001a\u00020\"H\u0002J\u0008\u0010#\u001a\u00020\u0017H\u0016R$\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;",
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
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "starterArgs",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "getStarterArgs",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "starterArgs$delegate",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "AddressElementUi",
        "bottomSheetState",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
        "navController",
        "Landroidx/navigation/NavHostController;",
        "(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V",
        "setResult",
        "result",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
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
.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;


# direct methods
.method public static synthetic $r8$lambda$Ba9fB6S46of-AOongdszNe8U91g(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->AddressElementUi$lambda$4(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$MhMELOPTKU9uORvzwyv4Wh3PV_o(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Landroid/app/Application;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Landroid/app/Application;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_hbed_FZfYTIlYfHnNYa2u8C8G8(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->starterArgs_delegate$lambda$3(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$qc7fPm0W8bhb1TSXhrVUqcny7dM(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModel_delegate$lambda$2(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$z1g5ReJcmWhKQMYQjuZ_rEhBbg8(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory$lambda$1(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 33
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 37
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;

    .line 38
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    .line 39
    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    .line 37
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 42
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    .line 150
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 152
    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 154
    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 150
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 42
    iput-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModel$delegate:Lkotlin/Lazy;

    .line 44
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->starterArgs$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final AddressElementUi(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const v4, 0x43cf1d15

    move-object/from16 v5, p3

    .line 88
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v3, 0x8

    if-nez v5, :cond_0

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v3

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    and-int/lit8 v6, v3, 0x30

    if-nez v6, :cond_4

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_6

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v7, 0x92

    if-ne v6, v7, :cond_8

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_5

    .line 125
    :cond_7
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_6

    .line 88
    :cond_8
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.AddressElementUi (AddressElementActivity.kt:87)"

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 89
    :cond_9
    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$AddressElementUi$1;

    invoke-direct {v4, v1, v0, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$AddressElementUi$1;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Landroidx/navigation/NavHostController;)V

    const/16 v5, 0x36

    const v6, -0x5bc99a41

    const/4 v7, 0x1

    invoke-static {v6, v7, v4, v13, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lkotlin/jvm/functions/Function2;

    const/high16 v14, 0xc00000

    const/16 v15, 0x7f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v15}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 125
    :cond_a
    :goto_6
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v4

    if-eqz v4, :cond_b

    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda4;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;I)V

    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_b
    return-void
.end method

.method private static final AddressElementUi$lambda$4(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-direct {p0, p1, p2, p4, p3}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->AddressElementUi(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$AddressElementUi(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->AddressElementUi(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getViewModel()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    return-object v0
.end method

.method public static synthetic getViewModelFactory$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V
    .locals 3

    .line 129
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;->getResultCode$paymentsheet_release()I

    move-result v0

    .line 130
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 131
    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    invoke-direct {v2, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    .line 130
    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    .line 128
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method static synthetic setResult$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 127
    sget-object p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-void
.end method

.method private static final starterArgs_delegate$lambda$3(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 2

    .line 45
    sget-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->Companion:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args$Companion;->fromIntent$paymentsheet_release(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private static final viewModelFactory$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Landroid/app/Application;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getApplication()Landroid/app/Application;

    move-result-object p0

    const-string v0, "getApplication(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final viewModelFactory$lambda$1(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

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

.method private static final viewModel_delegate$lambda$2(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object p0
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 137
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->finish()V

    .line 138
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/AnimationConstantsKt;->fadeOut(Landroid/app/Activity;)V

    return-void
.end method

.method public final getViewModelFactory$paymentsheet_release()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 49
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->finish()V

    return-void

    .line 57
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/core/view/WindowCompat;->setDecorFitsSystemWindows(Landroid/view/Window;Z)V

    .line 58
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->parseAppearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)V

    .line 60
    :cond_1
    move-object p1, p0

    check-cast p1, Landroidx/activity/ComponentActivity;

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    const v1, 0x7468f458

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2, v1}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final setViewModelFactory$paymentsheet_release(Landroidx/lifecycle/ViewModelProvider$Factory;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

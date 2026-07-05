.class final Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;
.super Ljava/lang/Object;
.source "FullScreenContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/FullScreenContentKt;->FullScreenContent(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/LinkScreen;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFullScreenContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullScreenContent.kt\ncom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,114:1\n149#2:115\n149#2:116\n1225#3,6:117\n*S KotlinDebug\n*F\n+ 1 FullScreenContent.kt\ncom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3\n*L\n74#1:115\n103#1:116\n104#1:117,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $appBarState:Lcom/stripe/android/link/ui/LinkAppBarState;

.field final synthetic $bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

.field final synthetic $changeEmail:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $dismiss:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $dismissWithResult:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $getLinkAccount:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $goBack:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $handleViewAction:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkAction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $initialDestination:Lcom/stripe/android/link/LinkScreen;

.field final synthetic $linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $linkContentBottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $moveToWeb:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $navigate:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/android/link/LinkScreen;",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onBackPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$UT_ZSCbA-vby-y6B1iur56gPYpQ(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->invoke$lambda$2$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/navigation/NavHostController;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/navigation/NavHostController;",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkAction;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/link/LinkScreen;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/link/LinkScreen;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$dismiss:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$navController:Landroidx/navigation/NavHostController;

    iput-object p5, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$appBarState:Lcom/stripe/android/link/ui/LinkAppBarState;

    iput-object p6, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$linkContentBottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iput-object p7, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$handleViewAction:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$navigate:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$dismissWithResult:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$getLinkAccount:Lkotlin/jvm/functions/Function0;

    iput-object p11, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$onBackPressed:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$moveToWeb:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$goBack:Lkotlin/jvm/functions/Function0;

    iput-object p14, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$changeEmail:Lkotlin/jvm/functions/Function0;

    iput-object p15, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$initialDestination:Lcom/stripe/android/link/LinkScreen;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$2$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    .line 104
    invoke-static {p0, v0}, Lcom/stripe/android/link/ui/FullScreenContentKt;->access$FullScreenContent$lambda$4(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 71
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 72
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 111
    :cond_0
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 72
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.FullScreenContent.<anonymous> (FullScreenContent.kt:71)"

    const v4, 0x4126c6b9

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 73
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    const/16 v2, 0x18

    int-to-float v9, v2

    .line 115
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 75
    iget-object v4, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$dismiss:Lkotlin/jvm/functions/Function0;

    .line 76
    new-instance v10, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;

    iget-object v11, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v12, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$navController:Landroidx/navigation/NavHostController;

    iget-object v13, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$appBarState:Lcom/stripe/android/link/ui/LinkAppBarState;

    iget-object v14, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$linkContentBottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iget-object v15, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$handleViewAction:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$navigate:Lkotlin/jvm/functions/Function2;

    iget-object v5, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$dismissWithResult:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$getLinkAccount:Lkotlin/jvm/functions/Function0;

    iget-object v8, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$onBackPressed:Lkotlin/jvm/functions/Function0;

    move-object/from16 p2, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$moveToWeb:Lkotlin/jvm/functions/Function1;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$goBack:Lkotlin/jvm/functions/Function0;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$changeEmail:Lkotlin/jvm/functions/Function0;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$initialDestination:Lcom/stripe/android/link/LinkScreen;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v24, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v5

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    invoke-direct/range {v10 .. v24}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/navigation/NavHostController;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;Landroidx/compose/runtime/MutableState;)V

    const v1, -0x22df459f

    const/4 v11, 0x1

    const/16 v12, 0x36

    invoke-static {v1, v11, v10, v6, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    sget v1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->$stable:I

    or-int/lit16 v7, v1, 0x6180

    const/4 v8, 0x2

    const/4 v2, 0x0

    move-object/from16 v1, p2

    .line 72
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->ElementsBottomSheetLayout-TN_CM5M(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 100
    iget-object v1, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/stripe/android/link/ui/FullScreenContentKt;->access$FullScreenContent$lambda$3(Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v2, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$linkContentBottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iget-object v3, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->$linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;

    .line 116
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    const v5, -0x26753ab5

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 117
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 118
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_4

    .line 104
    new-instance v5, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$$ExternalSyntheticLambda0;

    invoke-direct {v5, v3}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 120
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 104
    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 105
    new-instance v3, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$2$2;

    invoke-direct {v3, v1}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$2$2;-><init>(Lkotlin/jvm/functions/Function3;)V

    const v1, 0x5ec9c89a

    invoke-static {v1, v11, v3, v6, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    sget v3, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->$stable:I

    or-int/lit16 v7, v3, 0x6d80

    const/4 v8, 0x2

    move v3, v4

    move-object v4, v5

    move-object v5, v1

    move-object v1, v2

    const/4 v2, 0x0

    .line 101
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->ElementsBottomSheetLayout-TN_CM5M(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 100
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method

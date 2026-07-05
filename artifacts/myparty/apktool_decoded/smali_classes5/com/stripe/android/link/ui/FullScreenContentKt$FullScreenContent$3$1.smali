.class final Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;
.super Ljava/lang/Object;
.source "FullScreenContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nFullScreenContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullScreenContent.kt\ncom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,114:1\n1225#2,6:115\n1225#2,6:121\n*S KotlinDebug\n*F\n+ 1 FullScreenContent.kt\ncom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1\n*L\n85#1:115,6\n88#1:121,6\n*E\n"
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

.field final synthetic $changeEmail:Lkotlin/jvm/functions/Function0;
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
.method public static synthetic $r8$lambda$80NmPcBhG2YHQDnPZv5T4FfQm_8(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/navigation/NavHostController;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    iput-object p1, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$navController:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$appBarState:Lcom/stripe/android/link/ui/LinkAppBarState;

    iput-object p4, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$linkContentBottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iput-object p5, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$handleViewAction:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$navigate:Lkotlin/jvm/functions/Function2;

    iput-object p7, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$dismissWithResult:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$getLinkAccount:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$onBackPressed:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$moveToWeb:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$goBack:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$changeEmail:Lkotlin/jvm/functions/Function0;

    iput-object p13, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$initialDestination:Lcom/stripe/android/link/LinkScreen;

    iput-object p14, p0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;)Lkotlin/Unit;
    .locals 1

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/FullScreenContentKt;->access$FullScreenContent$lambda$4(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;)V

    .line 87
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 76
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 77
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 77
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.FullScreenContent.<anonymous>.<anonymous> (FullScreenContent.kt:76)"

    const v5, -0x22df459f

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 84
    :cond_2
    iget-object v2, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/stripe/android/link/ui/FullScreenContentKt;->access$FullScreenContent$lambda$3(Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    .line 78
    iget-object v2, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$modifier:Landroidx/compose/ui/Modifier;

    move-object v3, v2

    .line 80
    iget-object v2, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$navController:Landroidx/navigation/NavHostController;

    move-object v5, v3

    .line 81
    iget-object v3, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$appBarState:Lcom/stripe/android/link/ui/LinkAppBarState;

    const v6, -0x26759463

    .line 84
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 85
    iget-object v6, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$linkContentBottomSheetContent$delegate:Landroidx/compose/runtime/MutableState;

    .line 115
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .line 116
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_3

    .line 85
    new-instance v7, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1$$ExternalSyntheticLambda0;

    invoke-direct {v7, v6}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 118
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 85
    :cond_3
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v6, -0x267583d3

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v6, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$linkContentBottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 88
    iget-object v8, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$linkContentBottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    .line 121
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_4

    .line 122
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v9, v6, :cond_5

    .line 88
    :cond_4
    new-instance v6, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1$2$1;

    const/4 v9, 0x0

    invoke-direct {v6, v8, v9}, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1$2$1;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    move-object v9, v6

    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 124
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 88
    :cond_5
    move-object v6, v9

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v1, v5

    move-object v5, v7

    .line 91
    iget-object v7, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$handleViewAction:Lkotlin/jvm/functions/Function1;

    .line 92
    iget-object v8, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$navigate:Lkotlin/jvm/functions/Function2;

    .line 93
    iget-object v9, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 94
    iget-object v10, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$getLinkAccount:Lkotlin/jvm/functions/Function0;

    .line 82
    iget-object v11, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$onBackPressed:Lkotlin/jvm/functions/Function0;

    .line 83
    iget-object v12, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$moveToWeb:Lkotlin/jvm/functions/Function1;

    .line 95
    iget-object v13, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$goBack:Lkotlin/jvm/functions/Function0;

    .line 96
    iget-object v14, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$changeEmail:Lkotlin/jvm/functions/Function0;

    .line 79
    iget-object v15, v0, Lcom/stripe/android/link/ui/FullScreenContentKt$FullScreenContent$3$1;->$initialDestination:Lcom/stripe/android/link/LinkScreen;

    const/16 v17, 0x6000

    const/16 v18, 0x0

    move-object/from16 v16, p1

    .line 77
    invoke-static/range {v1 .. v18}, Lcom/stripe/android/link/ui/LinkContentKt;->LinkContent(Landroidx/compose/ui/Modifier;Landroidx/navigation/NavHostController;Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    return-void
.end method

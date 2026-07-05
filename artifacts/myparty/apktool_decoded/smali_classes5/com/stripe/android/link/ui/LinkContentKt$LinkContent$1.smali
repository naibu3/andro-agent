.class final Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;
.super Ljava/lang/Object;
.source "LinkContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkContentKt;->LinkContent(Landroidx/compose/ui/Modifier;Landroidx/navigation/NavHostController;Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $bottomSheetContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $changeEmail:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $coroutineScope:Lkotlinx/coroutines/CoroutineScope;

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

.field final synthetic $hideBottomSheetContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $initialDestination:Lcom/stripe/android/link/LinkScreen;

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

.field final synthetic $showBottomSheetContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/navigation/NavHostController;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkAction;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
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
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
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
            "Lcom/stripe/android/link/LinkScreen;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$bottomSheetContent:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p4, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$navController:Landroidx/navigation/NavHostController;

    iput-object p6, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$handleViewAction:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$appBarState:Lcom/stripe/android/link/ui/LinkAppBarState;

    iput-object p8, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$onBackPressed:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$getLinkAccount:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$goBack:Lkotlin/jvm/functions/Function0;

    iput-object p11, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$navigate:Lkotlin/jvm/functions/Function2;

    iput-object p12, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$dismissWithResult:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$moveToWeb:Lkotlin/jvm/functions/Function1;

    iput-object p15, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$changeEmail:Lkotlin/jvm/functions/Function0;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$initialDestination:Lcom/stripe/android/link/LinkScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 58
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 59
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 59
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.LinkContent.<anonymous> (LinkContent.kt:58)"

    const v4, -0x3e0e71b6

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 60
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$modifier:Landroidx/compose/ui/Modifier;

    .line 61
    sget-object v2, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    const/4 v3, 0x6

    invoke-virtual {v2, v10, v3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getSurfacePrimary-0d7_KjU()J

    move-result-wide v3

    .line 62
    new-instance v11, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1$1;

    iget-object v12, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$bottomSheetContent:Lkotlin/jvm/functions/Function3;

    iget-object v13, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v14, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$hideBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$navController:Landroidx/navigation/NavHostController;

    iget-object v2, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$handleViewAction:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$appBarState:Lcom/stripe/android/link/ui/LinkAppBarState;

    iget-object v6, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$onBackPressed:Lkotlin/jvm/functions/Function0;

    iget-object v7, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$getLinkAccount:Lkotlin/jvm/functions/Function0;

    iget-object v8, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$goBack:Lkotlin/jvm/functions/Function0;

    iget-object v9, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$navigate:Lkotlin/jvm/functions/Function2;

    move-object/from16 p2, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$dismissWithResult:Lkotlin/jvm/functions/Function1;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$moveToWeb:Lkotlin/jvm/functions/Function1;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$changeEmail:Lkotlin/jvm/functions/Function0;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1;->$initialDestination:Lcom/stripe/android/link/LinkScreen;

    move-object/from16 v26, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v21, v9

    invoke-direct/range {v11 .. v26}, Lcom/stripe/android/link/ui/LinkContentKt$LinkContent$1$1;-><init>(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/LinkScreen;)V

    const/16 v1, 0x36

    const v2, 0x71c69b8e

    const/4 v5, 0x1

    invoke-static {v2, v5, v11, v10, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/high16 v11, 0x180000

    const/16 v12, 0x3a

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, p2

    .line 59
    invoke-static/range {v1 .. v12}, Landroidx/compose/material/SurfaceKt;->Surface-F-jzlyU(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

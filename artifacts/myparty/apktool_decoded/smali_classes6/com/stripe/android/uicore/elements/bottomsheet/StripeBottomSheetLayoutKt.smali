.class public final Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt;
.super Ljava/lang/Object;
.source "StripeBottomSheetLayout.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeBottomSheetLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBottomSheetLayout.kt\ncom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,66:1\n1225#2,6:67\n149#3:73\n*S KotlinDebug\n*F\n+ 1 StripeBottomSheetLayout.kt\ncom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt\n*L\n37#1:67,6\n54#1:73\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u0011\u0010\u000c\u001a\r\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0002\u0008\rH\u0007\u00a2\u0006\u0002\u0010\u000e\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "BottomSheetContentTestTag",
        "",
        "StripeBottomSheetLayout",
        "",
        "state",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
        "layoutInfo",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "onDismissed",
        "Lkotlin/Function0;",
        "sheetContent",
        "Landroidx/compose/runtime/Composable;",
        "(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final BottomSheetContentTestTag:Ljava/lang/String; = "BottomSheetContentTestTag"


# direct methods
.method public static synthetic $r8$lambda$FeMCYYHRXD4TdPQgxCoJJs5zutU(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt;->StripeBottomSheetLayout$lambda$1(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final StripeBottomSheetLayout(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutInfo"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismissed"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sheetContent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x78dc8284

    move-object/from16 v3, p5

    .line 36
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    and-int/lit8 v7, p7, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v7, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_2

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_2
    move v7, v6

    :goto_1
    and-int/lit8 v8, p7, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_5

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_8

    move-object/from16 v9, p2

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v7, v10

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v9, p2

    :goto_6
    and-int/lit8 v10, p7, 0x8

    const/16 v11, 0x800

    if-eqz v10, :cond_9

    or-int/lit16 v7, v7, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_b

    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    move v10, v11

    goto :goto_7

    :cond_a
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v7, v10

    :cond_b
    :goto_8
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v7, v7, 0x6000

    goto :goto_a

    :cond_c
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_e

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_9

    :cond_d
    const/16 v10, 0x2000

    :goto_9
    or-int/2addr v7, v10

    :cond_e
    :goto_a
    and-int/lit16 v10, v7, 0x2493

    const/16 v12, 0x2492

    if-ne v10, v12, :cond_10

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v10

    if-nez v10, :cond_f

    goto :goto_b

    .line 65
    :cond_f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v20, v3

    move-object v3, v9

    goto/16 :goto_e

    :cond_10
    :goto_b
    if-eqz v8, :cond_11

    .line 33
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v8, Landroidx/compose/ui/Modifier;

    move-object/from16 v23, v8

    goto :goto_c

    :cond_11
    move-object/from16 v23, v9

    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_12

    const/4 v8, -0x1

    const-string v9, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout (StripeBottomSheetLayout.kt:35)"

    .line 36
    invoke-static {v0, v7, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    :cond_12
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v8, -0x65e6101

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit16 v7, v7, 0x1c00

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v7, v11, :cond_13

    move v7, v10

    goto :goto_d

    :cond_13
    move v7, v9

    :goto_d
    or-int/2addr v7, v8

    .line 67
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_14

    .line 68
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_15

    .line 37
    :cond_14
    new-instance v7, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1;

    const/4 v8, 0x0

    invoke-direct {v7, v1, v4, v8}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 70
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 37
    :cond_15
    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v7, 0x6

    invoke-static {v0, v8, v3, v7}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 50
    invoke-static/range {v23 .. v23}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->statusBarsPadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 51
    invoke-static {v0}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->imePadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 52
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;->getScrimColor-0d7_KjU()J

    move-result-wide v17

    .line 53
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;->getSheetBackgroundColor-0d7_KjU()J

    move-result-wide v13

    int-to-float v0, v9

    .line 73
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    .line 56
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;->getSheetShape()Landroidx/compose/ui/graphics/Shape;

    move-result-object v11

    .line 57
    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->getModalBottomSheetState()Landroidx/compose/material/ModalBottomSheetState;

    move-result-object v9

    .line 58
    new-instance v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt$StripeBottomSheetLayout$2;

    invoke-direct {v0, v5}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt$StripeBottomSheetLayout$2;-><init>(Lkotlin/jvm/functions/Function2;)V

    const/16 v15, 0x36

    move/from16 p2, v7

    const v7, -0x6143add6

    invoke-static {v7, v10, v0, v3, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function3;

    .line 52
    sget-object v0, Lcom/stripe/android/uicore/elements/bottomsheet/ComposableSingletons$StripeBottomSheetLayoutKt;->INSTANCE:Lcom/stripe/android/uicore/elements/bottomsheet/ComposableSingletons$StripeBottomSheetLayoutKt;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/bottomsheet/ComposableSingletons$StripeBottomSheetLayoutKt;->getLambda-1$stripe_ui_core_release()Lkotlin/jvm/functions/Function2;

    move-result-object v19

    sget v0, Landroidx/compose/material/ModalBottomSheetState;->$stable:I

    shl-int/lit8 v0, v0, 0x6

    const v10, 0x30030c06

    or-int v21, v0, v10

    const/16 v22, 0x80

    const/4 v10, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v20, v3

    .line 48
    invoke-static/range {v7 .. v22}, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetLayout-Gs3lGvM(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_16
    move-object/from16 v3, v23

    .line 65
    :goto_e
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt$$ExternalSyntheticLambda0;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_17
    return-void
.end method

.method private static final StripeBottomSheetLayout$lambda$1(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutKt;->StripeBottomSheetLayout(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

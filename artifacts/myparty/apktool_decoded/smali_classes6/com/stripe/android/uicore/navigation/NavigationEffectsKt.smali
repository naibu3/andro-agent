.class public final Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;
.super Ljava/lang/Object;
.source "NavigationEffects.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNavigationEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationEffects.kt\ncom/stripe/android/uicore/navigation/NavigationEffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,101:1\n1225#2,6:102\n1225#2,6:109\n1225#2,6:115\n77#3:108\n81#4:121\n*S KotlinDebug\n*F\n+ 1 NavigationEffects.kt\ncom/stripe/android/uicore/navigation/NavigationEffectsKt\n*L\n23#1:102,6\n29#1:109,6\n37#1:115,6\n26#1:108\n27#1:121\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000e\u001a&\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u00a8\u0006\u0015\u00b2\u0006\u000c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002"
    }
    d2 = {
        "NavigationEffects",
        "",
        "navigationChannel",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
        "navHostController",
        "Landroidx/navigation/NavHostController;",
        "keyboardController",
        "Lcom/stripe/android/uicore/navigation/KeyboardController;",
        "onPopBackStackResult",
        "Lkotlin/Function1;",
        "",
        "onBackStackEntryUpdated",
        "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;",
        "(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "applyPop",
        "Landroidx/navigation/NavOptionsBuilder;",
        "currentRoute",
        "",
        "popUpTo",
        "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;",
        "stripe-ui-core_release",
        "backStackEntry",
        "Landroidx/navigation/NavBackStackEntry;"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$8nV24AMho1uV5r-VXfPohA2nfSk(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->applyPop$lambda$7$lambda$6(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SjRf5fDJavKk2_qtwlSejJnf3ho(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->applyPop$lambda$8(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$lHGlGeDvhlJ5eCvyapBdo-RMyJg(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->applyPop$lambda$9(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$uwqnOA6ca0NBKFvdG9wWpqE1q1g(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->NavigationEffects$lambda$1$lambda$0(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yJ-8jOIPEZO2frMLJbAKWXJuWN0(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->NavigationEffects$lambda$5(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final NavigationEffects(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "+",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;",
            "Landroidx/navigation/NavHostController;",
            "Lcom/stripe/android/uicore/navigation/KeyboardController;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v7, p4

    move/from16 v8, p6

    const-string v0, "navigationChannel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navHostController"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardController"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackStackEntryUpdated"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x30910e23

    move-object/from16 v4, p5

    .line 25
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    and-int/lit8 v4, p7, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move v4, v8

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_5

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_8

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_8
    :goto_5
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_b

    move-object/from16 v11, p3

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v11, p3

    :goto_8
    and-int/lit8 v12, p7, 0x10

    const/16 v13, 0x4000

    if-eqz v12, :cond_c

    or-int/lit16 v4, v4, 0x6000

    goto :goto_a

    :cond_c
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_e

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    move v12, v13

    goto :goto_9

    :cond_d
    const/16 v12, 0x2000

    :goto_9
    or-int/2addr v4, v12

    :cond_e
    :goto_a
    move v12, v4

    and-int/lit16 v4, v12, 0x2493

    const/16 v14, 0x2492

    if-ne v4, v14, :cond_10

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_b

    .line 72
    :cond_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, v9

    goto/16 :goto_12

    :cond_10
    :goto_b
    if-eqz v5, :cond_12

    const v4, -0x6f268962

    .line 23
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 102
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .line 103
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_11

    .line 104
    new-instance v4, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda0;-><init>()V

    .line 105
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 23
    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v5, v4

    goto :goto_c

    :cond_12
    move-object v5, v11

    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_13

    const/4 v4, -0x1

    const-string v11, "com.stripe.android.uicore.navigation.NavigationEffects (NavigationEffects.kt:24)"

    .line 25
    invoke-static {v0, v12, v4, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 26
    :cond_13
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v4, 0x789c5f52

    const-string v11, "CC:CompositionLocal.kt#9igjgp"

    .line 108
    invoke-static {v9, v4, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 26
    instance-of v4, v0, Landroid/app/Activity;

    const/4 v11, 0x0

    if-eqz v4, :cond_14

    check-cast v0, Landroid/app/Activity;

    goto :goto_d

    :cond_14
    move-object v0, v11

    .line 27
    :goto_d
    move-object v4, v2

    check-cast v4, Landroidx/navigation/NavController;

    shr-int/lit8 v14, v12, 0x3

    and-int/lit8 v14, v14, 0xe

    invoke-static {v4, v9, v14}, Landroidx/navigation/compose/NavHostControllerKt;->currentBackStackEntryAsState(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v4

    .line 29
    invoke-static {v4}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->NavigationEffects$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v14

    const v15, -0x6f266aba

    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    const v16, 0xe000

    and-int v10, v12, v16

    const/4 v6, 0x0

    const/16 v17, 0x1

    if-ne v10, v13, :cond_15

    move/from16 v10, v17

    goto :goto_e

    :cond_15
    move v10, v6

    :goto_e
    or-int/2addr v10, v15

    .line 109
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_16

    .line 110
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v13, v10, :cond_17

    .line 29
    :cond_16
    new-instance v10, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$2$1;

    invoke-direct {v10, v2, v7, v4, v11}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$2$1;-><init>(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    move-object v13, v10

    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 112
    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 29
    :cond_17
    check-cast v13, Lkotlin/jvm/functions/Function2;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v14, v13, v9, v6}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    const v4, -0x6f2640d0

    .line 37
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    and-int/lit16 v10, v12, 0x380

    const/16 v11, 0x100

    if-ne v10, v11, :cond_18

    move/from16 v10, v17

    goto :goto_f

    :cond_18
    move v10, v6

    :goto_f
    or-int/2addr v4, v10

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    and-int/lit16 v10, v12, 0x1c00

    const/16 v11, 0x800

    if-ne v10, v11, :cond_19

    move/from16 v6, v17

    :cond_19
    or-int/2addr v4, v6

    .line 115
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_1b

    .line 116
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_1a

    goto :goto_10

    :cond_1a
    move-object v2, v0

    move-object v11, v5

    goto :goto_11

    :cond_1b
    :goto_10
    move-object v2, v0

    .line 37
    new-instance v0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1;

    const/4 v6, 0x0

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1;-><init>(Lkotlinx/coroutines/flow/SharedFlow;Landroid/app/Activity;Lcom/stripe/android/uicore/navigation/KeyboardController;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    move-object v11, v5

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 118
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 37
    :goto_11
    move-object v3, v6

    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    and-int/lit8 v0, v12, 0x70

    shl-int/lit8 v1, v12, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int v5, v0, v1

    move-object/from16 v1, p1

    move-object v0, v2

    move-object v4, v9

    move-object/from16 v2, p0

    invoke-static/range {v0 .. v5}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 72
    :cond_1c
    :goto_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v9

    if-eqz v9, :cond_1d

    new-instance v0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v5, v7

    move v6, v8

    move-object v4, v11

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda1;-><init>(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1d
    return-void
.end method

.method private static final NavigationEffects$lambda$1$lambda$0(Z)Lkotlin/Unit;
    .locals 0

    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final NavigationEffects$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;)",
            "Landroidx/navigation/NavBackStackEntry;"
        }
    .end annotation

    .line 121
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/navigation/NavBackStackEntry;

    return-object p0
.end method

.method private static final NavigationEffects$lambda$5(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->NavigationEffects(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$NavigationEffects$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->NavigationEffects$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$applyPop(Landroidx/navigation/NavOptionsBuilder;Landroidx/navigation/NavHostController;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt;->applyPop(Landroidx/navigation/NavOptionsBuilder;Landroidx/navigation/NavHostController;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;)V

    return-void
.end method

.method private static final applyPop(Landroidx/navigation/NavOptionsBuilder;Landroidx/navigation/NavHostController;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;)V
    .locals 1

    .line 80
    instance-of v0, p3, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 81
    new-instance p1, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda2;

    invoke-direct {p1, p3}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;)V

    invoke-virtual {p0, p2, p1}, Landroidx/navigation/NavOptionsBuilder;->popUpTo(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void

    .line 85
    :cond_1
    instance-of p2, p3, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;

    if-eqz p2, :cond_2

    move-object p1, p3

    check-cast p1, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;->getRoute()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda3;

    invoke-direct {p2, p3}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;)V

    invoke-virtual {p0, p1, p2}, Landroidx/navigation/NavOptionsBuilder;->popUpTo(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 88
    :cond_2
    sget-object p2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Start;->INSTANCE:Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Start;

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 89
    invoke-virtual {p1}, Landroidx/navigation/NavHostController;->getGraph()Landroidx/navigation/NavGraph;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/navigation/NavGraph;->getId()I

    move-result p1

    .line 88
    new-instance p2, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda4;

    invoke-direct {p2, p3}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;)V

    invoke-virtual {p0, p1, p2}, Landroidx/navigation/NavOptionsBuilder;->popUpTo(ILkotlin/jvm/functions/Function1;)V

    return-void

    .line 79
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final applyPop$lambda$7$lambda$6(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    check-cast p0, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;->getInclusive()Z

    move-result p0

    invoke-virtual {p1, p0}, Landroidx/navigation/PopUpToBuilder;->setInclusive(Z)V

    .line 83
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final applyPop$lambda$8(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    check-cast p0, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;->getInclusive()Z

    move-result p0

    invoke-virtual {p1, p0}, Landroidx/navigation/PopUpToBuilder;->setInclusive(Z)V

    .line 87
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final applyPop$lambda$9(Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Landroidx/navigation/PopUpToBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    invoke-interface {p0}, Lcom/stripe/android/uicore/navigation/PopUpToBehavior;->getInclusive()Z

    move-result p0

    invoke-virtual {p1, p0}, Landroidx/navigation/PopUpToBuilder;->setInclusive(Z)V

    .line 92
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

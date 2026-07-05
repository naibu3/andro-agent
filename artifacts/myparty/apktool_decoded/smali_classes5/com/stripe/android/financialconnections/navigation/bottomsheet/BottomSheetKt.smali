.class public final Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetKt;
.super Ljava/lang/Object;
.source "BottomSheet.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001af\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f\u00a2\u0006\u0002\u0008\u0010H\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "ModalBottomSheetLayout",
        "",
        "bottomSheetNavigator",
        "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "sheetShape",
        "Landroidx/compose/ui/graphics/Shape;",
        "sheetElevation",
        "Landroidx/compose/ui/unit/Dp;",
        "sheetBackgroundColor",
        "Landroidx/compose/ui/graphics/Color;",
        "sheetContentColor",
        "scrimColor",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "ModalBottomSheetLayout-4erKP6g",
        "(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "financial-connections_release"
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
.method public static synthetic $r8$lambda$U_2vpaKpT_6-_Kw6xYTAPO39obQ(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p14}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetKt;->ModalBottomSheetLayout_4erKP6g$lambda$0(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final ModalBottomSheetLayout-4erKP6g(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "FJJJ",
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

    move-object/from16 v11, p10

    move/from16 v0, p12

    move/from16 v2, p13

    const-string v3, "bottomSheetNavigator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "content"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x6e429741

    move-object/from16 v4, p11

    .line 46
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v0, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_3

    and-int/lit8 v4, v0, 0x8

    if-nez v4, :cond_1

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_1
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_2

    const/4 v4, 0x4

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v0

    goto :goto_2

    :cond_3
    move v4, v0

    :goto_2
    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    goto :goto_4

    :cond_4
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_6

    move-object/from16 v6, p1

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v4, v7

    goto :goto_5

    :cond_6
    :goto_4
    move-object/from16 v6, p1

    :goto_5
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_9

    and-int/lit8 v7, v2, 0x4

    if-nez v7, :cond_7

    move-object/from16 v7, p2

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_6

    :cond_7
    move-object/from16 v7, p2

    :cond_8
    const/16 v8, 0x80

    :goto_6
    or-int/2addr v4, v8

    goto :goto_7

    :cond_9
    move-object/from16 v7, p2

    :goto_7
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_c

    and-int/lit8 v8, v2, 0x8

    if-nez v8, :cond_a

    move/from16 v8, p3

    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_8

    :cond_a
    move/from16 v8, p3

    :cond_b
    const/16 v9, 0x400

    :goto_8
    or-int/2addr v4, v9

    goto :goto_9

    :cond_c
    move/from16 v8, p3

    :goto_9
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_f

    and-int/lit8 v9, v2, 0x10

    if-nez v9, :cond_d

    move-wide/from16 v9, p4

    invoke-interface {v15, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_a

    :cond_d
    move-wide/from16 v9, p4

    :cond_e
    const/16 v12, 0x2000

    :goto_a
    or-int/2addr v4, v12

    goto :goto_b

    :cond_f
    move-wide/from16 v9, p4

    :goto_b
    const/high16 v12, 0x30000

    and-int/2addr v12, v0

    if-nez v12, :cond_12

    and-int/lit8 v12, v2, 0x20

    if-nez v12, :cond_10

    move-wide/from16 v12, p6

    invoke-interface {v15, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x20000

    goto :goto_c

    :cond_10
    move-wide/from16 v12, p6

    :cond_11
    const/high16 v14, 0x10000

    :goto_c
    or-int/2addr v4, v14

    goto :goto_d

    :cond_12
    move-wide/from16 v12, p6

    :goto_d
    const/high16 v14, 0x180000

    and-int/2addr v14, v0

    if-nez v14, :cond_14

    and-int/lit8 v14, v2, 0x40

    move/from16 p11, v4

    move-wide/from16 v3, p8

    if-nez v14, :cond_13

    invoke-interface {v15, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_e

    :cond_13
    const/high16 v16, 0x80000

    :goto_e
    or-int v16, p11, v16

    goto :goto_f

    :cond_14
    move/from16 p11, v4

    move-wide/from16 v3, p8

    move/from16 v16, p11

    :goto_f
    and-int/lit16 v14, v2, 0x80

    const/high16 v17, 0xc00000

    if-eqz v14, :cond_15

    or-int v16, v16, v17

    goto :goto_11

    :cond_15
    and-int v14, v0, v17

    if-nez v14, :cond_17

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_16

    const/high16 v14, 0x800000

    goto :goto_10

    :cond_16
    const/high16 v14, 0x400000

    :goto_10
    or-int v16, v16, v14

    :cond_17
    :goto_11
    move/from16 v14, v16

    const v16, 0x492493

    and-int v0, v14, v16

    const v1, 0x492492

    if-ne v0, v1, :cond_19

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_12

    .line 58
    :cond_18
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v2, v6

    move-wide v5, v9

    move-wide v9, v3

    move-object v3, v7

    move v4, v8

    move-wide v7, v12

    goto/16 :goto_15

    .line 46
    :cond_19
    :goto_12
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p12, 0x1

    const v1, -0x380001

    const v16, -0x70001

    const v17, -0xe001

    if-eqz v0, :cond_1f

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_13

    .line 44
    :cond_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v2, 0x4

    if-eqz v0, :cond_1b

    and-int/lit16 v14, v14, -0x381

    :cond_1b
    and-int/lit8 v0, v2, 0x8

    if-eqz v0, :cond_1c

    and-int/lit16 v14, v14, -0x1c01

    :cond_1c
    and-int/lit8 v0, v2, 0x10

    if-eqz v0, :cond_1d

    and-int v14, v14, v17

    :cond_1d
    and-int/lit8 v0, v2, 0x20

    if-eqz v0, :cond_1e

    and-int v14, v14, v16

    :cond_1e
    and-int/lit8 v0, v2, 0x40

    if-eqz v0, :cond_25

    goto :goto_14

    :cond_1f
    :goto_13
    if-eqz v5, :cond_20

    .line 39
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v6, v0

    :cond_20
    and-int/lit8 v0, v2, 0x4

    if-eqz v0, :cond_21

    .line 40
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v5, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v0, v15, v5}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material/Shapes;->getLarge()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Shape;

    and-int/lit16 v14, v14, -0x381

    move-object v7, v0

    :cond_21
    and-int/lit8 v0, v2, 0x8

    if-eqz v0, :cond_22

    .line 41
    sget-object v0, Landroidx/compose/material/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material/ModalBottomSheetDefaults;

    invoke-virtual {v0}, Landroidx/compose/material/ModalBottomSheetDefaults;->getElevation-D9Ej5fM()F

    move-result v0

    and-int/lit16 v14, v14, -0x1c01

    move v8, v0

    :cond_22
    and-int/lit8 v0, v2, 0x10

    if-eqz v0, :cond_23

    .line 42
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v5, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v0, v15, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material/Colors;->getSurface-0d7_KjU()J

    move-result-wide v9

    and-int v14, v14, v17

    :cond_23
    and-int/lit8 v0, v2, 0x20

    if-eqz v0, :cond_24

    shr-int/lit8 v0, v14, 0xc

    and-int/lit8 v0, v0, 0xe

    .line 43
    invoke-static {v9, v10, v15, v0}, Landroidx/compose/material/ColorsKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    and-int v0, v14, v16

    move v14, v0

    :cond_24
    and-int/lit8 v0, v2, 0x40

    if-eqz v0, :cond_25

    .line 44
    sget-object v0, Landroidx/compose/material/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material/ModalBottomSheetDefaults;

    sget v3, Landroidx/compose/material/ModalBottomSheetDefaults;->$stable:I

    invoke-virtual {v0, v15, v3}, Landroidx/compose/material/ModalBottomSheetDefaults;->getScrimColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    :goto_14
    and-int/2addr v14, v1

    :cond_25
    move-wide/from16 v18, v3

    move-object v3, v6

    move-object v6, v7

    move v7, v8

    move-wide v8, v9

    move-wide v10, v12

    move-wide/from16 v12, v18

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_26

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.navigation.bottomsheet.ModalBottomSheetLayout (BottomSheet.kt:45)"

    const v4, 0x6e429741

    .line 46
    invoke-static {v4, v14, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 48
    :cond_26
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->getSheetState$financial_connections_release()Landroidx/compose/material/ModalBottomSheetState;

    move-result-object v4

    .line 49
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->getSheetContent$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v2

    and-int/lit8 v0, v14, 0x70

    .line 56
    sget v1, Landroidx/compose/material/ModalBottomSheetState;->$stable:I

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    shl-int/lit8 v1, v14, 0x6

    const v5, 0xe000

    and-int/2addr v5, v1

    or-int/2addr v0, v5

    const/high16 v5, 0x70000

    and-int/2addr v5, v1

    or-int/2addr v0, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v1

    or-int/2addr v0, v5

    const/high16 v5, 0x1c00000

    and-int/2addr v5, v1

    or-int/2addr v0, v5

    const/high16 v5, 0xe000000

    and-int/2addr v5, v1

    or-int/2addr v0, v5

    const/high16 v5, 0x70000000

    and-int/2addr v1, v5

    or-int v16, v0, v1

    const/16 v17, 0x8

    const/4 v5, 0x0

    move-object/from16 v14, p10

    .line 47
    invoke-static/range {v2 .. v17}, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetLayout-Gs3lGvM(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_27
    move-object v2, v3

    move-object v3, v6

    move v4, v7

    move-wide v5, v8

    move-wide v7, v10

    move-wide v9, v12

    .line 58
    :goto_15
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_28

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetKt$$ExternalSyntheticLambda0;

    move-object/from16 v1, p0

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;II)V

    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_28
    return-void
.end method

.method private static final ModalBottomSheetLayout_4erKP6g$lambda$0(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 15

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v13

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v14, p12

    move-object/from16 v12, p13

    invoke-static/range {v1 .. v14}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetKt;->ModalBottomSheetLayout-4erKP6g(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

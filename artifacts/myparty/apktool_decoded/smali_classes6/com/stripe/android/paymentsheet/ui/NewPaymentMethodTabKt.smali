.class public final Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt;
.super Ljava/lang/Object;
.source "NewPaymentMethodTab.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNewPaymentMethodTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,80:1\n149#2:81\n*S KotlinDebug\n*F\n+ 1 NewPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt\n*L\n49#1:81\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0013H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "NewPaymentMethodTab",
        "",
        "minViewWidth",
        "Landroidx/compose/ui/unit/Dp;",
        "iconRes",
        "",
        "iconUrl",
        "",
        "imageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "title",
        "isSelected",
        "",
        "isEnabled",
        "iconRequiresTinting",
        "promoBadge",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "onItemSelectedListener",
        "Lkotlin/Function0;",
        "NewPaymentMethodTab-jFuDa88",
        "(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V",
        "paymentsheet_release"
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
.method public static synthetic $r8$lambda$IKv1a3YppVwe8G40b1zI8ESpRmw(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p15}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt;->NewPaymentMethodTab_jFuDa88$lambda$0(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final NewPaymentMethodTab-jFuDa88(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FI",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v3, p4

    move-object/from16 v11, p10

    move/from16 v0, p12

    move/from16 v14, p14

    const-string v2, "imageLoader"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "title"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onItemSelectedListener"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x2705ec34

    move-object/from16 v5, p11

    .line 37
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v5, v14, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    and-int/lit8 v8, v14, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_5

    move/from16 v8, p1

    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v8, p1

    :goto_4
    and-int/lit8 v9, v14, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_8

    move-object/from16 v9, p2

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v5, v12

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v9, p2

    :goto_7
    and-int/lit8 v12, v14, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v5, v5, 0xc00

    goto :goto_a

    :cond_9
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_c

    and-int/lit16 v12, v0, 0x1000

    if-nez v12, :cond_a

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_8

    :cond_a
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    :goto_8
    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_9

    :cond_b
    const/16 v12, 0x400

    :goto_9
    or-int/2addr v5, v12

    :cond_c
    :goto_a
    and-int/lit8 v12, v14, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v5, v5, 0x6000

    goto :goto_c

    :cond_d
    and-int/lit16 v12, v0, 0x6000

    if-nez v12, :cond_f

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_b

    :cond_e
    const/16 v12, 0x2000

    :goto_b
    or-int/2addr v5, v12

    :cond_f
    :goto_c
    and-int/lit8 v12, v14, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_10

    or-int/2addr v5, v13

    goto :goto_e

    :cond_10
    and-int v12, v0, v13

    if-nez v12, :cond_12

    move/from16 v12, p5

    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x20000

    goto :goto_d

    :cond_11
    const/high16 v13, 0x10000

    :goto_d
    or-int/2addr v5, v13

    goto :goto_f

    :cond_12
    :goto_e
    move/from16 v12, p5

    :goto_f
    and-int/lit8 v13, v14, 0x40

    const/high16 v15, 0x180000

    if-eqz v13, :cond_13

    or-int/2addr v5, v15

    goto :goto_11

    :cond_13
    and-int v13, v0, v15

    if-nez v13, :cond_15

    move/from16 v13, p6

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v15

    if-eqz v15, :cond_14

    const/high16 v15, 0x100000

    goto :goto_10

    :cond_14
    const/high16 v15, 0x80000

    :goto_10
    or-int/2addr v5, v15

    goto :goto_12

    :cond_15
    :goto_11
    move/from16 v13, p6

    :goto_12
    and-int/lit16 v15, v14, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_16

    or-int v5, v5, v16

    goto :goto_14

    :cond_16
    and-int v15, v0, v16

    if-nez v15, :cond_18

    move/from16 v15, p7

    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_17

    const/high16 v16, 0x800000

    goto :goto_13

    :cond_17
    const/high16 v16, 0x400000

    :goto_13
    or-int v5, v5, v16

    goto :goto_15

    :cond_18
    :goto_14
    move/from16 v15, p7

    :goto_15
    and-int/lit16 v6, v14, 0x100

    const/high16 v16, 0x6000000

    if-eqz v6, :cond_19

    or-int v5, v5, v16

    goto :goto_17

    :cond_19
    and-int v6, v0, v16

    if-nez v6, :cond_1b

    move-object/from16 v6, p8

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    const/high16 v16, 0x4000000

    goto :goto_16

    :cond_1a
    const/high16 v16, 0x2000000

    :goto_16
    or-int v5, v5, v16

    goto :goto_18

    :cond_1b
    :goto_17
    move-object/from16 v6, p8

    :goto_18
    and-int/lit16 v2, v14, 0x200

    const/high16 v17, 0x30000000

    if-eqz v2, :cond_1c

    or-int v5, v5, v17

    move-object/from16 v7, p9

    goto :goto_1a

    :cond_1c
    and-int v17, v0, v17

    move-object/from16 v7, p9

    if-nez v17, :cond_1e

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1d

    const/high16 v18, 0x20000000

    goto :goto_19

    :cond_1d
    const/high16 v18, 0x10000000

    :goto_19
    or-int v5, v5, v18

    :cond_1e
    :goto_1a
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1f

    or-int/lit8 v0, p13, 0x6

    goto :goto_1c

    :cond_1f
    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_21

    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, 0x4

    goto :goto_1b

    :cond_20
    const/4 v0, 0x2

    :goto_1b
    or-int v0, p13, v0

    goto :goto_1c

    :cond_21
    move/from16 v0, p13

    :goto_1c
    const v18, 0x12492493

    move/from16 p11, v2

    and-int v2, v5, v18

    const v3, 0x12492492

    if-ne v2, v3, :cond_23

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_23

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_22

    goto :goto_1d

    .line 79
    :cond_22
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_1f

    :cond_23
    :goto_1d
    if-eqz p11, :cond_24

    .line 35
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    goto :goto_1e

    :cond_24
    move-object v2, v7

    :goto_1e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_25

    const-string v3, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:36)"

    const v7, -0x2705ec34

    .line 37
    invoke-static {v7, v5, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 43
    :cond_25
    sget-object v3, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->getCardPadding-D9Ej5fM()F

    move-result v18

    .line 44
    sget-object v3, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->getCardPadding-D9Ej5fM()F

    move-result v20

    .line 45
    sget-object v3, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->getCardPadding-D9Ej5fM()F

    move-result v19

    const/16 v22, 0x8

    const/16 v23, 0x0

    const/16 v21, 0x0

    .line 42
    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v16

    .line 47
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v18

    const/16 v3, 0x3c

    int-to-float v3, v3

    .line 81
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    const/4 v7, 0x0

    move/from16 p11, v0

    const/4 v0, 0x0

    const/4 v4, 0x2

    .line 49
    invoke-static {v2, v3, v7, v4, v0}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 50
    invoke-static {v3, v1, v7, v4, v0}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v7, v2

    .line 51
    new-instance v2, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt$NewPaymentMethodTab$1;

    move-object v3, v9

    move-object v9, v6

    move-object v6, v3

    move-object/from16 v3, p4

    move v4, v13

    move v13, v5

    move v5, v8

    move v8, v15

    move-object v15, v7

    move-object/from16 v7, p3

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt$NewPaymentMethodTab$1;-><init>(Ljava/lang/String;ZILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZLjava/lang/String;)V

    const/16 v3, 0x36

    const v4, -0x552819fe

    const/4 v5, 0x1

    invoke-static {v4, v5, v2, v10, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function3;

    shr-int/lit8 v2, v13, 0x12

    and-int/lit8 v2, v2, 0xe

    const/high16 v3, 0xc30000

    or-int/2addr v2, v3

    shr-int/lit8 v3, v13, 0xc

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, p11, 0x9

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    const/4 v12, 0x4

    const/4 v4, 0x0

    move/from16 v3, p5

    move-object v8, v0

    move-object v5, v11

    move-object/from16 v6, v16

    move-object/from16 v7, v18

    move v11, v2

    move/from16 v2, p6

    .line 38
    invoke-static/range {v2 .. v12}, Lcom/stripe/android/paymentsheet/ui/RowButtonKt;->RowButton(ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_26
    move-object v7, v15

    .line 79
    :goto_1f
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-eqz v15, :cond_27

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt$$ExternalSyntheticLambda0;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    move-object v10, v7

    move/from16 v7, p6

    invoke-direct/range {v0 .. v14}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt$$ExternalSyntheticLambda0;-><init>(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;III)V

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_27
    return-void
.end method

.method private static final NewPaymentMethodTab_jFuDa88$lambda$0(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 16

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v13

    invoke-static/range {p12 .. p12}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v14

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v15, p13

    move-object/from16 v12, p14

    invoke-static/range {v1 .. v15}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt;->NewPaymentMethodTab-jFuDa88(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

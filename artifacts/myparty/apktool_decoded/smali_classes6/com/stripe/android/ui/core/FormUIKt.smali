.class public final Lcom/stripe/android/ui/core/FormUIKt;
.super Ljava/lang/Object;
.source "FormUI.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFormUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormUI.kt\ncom/stripe/android/ui/core/FormUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,272:1\n77#2:273\n169#3:274\n149#3:320\n149#3:321\n149#3:322\n149#3:323\n149#3:324\n149#3:325\n149#3:326\n149#3:327\n149#3:328\n149#3:329\n149#3:330\n149#3:331\n149#3:332\n149#3:333\n149#3:334\n149#3:335\n149#3:336\n149#3:337\n149#3:338\n149#3:339\n86#4:275\n84#4,5:276\n89#4:309\n93#4:319\n79#5,6:281\n86#5,4:296\n90#5,2:306\n94#5:318\n368#6,9:287\n377#6:308\n378#6,2:316\n4034#7,6:300\n774#8:310\n865#8,2:311\n1872#8,3:313\n81#9:340\n81#9:341\n81#9:342\n81#9:343\n*S KotlinDebug\n*F\n+ 1 FormUI.kt\ncom/stripe/android/ui/core/FormUIKt\n*L\n79#1:273\n84#1:274\n122#1:320\n134#1:321\n145#1:322\n153#1:323\n163#1:324\n174#1:325\n184#1:326\n185#1:327\n186#1:328\n187#1:329\n196#1:330\n204#1:331\n214#1:332\n226#1:333\n237#1:334\n267#1:335\n268#1:336\n269#1:337\n264#1:338\n265#1:339\n81#1:275\n81#1:276,5\n81#1:309\n81#1:319\n81#1:281,6\n81#1:296,4\n81#1:306,2\n81#1:318\n81#1:287,9\n81#1:308\n81#1:316,2\n81#1:300,6\n87#1:310\n87#1:311,2\n91#1:313,3\n56#1:340\n57#1:341\n58#1:342\n59#1:343\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a]\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00032\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH\u0007\u00a2\u0006\u0002\u0010\u000e\u001aE\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH\u0007\u00a2\u0006\u0002\u0010\u0013\u001aM\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0003\u00a2\u0006\u0002\u0010\u001a\u001a3\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001aO\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\"\u001a\u00020\u001d2\u0008\u0008\u0002\u0010#\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008$\u0010%\u00a8\u0006&\u00b2\u0006\u0010\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0007X\u008a\u0084\u0002\u00b2\u0006\u0010\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u008a\u0084\u0002"
    }
    d2 = {
        "FormUI",
        "",
        "hiddenIdentifiersFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "enabledFlow",
        "",
        "elementsFlow",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "lastTextFieldIdentifierFlow",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "hiddenIdentifiers",
        "enabled",
        "elements",
        "lastTextFieldIdentifier",
        "(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "FormUIElement",
        "element",
        "index",
        "",
        "maxIndex",
        "hasVerticalCustomSpacing",
        "(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V",
        "formVerticalPadding",
        "vertical",
        "Landroidx/compose/ui/unit/Dp;",
        "formVerticalPadding-M2VBTUQ",
        "(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;",
        "top",
        "bottom",
        "start",
        "end",
        "formVerticalPadding-D6kDfKQ",
        "(Landroidx/compose/ui/Modifier;ZIIFFFF)Landroidx/compose/ui/Modifier;",
        "payments-ui-core_release"
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
.method public static synthetic $r8$lambda$EFvhryRflm8b_zmdxrdURLk-EwM(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$4(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Mqu-DpZQlNTcRlwfSQrMRSIM8tw(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$9(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ds6VSJcgO--OUAZMqOQz9bwP3Ts(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/stripe/android/ui/core/FormUIKt;->FormUIElement$lambda$10(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;Z",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v9, p2

    move-object/from16 v4, p3

    move/from16 v10, p6

    const-string v0, "hiddenIdentifiers"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5b08c833

    move-object/from16 v2, p5

    .line 78
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_2
    move v2, v10

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_5

    move/from16 v3, p1

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v3, p1

    :goto_4
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_8

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_5

    :cond_7
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v2, v5

    :cond_8
    :goto_6
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_c

    and-int/lit16 v5, v10, 0x1000

    if-nez v5, :cond_a

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_7

    :cond_a
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    :goto_7
    if-eqz v5, :cond_b

    const/16 v5, 0x800

    goto :goto_8

    :cond_b
    const/16 v5, 0x400

    :goto_8
    or-int/2addr v2, v5

    :cond_c
    :goto_9
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_d

    or-int/lit16 v2, v2, 0x6000

    goto :goto_b

    :cond_d
    and-int/lit16 v6, v10, 0x6000

    if-nez v6, :cond_f

    move-object/from16 v6, p4

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    const/16 v8, 0x4000

    goto :goto_a

    :cond_e
    const/16 v8, 0x2000

    :goto_a
    or-int/2addr v2, v8

    goto :goto_c

    :cond_f
    :goto_b
    move-object/from16 v6, p4

    :goto_c
    move v11, v2

    and-int/lit16 v2, v11, 0x2493

    const/16 v8, 0x2492

    if-ne v2, v8, :cond_11

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_d

    .line 103
    :cond_10
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v5, v6

    goto/16 :goto_15

    :cond_11
    :goto_d
    if-eqz v5, :cond_12

    .line 77
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v12, v2

    goto :goto_e

    :cond_12
    move-object v12, v6

    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v2, -0x1

    const-string v5, "com.stripe.android.ui.core.FormUI (FormUI.kt:77)"

    .line 78
    invoke-static {v0, v11, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    :cond_13
    invoke-static {}, Lcom/stripe/android/uicore/StripeThemeKt;->getLocalSectionSpacing()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v2, 0x789c5f52

    const-string v5, "CC:CompositionLocal.kt#9igjgp"

    .line 273
    invoke-static {v7, v2, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 79
    move-object v13, v0

    check-cast v13, Ljava/lang/Float;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 82
    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v13, :cond_14

    .line 83
    move-object v2, v13

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    .line 84
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 274
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 84
    invoke-virtual {v5, v2}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v2

    if-eqz v2, :cond_14

    .line 83
    check-cast v2, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    goto :goto_f

    .line 85
    :cond_14
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v2

    :goto_f
    const v5, -0x1cd0f17e

    .line 81
    const-string v6, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 275
    invoke-static {v7, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 276
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v5

    const/4 v14, 0x0

    .line 279
    invoke-static {v2, v5, v7, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    const v5, -0x4ee9b9da

    .line 280
    const-string v6, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 281
    invoke-static {v7, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 282
    invoke-static {v7, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 283
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v6

    .line 284
    invoke-static {v7, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 286
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    const v15, -0x2942ffcf

    .line 285
    const-string v14, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 287
    invoke-static {v7, v15, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 288
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    if-nez v14, :cond_15

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 289
    :cond_15
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 290
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_16

    .line 291
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_10

    .line 293
    :cond_16
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 295
    :goto_10
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .line 296
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v8, v2, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 297
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 299
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 301
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-nez v6, :cond_17

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    .line 302
    :cond_17
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 303
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 306
    :cond_18
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x16ef5699

    .line 308
    const-string v2, "C88@4444L9:Column.kt#2w3rfo"

    .line 309
    invoke-static {v7, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    .line 87
    move-object v0, v9

    check-cast v0, Ljava/lang/Iterable;

    .line 310
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 311
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_19
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v14, 0x1

    if-eqz v5, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/stripe/android/uicore/elements/FormElement;

    .line 88
    invoke-interface {v6}, Lcom/stripe/android/uicore/elements/FormElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    instance-of v6, v6, Lcom/stripe/android/ui/core/elements/EmptyFormElement;

    if-nez v6, :cond_1a

    goto :goto_12

    :cond_1a
    const/4 v14, 0x0

    :goto_12
    if-eqz v14, :cond_19

    .line 311
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 312
    :cond_1b
    move-object v15, v2

    check-cast v15, Ljava/util/List;

    const v0, -0x49570435

    .line 87
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 91
    move-object v0, v15

    check-cast v0, Ljava/lang/Iterable;

    .line 314
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v1, 0x0

    :goto_13
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v17, v1, 0x1

    if-gez v1, :cond_1c

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1c
    check-cast v0, Lcom/stripe/android/uicore/elements/FormElement;

    .line 96
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v14

    if-eqz v13, :cond_1d

    move v4, v14

    goto :goto_14

    :cond_1d
    const/4 v4, 0x0

    :goto_14
    shl-int/lit8 v5, v11, 0x6

    and-int/lit16 v5, v5, 0x1c00

    shl-int/lit8 v6, v11, 0xf

    const/high16 v8, 0x70000

    and-int/2addr v6, v8

    or-int/2addr v5, v6

    .line 97
    sget v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v6, v6, 0x12

    or-int/2addr v5, v6

    shl-int/lit8 v6, v11, 0x9

    const/high16 v8, 0x380000

    and-int/2addr v6, v8

    or-int v8, v5, v6

    move-object/from16 v5, p0

    move-object/from16 v6, p3

    .line 92
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/ui/core/FormUIKt;->FormUIElement(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    move/from16 v3, p1

    move-object/from16 v4, p3

    move/from16 v1, v17

    goto :goto_13

    .line 315
    :cond_1e
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 309
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 316
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 287
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 281
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 275
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 319
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1f
    move-object v5, v12

    .line 103
    :goto_15
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda2;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v7, p7

    move-object v3, v9

    move v6, v10

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda2;-><init>(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_20
    return-void
.end method

.method public static final FormUI(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    const-string v0, "hiddenIdentifiersFlow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledFlow"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsFlow"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastTextFieldIdentifierFlow"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x57f9ab19

    move-object/from16 v1, p5

    .line 55
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v6, 0x6

    if-nez v1, :cond_2

    invoke-interface {v12, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v6

    goto :goto_1

    :cond_2
    move v1, v6

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_5

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_8

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v1, v5

    :cond_8
    :goto_5
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_b

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_6

    :cond_a
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v1, v5

    :cond_b
    :goto_7
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_e

    move-object/from16 v7, p4

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_8

    :cond_d
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v1, v8

    goto :goto_a

    :cond_e
    :goto_9
    move-object/from16 v7, p4

    :goto_a
    and-int/lit16 v8, v1, 0x2493

    const/16 v9, 0x2492

    if-ne v8, v9, :cond_10

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_b

    .line 68
    :cond_f
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v5, v7

    goto :goto_d

    :cond_10
    :goto_b
    if-eqz v5, :cond_11

    .line 54
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v11, v5

    goto :goto_c

    :cond_11
    move-object v11, v7

    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_12

    const/4 v5, -0x1

    const-string v7, "com.stripe.android.ui.core.FormUI (FormUI.kt:54)"

    .line 55
    invoke-static {v0, v1, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_12
    and-int/lit8 v0, v1, 0xe

    const/4 v5, 0x0

    const/4 v7, 0x1

    .line 56
    invoke-static {p0, v5, v12, v0, v7}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    shr-int/lit8 v8, v1, 0x3

    and-int/lit8 v8, v8, 0xe

    .line 57
    invoke-static {v2, v5, v12, v8, v7}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v8

    shr-int/lit8 v9, v1, 0x6

    and-int/lit8 v9, v9, 0xe

    .line 58
    invoke-static {v3, v5, v12, v9, v7}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v9

    shr-int/lit8 v10, v1, 0x9

    and-int/lit8 v10, v10, 0xe

    .line 59
    invoke-static {v4, v5, v12, v10, v7}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v5

    .line 62
    invoke-static {v0}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/Set;

    move-result-object v7

    .line 63
    invoke-static {v8}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$1(Landroidx/compose/runtime/State;)Z

    move-result v8

    .line 64
    invoke-static {v9}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$2(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v9

    .line 65
    invoke-static {v5}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$3(Landroidx/compose/runtime/State;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    .line 66
    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v0, v0, 0x9

    const v5, 0xe000

    and-int/2addr v1, v5

    or-int v13, v0, v1

    const/4 v14, 0x0

    .line 61
    invoke-static/range {v7 .. v14}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_13
    move-object v5, v11

    .line 68
    :goto_d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda1;

    move-object v1, p0

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda1;-><init>(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_14
    return-void
.end method

.method private static final FormUI$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;)",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation

    .line 340
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method private static final FormUI$lambda$1(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 341
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final FormUI$lambda$2(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    .line 342
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final FormUI$lambda$3(Landroidx/compose/runtime/State;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;"
        }
    .end annotation

    .line 343
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object p0
.end method

.method private static final FormUI$lambda$4(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final FormUI$lambda$9(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final FormUIElement(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            "IIZZ",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v7, p6

    move/from16 v0, p8

    const v6, 0x40cfda3e

    move-object/from16 v8, p7

    .line 115
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    and-int/lit8 v8, v0, 0x6

    const/4 v10, 0x4

    if-nez v8, :cond_1

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    move v8, v10

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v0

    goto :goto_1

    :cond_1
    move v8, v0

    :goto_1
    and-int/lit8 v11, v0, 0x30

    if-nez v11, :cond_3

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    :cond_3
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_5

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v8, v11

    :cond_5
    and-int/lit16 v11, v0, 0xc00

    if-nez v11, :cond_7

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_4

    :cond_6
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v8, v11

    :cond_7
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_9

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_5

    :cond_8
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v8, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v0

    if-nez v11, :cond_b

    move-object/from16 v11, p5

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v12, 0x10000

    :goto_6
    or-int/2addr v8, v12

    goto :goto_7

    :cond_b
    move-object/from16 v11, p5

    :goto_7
    const/high16 v12, 0x180000

    and-int/2addr v12, v0

    if-nez v12, :cond_e

    const/high16 v12, 0x200000

    and-int/2addr v12, v0

    if-nez v12, :cond_c

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_8

    :cond_c
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    :goto_8
    if-eqz v12, :cond_d

    const/high16 v12, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v12, 0x80000

    :goto_9
    or-int/2addr v8, v12

    :cond_e
    move v12, v8

    const v8, 0x92493

    and-int/2addr v8, v12

    const v13, 0x92492

    if-ne v8, v13, :cond_10

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_a

    .line 243
    :cond_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_f

    .line 115
    :cond_10
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_11

    const/4 v8, -0x1

    const-string v13, "com.stripe.android.ui.core.FormUIElement (FormUI.kt:114)"

    invoke-static {v6, v12, v8, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 117
    :cond_11
    instance-of v6, v1, Lcom/stripe/android/uicore/elements/SectionElement;

    const/16 v8, 0x8

    if-eqz v6, :cond_12

    const v6, -0x4e3b76d3

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 118
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v8, v8

    .line 320
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 118
    check-cast v6, Landroidx/compose/ui/Modifier;

    invoke-static {v6, v3, v4, v5, v8}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    .line 125
    move-object v7, v1

    check-cast v7, Lcom/stripe/android/uicore/elements/SectionElement;

    shr-int/lit8 v6, v12, 0x9

    and-int/lit8 v8, v6, 0xe

    .line 118
    sget v12, Lcom/stripe/android/uicore/elements/SectionElement;->$stable:I

    shl-int/lit8 v12, v12, 0x3

    or-int/2addr v8, v12

    and-int/lit16 v12, v6, 0x380

    or-int/2addr v8, v12

    sget v12, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v12, v12, 0x9

    or-int/2addr v8, v12

    and-int/lit16 v6, v6, 0x1c00

    or-int v12, v8, v6

    const/4 v13, 0x0

    move v6, v2

    move-object v8, v11

    move-object v11, v9

    move-object/from16 v9, p6

    .line 117
    invoke-static/range {v6 .. v13}, Lcom/stripe/android/uicore/elements/SectionElementUIKt;->SectionElementUI(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_b
    move/from16 v2, p3

    goto/16 :goto_e

    .line 129
    :cond_12
    instance-of v2, v1, Lcom/stripe/android/uicore/elements/CheckboxFieldElement;

    if-eqz v2, :cond_13

    const v2, 0x164060af

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 130
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v6, v10

    .line 321
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 130
    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v3, v4, v5, v6}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 136
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/uicore/elements/CheckboxFieldElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/CheckboxFieldElement;->getController()Lcom/stripe/android/uicore/elements/CheckboxFieldController;

    move-result-object v7

    .line 137
    sget v2, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    shr-int/lit8 v8, v12, 0x3

    and-int/lit16 v8, v8, 0x380

    or-int v10, v2, v8

    const/4 v11, 0x0

    move/from16 v8, p3

    .line 129
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt;->CheckboxFieldUI(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/CheckboxFieldController;ZLandroidx/compose/runtime/Composer;II)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_b

    .line 139
    :cond_13
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/StaticTextElement;

    const/4 v13, 0x0

    if-eqz v2, :cond_14

    const v2, 0x16408f07

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 140
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/StaticTextElement;

    .line 141
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v7, v8

    .line 322
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 141
    check-cast v6, Landroidx/compose/ui/Modifier;

    invoke-static {v6, v3, v4, v5, v7}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 139
    invoke-static {v2, v6, v9, v13}, Lcom/stripe/android/ui/core/elements/StaticTextElementUIKt;->StaticTextElementUI(Lcom/stripe/android/ui/core/elements/StaticTextElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_b

    .line 148
    :cond_14
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    if-eqz v2, :cond_15

    const v2, -0x4e298bea

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 149
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v6, v10

    .line 323
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 149
    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v3, v4, v5, v6}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 156
    move-object v7, v1

    check-cast v7, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    shr-int/lit8 v2, v12, 0x9

    and-int/lit8 v10, v2, 0xe

    const/4 v11, 0x0

    move/from16 v6, p3

    .line 148
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->SaveForFutureUseElementUI(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_b

    .line 158
    :cond_15
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;

    if-eqz v2, :cond_16

    const v2, -0x4e23bad3

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 159
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v6, v10

    .line 324
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 159
    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v3, v4, v5, v6}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 166
    move-object v7, v1

    check-cast v7, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;

    shr-int/lit8 v2, v12, 0x9

    and-int/lit8 v10, v2, 0xe

    const/4 v11, 0x0

    move/from16 v6, p3

    .line 158
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_b

    :cond_16
    move-object v11, v9

    .line 168
    instance-of v2, v1, Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    if-eqz v2, :cond_17

    const v2, 0x16411919

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 169
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;->getController()Lcom/stripe/android/uicore/elements/SameAsShippingController;

    move-result-object v2

    .line 170
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v7, v10

    .line 325
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 170
    check-cast v6, Landroidx/compose/ui/Modifier;

    invoke-static {v6, v3, v4, v5, v7}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v7, Lcom/stripe/android/uicore/elements/SameAsShippingController;->$stable:I

    .line 168
    invoke-static {v2, v6, v11, v7, v13}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt;->SameAsShippingElementUI(Lcom/stripe/android/uicore/elements/SameAsShippingController;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move/from16 v2, p3

    move-object v9, v11

    goto/16 :goto_e

    .line 177
    :cond_17
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;

    if-eqz v2, :cond_18

    const v2, 0x164146c0

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 179
    move-object v13, v1

    check-cast v13, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;

    .line 180
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v6, v10

    .line 326
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 327
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v9

    int-to-float v8, v8

    .line 328
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 329
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 180
    check-cast v2, Landroidx/compose/ui/Modifier;

    move/from16 v17, v7

    move v7, v6

    move v6, v8

    move/from16 v8, v17

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-D6kDfKQ(Landroidx/compose/ui/Modifier;ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v14, v3

    move v9, v4

    move v10, v5

    shr-int/lit8 v3, v12, 0x9

    and-int/lit8 v6, v3, 0xe

    const/4 v7, 0x0

    move-object v4, v2

    move-object v5, v11

    move-object v3, v13

    move/from16 v2, p3

    .line 177
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt;->AfterpayClearpayElementUI(ZLcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v15, v5

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_c
    move-object v9, v15

    goto/16 :goto_e

    :cond_18
    move v14, v3

    move v9, v4

    move v10, v5

    move-object v15, v11

    .line 190
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;

    if-eqz v2, :cond_19

    const v2, 0x1641806f

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 191
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;

    .line 192
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v4, v8

    .line 330
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 192
    check-cast v3, Landroidx/compose/ui/Modifier;

    invoke-static {v3, v14, v9, v10, v4}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 190
    invoke-static {v2, v3, v15, v13, v13}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateElementUIKt;->AuBecsDebitMandateElementUI(Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_d
    move/from16 v2, p3

    goto :goto_c

    .line 199
    :cond_19
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/AffirmHeaderElement;

    if-eqz v2, :cond_1a

    const v2, 0x1641ab04

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 200
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v3, v8

    .line 331
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 200
    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v14, v9, v10, v3}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 199
    invoke-static {v2, v15, v13, v13}, Lcom/stripe/android/ui/core/elements/AffirmElementUIKt;->AffirmElementUI(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_d

    .line 207
    :cond_1a
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/MandateTextElement;

    if-eqz v2, :cond_1b

    const v2, 0x1641d089

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 208
    move-object v12, v1

    check-cast v12, Lcom/stripe/android/ui/core/elements/MandateTextElement;

    .line 209
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 213
    invoke-virtual {v12}, Lcom/stripe/android/ui/core/elements/MandateTextElement;->getTopPadding-D9Ej5fM()F

    move-result v6

    int-to-float v3, v8

    .line 332
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 209
    check-cast v2, Landroidx/compose/ui/Modifier;

    const/16 v10, 0x60

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v4, p1

    move/from16 v5, p2

    move v3, v14

    invoke-static/range {v2 .. v11}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-D6kDfKQ$default(Landroidx/compose/ui/Modifier;ZIIFFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v10, v4

    move v11, v5

    .line 207
    invoke-static {v12, v2, v15, v13, v13}, Lcom/stripe/android/ui/core/elements/MandateTextUIKt;->MandateTextUI(Lcom/stripe/android/ui/core/elements/MandateTextElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_d

    :cond_1b
    move v11, v10

    move v10, v9

    .line 217
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;

    if-eqz v2, :cond_1c

    const v2, 0x1641ffce

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 219
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;->getController()Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;

    move-result-object v3

    .line 222
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v4, v8

    .line 333
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 222
    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v14, v10, v11, v4}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shr-int/lit8 v2, v12, 0x9

    and-int/lit16 v4, v2, 0x38e

    sget v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v5, v5, 0x9

    or-int/2addr v4, v5

    and-int/lit16 v2, v2, 0x1c00

    or-int v8, v4, v2

    const/4 v9, 0x0

    move/from16 v2, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object v7, v15

    .line 217
    invoke-static/range {v2 .. v9}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt;->CardDetailsSectionElementUI(ZLcom/stripe/android/ui/core/elements/CardDetailsSectionController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v7

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_e

    :cond_1c
    move-object v9, v15

    .line 229
    instance-of v2, v1, Lcom/stripe/android/ui/core/elements/BsbElement;

    if-eqz v2, :cond_1d

    const v2, 0x16423cfe

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 231
    move-object v3, v1

    check-cast v3, Lcom/stripe/android/ui/core/elements/BsbElement;

    .line 233
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    int-to-float v4, v8

    .line 334
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 233
    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v14, v10, v11, v4}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shr-int/lit8 v2, v12, 0x9

    and-int/lit8 v2, v2, 0xe

    sget v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v2, v4

    shr-int/lit8 v4, v12, 0xc

    and-int/lit16 v4, v4, 0x380

    or-int v7, v2, v4

    const/4 v8, 0x0

    move/from16 v2, p3

    move-object/from16 v4, p6

    move-object v6, v9

    .line 229
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->BsbElementUI(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_e

    .line 240
    :cond_1d
    instance-of v2, v1, Lcom/stripe/android/uicore/elements/OTPElement;

    if-eqz v2, :cond_1e

    const v2, 0x16426f1a

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/uicore/elements/OTPElement;

    shr-int/lit8 v2, v12, 0x9

    and-int/lit8 v2, v2, 0xe

    sget v4, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v2, v4

    const/4 v15, 0x0

    const/16 v16, 0x7fc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v14, v2

    move/from16 v2, p3

    invoke-static/range {v2 .. v16}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI-RE_urrM(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V

    move-object v9, v13

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_e

    :cond_1e
    move/from16 v2, p3

    .line 241
    instance-of v3, v1, Lcom/stripe/android/ui/core/elements/RenderableFormElement;

    if-eqz v3, :cond_1f

    const v3, 0x1642786e

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/ui/core/elements/RenderableFormElement;

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0xe

    invoke-virtual {v3, v2, v9, v4}, Lcom/stripe/android/ui/core/elements/RenderableFormElement;->ComposeUI(ZLandroidx/compose/runtime/Composer;I)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_e

    :cond_1f
    const v3, -0x4df30fda

    .line 242
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 243
    :cond_20
    :goto_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v9

    if-eqz v9, :cond_21

    new-instance v0, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;

    move/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    move v4, v2

    move/from16 v2, p1

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/ui/core/FormUIKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_21
    return-void
.end method

.method private static final FormUIElement$lambda$10(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v9

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p8

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/ui/core/FormUIKt;->FormUIElement(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final formVerticalPadding-D6kDfKQ(Landroidx/compose/ui/Modifier;ZIIFFFF)Landroidx/compose/ui/Modifier;
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    int-to-float p1, v0

    .line 336
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    .line 268
    invoke-static {p0, p6, p1, p7, p5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    if-ne p2, p3, :cond_2

    int-to-float p1, v0

    .line 337
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    .line 269
    invoke-static {p0, p6, p4, p7, p1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    .line 270
    :cond_2
    invoke-static {p0, p6, p4, p7, p5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    int-to-float p1, v0

    .line 335
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p2

    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    .line 267
    invoke-static {p0, p6, p2, p7, p1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method static synthetic formVerticalPadding-D6kDfKQ$default(Landroidx/compose/ui/Modifier;ZIIFFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 10

    and-int/lit8 v0, p8, 0x20

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float v0, v1

    .line 338
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p6

    :goto_0
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_1

    int-to-float v0, v1

    .line 339
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    move v9, v0

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    .line 258
    invoke-static/range {v2 .. v9}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-D6kDfKQ(Landroidx/compose/ui/Modifier;ZIIFFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final formVerticalPadding-M2VBTUQ(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;
    .locals 10

    const/16 v8, 0x60

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p4

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 250
    invoke-static/range {v0 .. v9}, Lcom/stripe/android/ui/core/FormUIKt;->formVerticalPadding-D6kDfKQ$default(Landroidx/compose/ui/Modifier;ZIIFFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

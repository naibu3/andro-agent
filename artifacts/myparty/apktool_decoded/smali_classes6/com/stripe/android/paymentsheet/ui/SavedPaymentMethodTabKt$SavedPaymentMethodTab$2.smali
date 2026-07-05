.class final Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;
.super Ljava/lang/Object;
.source "SavedPaymentMethodTab.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodTab-RYabdnw(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/BoxScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavedPaymentMethodTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,293:1\n1225#2,6:294\n1225#2,6:337\n86#3:300\n83#3,6:301\n89#3:335\n93#3:347\n79#4,6:307\n86#4,4:322\n90#4,2:332\n94#4:346\n368#5,9:313\n377#5:334\n378#5,2:344\n4034#6,6:326\n149#7:336\n149#7:343\n*S KotlinDebug\n*F\n+ 1 SavedPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2\n*L\n105#1:294,6\n128#1:337,6\n97#1:300\n97#1:301,6\n97#1:335\n97#1:347\n97#1:307,6\n97#1:322,4\n97#1:332,2\n97#1:346\n97#1:313,9\n97#1:334\n97#1:344,2\n97#1:326,6\n127#1:336\n136#1:343\n*E\n"
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
.field final synthetic $description:Ljava/lang/String;

.field final synthetic $iconRes:I

.field final synthetic $iconTint:Landroidx/compose/ui/graphics/Color;

.field final synthetic $isClickable:Z

.field final synthetic $isEnabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $labelIcon:Ljava/lang/Integer;

.field final synthetic $labelText:Ljava/lang/String;

.field final synthetic $onItemSelectedListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shouldShowDefaultBadge:Z

.field final synthetic $shouldTintLabelIcon:Z


# direct methods
.method public static synthetic $r8$lambda$WCMm3jvrfdKezxRQfXFTBHXZUZc(ZLandroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->invoke$lambda$1$lambda$0(ZLandroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oVup6X3zL61xqKbkPesPI-4wbKA(Ljava/lang/String;Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->invoke$lambda$4$lambda$3$lambda$2(Ljava/lang/String;Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;ILandroidx/compose/ui/graphics/Color;Ljava/lang/String;Ljava/lang/Integer;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I",
            "Landroidx/compose/ui/graphics/Color;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "ZZZ)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$labelText:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isSelected:Z

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isClickable:Z

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$iconRes:I

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$iconTint:Landroidx/compose/ui/graphics/Color;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$description:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$labelIcon:Ljava/lang/Integer;

    iput-boolean p9, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isEnabled:Z

    iput-boolean p10, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$shouldTintLabelIcon:Z

    iput-boolean p11, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$shouldShowDefaultBadge:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(ZLandroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    .line 110
    invoke-static {p1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->invisibleToUser(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .line 112
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$4$lambda$3$lambda$2(Ljava/lang/String;Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/AccessibilityKt;->readNumbersAsIndividualDigits(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setContentDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V

    .line 130
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 96
    check-cast p1, Landroidx/compose/foundation/layout/BoxScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v5, p2

    move/from16 v1, p3

    const-string v2, "$this$BadgedBox"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 97
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 139
    :cond_0
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 97
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:96)"

    const v4, 0x197f878f

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 98
    :cond_2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 99
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$labelText:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 101
    iget-boolean v7, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isSelected:Z

    .line 102
    iget-boolean v8, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isClickable:Z

    .line 103
    iget-object v10, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$onItemSelectedListener:Lkotlin/jvm/functions/Function0;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x0

    .line 100
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v2, 0x503a1f2e

    .line 105
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-boolean v2, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isClickable:Z

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    iget-boolean v3, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isClickable:Z

    .line 294
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_3

    .line 295
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_4

    .line 105
    :cond_3
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2$$ExternalSyntheticLambda0;

    invoke-direct {v4, v3}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2$$ExternalSyntheticLambda0;-><init>(Z)V

    .line 297
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 105
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v1, v11, v4, v8, v9}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 97
    iget-boolean v2, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isSelected:Z

    move v3, v2

    iget v2, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$iconRes:I

    move v4, v3

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$iconTint:Landroidx/compose/ui/graphics/Color;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$description:Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$labelIcon:Ljava/lang/Integer;

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$labelText:Ljava/lang/String;

    iget-boolean v14, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$isEnabled:Z

    iget-boolean v15, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$shouldTintLabelIcon:Z

    iget-boolean v6, v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;->$shouldShowDefaultBadge:Z

    const v7, -0x1cd0f17e

    const-string v8, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 300
    invoke-static {v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 301
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v7

    .line 302
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v8

    .line 305
    invoke-static {v7, v8, v5, v11}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v7

    const v8, -0x4ee9b9da

    .line 306
    const-string v9, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 307
    invoke-static {v5, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 308
    invoke-static {v5, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v8

    .line 309
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v9

    .line 310
    invoke-static {v5, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 312
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    const v0, -0x2942ffcf

    move/from16 v16, v2

    .line 311
    const-string v2, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 313
    invoke-static {v5, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 314
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 315
    :cond_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 316
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 317
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 319
    :cond_6
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 321
    :goto_1
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .line 322
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v7, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 323
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v9, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 325
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 327
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 328
    :cond_7
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 329
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 332
    :cond_8
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x16ef5699

    .line 334
    const-string v1, "C88@4444L9:Column.kt#2w3rfo"

    .line 335
    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    move v0, v6

    const/4 v6, 0x0

    const/16 v7, 0x8

    move v1, v4

    const/4 v4, 0x0

    move/from16 v2, v16

    .line 114
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->access$SavedPaymentMethodCard-drOMvmE(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 123
    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v2, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v1, v5, v2}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v3

    .line 126
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v2, 0x4

    int-to-float v11, v2

    .line 336
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v19

    const/4 v2, 0x6

    int-to-float v2, v2

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v18

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v20

    .line 126
    move-object/from16 v17, v1

    check-cast v17, Landroidx/compose/ui/Modifier;

    const/16 v22, 0x8

    const/16 v23, 0x0

    const/16 v21, 0x0

    .line 127
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v6, 0x45187233

    .line 128
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    .line 337
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_9

    .line 338
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_a

    .line 128
    :cond_9
    new-instance v7, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2$$ExternalSyntheticLambda1;

    invoke-direct {v7, v10}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;)V

    .line 340
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 128
    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v1, v9, v7, v8, v6}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v5

    move v6, v14

    move v7, v15

    move-object v5, v1

    move-object v1, v12

    move v12, v2

    move-object v2, v13

    .line 120
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt;->LpmSelectorText-FU0evQE(Ljava/lang/Integer;Ljava/lang/String;JLandroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    const v1, 0x45188626

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz v0, :cond_b

    .line 135
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 343
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v19

    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v18

    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v20

    .line 135
    move-object/from16 v17, v0

    check-cast v17, Landroidx/compose/ui/Modifier;

    const/16 v22, 0x8

    const/16 v23, 0x0

    const/16 v21, 0x0

    .line 136
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x0

    .line 134
    invoke-static {v0, v5, v9}, Lcom/stripe/android/paymentsheet/ui/DefaultPaymentMethodLabelKt;->DefaultPaymentMethodLabel(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 335
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 344
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 313
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 307
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 300
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 347
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_c
    return-void
.end method

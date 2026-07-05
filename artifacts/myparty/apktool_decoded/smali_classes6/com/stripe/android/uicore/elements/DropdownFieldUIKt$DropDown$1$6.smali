.class final Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;
.super Ljava/lang/Object;
.source "DropdownFieldUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->DropDown(Lcom/stripe/android/uicore/elements/DropdownFieldController;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDropdownFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,322:1\n1872#2,2:323\n1874#2:331\n1225#3,6:325\n*S KotlinDebug\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6\n*L\n173#1:323,2\n173#1:331\n184#1:325,6\n*E\n"
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
.field final synthetic $controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

.field final synthetic $currentTextColor:J

.field final synthetic $expanded$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollState:Landroidx/compose/foundation/ScrollState;

.field final synthetic $selectedIndex$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$PDmmJYZueNTRpVZRR7rLe3HgX4I(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->invoke$lambda$3$lambda$0(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$R9VhgOSZxFw1dqZPuSaCYzruChw(Lcom/stripe/android/uicore/elements/DropdownFieldController;ILandroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->invoke$lambda$3$lambda$2$lambda$1(Lcom/stripe/android/uicore/elements/DropdownFieldController;ILandroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/util/List;JLcom/stripe/android/uicore/elements/DropdownFieldController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/foundation/ScrollState;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$items:Ljava/util/List;

    iput-wide p2, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$currentTextColor:J

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$selectedIndex$delegate:Landroidx/compose/runtime/State;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$expanded$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$scrollState:Landroidx/compose/foundation/ScrollState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$3$lambda$0(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 3

    const-string v0, "layoutCoordinates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    iget-boolean v0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-nez v0, :cond_0

    .line 190
    iget v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p2}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    move-result p2

    add-int/2addr v0, p2

    iput v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 p1, 0x1

    .line 191
    iput-boolean p1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 193
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2$lambda$1(Lcom/stripe/android/uicore/elements/DropdownFieldController;ILandroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    .line 185
    invoke-static {p2, v0}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->access$DropDown$lambda$6(Landroidx/compose/runtime/MutableState;Z)V

    .line 186
    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onValueChange(I)V

    .line 187
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 171
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move/from16 v1, p3

    const-string v2, "$this$DropdownMenu"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 172
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 195
    :cond_0
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 172
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    const/4 v10, -0x1

    if-eqz v2, :cond_2

    const v2, 0x5134a1fe

    const-string v3, "com.stripe.android.uicore.elements.DropDown.<anonymous>.<anonymous> (DropdownFieldUI.kt:171)"

    invoke-static {v2, v1, v10, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    new-instance v11, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 173
    iget-object v1, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$items:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-wide v3, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$currentTextColor:J

    iget-object v12, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    iget-object v13, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$selectedIndex$delegate:Landroidx/compose/runtime/State;

    iget-object v14, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$expanded$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v15, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6;->$scrollState:Landroidx/compose/foundation/ScrollState;

    .line 324
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v17, v2, 0x1

    if-gez v2, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v5, Ljava/lang/String;

    .line 174
    new-instance v6, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    invoke-static {v13}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->access$DropDown$lambda$3(Landroidx/compose/runtime/State;)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_2

    :cond_4
    move v8, v10

    :goto_2
    const/4 v9, 0x1

    sub-int/2addr v8, v9

    if-lt v2, v8, :cond_5

    move v8, v9

    goto :goto_3

    :cond_5
    move v8, v1

    :goto_3
    iput-boolean v8, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    const v8, 0x26874867

    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 175
    invoke-static {v13}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->access$DropDown$lambda$3(Landroidx/compose/runtime/State;)Ljava/lang/Integer;

    move-result-object v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v2, v8, :cond_7

    .line 176
    invoke-static {v14}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->access$DropDown$lambda$5(Landroidx/compose/runtime/MutableState;)Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6$1$1;

    const/4 v10, 0x0

    invoke-direct {v9, v15, v11, v10}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6$1$1;-><init>(Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/coroutines/Continuation;)V

    check-cast v9, Lkotlin/jvm/functions/Function2;

    invoke-static {v8, v9, v7, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    :cond_7
    :goto_4
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 182
    invoke-static {v13}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->access$DropDown$lambda$3(Landroidx/compose/runtime/State;)Ljava/lang/Integer;

    move-result-object v8

    if-nez v8, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v2, v8, :cond_9

    const/4 v9, 0x1

    goto :goto_6

    :cond_9
    :goto_5
    move v9, v1

    .line 188
    :goto_6
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v8, Landroidx/compose/ui/Modifier;

    new-instance v10, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6$$ExternalSyntheticLambda0;

    invoke-direct {v10, v6, v11}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    invoke-static {v8, v10}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v8, 0xf34bed5

    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v10

    or-int/2addr v8, v10

    .line 325
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_a

    .line 326
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_b

    .line 184
    :cond_a
    new-instance v10, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6$$ExternalSyntheticLambda1;

    invoke-direct {v10, v12, v2, v14}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$6$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/uicore/elements/DropdownFieldController;ILandroidx/compose/runtime/MutableState;)V

    .line 328
    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    :cond_b
    check-cast v10, Lkotlin/jvm/functions/Function0;

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v8, 0x0

    move v2, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    move v10, v1

    move-object v1, v5

    move-object v5, v6

    move-object/from16 v6, v18

    .line 180
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->DropdownMenuItem-T042LqI(Ljava/lang/String;ZJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v7, p2

    move v1, v10

    move/from16 v2, v17

    const/4 v10, -0x1

    goto/16 :goto_1

    .line 331
    :cond_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    return-void
.end method

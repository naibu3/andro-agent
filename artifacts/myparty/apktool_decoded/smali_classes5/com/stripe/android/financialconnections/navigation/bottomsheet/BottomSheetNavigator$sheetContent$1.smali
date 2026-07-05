.class final Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;
.super Ljava/lang/Object;
.source "BottomSheetNavigation.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;-><init>(Landroidx/compose/material/ModalBottomSheetState;)V
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
    value = "SMAP\nBottomSheetNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetNavigation.kt\ncom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1225#2,6:252\n1225#2,6:258\n1225#2,6:264\n1225#2,6:270\n1225#2,6:276\n81#3:282\n81#3:283\n1863#4,2:284\n*S KotlinDebug\n*F\n+ 1 BottomSheetNavigation.kt\ncom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1\n*L\n163#1:252,6\n184#1:258,6\n188#1:264,6\n197#1:270,6\n200#1:276,6\n155#1:282\n160#1:283\n198#1:284,2\n*E\n"
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
.field final synthetic this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;


# direct methods
.method public static synthetic $r8$lambda$Mo0KCiaKZVXsFmHV15xUJQ5LgBo(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;Landroidx/navigation/NavBackStackEntry;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$7$lambda$6(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;Landroidx/navigation/NavBackStackEntry;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TUNyzMZKcp2_FucV-rmnFh7oy8c(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;Landroidx/navigation/NavBackStackEntry;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$9$lambda$8(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;Landroidx/navigation/NavBackStackEntry;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ivZ1MqPE5K8cJPxwBW_AlMmKq4Q(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$5$lambda$4(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/Set<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;)",
            "Ljava/util/Set<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;"
        }
    .end annotation

    .line 282
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method private static final invoke$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;
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

    .line 283
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/navigation/NavBackStackEntry;

    return-object p0
.end method

.method private static final invoke$lambda$5$lambda$4(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;)Lkotlin/Unit;
    .locals 1

    .line 189
    invoke-static {p0}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->access$getState(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;)Landroidx/navigation/NavigatorState;

    move-result-object p0

    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/navigation/NavigatorState;->popWithTransition(Landroidx/navigation/NavBackStackEntry;Z)V

    .line 190
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$7$lambda$6(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;Landroidx/navigation/NavBackStackEntry;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->access$getState(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;)Landroidx/navigation/NavigatorState;

    move-result-object p0

    .line 284
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavBackStackEntry;

    .line 198
    invoke-virtual {p0, p2}, Landroidx/navigation/NavigatorState;->markTransitionComplete(Landroidx/navigation/NavBackStackEntry;)V

    goto :goto_0

    .line 199
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$9$lambda$8(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;Landroidx/navigation/NavBackStackEntry;)Lkotlin/Unit;
    .locals 1

    const-string v0, "backStackEntry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 204
    invoke-static {p0}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->access$getState(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;)Landroidx/navigation/NavigatorState;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroidx/navigation/NavigatorState;->markTransitionComplete(Landroidx/navigation/NavBackStackEntry;)V

    goto :goto_0

    .line 211
    :cond_0
    invoke-static {p0}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->access$getState(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;)Landroidx/navigation/NavigatorState;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Landroidx/navigation/NavigatorState;->pop(Landroidx/navigation/NavBackStackEntry;Z)V

    .line 213
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 153
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    .line 154
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 214
    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 154
    :cond_3
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator.sheetContent.<anonymous> (BottomSheetNavigation.kt:153)"

    const v2, -0x65b1ebaa

    invoke-static {v2, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    const/4 v0, 0x0

    invoke-static {p2, v0}, Landroidx/compose/runtime/saveable/SaveableStateHolderKt;->rememberSaveableStateHolder(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;

    move-result-object v4

    .line 155
    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->getTransitionsInProgress$financial_connections_release()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, p2, v0, v3}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v1

    .line 162
    iget-object v5, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-static {v5}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->access$getBackStack(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    const v6, -0x22a1fcdf

    invoke-interface {p2, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v6, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-interface {p2, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 163
    iget-object v7, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    .line 252
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_5

    .line 253
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_6

    .line 163
    :cond_5
    new-instance v6, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$retainedEntry$2$1;

    invoke-direct {v6, v7, v2}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$retainedEntry$2$1;-><init>(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Lkotlin/coroutines/Continuation;)V

    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 255
    invoke-interface {p2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 163
    :cond_6
    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v6, 0x6

    .line 160
    invoke-static {v2, v5, v8, p2, v6}, Landroidx/compose/runtime/SnapshotStateKt;->produceState(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    const v7, -0x22a191c0

    invoke-interface {p2, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 183
    invoke-static {v5}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v7

    if-eqz v7, :cond_b

    .line 184
    invoke-static {v5}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v7

    const v8, -0x22a189b0

    invoke-interface {p2, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v8, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-interface {p2, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    iget-object v9, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    .line 258
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_7

    .line 259
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_8

    .line 184
    :cond_7
    new-instance v8, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$1$1;

    invoke-direct {v8, v9, v2}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$1$1;-><init>(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Lkotlin/coroutines/Continuation;)V

    move-object v10, v8

    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 261
    invoke-interface {p2, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    :cond_8
    check-cast v10, Lkotlin/jvm/functions/Function2;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v7, v10, p2, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    const v2, -0x22a1801c

    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    .line 188
    iget-object v7, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    .line 264
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_9

    .line 265
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v8, v2, :cond_a

    .line 188
    :cond_9
    new-instance v8, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda0;

    invoke-direct {v8, v7, v5}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;)V

    .line 267
    invoke-interface {p2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 188
    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v0, v8, p2, v0, v3}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    :cond_b
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 194
    invoke-static {v5}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->invoke$lambda$2(Landroidx/compose/runtime/State;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v2

    .line 195
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;->getSheetState$financial_connections_release()Landroidx/compose/material/ModalBottomSheetState;

    move-result-object v3

    const v0, -0x22a15a5e

    .line 196
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    iget-object v5, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    .line 197
    iget-object v5, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    .line 270
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_c

    .line 271
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v7, v0, :cond_d

    .line 197
    :cond_c
    new-instance v7, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda1;

    invoke-direct {v7, v5, v1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;)V

    .line 273
    invoke-interface {p2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 197
    :cond_d
    move-object v5, v7

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, -0x22a1472f

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    iget-object v7, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    invoke-interface {p2, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    .line 200
    iget-object v7, p0, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1;->this$0:Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;

    .line 276
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_e

    .line 277
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v8, v0, :cond_f

    .line 200
    :cond_e
    new-instance v8, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda2;

    invoke-direct {v8, v7, v1}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/runtime/State;)V

    .line 279
    invoke-interface {p2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 200
    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    and-int/lit8 p3, p3, 0xe

    sget v0, Landroidx/compose/material/ModalBottomSheetState;->$stable:I

    shl-int/2addr v0, v6

    or-int/2addr p3, v0

    move-object v1, p1

    move-object v7, p2

    move-object v6, v8

    move v8, p3

    .line 193
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/navigation/bottomsheet/SheetContentHostKt;->SheetContentHost(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_10
    return-void
.end method

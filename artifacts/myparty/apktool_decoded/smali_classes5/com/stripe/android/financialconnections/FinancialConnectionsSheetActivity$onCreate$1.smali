.class final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->onCreate(Landroid/os/Bundle;)V
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
    value = "SMAP\nFinancialConnectionsSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetActivity.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,186:1\n1225#2,6:187\n1225#2,6:193\n81#3:199\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetActivity.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1\n*L\n74#1:187,6\n84#1:193,6\n72#1:199\n*E\n"
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
.field final synthetic this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;


# direct methods
.method public static synthetic $r8$lambda$9gw9gGruCwPLOJipnsa75WincPs(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->invoke$lambda$3$lambda$2(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    .line 70
    invoke-static {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;"
        }
    .end annotation

    .line 199
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)Lkotlin/Unit;
    .locals 0

    .line 85
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onDismissed()V

    .line 86
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 70
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 71
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 71
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.<anonymous> (FinancialConnectionsSheetActivity.kt:70)"

    const v2, 0x360c7b6b

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p2, p2, p1, v0, v1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->rememberStripeBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    move-result-object v1

    .line 72
    iget-object v2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, p2, p1, v0, v3}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 74
    invoke-static {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getViewEffect()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;

    move-result-object v4

    const v5, -0x3ea1d895

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    iget-object v6, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    .line 187
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_3

    .line 188
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_4

    .line 74
    :cond_3
    new-instance v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1$1$1;

    invoke-direct {v5, v2, v6, v1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1$1$1;-><init>(Landroidx/compose/runtime/State;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    move-object v7, v5

    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 190
    invoke-interface {p1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 74
    :cond_4
    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v4, v7, p1, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    const p2, -0x3ea1af94

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    .line 84
    iget-object v4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    .line 193
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez p2, :cond_5

    .line 194
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne v5, p2, :cond_6

    .line 84
    :cond_5
    new-instance v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1$$ExternalSyntheticLambda0;

    invoke-direct {v5, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V

    .line 196
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 84
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v0, v5, p1, v0, v3}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 88
    invoke-static {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getTheme()Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object p2

    new-instance v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1$3;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    invoke-direct {v2, v1, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1$3;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V

    const/16 v1, 0x36

    const v4, 0x7cf4e5fa

    invoke-static {v4, v3, v2, p1, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/16 v2, 0x30

    invoke-static {p2, v1, p1, v2, v0}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->FinancialConnectionsTheme(Lcom/stripe/android/financialconnections/ui/theme/Theme;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method

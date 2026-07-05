.class final Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;
.super Ljava/lang/Object;
.source "CustomerSheetActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nCustomerSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetActivity.kt\ncom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,113:1\n1225#2,6:114\n1225#2,6:120\n1225#2,6:126\n1225#2,6:132\n81#3:138\n*S KotlinDebug\n*F\n+ 1 CustomerSheetActivity.kt\ncom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1\n*L\n71#1:114,6\n82#1:120,6\n89#1:126,6\n95#1:132,6\n80#1:138\n*E\n"
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
.field final synthetic this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;


# direct methods
.method public static synthetic $r8$lambda$Vpro_Zhwq03L33DeTuOvchYnYUQ(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->invoke$lambda$5$lambda$4(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Z5nBd3Kh4BxThgQ5F-_mbCHeS90(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->invoke$lambda$7$lambda$6(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fYAfeA1N0-6RQU4rQzg1jBjg68I(Lcom/stripe/android/customersheet/CustomerSheetActivity;Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->invoke$lambda$1$lambda$0(Lcom/stripe/android/customersheet/CustomerSheetActivity;Landroidx/compose/material/ModalBottomSheetValue;)Z

    move-result p0

    return p0
.end method

.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$2(Landroidx/compose/runtime/State;)Lcom/stripe/android/customersheet/InternalCustomerSheetResult;
    .locals 0

    .line 69
    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->invoke$lambda$2(Landroidx/compose/runtime/State;)Lcom/stripe/android/customersheet/InternalCustomerSheetResult;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/stripe/android/customersheet/CustomerSheetActivity;Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    sget-object v0, Landroidx/compose/material/ModalBottomSheetValue;->Hidden:Landroidx/compose/material/ModalBottomSheetValue;

    if-ne p1, v0, :cond_0

    .line 73
    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->access$getViewModel(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->bottomSheetConfirmStateChange()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final invoke$lambda$2(Landroidx/compose/runtime/State;)Lcom/stripe/android/customersheet/InternalCustomerSheetResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
            ">;)",
            "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;"
        }
    .end annotation

    .line 138
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;

    return-object p0
.end method

.method private static final invoke$lambda$5$lambda$4(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lkotlin/Unit;
    .locals 1

    .line 90
    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->access$getViewModel(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBackPressed;->INSTANCE:Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBackPressed;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction;

    invoke-virtual {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V

    .line 91
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$7$lambda$6(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lkotlin/Unit;
    .locals 1

    .line 95
    invoke-static {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->access$getViewModel(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDismissed;->INSTANCE:Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnDismissed;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction;

    invoke-virtual {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 69
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 70
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 98
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 70
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous> (CustomerSheetActivity.kt:69)"

    const v2, 0x4db2cd7e    # 3.7497645E8f

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const p2, -0x4d2da0ce

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    .line 71
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    .line 114
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_3

    .line 115
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_4

    .line 71
    :cond_3
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    .line 117
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 71
    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 70
    invoke-static {p2, v1, p1, v0, v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->rememberStripeBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    move-result-object v3

    .line 80
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-static {v1}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->access$getViewModel(Lcom/stripe/android/customersheet/CustomerSheetActivity;)Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->getResult()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-static {v1, p2, p1, v0, v2}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v1

    .line 82
    invoke-static {v1}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->invoke$lambda$2(Landroidx/compose/runtime/State;)Lcom/stripe/android/customersheet/InternalCustomerSheetResult;

    move-result-object v4

    const v5, -0x4d2d7233

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    iget-object v6, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    iget-object v6, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    .line 120
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_5

    .line 121
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_6

    .line 82
    :cond_5
    new-instance v5, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$1$1;

    invoke-direct {v5, v1, v3, v6, p2}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$1$1;-><init>(Landroidx/compose/runtime/State;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/customersheet/CustomerSheetActivity;Lkotlin/coroutines/Continuation;)V

    move-object v7, v5

    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 123
    invoke-interface {p1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 82
    :cond_6
    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v4, v7, p1, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    const p2, -0x4d2d5800

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    .line 89
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    .line 126
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez p2, :cond_7

    .line 127
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne v4, p2, :cond_8

    .line 89
    :cond_7
    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda1;

    invoke-direct {v4, v1}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    .line 129
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 89
    :cond_8
    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v0, v4, p1, v0, v2}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    const p2, -0x4d2d3b7e

    .line 94
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    .line 95
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    .line 132
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_9

    .line 133
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_a

    .line 95
    :cond_9
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda2;

    invoke-direct {v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    .line 135
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 95
    :cond_a
    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 96
    new-instance p2, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$4;

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-direct {p2, v0}, Lcom/stripe/android/customersheet/CustomerSheetActivity$onCreate$1$1$4;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;)V

    const/16 v0, 0x36

    const v1, 0x4647bb26

    invoke-static {v1, v2, p2, p1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v7, p2

    check-cast v7, Lkotlin/jvm/functions/Function2;

    sget p2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->$stable:I

    or-int/lit16 v9, p2, 0x6000

    const/4 v10, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, p1

    .line 93
    invoke-static/range {v3 .. v10}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->ElementsBottomSheetLayout-TN_CM5M(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    return-void
.end method

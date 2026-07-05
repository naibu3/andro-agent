.class final Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;
.super Ljava/lang/Object;
.source "ManageActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->ScreenContent(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageActivity.kt\ncom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,171:1\n1225#2,6:172\n1225#2,6:178\n81#3:184\n*S KotlinDebug\n*F\n+ 1 ManageActivity.kt\ncom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1\n*L\n119#1:172,6\n126#1:178,6\n119#1:184\n*E\n"
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
.field final synthetic $navigator:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

.field final synthetic $screen:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;


# direct methods
.method public static synthetic $r8$lambda$Ez4LgwWwZuJ5NNOPtX8D0gGgrvw(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->invoke$lambda$3$lambda$2(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->$screen:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->$navigator:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;"
        }
    .end annotation

    .line 184
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lkotlin/Unit;
    .locals 1

    .line 126
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getManageNavigator()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Back;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Back;

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->performAction(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 118
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 119
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 127
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 119
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.ScreenContent.<anonymous> (ManageActivity.kt:118)"

    const v2, -0x69f2616e

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const p2, -0x7c379f57

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->$screen:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->$screen:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    .line 172
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_3

    .line 173
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_4

    .line 120
    :cond_3
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;->topBarState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 175
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 119
    :cond_4
    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 p2, 0x0

    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 121
    invoke-static {v1, v2, p1, p2, v0}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p2

    .line 123
    invoke-static {p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->invoke$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object v0

    .line 124
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->$navigator:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->getCanGoBack()Z

    move-result v1

    const p2, -0x7c3778c6    # -1.178599E-36f

    .line 125
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    .line 126
    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    .line 178
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_5

    .line 179
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne v3, p2, :cond_6

    .line 126
    :cond_5
    new-instance v3, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    .line 181
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 126
    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v6, 0x180

    const/16 v7, 0x10

    const/4 v2, 0x1

    const/4 v4, 0x0

    move-object v5, p1

    .line 122
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->PaymentSheetTopBar-FJfuzF0(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZLkotlin/jvm/functions/Function0;FLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method

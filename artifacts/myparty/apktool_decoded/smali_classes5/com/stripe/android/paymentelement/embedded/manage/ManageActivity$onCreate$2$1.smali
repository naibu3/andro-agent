.class final Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;
.super Ljava/lang/Object;
.source "ManageActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageActivity.kt\ncom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,171:1\n1225#2,6:172\n1225#2,6:178\n81#3:184\n*S KotlinDebug\n*F\n+ 1 ManageActivity.kt\ncom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1\n*L\n82#1:172,6\n86#1:178,6\n80#1:184\n*E\n"
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
.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;


# direct methods
.method public static synthetic $r8$lambda$nee2HWh4QZ2GVMGFxSKnNl-pQEY(Landroidx/compose/runtime/State;Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->invoke$lambda$2$lambda$1(Landroidx/compose/runtime/State;Landroidx/compose/material/ModalBottomSheetValue;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$sBa1b1CM2cJxhi-0NxQlcxk9aXw(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->invoke$lambda$4$lambda$3(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;
    .locals 0

    .line 79
    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;"
        }
    .end annotation

    .line 184
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    return-object p0
.end method

.method private static final invoke$lambda$2$lambda$1(Landroidx/compose/runtime/State;Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;->isPerformingNetworkOperation()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final invoke$lambda$4$lambda$3(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    .line 87
    invoke-static {p0, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->access$setManageResult(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Z)V

    .line 88
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->finish()V

    .line 89
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 79
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 80
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 80
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.onCreate.<anonymous>.<anonymous> (ManageActivity.kt:79)"

    const v2, -0x4dbd4aae

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getManageNavigator()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->getScreen()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p2, v0, p1, v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p2

    const v3, 0x37f41ed3

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 172
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    .line 173
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    .line 82
    :cond_3
    new-instance v4, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/State;)V

    .line 175
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 82
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 81
    invoke-static {v0, v4, p1, v1, v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->rememberStripeBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    move-result-object v5

    const v0, 0x37f43610

    .line 85
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    .line 86
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    .line 178
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_5

    .line 179
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_6

    .line 86
    :cond_5
    new-instance v3, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$$ExternalSyntheticLambda1;

    invoke-direct {v3, v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    .line 181
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 86
    :cond_6
    move-object v8, v3

    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 90
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Landroidx/compose/runtime/State;)V

    const/16 p2, 0x36

    const v1, 0x6d3706aa

    invoke-static {v1, v2, v0, p1, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v9, p2

    check-cast v9, Lkotlin/jvm/functions/Function2;

    sget p2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->$stable:I

    or-int/lit16 v11, p2, 0x6000

    const/4 v12, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v10, p1

    .line 84
    invoke-static/range {v5 .. v12}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->ElementsBottomSheetLayout-TN_CM5M(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method

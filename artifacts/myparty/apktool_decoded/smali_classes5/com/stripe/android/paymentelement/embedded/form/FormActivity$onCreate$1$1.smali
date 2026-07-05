.class final Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;
.super Ljava/lang/Object;
.source "FormActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nFormActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormActivity.kt\ncom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1225#2,6:110\n1225#2,6:116\n81#3:122\n*S KotlinDebug\n*F\n+ 1 FormActivity.kt\ncom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1\n*L\n63#1:110,6\n67#1:116,6\n61#1:122\n*E\n"
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
.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;


# direct methods
.method public static synthetic $r8$lambda$W78U-axmZWcG-oee_9oDn5330e4(Landroidx/compose/runtime/State;Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->invoke$lambda$2$lambda$1(Landroidx/compose/runtime/State;Landroidx/compose/material/ModalBottomSheetValue;)Z

    move-result p0

    return p0
.end method

.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;
    .locals 0

    .line 60
    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;"
        }
    .end annotation

    .line 122
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    return-object p0
.end method

.method private static final invoke$lambda$2$lambda$1(Landroidx/compose/runtime/State;Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 60
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 61
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 61
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentelement.embedded.form.FormActivity.onCreate.<anonymous>.<anonymous> (FormActivity.kt:60)"

    const v2, -0x3d75af6b

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getFormActivityStateHelper()Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    move-result-object p2

    invoke-interface {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p2, v0, p1, v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p2

    const v3, 0x5f9ed2c0

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 110
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    .line 111
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    .line 63
    :cond_3
    new-instance v4, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/State;)V

    .line 113
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 63
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 62
    invoke-static {v0, v4, p1, v1, v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->rememberStripeBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    move-result-object v5

    .line 67
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    const v1, 0x5f9ee75d

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    .line 116
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_5

    .line 117
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_6

    .line 67
    :cond_5
    new-instance v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$1$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Lkotlin/reflect/KFunction;

    .line 119
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 67
    :cond_6
    check-cast v3, Lkotlin/reflect/KFunction;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v8, v3

    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 68
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Landroidx/compose/runtime/State;)V

    const/16 p2, 0x36

    const v1, -0x65f37c13

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

    .line 65
    invoke-static/range {v5 .. v12}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->ElementsBottomSheetLayout-TN_CM5M(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method

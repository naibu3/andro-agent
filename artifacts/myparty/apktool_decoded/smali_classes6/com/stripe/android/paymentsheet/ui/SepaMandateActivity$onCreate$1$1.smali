.class final Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;
.super Ljava/lang/Object;
.source "SepaMandateActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nSepaMandateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SepaMandateActivity.kt\ncom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,133:1\n1225#2,6:134\n*S KotlinDebug\n*F\n+ 1 SepaMandateActivity.kt\ncom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1\n*L\n57#1:134,6\n*E\n"
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
.field final synthetic $merchantName:Ljava/lang/String;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;->$merchantName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 52
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 53
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 53
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous> (SepaMandateActivity.kt:52)"

    const v2, 0x1359e2fe

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {v0, v0, p1, p2, v1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->rememberStripeBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    move-result-object v2

    .line 57
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    const v0, -0x37abfa29

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 134
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    .line 135
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4

    .line 57
    :cond_3
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$1$1;

    invoke-direct {v0, p2}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Lkotlin/reflect/KFunction;

    .line 137
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 57
    :cond_4
    check-cast v1, Lkotlin/reflect/KFunction;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 58
    new-instance p2, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;->$merchantName:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-direct {p2, v0, v1}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)V

    const/16 v0, 0x36

    const v1, 0x2c1e1aa6

    const/4 v3, 0x1

    invoke-static {v1, v3, p2, p1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function2;

    sget p2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->$stable:I

    or-int/lit16 v8, p2, 0x6000

    const/4 v9, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p1

    .line 55
    invoke-static/range {v2 .. v9}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->ElementsBottomSheetLayout-TN_CM5M(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method

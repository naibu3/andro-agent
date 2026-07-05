.class final Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1;
.super Ljava/lang/Object;
.source "SuccessContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->SuccessScreenPreview(Lcom/stripe/android/financialconnections/features/success/SuccessState;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nSuccessContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessContent.kt\ncom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,402:1\n1225#2,6:403\n*S KotlinDebug\n*F\n+ 1 SuccessContent.kt\ncom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1\n*L\n352#1:403,6\n*E\n"
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
.field final synthetic $state:Lcom/stripe/android/financialconnections/features/success/SuccessState;


# direct methods
.method public static synthetic $r8$lambda$mFSm-Ha-TF2Z5EHICJFS0OVnwvE()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1;->invoke$lambda$1$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/success/SuccessState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1;->$state:Lcom/stripe/android/financialconnections/features/success/SuccessState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 352
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 347
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 348
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 353
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 348
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.success.SuccessScreenPreview.<anonymous> (SuccessContent.kt:347)"

    const v2, -0x6cc69bc3

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 350
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1;->$state:Lcom/stripe/android/financialconnections/features/success/SuccessState;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/success/SuccessState;->getCompleteSession()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v3

    .line 351
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1;->$state:Lcom/stripe/android/financialconnections/features/success/SuccessState;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/success/SuccessState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v2

    const p2, -0x1e42e7d9

    .line 350
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 403
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 404
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    .line 405
    new-instance p2, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessScreenPreview$1$$ExternalSyntheticLambda0;-><init>()V

    .line 406
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 352
    :cond_3
    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v6, 0x6006

    const/4 v7, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v5, p1

    .line 348
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SuccessContentInternal-8GFhAUE(ZLandroidx/compose/ui/unit/Dp;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method

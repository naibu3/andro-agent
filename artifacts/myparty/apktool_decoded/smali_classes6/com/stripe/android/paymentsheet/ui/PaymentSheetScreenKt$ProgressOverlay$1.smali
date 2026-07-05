.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1;
.super Ljava/lang/Object;
.source "PaymentSheetScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->ProgressOverlay(Landroidx/compose/foundation/layout/BoxScope;ZLcom/stripe/android/paymentsheet/state/WalletsProcessingState;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/animation/AnimatedContentScope;",
        "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentSheetScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,526:1\n1225#2,6:527\n149#3:533\n*S KotlinDebug\n*F\n+ 1 PaymentSheetScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1\n*L\n262#1:527,6\n271#1:533\n*E\n"
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
.field final synthetic $contentVisible:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1;->$contentVisible:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 252
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1;->invoke(Landroidx/compose/animation/AnimatedContentScope;Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedContentScope;Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.paymentsheet.ui.ProgressOverlay.<anonymous> (PaymentSheetScreen.kt:252)"

    const v1, -0x43e4b42a

    .line 253
    invoke-static {v1, p4, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x1973490b

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1;->$contentVisible:Z

    const/4 v0, 0x0

    if-nez p1, :cond_2

    .line 254
    invoke-static {p3, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->access$ProgressOverlayProcessing(Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void

    .line 255
    :cond_2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 258
    instance-of p1, p2, Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Processing;

    if-eqz p1, :cond_3

    const p1, -0x14f2f243

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 259
    invoke-static {p3, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->access$ProgressOverlayProcessing(Landroidx/compose/runtime/Composer;I)V

    .line 258
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_2

    .line 261
    :cond_3
    instance-of p1, p2, Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Completed;

    if-eqz p1, :cond_9

    const p1, -0x14f10d48

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const p1, -0x19731cba

    .line 262
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 p1, p4, 0x70

    const/16 v1, 0x30

    xor-int/2addr p1, v1

    const/16 v2, 0x20

    if-le p1, v2, :cond_4

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    and-int/lit8 p1, p4, 0x30

    if-ne p1, v2, :cond_6

    :cond_5
    const/4 p1, 0x1

    goto :goto_0

    :cond_6
    move p1, v0

    .line 527
    :goto_0
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_7

    .line 528
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne p4, p1, :cond_8

    .line 262
    :cond_7
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1$1$1;

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$ProgressOverlay$1$1$1;-><init>(Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Lkotlin/coroutines/Continuation;)V

    move-object p4, p1

    check-cast p4, Lkotlin/jvm/functions/Function2;

    .line 530
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 262
    :cond_8
    check-cast p4, Lkotlin/jvm/functions/Function2;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {p2, p4, p3, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 268
    sget p1, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_googlepay_primary_button_checkmark:I

    invoke-static {p1, p3, v0}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v2

    .line 269
    sget-object p1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget p2, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {p1, p3, p2}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v5

    .line 271
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p1, Landroidx/compose/ui/Modifier;

    int-to-float p2, v1

    .line 533
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p2

    .line 271
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/SizeKt;->requiredSize-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v7, p3

    .line 267
    invoke-static/range {v2 .. v9}, Landroidx/compose/material/IconKt;->Icon-ww6aTOc(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    .line 261
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    :cond_9
    move-object v7, p3

    if-eqz p2, :cond_b

    .line 275
    instance-of p1, p2, Lcom/stripe/android/paymentsheet/state/WalletsProcessingState$Idle;

    if-eqz p1, :cond_a

    goto :goto_1

    :cond_a
    const p1, -0x197337eb

    .line 257
    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    :goto_1
    const p1, -0x1972db52

    .line 275
    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 257
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_c
    return-void
.end method

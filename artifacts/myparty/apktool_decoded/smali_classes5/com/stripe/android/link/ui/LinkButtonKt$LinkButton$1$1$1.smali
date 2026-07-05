.class final Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;
.super Ljava/lang/Object;
.source "LinkButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
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
.field final synthetic $state:Lcom/stripe/android/link/ui/LinkButtonState;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/LinkButtonState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;->$state:Lcom/stripe/android/link/ui/LinkButtonState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 172
    check-cast p1, Landroidx/compose/foundation/layout/RowScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "$this$Button"

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

    .line 173
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 180
    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 173
    :cond_3
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButton.kt:172)"

    const v2, -0x2ddbea3f

    invoke-static {v2, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;->$state:Lcom/stripe/android/link/ui/LinkButtonState;

    .line 174
    instance-of v1, v0, Lcom/stripe/android/link/ui/LinkButtonState$DefaultPayment;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    const p1, 0xc3bc9e8

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 175
    iget-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;->$state:Lcom/stripe/android/link/ui/LinkButtonState;

    check-cast p1, Lcom/stripe/android/link/ui/LinkButtonState$DefaultPayment;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/LinkButtonState$DefaultPayment;->getPaymentUI()Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    move-result-object p1

    .line 174
    invoke-static {p1, p2, v2}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$PaymentDetailsButtonContent(Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    .line 178
    :cond_5
    instance-of v1, v0, Lcom/stripe/android/link/ui/LinkButtonState$Email;

    if-eqz v1, :cond_6

    const p1, 0xc3bdca4

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonKt$LinkButton$1$1$1;->$state:Lcom/stripe/android/link/ui/LinkButtonState;

    check-cast p1, Lcom/stripe/android/link/ui/LinkButtonState$Email;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/LinkButtonState$Email;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2, v2}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$SignedInButtonContent(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    .line 179
    :cond_6
    sget-object v1, Lcom/stripe/android/link/ui/LinkButtonState$Default;->INSTANCE:Lcom/stripe/android/link/ui/LinkButtonState$Default;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const v0, 0xc3be6da

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, p2, p3}, Lcom/stripe/android/link/ui/LinkButtonKt;->access$SignedOutButtonContent(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 173
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void

    :cond_8
    const p1, 0xc3bc1de

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.class final Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;
.super Ljava/lang/Object;
.source "NewPaymentMethodRowButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt;->NewPaymentMethodRowButton(ZZILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/runtime/Composer;III)V
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
.field final synthetic $iconRequiresTinting:Z

.field final synthetic $iconRes:I

.field final synthetic $iconUrl:Ljava/lang/String;

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;


# direct methods
.method constructor <init>(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZLandroidx/compose/ui/Modifier;)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$iconRes:I

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$iconUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$iconRequiresTinting:Z

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$modifier:Landroidx/compose/ui/Modifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 70
    check-cast p1, Landroidx/compose/foundation/layout/RowScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "$this$PaymentMethodRowButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 71
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 71
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton.<anonymous> (NewPaymentMethodRowButton.kt:70)"

    const v1, 0x5421138c

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 72
    :cond_2
    iget v2, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$iconRes:I

    .line 73
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$iconUrl:Ljava/lang/String;

    .line 74
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    .line 75
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$iconRequiresTinting:Z

    .line 76
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/NewPaymentMethodRowButtonKt$NewPaymentMethodRowButton$3;->$modifier:Landroidx/compose/ui/Modifier;

    sget-object p3, Lcom/stripe/android/paymentsheet/verticalmode/UIConstants;->INSTANCE:Lcom/stripe/android/paymentsheet/verticalmode/UIConstants;

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/verticalmode/UIConstants;->getIconHeight-D9Ej5fM()F

    move-result p3

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p3, Lcom/stripe/android/paymentsheet/verticalmode/UIConstants;->INSTANCE:Lcom/stripe/android/paymentsheet/verticalmode/UIConstants;

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/verticalmode/UIConstants;->getIconWidth-D9Ej5fM()F

    move-result p3

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 77
    sget-object p1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v7

    sget p1, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 p1, p1, 0x6

    const/high16 p3, 0x30000

    or-int v9, p1, p3

    const/4 v10, 0x0

    move-object v8, p2

    .line 71
    invoke-static/range {v2 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt;->PaymentMethodIcon(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

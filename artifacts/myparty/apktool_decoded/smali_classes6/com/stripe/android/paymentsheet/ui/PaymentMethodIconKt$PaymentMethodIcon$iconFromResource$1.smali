.class final Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;
.super Ljava/lang/Object;
.source "PaymentMethodIcon.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt;->PaymentMethodIcon(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic $colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

.field final synthetic $contentAlignment:Landroidx/compose/ui/Alignment;

.field final synthetic $iconModifier:Landroidx/compose/ui/Modifier;

.field final synthetic $iconRes:I


# direct methods
.method constructor <init>(ILandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/Modifier;)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$iconRes:I

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$contentAlignment:Landroidx/compose/ui/Alignment;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$iconModifier:Landroidx/compose/ui/Modifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 42
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 43
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 43
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous> (PaymentMethodIcon.kt:42)"

    const v2, -0x472745de

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 44
    :cond_2
    iget v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$iconRes:I

    .line 45
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

    .line 47
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$contentAlignment:Landroidx/compose/ui/Alignment;

    .line 46
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$PaymentMethodIcon$iconFromResource$1;->$iconModifier:Landroidx/compose/ui/Modifier;

    const/16 v8, 0xc00

    move-object v7, p1

    .line 43
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt;->PaymentMethodIconFromResource(ILandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

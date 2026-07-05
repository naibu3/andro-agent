.class final Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;
.super Ljava/lang/Object;
.source "CardDetailsUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt;->CardNumberField(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V
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
.field final synthetic $availableNetworks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onBrandChoiceChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $savedPaymentMethodIcon:I

.field final synthetic $selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

.field final synthetic $shouldShowCardBrandDropdown:Z


# direct methods
.method constructor <init>(ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$shouldShowCardBrandDropdown:Z

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$availableNetworks:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$onBrandChoiceChanged:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$savedPaymentMethodIcon:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 218
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 219
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 232
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 219
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.CardNumberField.<anonymous> (CardDetailsUI.kt:218)"

    const v2, -0x59eca821

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$shouldShowCardBrandDropdown:Z

    if-eqz p2, :cond_3

    const p2, 0x21648589

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 221
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$selectedBrand:Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    .line 222
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$availableNetworks:Ljava/util/List;

    .line 223
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$onBrandChoiceChanged:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    .line 220
    invoke-static {p2, v0, v1, p1, v2}, Lcom/stripe/android/paymentsheet/ui/CardBrandDropdownKt;->CardBrandDropdown(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 219
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_1

    :cond_3
    const p2, 0x21684591

    .line 225
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 227
    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$CardNumberField$1;->$savedPaymentMethodIcon:I

    .line 229
    sget-object p2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v2

    .line 230
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v3, p2

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/16 v5, 0xdb0

    const/4 v1, 0x0

    move-object v4, p1

    .line 226
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt;->PaymentMethodIconFromResource(ILandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 225
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method

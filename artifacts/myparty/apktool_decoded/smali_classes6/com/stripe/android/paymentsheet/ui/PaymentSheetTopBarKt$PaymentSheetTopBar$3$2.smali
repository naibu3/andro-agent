.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3$2;
.super Ljava/lang/Object;
.source "PaymentSheetTopBar.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $canNavigateBack:Z

.field final synthetic $tintColor:J


# direct methods
.method constructor <init>(ZJ)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3$2;->$canNavigateBack:Z

    iput-wide p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3$2;->$tintColor:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 87
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 88
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 103
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 88
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous>.<anonymous> (PaymentSheetTopBar.kt:87)"

    const v2, 0x38b83cd2

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3$2;->$canNavigateBack:Z

    if-eqz p2, :cond_3

    .line 89
    sget p2, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_back:I

    goto :goto_1

    .line 91
    :cond_3
    sget p2, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_close:I

    .line 94
    :goto_1
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3$2;->$canNavigateBack:Z

    if-eqz v0, :cond_4

    .line 95
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_back:I

    goto :goto_2

    .line 97
    :cond_4
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_close:I

    :goto_2
    const/4 v1, 0x0

    .line 100
    invoke-static {p2, p1, v1}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v2

    .line 101
    invoke-static {v0, p1, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 102
    iget-wide v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$3$2;->$tintColor:J

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v4, 0x0

    move-object v7, p1

    .line 99
    invoke-static/range {v2 .. v9}, Landroidx/compose/material/IconKt;->Icon-ww6aTOc(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method

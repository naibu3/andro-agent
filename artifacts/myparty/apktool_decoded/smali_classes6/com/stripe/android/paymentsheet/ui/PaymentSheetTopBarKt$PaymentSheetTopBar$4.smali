.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;
.super Ljava/lang/Object;
.source "PaymentSheetTopBar.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->PaymentSheetTopBar--jt2gSs(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $isEnabled:Z

.field final synthetic $state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

.field final synthetic $tintColor:J


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZJ)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$isEnabled:Z

    iput-wide p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$tintColor:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 108
    check-cast p1, Landroidx/compose/foundation/layout/RowScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "$this$TopAppBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 109
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 109
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:108)"

    const v1, 0x6aecd99f    # 1.4316709E26f

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->getShowEditMenu()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 111
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->getEditMenuLabel()I

    move-result v0

    .line 112
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$isEnabled:Z

    .line 113
    iget-wide v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$tintColor:J

    .line 114
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$4;->$state:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;->getOnEditIconPressed()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    const/4 v6, 0x0

    move-object v5, p2

    .line 110
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->access$EditButton-FNF3uiM(IZJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    :cond_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method

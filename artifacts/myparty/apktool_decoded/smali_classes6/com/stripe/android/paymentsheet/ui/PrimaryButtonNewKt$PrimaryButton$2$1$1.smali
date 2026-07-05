.class final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;
.super Ljava/lang/Object;
.source "PrimaryButtonNew.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $areAnimationsDisabled:Z

.field final synthetic $label:Ljava/lang/String;

.field final synthetic $locked:Z

.field final synthetic $onProcessingCompleted:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$label:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$areAnimationsDisabled:Z

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$locked:Z

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$onProcessingCompleted:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 141
    check-cast p1, Landroidx/compose/foundation/layout/RowScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "$this$TextButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 142
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 142
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButtonNew.kt:141)"

    const v1, 0x1168011d

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 143
    :cond_2
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$label:Ljava/lang/String;

    .line 144
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$processingState:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    .line 145
    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$areAnimationsDisabled:Z

    .line 146
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$locked:Z

    .line 147
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt$PrimaryButton$2$1$1;->$onProcessingCompleted:Lkotlin/jvm/functions/Function0;

    const/4 v8, 0x0

    move-object v7, p2

    .line 142
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonNewKt;->access$Content(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

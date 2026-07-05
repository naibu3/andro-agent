.class final Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;
.super Ljava/lang/Object;
.source "ModalBottomSheetContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->ModalBottomSheetContent(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic $cta:Ljava/lang/String;

.field final synthetic $disclaimer:Lcom/stripe/android/financialconnections/ui/TextResource;

.field final synthetic $onClickableTextClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onConfirmModalClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/ui/TextResource;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$disclaimer:Lcom/stripe/android/financialconnections/ui/TextResource;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$onConfirmModalClick:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$cta:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 194
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 195
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 200
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 195
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:194)"

    const v2, -0x213333e8

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 196
    :cond_2
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    .line 197
    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$disclaimer:Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 198
    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$onConfirmModalClick:Lkotlin/jvm/functions/Function0;

    .line 199
    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$1;->$cta:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v7, p1

    .line 195
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$ModalBottomSheetFooter(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

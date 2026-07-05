.class final Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;
.super Ljava/lang/Object;
.source "ShapedIcon.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
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
.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $errorPainter:Landroidx/compose/ui/graphics/painter/Painter;

.field final synthetic $iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;


# direct methods
.method constructor <init>(Landroidx/compose/ui/graphics/painter/Painter;Lcom/stripe/android/financialconnections/features/common/IconSize;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;->$errorPainter:Landroidx/compose/ui/graphics/painter/Painter;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;->$contentDescription:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 84
    check-cast p1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
    .locals 2

    const-string v0, "$this$StripeImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 85
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 85
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous>.<anonymous> (ShapedIcon.kt:84)"

    const v1, -0x4690bdda

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;->$errorPainter:Landroidx/compose/ui/graphics/painter/Painter;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$3$1;->$contentDescription:Ljava/lang/String;

    const/4 v1, 0x0

    .line 86
    invoke-static {p3, p1, v0, p2, v1}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt;->access$LocalIcon(Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 85
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method

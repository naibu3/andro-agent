.class final Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;
.super Ljava/lang/Object;
.source "ShapedIcon.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ShapedIconKt;->ShapedIcon(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

.field final synthetic $painter:Landroidx/compose/ui/graphics/painter/Painter;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;->$painter:Landroidx/compose/ui/graphics/painter/Painter;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;->$contentDescription:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 40
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 41
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 41
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:40)"

    const v2, -0x3a940fd8

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 43
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;->$iconSize:Lcom/stripe/android/financialconnections/features/common/IconSize;

    .line 42
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;->$painter:Landroidx/compose/ui/graphics/painter/Painter;

    .line 44
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt$ShapedIcon$1;->$contentDescription:Ljava/lang/String;

    const/4 v2, 0x0

    .line 41
    invoke-static {p2, v0, v1, p1, v2}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt;->access$LocalIcon(Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

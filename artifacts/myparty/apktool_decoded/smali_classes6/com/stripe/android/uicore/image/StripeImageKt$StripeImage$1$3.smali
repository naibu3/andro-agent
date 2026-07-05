.class final Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;
.super Ljava/lang/Object;
.source "StripeImage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/animation/AnimatedContentScope;",
        "Lcom/stripe/android/uicore/image/StripeImageState;",
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
.field final synthetic $alignment:Landroidx/compose/ui/Alignment;

.field final synthetic $colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $contentScale:Landroidx/compose/ui/layout/ContentScale;

.field final synthetic $errorContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $loadingContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $this_BoxWithConstraints:Landroidx/compose/foundation/layout/BoxWithConstraintsScope;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/ColorFilter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Alignment;",
            "Landroidx/compose/ui/layout/ContentScale;",
            "Landroidx/compose/ui/graphics/ColorFilter;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$errorContent:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$this_BoxWithConstraints:Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    iput-object p3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$loadingContent:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$contentDescription:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$alignment:Landroidx/compose/ui/Alignment;

    iput-object p7, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    iput-object p8, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 101
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Lcom/stripe/android/uicore/image/StripeImageState;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->invoke(Landroidx/compose/animation/AnimatedContentScope;Lcom/stripe/android/uicore/image/StripeImageState;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedContentScope;Lcom/stripe/android/uicore/image/StripeImageState;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.uicore.image.StripeImage.<anonymous>.<anonymous> (StripeImage.kt:101)"

    const v1, -0x13e711e1

    .line 102
    invoke-static {v1, p4, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 103
    :cond_0
    sget-object p1, Lcom/stripe/android/uicore/image/StripeImageState$Error;->INSTANCE:Lcom/stripe/android/uicore/image/StripeImageState$Error;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 p4, 0x0

    if-eqz p1, :cond_1

    const p1, -0x70cc9b21

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$errorContent:Lkotlin/jvm/functions/Function3;

    iget-object p2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$this_BoxWithConstraints:Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_0

    .line 104
    :cond_1
    sget-object p1, Lcom/stripe/android/uicore/image/StripeImageState$Loading;->INSTANCE:Lcom/stripe/android/uicore/image/StripeImageState$Loading;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, -0x70cc95df

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$loadingContent:Lkotlin/jvm/functions/Function3;

    iget-object p2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$this_BoxWithConstraints:Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_0

    .line 105
    :cond_2
    instance-of p1, p2, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    if-eqz p1, :cond_4

    const p1, 0x573ab73e

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 106
    iget-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$modifier:Landroidx/compose/ui/Modifier;

    const-string p4, "StripeImageFromUrl"

    invoke-static {p1, p4}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 111
    check-cast p2, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/image/StripeImageState$Success;->getPainter()Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v0

    .line 108
    iget-object v1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$contentDescription:Ljava/lang/String;

    .line 110
    iget-object v3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$alignment:Landroidx/compose/ui/Alignment;

    .line 109
    iget-object v4, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    .line 107
    iget-object v6, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$3;->$colorFilter:Landroidx/compose/ui/graphics/ColorFilter;

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/4 v5, 0x0

    move-object v7, p3

    .line 105
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 102
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void

    :cond_4
    move-object v7, p3

    const p1, -0x70cc9df0

    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.class final Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;
.super Ljava/lang/Object;
.source "StripeTheme.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic $colors:Lcom/stripe/android/uicore/StripeColors;

.field final synthetic $content:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shapes:Lcom/stripe/android/uicore/StripeShapes;

.field final synthetic $typography:Lcom/stripe/android/uicore/StripeTypography;


# direct methods
.method constructor <init>(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeTypography;Lcom/stripe/android/uicore/StripeShapes;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/StripeColors;",
            "Lcom/stripe/android/uicore/StripeTypography;",
            "Lcom/stripe/android/uicore/StripeShapes;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$colors:Lcom/stripe/android/uicore/StripeColors;

    iput-object p2, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$typography:Lcom/stripe/android/uicore/StripeTypography;

    iput-object p3, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$shapes:Lcom/stripe/android/uicore/StripeShapes;

    iput-object p4, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$content:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 529
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 530
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 540
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 530
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.StripeTheme.<anonymous> (StripeTheme.kt:529)"

    const v2, 0x13b99063

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 531
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$colors:Lcom/stripe/android/uicore/StripeColors;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()Landroidx/compose/material/Colors;

    move-result-object v0

    .line 532
    iget-object p2, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$typography:Lcom/stripe/android/uicore/StripeTypography;

    const/4 v1, 0x0

    invoke-static {p2, p1, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->toComposeTypography(Lcom/stripe/android/uicore/StripeTypography;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object p2

    .line 533
    iget-object v2, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$shapes:Lcom/stripe/android/uicore/StripeShapes;

    invoke-static {v2, p1, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->toComposeShapes(Lcom/stripe/android/uicore/StripeShapes;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeComposeShapes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeComposeShapes;->getMaterial()Landroidx/compose/material/Shapes;

    move-result-object v2

    .line 534
    new-instance v1, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1$1;

    iget-object v3, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1;->$content:Lkotlin/jvm/functions/Function2;

    invoke-direct {v1, v3}, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$1$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v4, -0x460f4dc9

    const/4 v5, 0x1

    invoke-static {v4, v5, v1, p1, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/16 v5, 0xc00

    const/4 v6, 0x0

    move-object v4, p1

    move-object v1, p2

    .line 530
    invoke-static/range {v0 .. v6}, Landroidx/compose/material/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

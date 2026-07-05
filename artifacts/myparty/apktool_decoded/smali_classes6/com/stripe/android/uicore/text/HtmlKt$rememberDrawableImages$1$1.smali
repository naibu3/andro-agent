.class final Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;
.super Ljava/lang/Object;
.source "Html.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/HtmlKt;->rememberDrawableImages-dwB-JkM(Ljava/util/Map;ILandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/String;",
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
.field final synthetic $painter:Landroidx/compose/ui/graphics/painter/Painter;

.field final synthetic $value:Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;


# direct methods
.method constructor <init>(Landroidx/compose/ui/graphics/painter/Painter;Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;->$painter:Landroidx/compose/ui/graphics/painter/Painter;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;->$value:Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 95
    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;->invoke(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 96
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 102
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 96
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.uicore.text.rememberDrawableImages.<anonymous>.<anonymous> (Html.kt:95)"

    const v1, -0x1035d5a2

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 97
    :cond_2
    iget-object v2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;->$painter:Landroidx/compose/ui/graphics/painter/Painter;

    .line 99
    iget-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;->$value:Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;->getContentDescription()I

    move-result p1

    const/4 p3, 0x0

    .line 98
    invoke-static {p1, p2, p3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 101
    iget-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;->$value:Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;->getColorFilter()Landroidx/compose/ui/graphics/ColorFilter;

    move-result-object v8

    const/4 v10, 0x0

    const/16 v11, 0x3c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, p2

    .line 96
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method

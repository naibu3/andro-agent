.class public final Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfoKt;
.super Ljava/lang/Object;
.source "StripeBottomSheetLayoutInfo.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeBottomSheetLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBottomSheetLayoutInfo.kt\ncom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfoKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,43:1\n169#2:44\n1225#3,6:45\n*S KotlinDebug\n*F\n+ 1 StripeBottomSheetLayoutInfo.kt\ncom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfoKt\n*L\n24#1:44\n28#1:45,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "rememberStripeBottomSheetLayoutInfo",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;",
        "cornerRadius",
        "Landroidx/compose/ui/unit/Dp;",
        "sheetBackgroundColor",
        "Landroidx/compose/ui/graphics/Color;",
        "scrimColor",
        "rememberStripeBottomSheetLayoutInfo-Hde_KZM",
        "(FJJLandroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;",
        "sheetShape",
        "Landroidx/compose/foundation/shape/RoundedCornerShape;",
        "sheetShape-0680j_4",
        "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final rememberStripeBottomSheetLayoutInfo-Hde_KZM(FJJLandroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;
    .locals 8

    const v0, 0x2ddc52fb

    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    .line 24
    sget-object p0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v1, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {p0, p5, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/StripeShapes;->getBottomSheetCornerRadius()F

    move-result p0

    .line 44
    invoke-static {p0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p0

    :cond_0
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_1

    .line 25
    sget-object p1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget p2, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {p1, p5, p2}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/material/Colors;->getSurface-0d7_KjU()J

    move-result-wide p1

    :cond_1
    move-wide v3, p1

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    .line 26
    sget-object p1, Landroidx/compose/material/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material/ModalBottomSheetDefaults;

    sget p2, Landroidx/compose/material/ModalBottomSheetDefaults;->$stable:I

    invoke-virtual {p1, p5, p2}, Landroidx/compose/material/ModalBottomSheetDefaults;->getScrimColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide p3

    :cond_2
    move-wide v5, p3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, -0x1

    const-string p2, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetLayoutInfo (StripeBottomSheetLayoutInfo.kt:26)"

    .line 27
    invoke-static {v0, p6, p1, p2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    const p1, -0x1762ec07

    invoke-interface {p5, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 45
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p1

    .line 46
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_4

    .line 29
    new-instance v1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;

    .line 30
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfoKt;->sheetShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Landroidx/compose/ui/graphics/Shape;

    const/4 v7, 0x0

    .line 29
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;-><init>(Landroidx/compose/ui/graphics/Shape;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    invoke-interface {p5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object p1, v1

    .line 28
    :cond_4
    check-cast p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;

    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p1
.end method

.method private static final sheetShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;
    .locals 6

    const/16 v4, 0xc

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v1, p0

    move v0, p0

    .line 38
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object p0

    return-object p0
.end method

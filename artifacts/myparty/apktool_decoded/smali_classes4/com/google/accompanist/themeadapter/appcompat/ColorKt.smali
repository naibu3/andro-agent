.class public final Lcom/google/accompanist/themeadapter/appcompat/ColorKt;
.super Ljava/lang/Object;
.source "Color.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0016\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000e"
    }
    d2 = {
        "MINIMUM_CONTRAST",
        "",
        "calculateContrastForForeground",
        "Landroidx/compose/ui/graphics/Color;",
        "foreground",
        "calculateContrastForForeground--OWjLjI",
        "(JJ)D",
        "calculateOnColor",
        "calculateOnColor-8_81llA",
        "(J)J",
        "calculateOnColorWithTextColorPrimary",
        "textColorPrimary",
        "calculateOnColorWithTextColorPrimary--OWjLjI",
        "(JJ)J",
        "themeadapter-appcompat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final MINIMUM_CONTRAST:D = 4.5


# direct methods
.method public static final calculateContrastForForeground--OWjLjI(JJ)D
    .locals 0

    .line 24
    invoke-static {p2, p3}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    move-result p2

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    move-result p0

    invoke-static {p2, p0}, Landroidx/core/graphics/ColorUtils;->calculateContrast(II)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final calculateOnColor-8_81llA(J)J
    .locals 4

    .line 55
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateContrastForForeground--OWjLjI(JJ)D

    move-result-wide v0

    .line 56
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v2

    invoke-static {p0, p1, v2, v3}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateContrastForForeground--OWjLjI(JJ)D

    move-result-wide p0

    cmpl-double p0, v0, p0

    if-lez p0, :cond_0

    .line 57
    sget-object p0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide p0

    return-wide p0

    :cond_0
    sget-object p0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide p0

    return-wide p0
.end method

.method public static final calculateOnColorWithTextColorPrimary--OWjLjI(JJ)J
    .locals 4

    .line 40
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    invoke-static {p0, p1, p2, p3}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateContrastForForeground--OWjLjI(JJ)D

    move-result-wide v0

    const-wide/high16 v2, 0x4012000000000000L    # 4.5

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    return-wide p2

    .line 45
    :cond_0
    invoke-static {p0, p1}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateOnColor-8_81llA(J)J

    move-result-wide p0

    return-wide p0
.end method

.class public final Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;
.super Ljava/lang/Object;
.source "ResourceUtils.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResourceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUtils.kt\ncom/google/accompanist/themeadapter/core/ResourceUtilsKt\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n427#1,4:442\n427#1,4:449\n233#2,3:434\n233#2,3:446\n1#3:437\n11065#4:438\n11400#4,3:439\n168#5:453\n*S KotlinDebug\n*F\n+ 1 ResourceUtils.kt\ncom/google/accompanist/themeadapter/core/ResourceUtilsKt\n*L\n308#1:442,4\n408#1:449,4\n95#1:434,3\n343#1:446,3\n257#1:438\n257#1:439,3\n410#1:453\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004H\u0002\u001a*\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0007\u001a4\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007\u001a(\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001bH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a\u0016\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007\u001a\u0016\u0010#\u001a\u0004\u0018\u00010$*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007\u001a0\u0010%\u001a\u00020&*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\'\u001a\u00020&H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)\u001a\u0016\u0010*\u001a\u0004\u0018\u00010\u0019*\u00020+2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0003\u001a\u00020\u0004*\u00020\u00028\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006,"
    }
    d2 = {
        "tempTypedValue",
        "Ljava/lang/ThreadLocal;",
        "Landroid/util/TypedValue;",
        "complexUnitCompat",
        "",
        "getComplexUnitCompat",
        "(Landroid/util/TypedValue;)I",
        "fontWeightOf",
        "Landroidx/compose/ui/text/font/FontWeight;",
        "weight",
        "parseShapeAppearance",
        "Landroidx/compose/foundation/shape/CornerBasedShape;",
        "context",
        "Landroid/content/Context;",
        "id",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "fallbackShape",
        "parseTextAppearance",
        "Landroidx/compose/ui/text/TextStyle;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "setTextColors",
        "",
        "defaultFontFamily",
        "Landroidx/compose/ui/text/font/FontFamily;",
        "parseColor",
        "Landroidx/compose/ui/graphics/Color;",
        "Landroid/content/res/TypedArray;",
        "index",
        "fallbackColor",
        "parseColor-mxwnekA",
        "(Landroid/content/res/TypedArray;IJ)J",
        "parseCornerSize",
        "Landroidx/compose/foundation/shape/CornerSize;",
        "parseFontFamily",
        "Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;",
        "parseTextUnit",
        "Landroidx/compose/ui/unit/TextUnit;",
        "fallbackTextUnit",
        "parseTextUnit-lGoEivg",
        "(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;J)J",
        "parseXmlFontFamily",
        "Landroid/content/res/Resources;",
        "themeadapter-core_release"
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
.field private static final tempTypedValue:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/util/TypedValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 432
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->tempTypedValue:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private static final fontWeightOf(I)Landroidx/compose/ui/text/font/FontWeight;
    .locals 2

    const/16 v0, 0x96

    if-ltz p0, :cond_0

    if-ge p0, v0, :cond_0

    .line 273
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW100()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v1, 0xfa

    if-gt v0, p0, :cond_1

    if-ge p0, v1, :cond_1

    .line 274
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW200()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v0, 0x15e

    if-gt v1, p0, :cond_2

    if-ge p0, v0, :cond_2

    .line 275
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW300()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_2
    const/16 v1, 0x1c2

    if-gt v0, p0, :cond_3

    if-ge p0, v1, :cond_3

    .line 276
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW400()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_3
    const/16 v0, 0x226

    if-gt v1, p0, :cond_4

    if-ge p0, v0, :cond_4

    .line 277
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW500()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_4
    const/16 v1, 0x28a

    if-gt v0, p0, :cond_5

    if-ge p0, v1, :cond_5

    .line 278
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW600()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_5
    const/16 v0, 0x2ee

    if-gt v1, p0, :cond_6

    if-ge p0, v0, :cond_6

    .line 279
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW700()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_6
    const/16 v1, 0x352

    if-gt v0, p0, :cond_7

    if-ge p0, v1, :cond_7

    .line 280
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW800()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    :cond_7
    if-gt v1, p0, :cond_8

    const/16 v0, 0x3e8

    if-ge p0, v0, :cond_8

    .line 281
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW900()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0

    .line 283
    :cond_8
    sget-object p0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW400()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object p0

    return-object p0
.end method

.method private static final getComplexUnitCompat(Landroid/util/TypedValue;)I
    .locals 0

    .line 428
    invoke-virtual {p0}, Landroid/util/TypedValue;->getComplexUnit()I

    move-result p0

    return p0
.end method

.method public static final parseColor-mxwnekA(Landroid/content/res/TypedArray;IJ)J
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    const-string v0, "$this$parseColor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Landroidx/core/content/res/TypedArrayKt;->getColorOrThrow(Landroid/content/res/TypedArray;I)I

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide p0

    return-wide p0

    :cond_0
    return-wide p2
.end method

.method public static synthetic parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 70
    sget-object p2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide p2

    .line 68
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA(Landroid/content/res/TypedArray;IJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final parseCornerSize(Landroid/content/res/TypedArray;I)Landroidx/compose/foundation/shape/CornerSize;
    .locals 4
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    sget-object v0, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->tempTypedValue:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Landroid/util/TypedValue;

    .line 405
    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    .line 406
    iget v0, v1, Landroid/util/TypedValue;->type:I

    const/4 v3, 0x5

    if-eq v0, v3, :cond_2

    const/4 p0, 0x6

    if-eq v0, p0, :cond_1

    return-object v2

    :cond_1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 416
    invoke-virtual {v1, p0, p0}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p0

    invoke-static {p0}, Landroidx/compose/foundation/shape/CornerSizeKt;->CornerSize(F)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object p0

    return-object p0

    .line 450
    :cond_2
    invoke-virtual {v1}, Landroid/util/TypedValue;->getComplexUnit()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v0, 0x0

    .line 413
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p0

    invoke-static {p0}, Landroidx/compose/foundation/shape/CornerSizeKt;->CornerSize(I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object p0

    return-object p0

    .line 410
    :cond_3
    iget p0, v1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result p0

    .line 453
    invoke-static {p0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p0

    .line 410
    invoke-static {p0}, Landroidx/compose/foundation/shape/CornerSizeKt;->CornerSize-0680j_4(F)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object p0

    return-object p0

    .line 411
    :cond_4
    iget p0, v1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result p0

    invoke-static {p0}, Landroidx/compose/foundation/shape/CornerSizeKt;->CornerSize(F)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v2
.end method

.method public static final parseFontFamily(Landroid/content/res/TypedArray;I)Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;
    .locals 10
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    sget-object v0, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->tempTypedValue:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Landroid/util/TypedValue;

    .line 190
    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    iget p1, v1, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x3

    if-ne p1, v2, :cond_b

    .line 191
    iget-object p1, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 192
    const-string v2, "sans-serif"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_1

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSansSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    invoke-direct {p0, p1, v0, v3, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    .line 193
    :cond_1
    const-string v2, "sans-serif-thin"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSansSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getThin()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;)V

    return-object p0

    .line 194
    :cond_2
    const-string v2, "sans-serif-light"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSansSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getLight()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;)V

    return-object p0

    .line 195
    :cond_3
    const-string v2, "sans-serif-medium"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSansSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;)V

    return-object p0

    .line 196
    :cond_4
    const-string v2, "sans-serif-black"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSansSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBlack()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;)V

    return-object p0

    .line 197
    :cond_5
    const-string v2, "serif"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    invoke-direct {p0, p1, v0, v3, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    .line 198
    :cond_6
    const-string v2, "cursive"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getCursive()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    invoke-direct {p0, p1, v0, v3, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    .line 199
    :cond_7
    const-string v2, "monospace"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    sget-object p1, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getMonospace()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/text/font/FontFamily;

    invoke-direct {p0, p1, v0, v3, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    .line 204
    :cond_8
    iget p1, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz p1, :cond_b

    iget-object p1, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    const-string/jumbo v2, "string"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "res/"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    invoke-static {p1, v4, v5, v3, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 207
    iget-object p1, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, ".xml"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {p1, v2, v5, v3, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 208
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string p1, "getResources(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p0, p1}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseXmlFontFamily(Landroid/content/res/Resources;I)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object p0

    if-eqz p0, :cond_9

    new-instance p1, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    invoke-direct {p1, p0, v0, v3, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_9
    return-object v0

    .line 211
    :cond_a
    new-instance p0, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    iget v4, v1, Landroid/util/TypedValue;->resourceId:I

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object p1

    invoke-static {p1}, Landroidx/compose/ui/text/font/FontKt;->toFontFamily(Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object p1

    invoke-direct {p0, p1, v0, v3, v0}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_b
    return-object v0
.end method

.method public static final parseShapeAppearance(Landroid/content/Context;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/foundation/shape/CornerBasedShape;
    .locals 7
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackShape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    sget-object v0, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance:[I

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    const-string p1, "obtainStyledAttributes(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 345
    sget p1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance_cornerSize:I

    .line 344
    invoke-static {p0, p1}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseCornerSize(Landroid/content/res/TypedArray;I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object p1

    .line 348
    sget v0, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance_cornerSizeTopLeft:I

    .line 347
    invoke-static {p0, v0}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseCornerSize(Landroid/content/res/TypedArray;I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v0

    .line 351
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance_cornerSizeTopRight:I

    .line 350
    invoke-static {p0, v1}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseCornerSize(Landroid/content/res/TypedArray;I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v1

    .line 354
    sget v2, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance_cornerSizeBottomLeft:I

    .line 353
    invoke-static {p0, v2}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseCornerSize(Landroid/content/res/TypedArray;I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v2

    .line 357
    sget v3, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance_cornerSizeBottomRight:I

    .line 356
    invoke-static {p0, v3}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseCornerSize(Landroid/content/res/TypedArray;I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v3

    .line 359
    sget-object v4, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne p2, v4, :cond_0

    move p2, v5

    goto :goto_0

    :cond_0
    move p2, v6

    :goto_0
    if-eqz p2, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, v0

    :goto_1
    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz p2, :cond_3

    move-object v1, v3

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    if-eqz p2, :cond_4

    goto :goto_4

    :cond_4
    move-object v2, v3

    .line 369
    :goto_4
    sget p2, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance_cornerFamily:I

    invoke-virtual {p0, p2, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    if-eqz p2, :cond_e

    if-ne p2, v5, :cond_d

    .line 379
    new-instance p2, Landroidx/compose/foundation/shape/CutCornerShape;

    if-nez v4, :cond_6

    if-nez p1, :cond_5

    .line 380
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getTopStart()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v4

    goto :goto_5

    :cond_5
    move-object v4, p1

    :cond_6
    :goto_5
    if-nez v0, :cond_8

    if-nez p1, :cond_7

    .line 381
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getTopEnd()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v0

    goto :goto_6

    :cond_7
    move-object v0, p1

    :cond_8
    :goto_6
    if-nez v2, :cond_a

    if-nez p1, :cond_9

    .line 382
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getBottomEnd()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v2

    goto :goto_7

    :cond_9
    move-object v2, p1

    :cond_a
    :goto_7
    if-nez v1, :cond_b

    if-nez p1, :cond_c

    .line 383
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getBottomStart()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object p1

    goto :goto_8

    :cond_b
    move-object p1, v1

    .line 379
    :cond_c
    :goto_8
    invoke-direct {p2, v4, v0, v2, p1}, Landroidx/compose/foundation/shape/CutCornerShape;-><init>(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V

    check-cast p2, Landroidx/compose/foundation/shape/CornerBasedShape;

    goto :goto_d

    .line 386
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unknown cornerFamily set in ShapeAppearance"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 371
    :cond_e
    new-instance p2, Landroidx/compose/foundation/shape/RoundedCornerShape;

    if-nez v4, :cond_10

    if-nez p1, :cond_f

    .line 372
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getTopStart()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v4

    goto :goto_9

    :cond_f
    move-object v4, p1

    :cond_10
    :goto_9
    if-nez v0, :cond_12

    if-nez p1, :cond_11

    .line 373
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getTopEnd()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v0

    goto :goto_a

    :cond_11
    move-object v0, p1

    :cond_12
    :goto_a
    if-nez v2, :cond_14

    if-nez p1, :cond_13

    .line 374
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getBottomEnd()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v2

    goto :goto_b

    :cond_13
    move-object v2, p1

    :cond_14
    :goto_b
    if-nez v1, :cond_15

    if-nez p1, :cond_16

    .line 375
    invoke-virtual {p3}, Landroidx/compose/foundation/shape/CornerBasedShape;->getBottomStart()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object p1

    goto :goto_c

    :cond_15
    move-object p1, v1

    .line 371
    :cond_16
    :goto_c
    invoke-direct {p2, v4, v0, v2, p1}, Landroidx/compose/foundation/shape/RoundedCornerShape;-><init>(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V

    check-cast p2, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 447
    :goto_d
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object p2
.end method

.method public static final parseTextAppearance(Landroid/content/Context;ILandroidx/compose/ui/unit/Density;ZLandroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/TextStyle;
    .locals 45
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "density"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    sget-object v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance:[I

    move/from16 v3, p1

    invoke-virtual {v0, v3, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const-string v1, "obtainStyledAttributes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_textStyle:I

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    .line 97
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_textFontWeight:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    .line 98
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_typeface:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v11

    .line 105
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_fontFamily:I

    .line 104
    invoke-static {v0, v1}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseFontFamily(Landroid/content/res/TypedArray;I)Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    move-result-object v1

    if-nez v1, :cond_0

    .line 106
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_fontFamily:I

    invoke-static {v0, v1}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseFontFamily(Landroid/content/res/TypedArray;I)Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    move-result-object v1

    :cond_0
    move-object v12, v1

    if-eqz p3, :cond_1

    .line 111
    sget v4, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_textColor:I

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    move-object v3, v0

    invoke-static/range {v3 .. v8}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    move-object v3, v0

    .line 113
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v0

    :goto_0
    move-wide v14, v0

    .line 115
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_textSize:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, v3

    const-wide/16 v3, 0x0

    invoke-static/range {v0 .. v6}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseTextUnit-lGoEivg$default(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;JILjava/lang/Object;)J

    move-result-wide v16

    .line 118
    sget v7, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_lineHeight:I

    .line 120
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_lineHeight:I

    move-object/from16 v2, p2

    .line 119
    invoke-static/range {v0 .. v6}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseTextUnit-lGoEivg$default(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;JILjava/lang/Object;)J

    move-result-wide v3

    .line 117
    invoke-static {v0, v7, v2, v3, v4}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseTextUnit-lGoEivg(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;J)J

    move-result-wide v35

    const/4 v1, 0x1

    const/4 v8, 0x0

    if-nez p4, :cond_6

    if-eqz v12, :cond_2

    .line 126
    invoke-virtual {v12}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;->getFontFamily()Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v2

    :goto_1
    move-object/from16 v21, v2

    goto :goto_2

    :cond_2
    if-ne v11, v1, :cond_3

    .line 128
    sget-object v2, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSansSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_1

    :cond_3
    const/4 v2, 0x2

    if-ne v11, v2, :cond_4

    .line 129
    sget-object v2, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getSerif()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_1

    :cond_4
    const/4 v2, 0x3

    if-ne v11, v2, :cond_5

    .line 130
    sget-object v2, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getMonospace()Landroidx/compose/ui/text/font/GenericFontFamily;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/text/font/FontFamily;

    goto :goto_1

    :cond_5
    move-object/from16 v21, v8

    goto :goto_2

    :cond_6
    move-object/from16 v21, p4

    :goto_2
    and-int/lit8 v2, v9, 0x2

    if-eqz v2, :cond_7

    .line 134
    sget-object v2, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getItalic-_-LCdwA()I

    move-result v2

    goto :goto_3

    .line 135
    :cond_7
    sget-object v2, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getNormal-_-LCdwA()I

    move-result v2

    :goto_3
    move v11, v2

    const/16 v2, 0x96

    if-ltz v10, :cond_8

    if-ge v10, v2, :cond_8

    .line 138
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW100()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    :goto_4
    move-object/from16 v18, v1

    goto/16 :goto_5

    :cond_8
    const/16 v3, 0xfa

    if-gt v2, v10, :cond_9

    if-ge v10, v3, :cond_9

    .line 139
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW200()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_9
    const/16 v2, 0x15e

    if-gt v3, v10, :cond_a

    if-ge v10, v2, :cond_a

    .line 140
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW300()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_a
    const/16 v3, 0x1c2

    if-gt v2, v10, :cond_b

    if-ge v10, v3, :cond_b

    .line 141
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW400()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_b
    const/16 v2, 0x226

    if-gt v3, v10, :cond_c

    if-ge v10, v2, :cond_c

    .line 142
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW500()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_c
    const/16 v3, 0x28a

    if-gt v2, v10, :cond_d

    if-ge v10, v3, :cond_d

    .line 143
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW600()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_d
    const/16 v2, 0x2ee

    if-gt v3, v10, :cond_e

    if-ge v10, v2, :cond_e

    .line 144
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW700()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_e
    const/16 v3, 0x352

    if-gt v2, v10, :cond_f

    if-ge v10, v3, :cond_f

    .line 145
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW800()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_f
    if-gt v3, v10, :cond_10

    const/16 v2, 0x3e8

    if-ge v10, v2, :cond_10

    .line 146
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getW900()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_10
    and-int/2addr v1, v9

    if-eqz v1, :cond_11

    .line 148
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_11
    if-eqz v12, :cond_12

    .line 150
    invoke-virtual {v12}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;->getWeight()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v1

    goto :goto_4

    :cond_12
    move-object/from16 v18, v8

    .line 153
    :goto_5
    sget v1, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_fontFeatureSettings:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 155
    sget v3, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_shadowColor:I

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v0

    move-object v3, v2

    .line 156
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_13

    .line 157
    sget v2, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_shadowDx:I

    invoke-virtual {v3, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    .line 158
    sget v5, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_shadowDy:I

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    .line 159
    sget v6, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_shadowRadius:I

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v28

    .line 160
    new-instance v23, Landroidx/compose/ui/graphics/Shadow;

    invoke-static {v2, v5}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v26

    const/16 v29, 0x0

    move-wide/from16 v24, v0

    invoke-direct/range {v23 .. v29}, Landroidx/compose/ui/graphics/Shadow;-><init>(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v31, v23

    goto :goto_6

    :cond_13
    move-object/from16 v31, v8

    .line 164
    :goto_6
    sget v0, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_letterSpacing:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 165
    sget v0, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance_android_letterSpacing:I

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getEm(F)J

    move-result-wide v0

    goto :goto_7

    :cond_14
    const/4 v0, 0x0

    .line 170
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getEm(I)J

    move-result-wide v0

    :goto_7
    move-wide/from16 v23, v0

    .line 108
    new-instance v13, Landroidx/compose/ui/text/TextStyle;

    .line 133
    invoke-static {v11}, Landroidx/compose/ui/text/font/FontStyle;->box-impl(I)Landroidx/compose/ui/text/font/FontStyle;

    move-result-object v19

    const v43, 0xfddf10

    const/16 v44, 0x0

    const/16 v20, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    .line 108
    invoke-direct/range {v13 .. v44}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 435
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    return-object v13
.end method

.method public static final parseTextUnit-lGoEivg(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;J)J
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    const-string v0, "$this$parseTextUnit"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    sget-object v0, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->tempTypedValue:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Landroid/util/TypedValue;

    .line 307
    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, v1, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x5

    if-ne v0, v2, :cond_3

    .line 443
    invoke-virtual {v1}, Landroid/util/TypedValue;->getComplexUnit()I

    move-result p3

    const/4 p4, 0x1

    if-eq p3, p4, :cond_2

    const/4 p4, 0x2

    if-eq p3, p4, :cond_1

    const/4 p3, 0x0

    .line 315
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    invoke-interface {p2, p0}, Landroidx/compose/ui/unit/Density;->toSp-kPz2Gy4(F)J

    move-result-wide p0

    return-wide p0

    .line 310
    :cond_1
    iget p0, v1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide p0

    return-wide p0

    .line 312
    :cond_2
    iget p0, v1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result p0

    invoke-static {p0}, Landroidx/compose/ui/unit/TextUnitKt;->getEm(F)J

    move-result-wide p0

    return-wide p0

    :cond_3
    return-wide p3
.end method

.method public static synthetic parseTextUnit-lGoEivg$default(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;JILjava/lang/Object;)J
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 304
    sget-object p3, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {p3}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide p3

    .line 301
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseTextUnit-lGoEivg(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final parseXmlFontFamily(Landroid/content/res/Resources;I)Landroidx/compose/ui/text/font/FontFamily;
    .locals 10
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    const-string v0, "getXml(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    :try_start_0
    move-object v0, p1

    check-cast v0, Lorg/xmlpull/v1/XmlPullParser;

    invoke-static {v0, p0}, Landroidx/core/content/res/FontResourcesParserCompat;->parse(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;)Landroidx/core/content/res/FontResourcesParserCompat$FamilyResourceEntry;

    move-result-object p0

    .line 256
    instance-of v0, p0, Landroidx/core/content/res/FontResourcesParserCompat$FontFamilyFilesResourceEntry;

    if-eqz v0, :cond_2

    .line 257
    check-cast p0, Landroidx/core/content/res/FontResourcesParserCompat$FontFamilyFilesResourceEntry;

    invoke-virtual {p0}, Landroidx/core/content/res/FontResourcesParserCompat$FontFamilyFilesResourceEntry;->getEntries()[Landroidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;

    move-result-object p0

    const-string v0, "getEntries(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, [Ljava/lang/Object;

    .line 438
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 439
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    .line 440
    check-cast v3, Landroidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;

    .line 259
    invoke-virtual {v3}, Landroidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;->getResourceId()I

    move-result v4

    .line 260
    invoke-virtual {v3}, Landroidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;->getWeight()I

    move-result v5

    invoke-static {v5}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->fontWeightOf(I)Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v5

    .line 261
    invoke-virtual {v3}, Landroidx/core/content/res/FontResourcesParserCompat$FontFileResourceEntry;->isItalic()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getItalic-_-LCdwA()I

    move-result v3

    goto :goto_1

    :cond_0
    sget-object v3, Landroidx/compose/ui/text/font/FontStyle;->Companion:Landroidx/compose/ui/text/font/FontStyle$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/font/FontStyle$Companion;->getNormal-_-LCdwA()I

    move-result v3

    :goto_1
    move v6, v3

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 258
    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v3

    .line 440
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 441
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 264
    invoke-static {v0}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily(Ljava/util/List;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 267
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    return-object p0

    :cond_2
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    throw p0
.end method

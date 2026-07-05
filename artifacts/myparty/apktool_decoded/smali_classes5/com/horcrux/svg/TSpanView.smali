.class Lcom/horcrux/svg/TSpanView;
.super Lcom/horcrux/svg/TextView;
.source "TSpanView.java"


# static fields
.field private static final FONTS:Ljava/lang/String; = "fonts/"

.field private static final OTF:Ljava/lang/String; = ".otf"

.field private static final TTF:Ljava/lang/String; = ".ttf"

.field static final additionalLigatures:Ljava/lang/String; = "\'hlig\', \'cala\', "

.field static final defaultFeatures:Ljava/lang/String; = "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', "

.field static final disableDiscretionaryLigatures:Ljava/lang/String; = "\'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

.field static final fontWeightTag:Ljava/lang/String; = "\'wght\' "

.field private static final radToDeg:D = 57.29577951308232

.field static final requiredFontFeatures:Ljava/lang/String; = "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',"

.field private static final tau:D = 6.283185307179586


# instance fields
.field private final assets:Landroid/content/res/AssetManager;

.field private final emoji:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final emojiTransforms:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field private mCachedPath:Landroid/graphics/Path;

.field mContent:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private textPath:Lcom/horcrux/svg/TextPathView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/horcrux/svg/TextView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 59
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->emoji:Ljava/util/ArrayList;

    .line 60
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->emojiTransforms:Ljava/util/ArrayList;

    .line 65
    iget-object p1, p0, Lcom/horcrux/svg/TSpanView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->assets:Landroid/content/res/AssetManager;

    return-void
.end method

.method private applySpacingAndFeatures(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V
    .locals 6

    .line 295
    iget-wide v0, p2, Lcom/horcrux/svg/FontData;->letterSpacing:D

    .line 296
    iget-wide v2, p2, Lcom/horcrux/svg/FontData;->fontSize:D

    iget v4, p0, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v4, v4

    mul-double/2addr v2, v4

    div-double v2, v0, v2

    double-to-float v2, v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    .line 298
    iget-object v0, p2, Lcom/horcrux/svg/FontData;->fontVariantLigatures:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    sget-object v1, Lcom/horcrux/svg/TextProperties$FontVariantLigatures;->normal:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    if-ne v0, v1, :cond_0

    .line 302
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p2, Lcom/horcrux/svg/FontData;->fontFeatureSettings:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    goto :goto_0

    .line 305
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p2, Lcom/horcrux/svg/FontData;->fontFeatureSettings:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 309
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 310
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'wght\' "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p2, Lcom/horcrux/svg/FontData;->absoluteFontWeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object p2, p2, Lcom/horcrux/svg/FontData;->fontVariationSettings:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFontVariationSettings(Ljava/lang/String;)Z

    :cond_1
    return-void
.end method

.method private applyTextPropertiesToPaint(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V
    .locals 10

    .line 1128
    iget-object v0, p2, Lcom/horcrux/svg/FontData;->fontWeight:Lcom/horcrux/svg/TextProperties$FontWeight;

    sget-object v1, Lcom/horcrux/svg/TextProperties$FontWeight;->Bold:Lcom/horcrux/svg/TextProperties$FontWeight;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p2, Lcom/horcrux/svg/FontData;->absoluteFontWeight:I

    const/16 v1, 0x226

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v3

    .line 1129
    :goto_1
    iget-object v1, p2, Lcom/horcrux/svg/FontData;->fontStyle:Lcom/horcrux/svg/TextProperties$FontStyle;

    sget-object v4, Lcom/horcrux/svg/TextProperties$FontStyle;->italic:Lcom/horcrux/svg/TextProperties$FontStyle;

    if-ne v1, v4, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    const/4 v2, 0x3

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    if-eqz v1, :cond_5

    const/4 v2, 0x2

    .line 1143
    :cond_5
    :goto_3
    iget v0, p2, Lcom/horcrux/svg/FontData;->absoluteFontWeight:I

    .line 1144
    iget-object v4, p2, Lcom/horcrux/svg/FontData;->fontFamily:Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    .line 1145
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_7

    .line 1146
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "fonts/"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, ".otf"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1147
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ".ttf"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1148
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1a

    if-lt v8, v9, :cond_6

    .line 1149
    new-instance v5, Landroid/graphics/Typeface$Builder;

    iget-object v8, p0, Lcom/horcrux/svg/TSpanView;->assets:Landroid/content/res/AssetManager;

    invoke-direct {v5, v8, v6}, Landroid/graphics/Typeface$Builder;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 1150
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "\'wght\' "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v9, p2, Lcom/horcrux/svg/FontData;->fontVariationSettings:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/graphics/Typeface$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 1151
    invoke-virtual {v5, v0}, Landroid/graphics/Typeface$Builder;->setWeight(I)Landroid/graphics/Typeface$Builder;

    .line 1152
    invoke-virtual {v5, v1}, Landroid/graphics/Typeface$Builder;->setItalic(Z)Landroid/graphics/Typeface$Builder;

    .line 1153
    invoke-virtual {v5}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;

    move-result-object v5

    if-nez v5, :cond_7

    .line 1155
    new-instance v5, Landroid/graphics/Typeface$Builder;

    iget-object v6, p0, Lcom/horcrux/svg/TSpanView;->assets:Landroid/content/res/AssetManager;

    invoke-direct {v5, v6, v7}, Landroid/graphics/Typeface$Builder;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 1156
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p2, Lcom/horcrux/svg/FontData;->fontVariationSettings:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/graphics/Typeface$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 1157
    invoke-virtual {v5, v0}, Landroid/graphics/Typeface$Builder;->setWeight(I)Landroid/graphics/Typeface$Builder;

    .line 1158
    invoke-virtual {v5, v1}, Landroid/graphics/Typeface$Builder;->setItalic(Z)Landroid/graphics/Typeface$Builder;

    .line 1159
    invoke-virtual {v5}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;

    move-result-object v5

    goto :goto_4

    .line 1163
    :cond_6
    :try_start_0
    iget-object v8, p0, Lcom/horcrux/svg/TSpanView;->assets:Landroid/content/res/AssetManager;

    invoke-static {v8, v6}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    .line 1164
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 1167
    :catch_0
    :try_start_1
    iget-object v6, p0, Lcom/horcrux/svg/TSpanView;->assets:Landroid/content/res/AssetManager;

    invoke-static {v6, v7}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    .line 1168
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_7
    :goto_4
    if-nez v5, :cond_8

    .line 1177
    :try_start_2
    invoke-static {}, Lcom/facebook/react/views/text/ReactFontManager;->getInstance()Lcom/facebook/react/views/text/ReactFontManager;

    move-result-object v6

    iget-object v7, p0, Lcom/horcrux/svg/TSpanView;->assets:Landroid/content/res/AssetManager;

    invoke-virtual {v6, v4, v2, v7}, Lcom/facebook/react/views/text/ReactFontManager;->getTypeface(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1182
    :catch_2
    :cond_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v2, v4, :cond_9

    .line 1183
    invoke-static {v5, v0, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object v5

    .line 1186
    :cond_9
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 1187
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 1188
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 1189
    iget-wide v0, p2, Lcom/horcrux/svg/FontData;->fontSize:D

    iget p2, p0, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v2, p2

    mul-double/2addr v0, v2

    double-to-float p2, v0

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 p2, 0x0

    .line 1191
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    return-void
.end method

.method private drawWrappedText(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 13

    .line 118
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->getTextRootGlyphContext()Lcom/horcrux/svg/GlyphContext;

    move-result-object v0

    .line 119
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->pushGlyphContext()V

    .line 120
    invoke-virtual {v0}, Lcom/horcrux/svg/GlyphContext;->getFont()Lcom/horcrux/svg/FontData;

    move-result-object v1

    .line 121
    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3, p2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 122
    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/TSpanView;->applyTextPropertiesToPaint(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V

    .line 123
    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/TSpanView;->applySpacingAndFeatures(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V

    .line 124
    invoke-virtual {v0}, Lcom/horcrux/svg/GlyphContext;->getFontSize()D

    move-result-wide v11

    .line 127
    sget-object p2, Lcom/horcrux/svg/TSpanView$1;->$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor:[I

    iget-object v1, v1, Lcom/horcrux/svg/FontData;->textAnchor:Lcom/horcrux/svg/TextProperties$TextAnchor;

    invoke-virtual {v1}, Lcom/horcrux/svg/TextProperties$TextAnchor;->ordinal()I

    move-result v1

    aget p2, p2, v1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    .line 130
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 138
    :cond_0
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 134
    :cond_1
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 143
    :goto_0
    new-instance v1, Landroid/text/SpannableString;

    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 144
    iget-object v4, p0, Lcom/horcrux/svg/TSpanView;->mInlineSize:Lcom/horcrux/svg/SVGLength;

    .line 145
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    int-to-double v5, v2

    iget v2, p0, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v9, v2

    const-wide/16 v7, 0x0

    invoke-static/range {v4 .. v12}, Lcom/horcrux/svg/PropHelper;->fromRelative(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide v4

    double-to-int v7, v4

    const/4 v5, 0x1

    move-object v2, p0

    move-object v4, p2

    move-object v6, v1

    .line 146
    invoke-direct/range {v2 .. v7}, Lcom/horcrux/svg/TSpanView;->getStaticLayout(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;

    move-result-object p2

    const/4 v1, 0x0

    .line 148
    invoke-virtual {p2, v1}, Landroid/text/StaticLayout;->getLineAscent(I)I

    move-result v1

    const-wide/16 v2, 0x0

    .line 150
    invoke-virtual {v0, v2, v3}, Lcom/horcrux/svg/GlyphContext;->nextX(D)D

    move-result-wide v2

    double-to-float v2, v2

    .line 151
    invoke-virtual {v0}, Lcom/horcrux/svg/GlyphContext;->nextY()D

    move-result-wide v3

    int-to-double v0, v1

    add-double/2addr v3, v0

    double-to-float v0, v3

    .line 152
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->popGlyphContext()V

    .line 154
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 155
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 156
    invoke-virtual {p2, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 157
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private getAbsoluteStartOffset(Lcom/horcrux/svg/SVGLength;DD)D
    .locals 10

    .line 1110
    iget v0, p0, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v6, v0

    const-wide/16 v4, 0x0

    move-object v1, p1

    move-wide v2, p2

    move-wide v8, p4

    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/PropHelper;->fromRelative(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide p1

    return-wide p1
.end method

.method private getLinePath(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;
    .locals 68

    move-object/from16 v0, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    .line 318
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v8

    .line 319
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 321
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->emoji:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 322
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->emojiTransforms:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v8, :cond_0

    :goto_0
    move-object v7, v0

    :goto_1
    move-object v1, v9

    goto/16 :goto_21

    .line 331
    :cond_0
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->textPath:Lcom/horcrux/svg/TextPathView;

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    const/4 v12, 0x1

    goto :goto_2

    :cond_1
    move v12, v10

    :goto_2
    const-wide/16 v13, 0x0

    if-eqz v12, :cond_3

    .line 333
    new-instance v1, Landroid/graphics/PathMeasure;

    iget-object v2, v0, Lcom/horcrux/svg/TSpanView;->textPath:Lcom/horcrux/svg/TextPathView;

    invoke-virtual {v2, v7, v6}, Lcom/horcrux/svg/TextPathView;->getTextPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object v2

    invoke-direct {v1, v2, v10}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 334
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v2

    float-to-double v2, v2

    .line 335
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->isClosed()Z

    move-result v4

    cmpl-double v5, v2, v13

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    move/from16 v16, v4

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    move/from16 v16, v10

    move-wide v2, v13

    :goto_3
    move-object v15, v1

    .line 341
    invoke-virtual {v0}, Lcom/horcrux/svg/TSpanView;->getTextRootGlyphContext()Lcom/horcrux/svg/GlyphContext;

    move-result-object v1

    .line 342
    invoke-virtual {v1}, Lcom/horcrux/svg/GlyphContext;->getFont()Lcom/horcrux/svg/FontData;

    move-result-object v4

    .line 343
    invoke-direct {v0, v6, v4}, Lcom/horcrux/svg/TSpanView;->applyTextPropertiesToPaint(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V

    .line 344
    new-instance v5, Lcom/horcrux/svg/GlyphPathBag;

    invoke-direct {v5, v6}, Lcom/horcrux/svg/GlyphPathBag;-><init>(Landroid/graphics/Paint;)V

    move-wide/from16 v17, v13

    .line 345
    new-array v13, v8, [Z

    .line 346
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v14

    .line 367
    iget-wide v10, v4, Lcom/horcrux/svg/FontData;->kerning:D

    move-wide/from16 v20, v10

    .line 368
    iget-wide v10, v4, Lcom/horcrux/svg/FontData;->wordSpacing:D

    move-wide/from16 v22, v10

    .line 369
    iget-wide v10, v4, Lcom/horcrux/svg/FontData;->letterSpacing:D

    move-wide/from16 v24, v10

    .line 370
    iget-boolean v10, v4, Lcom/horcrux/svg/FontData;->manualKerning:Z

    cmpl-double v11, v24, v17

    if-nez v11, :cond_4

    .line 420
    iget-object v11, v4, Lcom/horcrux/svg/FontData;->fontVariantLigatures:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    move-object/from16 v26, v1

    sget-object v1, Lcom/horcrux/svg/TextProperties$FontVariantLigatures;->normal:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    if-ne v11, v1, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    move-object/from16 v26, v1

    :cond_5
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_6

    .line 482
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v11, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, v4, Lcom/horcrux/svg/FontData;->fontFeatureSettings:Ljava/lang/String;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    goto :goto_5

    .line 485
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v11, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, v4, Lcom/horcrux/svg/FontData;->fontFeatureSettings:Ljava/lang/String;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 489
    :goto_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1a

    if-lt v1, v11, :cond_7

    .line 490
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v11, "\'wght\' "

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v11, v4, Lcom/horcrux/svg/FontData;->absoluteFontWeight:I

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v11, v4, Lcom/horcrux/svg/FontData;->fontVariationSettings:Ljava/lang/String;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontVariationSettings(Ljava/lang/String;)Z

    .line 495
    :cond_7
    iget-object v11, v4, Lcom/horcrux/svg/FontData;->fontData:Lcom/facebook/react/bridge/ReadableMap;

    .line 497
    new-array v1, v8, [F

    move-wide/from16 v27, v2

    move-object/from16 v2, p1

    .line 498
    invoke-virtual {v6, v2, v1}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 527
    iget-object v2, v4, Lcom/horcrux/svg/FontData;->textAnchor:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 528
    invoke-virtual {v0}, Lcom/horcrux/svg/TSpanView;->getTextAnchorRoot()Lcom/horcrux/svg/TextView;

    move-result-object v3

    .line 529
    invoke-virtual {v3, v6}, Lcom/horcrux/svg/TextView;->getSubtreeTextChunksTotalAdvance(Landroid/graphics/Paint;)D

    move-result-wide v3

    .line 530
    invoke-direct {v0, v2, v3, v4}, Lcom/horcrux/svg/TSpanView;->getTextAnchorOffset(Lcom/horcrux/svg/TextProperties$TextAnchor;D)D

    move-result-wide v29

    .line 535
    invoke-virtual/range {v26 .. v26}, Lcom/horcrux/svg/GlyphContext;->getFontSize()D

    move-result-wide v36

    const/16 v40, -0x1

    const-wide/high16 v41, 0x4000000000000000L    # 2.0

    if-eqz v12, :cond_c

    move-object/from16 v31, v1

    .line 538
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->textPath:Lcom/horcrux/svg/TextPathView;

    invoke-virtual {v1}, Lcom/horcrux/svg/TextPathView;->getMidLine()Lcom/horcrux/svg/TextProperties$TextPathMidLine;

    move-result-object v1

    move-object/from16 v32, v2

    sget-object v2, Lcom/horcrux/svg/TextProperties$TextPathMidLine;->sharp:Lcom/horcrux/svg/TextProperties$TextPathMidLine;

    if-ne v1, v2, :cond_8

    const/16 v33, 0x1

    goto :goto_6

    :cond_8
    const/16 v33, 0x0

    .line 559
    :goto_6
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->textPath:Lcom/horcrux/svg/TextPathView;

    invoke-virtual {v1}, Lcom/horcrux/svg/TextPathView;->getSide()Lcom/horcrux/svg/TextProperties$TextPathSide;

    move-result-object v1

    sget-object v2, Lcom/horcrux/svg/TextProperties$TextPathSide;->right:Lcom/horcrux/svg/TextProperties$TextPathSide;

    if-ne v1, v2, :cond_9

    move/from16 v34, v40

    goto :goto_7

    :cond_9
    const/16 v34, 0x1

    .line 598
    :goto_7
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->textPath:Lcom/horcrux/svg/TextPathView;

    .line 599
    invoke-virtual {v1}, Lcom/horcrux/svg/TextPathView;->getStartOffset()Lcom/horcrux/svg/SVGLength;

    move-result-object v1

    move-wide/from16 v44, v3

    move/from16 v43, v10

    move-object/from16 v10, v26

    move-wide/from16 v2, v27

    move-object/from16 v27, v31

    move/from16 v26, v12

    move-object/from16 v28, v13

    move-object/from16 v13, v32

    move-object v12, v5

    move-wide/from16 v4, v36

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/TSpanView;->getAbsoluteStartOffset(Lcom/horcrux/svg/SVGLength;DD)D

    move-result-wide v31

    move-wide/from16 v66, v2

    move-object v2, v0

    move-wide/from16 v0, v66

    add-double v29, v29, v31

    move-wide/from16 v38, v4

    if-eqz v16, :cond_b

    div-double v3, v0, v41

    .line 604
    sget-object v5, Lcom/horcrux/svg/TextProperties$TextAnchor;->middle:Lcom/horcrux/svg/TextProperties$TextAnchor;

    if-ne v13, v5, :cond_a

    neg-double v3, v3

    goto :goto_8

    :cond_a
    move-wide/from16 v3, v17

    :goto_8
    add-double v31, v31, v3

    add-double v3, v31, v0

    move-wide/from16 v46, v29

    move-wide/from16 v48, v31

    move/from16 v13, v33

    move-wide/from16 v29, v3

    move/from16 v3, v34

    goto :goto_a

    :cond_b
    move-wide/from16 v48, v17

    move-wide/from16 v46, v29

    move/from16 v13, v33

    move/from16 v3, v34

    goto :goto_9

    :cond_c
    move-object v2, v0

    move-wide/from16 v44, v3

    move/from16 v43, v10

    move-object/from16 v10, v26

    move-wide/from16 v38, v36

    move/from16 v26, v12

    move-object v12, v5

    move-wide/from16 v66, v27

    move-object/from16 v27, v1

    move-object/from16 v28, v13

    move-wide/from16 v0, v66

    move-wide/from16 v48, v17

    move-wide/from16 v46, v29

    const/4 v3, 0x1

    const/4 v13, 0x0

    :goto_9
    move-wide/from16 v29, v0

    .line 692
    :goto_a
    iget-object v4, v2, Lcom/horcrux/svg/TSpanView;->mTextLength:Lcom/horcrux/svg/SVGLength;

    const-wide/high16 v50, 0x3ff0000000000000L    # 1.0

    if-eqz v4, :cond_f

    .line 693
    iget-object v4, v2, Lcom/horcrux/svg/TSpanView;->mTextLength:Lcom/horcrux/svg/SVGLength;

    .line 694
    invoke-virtual {v7}, Landroid/graphics/Canvas;->getWidth()I

    move-result v5

    move-object/from16 v31, v4

    int-to-double v4, v5

    move-wide/from16 v32, v4

    iget v4, v2, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v4, v4

    const-wide/16 v34, 0x0

    move-wide/from16 v36, v4

    invoke-static/range {v31 .. v39}, Lcom/horcrux/svg/PropHelper;->fromRelative(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide v4

    cmpg-double v16, v4, v17

    if-ltz v16, :cond_e

    .line 698
    sget-object v16, Lcom/horcrux/svg/TSpanView$1;->$SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust:[I

    move-wide/from16 v31, v4

    iget-object v4, v2, Lcom/horcrux/svg/TSpanView;->mLengthAdjust:Lcom/horcrux/svg/TextProperties$TextLengthAdjust;

    invoke-virtual {v4}, Lcom/horcrux/svg/TextProperties$TextLengthAdjust;->ordinal()I

    move-result v4

    aget v4, v16, v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_d

    sub-double v4, v31, v44

    move-wide/from16 v31, v4

    add-int/lit8 v4, v8, -0x1

    int-to-double v4, v4

    div-double v4, v31, v4

    add-double v4, v24, v4

    move-wide/from16 v24, v4

    goto :goto_b

    :cond_d
    div-double v50, v31, v44

    goto :goto_b

    .line 696
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Negative textLength value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_b
    int-to-double v4, v3

    move-wide/from16 v44, v4

    mul-double v4, v50, v44

    move/from16 v16, v13

    .line 735
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v13

    move-object/from16 v52, v14

    .line 736
    iget v14, v13, Landroid/graphics/Paint$FontMetrics;->descent:F

    move/from16 v53, v3

    move-wide/from16 v54, v4

    float-to-double v3, v14

    .line 737
    iget v5, v13, Landroid/graphics/Paint$FontMetrics;->leading:F

    move-wide/from16 v56, v0

    float-to-double v0, v5

    add-double/2addr v0, v3

    .line 738
    iget v5, v13, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v5, v5

    iget v14, v13, Landroid/graphics/Paint$FontMetrics;->leading:F

    add-float/2addr v5, v14

    move-wide/from16 v31, v0

    float-to-double v0, v5

    .line 739
    iget v5, v13, Landroid/graphics/Paint$FontMetrics;->top:F

    neg-float v5, v5

    float-to-double v13, v5

    add-double v33, v13, v31

    .line 742
    invoke-virtual {v2}, Lcom/horcrux/svg/TSpanView;->getBaselineShift()Ljava/lang/String;

    move-result-object v5

    .line 743
    invoke-virtual {v2}, Lcom/horcrux/svg/TSpanView;->getAlignmentBaseline()Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    move-result-object v35

    if-eqz v35, :cond_10

    .line 747
    sget-object v36, Lcom/horcrux/svg/TSpanView$1;->$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline:[I

    invoke-virtual/range {v35 .. v35}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->ordinal()I

    move-result v37

    aget v36, v36, v37

    packed-switch v36, :pswitch_data_0

    goto :goto_e

    :pswitch_0
    move-wide v0, v13

    goto :goto_d

    :pswitch_1
    div-double v0, v33, v41

    goto :goto_d

    :pswitch_2
    move-wide/from16 v0, v31

    goto :goto_d

    :pswitch_3
    const-wide v3, 0x3fe999999999999aL    # 0.8

    goto :goto_c

    :pswitch_4
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    :goto_c
    mul-double/2addr v0, v3

    goto :goto_d

    :pswitch_5
    sub-double/2addr v0, v3

    div-double v0, v0, v41

    :goto_d
    :pswitch_6
    const/4 v13, 0x0

    goto :goto_f

    .line 781
    :pswitch_7
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 783
    const-string v1, "x"

    const/4 v3, 0x1

    const/4 v13, 0x0

    invoke-virtual {v6, v1, v13, v3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 784
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-double v0, v0

    div-double v0, v0, v41

    goto :goto_f

    :pswitch_8
    const/4 v13, 0x0

    neg-double v0, v3

    goto :goto_f

    :cond_10
    :goto_e
    :pswitch_9
    const/4 v13, 0x0

    move-wide/from16 v0, v17

    :goto_f
    if-eqz v5, :cond_14

    .line 860
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_14

    .line 861
    sget-object v3, Lcom/horcrux/svg/TSpanView$1;->$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline:[I

    invoke-virtual/range {v35 .. v35}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0xe

    if-eq v3, v4, :cond_14

    const/16 v4, 0x10

    if-eq v3, v4, :cond_14

    .line 867
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_10

    :sswitch_0
    const-string v3, "super"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_10

    :cond_11
    const/16 v40, 0x2

    goto :goto_10

    :sswitch_1
    const-string v3, "sub"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_10

    :cond_12
    const/16 v40, 0x1

    goto :goto_10

    :sswitch_2
    const-string v3, "baseline"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto :goto_10

    :cond_13
    move/from16 v40, v13

    .line 902
    :goto_10
    const-string v3, "os2"

    const-string v4, "unitsPerEm"

    const-string v14, "tables"

    packed-switch v40, :pswitch_data_1

    iget v3, v2, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v3, v3

    mul-double v32, v3, v38

    iget v3, v2, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v3, v3

    move-wide/from16 v34, v3

    move-object/from16 v31, v5

    move-wide/from16 v36, v38

    .line 903
    invoke-static/range {v31 .. v37}, Lcom/horcrux/svg/PropHelper;->fromRelative(Ljava/lang/String;DDD)D

    move-result-wide v3

    sub-double/2addr v0, v3

    :cond_14
    :goto_11
    :pswitch_a
    move-wide/from16 v31, v0

    goto/16 :goto_12

    :pswitch_b
    if-eqz v11, :cond_14

    .line 885
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 886
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 887
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v5

    .line 888
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_14

    .line 889
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    .line 890
    const-string v5, "ySuperscriptYOffset"

    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_14

    .line 891
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v31

    .line 892
    iget v3, v2, Lcom/horcrux/svg/TSpanView;->mScale:F

    float-to-double v13, v3

    mul-double v13, v13, v38

    mul-double v13, v13, v31

    int-to-double v3, v4

    div-double/2addr v13, v3

    sub-double/2addr v0, v13

    goto :goto_11

    :pswitch_c
    if-eqz v11, :cond_14

    .line 870
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 871
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 872
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v5

    .line 873
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_15

    .line 874
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    .line 875
    const-string v5, "ySubscriptYOffset"

    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_15

    .line 876
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v13

    .line 877
    iget v3, v2, Lcom/horcrux/svg/TSpanView;->mScale:F

    move-wide/from16 v31, v0

    float-to-double v0, v3

    mul-double v0, v0, v38

    mul-double/2addr v0, v13

    int-to-double v3, v4

    div-double/2addr v0, v3

    add-double v0, v31, v0

    goto :goto_11

    :cond_15
    move-wide/from16 v31, v0

    move-wide/from16 v0, v31

    goto :goto_11

    .line 909
    :goto_12
    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 910
    new-instance v13, Landroid/graphics/Matrix;

    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    .line 911
    new-instance v14, Landroid/graphics/Matrix;

    invoke-direct {v14}, Landroid/graphics/Matrix;-><init>()V

    const/16 v0, 0x9

    .line 913
    new-array v1, v0, [F

    .line 914
    new-array v0, v0, [F

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v8, :cond_27

    .line 917
    aget-char v4, v52, v3

    .line 918
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    .line 919
    aget-boolean v33, v28, v3

    if-eqz v33, :cond_16

    .line 927
    const-string v5, ""

    const/16 v34, 0x0

    const/16 v36, 0x0

    goto :goto_15

    :cond_16
    move/from16 v19, v3

    const/16 v34, 0x0

    const/16 v36, 0x0

    :goto_14
    const/16 v35, 0x1

    add-int/lit8 v2, v19, 0x1

    if-ge v2, v8, :cond_18

    .line 931
    aget v35, v27, v2

    cmpl-float v35, v35, v36

    if-lez v35, :cond_17

    goto :goto_15

    :cond_17
    move/from16 v35, v2

    .line 935
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-char v5, v52, v35

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v19, 0x1

    .line 936
    aput-boolean v19, v28, v35

    move/from16 v19, v35

    const/16 v34, 0x1

    goto :goto_14

    .line 941
    :cond_18
    :goto_15
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    move/from16 v35, v3

    float-to-double v2, v2

    mul-double v2, v2, v50

    move-wide/from16 v37, v2

    if-nez v43, :cond_19

    .line 953
    aget v2, v27, v35

    float-to-double v2, v2

    mul-double v2, v2, v50

    sub-double v2, v2, v37

    move-wide/from16 v20, v2

    :cond_19
    const/16 v2, 0x20

    if-ne v4, v2, :cond_1a

    const/4 v2, 0x1

    goto :goto_16

    :cond_1a
    const/4 v2, 0x0

    :goto_16
    if-eqz v2, :cond_1b

    move-wide/from16 v39, v22

    goto :goto_17

    :cond_1b
    move-wide/from16 v39, v17

    :goto_17
    add-double v39, v39, v24

    add-double v39, v37, v39

    if-eqz v33, :cond_1c

    move/from16 v60, v2

    move-wide/from16 v2, v17

    goto :goto_18

    :cond_1c
    add-double v58, v20, v39

    move/from16 v60, v2

    move-wide/from16 v2, v58

    .line 962
    :goto_18
    invoke-virtual {v10, v2, v3}, Lcom/horcrux/svg/GlyphContext;->nextX(D)D

    move-result-wide v2

    move-wide/from16 v58, v2

    .line 963
    invoke-virtual {v10}, Lcom/horcrux/svg/GlyphContext;->nextY()D

    move-result-wide v2

    .line 964
    invoke-virtual {v10}, Lcom/horcrux/svg/GlyphContext;->nextDeltaX()D

    move-result-wide v61

    .line 965
    invoke-virtual {v10}, Lcom/horcrux/svg/GlyphContext;->nextDeltaY()D

    move-result-wide v63

    move-object/from16 v65, v5

    .line 966
    invoke-virtual {v10}, Lcom/horcrux/svg/GlyphContext;->nextRotation()D

    move-result-wide v5

    if-nez v33, :cond_26

    if-eqz v60, :cond_1d

    goto/16 :goto_1f

    :cond_1d
    mul-double v39, v39, v44

    mul-double v37, v37, v44

    add-double v58, v58, v61

    mul-double v58, v58, v44

    add-double v58, v46, v58

    move/from16 v33, v8

    move-object/from16 v60, v9

    sub-double v8, v58, v39

    if-eqz v26, :cond_23

    move/from16 v39, v4

    move-wide/from16 v58, v5

    add-double v4, v8, v37

    div-double v6, v37, v41

    move-wide/from16 v37, v2

    add-double v2, v8, v6

    cmpl-double v40, v2, v29

    if-lez v40, :cond_1e

    :goto_19
    move-object/from16 v7, p0

    move-object/from16 v3, p3

    move-object/from16 v62, v0

    move-object v8, v1

    move-object/from16 v40, v10

    move-object v2, v12

    move-object v10, v13

    move-object/from16 v1, v60

    const/4 v4, 0x1

    const/4 v9, 0x2

    move-object/from16 v0, p2

    goto/16 :goto_20

    :cond_1e
    cmpg-double v40, v2, v48

    if-gez v40, :cond_1f

    goto :goto_19

    :cond_1f
    move-object/from16 v40, v10

    const/4 v10, 0x3

    if-eqz v16, :cond_20

    double-to-float v2, v2

    .line 1019
    invoke-virtual {v15, v2, v13, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    move-object/from16 v62, v0

    move-object/from16 v61, v12

    move-object v10, v13

    move-wide/from16 v2, v56

    const/16 p1, 0x2

    move-object/from16 v57, v1

    goto :goto_1c

    :cond_20
    cmpg-double v61, v8, v17

    if-gez v61, :cond_21

    move-object/from16 v61, v12

    move/from16 v12, v36

    .line 1038
    invoke-virtual {v15, v12, v11, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    double-to-float v8, v8

    .line 1039
    invoke-virtual {v11, v8, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    const/4 v9, 0x1

    goto :goto_1a

    :cond_21
    move-object/from16 v61, v12

    double-to-float v8, v8

    const/4 v9, 0x1

    .line 1041
    invoke-virtual {v15, v8, v11, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    :goto_1a
    double-to-float v2, v2

    .line 1044
    invoke-virtual {v15, v2, v13, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    cmpl-double v2, v4, v56

    if-lez v2, :cond_22

    move-wide/from16 v2, v56

    double-to-float v8, v2

    .line 1047
    invoke-virtual {v15, v8, v14, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    sub-double/2addr v4, v2

    double-to-float v4, v4

    const/4 v12, 0x0

    .line 1048
    invoke-virtual {v14, v4, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto :goto_1b

    :cond_22
    move-wide/from16 v2, v56

    double-to-float v4, v4

    .line 1050
    invoke-virtual {v15, v4, v14, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1053
    :goto_1b
    invoke-virtual {v11, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 1054
    invoke-virtual {v14, v0}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v5, 0x2

    .line 1056
    aget v4, v1, v5

    float-to-double v8, v4

    const/4 v4, 0x5

    .line 1057
    aget v10, v1, v4

    move v12, v4

    move/from16 p1, v5

    float-to-double v4, v10

    .line 1058
    aget v10, v0, p1

    move/from16 v57, v12

    move-object/from16 v56, v13

    float-to-double v12, v10

    .line 1059
    aget v10, v0, v57

    move-object/from16 v62, v0

    move-object/from16 v57, v1

    float-to-double v0, v10

    sub-double/2addr v12, v8

    sub-double/2addr v0, v4

    .line 1065
    invoke-static {v0, v1, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    const-wide v4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr v0, v4

    mul-double v0, v0, v44

    double-to-float v0, v0

    move-object/from16 v10, v56

    .line 1067
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    :goto_1c
    neg-double v0, v6

    double-to-float v0, v0

    add-double v4, v63, v31

    double-to-float v1, v4

    .line 1074
    invoke-virtual {v10, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    move-wide/from16 v4, v54

    double-to-float v0, v4

    move/from16 v1, v53

    int-to-float v6, v1

    .line 1075
    invoke-virtual {v10, v0, v6}, Landroid/graphics/Matrix;->preScale(FF)Z

    move-wide/from16 v6, v37

    double-to-float v0, v6

    const/4 v12, 0x0

    .line 1076
    invoke-virtual {v10, v12, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1d

    :cond_23
    move-object/from16 v62, v0

    move/from16 v39, v4

    move-wide/from16 v58, v5

    move-object/from16 v40, v10

    move-object/from16 v61, v12

    move-object v10, v13

    move/from16 v12, v36

    move-wide/from16 v4, v54

    const/16 p1, 0x2

    move-wide v6, v2

    move-wide/from16 v2, v56

    move-object/from16 v57, v1

    move/from16 v1, v53

    double-to-float v0, v8

    add-double v6, v6, v63

    add-double v6, v6, v31

    double-to-float v6, v6

    .line 1078
    invoke-virtual {v10, v0, v6}, Landroid/graphics/Matrix;->setTranslate(FF)V

    :goto_1d
    move-wide/from16 v6, v58

    double-to-float v0, v6

    .line 1081
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    if-eqz v34, :cond_24

    .line 1085
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    move-wide v7, v2

    .line 1086
    invoke-virtual/range {v65 .. v65}, Ljava/lang/String;->length()I

    move-result v3

    move-wide/from16 v54, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-wide/from16 v66, v7

    move-object/from16 v8, v57

    move-wide/from16 v56, v66

    move-object/from16 v7, p0

    move/from16 v9, p1

    move-object/from16 v0, p2

    move/from16 v53, v1

    move-object/from16 v1, v65

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    move-object/from16 v2, v61

    goto :goto_1e

    :cond_24
    move-object/from16 v7, p0

    move/from16 v9, p1

    move-object/from16 v0, p2

    move/from16 v53, v1

    move-wide/from16 v54, v4

    move-object/from16 v8, v57

    move-object/from16 v1, v65

    move-wide/from16 v56, v2

    move/from16 v3, v39

    move-object/from16 v2, v61

    .line 1088
    invoke-virtual {v2, v3, v1}, Lcom/horcrux/svg/GlyphPathBag;->getOrCreateAndCache(CLjava/lang/String;)Landroid/graphics/Path;

    move-result-object v6

    .line 1090
    :goto_1e
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    const/4 v4, 0x1

    .line 1091
    invoke-virtual {v6, v3, v4}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 1092
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    cmpl-float v3, v3, v12

    if-nez v3, :cond_25

    .line 1094
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    move-object/from16 v3, p3

    .line 1095
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1096
    iget-object v5, v7, Lcom/horcrux/svg/TSpanView;->emoji:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1097
    iget-object v5, v7, Lcom/horcrux/svg/TSpanView;->emojiTransforms:Ljava/util/ArrayList;

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6, v10}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1098
    invoke-virtual {v3, v1, v12, v12, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1099
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    move-object/from16 v1, v60

    goto :goto_20

    :cond_25
    move-object/from16 v3, p3

    .line 1101
    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    move-object/from16 v1, v60

    .line 1102
    invoke-virtual {v1, v6}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    goto :goto_20

    :cond_26
    :goto_1f
    move-object/from16 v62, v0

    move-object v3, v7

    move/from16 v33, v8

    move-object/from16 v40, v10

    move-object v2, v12

    move-object v10, v13

    const/4 v4, 0x1

    move-object/from16 v7, p0

    move-object/from16 v0, p2

    move-object v8, v1

    move-object v1, v9

    const/4 v9, 0x2

    :goto_20
    add-int/lit8 v5, v35, 0x1

    move-object v6, v0

    move-object v9, v1

    move-object v12, v2

    move-object v2, v7

    move-object v1, v8

    move-object v13, v10

    move/from16 v8, v33

    move-object/from16 v10, v40

    move-object/from16 v0, v62

    move-object v7, v3

    move v3, v5

    goto/16 :goto_13

    :cond_27
    move-object v7, v2

    goto/16 :goto_1

    :goto_21
    return-object v1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_2
        0x1be40 -> :sswitch_1
        0x68b6f7b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method private getStaticLayout(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;
    .locals 2

    const/4 v0, 0x0

    .line 170
    invoke-virtual {p4}, Landroid/text/SpannableString;->length()I

    move-result v1

    invoke-static {p4, v0, v1, p1, p5}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 171
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const/4 p2, 0x0

    const/high16 p4, 0x3f800000    # 1.0f

    .line 172
    invoke-virtual {p1, p2, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 173
    invoke-virtual {p1, p3}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 174
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 175
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 176
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p1

    return-object p1
.end method

.method private getTextAnchorOffset(Lcom/horcrux/svg/TextProperties$TextAnchor;D)D
    .locals 2

    .line 1114
    sget-object v0, Lcom/horcrux/svg/TSpanView$1;->$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor:[I

    invoke-virtual {p1}, Lcom/horcrux/svg/TextProperties$TextAnchor;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    neg-double p1, p2

    return-wide p1

    :cond_1
    neg-double p1, p2

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p1, v0

    return-wide p1
.end method

.method private setupTextPath()V
    .locals 3

    .line 1196
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 1199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/horcrux/svg/TextPathView;

    if-ne v1, v2, :cond_0

    .line 1200
    check-cast v0, Lcom/horcrux/svg/TextPathView;

    iput-object v0, p0, Lcom/horcrux/svg/TSpanView;->textPath:Lcom/horcrux/svg/TextPathView;

    return-void

    .line 1202
    :cond_0
    instance-of v1, v0, Lcom/horcrux/svg/TextView;

    if-nez v1, :cond_1

    goto :goto_1

    .line 1206
    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static visualToLogical(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    if-eqz p0, :cond_6

    .line 188
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 192
    :cond_0
    new-instance v0, Ljava/text/Bidi;

    const/4 v1, -0x2

    invoke-direct {v0, p0, v1}, Ljava/text/Bidi;-><init>(Ljava/lang/String;I)V

    .line 194
    invoke-virtual {v0}, Ljava/text/Bidi;->isLeftToRight()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    .line 198
    :cond_1
    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    move-result v1

    .line 199
    new-array v2, v1, [B

    .line 200
    new-array v3, v1, [Ljava/lang/Integer;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_2

    .line 203
    invoke-virtual {v0, v5}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v6

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    .line 204
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 207
    :cond_2
    invoke-static {v2, v4, v3, v4, v1}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 209
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    if-ge v4, v1, :cond_5

    .line 212
    aget-object v6, v3, v4

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 213
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunStart(I)I

    move-result v7

    .line 214
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunLimit(I)I

    move-result v8

    .line 215
    aget-byte v6, v2, v6

    and-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_3

    :goto_2
    add-int/lit8 v8, v8, -0x1

    if-lt v8, v7, :cond_4

    .line 219
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 222
    :cond_3
    invoke-virtual {v5, p0, v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 226
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_6
    :goto_3
    return-object p0
.end method


# virtual methods
.method clearCache()V
    .locals 1

    const/4 v0, 0x0

    .line 80
    iput-object v0, p0, Lcom/horcrux/svg/TSpanView;->mCachedPath:Landroid/graphics/Path;

    .line 81
    invoke-super {p0}, Lcom/horcrux/svg/TextView;->clearCache()V

    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 4

    .line 86
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 87
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mInlineSize:Lcom/horcrux/svg/SVGLength;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mInlineSize:Lcom/horcrux/svg/SVGLength;

    iget-wide v0, v0, Lcom/horcrux/svg/SVGLength;->value:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_2

    .line 88
    iget v0, p0, Lcom/horcrux/svg/TSpanView;->fillOpacity:F

    mul-float/2addr v0, p3

    invoke-virtual {p0, p2, v0}, Lcom/horcrux/svg/TSpanView;->setupFillPaint(Landroid/graphics/Paint;F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/TSpanView;->drawWrappedText(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 91
    :cond_0
    iget v0, p0, Lcom/horcrux/svg/TSpanView;->strokeOpacity:F

    mul-float/2addr p3, v0

    invoke-virtual {p0, p2, p3}, Lcom/horcrux/svg/TSpanView;->setupStrokePaint(Landroid/graphics/Paint;F)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/TSpanView;->drawWrappedText(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    :cond_1
    return-void

    .line 95
    :cond_2
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->emoji:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 97
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->getTextRootGlyphContext()Lcom/horcrux/svg/GlyphContext;

    move-result-object v1

    .line 98
    invoke-virtual {v1}, Lcom/horcrux/svg/GlyphContext;->getFont()Lcom/horcrux/svg/FontData;

    move-result-object v1

    .line 99
    invoke-direct {p0, p2, v1}, Lcom/horcrux/svg/TSpanView;->applyTextPropertiesToPaint(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 101
    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->emoji:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 102
    iget-object v3, p0, Lcom/horcrux/svg/TSpanView;->emojiTransforms:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Matrix;

    .line 103
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 104
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    const/4 v3, 0x0

    .line 105
    invoke-virtual {p1, v2, v3, v3, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 106
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 109
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/TSpanView;->drawPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    return-void

    .line 112
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/TSpanView;->clip(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 113
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/TSpanView;->drawGroup(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mCachedPath:Landroid/graphics/Path;

    if-eqz v0, :cond_0

    return-object v0

    .line 235
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 236
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/TSpanView;->getGroupPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->mCachedPath:Landroid/graphics/Path;

    return-object p1

    .line 240
    :cond_1
    invoke-direct {p0}, Lcom/horcrux/svg/TSpanView;->setupTextPath()V

    .line 242
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->pushGlyphContext()V

    .line 243
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    invoke-static {v0}, Lcom/horcrux/svg/TSpanView;->visualToLogical(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2, p1}, Lcom/horcrux/svg/TSpanView;->getLinePath(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->mCachedPath:Landroid/graphics/Path;

    .line 244
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->popGlyphContext()V

    .line 246
    iget-object p1, p0, Lcom/horcrux/svg/TSpanView;->mCachedPath:Landroid/graphics/Path;

    return-object p1
.end method

.method getSubtreeTextChunksTotalAdvance(Landroid/graphics/Paint;)D
    .locals 5

    .line 250
    iget-wide v0, p0, Lcom/horcrux/svg/TSpanView;->cachedAdvance:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    iget-wide v0, p0, Lcom/horcrux/svg/TSpanView;->cachedAdvance:D

    return-wide v0

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 256
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->getChildCount()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 257
    invoke-virtual {p0, v0}, Lcom/horcrux/svg/TSpanView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 258
    instance-of v4, v3, Lcom/horcrux/svg/TextView;

    if-eqz v4, :cond_1

    .line 259
    check-cast v3, Lcom/horcrux/svg/TextView;

    .line 260
    invoke-virtual {v3, p1}, Lcom/horcrux/svg/TextView;->getSubtreeTextChunksTotalAdvance(Landroid/graphics/Paint;)D

    move-result-wide v3

    add-double/2addr v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 263
    :cond_2
    iput-wide v1, p0, Lcom/horcrux/svg/TSpanView;->cachedAdvance:D

    return-wide v1

    .line 268
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_4

    .line 271
    iput-wide v1, p0, Lcom/horcrux/svg/TSpanView;->cachedAdvance:D

    return-wide v1

    .line 275
    :cond_4
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->getTextRootGlyphContext()Lcom/horcrux/svg/GlyphContext;

    move-result-object v1

    .line 276
    invoke-virtual {v1}, Lcom/horcrux/svg/GlyphContext;->getFont()Lcom/horcrux/svg/FontData;

    move-result-object v1

    .line 277
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/TSpanView;->applyTextPropertiesToPaint(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V

    .line 279
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/TSpanView;->applySpacingAndFeatures(Landroid/graphics/Paint;Lcom/horcrux/svg/FontData;)V

    .line 281
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    float-to-double v0, p1

    iput-wide v0, p0, Lcom/horcrux/svg/TSpanView;->cachedAdvance:D

    .line 282
    iget-wide v0, p0, Lcom/horcrux/svg/TSpanView;->cachedAdvance:D

    return-wide v0
.end method

.method hitTest([F)I
    .locals 3

    .line 1212
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1213
    invoke-super {p0, p1}, Lcom/horcrux/svg/TextView;->hitTest([F)I

    move-result p1

    return p1

    .line 1215
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->mPath:Landroid/graphics/Path;

    const/4 v1, -0x1

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/horcrux/svg/TSpanView;->mInvertible:Z

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    .line 1219
    new-array v0, v0, [F

    .line 1220
    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->mInvMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 1221
    iget-object p1, p0, Lcom/horcrux/svg/TSpanView;->mInvTransform:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    const/4 p1, 0x0

    .line 1222
    aget p1, v0, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 v2, 0x1

    .line 1223
    aget v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 1225
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->initBounds()V

    .line 1227
    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->mRegion:Landroid/graphics/Region;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->mRegion:Landroid/graphics/Region;

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->mStrokeRegion:Landroid/graphics/Region;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->mStrokeRegion:Landroid/graphics/Region;

    .line 1228
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    .line 1232
    :cond_3
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->getClipPath()Landroid/graphics/Path;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 1234
    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->mClipRegion:Landroid/graphics/Region;

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    .line 1239
    :cond_4
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->getId()I

    move-result p1

    return p1

    :cond_5
    :goto_0
    return v1
.end method

.method public invalidate()V
    .locals 1

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lcom/horcrux/svg/TSpanView;->mCachedPath:Landroid/graphics/Path;

    .line 76
    invoke-super {p0}, Lcom/horcrux/svg/TextView;->invalidate()V

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 69
    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->mContent:Ljava/lang/String;

    .line 70
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->invalidate()V

    return-void
.end method

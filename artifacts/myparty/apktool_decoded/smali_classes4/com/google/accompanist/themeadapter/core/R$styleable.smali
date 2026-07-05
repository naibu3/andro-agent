.class public final Lcom/google/accompanist/themeadapter/core/R$styleable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/accompanist/themeadapter/core/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static ThemeAdapterShapeAppearance:[I = null

.field public static ThemeAdapterShapeAppearance_cornerFamily:I = 0x0

.field public static ThemeAdapterShapeAppearance_cornerSize:I = 0x1

.field public static ThemeAdapterShapeAppearance_cornerSizeBottomLeft:I = 0x2

.field public static ThemeAdapterShapeAppearance_cornerSizeBottomRight:I = 0x3

.field public static ThemeAdapterShapeAppearance_cornerSizeTopLeft:I = 0x4

.field public static ThemeAdapterShapeAppearance_cornerSizeTopRight:I = 0x5

.field public static ThemeAdapterTextAppearance:[I = null

.field public static ThemeAdapterTextAppearance_android_fontFamily:I = 0x8

.field public static ThemeAdapterTextAppearance_android_fontFeatureSettings:I = 0xa

.field public static ThemeAdapterTextAppearance_android_fontVariationSettings:I = 0xb

.field public static ThemeAdapterTextAppearance_android_letterSpacing:I = 0x9

.field public static ThemeAdapterTextAppearance_android_lineHeight:I = 0xc

.field public static ThemeAdapterTextAppearance_android_shadowColor:I = 0x4

.field public static ThemeAdapterTextAppearance_android_shadowDx:I = 0x5

.field public static ThemeAdapterTextAppearance_android_shadowDy:I = 0x6

.field public static ThemeAdapterTextAppearance_android_shadowRadius:I = 0x7

.field public static ThemeAdapterTextAppearance_android_textColor:I = 0x3

.field public static ThemeAdapterTextAppearance_android_textFontWeight:I = 0xd

.field public static ThemeAdapterTextAppearance_android_textSize:I = 0x0

.field public static ThemeAdapterTextAppearance_android_textStyle:I = 0x2

.field public static ThemeAdapterTextAppearance_android_typeface:I = 0x1

.field public static ThemeAdapterTextAppearance_fontFamily:I = 0xe

.field public static ThemeAdapterTextAppearance_lineHeight:I = 0xf


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterShapeAppearance:[I

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/accompanist/themeadapter/core/R$styleable;->ThemeAdapterTextAppearance:[I

    return-void

    :array_0
    .array-data 4
        0x7f04017d
        0x7f040184
        0x7f040185
        0x7f040186
        0x7f040187
        0x7f040188
    .end array-data

    :array_1
    .array-data 4
        0x1010095
        0x1010096
        0x1010097
        0x1010098
        0x1010161
        0x1010162
        0x1010163
        0x1010164
        0x10103ac
        0x10104b6
        0x10104b7
        0x1010570
        0x101057f
        0x1010585
        0x7f040267
        0x7f04033b
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

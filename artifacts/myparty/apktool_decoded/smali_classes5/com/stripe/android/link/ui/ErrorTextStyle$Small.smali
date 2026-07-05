.class public final Lcom/stripe/android/link/ui/ErrorTextStyle$Small;
.super Lcom/stripe/android/link/ui/ErrorTextStyle;
.source "ErrorText.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/ErrorTextStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Small"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nErrorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Small\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,110:1\n149#2:111\n149#2:112\n149#2:113\n149#2:114\n*S KotlinDebug\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Small\n*L\n34#1:111\n36#1:112\n37#1:113\n39#1:114\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/ErrorTextStyle$Small;",
        "Lcom/stripe/android/link/ui/ErrorTextStyle;",
        "<init>",
        "()V",
        "shape",
        "Landroidx/compose/foundation/shape/RoundedCornerShape;",
        "getShape",
        "()Landroidx/compose/foundation/shape/RoundedCornerShape;",
        "iconModifier",
        "Landroidx/compose/ui/Modifier;",
        "getIconModifier",
        "()Landroidx/compose/ui/Modifier;",
        "textModifier",
        "getTextModifier",
        "textStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "getTextStyle",
        "()Landroidx/compose/ui/text/TextStyle;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/link/ui/ErrorTextStyle$Small;

.field private static final iconModifier:Landroidx/compose/ui/Modifier;

.field private static final shape:Landroidx/compose/foundation/shape/RoundedCornerShape;

.field private static final textModifier:Landroidx/compose/ui/Modifier;

.field private static final textStyle:Landroidx/compose/ui/text/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 35

    new-instance v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->INSTANCE:Lcom/stripe/android/link/ui/ErrorTextStyle$Small;

    const/4 v0, 0x4

    int-to-float v0, v0

    .line 111
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 34
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->shape:Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 35
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 112
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 35
    move-object v2, v1

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    .line 36
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0xc

    int-to-float v3, v2

    .line 113
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 37
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->iconModifier:Landroidx/compose/ui/Modifier;

    .line 38
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 114
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v4, 0x0

    .line 39
    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textModifier:Landroidx/compose/ui/Modifier;

    .line 41
    sget-object v0, Landroidx/compose/ui/text/font/FontFamily;->Companion:Landroidx/compose/ui/text/font/FontFamily$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontFamily$Companion;->getDefault()Landroidx/compose/ui/text/font/SystemFontFamily;

    move-result-object v0

    .line 42
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getSemiBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v8

    .line 43
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v6

    const/16 v1, 0x10

    .line 44
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v25

    .line 40
    new-instance v3, Landroidx/compose/ui/text/TextStyle;

    .line 41
    move-object v11, v0

    check-cast v11, Landroidx/compose/ui/text/font/FontFamily;

    const v33, 0xfdffd9

    const/16 v34, 0x0

    const-wide/16 v4, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    .line 40
    invoke-direct/range {v3 .. v34}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textStyle:Landroidx/compose/ui/text/TextStyle;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/ErrorTextStyle;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getIconModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 35
    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->iconModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public getShape()Landroidx/compose/foundation/shape/RoundedCornerShape;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->shape:Landroidx/compose/foundation/shape/RoundedCornerShape;

    return-object v0
.end method

.method public bridge synthetic getShape()Landroidx/compose/ui/graphics/Shape;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->getShape()Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Shape;

    return-object v0
.end method

.method public getTextModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public getTextStyle()Landroidx/compose/ui/text/TextStyle;
    .locals 1

    .line 40
    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textStyle:Landroidx/compose/ui/text/TextStyle;

    return-object v0
.end method

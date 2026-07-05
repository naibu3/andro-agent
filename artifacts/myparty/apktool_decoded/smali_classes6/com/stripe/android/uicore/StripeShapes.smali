.class public final Lcom/stripe/android/uicore/StripeShapes;
.super Ljava/lang/Object;
.source "StripeTheme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/StripeShapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,812:1\n169#2:813\n*S KotlinDebug\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/StripeShapes\n*L\n72#1:813\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u000c\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/StripeShapes;",
        "",
        "cornerRadius",
        "",
        "bottomSheetCornerRadius",
        "borderStrokeWidth",
        "<init>",
        "(FFF)V",
        "getCornerRadius",
        "()F",
        "getBottomSheetCornerRadius",
        "getBorderStrokeWidth",
        "roundedCornerShape",
        "Landroidx/compose/ui/graphics/Shape;",
        "getRoundedCornerShape",
        "()Landroidx/compose/ui/graphics/Shape;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stripe-ui-core_release"
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


# instance fields
.field private final borderStrokeWidth:F

.field private final bottomSheetCornerRadius:F

.field private final cornerRadius:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput p1, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    .line 67
    iput p2, p0, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    .line 68
    iput p3, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/StripeShapes;FFFILjava/lang/Object;)Lcom/stripe/android/uicore/StripeShapes;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/StripeShapes;->copy(FFF)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    return v0
.end method

.method public final copy(FFF)Lcom/stripe/android/uicore/StripeShapes;
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/StripeShapes;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/uicore/StripeShapes;-><init>(FFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/StripeShapes;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/StripeShapes;

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    iget v3, p1, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    iget v3, p1, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    iget p1, p1, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBorderStrokeWidth()F
    .locals 1

    .line 68
    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    return v0
.end method

.method public final getBottomSheetCornerRadius()F
    .locals 1

    .line 67
    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    return v0
.end method

.method public final getCornerRadius()F
    .locals 1

    .line 66
    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    return v0
.end method

.method public final getRoundedCornerShape()Landroidx/compose/ui/graphics/Shape;
    .locals 1

    .line 72
    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    .line 813
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 72
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Shape;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/stripe/android/uicore/StripeShapes;->cornerRadius:F

    iget v1, p0, Lcom/stripe/android/uicore/StripeShapes;->bottomSheetCornerRadius:F

    iget v2, p0, Lcom/stripe/android/uicore/StripeShapes;->borderStrokeWidth:F

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "StripeShapes(cornerRadius="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", bottomSheetCornerRadius="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", borderStrokeWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

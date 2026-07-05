.class public final Lcom/stripe/android/uicore/EmbeddedInsets;
.super Ljava/lang/Object;
.source "StripeTheme.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/uicore/EmbeddedInsets;",
        "",
        "checkmarkInsetDp",
        "",
        "additionalVerticalInsetsDp",
        "horizontalInsetsDp",
        "<init>",
        "(FFF)V",
        "getCheckmarkInsetDp",
        "()F",
        "getAdditionalVerticalInsetsDp",
        "getHorizontalInsetsDp",
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
.field private final additionalVerticalInsetsDp:F

.field private final checkmarkInsetDp:F

.field private final horizontalInsetsDp:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    iput p1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    .line 142
    iput p2, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    .line 143
    iput p3, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/EmbeddedInsets;FFFILjava/lang/Object;)Lcom/stripe/android/uicore/EmbeddedInsets;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/EmbeddedInsets;->copy(FFF)Lcom/stripe/android/uicore/EmbeddedInsets;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    return v0
.end method

.method public final copy(FFF)Lcom/stripe/android/uicore/EmbeddedInsets;
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/EmbeddedInsets;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/uicore/EmbeddedInsets;-><init>(FFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/EmbeddedInsets;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/EmbeddedInsets;

    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    iget v3, p1, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    iget v3, p1, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    iget p1, p1, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAdditionalVerticalInsetsDp()F
    .locals 1

    .line 142
    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    return v0
.end method

.method public final getCheckmarkInsetDp()F
    .locals 1

    .line 141
    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    return v0
.end method

.method public final getHorizontalInsetsDp()F
    .locals 1

    .line 143
    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->checkmarkInsetDp:F

    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->additionalVerticalInsetsDp:F

    iget v2, p0, Lcom/stripe/android/uicore/EmbeddedInsets;->horizontalInsetsDp:F

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "EmbeddedInsets(checkmarkInsetDp="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", additionalVerticalInsetsDp="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", horizontalInsetsDp="

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

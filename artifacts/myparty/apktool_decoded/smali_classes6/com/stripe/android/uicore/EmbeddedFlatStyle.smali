.class public final Lcom/stripe/android/uicore/EmbeddedFlatStyle;
.super Ljava/lang/Object;
.source "StripeTheme.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/EmbeddedFlatStyle;",
        "",
        "separatorThickness",
        "",
        "separatorInsets",
        "topSeparatorEnabled",
        "",
        "bottomSeparatorEnabled",
        "<init>",
        "(FFZZ)V",
        "getSeparatorThickness",
        "()F",
        "getSeparatorInsets",
        "getTopSeparatorEnabled",
        "()Z",
        "getBottomSeparatorEnabled",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
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
.field private final bottomSeparatorEnabled:Z

.field private final separatorInsets:F

.field private final separatorThickness:F

.field private final topSeparatorEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFZZ)V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput p1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    .line 134
    iput p2, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    .line 135
    iput-boolean p3, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    .line 136
    iput-boolean p4, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/EmbeddedFlatStyle;FFZZILjava/lang/Object;)Lcom/stripe/android/uicore/EmbeddedFlatStyle;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->copy(FFZZ)Lcom/stripe/android/uicore/EmbeddedFlatStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    return v0
.end method

.method public final copy(FFZZ)Lcom/stripe/android/uicore/EmbeddedFlatStyle;
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/EmbeddedFlatStyle;-><init>(FFZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/EmbeddedFlatStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/EmbeddedFlatStyle;

    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    iget v3, p1, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    iget v3, p1, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    iget-boolean p1, p1, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottomSeparatorEnabled()Z
    .locals 1

    .line 136
    iget-boolean v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    return v0
.end method

.method public final getSeparatorInsets()F
    .locals 1

    .line 134
    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    return v0
.end method

.method public final getSeparatorThickness()F
    .locals 1

    .line 133
    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    return v0
.end method

.method public final getTopSeparatorEnabled()Z
    .locals 1

    .line 135
    iget-boolean v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorThickness:F

    iget v1, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->separatorInsets:F

    iget-boolean v2, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->topSeparatorEnabled:Z

    iget-boolean v3, p0, Lcom/stripe/android/uicore/EmbeddedFlatStyle;->bottomSeparatorEnabled:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "EmbeddedFlatStyle(separatorThickness="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", separatorInsets="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", topSeparatorEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bottomSeparatorEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

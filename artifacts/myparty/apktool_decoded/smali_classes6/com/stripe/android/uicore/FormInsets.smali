.class public final Lcom/stripe/android/uicore/FormInsets;
.super Ljava/lang/Object;
.source "StripeTheme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/FormInsets\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,812:1\n169#2:813\n169#2:814\n169#2:815\n169#2:816\n*S KotlinDebug\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/FormInsets\n*L\n179#1:813\n180#1:814\n181#1:815\n182#1:816\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/uicore/FormInsets;",
        "",
        "start",
        "",
        "top",
        "end",
        "bottom",
        "<init>",
        "(FFFF)V",
        "getStart",
        "()F",
        "getTop",
        "getEnd",
        "getBottom",
        "asPaddingValues",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final bottom:F

.field private final end:F

.field private final start:F

.field private final top:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    iput p1, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    .line 173
    iput p2, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    .line 174
    iput p3, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    .line 175
    iput p4, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/FormInsets;FFFFILjava/lang/Object;)Lcom/stripe/android/uicore/FormInsets;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/FormInsets;->copy(FFFF)Lcom/stripe/android/uicore/FormInsets;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final asPaddingValues()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 4

    .line 179
    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    .line 813
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 180
    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    .line 814
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 181
    iget v2, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    .line 815
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 182
    iget v3, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    .line 816
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 178
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4(FFFF)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v0

    return-object v0
.end method

.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    return v0
.end method

.method public final copy(FFFF)Lcom/stripe/android/uicore/FormInsets;
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/FormInsets;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/FormInsets;-><init>(FFFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/FormInsets;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/FormInsets;

    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    iget v3, p1, Lcom/stripe/android/uicore/FormInsets;->start:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    iget v3, p1, Lcom/stripe/android/uicore/FormInsets;->top:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    iget v3, p1, Lcom/stripe/android/uicore/FormInsets;->end:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    iget p1, p1, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottom()F
    .locals 1

    .line 175
    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    return v0
.end method

.method public final getEnd()F
    .locals 1

    .line 174
    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    return v0
.end method

.method public final getStart()F
    .locals 1

    .line 172
    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    return v0
.end method

.method public final getTop()F
    .locals 1

    .line 173
    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/stripe/android/uicore/FormInsets;->start:F

    iget v1, p0, Lcom/stripe/android/uicore/FormInsets;->top:F

    iget v2, p0, Lcom/stripe/android/uicore/FormInsets;->end:F

    iget v3, p0, Lcom/stripe/android/uicore/FormInsets;->bottom:F

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "FormInsets(start="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", top="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

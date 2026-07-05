.class public final Lcom/stripe/android/uicore/PrimaryButtonTypography;
.super Ljava/lang/Object;
.source "StripeTheme.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0008\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000cJ&\u0010\u0011\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/uicore/PrimaryButtonTypography;",
        "",
        "fontFamily",
        "",
        "fontSize",
        "Landroidx/compose/ui/unit/TextUnit;",
        "<init>",
        "(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getFontFamily",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getFontSize-XSAIIZE",
        "()J",
        "J",
        "component1",
        "component2",
        "component2-XSAIIZE",
        "copy",
        "copy-mpE4wyQ",
        "(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final fontFamily:Ljava/lang/Integer;

.field private final fontSize:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/Integer;J)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    .line 128
    iput-wide p2, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/PrimaryButtonTypography;-><init>(Ljava/lang/Integer;J)V

    return-void
.end method

.method public static synthetic copy-mpE4wyQ$default(Lcom/stripe/android/uicore/PrimaryButtonTypography;Ljava/lang/Integer;JILjava/lang/Object;)Lcom/stripe/android/uicore/PrimaryButtonTypography;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->copy-mpE4wyQ(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2-XSAIIZE()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    return-wide v0
.end method

.method public final copy-mpE4wyQ(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/stripe/android/uicore/PrimaryButtonTypography;-><init>(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    iget-object v1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    iget-wide v5, p1, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFontFamily()Ljava/lang/Integer;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFontSize-XSAIIZE()J
    .locals 2

    .line 128
    iget-wide v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/TextUnit;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontFamily:Ljava/lang/Integer;

    iget-wide v1, p0, Lcom/stripe/android/uicore/PrimaryButtonTypography;->fontSize:J

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/TextUnit;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "PrimaryButtonTypography(fontFamily="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", fontSize="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

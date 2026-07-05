.class public final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;
.super Ljava/lang/Object;
.source "PrimaryButtonTheme.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000bJ&\u0010\u0010\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;",
        "",
        "fontFamily",
        "Landroidx/compose/ui/text/font/FontFamily;",
        "fontSize",
        "Landroidx/compose/ui/unit/TextUnit;",
        "<init>",
        "(Landroidx/compose/ui/text/font/FontFamily;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getFontFamily",
        "()Landroidx/compose/ui/text/font/FontFamily;",
        "getFontSize-XSAIIZE",
        "()J",
        "J",
        "component1",
        "component2",
        "component2-XSAIIZE",
        "copy",
        "copy-mpE4wyQ",
        "(Landroidx/compose/ui/text/font/FontFamily;J)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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


# instance fields
.field private final fontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field private final fontSize:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/ui/text/font/FontFamily;J)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 40
    iput-wide p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/text/font/FontFamily;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 40
    sget-object p2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide p2

    .line 38
    :cond_1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;-><init>(Landroidx/compose/ui/text/font/FontFamily;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/text/font/FontFamily;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;-><init>(Landroidx/compose/ui/text/font/FontFamily;J)V

    return-void
.end method

.method public static synthetic copy-mpE4wyQ$default(Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;Landroidx/compose/ui/text/font/FontFamily;JILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->copy-mpE4wyQ(Landroidx/compose/ui/text/font/FontFamily;J)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public final component2-XSAIIZE()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

    return-wide v0
.end method

.method public final copy-mpE4wyQ(Landroidx/compose/ui/text/font/FontFamily;J)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;-><init>(Landroidx/compose/ui/text/font/FontFamily;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

    iget-wide v5, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFontFamily()Landroidx/compose/ui/text/font/FontFamily;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    return-object v0
.end method

.method public final getFontSize-XSAIIZE()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontFamily;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/TextUnit;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    iget-wide v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->fontSize:J

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

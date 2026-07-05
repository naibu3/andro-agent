.class public final Lcom/google/accompanist/themeadapter/material/ThemeParameters;
.super Ljava/lang/Object;
.source "MdcTheme.kt"


# annotations
.annotation runtime Lkotlin/Deprecated;
    message = "\n   Material ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-material/\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/google/accompanist/themeadapter/material/ThemeParameters;",
        "",
        "colors",
        "Landroidx/compose/material/Colors;",
        "typography",
        "Landroidx/compose/material/Typography;",
        "shapes",
        "Landroidx/compose/material/Shapes;",
        "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;)V",
        "getColors",
        "()Landroidx/compose/material/Colors;",
        "getShapes",
        "()Landroidx/compose/material/Shapes;",
        "getTypography",
        "()Landroidx/compose/material/Typography;",
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
        "themeadapter-material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final colors:Landroidx/compose/material/Colors;

.field private final shapes:Landroidx/compose/material/Shapes;

.field private final typography:Landroidx/compose/material/Typography;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;)V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    .line 141
    iput-object p2, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    .line 142
    iput-object p3, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/accompanist/themeadapter/material/ThemeParameters;Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;ILjava/lang/Object;)Lcom/google/accompanist/themeadapter/material/ThemeParameters;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->copy(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;)Lcom/google/accompanist/themeadapter/material/ThemeParameters;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/material/Colors;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    return-object v0
.end method

.method public final component2()Landroidx/compose/material/Typography;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    return-object v0
.end method

.method public final component3()Landroidx/compose/material/Shapes;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    return-object v0
.end method

.method public final copy(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;)Lcom/google/accompanist/themeadapter/material/ThemeParameters;
    .locals 1

    new-instance v0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/accompanist/themeadapter/material/ThemeParameters;-><init>(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/accompanist/themeadapter/material/ThemeParameters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/accompanist/themeadapter/material/ThemeParameters;

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    iget-object v3, p1, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    iget-object v3, p1, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    iget-object p1, p1, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getColors()Landroidx/compose/material/Colors;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    return-object v0
.end method

.method public final getShapes()Landroidx/compose/material/Shapes;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    return-object v0
.end method

.method public final getTypography()Landroidx/compose/material/Typography;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/material/Colors;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/material/Typography;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Landroidx/compose/material/Shapes;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeParameters(colors="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", typography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shapes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material/ThemeParameters;->shapes:Landroidx/compose/material/Shapes;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

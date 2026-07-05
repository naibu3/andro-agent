.class public final Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;
.super Ljava/lang/Object;
.source "Mdc3Theme.kt"


# annotations
.annotation runtime Lkotlin/Deprecated;
    message = "\n   Material ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-material/\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;",
        "",
        "colorScheme",
        "Landroidx/compose/material3/ColorScheme;",
        "typography",
        "Landroidx/compose/material3/Typography;",
        "shapes",
        "Landroidx/compose/material3/Shapes;",
        "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;)V",
        "getColorScheme",
        "()Landroidx/compose/material3/ColorScheme;",
        "getShapes",
        "()Landroidx/compose/material3/Shapes;",
        "getTypography",
        "()Landroidx/compose/material3/Typography;",
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
        "themeadapter-material3_release"
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
.field private final colorScheme:Landroidx/compose/material3/ColorScheme;

.field private final shapes:Landroidx/compose/material3/Shapes;

.field private final typography:Landroidx/compose/material3/Typography;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;)V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    .line 134
    iput-object p2, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    .line 135
    iput-object p3, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;ILjava/lang/Object;)Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->copy(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;)Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/material3/ColorScheme;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    return-object v0
.end method

.method public final component2()Landroidx/compose/material3/Typography;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    return-object v0
.end method

.method public final component3()Landroidx/compose/material3/Shapes;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    return-object v0
.end method

.method public final copy(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;)Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;
    .locals 1

    new-instance v0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;-><init>(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Typography;Landroidx/compose/material3/Shapes;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    iget-object v3, p1, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    iget-object v3, p1, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    iget-object p1, p1, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getColorScheme()Landroidx/compose/material3/ColorScheme;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    return-object v0
.end method

.method public final getShapes()Landroidx/compose/material3/Shapes;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    return-object v0
.end method

.method public final getTypography()Landroidx/compose/material3/Typography;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/material3/ColorScheme;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/material3/Typography;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Landroidx/compose/material3/Shapes;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Theme3Parameters(colorScheme="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->colorScheme:Landroidx/compose/material3/ColorScheme;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", typography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->typography:Landroidx/compose/material3/Typography;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shapes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;->shapes:Landroidx/compose/material3/Shapes;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

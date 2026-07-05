.class public final Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;
.super Ljava/lang/Object;
.source "AppCompatTheme.kt"


# annotations
.annotation runtime Lkotlin/Deprecated;
    message = "\n   AppCompat ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;",
        "",
        "colors",
        "Landroidx/compose/material/Colors;",
        "typography",
        "Landroidx/compose/material/Typography;",
        "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;)V",
        "getColors",
        "()Landroidx/compose/material/Colors;",
        "getTypography",
        "()Landroidx/compose/material/Typography;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "themeadapter-appcompat_release"
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

.field private final typography:Landroidx/compose/material/Typography;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;)V
    .locals 0

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    iput-object p1, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    .line 149
    iput-object p2, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;ILjava/lang/Object;)Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->copy(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;)Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/material/Colors;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    return-object v0
.end method

.method public final component2()Landroidx/compose/material/Typography;
    .locals 1

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    return-object v0
.end method

.method public final copy(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;)Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;
    .locals 1

    new-instance v0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    invoke-direct {v0, p1, p2}, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;-><init>(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    iget-object v3, p1, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    iget-object p1, p1, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getColors()Landroidx/compose/material/Colors;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    return-object v0
.end method

.method public final getTypography()Landroidx/compose/material/Typography;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/material/Colors;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/material/Typography;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeParameters(colors="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->colors:Landroidx/compose/material/Colors;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", typography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->typography:Landroidx/compose/material/Typography;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

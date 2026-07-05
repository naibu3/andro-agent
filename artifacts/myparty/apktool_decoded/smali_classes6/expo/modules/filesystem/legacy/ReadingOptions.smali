.class public final Lexpo/modules/filesystem/legacy/ReadingOptions;
.super Ljava/lang/Object;
.source "FileSystemRecords.kt"

# interfaces
.implements Lexpo/modules/kotlin/records/Record;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ0\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\u0008\r\u0010\n\u001a\u0004\u0008\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\u0008\u0011\u0010\n\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/filesystem/legacy/ReadingOptions;",
        "Lexpo/modules/kotlin/records/Record;",
        "encoding",
        "Lexpo/modules/filesystem/legacy/EncodingType;",
        "position",
        "",
        "length",
        "<init>",
        "(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "getEncoding$annotations",
        "()V",
        "getEncoding",
        "()Lexpo/modules/filesystem/legacy/EncodingType;",
        "getPosition$annotations",
        "getPosition",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getLength$annotations",
        "getLength",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)Lexpo/modules/filesystem/legacy/ReadingOptions;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "expo-file-system_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final encoding:Lexpo/modules/filesystem/legacy/EncodingType;

.field private final length:Ljava/lang/Integer;

.field private final position:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "encoding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    .line 20
    iput-object p2, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    .line 22
    iput-object p3, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 19
    sget-object p1, Lexpo/modules/filesystem/legacy/EncodingType;->UTF8:Lexpo/modules/filesystem/legacy/EncodingType;

    .line 17
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/filesystem/legacy/ReadingOptions;-><init>(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/filesystem/legacy/ReadingOptions;Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lexpo/modules/filesystem/legacy/ReadingOptions;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/filesystem/legacy/ReadingOptions;->copy(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)Lexpo/modules/filesystem/legacy/ReadingOptions;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getEncoding$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getLength$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method

.method public static synthetic getPosition$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()Lexpo/modules/filesystem/legacy/EncodingType;
    .locals 1

    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)Lexpo/modules/filesystem/legacy/ReadingOptions;
    .locals 1

    const-string v0, "encoding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lexpo/modules/filesystem/legacy/ReadingOptions;

    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/filesystem/legacy/ReadingOptions;-><init>(Lexpo/modules/filesystem/legacy/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lexpo/modules/filesystem/legacy/ReadingOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lexpo/modules/filesystem/legacy/ReadingOptions;

    iget-object v1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    iget-object v3, p1, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    iget-object v3, p1, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    iget-object p1, p1, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEncoding()Lexpo/modules/filesystem/legacy/EncodingType;
    .locals 1

    .line 18
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    return-object v0
.end method

.method public final getLength()Ljava/lang/Integer;
    .locals 1

    .line 22
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPosition()Ljava/lang/Integer;
    .locals 1

    .line 20
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    invoke-virtual {v0}, Lexpo/modules/filesystem/legacy/EncodingType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->encoding:Lexpo/modules/filesystem/legacy/EncodingType;

    iget-object v1, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->position:Ljava/lang/Integer;

    iget-object v2, p0, Lexpo/modules/filesystem/legacy/ReadingOptions;->length:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ReadingOptions(encoding="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", position="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

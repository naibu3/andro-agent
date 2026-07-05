.class public final Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;
.super Ljava/lang/Object;
.source "CrashRequest.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ExceptionTraceElement"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\n\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;",
        "",
        "className",
        "",
        "fileName",
        "methodName",
        "line",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
        "getClassName",
        "()Ljava/lang/String;",
        "getFileName",
        "getLine",
        "()I",
        "getMethodName",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final className:Ljava/lang/String;

.field private final fileName:Ljava/lang/String;

.field private final line:I

.field private final methodName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "class"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "file"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "method"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "line"
        .end annotation
    .end param

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    .line 31
    iput p4, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "class"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "file"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "method"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "line"
        .end annotation
    .end param

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    iget p1, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLine()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    return v0
.end method

.method public final getMethodName()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->className:Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->fileName:Ljava/lang/String;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->methodName:Ljava/lang/String;

    iget v3, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;->line:I

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ExceptionTraceElement(className="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", fileName="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", methodName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", line="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

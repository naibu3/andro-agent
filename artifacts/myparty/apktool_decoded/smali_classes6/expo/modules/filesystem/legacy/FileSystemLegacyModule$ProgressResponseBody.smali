.class final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;
.super Lokhttp3/ResponseBody;
.source "FileSystemLegacyModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ProgressResponseBody"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u0008H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;",
        "Lokhttp3/ResponseBody;",
        "responseBody",
        "progressListener",
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;",
        "<init>",
        "(Lokhttp3/ResponseBody;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;)V",
        "bufferedSource",
        "Lokio/BufferedSource;",
        "contentType",
        "Lokhttp3/MediaType;",
        "contentLength",
        "",
        "source",
        "Lokio/Source;",
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
.field private bufferedSource:Lokio/BufferedSource;

.field private final progressListener:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

.field private final responseBody:Lokhttp3/ResponseBody;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;)V
    .locals 1

    const-string v0, "progressListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 964
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    iput-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Lokhttp3/ResponseBody;

    iput-object p2, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->progressListener:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

    return-void
.end method

.method public static final synthetic access$getProgressListener$p(Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;)Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;
    .locals 0

    .line 964
    iget-object p0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->progressListener:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

    return-object p0
.end method

.method public static final synthetic access$getResponseBody$p(Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;)Lokhttp3/ResponseBody;
    .locals 0

    .line 964
    iget-object p0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Lokhttp3/ResponseBody;

    return-object p0
.end method

.method private final source(Lokio/Source;)Lokio/Source;
    .locals 1

    .line 975
    new-instance v0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody$source$1;

    invoke-direct {v0, p1, p0}, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody$source$1;-><init>(Lokio/Source;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;)V

    check-cast v0, Lokio/Source;

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 969
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Lokhttp3/ResponseBody;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    .line 967
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Lokhttp3/ResponseBody;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 972
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->bufferedSource:Lokio/BufferedSource;

    if-nez v0, :cond_0

    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Lokhttp3/ResponseBody;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    check-cast v0, Lokio/Source;

    invoke-direct {p0, v0}, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->source(Lokio/Source;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    :cond_0
    return-object v0
.end method

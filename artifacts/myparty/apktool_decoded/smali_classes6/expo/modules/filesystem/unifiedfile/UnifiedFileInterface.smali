.class public interface abstract Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.super Ljava/lang/Object;
.source "UnifiedFileInterface.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0003H&J\u0008\u0010\u0005\u001a\u00020\u0003H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000c\u001a\u00020\u000bH&J\u0008\u0010\u000e\u001a\u00020\u0003H&J\u0008\u0010\u000f\u001a\u00020\u0003H&J\u000e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0011H&J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H&J\u0008\u0010#\u001a\u00020$H&J\u0008\u0010%\u001a\u00020&H&J\u0008\u0010\'\u001a\u00020\u001aH&J\u000e\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00000)H&R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0018\u00a8\u0006*"
    }
    d2 = {
        "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "",
        "exists",
        "",
        "isDirectory",
        "isFile",
        "parentFile",
        "getParentFile",
        "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "createFile",
        "mimeType",
        "",
        "displayName",
        "createDirectory",
        "delete",
        "deleteRecursively",
        "listFilesAsUnified",
        "",
        "uri",
        "Landroid/net/Uri;",
        "getUri",
        "()Landroid/net/Uri;",
        "type",
        "getType",
        "()Ljava/lang/String;",
        "lastModified",
        "",
        "()Ljava/lang/Long;",
        "creationTime",
        "getCreationTime",
        "fileName",
        "getFileName",
        "getContentUri",
        "appContext",
        "Lexpo/modules/kotlin/AppContext;",
        "outputStream",
        "Ljava/io/OutputStream;",
        "inputStream",
        "Ljava/io/InputStream;",
        "length",
        "walkTopDown",
        "Lkotlin/sequences/Sequence;",
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


# virtual methods
.method public abstract createDirectory(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.end method

.method public abstract createFile(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.end method

.method public abstract delete()Z
.end method

.method public abstract deleteRecursively()Z
.end method

.method public abstract exists()Z
.end method

.method public abstract getContentUri(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;
.end method

.method public abstract getCreationTime()Ljava/lang/Long;
.end method

.method public abstract getFileName()Ljava/lang/String;
.end method

.method public abstract getParentFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.end method

.method public abstract getType()Ljava/lang/String;
.end method

.method public abstract getUri()Landroid/net/Uri;
.end method

.method public abstract inputStream()Ljava/io/InputStream;
.end method

.method public abstract isDirectory()Z
.end method

.method public abstract isFile()Z
.end method

.method public abstract lastModified()Ljava/lang/Long;
.end method

.method public abstract length()J
.end method

.method public abstract listFilesAsUnified()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
            ">;"
        }
    .end annotation
.end method

.method public abstract outputStream()Ljava/io/OutputStream;
.end method

.method public abstract walkTopDown()Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
            ">;"
        }
    .end annotation
.end method

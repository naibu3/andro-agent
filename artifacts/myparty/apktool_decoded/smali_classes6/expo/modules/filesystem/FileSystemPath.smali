.class public abstract Lexpo/modules/filesystem/FileSystemPath;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "FileSystemPath.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileSystemPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystemPath.kt\nexpo/modules/filesystem/FileSystemPath\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,179:1\n36#2:180\n36#2:181\n36#2:182\n36#2:183\n*S KotlinDebug\n*F\n+ 1 FileSystemPath.kt\nexpo/modules/filesystem/FileSystemPath\n*L\n148#1:180\n152#1:181\n162#1:182\n166#1:183\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\u0008\u0010\u0014\u001a\u00020\u0013H&J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0000J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0000J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010%\u001a\u0004\u0018\u00010&8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010&8F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Lexpo/modules/filesystem/FileSystemPath;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "uri",
        "Landroid/net/Uri;",
        "<init>",
        "(Landroid/net/Uri;)V",
        "getUri",
        "()Landroid/net/Uri;",
        "setUri",
        "fileAdapter",
        "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "file",
        "getFile",
        "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "javaFile",
        "Ljava/io/File;",
        "getJavaFile",
        "()Ljava/io/File;",
        "delete",
        "",
        "validateType",
        "getMoveOrCopyPath",
        "destination",
        "validatePermission",
        "permission",
        "Lexpo/modules/interfaces/filesystem/Permission;",
        "checkPermission",
        "",
        "validateCanCreate",
        "options",
        "Lexpo/modules/filesystem/CreateOptions;",
        "copy",
        "to",
        "move",
        "rename",
        "newName",
        "",
        "modificationTime",
        "",
        "getModificationTime",
        "()Ljava/lang/Long;",
        "creationTime",
        "getCreationTime",
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
.field private fileAdapter:Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

.field private uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 2

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 36
    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Lexpo/modules/kotlin/RuntimeContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final checkPermission(Lexpo/modules/interfaces/filesystem/Permission;)Z
    .locals 3

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-static {v0}, Lexpo/modules/filesystem/FileSystemPathKt;->isContentUri(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 116
    :cond_0
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-static {v0}, Lexpo/modules/filesystem/FileSystemPathKt;->isAssetUri(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 120
    :cond_1
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getFilePermission()Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;->getPathPermissions(Landroid/content/Context;Ljava/lang/String;)Ljava/util/EnumSet;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    const-class v0, Lexpo/modules/interfaces/filesystem/Permission;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 121
    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final copy(Lexpo/modules/filesystem/FileSystemPath;)V
    .locals 7

    const-string v0, "to"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->validateType()V

    .line 132
    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->validateType()V

    .line 133
    sget-object v0, Lexpo/modules/interfaces/filesystem/Permission;->READ:Lexpo/modules/interfaces/filesystem/Permission;

    invoke-virtual {p0, v0}, Lexpo/modules/filesystem/FileSystemPath;->validatePermission(Lexpo/modules/interfaces/filesystem/Permission;)V

    .line 134
    sget-object v0, Lexpo/modules/interfaces/filesystem/Permission;->WRITE:Lexpo/modules/interfaces/filesystem/Permission;

    invoke-virtual {p1, v0}, Lexpo/modules/filesystem/FileSystemPath;->validatePermission(Lexpo/modules/interfaces/filesystem/Permission;)V

    .line 136
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0, p1}, Lexpo/modules/filesystem/FileSystemPath;->getMoveOrCopyPath(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/io/FilesKt;->copyRecursively$default(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    return-void
.end method

.method public final delete()V
    .locals 5

    .line 61
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 64
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->isDirectory()Z

    move-result v0

    const-string v1, "\'"

    const-string v2, "failed to delete \'"

    if-eqz v0, :cond_1

    .line 65
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->deleteRecursively()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    new-instance v0, Lexpo/modules/filesystem/UnableToDeleteException;

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v3

    invoke-interface {v3}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->getUri()Landroid/net/Uri;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lexpo/modules/filesystem/UnableToDeleteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_1
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->delete()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-void

    .line 70
    :cond_2
    new-instance v0, Lexpo/modules/filesystem/UnableToDeleteException;

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v3

    invoke-interface {v3}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->getUri()Landroid/net/Uri;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lexpo/modules/filesystem/UnableToDeleteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_3
    new-instance v0, Lexpo/modules/filesystem/UnableToDeleteException;

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v1

    invoke-interface {v1}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->getUri()Landroid/net/Uri;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "uri \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' does not exist"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lexpo/modules/filesystem/UnableToDeleteException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getCreationTime()Ljava/lang/Long;
    .locals 1

    .line 176
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->getCreationTime()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
    .locals 3

    .line 39
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->fileAdapter:Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    if-eqz v0, :cond_0

    .line 40
    invoke-interface {v0}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->getUri()Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 43
    :cond_1
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-static {v0}, Lexpo/modules/filesystem/FileSystemPathKt;->isContentUri(Landroid/net/Uri;)Z

    move-result v0

    const-string v1, "No context"

    if-eqz v0, :cond_3

    .line 44
    new-instance v0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-direct {v0, v2, v1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    check-cast v0, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_3
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-static {v0}, Lexpo/modules/filesystem/FileSystemPathKt;->isAssetUri(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 46
    new-instance v0, Lexpo/modules/filesystem/unifiedfile/AssetFile;

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-direct {v0, v2, v1}, Lexpo/modules/filesystem/unifiedfile/AssetFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    check-cast v0, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 48
    :cond_5
    new-instance v0, Lexpo/modules/filesystem/unifiedfile/JavaFile;

    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lexpo/modules/filesystem/unifiedfile/JavaFile;-><init>(Landroid/net/Uri;)V

    check-cast v0, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    .line 50
    :goto_1
    iput-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->fileAdapter:Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    return-object v0
.end method

.method public final getJavaFile()Ljava/io/File;
    .locals 4

    .line 54
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    invoke-static {v0}, Lexpo/modules/filesystem/FileSystemPathKt;->isContentUri(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.io.File"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/io/File;

    return-object v0

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "This method cannot be used with content URIs: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getModificationTime()Ljava/lang/Long;
    .locals 1

    .line 171
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->validateType()V

    .line 172
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->lastModified()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final getMoveOrCopyPath(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;
    .locals 2

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    instance-of v0, p1, Lexpo/modules/filesystem/FileSystemDirectory;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    .line 79
    instance-of v0, p0, Lexpo/modules/filesystem/FileSystemFile;

    if-eqz v0, :cond_1

    .line 80
    move-object v0, p1

    check-cast v0, Lexpo/modules/filesystem/FileSystemDirectory;

    invoke-virtual {v0}, Lexpo/modules/filesystem/FileSystemDirectory;->getExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0

    .line 81
    :cond_0
    new-instance p1, Lexpo/modules/filesystem/DestinationDoesNotExistException;

    invoke-direct {p1}, Lexpo/modules/filesystem/DestinationDoesNotExistException;-><init>()V

    throw p1

    .line 87
    :cond_1
    move-object v0, p1

    check-cast v0, Lexpo/modules/filesystem/FileSystemDirectory;

    invoke-virtual {v0}, Lexpo/modules/filesystem/FileSystemDirectory;->getExists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0

    .line 90
    :cond_2
    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-ne v0, v1, :cond_3

    .line 93
    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object p1

    return-object p1

    .line 91
    :cond_3
    new-instance p1, Lexpo/modules/filesystem/DestinationDoesNotExistException;

    invoke-direct {p1}, Lexpo/modules/filesystem/DestinationDoesNotExistException;-><init>()V

    throw p1

    .line 96
    :cond_4
    instance-of v0, p0, Lexpo/modules/filesystem/FileSystemFile;

    if-eqz v0, :cond_6

    .line 99
    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-ne v0, v1, :cond_5

    .line 102
    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object p1

    return-object p1

    .line 100
    :cond_5
    new-instance p1, Lexpo/modules/filesystem/DestinationDoesNotExistException;

    invoke-direct {p1}, Lexpo/modules/filesystem/DestinationDoesNotExistException;-><init>()V

    throw p1

    .line 97
    :cond_6
    new-instance p1, Lexpo/modules/filesystem/CopyOrMoveDirectoryToFileException;

    invoke-direct {p1}, Lexpo/modules/filesystem/CopyOrMoveDirectoryToFileException;-><init>()V

    throw p1
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    .line 36
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public final move(Lexpo/modules/filesystem/FileSystemPath;)V
    .locals 6

    const-string v0, "to"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->validateType()V

    .line 141
    invoke-virtual {p1}, Lexpo/modules/filesystem/FileSystemPath;->validateType()V

    .line 142
    sget-object v0, Lexpo/modules/interfaces/filesystem/Permission;->WRITE:Lexpo/modules/interfaces/filesystem/Permission;

    invoke-virtual {p0, v0}, Lexpo/modules/filesystem/FileSystemPath;->validatePermission(Lexpo/modules/interfaces/filesystem/Permission;)V

    .line 143
    sget-object v0, Lexpo/modules/interfaces/filesystem/Permission;->WRITE:Lexpo/modules/interfaces/filesystem/Permission;

    invoke-virtual {p1, v0}, Lexpo/modules/filesystem/FileSystemPath;->validatePermission(Lexpo/modules/interfaces/filesystem/Permission;)V

    .line 145
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 146
    invoke-virtual {p0, p1}, Lexpo/modules/filesystem/FileSystemPath;->getMoveOrCopyPath(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;

    move-result-object p1

    .line 147
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v0

    const-string v1, "toPath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v3, v1, [Ljava/nio/file/CopyOption;

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/CopyOption;

    invoke-static {v0, v2, v1}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    move-result-object v0

    const-string v1, "move(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    .line 148
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    return-void

    .line 150
    :cond_0
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, p1}, Lexpo/modules/filesystem/FileSystemPath;->getMoveOrCopyPath(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 151
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 152
    invoke-virtual {p0, p1}, Lexpo/modules/filesystem/FileSystemPath;->getMoveOrCopyPath(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;

    move-result-object p1

    .line 181
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    .line 152
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    return-void
.end method

.method public final rename(Ljava/lang/String;)V
    .locals 7

    const-string v0, "newName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->validateType()V

    .line 158
    sget-object v0, Lexpo/modules/interfaces/filesystem/Permission;->WRITE:Lexpo/modules/interfaces/filesystem/Permission;

    invoke-virtual {p0, v0}, Lexpo/modules/filesystem/FileSystemPath;->validatePermission(Lexpo/modules/interfaces/filesystem/Permission;)V

    .line 159
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_0

    .line 161
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object p1

    const-string v0, "toPath(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v3, v0, [Ljava/nio/file/CopyOption;

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/CopyOption;

    invoke-static {p1, v1, v0}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    move-result-object p1

    const-string v0, "move(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    .line 162
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    return-void

    .line 164
    :cond_0
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 165
    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 183
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    .line 166
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    return-void
.end method

.method public final setUri(Landroid/net/Uri;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemPath;->uri:Landroid/net/Uri;

    return-void
.end method

.method public final validateCanCreate(Lexpo/modules/filesystem/CreateOptions;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-virtual {p1}, Lexpo/modules/filesystem/CreateOptions;->getOverwrite()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lexpo/modules/filesystem/FileSystemPath;->getFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 126
    :cond_0
    new-instance p1, Lexpo/modules/filesystem/UnableToCreateException;

    const-string v0, "it already exists"

    invoke-direct {p1, v0}, Lexpo/modules/filesystem/UnableToCreateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final validatePermission(Lexpo/modules/interfaces/filesystem/Permission;)V
    .locals 1

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-virtual {p0, p1}, Lexpo/modules/filesystem/FileSystemPath;->checkPermission(Lexpo/modules/interfaces/filesystem/Permission;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 107
    :cond_0
    new-instance v0, Lexpo/modules/filesystem/InvalidPermissionException;

    invoke-direct {v0, p1}, Lexpo/modules/filesystem/InvalidPermissionException;-><init>(Lexpo/modules/interfaces/filesystem/Permission;)V

    throw v0
.end method

.method public abstract validateType()V
.end method

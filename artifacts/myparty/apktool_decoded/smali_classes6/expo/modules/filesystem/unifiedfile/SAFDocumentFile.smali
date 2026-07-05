.class public final Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;
.super Ljava/lang/Object;
.source "SAFDocumentFile.kt"

# interfaces
.implements Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSAFDocumentFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFile\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n1#2:106\n11228#3:107\n11563#3,3:108\n*S KotlinDebug\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFile\n*L\n52#1:107\n52#1:108,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0008\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0011\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0008\u0010\u001a\u001a\u00020\u000fH\u0016J\u0008\u0010\u001b\u001a\u00020\u000fH\u0016J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u001dH\u0016J\u000f\u0010!\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0002\u0010#J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020(H\u0016J\u0008\u0010+\u001a\u00020,H\u0016J\u0008\u0010-\u001a\u00020.H\u0016J\u0008\u0010/\u001a\u00020\"H\u0016J\u000e\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u000001H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010 R\u0016\u0010)\u001a\u0004\u0018\u00010\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010#\u00a8\u00062"
    }
    d2 = {
        "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;",
        "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "context",
        "Landroid/content/Context;",
        "uri",
        "Landroid/net/Uri;",
        "<init>",
        "(Landroid/content/Context;Landroid/net/Uri;)V",
        "getUri",
        "()Landroid/net/Uri;",
        "documentFile",
        "Landroidx/documentfile/provider/DocumentFile;",
        "getDocumentFile",
        "()Landroidx/documentfile/provider/DocumentFile;",
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
        "type",
        "getType",
        "()Ljava/lang/String;",
        "lastModified",
        "",
        "()Ljava/lang/Long;",
        "fileName",
        "getFileName",
        "getContentUri",
        "appContext",
        "Lexpo/modules/kotlin/AppContext;",
        "creationTime",
        "getCreationTime",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    iput-object p2, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->uri:Landroid/net/Uri;

    return-void
.end method

.method public static final synthetic access$getContext$p(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;)Landroid/content/Context;
    .locals 0

    .line 10
    iget-object p0, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getDocumentFile(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;)Landroidx/documentfile/provider/DocumentFile;
    .locals 0

    .line 10
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object p0

    return-object p0
.end method

.method private final getDocumentFile()Landroidx/documentfile/provider/DocumentFile;
    .locals 2

    .line 14
    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const-string v1, "getPathSegments(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "tree"

    .line 15
    :cond_0
    const-string v1, "document"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    iget-object v0, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/documentfile/provider/DocumentFile;->fromSingleUri(Landroid/content/Context;Landroid/net/Uri;)Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    return-object v0

    .line 20
    :cond_1
    iget-object v0, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/documentfile/provider/DocumentFile;->fromTreeUri(Landroid/content/Context;Landroid/net/Uri;)Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public createDirectory(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
    .locals 2

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/documentfile/provider/DocumentFile;->createDirectory(Ljava/lang/String;)Landroidx/documentfile/provider/DocumentFile;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 44
    invoke-virtual {p1}, Landroidx/documentfile/provider/DocumentFile;->getUri()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v1, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    iget-object v0, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-direct {v1, v0, p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    :cond_1
    check-cast v1, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    return-object v1
.end method

.method public createFile(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
    .locals 2

    const-string v0, "mimeType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/documentfile/provider/DocumentFile;->createFile(Ljava/lang/String;Ljava/lang/String;)Landroidx/documentfile/provider/DocumentFile;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 39
    invoke-virtual {p1}, Landroidx/documentfile/provider/DocumentFile;->getUri()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v1, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    iget-object p2, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-direct {v1, p2, p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    :cond_1
    check-cast v1, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    return-object v1
.end method

.method public delete()Z
    .locals 3

    .line 47
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->delete()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public deleteRecursively()Z
    .locals 3

    .line 49
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFileKt;->deleteRecursively(Landroidx/documentfile/provider/DocumentFile;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public exists()Z
    .locals 3

    .line 24
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->exists()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public getContentUri(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public getCreationTime()Ljava/lang/Long;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 62
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getParentFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
    .locals 3

    .line 35
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->getParentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    iget-object v2, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;

    return-object v1
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 55
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    .line 10
    iget-object v0, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public inputStream()Ljava/io/InputStream;
    .locals 4

    .line 79
    iget-object v0, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 80
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to open output stream for URI: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isDirectory()Z
    .locals 3

    .line 27
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->isDirectory()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public isFile()Z
    .locals 3

    .line 31
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->isFile()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public lastModified()Ljava/lang/Long;
    .locals 2

    .line 58
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->lastModified()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public length()J
    .locals 2

    .line 84
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->length()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public listFilesAsUnified()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
            ">;"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getDocumentFile()Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/documentfile/provider/DocumentFile;->listFiles()[Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 107
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 108
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    .line 52
    new-instance v5, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    iget-object v6, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroidx/documentfile/provider/DocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v4

    const-string v7, "getUri(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6, v4}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 109
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 110
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1

    .line 52
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public outputStream()Ljava/io/OutputStream;
    .locals 4

    .line 74
    iget-object v0, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->getUri()Landroid/net/Uri;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to open output stream for URI: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public walkTopDown()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;",
            ">;"
        }
    .end annotation

    .line 88
    new-instance v0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;-><init>(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequence(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

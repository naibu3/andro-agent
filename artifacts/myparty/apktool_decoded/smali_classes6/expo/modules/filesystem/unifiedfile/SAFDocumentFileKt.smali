.class public final Lexpo/modules/filesystem/unifiedfile/SAFDocumentFileKt;
.super Ljava/lang/Object;
.source "SAFDocumentFile.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSAFDocumentFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFileKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n13472#2,2:106\n*S KotlinDebug\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFileKt\n*L\n101#1:106,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "deleteRecursively",
        "",
        "Landroidx/documentfile/provider/DocumentFile;",
        "expo-file-system_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final deleteRecursively(Landroidx/documentfile/provider/DocumentFile;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Landroidx/documentfile/provider/DocumentFile;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    invoke-virtual {p0}, Landroidx/documentfile/provider/DocumentFile;->listFiles()[Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    const-string v1, "listFiles(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    .line 106
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    check-cast v3, Landroidx/documentfile/provider/DocumentFile;

    .line 101
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v3}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFileKt;->deleteRecursively(Landroidx/documentfile/provider/DocumentFile;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {p0}, Landroidx/documentfile/provider/DocumentFile;->delete()Z

    move-result p0

    return p0
.end method

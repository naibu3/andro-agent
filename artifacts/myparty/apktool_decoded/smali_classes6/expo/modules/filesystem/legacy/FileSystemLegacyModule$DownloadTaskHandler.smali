.class final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadTaskHandler;
.super Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$TaskHandler;
.source "FileSystemLegacyModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DownloadTaskHandler"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadTaskHandler;",
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$TaskHandler;",
        "fileUri",
        "Landroid/net/Uri;",
        "call",
        "Lokhttp3/Call;",
        "<init>",
        "(Landroid/net/Uri;Lokhttp3/Call;)V",
        "getFileUri",
        "()Landroid/net/Uri;",
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
.field private final fileUri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lokhttp3/Call;)V
    .locals 1

    const-string v0, "fileUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 961
    invoke-direct {p0, p2}, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$TaskHandler;-><init>(Lokhttp3/Call;)V

    iput-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadTaskHandler;->fileUri:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final getFileUri()Landroid/net/Uri;
    .locals 1

    .line 961
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadTaskHandler;->fileUri:Landroid/net/Uri;

    return-object v0
.end method

.class public final Lexpo/modules/filesystem/legacy/FileSystemLegacyModuleKt;
.super Ljava/lang/Object;
.source "FileSystemLegacyModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "EXDownloadProgressEventName",
        "EXUploadProgressEventName",
        "MIN_EVENT_DT_MS",
        "",
        "DIR_PERMISSIONS_REQUEST_CODE",
        "",
        "slashifyFilePath",
        "path",
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


# static fields
.field private static final DIR_PERMISSIONS_REQUEST_CODE:I = 0x1512

.field private static final EXDownloadProgressEventName:Ljava/lang/String; = "expo-file-system.downloadProgress"

.field private static final EXUploadProgressEventName:Ljava/lang/String; = "expo-file-system.uploadProgress"

.field private static final MIN_EVENT_DT_MS:J = 0x64L

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    const-class v0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;

    const-string v0, "FileSystemLegacyModule"

    sput-object v0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModuleKt;->TAG:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getTAG$p()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModuleKt;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final slashifyFilePath(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 71
    const-string v3, "file:///"

    invoke-static {p0, v3, v1, v2, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 75
    :cond_1
    const-string v0, "^file:/*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

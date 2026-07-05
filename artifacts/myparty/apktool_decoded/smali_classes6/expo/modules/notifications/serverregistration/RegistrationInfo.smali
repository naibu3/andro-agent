.class public Lexpo/modules/notifications/serverregistration/RegistrationInfo;
.super Ljava/lang/Object;
.source "RegistrationInfo.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/serverregistration/RegistrationInfo$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/notifications/serverregistration/RegistrationInfo;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "nonBackedUpRegistrationInfoFile",
        "Ljava/io/File;",
        "getNonBackedUpRegistrationInfoFile",
        "()Ljava/io/File;",
        "get",
        "",
        "set",
        "",
        "registrationInfo",
        "Companion",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lexpo/modules/notifications/serverregistration/RegistrationInfo$Companion;

.field public static final REGISTRATION_INFO_FILE_NAME:Ljava/lang/String; = "expo_notifications_registration_info.txt"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lexpo/modules/notifications/serverregistration/RegistrationInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/notifications/serverregistration/RegistrationInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/notifications/serverregistration/RegistrationInfo;->Companion:Lexpo/modules/notifications/serverregistration/RegistrationInfo$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/serverregistration/RegistrationInfo;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/String;
    .locals 3

    .line 14
    invoke-virtual {p0}, Lexpo/modules/notifications/serverregistration/RegistrationInfo;->getNonBackedUpRegistrationInfoFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 15
    invoke-virtual {p0}, Lexpo/modules/notifications/serverregistration/RegistrationInfo;->getNonBackedUpRegistrationInfoFile()Ljava/io/File;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method

.method protected final getNonBackedUpRegistrationInfoFile()Ljava/io/File;
    .locals 3

    .line 12
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lexpo/modules/notifications/serverregistration/RegistrationInfo;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "expo_notifications_registration_info.txt"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final set(Ljava/lang/String;)V
    .locals 3

    .line 21
    invoke-virtual {p0}, Lexpo/modules/notifications/serverregistration/RegistrationInfo;->getNonBackedUpRegistrationInfoFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    if-eqz p1, :cond_0

    .line 23
    invoke-virtual {p0}, Lexpo/modules/notifications/serverregistration/RegistrationInfo;->getNonBackedUpRegistrationInfoFile()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

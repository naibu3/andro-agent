.class public final enum Lexpo/modules/camera/records/VideoQuality;
.super Ljava/lang/Enum;
.source "CameraRecords.kt"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/records/VideoQuality$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/camera/records/VideoQuality;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/camera/records/VideoQuality;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "VIDEO2160P",
        "VIDEO1080P",
        "VIDEO720P",
        "VIDEO480P",
        "VIDEO4X3",
        "mapToQuality",
        "Landroidx/camera/video/Quality;",
        "expo-camera_release"
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/camera/records/VideoQuality;

.field public static final enum VIDEO1080P:Lexpo/modules/camera/records/VideoQuality;

.field public static final enum VIDEO2160P:Lexpo/modules/camera/records/VideoQuality;

.field public static final enum VIDEO480P:Lexpo/modules/camera/records/VideoQuality;

.field public static final enum VIDEO4X3:Lexpo/modules/camera/records/VideoQuality;

.field public static final enum VIDEO720P:Lexpo/modules/camera/records/VideoQuality;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/camera/records/VideoQuality;
    .locals 5

    sget-object v0, Lexpo/modules/camera/records/VideoQuality;->VIDEO2160P:Lexpo/modules/camera/records/VideoQuality;

    sget-object v1, Lexpo/modules/camera/records/VideoQuality;->VIDEO1080P:Lexpo/modules/camera/records/VideoQuality;

    sget-object v2, Lexpo/modules/camera/records/VideoQuality;->VIDEO720P:Lexpo/modules/camera/records/VideoQuality;

    sget-object v3, Lexpo/modules/camera/records/VideoQuality;->VIDEO480P:Lexpo/modules/camera/records/VideoQuality;

    sget-object v4, Lexpo/modules/camera/records/VideoQuality;->VIDEO4X3:Lexpo/modules/camera/records/VideoQuality;

    filled-new-array {v0, v1, v2, v3, v4}, [Lexpo/modules/camera/records/VideoQuality;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 35
    new-instance v0, Lexpo/modules/camera/records/VideoQuality;

    const/4 v1, 0x0

    const-string v2, "2160p"

    const-string v3, "VIDEO2160P"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/VideoQuality;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/VideoQuality;->VIDEO2160P:Lexpo/modules/camera/records/VideoQuality;

    .line 36
    new-instance v0, Lexpo/modules/camera/records/VideoQuality;

    const/4 v1, 0x1

    const-string v2, "1080p"

    const-string v3, "VIDEO1080P"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/VideoQuality;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/VideoQuality;->VIDEO1080P:Lexpo/modules/camera/records/VideoQuality;

    .line 37
    new-instance v0, Lexpo/modules/camera/records/VideoQuality;

    const/4 v1, 0x2

    const-string v2, "720p"

    const-string v3, "VIDEO720P"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/VideoQuality;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/VideoQuality;->VIDEO720P:Lexpo/modules/camera/records/VideoQuality;

    .line 38
    new-instance v0, Lexpo/modules/camera/records/VideoQuality;

    const/4 v1, 0x3

    const-string v2, "480p"

    const-string v3, "VIDEO480P"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/VideoQuality;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/VideoQuality;->VIDEO480P:Lexpo/modules/camera/records/VideoQuality;

    .line 39
    new-instance v0, Lexpo/modules/camera/records/VideoQuality;

    const/4 v1, 0x4

    const-string v2, "4:3"

    const-string v3, "VIDEO4X3"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/VideoQuality;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/VideoQuality;->VIDEO4X3:Lexpo/modules/camera/records/VideoQuality;

    invoke-static {}, Lexpo/modules/camera/records/VideoQuality;->$values()[Lexpo/modules/camera/records/VideoQuality;

    move-result-object v0

    sput-object v0, Lexpo/modules/camera/records/VideoQuality;->$VALUES:[Lexpo/modules/camera/records/VideoQuality;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lexpo/modules/camera/records/VideoQuality;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lexpo/modules/camera/records/VideoQuality;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lexpo/modules/camera/records/VideoQuality;",
            ">;"
        }
    .end annotation

    sget-object v0, Lexpo/modules/camera/records/VideoQuality;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/camera/records/VideoQuality;
    .locals 1

    const-class v0, Lexpo/modules/camera/records/VideoQuality;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 48
    check-cast p0, Lexpo/modules/camera/records/VideoQuality;

    return-object p0
.end method

.method public static values()[Lexpo/modules/camera/records/VideoQuality;
    .locals 1

    sget-object v0, Lexpo/modules/camera/records/VideoQuality;->$VALUES:[Lexpo/modules/camera/records/VideoQuality;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 48
    check-cast v0, [Lexpo/modules/camera/records/VideoQuality;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lexpo/modules/camera/records/VideoQuality;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final mapToQuality()Landroidx/camera/video/Quality;
    .locals 2

    .line 41
    sget-object v0, Lexpo/modules/camera/records/VideoQuality$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lexpo/modules/camera/records/VideoQuality;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 46
    sget-object v0, Landroidx/camera/video/Quality;->LOWEST:Landroidx/camera/video/Quality;

    const-string v1, "LOWEST"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 41
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 45
    :cond_1
    sget-object v0, Landroidx/camera/video/Quality;->SD:Landroidx/camera/video/Quality;

    const-string v1, "SD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 44
    :cond_2
    sget-object v0, Landroidx/camera/video/Quality;->HD:Landroidx/camera/video/Quality;

    const-string v1, "HD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 43
    :cond_3
    sget-object v0, Landroidx/camera/video/Quality;->FHD:Landroidx/camera/video/Quality;

    const-string v1, "FHD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 42
    :cond_4
    sget-object v0, Landroidx/camera/video/Quality;->UHD:Landroidx/camera/video/Quality;

    const-string v1, "UHD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

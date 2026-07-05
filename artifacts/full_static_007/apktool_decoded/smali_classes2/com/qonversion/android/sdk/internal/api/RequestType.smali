.class public final enum Lcom/qonversion/android/sdk/internal/api/RequestType;
.super Ljava/lang/Enum;
.source "RequestType.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/internal/api/RequestType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000f\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/RequestType;",
        "",
        "(Ljava/lang/String;I)V",
        "Init",
        "RemoteConfig",
        "RemoteConfigList",
        "AttachUserToExperiment",
        "DetachUserFromExperiment",
        "Purchase",
        "Restore",
        "Attribution",
        "GetProperties",
        "EligibilityForProductIds",
        "Identify",
        "AttachUserToRemoteConfiguration",
        "DetachUserFromRemoteConfiguration",
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


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum AttachUserToExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum AttachUserToRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum Attribution:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum DetachUserFromExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum DetachUserFromRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum EligibilityForProductIds:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum GetProperties:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum Identify:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum Init:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum Purchase:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum RemoteConfig:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum RemoteConfigList:Lcom/qonversion/android/sdk/internal/api/RequestType;

.field public static final enum Restore:Lcom/qonversion/android/sdk/internal/api/RequestType;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/internal/api/RequestType;
    .locals 13

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Init:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfig:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v2, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfigList:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v3, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v4, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v5, Lcom/qonversion/android/sdk/internal/api/RequestType;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v6, Lcom/qonversion/android/sdk/internal/api/RequestType;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v7, Lcom/qonversion/android/sdk/internal/api/RequestType;->Attribution:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v8, Lcom/qonversion/android/sdk/internal/api/RequestType;->GetProperties:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v9, Lcom/qonversion/android/sdk/internal/api/RequestType;->EligibilityForProductIds:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v10, Lcom/qonversion/android/sdk/internal/api/RequestType;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v11, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    sget-object v12, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    filled-new-array/range {v0 .. v12}, [Lcom/qonversion/android/sdk/internal/api/RequestType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "Init"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Init:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "RemoteConfig"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfig:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "RemoteConfigList"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfigList:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "AttachUserToExperiment"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 8
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "DetachUserFromExperiment"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 9
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "Purchase"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 10
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "Restore"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "Attribution"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Attribution:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "GetProperties"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->GetProperties:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "EligibilityForProductIds"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->EligibilityForProductIds:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 14
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "Identify"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 15
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "AttachUserToRemoteConfiguration"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 16
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    const-string v1, "DetachUserFromRemoteConfiguration"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/api/RequestType;->$values()[Lcom/qonversion/android/sdk/internal/api/RequestType;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->$VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/internal/api/RequestType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/api/RequestType;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/api/RequestType;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/internal/api/RequestType;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->$VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/internal/api/RequestType;

    return-object v0
.end method

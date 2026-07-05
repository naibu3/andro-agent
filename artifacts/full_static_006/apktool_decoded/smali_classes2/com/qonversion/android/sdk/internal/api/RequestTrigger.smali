.class public final enum Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
.super Ljava/lang/Enum;
.source "RequestTrigger.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "",
        "key",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "Init",
        "Identify",
        "Products",
        "Purchase",
        "UserProperties",
        "Restore",
        "SyncHistoricalData",
        "SyncPurchases",
        "ActualizePermissions",
        "Logout",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum UserProperties:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 10

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v2, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v3, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v4, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->UserProperties:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v5, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v6, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v7, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v8, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v9, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    filled-new-array/range {v0 .. v9}, [Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "Init"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "Identify"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "Products"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 8
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "Purchase"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 9
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "UserProperties"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->UserProperties:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 10
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "Restore"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "SyncHistoricalData"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 12
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "SyncPurchases"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "ActualizePermissions"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 14
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const-string v1, "Logout"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$values()[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->key:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->key:Ljava/lang/String;

    return-object v0
.end method

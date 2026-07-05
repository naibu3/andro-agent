.class public final enum Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
.super Ljava/lang/Enum;
.source "QActionResultType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
        "",
        "type",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Unknown",
        "Url",
        "DeepLink",
        "Navigation",
        "Purchase",
        "Restore",
        "Close",
        "CloseAll",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final enum Close:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final enum CloseAll:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final Companion:Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;

.field public static final enum DeepLink:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final enum Navigation:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final enum Purchase:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final enum Restore:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

.field public static final enum Url:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .locals 8

    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Unknown:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Url:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    sget-object v2, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->DeepLink:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    sget-object v3, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Navigation:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    sget-object v4, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Purchase:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    sget-object v5, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Restore:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    sget-object v6, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Close:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    sget-object v7, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->CloseAll:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    filled-new-array/range {v0 .. v7}, [Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x0

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Unknown:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x1

    const-string v2, "url"

    const-string v3, "Url"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Url:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x2

    const-string v2, "deeplink"

    const-string v3, "DeepLink"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->DeepLink:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x3

    const-string v2, "navigate"

    const-string v3, "Navigation"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Navigation:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 8
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x4

    const-string v2, "purchase"

    const-string v3, "Purchase"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Purchase:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 9
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x5

    const-string v2, "restore"

    const-string v3, "Restore"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Restore:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 10
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x6

    const-string v2, "close"

    const-string v3, "Close"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Close:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 v1, 0x7

    const-string v2, "closeAllQScreens"

    const-string v3, "CloseAll"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->CloseAll:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-static {}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->$values()[Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->$VALUES:[Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Companion:Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;

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

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->type:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->$VALUES:[Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->type:Ljava/lang/String;

    return-object v0
.end method

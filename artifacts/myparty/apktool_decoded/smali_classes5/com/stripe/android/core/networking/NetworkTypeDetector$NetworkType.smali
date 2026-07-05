.class final enum Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;
.super Ljava/lang/Enum;
.source "NetworkTypeDetector.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/NetworkTypeDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "NetworkType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "WiFi",
        "Mobile2G",
        "Mobile3G",
        "Mobile4G",
        "Mobile5G",
        "Unknown",
        "stripe-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

.field public static final enum Mobile2G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

.field public static final enum Mobile3G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

.field public static final enum Mobile4G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

.field public static final enum Mobile5G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

.field public static final enum Unknown:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

.field public static final enum WiFi:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;
    .locals 6

    sget-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->WiFi:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    sget-object v1, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile2G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    sget-object v2, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile3G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    sget-object v3, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile4G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    sget-object v4, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile5G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    sget-object v5, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Unknown:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    filled-new-array/range {v0 .. v5}, [Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 73
    new-instance v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    const/4 v1, 0x0

    const-string v2, "Wi-Fi"

    const-string v3, "WiFi"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->WiFi:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    .line 74
    new-instance v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    const/4 v1, 0x1

    const-string v2, "2G"

    const-string v3, "Mobile2G"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile2G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    .line 75
    new-instance v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    const/4 v1, 0x2

    const-string v2, "3G"

    const-string v3, "Mobile3G"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile3G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    .line 76
    new-instance v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    const/4 v1, 0x3

    const-string v2, "4G"

    const-string v3, "Mobile4G"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile4G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    .line 77
    new-instance v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    const/4 v1, 0x4

    const-string v2, "5G"

    const-string v3, "Mobile5G"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile5G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    .line 78
    new-instance v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    const/4 v1, 0x5

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Unknown:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    invoke-static {}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->$values()[Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->$VALUES:[Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 72
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;
    .locals 1

    const-class v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 79
    check-cast p0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->$VALUES:[Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 79
    check-cast v0, [Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->value:Ljava/lang/String;

    return-object v0
.end method

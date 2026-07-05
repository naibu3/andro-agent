.class public final enum Lcom/qonversion/android/sdk/dto/QEnvironment;
.super Ljava/lang/Enum;
.source "QEnvironment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/QEnvironment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "",
        "(Ljava/lang/String;I)V",
        "Sandbox",
        "Production",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/QEnvironment;

.field public static final enum Production:Lcom/qonversion/android/sdk/dto/QEnvironment;

.field public static final enum Sandbox:Lcom/qonversion/android/sdk/dto/QEnvironment;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/QEnvironment;
    .locals 2

    sget-object v0, Lcom/qonversion/android/sdk/dto/QEnvironment;->Sandbox:Lcom/qonversion/android/sdk/dto/QEnvironment;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Production:Lcom/qonversion/android/sdk/dto/QEnvironment;

    filled-new-array {v0, v1}, [Lcom/qonversion/android/sdk/dto/QEnvironment;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/dto/QEnvironment;

    const-string v1, "Sandbox"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QEnvironment;->Sandbox:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 12
    new-instance v0, Lcom/qonversion/android/sdk/dto/QEnvironment;

    const-string v1, "Production"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QEnvironment;->Production:Lcom/qonversion/android/sdk/dto/QEnvironment;

    invoke-static {}, Lcom/qonversion/android/sdk/dto/QEnvironment;->$values()[Lcom/qonversion/android/sdk/dto/QEnvironment;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/QEnvironment;->$VALUES:[Lcom/qonversion/android/sdk/dto/QEnvironment;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/QEnvironment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/dto/QEnvironment;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/dto/QEnvironment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QEnvironment;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/QEnvironment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/QEnvironment;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/QEnvironment;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QEnvironment;->$VALUES:[Lcom/qonversion/android/sdk/dto/QEnvironment;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/QEnvironment;

    return-object v0
.end method

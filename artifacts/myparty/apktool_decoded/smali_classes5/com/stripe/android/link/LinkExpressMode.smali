.class public final enum Lcom/stripe/android/link/LinkExpressMode;
.super Ljava/lang/Enum;
.source "LinkExpressMode.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/link/LinkExpressMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkExpressMode;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "DISABLED",
        "ENABLED",
        "ENABLED_NO_WEB_FALLBACK",
        "paymentsheet_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/link/LinkExpressMode;

.field public static final enum DISABLED:Lcom/stripe/android/link/LinkExpressMode;

.field public static final enum ENABLED:Lcom/stripe/android/link/LinkExpressMode;

.field public static final enum ENABLED_NO_WEB_FALLBACK:Lcom/stripe/android/link/LinkExpressMode;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/link/LinkExpressMode;
    .locals 3

    sget-object v0, Lcom/stripe/android/link/LinkExpressMode;->DISABLED:Lcom/stripe/android/link/LinkExpressMode;

    sget-object v1, Lcom/stripe/android/link/LinkExpressMode;->ENABLED:Lcom/stripe/android/link/LinkExpressMode;

    sget-object v2, Lcom/stripe/android/link/LinkExpressMode;->ENABLED_NO_WEB_FALLBACK:Lcom/stripe/android/link/LinkExpressMode;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/link/LinkExpressMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Lcom/stripe/android/link/LinkExpressMode;

    const-string v1, "DISABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/LinkExpressMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/LinkExpressMode;->DISABLED:Lcom/stripe/android/link/LinkExpressMode;

    .line 15
    new-instance v0, Lcom/stripe/android/link/LinkExpressMode;

    const-string v1, "ENABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/LinkExpressMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/LinkExpressMode;->ENABLED:Lcom/stripe/android/link/LinkExpressMode;

    .line 20
    new-instance v0, Lcom/stripe/android/link/LinkExpressMode;

    const-string v1, "ENABLED_NO_WEB_FALLBACK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/LinkExpressMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/link/LinkExpressMode;->ENABLED_NO_WEB_FALLBACK:Lcom/stripe/android/link/LinkExpressMode;

    invoke-static {}, Lcom/stripe/android/link/LinkExpressMode;->$values()[Lcom/stripe/android/link/LinkExpressMode;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/LinkExpressMode;->$VALUES:[Lcom/stripe/android/link/LinkExpressMode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/LinkExpressMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/link/LinkExpressMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/link/LinkExpressMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/link/LinkExpressMode;
    .locals 1

    const-class v0, Lcom/stripe/android/link/LinkExpressMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 21
    check-cast p0, Lcom/stripe/android/link/LinkExpressMode;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/link/LinkExpressMode;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/LinkExpressMode;->$VALUES:[Lcom/stripe/android/link/LinkExpressMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 21
    check-cast v0, [Lcom/stripe/android/link/LinkExpressMode;

    return-object v0
.end method

.class public final enum Lcom/stripe/android/core/utils/DurationProvider$Key;
.super Ljava/lang/Enum;
.source "DurationProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/utils/DurationProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Key"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/core/utils/DurationProvider$Key;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/core/utils/DurationProvider$Key;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Loading",
        "Checkout",
        "LinkSignup",
        "ConfirmButtonClicked",
        "CardScan",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/core/utils/DurationProvider$Key;

.field public static final enum CardScan:Lcom/stripe/android/core/utils/DurationProvider$Key;

.field public static final enum Checkout:Lcom/stripe/android/core/utils/DurationProvider$Key;

.field public static final enum ConfirmButtonClicked:Lcom/stripe/android/core/utils/DurationProvider$Key;

.field public static final enum LinkSignup:Lcom/stripe/android/core/utils/DurationProvider$Key;

.field public static final enum Loading:Lcom/stripe/android/core/utils/DurationProvider$Key;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/core/utils/DurationProvider$Key;
    .locals 5

    sget-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->Loading:Lcom/stripe/android/core/utils/DurationProvider$Key;

    sget-object v1, Lcom/stripe/android/core/utils/DurationProvider$Key;->Checkout:Lcom/stripe/android/core/utils/DurationProvider$Key;

    sget-object v2, Lcom/stripe/android/core/utils/DurationProvider$Key;->LinkSignup:Lcom/stripe/android/core/utils/DurationProvider$Key;

    sget-object v3, Lcom/stripe/android/core/utils/DurationProvider$Key;->ConfirmButtonClicked:Lcom/stripe/android/core/utils/DurationProvider$Key;

    sget-object v4, Lcom/stripe/android/core/utils/DurationProvider$Key;->CardScan:Lcom/stripe/android/core/utils/DurationProvider$Key;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/core/utils/DurationProvider$Key;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 15
    new-instance v0, Lcom/stripe/android/core/utils/DurationProvider$Key;

    const-string v1, "Loading"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/utils/DurationProvider$Key;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->Loading:Lcom/stripe/android/core/utils/DurationProvider$Key;

    .line 16
    new-instance v0, Lcom/stripe/android/core/utils/DurationProvider$Key;

    const-string v1, "Checkout"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/utils/DurationProvider$Key;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->Checkout:Lcom/stripe/android/core/utils/DurationProvider$Key;

    .line 17
    new-instance v0, Lcom/stripe/android/core/utils/DurationProvider$Key;

    const-string v1, "LinkSignup"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/utils/DurationProvider$Key;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->LinkSignup:Lcom/stripe/android/core/utils/DurationProvider$Key;

    .line 18
    new-instance v0, Lcom/stripe/android/core/utils/DurationProvider$Key;

    const-string v1, "ConfirmButtonClicked"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/utils/DurationProvider$Key;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->ConfirmButtonClicked:Lcom/stripe/android/core/utils/DurationProvider$Key;

    .line 19
    new-instance v0, Lcom/stripe/android/core/utils/DurationProvider$Key;

    const-string v1, "CardScan"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/utils/DurationProvider$Key;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->CardScan:Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-static {}, Lcom/stripe/android/core/utils/DurationProvider$Key;->$values()[Lcom/stripe/android/core/utils/DurationProvider$Key;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->$VALUES:[Lcom/stripe/android/core/utils/DurationProvider$Key;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/core/utils/DurationProvider$Key;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/core/utils/DurationProvider$Key;
    .locals 1

    const-class v0, Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 20
    check-cast p0, Lcom/stripe/android/core/utils/DurationProvider$Key;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/core/utils/DurationProvider$Key;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/utils/DurationProvider$Key;->$VALUES:[Lcom/stripe/android/core/utils/DurationProvider$Key;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 20
    check-cast v0, [Lcom/stripe/android/core/utils/DurationProvider$Key;

    return-object v0
.end method

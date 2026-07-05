.class public final enum Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
.super Ljava/lang/Enum;
.source "QSubscriptionPeriod.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Unit"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;",
        "",
        "(Ljava/lang/String;I)V",
        "Day",
        "Week",
        "Month",
        "Year",
        "Unknown",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

.field public static final enum Day:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

.field public static final enum Month:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

.field public static final enum Week:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

.field public static final enum Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
    .locals 5

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Day:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Week:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Month:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    sget-object v4, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 49
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    const-string v1, "Day"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Day:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 50
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    const-string v1, "Week"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Week:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 51
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    const-string v1, "Month"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Month:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 52
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    const-string v1, "Year"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 53
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    const-string v1, "Unknown"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-static {}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->$values()[Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->$VALUES:[Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->$VALUES:[Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    return-object v0
.end method

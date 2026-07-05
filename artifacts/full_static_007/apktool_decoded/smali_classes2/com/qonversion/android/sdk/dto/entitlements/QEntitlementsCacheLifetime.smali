.class public final enum Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
.super Ljava/lang/Enum;
.source "QEntitlementsCacheLifetime.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "",
        "days",
        "",
        "(Ljava/lang/String;II)V",
        "getDays",
        "()I",
        "Week",
        "TwoWeeks",
        "Month",
        "TwoMonths",
        "ThreeMonths",
        "SixMonths",
        "Year",
        "Unlimited",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum SixMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum ThreeMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum TwoMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum TwoWeeks:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Unlimited:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Week:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;


# instance fields
.field private final days:I


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 8

    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Week:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoWeeks:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v2, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v3, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v4, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->ThreeMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v5, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->SixMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v6, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v7, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Unlimited:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    filled-new-array/range {v0 .. v7}, [Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const-string v1, "Week"

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Week:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v1, 0x1

    const/16 v2, 0xe

    const-string v4, "TwoWeeks"

    invoke-direct {v0, v4, v1, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoWeeks:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v1, 0x2

    const/16 v2, 0x1e

    const-string v4, "Month"

    invoke-direct {v0, v4, v1, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v1, 0x3

    const/16 v2, 0x3c

    const-string v4, "TwoMonths"

    invoke-direct {v0, v4, v1, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 8
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v1, 0x4

    const/16 v2, 0x5a

    const-string v4, "ThreeMonths"

    invoke-direct {v0, v4, v1, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->ThreeMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 9
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v1, 0x5

    const/16 v2, 0xb4

    const-string v4, "SixMonths"

    invoke-direct {v0, v4, v1, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->SixMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 10
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v1, 0x6

    const/16 v2, 0x16d

    const-string v4, "Year"

    invoke-direct {v0, v4, v1, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const-string v1, "Unlimited"

    const v2, 0x7fffffff

    invoke-direct {v0, v1, v3, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Unlimited:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    invoke-static {}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$values()[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->days:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-object v0
.end method


# virtual methods
.method public final getDays()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->days:I

    return v0
.end method

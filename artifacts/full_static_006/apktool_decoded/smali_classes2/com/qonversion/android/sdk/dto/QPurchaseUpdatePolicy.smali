.class public final enum Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
.super Ljava/lang/Enum;
.source "QPurchaseUpdatePolicy.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "",
        "(Ljava/lang/String;I)V",
        "toReplacementMode",
        "",
        "toReplacementMode$sdk_release",
        "ChargeFullPrice",
        "ChargeProratedPrice",
        "WithTimeProration",
        "Deferred",
        "WithoutProration",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum ChargeFullPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum ChargeProratedPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum Deferred:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum WithTimeProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum WithoutProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 6

    sget-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeFullPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeProratedPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    sget-object v2, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithTimeProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    sget-object v3, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Deferred:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    sget-object v4, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithoutProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    sget-object v5, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Unknown:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    filled-new-array/range {v0 .. v5}, [Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 17
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const-string v1, "ChargeFullPrice"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeFullPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 22
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const-string v1, "ChargeProratedPrice"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeProratedPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 28
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const-string v1, "WithTimeProration"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithTimeProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 34
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const-string v1, "Deferred"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Deferred:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 40
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const-string v1, "WithoutProration"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithoutProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 45
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const-string v1, "Unknown"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Unknown:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    invoke-static {}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$values()[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$VALUES:[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$VALUES:[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object v0
.end method


# virtual methods
.method public final toReplacementMode$sdk_release()I
    .locals 4

    .line 48
    sget-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x6

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    move v1, v3

    :cond_3
    :goto_0
    return v1
.end method

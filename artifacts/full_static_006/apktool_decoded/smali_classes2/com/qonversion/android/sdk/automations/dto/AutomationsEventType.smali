.class public final enum Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
.super Ljava/lang/Enum;
.source "AutomationsEventType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0016\u0008\u0086\u0081\u0002\u0018\u0000 \u00182\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;",
        "",
        "type",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Unknown",
        "TrialStarted",
        "TrialConverted",
        "TrialCanceled",
        "TrialBillingRetry",
        "SubscriptionStarted",
        "SubscriptionRenewed",
        "SubscriptionRefunded",
        "SubscriptionCanceled",
        "SubscriptionBillingRetry",
        "InAppPurchase",
        "SubscriptionUpgraded",
        "TrialStillActive",
        "TrialExpired",
        "SubscriptionExpired",
        "SubscriptionDowngraded",
        "SubscriptionProductChanged",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final Companion:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;

.field public static final enum InAppPurchase:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionBillingRetry:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionCanceled:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionDowngraded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionExpired:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionProductChanged:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionRefunded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionRenewed:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionStarted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum SubscriptionUpgraded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum TrialBillingRetry:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum TrialCanceled:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum TrialConverted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum TrialExpired:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum TrialStarted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum TrialStillActive:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
    .locals 17

    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->Unknown:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialStarted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v2, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialConverted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v3, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialCanceled:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v4, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialBillingRetry:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v5, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionStarted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v6, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionRenewed:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v7, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionRefunded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v8, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionCanceled:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v9, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionBillingRetry:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v10, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->InAppPurchase:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v11, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionUpgraded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v12, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialStillActive:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v13, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialExpired:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v14, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionExpired:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v15, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionDowngraded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    sget-object v16, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionProductChanged:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    filled-new-array/range {v0 .. v16}, [Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x0

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->Unknown:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x1

    const-string v2, "trial_started"

    const-string v3, "TrialStarted"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialStarted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x2

    const-string v2, "trial_converted"

    const-string v3, "TrialConverted"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialConverted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x3

    const-string v2, "trial_canceled"

    const-string v3, "TrialCanceled"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialCanceled:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 8
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x4

    const-string v2, "trial_billing_retry_entered"

    const-string v3, "TrialBillingRetry"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialBillingRetry:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 9
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x5

    const-string v2, "subscription_started"

    const-string v3, "SubscriptionStarted"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionStarted:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 10
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x6

    const-string v2, "subscription_renewed"

    const-string v3, "SubscriptionRenewed"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionRenewed:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/4 v1, 0x7

    const-string v2, "subscription_refunded"

    const-string v3, "SubscriptionRefunded"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionRefunded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 12
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0x8

    const-string v2, "subscription_canceled"

    const-string v3, "SubscriptionCanceled"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionCanceled:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0x9

    const-string v2, "subscription_billing_retry_entered"

    const-string v3, "SubscriptionBillingRetry"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionBillingRetry:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 14
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0xa

    const-string v2, "in_app_purchase"

    const-string v3, "InAppPurchase"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->InAppPurchase:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 15
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0xb

    const-string v2, "subscription_upgraded"

    const-string v3, "SubscriptionUpgraded"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionUpgraded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 16
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0xc

    const-string v2, "trial_still_active"

    const-string v3, "TrialStillActive"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialStillActive:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 17
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0xd

    const-string v2, "trial_expired"

    const-string v3, "TrialExpired"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->TrialExpired:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 18
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0xe

    const-string v2, "subscription_expired"

    const-string v3, "SubscriptionExpired"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionExpired:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 19
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0xf

    const-string v2, "subscription_downgraded"

    const-string v3, "SubscriptionDowngraded"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionDowngraded:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 20
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    const/16 v1, 0x10

    const-string v2, "subscription_product_changed"

    const-string v3, "SubscriptionProductChanged"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->SubscriptionProductChanged:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    invoke-static {}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->$values()[Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->$VALUES:[Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->Companion:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;

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

    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->type:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->$VALUES:[Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->type:Ljava/lang/String;

    return-object v0
.end method

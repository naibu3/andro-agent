.class public final enum Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;
.super Ljava/lang/Enum;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TimeUnit"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "HOUR",
        "DAY",
        "BUSINESS_DAY",
        "WEEK",
        "MONTH",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

.field public static final enum BUSINESS_DAY:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

.field public static final enum DAY:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

.field public static final enum HOUR:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

.field public static final enum MONTH:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

.field public static final enum WEEK:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;
    .locals 5

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->HOUR:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->DAY:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->BUSINESS_DAY:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->WEEK:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->MONTH:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 3312
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    const-string v1, "HOUR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->HOUR:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    .line 3313
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    const-string v1, "DAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->DAY:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    .line 3314
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    const-string v1, "BUSINESS_DAY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->BUSINESS_DAY:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    .line 3315
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    const-string v1, "WEEK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->WEEK:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    .line 3316
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    const-string v1, "MONTH"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->MONTH:Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->$values()[Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3311
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 3317
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 3317
    check-cast v0, [Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    return-object v0
.end method

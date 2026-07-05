.class public final Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;
.super Ljava/lang/Object;
.source "PaymentSheetNextActionHandlers.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u001c\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;",
        "",
        "<init>",
        "()V",
        "get",
        "",
        "Ljava/lang/Class;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;",
        "Lcom/stripe/android/model/StripeIntent;",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 15
    new-array v0, v0, [Lkotlin/Pair;

    const-class v1, Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;

    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingNextActionHandler;

    invoke-direct {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingNextActionHandler;-><init>()V

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 16
    const-class v1, Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;

    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingNextActionHandler;

    invoke-direct {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingNextActionHandler;-><init>()V

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 14
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

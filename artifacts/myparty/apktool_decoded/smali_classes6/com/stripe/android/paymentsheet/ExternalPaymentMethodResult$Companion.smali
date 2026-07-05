.class public final Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;
.super Ljava/lang/Object;
.source "ExternalPaymentMethodResultHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0007J\u0008\u0010\u0006\u001a\u00020\u0005H\u0007J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;",
        "",
        "<init>",
        "()V",
        "completed",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;",
        "canceled",
        "failed",
        "displayMessage",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;-><init>()V

    return-void
.end method

.method public static synthetic failed$default(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 109
    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;->failed(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final canceled()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 100
    sget-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;

    check-cast v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    return-object v0
.end method

.method public final completed()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 92
    sget-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Completed;->INSTANCE:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Completed;

    check-cast v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    return-object v0
.end method

.method public final failed()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;->failed$default(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    move-result-object v0

    return-object v0
.end method

.method public final failed(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 112
    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    return-object v0
.end method

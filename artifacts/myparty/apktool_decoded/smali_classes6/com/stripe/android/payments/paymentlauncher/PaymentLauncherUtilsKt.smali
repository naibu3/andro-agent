.class public final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt;
.super Ljava/lang/Object;
.source "PaymentLauncherUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001aF\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0004\u0012\u00020\t0\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0004\u0012\u00020\t0\u0004H\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "toInternalResultCallback",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;",
        "toInternalPaymentResultCallback",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;",
        "Lkotlin/ParameterName;",
        "name",
        "result",
        "",
        "callback",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "payments-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$2mK1_3th_hrWUKEm6vC_oLkjG_0(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt;->toInternalResultCallback$lambda$0(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$a-gI_suPhWR3KLdbD2ihumv6WyQ(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt;->toInternalPaymentResultCallback$lambda$1(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final toInternalPaymentResultCallback(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method private static final toInternalPaymentResultCallback$lambda$1(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)Lkotlin/Unit;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Completed;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 25
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 26
    :cond_1
    instance-of p1, p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Canceled;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 23
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final toInternalResultCallback(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V

    return-object v0
.end method

.method private static final toInternalResultCallback$lambda$0(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Completed;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    invoke-interface {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void

    .line 12
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    invoke-interface {p0, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void

    .line 13
    :cond_1
    instance-of p1, p1, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Canceled;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    invoke-interface {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void

    .line 10
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

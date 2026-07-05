.class public final Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt;
.super Ljava/lang/Object;
.source "IntentConfigurationKtx.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\u000c\u0010\u0006\u001a\u00020\u0007*\u00020\u0008H\u0002\u001a\u000c\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "toDeferredIntentParams",
        "Lcom/stripe/android/model/DeferredIntentParams;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "toDeferredIntentMode",
        "Lcom/stripe/android/model/DeferredIntentParams$Mode;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;",
        "toIntentUsage",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;",
        "toIntentCaptureMethod",
        "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;",
        "paymentsheet_release"
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
.method private static final toDeferredIntentMode(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;)Lcom/stripe/android/model/DeferredIntentParams$Mode;
    .locals 8

    .line 21
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    if-eqz v0, :cond_2

    .line 22
    new-instance v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    .line 27
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    .line 23
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->getAmount()J

    move-result-wide v2

    .line 24
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->getCurrency()Ljava/lang/String;

    move-result-object v4

    .line 25
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->getSetupFutureUse$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    move-result-object v0

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt;->toIntentUsage(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v5

    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->getCaptureMethod$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    move-result-object v6

    invoke-static {v6}, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt;->toIntentCaptureMethod(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    move-result-object v6

    .line 27
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->getPaymentMethodOptions$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentmethodoptions/setupfutureusage/PaymentMethodOptionsSetupFutureUsageUtilKt;->toJsonObjectString(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;)Ljava/lang/String;

    move-result-object v5

    :cond_1
    move-object v7, v5

    move-object v5, v0

    .line 22
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;-><init>(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;)V

    check-cast v1, Lcom/stripe/android/model/DeferredIntentParams$Mode;

    return-object v1

    .line 30
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    if-eqz v0, :cond_3

    .line 31
    new-instance v0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    .line 33
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    .line 32
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;->getCurrency()Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;->getSetupFutureUse$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt;->toIntentUsage(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p0

    .line 31
    invoke-direct {v0, v1, p0}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;-><init>(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;)V

    check-cast v0, Lcom/stripe/android/model/DeferredIntentParams$Mode;

    return-object v0

    .line 20
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final toDeferredIntentParams(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)Lcom/stripe/android/model/DeferredIntentParams;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getMode()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt;->toDeferredIntentMode(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;)Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getOnBehalfOf()Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getPaymentMethodConfigurationId()Ljava/lang/String;

    move-result-object p0

    .line 10
    new-instance v3, Lcom/stripe/android/model/DeferredIntentParams;

    invoke-direct {v3, v0, v1, p0, v2}, Lcom/stripe/android/model/DeferredIntentParams;-><init>(Lcom/stripe/android/model/DeferredIntentParams$Mode;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method private static final toIntentCaptureMethod(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)Lcom/stripe/android/model/PaymentIntent$CaptureMethod;
    .locals 1

    .line 50
    sget-object v0, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 53
    sget-object p0, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->Manual:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    return-object p0

    .line 50
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 52
    :cond_1
    sget-object p0, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->AutomaticAsync:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    return-object p0

    .line 51
    :cond_2
    sget-object p0, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->Automatic:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    return-object p0
.end method

.method private static final toIntentUsage(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    .line 40
    sget-object v0, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 43
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 44
    const-string v0, "PaymentSheet.IntentConfiguration setupFutureUse cannot be set to None"

    .line 43
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 42
    :cond_1
    sget-object p0, Lcom/stripe/android/model/StripeIntent$Usage;->OffSession:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object p0

    .line 41
    :cond_2
    sget-object p0, Lcom/stripe/android/model/StripeIntent$Usage;->OnSession:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object p0
.end method

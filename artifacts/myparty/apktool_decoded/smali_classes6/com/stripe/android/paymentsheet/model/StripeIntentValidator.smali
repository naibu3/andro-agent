.class public final Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;
.super Ljava/lang/Object;
.source "StripeIntentValidator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
        "",
        "<init>",
        "()V",
        "requireValid",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;->INSTANCE:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final requireValid(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;
    .locals 4

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentIntent;->getConfirmationMethod()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;->Automatic:Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    if-eq v2, v3, :cond_0

    .line 27
    new-instance v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$InvalidConfirmationMethod;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentIntent;->getConfirmationMethod()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$InvalidConfirmationMethod;-><init>(Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 29
    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/PaymentIntent;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/StripeIntentValidatorKt;->access$isInTerminalState(Lcom/stripe/android/model/PaymentIntent;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 30
    new-instance v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$PaymentIntentInTerminalState;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$PaymentIntentInTerminalState;-><init>(Lcom/stripe/android/model/StripeIntent$Status;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_3

    .line 32
    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 33
    :cond_2
    sget-object v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$MissingAmountOrCurrency;->INSTANCE:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$MissingAmountOrCurrency;

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    goto :goto_0

    .line 35
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/model/SetupIntent;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/SetupIntent;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/model/StripeIntentValidatorKt;->access$isInTerminalState(Lcom/stripe/android/model/SetupIntent;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 36
    new-instance v1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$SetupIntentInTerminalState;

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$SetupIntentInTerminalState;-><init>(Lcom/stripe/android/model/StripeIntent$Status;)V

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_5

    return-object p1

    .line 45
    :cond_5
    throw v0
.end method

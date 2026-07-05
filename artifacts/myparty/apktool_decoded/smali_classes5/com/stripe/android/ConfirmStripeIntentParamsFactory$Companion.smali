.class public final Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;
.super Ljava/lang/Object;
.source "ConfirmStripeIntentParamsFactory.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ConfirmStripeIntentParamsFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;",
        "",
        "<init>",
        "()V",
        "createFactory",
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "clientSecret",
        "",
        "intent",
        "Lcom/stripe/android/model/StripeIntent;",
        "shipping",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
        "payments-core_release"
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

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFactory(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/ConfirmStripeIntentParamsFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            ")",
            "Lcom/stripe/android/ConfirmStripeIntentParamsFactory<",
            "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
            ">;"
        }
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    instance-of v0, p2, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->Companion:Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    new-instance v0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;

    check-cast p2, Lcom/stripe/android/model/PaymentIntent;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;-><init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V

    check-cast v0, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;

    return-object v0

    .line 60
    :cond_0
    instance-of p3, p2, Lcom/stripe/android/model/SetupIntent;

    if-eqz p3, :cond_1

    sget-object p3, Lcom/stripe/android/model/SetupIntent$ClientSecret;->Companion:Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;

    invoke-virtual {p3, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 61
    new-instance p3, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;

    check-cast p2, Lcom/stripe/android/model/SetupIntent;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;-><init>(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent;)V

    check-cast p3, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;

    return-object p3

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.class public final Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Companion;
.super Ljava/lang/Object;
.source "InternalCustomPaymentMethodResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0000\u00a2\u0006\u0002\u0008\nJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Companion;",
        "",
        "<init>",
        "()V",
        "EXTRA_ARGS",
        "",
        "fromIntent",
        "Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;",
        "intent",
        "Landroid/content/Intent;",
        "fromIntent$paymentsheet_release",
        "fromCustomPaymentMethodResult",
        "result",
        "Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;",
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

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromCustomPaymentMethodResult(Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;)Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    instance-of v0, p1, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Completed;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Completed;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Completed;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    return-object p1

    .line 43
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Canceled;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Canceled;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    return-object p1

    .line 44
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Failed;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Failed;

    .line 45
    new-instance v1, Lcom/stripe/android/core/exception/LocalStripeException;

    .line 46
    check-cast p1, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Failed;->getDisplayMessage()Ljava/lang/String;

    move-result-object p1

    .line 47
    const-string v2, "customPaymentMethodFailure"

    .line 45
    invoke-direct {v1, p1, v2}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    .line 44
    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    return-object v0

    .line 41
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final fromIntent$paymentsheet_release(Landroid/content/Intent;)Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;
    .locals 2

    if-eqz p1, :cond_1

    .line 31
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 34
    const-string v0, "CUSTOM_PAYMENT_METHOD_RESULT"

    .line 35
    const-class v1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    .line 32
    invoke-static {p1, v0, v1}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    .line 37
    :cond_1
    :goto_0
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Failed;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to find custom payment method result!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {p1, v0}, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    return-object p1
.end method

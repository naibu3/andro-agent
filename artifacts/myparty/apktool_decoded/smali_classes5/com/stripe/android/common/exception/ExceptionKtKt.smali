.class public final Lcom/stripe/android/common/exception/ExceptionKtKt;
.super Ljava/lang/Object;
.source "ExceptionKt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0005*\u00020\u0002H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "stripeErrorMessage",
        "",
        "",
        "context",
        "Landroid/content/Context;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
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
.method public static final stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    instance-of v0, p0, Lcom/stripe/android/core/exception/APIConnectionException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/core/exception/APIConnectionException;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 28
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_network_error_message:I

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 30
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/core/exception/LocalStripeException;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/core/exception/LocalStripeException;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/core/exception/LocalStripeException;->getDisplayMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 31
    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 33
    :cond_3
    instance-of v0, p0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_4

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/core/exception/StripeException;

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 34
    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 36
    :cond_5
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_something_went_wrong:I

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static final stripeErrorMessage(Ljava/lang/Throwable;Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    instance-of v0, p0, Lcom/stripe/android/core/exception/APIConnectionException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/core/exception/APIConnectionException;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "getString(...)"

    if-eqz v0, :cond_1

    .line 14
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_network_error_message:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/core/exception/LocalStripeException;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/core/exception/LocalStripeException;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/core/exception/LocalStripeException;->getDisplayMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    .line 19
    :cond_3
    instance-of v0, p0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_4

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/core/exception/StripeException;

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    return-object p0

    .line 22
    :cond_5
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_something_went_wrong:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

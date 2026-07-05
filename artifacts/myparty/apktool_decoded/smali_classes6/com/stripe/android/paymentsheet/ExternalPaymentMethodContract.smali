.class public final Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "ExternalPaymentMethodContract.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "<init>",
        "(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V",
        "getErrorReporter",
        "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 17
    const-class v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;

    .line 15
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p1

    .line 19
    const-string v0, "external_payment_method_type"

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 21
    const-string v0, "payment_element_identifier"

    .line 22
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;->getPaymentElementCallbackIdentifier()Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 24
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    const-string v0, "external_payment_method_billing_details"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 12
    check-cast p2, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object v0
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/payments/paymentlauncher/PaymentResult;
    .locals 7

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 42
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 43
    sget-object p2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 44
    const-string p2, "result_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 42
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 46
    new-instance p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    .line 47
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 48
    const-string v0, "Invalid result code returned by external payment method activity"

    .line 47
    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    .line 46
    invoke-direct {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-object p1

    .line 32
    :cond_0
    new-instance p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    .line 33
    new-instance v0, Lcom/stripe/android/core/exception/LocalStripeException;

    if-eqz p2, :cond_1

    .line 35
    const-string v1, "external_payment_method_error_message"

    .line 34
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 37
    :goto_0
    const-string v1, "externalPaymentMethodFailure"

    .line 33
    invoke-direct {v0, p2, v1}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 32
    invoke-direct {p1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-object p1

    .line 30
    :cond_2
    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-object p1

    .line 29
    :cond_3
    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    move-result-object p1

    return-object p1
.end method

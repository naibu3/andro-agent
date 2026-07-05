.class public final Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "CustomPaymentMethodContract.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;",
        "Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;",
        "Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;",
        "<init>",
        "()V",
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
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 12
    const-class v1, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;

    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p1

    .line 15
    const-string v0, "payment_element_identifier"

    .line 16
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;->getPaymentElementCallbackIdentifier()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 18
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;->getType()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    const-string v1, "extra_custom_method_type"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    .line 19
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    const-string v0, "extra_payment_method_billing_details"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 7
    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;
    .locals 0

    .line 23
    sget-object p1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Companion;->fromIntent$paymentsheet_release(Landroid/content/Intent;)Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    move-result-object p1

    return-object p1
.end method

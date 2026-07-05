.class public final Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "ExternalPaymentMethodProxyActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExternalPaymentMethodProxyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalPaymentMethodProxyActivity.kt\ncom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0015J\u0008\u0010\r\u001a\u00020\u0007H\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "hasConfirmStarted",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "onResume",
        "onSaveInstanceState",
        "outState",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity$Companion;

.field public static final EXTRA_BILLING_DETAILS:Ljava/lang/String; = "external_payment_method_billing_details"

.field public static final EXTRA_EXTERNAL_PAYMENT_METHOD_TYPE:Ljava/lang/String; = "external_payment_method_type"

.field public static final EXTRA_PAYMENT_ELEMENT_IDENTIFIER:Ljava/lang/String; = "payment_element_identifier"

.field public static final HAS_CONFIRM_STARTED_KEY:Ljava/lang/String; = "has_confirm_started"


# instance fields
.field private hasConfirmStarted:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 23
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 24
    const-string v0, "has_confirm_started"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->hasConfirmStarted:Z

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "external_payment_method_type"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 27
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "payment_element_identifier"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "external_payment_method_billing_details"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    if-eqz p1, :cond_2

    .line 32
    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->hasConfirmStarted:Z

    if-nez v2, :cond_2

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    .line 33
    iput-boolean v2, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->hasConfirmStarted:Z

    .line 34
    sget-object v2, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    invoke-virtual {v2, v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->get(Ljava/lang/String;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 35
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->getExternalPaymentMethodConfirmHandler()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    move-result-object v0

    if-eqz v0, :cond_2

    if-nez v1, :cond_1

    .line 38
    new-instance v2, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    .line 36
    :cond_1
    invoke-interface {v0, p1, v1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;->confirmExternalPaymentMethod(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    :cond_2
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 46
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->setIntent(Landroid/content/Intent;)V

    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 50
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 52
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "external_payment_method_type"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "external_payment_method_result"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    .line 61
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->finish()V

    return-void

    :cond_0
    if-eqz v1, :cond_4

    .line 67
    instance-of v0, v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Completed;

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->setResult(I)V

    goto :goto_0

    .line 68
    :cond_1
    instance-of v0, v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->setResult(I)V

    goto :goto_0

    .line 69
    :cond_2
    instance-of v0, v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;

    if-eqz v0, :cond_3

    .line 71
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    check-cast v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->getDisplayMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "external_payment_method_error_message"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "putExtra(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 72
    invoke-virtual {p0, v1, v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->setResult(ILandroid/content/Intent;)V

    .line 75
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->finish()V

    return-void

    .line 66
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    const-string v0, "has_confirm_started"

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;->hasConfirmStarted:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 82
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.class public final Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "CustomPaymentMethodProxyActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomPaymentMethodProxyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomPaymentMethodProxyActivity.kt\ncom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0015J\u0008\u0010\r\u001a\u00020\u0007H\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;",
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

.field public static final Companion:Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity$Companion;

.field public static final EXTRA_BILLING_DETAILS:Ljava/lang/String; = "extra_payment_method_billing_details"

.field public static final EXTRA_CUSTOM_PAYMENT_METHOD_TYPE:Ljava/lang/String; = "extra_custom_method_type"

.field public static final EXTRA_PAYMENT_ELEMENT_IDENTIFIER:Ljava/lang/String; = "payment_element_identifier"

.field public static final HAS_CONFIRM_STARTED_KEY:Ljava/lang/String; = "has_confirm_started"


# instance fields
.field private hasConfirmStarted:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->Companion:Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 31
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 32
    const-string v0, "has_confirm_started"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->hasConfirmStarted:Z

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 39
    const-string v1, "extra_custom_method_type"

    .line 40
    const-class v2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    .line 37
    invoke-static {p1, v1, v2}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    goto :goto_0

    :cond_1
    move-object v1, v0

    .line 43
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "payment_element_identifier"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_2

    .line 48
    const-string v0, "extra_payment_method_billing_details"

    .line 49
    const-class v3, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    .line 46
    invoke-static {p1, v0, v3}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    :cond_2
    if-eqz v1, :cond_4

    .line 53
    iget-boolean p1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->hasConfirmStarted:Z

    if-nez p1, :cond_4

    if-eqz v2, :cond_4

    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->hasConfirmStarted:Z

    .line 55
    sget-object p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    invoke-virtual {p1, v2}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->get(Ljava/lang/String;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 56
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->getConfirmCustomPaymentMethodCallback()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    move-result-object p1

    if-eqz p1, :cond_4

    if-nez v0, :cond_3

    .line 57
    new-instance v2, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    :cond_3
    invoke-interface {p1, v1, v0}, Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;->onConfirmCustomPaymentMethod(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    :cond_4
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 64
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->setIntent(Landroid/content/Intent;)V

    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 68
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 70
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;

    .line 73
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->finish()V

    return-void

    .line 79
    :cond_0
    const-string v1, "extra_custom_method_type"

    .line 80
    const-class v2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    .line 77
    invoke-static {v0, v1, v2}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    .line 85
    const-string v2, "custom_payment_method_result"

    .line 86
    const-class v3, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    .line 83
    invoke-static {v0, v2, v3}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    .line 92
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->finish()V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    .line 97
    sget-object v1, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Companion;

    invoke-virtual {v1, v0}, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult$Companion;->fromCustomPaymentMethodResult(Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;)Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    .line 101
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    .line 99
    invoke-virtual {p0, v1, v0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->setResult(ILandroid/content/Intent;)V

    .line 104
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->finish()V

    :cond_2
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    const-string v0, "has_confirm_started"

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;->hasConfirmStarted:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 111
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.class public final Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;
.super Ljava/lang/Object;
.source "StripePaymentLauncherAssistedFactory_Impl.java"

# interfaces
.implements Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;


# instance fields
.field private final delegateFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;


# direct methods
.method constructor <init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->delegateFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    return-void
.end method

.method public static create(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)Ljavax/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;",
            ")",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;-><init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method

.method public static createFactoryProvider(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)Ldagger/internal/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;",
            ")",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;-><init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;ZLandroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Z",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;)",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->delegateFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object v3, p5

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;->get(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/Integer;Z)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;

    return-void
.end method


# virtual methods
.method public final onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;

    invoke-static {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt;->$r8$lambda$2mK1_3th_hrWUKEm6vC_oLkjG_0(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V

    return-void
.end method

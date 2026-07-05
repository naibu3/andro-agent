.class public final synthetic Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/PaymentOptionCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/PaymentOptionCallback;

    return-void
.end method


# virtual methods
.method public final onPaymentOptionResult(Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/PaymentOptionCallback;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionCallbackKt;->$r8$lambda$DX8jquM79ZLcpo1Kk-LDxChHIXg(Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V

    return-void
.end method

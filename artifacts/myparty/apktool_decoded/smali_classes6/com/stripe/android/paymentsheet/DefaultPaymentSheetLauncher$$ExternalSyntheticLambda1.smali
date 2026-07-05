.class public final synthetic Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetResult;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->$r8$lambda$aT-hGaFiynqXXj26gIpMQ6rIMEE(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

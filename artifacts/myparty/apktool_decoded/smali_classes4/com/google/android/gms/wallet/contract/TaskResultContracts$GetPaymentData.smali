.class public final Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentData;
.super Lcom/google/android/gms/wallet/contract/TaskResultContracts$UnpackApiTaskResult;
.source "com.google.android.gms:play-services-wallet@@19.3.0"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/contract/TaskResultContracts;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GetPaymentData"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wallet/contract/TaskResultContracts$UnpackApiTaskResult<",
        "Lcom/google/android/gms/wallet/PaymentData;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$UnpackApiTaskResult;-><init>()V

    return-void
.end method


# virtual methods
.method public parseResult(ILandroid/content/Intent;)Lcom/google/android/gms/wallet/PaymentData;
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/wallet/PaymentData;->getFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/wallet/PaymentData;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentData;->parseResult(ILandroid/content/Intent;)Lcom/google/android/gms/wallet/PaymentData;

    move-result-object p1

    return-object p1
.end method

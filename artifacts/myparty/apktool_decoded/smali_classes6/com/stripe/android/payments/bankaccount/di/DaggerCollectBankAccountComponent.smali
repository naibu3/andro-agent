.class public final Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent;
.super Ljava/lang/Object;
.source "DaggerCollectBankAccountComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;,
        Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 2

    .line 48
    new-instance v0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;-><init>(Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent-IA;)V

    return-object v0
.end method

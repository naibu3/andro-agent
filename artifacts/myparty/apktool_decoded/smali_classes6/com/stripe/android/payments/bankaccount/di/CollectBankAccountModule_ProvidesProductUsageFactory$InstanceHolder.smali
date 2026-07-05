.class final Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "CollectBankAccountModule_ProvidesProductUsageFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

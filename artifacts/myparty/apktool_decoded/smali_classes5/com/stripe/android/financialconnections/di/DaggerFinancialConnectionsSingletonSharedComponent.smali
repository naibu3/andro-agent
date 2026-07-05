.class public final Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent;
.super Ljava/lang/Object;
.source "DaggerFinancialConnectionsSingletonSharedComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$Factory;,
        Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static factory()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent$Factory;
    .locals 2

    .line 32
    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$Factory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$Factory;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent-IA;)V

    return-object v0
.end method

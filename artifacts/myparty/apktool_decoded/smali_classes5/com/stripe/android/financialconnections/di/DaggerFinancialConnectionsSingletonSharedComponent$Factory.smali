.class final Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$Factory;
.super Ljava/lang/Object;
.source "DaggerFinancialConnectionsSingletonSharedComponent.java"

# interfaces
.implements Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Factory"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$Factory;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;
    .locals 3

    .line 38
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;

    new-instance v1, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;Landroid/app/Application;Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent-IA;)V

    return-object v0
.end method

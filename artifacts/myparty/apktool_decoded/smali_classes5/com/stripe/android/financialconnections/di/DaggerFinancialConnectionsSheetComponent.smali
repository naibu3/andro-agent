.class public final Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent;
.super Ljava/lang/Object;
.source "DaggerFinancialConnectionsSheetComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent$Builder;,
        Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent$FinancialConnectionsSheetComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;
    .locals 2

    .line 77
    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent$Builder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent-IA;)V

    return-object v0
.end method

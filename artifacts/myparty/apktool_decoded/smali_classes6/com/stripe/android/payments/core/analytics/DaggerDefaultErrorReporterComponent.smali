.class public final Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent;
.super Ljava/lang/Object;
.source "DaggerDefaultErrorReporterComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;,
        Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;
    .locals 2

    .line 31
    new-instance v0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;-><init>(Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent-IA;)V

    return-object v0
.end method

.class public final Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent;
.super Ljava/lang/Object;
.source "DaggerNextActionHandlerComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;,
        Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$NextActionHandlerComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 2

    .line 66
    new-instance v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;-><init>(Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent-IA;)V

    return-object v0
.end method

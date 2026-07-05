.class public final Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent;
.super Ljava/lang/Object;
.source "DaggerStripeCustomerAdapterComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;,
        Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$StripeCustomerAdapterComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .locals 2

    .line 55
    new-instance v0, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent$Builder;-><init>(Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent-IA;)V

    return-object v0
.end method

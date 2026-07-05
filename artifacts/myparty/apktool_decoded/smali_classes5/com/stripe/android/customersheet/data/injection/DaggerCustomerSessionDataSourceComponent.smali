.class public final Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent;
.super Ljava/lang/Object;
.source "DaggerCustomerSessionDataSourceComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;,
        Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent$Builder;
    .locals 2

    .line 71
    new-instance v0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;-><init>(Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent-IA;)V

    return-object v0
.end method

.class public final Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent;
.super Ljava/lang/Object;
.source "DaggerCustomerAdapterDataSourceComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;,
        Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$CustomerAdapterDataSourceComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;
    .locals 2

    .line 62
    new-instance v0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;-><init>(Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent-IA;)V

    return-object v0
.end method

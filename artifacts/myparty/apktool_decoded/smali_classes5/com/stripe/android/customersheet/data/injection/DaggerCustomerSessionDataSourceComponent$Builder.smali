.class final Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerCustomerSessionDataSourceComponent.java"

# interfaces
.implements Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private application:Landroid/app/Application;

.field private customerSessionProvider:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent$Builder;
    .locals 0

    .line 74
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public application(Landroid/app/Application;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;
    .locals 0

    .line 81
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public build()Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent;
    .locals 9

    .line 94
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 95
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->customerSessionProvider:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    const-class v1, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 96
    new-instance v2, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;

    new-instance v3, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v3}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    new-instance v5, Lcom/stripe/android/common/di/MobileSessionIdModule;

    invoke-direct {v5}, Lcom/stripe/android/common/di/MobileSessionIdModule;-><init>()V

    iget-object v6, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->application:Landroid/app/Application;

    iget-object v7, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->customerSessionProvider:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$CustomerSessionDataSourceComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent-IA;)V

    return-object v2
.end method

.method public bridge synthetic customerSessionProvider(Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent$Builder;
    .locals 0

    .line 74
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->customerSessionProvider(Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public customerSessionProvider(Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;
    .locals 0

    .line 88
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerSessionDataSourceComponent$Builder;->customerSessionProvider:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    return-object p0
.end method

.class final Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerCustomerAdapterDataSourceComponent.java"

# interfaces
.implements Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

.field private application:Landroid/app/Application;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic adapter(Lcom/stripe/android/customersheet/CustomerAdapter;)Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->adapter(Lcom/stripe/android/customersheet/CustomerAdapter;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public adapter(Lcom/stripe/android/customersheet/CustomerAdapter;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;
    .locals 0

    .line 78
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter;

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    return-object p0
.end method

.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public application(Landroid/app/Application;)Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;
    .locals 0

    .line 72
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public build()Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent;
    .locals 9

    .line 84
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 85
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    const-class v1, Lcom/stripe/android/customersheet/CustomerAdapter;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 86
    new-instance v2, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$CustomerAdapterDataSourceComponentImpl;

    new-instance v3, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v3}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    new-instance v5, Lcom/stripe/android/common/di/MobileSessionIdModule;

    invoke-direct {v5}, Lcom/stripe/android/common/di/MobileSessionIdModule;-><init>()V

    iget-object v6, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->application:Landroid/app/Application;

    iget-object v7, p0, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$Builder;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent$CustomerAdapterDataSourceComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Landroid/app/Application;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/customersheet/data/injection/DaggerCustomerAdapterDataSourceComponent-IA;)V

    return-object v2
.end method

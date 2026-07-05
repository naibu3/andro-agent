.class public final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;
.super Ljava/lang/Object;
.source "FinancialConnectionsRepositoryImpl_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiRequestFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private final fraudDetectionDataRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final provideApiRequestOptionsProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
            ">;"
        }
    .end annotation
.end field

.field private final requestExecutorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->requestExecutorProvider:Ldagger/internal/Provider;

    .line 46
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->provideApiRequestOptionsProvider:Ldagger/internal/Provider;

    .line 47
    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->fraudDetectionDataRepositoryProvider:Ldagger/internal/Provider;

    .line 48
    iput-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->apiRequestFactoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;)",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;"
        }
    .end annotation

    .line 69
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;)",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-static {p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;
    .locals 1

    .line 77
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;-><init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;
    .locals 4

    .line 53
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->requestExecutorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->provideApiRequestOptionsProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->fraudDetectionDataRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->apiRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->newInstance(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;
.super Ljava/lang/Object;
.source "FinancialConnectionsRequestExecutor_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        ">;"
    }
.end annotation


# instance fields
.field private final eventEmitterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final jsonProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlinx/serialization/json/Json;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeNetworkClientProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
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
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/serialization/json/Json;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->stripeNetworkClientProvider:Ldagger/internal/Provider;

    .line 45
    iput-object p2, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->eventEmitterProvider:Ldagger/internal/Provider;

    .line 46
    iput-object p3, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->jsonProvider:Ldagger/internal/Provider;

    .line 47
    iput-object p4, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->loggerProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/serialization/json/Json;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;"
        }
    .end annotation

    .line 66
    new-instance v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlinx/serialization/json/Json;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;"
        }
    .end annotation

    .line 59
    new-instance v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-static {p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;
    .locals 1

    .line 72
    new-instance v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;-><init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;
    .locals 4

    .line 52
    iget-object v0, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->stripeNetworkClientProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/networking/StripeNetworkClient;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->eventEmitterProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->jsonProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/Json;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->loggerProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->newInstance(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->get()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    move-result-object v0

    return-object v0
.end method

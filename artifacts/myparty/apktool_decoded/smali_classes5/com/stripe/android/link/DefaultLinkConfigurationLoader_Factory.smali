.class public final Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;
.super Ljava/lang/Object;
.source "DefaultLinkConfigurationLoader_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/DefaultLinkConfigurationLoader;",
        ">;"
    }
.end annotation


# instance fields
.field private final linkGateFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
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

.field private final paymentElementLoaderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->loggerProvider:Ldagger/internal/Provider;

    .line 41
    iput-object p2, p0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->paymentElementLoaderProvider:Ldagger/internal/Provider;

    .line 42
    iput-object p3, p0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->linkGateFactoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;)",
            "Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;)",
            "Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;"
        }
    .end annotation

    .line 54
    new-instance v0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lcom/stripe/android/link/gate/LinkGate$Factory;)Lcom/stripe/android/link/DefaultLinkConfigurationLoader;
    .locals 1

    .line 65
    new-instance v0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/DefaultLinkConfigurationLoader;-><init>(Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lcom/stripe/android/link/gate/LinkGate$Factory;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/DefaultLinkConfigurationLoader;
    .locals 3

    .line 47
    iget-object v0, p0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->loggerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->paymentElementLoaderProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;

    iget-object v2, p0, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->linkGateFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/gate/LinkGate$Factory;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->newInstance(Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lcom/stripe/android/link/gate/LinkGate$Factory;)Lcom/stripe/android/link/DefaultLinkConfigurationLoader;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/link/DefaultLinkConfigurationLoader_Factory;->get()Lcom/stripe/android/link/DefaultLinkConfigurationLoader;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;
.super Ljava/lang/Object;
.source "DefaultCustomerSessionElementsSessionManager_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerSessionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final elementsSessionRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final errorReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final prefsRepositoryFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;"
        }
    .end annotation
.end field

.field private final timeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field private final workContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->elementsSessionRepositoryProvider:Ldagger/internal/Provider;

    .line 54
    iput-object p2, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->prefsRepositoryFactoryProvider:Ldagger/internal/Provider;

    .line 55
    iput-object p3, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->customerSessionProvider:Ldagger/internal/Provider;

    .line 56
    iput-object p4, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->errorReporterProvider:Ldagger/internal/Provider;

    .line 57
    iput-object p5, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->timeProvider:Ldagger/internal/Provider;

    .line 58
    iput-object p6, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->workContextProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;"
        }
    .end annotation

    .line 82
    new-instance v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;"
        }
    .end annotation

    .line 73
    new-instance v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v1

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v2

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v3

    invoke-static {p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v4

    invoke-static {p4}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v5

    invoke-static {p5}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")",
            "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;"
        }
    .end annotation

    .line 90
    new-instance v0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;-><init>(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;
    .locals 7

    .line 63
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->elementsSessionRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->prefsRepositoryFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->customerSessionProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->errorReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->timeProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function0;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->workContextProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/CoroutineContext;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->newInstance(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager_Factory;->get()Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;

    move-result-object v0

    return-object v0
.end method

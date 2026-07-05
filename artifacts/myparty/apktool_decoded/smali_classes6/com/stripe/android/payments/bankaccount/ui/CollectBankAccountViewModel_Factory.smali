.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;
.super Ljava/lang/Object;
.source "CollectBankAccountViewModel_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final _viewEffectProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;>;"
        }
    .end annotation
.end field

.field private final argsProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final attachFinancialConnectionsSessionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field private final createFinancialConnectionsSessionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
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

.field private final retrieveStripeIntentProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandleProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->argsProvider:Ldagger/internal/Provider;

    .line 56
    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->_viewEffectProvider:Ldagger/internal/Provider;

    .line 57
    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->createFinancialConnectionsSessionProvider:Ldagger/internal/Provider;

    .line 58
    iput-object p4, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->attachFinancialConnectionsSessionProvider:Ldagger/internal/Provider;

    .line 59
    iput-object p5, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->retrieveStripeIntentProvider:Ldagger/internal/Provider;

    .line 60
    iput-object p6, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->savedStateHandleProvider:Ldagger/internal/Provider;

    .line 61
    iput-object p7, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->loggerProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;"
        }
    .end annotation

    .line 87
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;"
        }
    .end annotation

    .line 77
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;

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

    invoke-static {p6}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/core/Logger;",
            ")",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;"
        }
    .end annotation

    .line 95
    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 8

    .line 66
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->argsProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->_viewEffectProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/flow/MutableSharedFlow;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->createFinancialConnectionsSessionProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->attachFinancialConnectionsSessionProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->retrieveStripeIntentProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->savedStateHandleProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroidx/lifecycle/SavedStateHandle;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->loggerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/core/Logger;

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->newInstance(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->get()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object v0

    return-object v0
.end method

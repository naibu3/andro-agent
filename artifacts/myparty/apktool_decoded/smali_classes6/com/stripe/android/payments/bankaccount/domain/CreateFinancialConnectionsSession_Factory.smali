.class public final Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;
.super Ljava/lang/Object;
.source "CreateFinancialConnectionsSession_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
        ">;"
    }
.end annotation


# instance fields
.field private final stripeRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->stripeRepositoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;
    .locals 1

    .line 52
    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;-><init>(Lcom/stripe/android/networking/StripeRepository;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->stripeRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/networking/StripeRepository;

    invoke-static {v0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->newInstance(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->get()Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    move-result-object v0

    return-object v0
.end method

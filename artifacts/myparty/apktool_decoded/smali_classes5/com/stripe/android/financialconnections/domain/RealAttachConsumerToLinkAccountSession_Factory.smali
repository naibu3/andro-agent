.class public final Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;
.super Ljava/lang/Object;
.source "RealAttachConsumerToLinkAccountSession_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;",
        ">;"
    }
.end annotation


# instance fields
.field private final configurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final consumerRepositoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
            ">;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;->configurationProvider:Ldagger/internal/Provider;

    .line 38
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;->consumerRepositoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;
    .locals 1

    .line 61
    new-instance v0, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;->configurationProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;->consumerRepositoryProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;->newInstance(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession_Factory;->get()Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/stripe/android/link/LinkPaymentLauncher_Factory;
.super Ljava/lang/Object;
.source "LinkPaymentLauncher_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        ">;"
    }
.end annotation


# instance fields
.field private final linkActivityContractProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkActivityContract;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAnalyticsComponentBuilderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final linkStoreProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
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
            "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->linkAnalyticsComponentBuilderProvider:Ldagger/internal/Provider;

    .line 44
    iput-object p2, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    .line 45
    iput-object p3, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->linkActivityContractProvider:Ldagger/internal/Provider;

    .line 46
    iput-object p4, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->linkStoreProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/LinkPaymentLauncher_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;)",
            "Lcom/stripe/android/link/LinkPaymentLauncher_Factory;"
        }
    .end annotation

    .line 67
    new-instance v0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/link/LinkPaymentLauncher_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkActivityContract;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;)",
            "Lcom/stripe/android/link/LinkPaymentLauncher_Factory;"
        }
    .end annotation

    .line 59
    new-instance v0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-static {p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lcom/stripe/android/link/account/LinkStore;)Lcom/stripe/android/link/LinkPaymentLauncher;
    .locals 1

    .line 74
    new-instance v0, Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/LinkPaymentLauncher;-><init>(Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lcom/stripe/android/link/account/LinkStore;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/LinkPaymentLauncher;
    .locals 4

    .line 51
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->linkAnalyticsComponentBuilderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;

    iget-object v1, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->linkActivityContractProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/LinkActivityContract;

    iget-object v3, p0, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->linkStoreProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/account/LinkStore;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->newInstance(Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lcom/stripe/android/link/account/LinkStore;)Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkPaymentLauncher_Factory;->get()Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v0

    return-object v0
.end method

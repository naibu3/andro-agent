.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElement_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
        ">;"
    }
.end annotation


# instance fields
.field private final configurationCoordinatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final confirmationHelperProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final contentHelperProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentOptionDisplayDataHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final stateHelperProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
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
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
            ">;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->confirmationHelperProvider:Ldagger/internal/Provider;

    .line 54
    iput-object p2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->contentHelperProvider:Ldagger/internal/Provider;

    .line 55
    iput-object p3, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->selectionHolderProvider:Ldagger/internal/Provider;

    .line 56
    iput-object p4, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->paymentOptionDisplayDataHolderProvider:Ldagger/internal/Provider;

    .line 57
    iput-object p5, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->configurationCoordinatorProvider:Ldagger/internal/Provider;

    .line 58
    iput-object p6, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->stateHelperProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
            ">;)",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;"
        }
    .end annotation

    .line 83
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
            ">;)",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;"
        }
    .end annotation

    .line 73
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;

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

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
    .locals 7

    .line 90
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;-><init>(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
    .locals 7

    .line 63
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->confirmationHelperProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->contentHelperProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->selectionHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->paymentOptionDisplayDataHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->configurationCoordinatorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->stateHelperProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->newInstance(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement_Factory;->get()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    move-result-object v0

    return-object v0
.end method

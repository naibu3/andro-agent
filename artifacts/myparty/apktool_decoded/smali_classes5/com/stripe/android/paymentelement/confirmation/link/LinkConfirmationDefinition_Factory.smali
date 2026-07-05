.class public final Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;
.super Ljava/lang/Object;
.source "LinkConfirmationDefinition_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;",
        ">;"
    }
.end annotation


# instance fields
.field private final linkAccountHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final linkPaymentLauncherProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
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


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->linkPaymentLauncherProvider:Ldagger/internal/Provider;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->linkStoreProvider:Ldagger/internal/Provider;

    .line 43
    iput-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->linkAccountHolderProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;)",
            "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;"
        }
    .end annotation

    .line 62
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/account/LinkStore;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;)",
            "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/account/LinkAccountHolder;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;
    .locals 1

    .line 67
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/account/LinkAccountHolder;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->linkPaymentLauncherProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkPaymentLauncher;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->linkStoreProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/account/LinkStore;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->linkAccountHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->newInstance(Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/account/LinkAccountHolder;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition_Factory;->get()Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;

    move-result-object v0

    return-object v0
.end method

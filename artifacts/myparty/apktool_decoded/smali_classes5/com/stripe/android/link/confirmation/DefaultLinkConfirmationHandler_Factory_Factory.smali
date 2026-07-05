.class public final Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;
.super Ljava/lang/Object;
.source "DefaultLinkConfirmationHandler_Factory_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
        ">;"
    }
.end annotation


# instance fields
.field private final configurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
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


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;->configurationProvider:Ldagger/internal/Provider;

    .line 37
    iput-object p2, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;->loggerProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;
    .locals 1

    .line 58
    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;->configurationProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkConfiguration;

    iget-object v1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;->loggerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;->newInstance(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler_Factory_Factory;->get()Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;

    move-result-object v0

    return-object v0
.end method

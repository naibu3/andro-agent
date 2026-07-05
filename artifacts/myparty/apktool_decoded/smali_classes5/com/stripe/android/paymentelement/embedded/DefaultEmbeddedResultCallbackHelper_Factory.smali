.class public final Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;
.super Ljava/lang/Object;
.source "DefaultEmbeddedResultCallbackHelper_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final resultCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;",
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
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
            ">;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;->resultCallbackProvider:Ldagger/internal/Provider;

    .line 38
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;->stateHelperProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;
    .locals 1

    .line 60
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;->resultCallbackProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;->stateHelperProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    invoke-static {v0, v1}, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;->newInstance(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper_Factory;->get()Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;

    move-result-object v0

    return-object v0
.end method

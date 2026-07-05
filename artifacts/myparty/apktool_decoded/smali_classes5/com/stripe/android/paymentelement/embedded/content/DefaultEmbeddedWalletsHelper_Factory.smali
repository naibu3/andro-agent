.class public final Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;
.super Ljava/lang/Object;
.source "DefaultEmbeddedWalletsHelper_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final linkHandlerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
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
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;->linkHandlerProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/LinkHandler;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;
    .locals 1

    .line 51
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;->linkHandlerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;->newInstance(Lcom/stripe/android/paymentsheet/LinkHandler;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper_Factory;->get()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;

    move-result-object v0

    return-object v0
.end method

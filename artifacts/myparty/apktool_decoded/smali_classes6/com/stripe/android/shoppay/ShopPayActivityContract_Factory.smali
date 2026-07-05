.class public final Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;
.super Ljava/lang/Object;
.source "ShopPayActivityContract_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/shoppay/ShopPayActivityContract;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/stripe/android/shoppay/ShopPayActivityContract;
    .locals 1

    .line 51
    new-instance v0, Lcom/stripe/android/shoppay/ShopPayActivityContract;

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/ShopPayActivityContract;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/shoppay/ShopPayActivityContract;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;->newInstance(Ljava/lang/String;)Lcom/stripe/android/shoppay/ShopPayActivityContract;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/ShopPayActivityContract_Factory;->get()Lcom/stripe/android/shoppay/ShopPayActivityContract;

    move-result-object v0

    return-object v0
.end method

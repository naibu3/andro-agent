.class public final Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;
.super Ljava/lang/Object;
.source "ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
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

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static providePreparePaymentMethodHandler(Ljava/lang/String;)Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;
    .locals 1

    .line 53
    sget-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule;->Companion:Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;->providePreparePaymentMethodHandler(Ljava/lang/String;)Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;->paymentElementCallbackIdentifierProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;->providePreparePaymentMethodHandler(Ljava/lang/String;)Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory;->get()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    move-result-object v0

    return-object v0
.end method

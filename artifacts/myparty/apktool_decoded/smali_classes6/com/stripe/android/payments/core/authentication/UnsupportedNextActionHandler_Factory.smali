.class public final Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;
.super Ljava/lang/Object;
.source "UnsupportedNextActionHandler_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;",
        ">;"
    }
.end annotation


# instance fields
.field private final paymentRelayStarterFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentRelayStarter;",
            ">;>;"
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
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentRelayStarter;",
            ">;>;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;->paymentRelayStarterFactoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentRelayStarter;",
            ">;>;)",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentRelayStarter;",
            ">;>;)",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentRelayStarter;",
            ">;)",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;->paymentRelayStarterFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;->newInstance(Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler_Factory;->get()Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;

    move-result-object v0

    return-object v0
.end method

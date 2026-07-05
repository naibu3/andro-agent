.class public final Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;
.super Ljava/lang/Object;
.source "RealRedirectResolver_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;",
        ">;"
    }
.end annotation


# instance fields
.field private final ioDispatcherProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
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
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;->ioDispatcherProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;
    .locals 1

    .line 51
    new-instance v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;->ioDispatcherProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;->newInstance(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver_Factory;->get()Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;

    move-result-object v0

    return-object v0
.end method

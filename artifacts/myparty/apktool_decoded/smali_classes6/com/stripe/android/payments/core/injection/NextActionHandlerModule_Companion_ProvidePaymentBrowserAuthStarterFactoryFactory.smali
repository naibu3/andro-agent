.class public final Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;
.super Ljava/lang/Object;
.source "NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "Lcom/stripe/android/PaymentBrowserAuthStarter;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final defaultReturnUrlProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;"
        }
    .end annotation
.end field

.field private final registryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;",
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
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->registryProvider:Ldagger/internal/Provider;

    .line 44
    iput-object p2, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->defaultReturnUrlProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static providePaymentBrowserAuthStarterFactory(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/Lazy<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;",
            ">;",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ")",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;"
        }
    .end annotation

    .line 67
    sget-object v0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule;->Companion:Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion;->providePaymentBrowserAuthStarterFactory(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->get()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->registryProvider:Ldagger/internal/Provider;

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->lazy(Ldagger/internal/Provider;)Ldagger/Lazy;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->defaultReturnUrlProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/DefaultReturnUrl;

    invoke-static {v0, v1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->providePaymentBrowserAuthStarterFactory(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

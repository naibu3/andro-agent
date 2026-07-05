.class public final Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;
.super Ljava/lang/Object;
.source "DefaultPaymentNextActionHandlerRegistry_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final includePaymentSheetNextActionHandlersProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final noOpIntentNextActionHandlerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentNextActionHandlersProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final sourceNextActionHandlerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
            ">;",
            "Ldagger/internal/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;>;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->noOpIntentNextActionHandlerProvider:Ldagger/internal/Provider;

    .line 51
    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->sourceNextActionHandlerProvider:Ldagger/internal/Provider;

    .line 52
    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->paymentNextActionHandlersProvider:Ldagger/internal/Provider;

    .line 53
    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->includePaymentSheetNextActionHandlersProvider:Ldagger/internal/Provider;

    .line 54
    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->applicationContextProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
            ">;",
            "Ldagger/internal/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;>;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;"
        }
    .end annotation

    .line 77
    new-instance v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;>;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;"
        }
    .end annotation

    .line 68
    new-instance v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;

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

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Ljava/util/Map;ZLandroid/content/Context;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;Z",
            "Landroid/content/Context;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;"
        }
    .end annotation

    .line 85
    new-instance v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;-><init>(Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Ljava/util/Map;ZLandroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;
    .locals 5

    .line 59
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->noOpIntentNextActionHandlerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->sourceNextActionHandlerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->paymentNextActionHandlersProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->includePaymentSheetNextActionHandlersProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->applicationContextProvider:Ldagger/internal/Provider;

    invoke-interface {v4}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->newInstance(Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Ljava/util/Map;ZLandroid/content/Context;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry_Factory;->get()Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;

    move-result-object v0

    return-object v0
.end method

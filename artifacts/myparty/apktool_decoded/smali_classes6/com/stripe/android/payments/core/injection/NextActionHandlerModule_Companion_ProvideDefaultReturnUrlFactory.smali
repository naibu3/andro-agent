.class public final Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;
.super Ljava/lang/Object;
.source "NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/DefaultReturnUrl;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;->contextProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static provideDefaultReturnUrl(Landroid/content/Context;)Lcom/stripe/android/payments/DefaultReturnUrl;
    .locals 1

    .line 54
    sget-object v0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule;->Companion:Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion;->provideDefaultReturnUrl(Landroid/content/Context;)Lcom/stripe/android/payments/DefaultReturnUrl;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/payments/DefaultReturnUrl;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/DefaultReturnUrl;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;->contextProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;->provideDefaultReturnUrl(Landroid/content/Context;)Lcom/stripe/android/payments/DefaultReturnUrl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory;->get()Lcom/stripe/android/payments/DefaultReturnUrl;

    move-result-object v0

    return-object v0
.end method

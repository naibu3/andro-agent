.class public final Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;
.super Ljava/lang/Object;
.source "CoreCommonModule_ProvideLoggerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/core/Logger;",
        ">;"
    }
.end annotation


# instance fields
.field private final enableLoggingProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/stripe/android/core/injection/CoreCommonModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->module:Lcom/stripe/android/core/injection/CoreCommonModule;

    .line 37
    iput-object p2, p0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->enableLoggingProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;"
        }
    .end annotation

    .line 52
    new-instance v0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Lcom/stripe/android/core/injection/CoreCommonModule;Ljavax/inject/Provider;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static provideLogger(Lcom/stripe/android/core/injection/CoreCommonModule;Z)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 56
    invoke-virtual {p0, p1}, Lcom/stripe/android/core/injection/CoreCommonModule;->provideLogger(Z)Lcom/stripe/android/core/Logger;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/core/Logger;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/core/Logger;
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->module:Lcom/stripe/android/core/injection/CoreCommonModule;

    iget-object v1, p0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->enableLoggingProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->provideLogger(Lcom/stripe/android/core/injection/CoreCommonModule;Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->get()Lcom/stripe/android/core/Logger;

    move-result-object v0

    return-object v0
.end method

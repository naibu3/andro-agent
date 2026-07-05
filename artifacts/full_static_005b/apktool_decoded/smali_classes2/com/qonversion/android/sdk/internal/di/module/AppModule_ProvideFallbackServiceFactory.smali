.class public final Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideFallbackServiceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

.field private final moshiProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 33
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->contextProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->moshiProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->loggerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideFallbackService(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Landroid/app/Application;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 0

    .line 51
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->provideFallbackService(Landroid/app/Application;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->contextProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->moshiProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/squareup/moshi/Moshi;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->loggerProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->provideFallbackService(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Landroid/app/Application;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->get()Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;
.super Ljava/lang/Object;
.source "QRemoteConfigManager_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final fallbacksServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
            ">;"
        }
    .end annotation
.end field

.field private final remoteConfigServiceProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;->remoteConfigServiceProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;->fallbacksServiceProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .locals 1

    .line 41
    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;-><init>(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .locals 3

    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;->remoteConfigServiceProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;->fallbacksServiceProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;-><init>(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager_Factory;->get()Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    move-result-object v0

    return-object v0
.end method

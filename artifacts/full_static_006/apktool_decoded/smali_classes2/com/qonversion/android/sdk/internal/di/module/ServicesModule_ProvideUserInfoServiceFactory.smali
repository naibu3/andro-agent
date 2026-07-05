.class public final Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;
.super Ljava/lang/Object;
.source "ServicesModule_ProvideUserInfoServiceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        ">;"
    }
.end annotation


# instance fields
.field private final cacheStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

.field private final tokenStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
            ">;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 30
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->cacheStorageProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->tokenStorageProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideUserInfoService(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 0

    .line 47
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;->provideUserInfoService(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 3

    .line 36
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->cacheStorageProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->tokenStorageProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->provideUserInfoService(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    return-object v0
.end method

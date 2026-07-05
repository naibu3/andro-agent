.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;
.super Ljava/lang/Object;
.source "RepositoryModule_ProvideTokenStorageFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

.field private final preferencesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 26
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->preferencesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideTokenStorage(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/TokenStorage;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->provideTokenStorage(Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/storage/TokenStorage;
    .locals 2

    .line 31
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->preferencesProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->provideTokenStorage(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->get()Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;
.super Ljava/lang/Object;
.source "RepositoryModule_ProvidePropertiesStorageFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;
    .locals 1

    .line 29
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)V

    return-object v0
.end method

.method public static providePropertiesStorage(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->providePropertiesStorage()Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;->providePropertiesStorage(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;->get()Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;

    move-result-object v0

    return-object v0
.end method

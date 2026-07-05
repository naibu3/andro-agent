.class public final Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;
.super Ljava/lang/Object;
.source "ManagersModule_ProvideUserPropertiesManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final appContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final appStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final incrementalDelayCalculatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
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

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

.field private final propertiesStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final repositoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 44
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->appContextProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->repositoryProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->propertiesStorageProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->incrementalDelayCalculatorProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->appStateProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->loggerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;"
        }
    .end annotation

    .line 62
    new-instance v8, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideUserPropertiesManager(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 0

    .line 69
    invoke-virtual/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;->provideUserPropertiesManager(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 7

    .line 54
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->appContextProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->repositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->propertiesStorageProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->incrementalDelayCalculatorProvider:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->appStateProvider:Ljavax/inject/Provider;

    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->loggerProvider:Ljavax/inject/Provider;

    invoke-interface {v6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->provideUserPropertiesManager(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->get()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object v0

    return-object v0
.end method

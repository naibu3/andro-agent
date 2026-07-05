.class public final Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;
.super Ljava/lang/Object;
.source "QUserPropertiesManager_Factory.java"

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
.field private final appStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final delayCalculatorProvider:Ljavax/inject/Provider;
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

.field private final propertiesStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;",
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

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->contextProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->repositoryProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->propertiesStorageProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->delayCalculatorProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->appStateProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->loggerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;",
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
            "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;"
        }
    .end annotation

    .line 56
    new-instance v7, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static newInstance(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 8

    .line 62
    new-instance v7, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    return-object v7
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 8

    .line 48
    new-instance v7, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->contextProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Application;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->repositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->propertiesStorageProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->delayCalculatorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->appStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->loggerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    return-object v7
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager_Factory;->get()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object v0

    return-object v0
.end method

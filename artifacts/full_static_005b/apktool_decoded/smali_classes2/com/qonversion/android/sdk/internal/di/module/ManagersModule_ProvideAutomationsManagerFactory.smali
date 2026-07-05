.class public final Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;
.super Ljava/lang/Object;
.source "ManagersModule_ProvideAutomationsManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final activityProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final appContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final eventMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

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
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 37
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->repositoryProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->eventMapperProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->appContextProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->activityProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;"
        }
    .end annotation

    .line 52
    new-instance v6, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideAutomationsManager(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 0

    .line 58
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;->provideAutomationsManager(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 5

    .line 45
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->repositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->eventMapperProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->appContextProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Application;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->activityProvider:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->provideAutomationsManager(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->get()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v0

    return-object v0
.end method

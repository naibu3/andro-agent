.class public final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;
.super Ljava/lang/Object;
.source "QAutomationsManager_Factory.java"

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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->repositoryProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->eventMapperProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->appContextProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p4, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->activityProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 1

    .line 49
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 5

    .line 37
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->repositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->eventMapperProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

    iget-object v3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->appContextProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Application;

    iget-object v4, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->activityProvider:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager_Factory;->get()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;
.super Ljava/lang/Object;
.source "ManagersModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0008\u0010\u0014\u001a\u00020\u0015H\u0007J8\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;",
        "",
        "()V",
        "provideAutomationsEventMapper",
        "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "provideAutomationsManager",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "eventMapper",
        "appContext",
        "Landroid/app/Application;",
        "activityProvider",
        "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
        "provideIdentityManager",
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "userInfoService",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "provideIncrementalDelayCalculator",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "provideUserPropertiesManager",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "propertiesStorage",
        "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;",
        "incrementalDelayCalculator",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideAutomationsEventMapper(Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;-><init>(Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    return-object v0
.end method

.method public final provideAutomationsManager(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventMapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V

    return-object v0
.end method

.method public final provideIdentityManager(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)Lcom/qonversion/android/sdk/internal/QIdentityManager;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance v0, Lcom/qonversion/android/sdk/internal/QIdentityManager;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QIdentityManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)V

    return-object v0
.end method

.method public final provideIncrementalDelayCalculator()Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
    .locals 2
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 80
    new-instance v0, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;-><init>(Ljava/util/Random;)V

    return-object v0
.end method

.method public final provideUserPropertiesManager(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 8
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertiesStorage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incrementalDelayCalculator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appStateProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    new-instance v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 70
    move-object v4, p3

    check-cast v4, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 67
    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    return-object v0
.end method

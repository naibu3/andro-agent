.class public final Lio/qonversion/sandwich/AutomationsSandwich;
.super Ljava/lang/Object;
.source "AutomationsSandwich.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\u001c\u0010\u0015\u001a\u00020\u00082\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eJ(\u0010\u001a\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lio/qonversion/sandwich/AutomationsSandwich;",
        "",
        "()V",
        "automationsDelegate",
        "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
        "defaultPresentationConfig",
        "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;",
        "isCustomizationDelegateSet",
        "",
        "screenCustomizationDelegate",
        "io/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1",
        "Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;",
        "screenPresentationConfigs",
        "",
        "",
        "createAutomationsDelegate",
        "eventListener",
        "Lio/qonversion/sandwich/AutomationsEventListener;",
        "getNotificationCustomPayload",
        "",
        "notificationData",
        "handleNotification",
        "setDelegate",
        "",
        "setNotificationToken",
        "token",
        "setScreenPresentationConfig",
        "configData",
        "screenId",
        "showScreen",
        "resultListener",
        "Lio/qonversion/sandwich/ResultListener;",
        "sandwich_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private automationsDelegate:Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

.field private defaultPresentationConfig:Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

.field private isCustomizationDelegateSet:Z

.field private final screenCustomizationDelegate:Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;

.field private final screenPresentationConfigs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->screenPresentationConfigs:Ljava/util/Map;

    .line 18
    new-instance v0, Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;

    invoke-direct {v0, p0}, Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;-><init>(Lio/qonversion/sandwich/AutomationsSandwich;)V

    iput-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->screenCustomizationDelegate:Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;

    return-void
.end method

.method public static final synthetic access$getDefaultPresentationConfig$p(Lio/qonversion/sandwich/AutomationsSandwich;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;
    .locals 0

    .line 11
    iget-object p0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->defaultPresentationConfig:Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    return-object p0
.end method

.method public static final synthetic access$getScreenPresentationConfigs$p(Lio/qonversion/sandwich/AutomationsSandwich;)Ljava/util/Map;
    .locals 0

    .line 11
    iget-object p0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->screenPresentationConfigs:Ljava/util/Map;

    return-object p0
.end method

.method private final createAutomationsDelegate(Lio/qonversion/sandwich/AutomationsEventListener;)Lcom/qonversion/android/sdk/automations/AutomationsDelegate;
    .locals 1

    .line 88
    new-instance v0, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;

    invoke-direct {v0, p1}, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;-><init>(Lio/qonversion/sandwich/AutomationsEventListener;)V

    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    return-object v0
.end method

.method public static synthetic setScreenPresentationConfig$default(Lio/qonversion/sandwich/AutomationsSandwich;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 31
    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/qonversion/sandwich/AutomationsSandwich;->setScreenPresentationConfig(Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getNotificationCustomPayload(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "notificationData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toStringMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 53
    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/Automations$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/Automations;->getNotificationCustomPayload(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final handleNotification(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "notificationData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toStringMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 64
    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/Automations$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/Automations;->handleNotification(Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public final setDelegate(Lio/qonversion/sandwich/AutomationsEventListener;)V
    .locals 1

    const-string v0, "eventListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p1}, Lio/qonversion/sandwich/AutomationsSandwich;->createAutomationsDelegate(Lio/qonversion/sandwich/AutomationsEventListener;)Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    move-result-object p1

    iput-object p1, p0, Lio/qonversion/sandwich/AutomationsSandwich;->automationsDelegate:Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    .line 28
    sget-object p1, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/automations/Automations$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;

    move-result-object p1

    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->automationsDelegate:Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    if-nez v0, :cond_0

    const-string v0, "automationsDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/automations/Automations;->setDelegate(Lcom/qonversion/android/sdk/automations/AutomationsDelegate;)V

    return-void
.end method

.method public final setNotificationToken(Ljava/lang/String;)V
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/Automations$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/Automations;->setNotificationsToken(Ljava/lang/String;)V

    return-void
.end method

.method public final setScreenPresentationConfig(Ljava/util/Map;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "configData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toScreenPresentationConfig(Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    move-result-object p1

    .line 34
    iget-boolean v0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->isCustomizationDelegateSet:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->isCustomizationDelegateSet:Z

    .line 36
    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/Automations$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;

    move-result-object v0

    iget-object v1, p0, Lio/qonversion/sandwich/AutomationsSandwich;->screenCustomizationDelegate:Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;

    check-cast v1, Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/automations/Automations;->setScreenCustomizationDelegate(Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 40
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich;->screenPresentationConfigs:Ljava/util/Map;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    .line 41
    move-object p2, p0

    check-cast p2, Lio/qonversion/sandwich/AutomationsSandwich;

    .line 42
    iget-object p2, p0, Lio/qonversion/sandwich/AutomationsSandwich;->screenPresentationConfigs:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->clear()V

    .line 43
    iput-object p1, p0, Lio/qonversion/sandwich/AutomationsSandwich;->defaultPresentationConfig:Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    :cond_2
    return-void
.end method

.method public final showScreen(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/Automations$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/AutomationsSandwich$showScreen$1;

    invoke-direct {v1, p2}, Lio/qonversion/sandwich/AutomationsSandwich$showScreen$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/automations/Automations;->showScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    return-void
.end method

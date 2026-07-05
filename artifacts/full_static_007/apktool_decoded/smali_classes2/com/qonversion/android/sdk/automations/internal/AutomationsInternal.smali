.class public final Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;
.super Ljava/lang/Object;
.source "AutomationsInternal.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/automations/Automations;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0017J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;",
        "Lcom/qonversion/android/sdk/automations/Automations;",
        "()V",
        "automationsManager",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "getNotificationCustomPayload",
        "",
        "",
        "",
        "messageData",
        "handleNotification",
        "",
        "setDelegate",
        "",
        "delegate",
        "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
        "setNotificationsToken",
        "token",
        "setScreenCustomizationDelegate",
        "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
        "showScreen",
        "withID",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;",
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


# instance fields
.field private final automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    return-void
.end method


# virtual methods
.method public getNotificationCustomPayload(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "messageData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->getNotificationCustomPayload(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public handleNotification(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Consider removing this method. Qonversion is not working with push notifications anymore"
    .end annotation

    const-string v0, "messageData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->handlePushIfPossible(Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public setDelegate(Lcom/qonversion/android/sdk/automations/AutomationsDelegate;)V
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->setAutomationsDelegate(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public setNotificationsToken(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "Consider removing this method as it isn\'t needed anymore"
    .end annotation

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public setScreenCustomizationDelegate(Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;)V
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->setScreenCustomizationDelegate(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public showScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
    .locals 1

    const-string v0, "withID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    return-void
.end method

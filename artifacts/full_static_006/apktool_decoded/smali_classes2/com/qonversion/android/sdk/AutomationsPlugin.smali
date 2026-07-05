.class public Lcom/qonversion/android/sdk/AutomationsPlugin;
.super Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;
.source "AutomationsPlugin.java"

# interfaces
.implements Lio/qonversion/sandwich/AutomationsEventListener;


# instance fields
.field private automationsEventDelegate:Lorg/apache/cordova/CallbackContext;

.field private automationsSandwich:Lio/qonversion/sandwich/AutomationsSandwich;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;-><init>()V

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsEventDelegate:Lorg/apache/cordova/CallbackContext;

    return-void
.end method


# virtual methods
.method public onAutomationEvent(Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/qonversion/sandwich/AutomationsEventListener$Event;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsEventDelegate:Lorg/apache/cordova/CallbackContext;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 75
    :try_start_0
    invoke-static {p2}, Lcom/qonversion/android/sdk/EntitiesConverter;->convertMapToJson(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 78
    :goto_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 79
    const-string v1, "event"

    invoke-virtual {p1}, Lio/qonversion/sandwich/AutomationsEventListener$Event;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string p1, "payload"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    new-instance p1, Lorg/apache/cordova/PluginResult;

    sget-object p2, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {p1, p2, v0}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONObject;)V

    const/4 p2, 0x1

    .line 83
    invoke-virtual {p1, p2}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 84
    iget-object p2, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsEventDelegate:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 86
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_1
    :goto_1
    return-void
.end method

.method public pluginInitialize()V
    .locals 1

    .line 29
    invoke-super {p0}, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->pluginInitialize()V

    .line 30
    new-instance v0, Lio/qonversion/sandwich/AutomationsSandwich;

    invoke-direct {v0}, Lio/qonversion/sandwich/AutomationsSandwich;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsSandwich:Lio/qonversion/sandwich/AutomationsSandwich;

    return-void
.end method

.method public setScreenPresentationConfig(Lorg/json/JSONObject;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "setScreenPresentationConfig"
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 61
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/EntitiesConverter;->toMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    .line 62
    iget-object v0, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsSandwich:Lio/qonversion/sandwich/AutomationsSandwich;

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/AutomationsSandwich;->setScreenPresentationConfig(Ljava/util/Map;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 65
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public showScreen(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "showScreen"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsSandwich:Lio/qonversion/sandwich/AutomationsSandwich;

    new-instance v1, Lcom/qonversion/android/sdk/AutomationsPlugin$1;

    invoke-direct {v1, p0, p2}, Lcom/qonversion/android/sdk/AutomationsPlugin$1;-><init>(Lcom/qonversion/android/sdk/AutomationsPlugin;Lorg/apache/cordova/CallbackContext;)V

    invoke-virtual {v0, p1, v1}, Lio/qonversion/sandwich/AutomationsSandwich;->showScreen(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public subscribe(Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "subscribe"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->MAIN:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 35
    iput-object p1, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsEventDelegate:Lorg/apache/cordova/CallbackContext;

    .line 36
    iget-object v0, p0, Lcom/qonversion/android/sdk/AutomationsPlugin;->automationsSandwich:Lio/qonversion/sandwich/AutomationsSandwich;

    invoke-virtual {v0, p0}, Lio/qonversion/sandwich/AutomationsSandwich;->setDelegate(Lio/qonversion/sandwich/AutomationsEventListener;)V

    .line 38
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    const/4 v1, 0x1

    .line 39
    invoke-virtual {v0, v1}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 40
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    return-void
.end method

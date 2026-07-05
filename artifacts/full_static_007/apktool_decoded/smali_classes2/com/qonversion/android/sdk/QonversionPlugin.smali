.class public Lcom/qonversion/android/sdk/QonversionPlugin;
.super Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;
.source "QonversionPlugin.java"

# interfaces
.implements Lio/qonversion/sandwich/QonversionEventsListener;


# instance fields
.field private automationsEventDelegate:Lorg/apache/cordova/CallbackContext;

.field private entitlementsUpdateDelegate:Lorg/apache/cordova/CallbackContext;

.field private qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;-><init>()V

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->entitlementsUpdateDelegate:Lorg/apache/cordova/CallbackContext;

    .line 30
    iput-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->automationsEventDelegate:Lorg/apache/cordova/CallbackContext;

    return-void
.end method


# virtual methods
.method public attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "attachUserToExperiment"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 206
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p3}, Lcom/qonversion/android/sdk/Utils;->getEmptyResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lio/qonversion/sandwich/QonversionSandwich;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public attachUserToRemoteConfiguration(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "attachUserToRemoteConfiguration"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 216
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p2}, Lcom/qonversion/android/sdk/Utils;->getEmptyResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->attachUserToRemoteConfiguration(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public attribution(Lorg/json/JSONObject;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "attribution"
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 143
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/EntitiesConverter;->toMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    .line 144
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-virtual {v0, p2, p1}, Lio/qonversion/sandwich/QonversionSandwich;->addAttributionData(Ljava/lang/String;Ljava/util/Map;)V

    .line 145
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 147
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 148
    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public checkEntitlements(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "checkEntitlements"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 154
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->checkEntitlements(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public checkTrialIntroEligibilityForProductIds(Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "checkTrialIntroEligibilityForProductIds"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 170
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/EntitiesConverter;->convertArrayToStringList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    .line 171
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p2}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/qonversion/sandwich/QonversionSandwich;->checkTrialIntroEligibility(Ljava/util/List;Lio/qonversion/sandwich/ResultListener;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 173
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 174
    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public detachUserFromExperiment(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "detachUserFromExperiment"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 211
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p2}, Lcom/qonversion/android/sdk/Utils;->getEmptyResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->detachUserFromExperiment(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public detachUserFromRemoteConfiguration(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "detachUserFromRemoteConfiguration"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 221
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p2}, Lcom/qonversion/android/sdk/Utils;->getEmptyResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->detachUserFromRemoteConfiguration(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public identify(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "identify"
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 237
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p2}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->identify(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public initializeSdk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/apache/cordova/CallbackContext;)V
    .locals 8
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "initializeSdk"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->MAIN:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    iget-object v1, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 65
    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    .line 64
    invoke-virtual/range {v0 .. v7}, Lio/qonversion/sandwich/QonversionSandwich;->initialize(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 74
    iput-object p7, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->entitlementsUpdateDelegate:Lorg/apache/cordova/CallbackContext;

    .line 76
    new-instance p1, Lorg/apache/cordova/PluginResult;

    sget-object p2, Lorg/apache/cordova/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {p1, p2}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    const/4 p2, 0x1

    .line 77
    invoke-virtual {p1, p2}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 78
    invoke-virtual {p7, p1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    return-void
.end method

.method public isFallbackFileAccessible(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "isFallbackFileAccessible"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 226
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->isFallbackFileAccessible(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public logout(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "logout"
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 242
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-virtual {v0}, Lio/qonversion/sandwich/QonversionSandwich;->logout()V

    .line 243
    invoke-virtual {p1}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public offerings(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "offerings"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->offerings(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public onEntitlementsUpdated(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    .line 253
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->entitlementsUpdateDelegate:Lorg/apache/cordova/CallbackContext;

    if-eqz v0, :cond_0

    .line 255
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/EntitiesConverter;->convertMapToJson(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1

    .line 256
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONObject;)V

    const/4 p1, 0x1

    .line 257
    invoke-virtual {v0, p1}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 258
    iget-object p1, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->entitlementsUpdateDelegate:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 260
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public pluginInitialize()V
    .locals 4

    .line 34
    invoke-super {p0}, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->pluginInitialize()V

    .line 35
    new-instance v0, Lio/qonversion/sandwich/QonversionSandwich;

    iget-object v1, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 36
    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 37
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/qonversion/android/sdk/QonversionPlugin$$ExternalSyntheticLambda0;

    invoke-direct {v3, v2}, Lcom/qonversion/android/sdk/QonversionPlugin$$ExternalSyntheticLambda0;-><init>(Lorg/apache/cordova/CordovaInterface;)V

    invoke-direct {v0, v1, v3, p0}, Lio/qonversion/sandwich/QonversionSandwich;-><init>(Landroid/app/Application;Lio/qonversion/sandwich/ActivityProvider;Lio/qonversion/sandwich/QonversionEventsListener;)V

    iput-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    return-void
.end method

.method public products(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "products"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->products(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public purchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    .locals 8
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "purchase"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    if-nez p6, :cond_0

    const/4 p6, 0x0

    goto :goto_0

    .line 94
    :cond_0
    :try_start_0
    invoke-static {p6}, Lcom/qonversion/android/sdk/EntitiesConverter;->convertArrayToStringList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p6

    :goto_0
    move-object v6, p6

    .line 96
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    .line 103
    invoke-static {p7}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 96
    invoke-virtual/range {v0 .. v7}, Lio/qonversion/sandwich/QonversionSandwich;->purchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/qonversion/sandwich/ResultListener;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 105
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 106
    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p7, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public remoteConfig(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "remoteConfig"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p2}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->remoteConfig(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public remoteConfigList(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "remoteConfigList"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 190
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->remoteConfigList(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public remoteConfigListForContextKeys(Lorg/json/JSONArray;ZLorg/apache/cordova/CallbackContext;)V
    .locals 2
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "remoteConfigListForContextKeys"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 196
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/EntitiesConverter;->convertArrayToStringList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    .line 197
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p3}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lio/qonversion/sandwich/QonversionSandwich;->remoteConfigList(Ljava/util/List;ZLio/qonversion/sandwich/ResultListener;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 199
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 200
    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public restore(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "restore"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 180
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->restore(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public setCustomProperty(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "setCustomProperty"
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->setCustomProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public setDefinedProperty(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "setDefinedProperty"
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->setDefinedProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public storeSDKInfo(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "storeSDKInfo"
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->MAIN:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-virtual {v0, p1, p2}, Lio/qonversion/sandwich/QonversionSandwich;->storeSdkInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public syncHistoricalData(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "syncHistoricalData"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-virtual {v0}, Lio/qonversion/sandwich/QonversionSandwich;->syncHistoricalData()V

    .line 45
    invoke-virtual {p1}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public syncPurchases(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "syncPurchases"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-virtual {v0}, Lio/qonversion/sandwich/QonversionSandwich;->syncPurchases()V

    .line 232
    invoke-virtual {p1}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public updatePurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "updatePurchase"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 120
    invoke-virtual/range {p0 .. p7}, Lcom/qonversion/android/sdk/QonversionPlugin;->purchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V

    return-void
.end method

.method public userInfo(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "userInfo"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 248
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->userInfo(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

.method public userProperties(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;
        actionName = "userProperties"
        isAutofinish = false
        thread = .enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionPlugin;->qonversionSandwich:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {p1}, Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->userProperties(Lio/qonversion/sandwich/ResultListener;)V

    return-void
.end method

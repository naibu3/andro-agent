.class public Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;
.super Lorg/apache/cordova/CordovaPlugin;
.source "AnnotatedCordovaPlugin.java"


# static fields
.field private static TAG:Ljava/lang/String; = "AnnotatedCordovaPlugin"


# instance fields
.field private pluginActions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method

.method private getPluginActions()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;",
            ">;"
        }
    .end annotation

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 21
    const-class v5, Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;

    if-eqz v5, :cond_1

    .line 23
    invoke-interface {v5}, Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;->actionName()Ljava/lang/String;

    move-result-object v6

    .line 24
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 25
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    .line 27
    :cond_0
    new-instance v7, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;

    invoke-interface {v5}, Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;->thread()Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    move-result-object v8

    invoke-interface {v5}, Lcom/appfeel/cordova/annotated/android/plugin/PluginAction;->isAutofinish()Z

    move-result v5

    invoke-direct {v7, v4, v8, v5}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;-><init>(Ljava/lang/reflect/Method;Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;Z)V

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x1

    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->pluginActions:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 40
    invoke-direct {p0}, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->getPluginActions()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->pluginActions:Ljava/util/Map;

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->pluginActions:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;

    if-eqz v0, :cond_1

    .line 45
    iget-object p1, p0, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-virtual {v0, p1, p0, p2, p3}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->execute(Lorg/apache/cordova/CordovaInterface;Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z

    move-result p1

    return p1

    .line 48
    :cond_1
    sget-object p2, Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;->TAG:Ljava/lang/String;

    const-string p3, "Unknown plugin action: %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

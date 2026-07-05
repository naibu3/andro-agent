.class public Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;
.super Ljava/lang/Object;
.source "CordovaPluginAction.java"


# static fields
.field private static TAG:Ljava/lang/String; = "CordovaPluginAction"


# instance fields
.field private executionThread:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

.field private isAutofinish:Z

.field private method:Ljava/lang/reflect/Method;


# direct methods
.method static bridge synthetic -$$Nest$fgetisAutofinish(Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->isAutofinish:Z

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetmethod(Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;)Ljava/lang/reflect/Method;
    .locals 0

    iget-object p0, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->method:Ljava/lang/reflect/Method;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$sfgetTAG()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Ljava/lang/reflect/Method;Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;Z)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->method:Ljava/lang/reflect/Method;

    .line 22
    iput-object p2, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->executionThread:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    .line 23
    iput-boolean p3, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->isAutofinish:Z

    return-void
.end method

.method private createRunnable([Ljava/lang/Object;Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;Lorg/apache/cordova/CallbackContext;)Ljava/lang/Runnable;
    .locals 1

    .line 43
    new-instance v0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;-><init>(Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;[Ljava/lang/Object;Lorg/apache/cordova/CallbackContext;)V

    return-object v0
.end method

.method private static getMethodArgs(Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)[Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 27
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    .line 28
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 30
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v3

    .line 31
    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x0

    .line 34
    :cond_0
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 37
    :cond_1
    aput-object p1, v1, v0

    return-object v1
.end method


# virtual methods
.method public execute(Lorg/apache/cordova/CordovaInterface;Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 64
    invoke-static {p3, p4}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->getMethodArgs(Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)[Ljava/lang/Object;

    move-result-object p3

    .line 65
    invoke-direct {p0, p3, p2, p4}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->createRunnable([Ljava/lang/Object;Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;Lorg/apache/cordova/CallbackContext;)Ljava/lang/Runnable;

    move-result-object p2

    .line 66
    iget-object p3, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->executionThread:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    sget-object p4, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    if-ne p3, p4, :cond_0

    .line 67
    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 68
    :cond_0
    iget-object p3, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->executionThread:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    sget-object p4, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    if-ne p3, p4, :cond_1

    .line 69
    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 71
    :cond_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

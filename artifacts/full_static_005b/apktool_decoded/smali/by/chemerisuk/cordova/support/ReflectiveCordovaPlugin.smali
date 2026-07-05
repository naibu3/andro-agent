.class public Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;
.super Lorg/apache/cordova/CordovaPlugin;
.source "ReflectiveCordovaPlugin.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ReflectiveCordovaPlugin"


# instance fields
.field private commandFactories:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/util/Pair<",
            "Ljava/lang/reflect/Method;",
            "Lby/chemerisuk/cordova/support/ExecutionThread;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method

.method private createCommand(Ljava/lang/reflect/Method;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)Ljava/lang/Runnable;
    .locals 1

    .line 70
    new-instance v0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;-><init>(Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;Ljava/lang/reflect/Method;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)V

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/String;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)Z
    .locals 1

    .line 52
    iget-object v0, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;->commandFactories:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Pair;

    if-eqz p1, :cond_2

    .line 55
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-direct {p0, v0, p2, p3}, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;->createCommand(Ljava/lang/reflect/Method;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)Ljava/lang/Runnable;

    move-result-object p2

    .line 56
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lby/chemerisuk/cordova/support/ExecutionThread;

    .line 57
    sget-object p3, Lby/chemerisuk/cordova/support/ExecutionThread;->WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;

    if-ne p1, p3, :cond_0

    .line 58
    iget-object p1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 59
    :cond_0
    sget-object p3, Lby/chemerisuk/cordova/support/ExecutionThread;->UI:Lby/chemerisuk/cordova/support/ExecutionThread;

    if-ne p1, p3, :cond_1

    .line 60
    iget-object p1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 62
    :cond_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 9

    .line 23
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;->commandFactories:Ljava/util/Map;

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    array-length p2, p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_5

    aget-object v2, p1, v1

    .line 25
    const-class v3, Lby/chemerisuk/cordova/support/CordovaMethod;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lby/chemerisuk/cordova/support/CordovaMethod;

    if-nez v3, :cond_0

    goto :goto_2

    .line 28
    :cond_0
    invoke-interface {v3}, Lby/chemerisuk/cordova/support/CordovaMethod;->action()Ljava/lang/String;

    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 30
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    .line 33
    :cond_1
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    .line 34
    array-length v6, v5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_2

    .line 35
    const-class v6, Lorg/apache/cordova/CallbackContext;

    aget-object v5, v5, v0

    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_1

    .line 36
    :cond_2
    array-length v6, v5

    const/4 v8, 0x2

    if-ne v6, v8, :cond_3

    .line 37
    const-class v6, Lorg/apache/cordova/CordovaArgs;

    aget-object v8, v5, v0

    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-class v6, Lorg/apache/cordova/CallbackContext;

    aget-object v5, v5, v7

    .line 38
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v7

    goto :goto_1

    :cond_3
    move v5, v0

    :goto_1
    if-eqz v5, :cond_4

    .line 44
    iget-object v5, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;->commandFactories:Ljava/util/Map;

    new-instance v6, Landroid/util/Pair;

    invoke-interface {v3}, Lby/chemerisuk/cordova/support/CordovaMethod;->value()Lby/chemerisuk/cordova/support/ExecutionThread;

    move-result-object v3

    invoke-direct {v6, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    invoke-virtual {v2, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 41
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Cordova method "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " does not have valid parameters"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method

.class Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;
.super Ljava/lang/Object;
.source "ReflectiveCordovaPlugin.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;->createCommand(Ljava/lang/reflect/Method;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;

.field final synthetic val$args:Lorg/apache/cordova/CordovaArgs;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;

.field final synthetic val$method:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;Ljava/lang/reflect/Method;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 70
    iput-object p1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->this$0:Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;

    iput-object p2, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$method:Ljava/lang/reflect/Method;

    iput-object p3, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$args:Lorg/apache/cordova/CordovaArgs;

    iput-object p4, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 74
    :try_start_0
    const-class v0, Lorg/apache/cordova/CordovaArgs;

    iget-object v1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$method:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$method:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->this$0:Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;

    iget-object v2, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$args:Lorg/apache/cordova/CordovaArgs;

    iget-object v3, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 77
    :cond_0
    iget-object v0, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$method:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->this$0:Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;

    iget-object v2, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 80
    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v1, :cond_1

    .line 81
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    .line 83
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Uncaught exception at "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$method:Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ReflectiveCordovaPlugin"

    invoke-static {v2, v1, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    iget-object v1, p0, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

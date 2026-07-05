.class Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;
.super Ljava/lang/Object;
.source "CordovaPluginAction.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->createRunnable([Ljava/lang/Object;Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;Lorg/apache/cordova/CallbackContext;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;

.field final synthetic val$caller:Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;

.field final synthetic val$mArgs:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;[Ljava/lang/Object;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 43
    iput-object p1, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->this$0:Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;

    iput-object p2, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$caller:Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;

    iput-object p3, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$mArgs:[Ljava/lang/Object;

    iput-object p4, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 47
    :try_start_0
    iget-object v0, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->this$0:Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;

    invoke-static {v0}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->-$$Nest$fgetmethod(Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$caller:Lcom/appfeel/cordova/annotated/android/plugin/AnnotatedCordovaPlugin;

    iget-object v2, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$mArgs:[Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Lorg/apache/cordova/CallbackContext;->isFinished()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->this$0:Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;

    invoke-static {v0}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->-$$Nest$fgetisAutofinish(Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    iget-object v0, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Lorg/apache/cordova/CallbackContext;->success()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 52
    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v1, :cond_0

    .line 53
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    .line 55
    :cond_0
    invoke-static {}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->-$$Nest$sfgetTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Uncaught exception at "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "@"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->this$0:Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;

    invoke-static {v3}, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;->-$$Nest$fgetmethod(Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    iget-object v1, p0, Lcom/appfeel/cordova/annotated/android/plugin/CordovaPluginAction$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.class Lcom/qonversion/android/sdk/AutomationsPlugin$1;
.super Ljava/lang/Object;
.source "AutomationsPlugin.java"

# interfaces
.implements Lio/qonversion/sandwich/ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/AutomationsPlugin;->showScreen(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/qonversion/android/sdk/AutomationsPlugin;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/AutomationsPlugin;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 45
    iput-object p1, p0, Lcom/qonversion/android/sdk/AutomationsPlugin$1;->this$0:Lcom/qonversion/android/sdk/AutomationsPlugin;

    iput-object p2, p0, Lcom/qonversion/android/sdk/AutomationsPlugin$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lio/qonversion/sandwich/SandwichError;)V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/qonversion/android/sdk/AutomationsPlugin$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/Utils;->rejectWithError(Lio/qonversion/sandwich/SandwichError;Lorg/apache/cordova/CallbackContext;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    .line 48
    iget-object p1, p0, Lcom/qonversion/android/sdk/AutomationsPlugin$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

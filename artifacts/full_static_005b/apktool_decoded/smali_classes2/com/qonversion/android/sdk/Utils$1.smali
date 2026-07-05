.class Lcom/qonversion/android/sdk/Utils$1;
.super Ljava/lang/Object;
.source "Utils.java"

# interfaces
.implements Lio/qonversion/sandwich/ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/Utils;->getEmptyResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 18
    iput-object p1, p0, Lcom/qonversion/android/sdk/Utils$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lio/qonversion/sandwich/SandwichError;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/qonversion/android/sdk/Utils$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/Utils;->rejectWithError(Lio/qonversion/sandwich/SandwichError;Lorg/apache/cordova/CallbackContext;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    .line 21
    iget-object p1, p0, Lcom/qonversion/android/sdk/Utils$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    return-void
.end method

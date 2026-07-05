.class Lcom/qonversion/android/sdk/Utils$2;
.super Ljava/lang/Object;
.source "Utils.java"

# interfaces
.implements Lio/qonversion/sandwich/ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/Utils;->getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;
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

    .line 32
    iput-object p1, p0, Lcom/qonversion/android/sdk/Utils$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lio/qonversion/sandwich/SandwichError;)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/qonversion/android/sdk/Utils$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

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

    .line 36
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/EntitiesConverter;->convertMapToJson(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1

    .line 37
    iget-object v0, p0, Lcom/qonversion/android/sdk/Utils$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 39
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/Utils$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.class public Lcom/qonversion/android/sdk/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getEmptyResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;
    .locals 1

    .line 18
    new-instance v0, Lcom/qonversion/android/sdk/Utils$1;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/Utils$1;-><init>(Lorg/apache/cordova/CallbackContext;)V

    return-object v0
.end method

.method static getResultListener(Lorg/apache/cordova/CallbackContext;)Lio/qonversion/sandwich/ResultListener;
    .locals 1

    .line 32
    new-instance v0, Lcom/qonversion/android/sdk/Utils$2;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/Utils$2;-><init>(Lorg/apache/cordova/CallbackContext;)V

    return-object v0
.end method

.method static rejectWithError(Lio/qonversion/sandwich/SandwichError;Lorg/apache/cordova/CallbackContext;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-static {p0, p1, v0}, Lcom/qonversion/android/sdk/Utils;->rejectWithError(Lio/qonversion/sandwich/SandwichError;Lorg/apache/cordova/CallbackContext;Ljava/lang/String;)V

    return-void
.end method

.method static rejectWithError(Lio/qonversion/sandwich/SandwichError;Lorg/apache/cordova/CallbackContext;Ljava/lang/String;)V
    .locals 3

    .line 57
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 58
    const-string v1, "description"

    invoke-virtual {p0}, Lio/qonversion/sandwich/SandwichError;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    const-string v1, "additionalMessage"

    invoke-virtual {p0}, Lio/qonversion/sandwich/SandwichError;->getAdditionalMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    const-string v1, "code"

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lio/qonversion/sandwich/SandwichError;->getCode()Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->error(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 63
    invoke-virtual {p0}, Lorg/json/JSONException;->printStackTrace()V

    .line 64
    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

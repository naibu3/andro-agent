.class public Lnl/xservices/plugins/Insomnia;
.super Lorg/apache/cordova/CordovaPlugin;
.source "Insomnia.java"


# static fields
.field private static final ACTION_ALLOW_SLEEP_AGAIN:Ljava/lang/String; = "allowSleepAgain"

.field private static final ACTION_KEEP_AWAKE:Ljava/lang/String; = "keepAwake"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string p2, " is not a supported function. Did you mean \'keepAwake\'?"

    const-string v0, "insomnia."

    const/4 v1, 0x0

    .line 18
    :try_start_0
    const-string v2, "keepAwake"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 19
    iget-object p1, p0, Lnl/xservices/plugins/Insomnia;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    new-instance p2, Lnl/xservices/plugins/Insomnia$1;

    invoke-direct {p2, p0, p3}, Lnl/xservices/plugins/Insomnia$1;-><init>(Lnl/xservices/plugins/Insomnia;Lorg/apache/cordova/CallbackContext;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v3

    .line 28
    :cond_0
    const-string v2, "allowSleepAgain"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 29
    iget-object p1, p0, Lnl/xservices/plugins/Insomnia;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    new-instance p2, Lnl/xservices/plugins/Insomnia$2;

    invoke-direct {p2, p0, p3}, Lnl/xservices/plugins/Insomnia$2;-><init>(Lnl/xservices/plugins/Insomnia;Lorg/apache/cordova/CallbackContext;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v3

    .line 39
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    return v1
.end method

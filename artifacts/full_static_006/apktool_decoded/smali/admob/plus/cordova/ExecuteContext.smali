.class public Ladmob/plus/cordova/ExecuteContext;
.super Ljava/lang/Object;
.source "ExecuteContext.java"

# interfaces
.implements Ladmob/plus/core/Context;


# static fields
.field public static plugin:Ladmob/plus/cordova/AdMob;


# instance fields
.field public final actionKey:Ljava/lang/String;

.field public final args:Lorg/json/JSONArray;

.field public final callbackContext:Lorg/apache/cordova/CallbackContext;

.field public final opts:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ladmob/plus/cordova/ExecuteContext;->actionKey:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Ladmob/plus/cordova/ExecuteContext;->args:Lorg/json/JSONArray;

    .line 36
    iput-object p3, p0, Ladmob/plus/cordova/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    const/4 p1, 0x0

    .line 37
    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 168
    sget-object v0, Ladmob/plus/cordova/ExecuteContext;->plugin:Ladmob/plus/cordova/AdMob;

    iget-object v0, v0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    return-object v0
.end method

.method public has(Ljava/lang/String;)Z
    .locals 1

    .line 42
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public opt(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 48
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public optAdOrCreate(Ljava/lang/Class;)Ladmob/plus/core/Ad;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ladmob/plus/core/Ad;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 117
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->optAd()Ladmob/plus/core/Ad;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 120
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ladmob/plus/core/Ad;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 122
    :catch_0
    const-string p1, "Wrong ad type"

    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ExecuteContext;->reject(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x1

    .line 127
    :try_start_1
    new-array v0, v0, [Ljava/lang/Class;

    const-class v2, Ladmob/plus/cordova/ExecuteContext;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ladmob/plus/core/Ad;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    .line 129
    :goto_0
    invoke-virtual {p1}, Ljava/lang/ReflectiveOperationException;->printStackTrace()V

    .line 130
    const-string p1, "Fail to create ad"

    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ExecuteContext;->reject(Ljava/lang/String;)V

    return-object v1
.end method

.method public optAdSize()Lcom/google/android/gms/ads/AdSize;
    .locals 4

    .line 137
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    const-string v1, "size"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;

    return-object v0

    .line 140
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 141
    iget-object v2, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ladmob/plus/cordova/ads/Banner$AdSizeType;->getAdSize(I)Lcom/google/android/gms/ads/AdSize;

    move-result-object v1

    if-nez v0, :cond_2

    if-eqz v1, :cond_1

    return-object v1

    .line 146
    :cond_1
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;

    return-object v0

    .line 148
    :cond_2
    const-string v1, "adaptive"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 149
    const-string v2, "width"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    :goto_0
    invoke-static {v2}, Ladmob/plus/core/Helper;->pxToDp(I)I

    move-result v2

    .line 150
    const-string v3, "inline"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 151
    const-string v1, "maxHeight"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 152
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ladmob/plus/core/Helper;->pxToDp(I)I

    move-result v0

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/AdSize;->getInlineAdaptiveBannerAdSize(II)Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    return-object v0

    .line 164
    :cond_4
    new-instance v1, Lcom/google/android/gms/ads/AdSize;

    const-string v3, "height"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ladmob/plus/core/Helper;->pxToDp(I)I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V

    return-object v1

    .line 155
    :cond_5
    const-string v1, "orientation"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const-string v1, "portrait"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "landscape"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 161
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/android/gms/ads/AdSize;->getCurrentOrientationAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    return-object v0

    .line 159
    :cond_6
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/android/gms/ads/AdSize;->getLandscapeAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    return-object v0

    .line 157
    :cond_7
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/android/gms/ads/AdSize;->getPortraitAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    return-object v0
.end method

.method public optBoolean(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 54
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 55
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public optDouble(Ljava/lang/String;)Ljava/lang/Double;
    .locals 2

    .line 61
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 62
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public optInt(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 68
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 69
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public optObject(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 88
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public optOffset()Ljava/lang/Integer;
    .locals 2

    .line 109
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    const-string v1, "offset"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public optString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 76
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public optStringList(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {p1}, Ladmob/plus/core/Helper;->jsonArray2stringList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public reject(Ljava/lang/String;)V
    .locals 1

    .line 104
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    return-void
.end method

.method public resolve()V
    .locals 1

    .line 93
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public resolve(Z)V
    .locals 2

    .line 98
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Z)V

    .line 99
    invoke-virtual {p0, v0}, Ladmob/plus/cordova/ExecuteContext;->sendResult(Lorg/apache/cordova/PluginResult;)V

    return-void
.end method

.method public sendResult(Lorg/apache/cordova/PluginResult;)V
    .locals 1

    .line 172
    iget-object v0, p0, Ladmob/plus/cordova/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    return-void
.end method

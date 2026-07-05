.class public Ladmob/plus/cordova/AdMob;
.super Lorg/apache/cordova/CordovaPlugin;
.source "AdMob.java"

# interfaces
.implements Ladmob/plus/core/Helper$Adapter;


# static fields
.field public static final NATIVE_VIEW_DEFAULT:Ljava/lang/String; = "default"

.field private static final TAG:Ljava/lang/String; = "AdMobPlus"


# instance fields
.field private final eventQueue:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/apache/cordova/PluginResult;",
            ">;"
        }
    .end annotation
.end field

.field public helper:Ladmob/plus/core/Helper;

.field private readyCallbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ladmob/plus/cordova/AdMob;->eventQueue:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Ladmob/plus/cordova/AdMob;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    return-void
.end method

.method static synthetic access$000(Ladmob/plus/cordova/AdMob;)Lorg/apache/cordova/CordovaPreferences;
    .locals 0

    .line 42
    iget-object p0, p0, Ladmob/plus/cordova/AdMob;->preferences:Lorg/apache/cordova/CordovaPreferences;

    return-object p0
.end method

.method private executeAdHide(Ladmob/plus/cordova/ExecuteContext;)Z
    .locals 2

    .line 237
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda2;

    invoke-direct {v1, p1}, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda2;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeAdIsLoaded_(Ladmob/plus/cordova/ExecuteContext;)Z
    .locals 2

    .line 203
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda3;

    invoke-direct {v1, p1}, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda3;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeAdLoad(Ladmob/plus/cordova/ExecuteContext;)Z
    .locals 2

    .line 213
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda1;

    invoke-direct {v1, p1}, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda1;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeAdShow(Ladmob/plus/cordova/ExecuteContext;)Z
    .locals 2

    .line 223
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda4;

    invoke-direct {v1, p1}, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda4;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeReady(Lorg/apache/cordova/CallbackContext;)Z
    .locals 2

    .line 187
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    if-nez v0, :cond_1

    .line 188
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->eventQueue:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/cordova/PluginResult;

    .line 189
    invoke-virtual {p1, v1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto :goto_0

    .line 191
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->eventQueue:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    .line 193
    :cond_1
    const-string v0, "AdMobPlus"

    const-string v1, "Ready action should only be called once."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    :goto_1
    iput-object p1, p0, Ladmob/plus/cordova/AdMob;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    .line 196
    new-instance p1, Ladmob/plus/cordova/AdMob$3;

    invoke-direct {p1, p0}, Ladmob/plus/cordova/AdMob$3;-><init>(Ladmob/plus/cordova/AdMob;)V

    const-string v0, "admob.ready"

    invoke-virtual {p0, v0, p1}, Ladmob/plus/cordova/AdMob;->emit(Ljava/lang/String;Ljava/util/Map;)V

    const/4 p1, 0x1

    return p1
.end method

.method static synthetic lambda$executeAdHide$4(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 1

    .line 238
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->optAdOrError()Ladmob/plus/core/Ad;

    move-result-object v0

    check-cast v0, Ladmob/plus/core/GenericAd;

    if-eqz v0, :cond_0

    .line 240
    invoke-interface {v0, p0}, Ladmob/plus/core/GenericAd;->hide(Ladmob/plus/core/Context;)V

    :cond_0
    return-void
.end method

.method static synthetic lambda$executeAdIsLoaded_$1(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 1

    .line 204
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->optAdOrError()Ladmob/plus/core/Ad;

    move-result-object v0

    check-cast v0, Ladmob/plus/core/GenericAd;

    if-eqz v0, :cond_0

    .line 206
    invoke-interface {v0}, Ladmob/plus/core/GenericAd;->isLoaded()Z

    move-result v0

    invoke-virtual {p0, v0}, Ladmob/plus/cordova/ExecuteContext;->resolve(Z)V

    :cond_0
    return-void
.end method

.method static synthetic lambda$executeAdLoad$2(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 1

    .line 214
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->optAdOrError()Ladmob/plus/core/Ad;

    move-result-object v0

    check-cast v0, Ladmob/plus/core/GenericAd;

    if-eqz v0, :cond_0

    .line 216
    invoke-interface {v0, p0}, Ladmob/plus/core/GenericAd;->load(Ladmob/plus/core/Context;)V

    :cond_0
    return-void
.end method

.method static synthetic lambda$executeAdShow$3(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 2

    .line 224
    invoke-virtual {p0}, Ladmob/plus/cordova/ExecuteContext;->optAdOrError()Ladmob/plus/core/Ad;

    move-result-object v0

    check-cast v0, Ladmob/plus/core/GenericAd;

    if-eqz v0, :cond_1

    .line 226
    invoke-interface {v0}, Ladmob/plus/core/GenericAd;->isLoaded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 227
    invoke-interface {v0, p0}, Ladmob/plus/core/GenericAd;->show(Ladmob/plus/core/Context;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 229
    invoke-virtual {p0, v0}, Ladmob/plus/cordova/ExecuteContext;->resolve(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static registerNativeAdViewProviders(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ladmob/plus/cordova/ads/Native$ViewProvider;",
            ">;)V"
        }
    .end annotation

    .line 50
    sget-object v0, Ladmob/plus/cordova/ads/Native;->providers:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 297
    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Ladmob/plus/cordova/AdMob$4;

    invoke-direct {v1, p0, p1, p2}, Ladmob/plus/cordova/AdMob$4;-><init>(Ladmob/plus/cordova/AdMob;Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 302
    new-instance p1, Lorg/apache/cordova/PluginResult;

    sget-object p2, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {p1, p2, v0}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONObject;)V

    const/4 p2, 0x1

    .line 303
    invoke-virtual {p1, p2}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 304
    iget-object p2, p0, Ladmob/plus/cordova/AdMob;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    if-nez p2, :cond_0

    .line 305
    iget-object p2, p0, Ladmob/plus/cordova/AdMob;->eventQueue:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 307
    :cond_0
    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    :goto_0
    return-void
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 10

    .line 105
    const-string v0, "Execute %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AdMobPlus"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    new-instance v0, Ladmob/plus/cordova/ExecuteContext;

    invoke-direct {v0, p1, p2, p3}, Ladmob/plus/cordova/ExecuteContext;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V

    .line 108
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x6

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    sparse-switch v1, :sswitch_data_0

    :goto_0
    move p1, v9

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "adCreate"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0xa

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "adIsLoaded"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0x9

    goto/16 :goto_1

    :sswitch_2
    const-string v1, "configRequest"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/16 p1, 0x8

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "start"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x7

    goto :goto_1

    :sswitch_4
    const-string v1, "ready"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    move p1, v2

    goto :goto_1

    :sswitch_5
    const-string v1, "configure"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    move p1, v3

    goto :goto_1

    :sswitch_6
    const-string v1, "setAppMuted"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    move p1, v4

    goto :goto_1

    :sswitch_7
    const-string v1, "setAppVolume"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    move p1, v5

    goto :goto_1

    :sswitch_8
    const-string v1, "adShow"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    move p1, v6

    goto :goto_1

    :sswitch_9
    const-string v1, "adLoad"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    move p1, v7

    goto :goto_1

    :sswitch_a
    const-string v1, "adHide"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    move p1, v8

    :goto_1
    packed-switch p1, :pswitch_data_0

    return v8

    .line 124
    :pswitch_0
    const-string p1, "cls"

    invoke-virtual {v0, p1}, Ladmob/plus/cordova/ExecuteContext;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_b

    .line 126
    const-string p1, "ad cls is missing"

    invoke-virtual {v0, p1}, Ladmob/plus/cordova/ExecuteContext;->reject(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 129
    :cond_b
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_1

    :goto_2
    move v2, v9

    goto :goto_3

    :sswitch_b
    const-string p2, "NativeAd"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_2

    :sswitch_c
    const-string p2, "WebViewAd"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_2

    :cond_c
    move v2, v3

    goto :goto_3

    :sswitch_d
    const-string p2, "InterstitialAd"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_2

    :cond_d
    move v2, v4

    goto :goto_3

    :sswitch_e
    const-string p2, "RewardedInterstitialAd"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_2

    :cond_e
    move v2, v5

    goto :goto_3

    :sswitch_f
    const-string p2, "RewardedAd"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_2

    :cond_f
    move v2, v6

    goto :goto_3

    :sswitch_10
    const-string p2, "AppOpenAd"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_2

    :cond_10
    move v2, v7

    goto :goto_3

    :sswitch_11
    const-string p2, "BannerAd"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_2

    :cond_11
    move v2, v8

    :cond_12
    :goto_3
    packed-switch v2, :pswitch_data_1

    const/4 p1, 0x0

    goto :goto_4

    .line 143
    :pswitch_1
    new-instance p1, Ladmob/plus/cordova/ads/Native;

    invoke-direct {p1, v0}, Ladmob/plus/cordova/ads/Native;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    goto :goto_4

    .line 131
    :pswitch_2
    new-instance p1, Ladmob/plus/cordova/ads/WebViewAd;

    invoke-direct {p1, v0}, Ladmob/plus/cordova/ads/WebViewAd;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    goto :goto_4

    .line 140
    :pswitch_3
    new-instance p1, Ladmob/plus/cordova/ads/Interstitial;

    invoke-direct {p1, v0}, Ladmob/plus/cordova/ads/Interstitial;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    goto :goto_4

    .line 149
    :pswitch_4
    new-instance p1, Ladmob/plus/cordova/ads/RewardedInterstitial;

    invoke-direct {p1, v0}, Ladmob/plus/cordova/ads/RewardedInterstitial;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    goto :goto_4

    .line 146
    :pswitch_5
    new-instance p1, Ladmob/plus/cordova/ads/Rewarded;

    invoke-direct {p1, v0}, Ladmob/plus/cordova/ads/Rewarded;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    goto :goto_4

    .line 134
    :pswitch_6
    new-instance p1, Ladmob/plus/cordova/ads/AppOpen;

    invoke-direct {p1, v0}, Ladmob/plus/cordova/ads/AppOpen;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    goto :goto_4

    .line 137
    :pswitch_7
    new-instance p1, Ladmob/plus/cordova/ads/Banner;

    invoke-direct {p1, v0}, Ladmob/plus/cordova/ads/Banner;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    :goto_4
    if-eqz p1, :cond_13

    .line 153
    invoke-virtual {v0}, Ladmob/plus/cordova/ExecuteContext;->resolve()V

    goto :goto_5

    .line 155
    :cond_13
    const-string p1, "ad cls is not supported"

    invoke-virtual {v0, p1}, Ladmob/plus/cordova/ExecuteContext;->reject(Ljava/lang/String;)V

    goto :goto_5

    .line 160
    :pswitch_8
    invoke-direct {p0, v0}, Ladmob/plus/cordova/AdMob;->executeAdIsLoaded_(Ladmob/plus/cordova/ExecuteContext;)Z

    move-result p1

    return p1

    .line 112
    :pswitch_9
    iget-object p1, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    new-instance p2, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0, p3}, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda0;-><init>(Ladmob/plus/cordova/AdMob;Lorg/apache/cordova/CallbackContext;)V

    invoke-static {p1, p2}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;)V

    goto :goto_5

    .line 110
    :pswitch_a
    invoke-direct {p0, p3}, Ladmob/plus/cordova/AdMob;->executeReady(Lorg/apache/cordova/CallbackContext;)Z

    move-result p1

    return p1

    .line 121
    :pswitch_b
    iget-object p1, p0, Ladmob/plus/cordova/AdMob;->helper:Ladmob/plus/core/Helper;

    invoke-virtual {v0, p1}, Ladmob/plus/cordova/ExecuteContext;->configure(Ladmob/plus/core/Helper;)V

    goto :goto_5

    .line 168
    :pswitch_c
    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->optBoolean(I)Z

    move-result p1

    .line 169
    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->setAppMuted(Z)V

    .line 170
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V

    goto :goto_5

    .line 174
    :pswitch_d
    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigDecimal;->floatValue()F

    move-result p1

    .line 175
    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->setAppVolume(F)V

    .line 176
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V

    :goto_5
    return v7

    .line 164
    :pswitch_e
    invoke-direct {p0, v0}, Ladmob/plus/cordova/AdMob;->executeAdShow(Ladmob/plus/cordova/ExecuteContext;)Z

    move-result p1

    return p1

    .line 162
    :pswitch_f
    invoke-direct {p0, v0}, Ladmob/plus/cordova/AdMob;->executeAdLoad(Ladmob/plus/cordova/ExecuteContext;)Z

    move-result p1

    return p1

    .line 166
    :pswitch_10
    invoke-direct {p0, v0}, Ladmob/plus/cordova/AdMob;->executeAdHide(Ladmob/plus/cordova/ExecuteContext;)Z

    move-result p1

    return p1

    :sswitch_data_0
    .sparse-switch
        -0x54d66bfb -> :sswitch_a
        -0x54d48457 -> :sswitch_9
        -0x54d16e40 -> :sswitch_8
        -0x46035da7 -> :sswitch_7
        -0x44ceadb4 -> :sswitch_6
        -0x2ff29d1a -> :sswitch_5
        0x675d9a3 -> :sswitch_4
        0x68ac462 -> :sswitch_3
        0x226c38ed -> :sswitch_2
        0x652bbf12 -> :sswitch_1
        0x7f0bb2ff -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_b
        :pswitch_8
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x6ac32f71 -> :sswitch_11
        -0x36399292 -> :sswitch_10
        -0x24589b0f -> :sswitch_f
        -0x205f17c3 -> :sswitch_e
        0x1315208f -> :sswitch_d
        0x37f335fc -> :sswitch_c
        0x7dc912ba -> :sswitch_b
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 292
    iget-object v0, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    return-object v0
.end method

.method public initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 1

    .line 55
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaPlugin;->initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 56
    iget-object p1, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    new-instance v0, Ladmob/plus/cordova/AdMob$1;

    invoke-direct {v0, p0, p2}, Ladmob/plus/cordova/AdMob$1;-><init>(Ladmob/plus/cordova/AdMob;Lorg/apache/cordova/CordovaWebView;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method synthetic lambda$execute$0$admob-plus-cordova-AdMob(Lorg/apache/cordova/CallbackContext;Lcom/google/android/gms/ads/initialization/InitializationStatus;)V
    .locals 1

    .line 113
    iget-object p2, p0, Ladmob/plus/cordova/AdMob;->helper:Ladmob/plus/core/Helper;

    invoke-virtual {p2}, Ladmob/plus/core/Helper;->configForTestLab()V

    .line 114
    new-instance p2, Lorg/json/JSONObject;

    new-instance v0, Ladmob/plus/cordova/AdMob$2;

    invoke-direct {v0, p0}, Ladmob/plus/cordova/AdMob$2;-><init>(Ladmob/plus/cordova/AdMob;)V

    invoke-direct {p2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, p2}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 248
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaPlugin;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 250
    sget-object v0, Ladmob/plus/core/Helper;->ads:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 251
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ladmob/plus/cordova/ads/AdBase;

    .line 252
    invoke-virtual {v1, p1}, Ladmob/plus/cordova/ads/AdBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    const/4 v0, 0x0

    .line 277
    iput-object v0, p0, Ladmob/plus/cordova/AdMob;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    .line 278
    sget-object v0, Ladmob/plus/core/Helper;->ads:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 279
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 280
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 281
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ladmob/plus/cordova/ads/AdBase;

    .line 282
    invoke-virtual {v1}, Ladmob/plus/cordova/ads/AdBase;->onDestroy()V

    goto :goto_0

    .line 285
    :cond_0
    invoke-static {}, Ladmob/plus/cordova/ads/Banner;->destroyParentView()V

    .line 287
    invoke-super {p0}, Lorg/apache/cordova/CordovaPlugin;->onDestroy()V

    return-void
.end method

.method public onOverrideUrlLoading(Ljava/lang/String;)Z
    .locals 7

    const-string v0, "Open Iframe URL to browser "

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onOverrideUrlLoading called with URL "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AdMobPlus"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    .line 84
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 88
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 89
    const-string v5, "http"

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "https"

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    return v1

    .line 90
    :cond_1
    :goto_0
    iget-object v4, p0, Ladmob/plus/cordova/AdMob;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroidx/appcompat/app/AppCompatActivity;->startActivity(Landroid/content/Intent;)V

    .line 91
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v0

    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "onOverrideUrlLoading: Error loading url "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v3, ":"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method public onPause(Z)V
    .locals 2

    .line 258
    sget-object v0, Ladmob/plus/core/Helper;->ads:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 259
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ladmob/plus/cordova/ads/AdBase;

    .line 260
    invoke-virtual {v1, p1}, Ladmob/plus/cordova/ads/AdBase;->onPause(Z)V

    goto :goto_0

    .line 262
    :cond_0
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaPlugin;->onPause(Z)V

    return-void
.end method

.method public onResume(Z)V
    .locals 2

    .line 267
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaPlugin;->onResume(Z)V

    .line 268
    sget-object v0, Ladmob/plus/core/Helper;->ads:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 269
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ladmob/plus/cordova/ads/AdBase;

    .line 270
    invoke-virtual {v1, p1}, Ladmob/plus/cordova/ads/AdBase;->onResume(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected pluginInitialize()V
    .locals 2

    .line 72
    invoke-super {p0}, Lorg/apache/cordova/CordovaPlugin;->pluginInitialize()V

    .line 73
    const-string v0, "AdMobPlus"

    const-string v1, "Initialize plugin"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    new-instance v0, Ladmob/plus/core/Helper;

    invoke-direct {v0, p0}, Ladmob/plus/core/Helper;-><init>(Ladmob/plus/core/Helper$Adapter;)V

    iput-object v0, p0, Ladmob/plus/cordova/AdMob;->helper:Ladmob/plus/core/Helper;

    .line 76
    sput-object p0, Ladmob/plus/cordova/ExecuteContext;->plugin:Ladmob/plus/cordova/AdMob;

    return-void
.end method

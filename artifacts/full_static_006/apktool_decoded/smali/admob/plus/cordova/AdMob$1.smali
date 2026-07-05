.class Ladmob/plus/cordova/AdMob$1;
.super Ljava/lang/Object;
.source "AdMob.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/AdMob;->initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ladmob/plus/cordova/AdMob;

.field final synthetic val$cordovaWebView:Lorg/apache/cordova/CordovaWebView;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/AdMob;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 56
    iput-object p1, p0, Ladmob/plus/cordova/AdMob$1;->this$0:Ladmob/plus/cordova/AdMob;

    iput-object p2, p0, Ladmob/plus/cordova/AdMob$1;->val$cordovaWebView:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 59
    iget-object v0, p0, Ladmob/plus/cordova/AdMob$1;->this$0:Ladmob/plus/cordova/AdMob;

    invoke-static {v0}, Ladmob/plus/cordova/AdMob;->access$000(Ladmob/plus/cordova/AdMob;)Lorg/apache/cordova/CordovaPreferences;

    move-result-object v0

    const-string v1, "AdMobPlusWebViewAd"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/CordovaPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Ladmob/plus/cordova/AdMob$1;->val$cordovaWebView:Lorg/apache/cordova/CordovaWebView;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaWebView;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 62
    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->registerWebView(Landroid/webkit/WebView;)V

    .line 63
    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Integrated the WebView API for Ads in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " WebView"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AdMobPlus"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

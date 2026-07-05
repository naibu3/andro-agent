.class public Lcom/ionicframework/cordova/webview/IonicWebViewEngine;
.super Lorg/apache/cordova/engine/SystemWebViewEngine;
.source "IonicWebViewEngine.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ionicframework/cordova/webview/IonicWebViewEngine$ServerClient;
    }
.end annotation


# static fields
.field private static final LAST_BINARY_VERSION_CODE:Ljava/lang/String; = "lastBinaryVersionCode"

.field private static final LAST_BINARY_VERSION_NAME:Ljava/lang/String; = "lastBinaryVersionName"

.field public static final TAG:Ljava/lang/String; = "IonicWebViewEngine"


# instance fields
.field private CDV_LOCAL_SERVER:Ljava/lang/String;

.field private localServer:Lcom/ionicframework/cordova/webview/WebViewLocalServer;

.field private scheme:Ljava/lang/String;


# direct methods
.method static bridge synthetic -$$Nest$fgetCDV_LOCAL_SERVER(Lcom/ionicframework/cordova/webview/IonicWebViewEngine;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->CDV_LOCAL_SERVER:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetlocalServer(Lcom/ionicframework/cordova/webview/IonicWebViewEngine;)Lcom/ionicframework/cordova/webview/WebViewLocalServer;
    .locals 0

    iget-object p0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->localServer:Lcom/ionicframework/cordova/webview/WebViewLocalServer;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetscheme(Lcom/ionicframework/cordova/webview/IonicWebViewEngine;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->scheme:Ljava/lang/String;

    return-object p0
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/apache/cordova/CordovaPreferences;)V
    .locals 1

    .line 42
    new-instance v0, Lorg/apache/cordova/engine/SystemWebView;

    invoke-direct {v0, p1}, Lorg/apache/cordova/engine/SystemWebView;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lorg/apache/cordova/engine/SystemWebViewEngine;-><init>(Lorg/apache/cordova/engine/SystemWebView;Lorg/apache/cordova/CordovaPreferences;)V

    .line 43
    const-string p1, "IonicWebViewEngine"

    const-string p2, "Ionic Web View Engine Starting Right Up 1..."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/engine/SystemWebView;)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/engine/SystemWebViewEngine;-><init>(Lorg/apache/cordova/engine/SystemWebView;Lorg/apache/cordova/CordovaPreferences;)V

    .line 48
    const-string p1, "IonicWebViewEngine"

    const-string v0, "Ionic Web View Engine Starting Right Up 2..."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/engine/SystemWebView;Lorg/apache/cordova/CordovaPreferences;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lorg/apache/cordova/engine/SystemWebViewEngine;-><init>(Lorg/apache/cordova/engine/SystemWebView;Lorg/apache/cordova/CordovaPreferences;)V

    .line 53
    const-string p1, "IonicWebViewEngine"

    const-string p2, "Ionic Web View Engine Starting Right Up 3..."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private isDeployDisabled()Z
    .locals 3

    .line 125
    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string v1, "DisableDeploy"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/CordovaPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private isNewBinary()Z
    .locals 11

    .line 99
    const-string v0, ""

    .line 101
    iget-object v1, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "WebViewSettings"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 102
    const-string v2, "lastBinaryVersionCode"

    const/4 v4, 0x0

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 103
    const-string v6, "lastBinaryVersionName"

    invoke-interface {v1, v6, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 106
    :try_start_0
    iget-object v7, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v7}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/appcompat/app/AppCompatActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    iget-object v8, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v8}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/appcompat/app/AppCompatActivity;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7

    .line 107
    iget v8, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 108
    :try_start_1
    iget-object v7, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v7

    goto :goto_0

    :catch_1
    move-exception v7

    move-object v8, v0

    .line 110
    :goto_0
    const-string v9, "IonicWebViewEngine"

    const-string v10, "Unable to get package info"

    invoke-static {v9, v10, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v7, v0

    .line 113
    :goto_1
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    return v3

    .line 114
    :cond_1
    :goto_2
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 115
    invoke-interface {v1, v2, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 116
    invoke-interface {v1, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 117
    const-string v2, "serverBasePath"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 118
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public getServerBasePath()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->localServer:Lcom/ionicframework/cordova/webview/WebViewLocalServer;

    invoke-virtual {v0}, Lcom/ionicframework/cordova/webview/WebViewLocalServer;->getBasePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public init(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebViewEngine$Client;Lorg/apache/cordova/CordovaResourceApi;Lorg/apache/cordova/PluginManager;Lorg/apache/cordova/NativeToJsMessageQueue;)V
    .locals 8

    .line 60
    new-instance v6, Lorg/apache/cordova/ConfigXmlParser;

    invoke-direct {v6}, Lorg/apache/cordova/ConfigXmlParser;-><init>()V

    .line 61
    invoke-interface {p2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/apache/cordova/ConfigXmlParser;->parse(Landroid/content/Context;)V

    .line 63
    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string v1, "Hostname"

    const-string v2, "localhost"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/CordovaPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 64
    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string v1, "Scheme"

    const-string v3, "http"

    invoke-virtual {v0, v1, v3}, Lorg/apache/cordova/CordovaPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->scheme:Ljava/lang/String;

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->scheme:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->CDV_LOCAL_SERVER:Ljava/lang/String;

    .line 67
    new-instance v7, Lcom/ionicframework/cordova/webview/WebViewLocalServer;

    invoke-interface {p2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    const/4 v3, 0x1

    iget-object v5, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->scheme:Ljava/lang/String;

    move-object v0, v7

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lcom/ionicframework/cordova/webview/WebViewLocalServer;-><init>(Landroid/content/Context;Ljava/lang/String;ZLorg/apache/cordova/ConfigXmlParser;Ljava/lang/String;)V

    iput-object v7, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->localServer:Lcom/ionicframework/cordova/webview/WebViewLocalServer;

    .line 68
    const-string v0, "www"

    invoke-virtual {v7, v0}, Lcom/ionicframework/cordova/webview/WebViewLocalServer;->hostAssets(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->webView:Lorg/apache/cordova/engine/SystemWebView;

    new-instance v1, Lcom/ionicframework/cordova/webview/IonicWebViewEngine$ServerClient;

    invoke-direct {v1, p0, p0, v6}, Lcom/ionicframework/cordova/webview/IonicWebViewEngine$ServerClient;-><init>(Lcom/ionicframework/cordova/webview/IonicWebViewEngine;Lorg/apache/cordova/engine/SystemWebViewEngine;Lorg/apache/cordova/ConfigXmlParser;)V

    invoke-virtual {v0, v1}, Lorg/apache/cordova/engine/SystemWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 72
    invoke-super/range {p0 .. p6}, Lorg/apache/cordova/engine/SystemWebViewEngine;->init(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebViewEngine$Client;Lorg/apache/cordova/CordovaResourceApi;Lorg/apache/cordova/PluginManager;Lorg/apache/cordova/NativeToJsMessageQueue;)V

    .line 74
    iget-object p1, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->webView:Lorg/apache/cordova/engine/SystemWebView;

    invoke-virtual {p1}, Lorg/apache/cordova/engine/SystemWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    .line 75
    iget-object p3, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string p4, "MixedContentMode"

    const/4 p5, 0x0

    invoke-virtual {p3, p4, p5}, Lorg/apache/cordova/CordovaPreferences;->getInteger(Ljava/lang/String;I)I

    move-result p3

    .line 76
    invoke-virtual {p1, p3}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 78
    invoke-interface {p2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "WebViewSettings"

    invoke-virtual {p1, p2, p5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 79
    const-string p2, "serverBasePath"

    const/4 p3, 0x0

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 80
    invoke-direct {p0}, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->isDeployDisabled()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-direct {p0}, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->isNewBinary()Z

    move-result p2

    if-nez p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 81
    invoke-virtual {p0, p1}, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->setServerBasePath(Ljava/lang/String;)V

    .line 84
    :cond_0
    iget-object p1, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string p2, "ResolveServiceWorkerRequests"

    invoke-virtual {p1, p2, p5}, Lorg/apache/cordova/CordovaPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 88
    invoke-static {}, Landroid/webkit/ServiceWorkerController;->getInstance()Landroid/webkit/ServiceWorkerController;

    move-result-object p1

    .line 89
    new-instance p2, Lcom/ionicframework/cordova/webview/IonicWebViewEngine$1;

    invoke-direct {p2, p0}, Lcom/ionicframework/cordova/webview/IonicWebViewEngine$1;-><init>(Lcom/ionicframework/cordova/webview/IonicWebViewEngine;)V

    invoke-virtual {p1, p2}, Landroid/webkit/ServiceWorkerController;->setServiceWorkerClient(Landroid/webkit/ServiceWorkerClient;)V

    :cond_1
    return-void
.end method

.method public setServerBasePath(Ljava/lang/String;)V
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->localServer:Lcom/ionicframework/cordova/webview/WebViewLocalServer;

    invoke-virtual {v0, p1}, Lcom/ionicframework/cordova/webview/WebViewLocalServer;->hostFiles(Ljava/lang/String;)V

    .line 166
    iget-object p1, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->webView:Lorg/apache/cordova/engine/SystemWebView;

    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->CDV_LOCAL_SERVER:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lorg/apache/cordova/engine/SystemWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.class Lcom/ionicframework/cordova/webview/IonicWebViewEngine$1;
.super Landroid/webkit/ServiceWorkerClient;
.source "IonicWebViewEngine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->init(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebViewEngine$Client;Lorg/apache/cordova/CordovaResourceApi;Lorg/apache/cordova/PluginManager;Lorg/apache/cordova/NativeToJsMessageQueue;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ionicframework/cordova/webview/IonicWebViewEngine;


# direct methods
.method constructor <init>(Lcom/ionicframework/cordova/webview/IonicWebViewEngine;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine$1;->this$0:Lcom/ionicframework/cordova/webview/IonicWebViewEngine;

    invoke-direct {p0}, Landroid/webkit/ServiceWorkerClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/ionicframework/cordova/webview/IonicWebViewEngine$1;->this$0:Lcom/ionicframework/cordova/webview/IonicWebViewEngine;

    invoke-static {v0}, Lcom/ionicframework/cordova/webview/IonicWebViewEngine;->-$$Nest$fgetlocalServer(Lcom/ionicframework/cordova/webview/IonicWebViewEngine;)Lcom/ionicframework/cordova/webview/WebViewLocalServer;

    move-result-object v0

    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/ionicframework/cordova/webview/WebViewLocalServer;->shouldInterceptRequest(Landroid/net/Uri;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

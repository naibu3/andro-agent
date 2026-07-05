.class public abstract Ladmob/plus/cordova/ads/AdBase;
.super Ladmob/plus/core/Ad;
.source "AdBase.java"

# interfaces
.implements Ladmob/plus/core/GenericAd;


# instance fields
.field protected adRequest:Lcom/google/android/gms/ads/AdRequest;


# direct methods
.method public constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Ladmob/plus/core/Ad;-><init>(Ladmob/plus/core/Context;)V

    .line 22
    invoke-virtual {p1}, Ladmob/plus/cordova/ExecuteContext;->optAdRequest()Lcom/google/android/gms/ads/AdRequest;

    move-result-object p1

    iput-object p1, p0, Ladmob/plus/cordova/ads/AdBase;->adRequest:Lcom/google/android/gms/ads/AdRequest;

    return-void
.end method


# virtual methods
.method protected getAdapter()Ladmob/plus/core/Helper$Adapter;
    .locals 1

    .line 52
    sget-object v0, Ladmob/plus/cordova/ExecuteContext;->plugin:Ladmob/plus/cordova/AdMob;

    return-object v0
.end method

.method protected getCordovaWebView()Lorg/apache/cordova/CordovaWebView;
    .locals 1

    .line 39
    sget-object v0, Ladmob/plus/cordova/ExecuteContext;->plugin:Ladmob/plus/cordova/AdMob;

    iget-object v0, v0, Ladmob/plus/cordova/AdMob;->webView:Lorg/apache/cordova/CordovaWebView;

    return-object v0
.end method

.method protected getWebView()Landroid/view/View;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/AdBase;->getCordovaWebView()Lorg/apache/cordova/CordovaWebView;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/cordova/CordovaWebView;->getView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected getWebViewParent()Landroid/view/ViewGroup;
    .locals 1

    .line 47
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/AdBase;->getWebView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 35
    invoke-super {p0}, Ladmob/plus/core/Ad;->destroy()V

    return-void
.end method

.method public onPause(Z)V
    .locals 0

    return-void
.end method

.method public onResume(Z)V
    .locals 0

    return-void
.end method

.class public Ladmob/plus/cordova/ads/WebViewAd;
.super Ladmob/plus/cordova/ads/AdBase;
.source "WebViewAd.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AdMobPlus.WebViewAd"


# direct methods
.method public constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 1

    .line 12
    invoke-direct {p0, p1}, Ladmob/plus/cordova/ads/AdBase;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    .line 13
    const-string p1, "AdMobPlus.WebViewAd"

    const-string v0, "WebViewAd"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public hide(Ladmob/plus/core/Context;)V
    .locals 0

    .line 33
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public isLoaded()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public load(Ladmob/plus/core/Context;)V
    .locals 0

    .line 23
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public show(Ladmob/plus/core/Context;)V
    .locals 0

    .line 28
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

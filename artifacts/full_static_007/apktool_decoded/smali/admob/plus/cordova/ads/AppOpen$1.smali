.class Ladmob/plus/cordova/ads/AppOpen$1;
.super Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;
.source "AppOpen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/ads/AppOpen;->load(Ladmob/plus/core/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ladmob/plus/cordova/ads/AppOpen;

.field final synthetic val$ctx:Ladmob/plus/core/Context;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/ads/AppOpen;Ladmob/plus/core/Context;)V
    .locals 0

    .line 41
    iput-object p1, p0, Ladmob/plus/cordova/ads/AppOpen$1;->this$0:Ladmob/plus/cordova/ads/AppOpen;

    iput-object p2, p0, Ladmob/plus/cordova/ads/AppOpen$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-direct {p0}, Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    .line 75
    iget-object v0, p0, Ladmob/plus/cordova/ads/AppOpen$1;->this$0:Ladmob/plus/cordova/ads/AppOpen;

    invoke-static {v0}, Ladmob/plus/cordova/ads/AppOpen;->-$$Nest$mclear(Ladmob/plus/cordova/ads/AppOpen;)V

    .line 76
    iget-object v0, p0, Ladmob/plus/cordova/ads/AppOpen$1;->this$0:Ladmob/plus/cordova/ads/AppOpen;

    const-string v1, "admob.ad.loadfail"

    invoke-static {v0, v1, p1}, Ladmob/plus/cordova/ads/AppOpen;->access$500(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    .line 77
    iget-object v0, p0, Ladmob/plus/cordova/ads/AppOpen$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/LoadAdError;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/appopen/AppOpenAd;)V
    .locals 1

    .line 44
    iget-object v0, p0, Ladmob/plus/cordova/ads/AppOpen$1;->this$0:Ladmob/plus/cordova/ads/AppOpen;

    invoke-static {v0, p1}, Ladmob/plus/cordova/ads/AppOpen;->-$$Nest$fputmAd(Ladmob/plus/cordova/ads/AppOpen;Lcom/google/android/gms/ads/appopen/AppOpenAd;)V

    .line 45
    new-instance v0, Ladmob/plus/cordova/ads/AppOpen$1$1;

    invoke-direct {v0, p0}, Ladmob/plus/cordova/ads/AppOpen$1$1;-><init>(Ladmob/plus/cordova/ads/AppOpen$1;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/appopen/AppOpenAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 69
    iget-object p1, p0, Ladmob/plus/cordova/ads/AppOpen$1;->this$0:Ladmob/plus/cordova/ads/AppOpen;

    const-string v0, "admob.ad.load"

    invoke-static {p1, v0}, Ladmob/plus/cordova/ads/AppOpen;->access$400(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;)V

    .line 70
    iget-object p1, p0, Ladmob/plus/cordova/ads/AppOpen$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 41
    check-cast p1, Lcom/google/android/gms/ads/appopen/AppOpenAd;

    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/AppOpen$1;->onAdLoaded(Lcom/google/android/gms/ads/appopen/AppOpenAd;)V

    return-void
.end method

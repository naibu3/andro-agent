.class Ladmob/plus/cordova/ads/Interstitial$1;
.super Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;
.source "Interstitial.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/ads/Interstitial;->load(Ladmob/plus/core/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ladmob/plus/cordova/ads/Interstitial;

.field final synthetic val$ctx:Ladmob/plus/core/Context;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/ads/Interstitial;Ladmob/plus/core/Context;)V
    .locals 0

    .line 34
    iput-object p1, p0, Ladmob/plus/cordova/ads/Interstitial$1;->this$0:Ladmob/plus/cordova/ads/Interstitial;

    iput-object p2, p0, Ladmob/plus/cordova/ads/Interstitial$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-direct {p0}, Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    .line 67
    iget-object v0, p0, Ladmob/plus/cordova/ads/Interstitial$1;->this$0:Ladmob/plus/cordova/ads/Interstitial;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Interstitial;->-$$Nest$fputmAd(Ladmob/plus/cordova/ads/Interstitial;Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V

    .line 68
    iget-object v0, p0, Ladmob/plus/cordova/ads/Interstitial$1;->this$0:Ladmob/plus/cordova/ads/Interstitial;

    const-string v1, "admob.ad.loadfail"

    invoke-static {v0, v1, p1}, Ladmob/plus/cordova/ads/Interstitial;->access$500(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    .line 69
    iget-object v0, p0, Ladmob/plus/cordova/ads/Interstitial$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/LoadAdError;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V
    .locals 1

    .line 37
    iget-object v0, p0, Ladmob/plus/cordova/ads/Interstitial$1;->this$0:Ladmob/plus/cordova/ads/Interstitial;

    invoke-static {v0, p1}, Ladmob/plus/cordova/ads/Interstitial;->-$$Nest$fputmAd(Ladmob/plus/cordova/ads/Interstitial;Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V

    .line 38
    iget-object p1, p0, Ladmob/plus/cordova/ads/Interstitial$1;->this$0:Ladmob/plus/cordova/ads/Interstitial;

    invoke-static {p1}, Ladmob/plus/cordova/ads/Interstitial;->-$$Nest$fgetmAd(Ladmob/plus/cordova/ads/Interstitial;)Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    move-result-object p1

    new-instance v0, Ladmob/plus/cordova/ads/Interstitial$1$1;

    invoke-direct {v0, p0}, Ladmob/plus/cordova/ads/Interstitial$1$1;-><init>(Ladmob/plus/cordova/ads/Interstitial$1;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 61
    iget-object p1, p0, Ladmob/plus/cordova/ads/Interstitial$1;->this$0:Ladmob/plus/cordova/ads/Interstitial;

    const-string v0, "admob.ad.load"

    invoke-static {p1, v0}, Ladmob/plus/cordova/ads/Interstitial;->access$400(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;)V

    .line 62
    iget-object p1, p0, Ladmob/plus/cordova/ads/Interstitial$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 34
    check-cast p1, Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Interstitial$1;->onAdLoaded(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V

    return-void
.end method

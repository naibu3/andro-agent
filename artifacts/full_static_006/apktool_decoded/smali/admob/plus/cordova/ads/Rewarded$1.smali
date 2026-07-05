.class Ladmob/plus/cordova/ads/Rewarded$1;
.super Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;
.source "Rewarded.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/ads/Rewarded;->load(Ladmob/plus/core/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ladmob/plus/cordova/ads/Rewarded;

.field final synthetic val$ctx:Ladmob/plus/core/Context;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/ads/Rewarded;Ladmob/plus/core/Context;)V
    .locals 0

    .line 35
    iput-object p1, p0, Ladmob/plus/cordova/ads/Rewarded$1;->this$0:Ladmob/plus/cordova/ads/Rewarded;

    iput-object p2, p0, Ladmob/plus/cordova/ads/Rewarded$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-direct {p0}, Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    .line 38
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded$1;->this$0:Ladmob/plus/cordova/ads/Rewarded;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Rewarded;->-$$Nest$fputmAd(Ladmob/plus/cordova/ads/Rewarded;Lcom/google/android/gms/ads/rewarded/RewardedAd;)V

    .line 39
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded$1;->this$0:Ladmob/plus/cordova/ads/Rewarded;

    const-string v1, "admob.ad.loadfail"

    invoke-static {v0, v1, p1}, Ladmob/plus/cordova/ads/Rewarded;->access$000(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    .line 40
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/LoadAdError;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V
    .locals 1

    .line 45
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded$1;->this$0:Ladmob/plus/cordova/ads/Rewarded;

    invoke-static {v0, p1}, Ladmob/plus/cordova/ads/Rewarded;->-$$Nest$fputmAd(Ladmob/plus/cordova/ads/Rewarded;Lcom/google/android/gms/ads/rewarded/RewardedAd;)V

    .line 46
    iget-object p1, p0, Ladmob/plus/cordova/ads/Rewarded$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-interface {p1}, Ladmob/plus/core/Context;->optServerSideVerificationOptions()Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 48
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded$1;->this$0:Ladmob/plus/cordova/ads/Rewarded;

    invoke-static {v0}, Ladmob/plus/cordova/ads/Rewarded;->-$$Nest$fgetmAd(Ladmob/plus/cordova/ads/Rewarded;)Lcom/google/android/gms/ads/rewarded/RewardedAd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->setServerSideVerificationOptions(Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;)V

    .line 50
    :cond_0
    iget-object p1, p0, Ladmob/plus/cordova/ads/Rewarded$1;->this$0:Ladmob/plus/cordova/ads/Rewarded;

    invoke-static {p1}, Ladmob/plus/cordova/ads/Rewarded;->-$$Nest$fgetmAd(Ladmob/plus/cordova/ads/Rewarded;)Lcom/google/android/gms/ads/rewarded/RewardedAd;

    move-result-object p1

    new-instance v0, Ladmob/plus/cordova/ads/Rewarded$1$1;

    invoke-direct {v0, p0}, Ladmob/plus/cordova/ads/Rewarded$1$1;-><init>(Ladmob/plus/cordova/ads/Rewarded$1;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 73
    iget-object p1, p0, Ladmob/plus/cordova/ads/Rewarded$1;->this$0:Ladmob/plus/cordova/ads/Rewarded;

    const-string v0, "admob.ad.load"

    invoke-static {p1, v0}, Ladmob/plus/cordova/ads/Rewarded;->access$500(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;)V

    .line 74
    iget-object p1, p0, Ladmob/plus/cordova/ads/Rewarded$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 35
    check-cast p1, Lcom/google/android/gms/ads/rewarded/RewardedAd;

    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Rewarded$1;->onAdLoaded(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V

    return-void
.end method

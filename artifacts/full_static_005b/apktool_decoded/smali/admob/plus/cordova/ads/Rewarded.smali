.class public Ladmob/plus/cordova/ads/Rewarded;
.super Ladmob/plus/cordova/ads/AdBase;
.source "Rewarded.java"


# instance fields
.field private mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;


# direct methods
.method static bridge synthetic -$$Nest$fgetmAd(Ladmob/plus/cordova/ads/Rewarded;)Lcom/google/android/gms/ads/rewarded/RewardedAd;
    .locals 0

    iget-object p0, p0, Ladmob/plus/cordova/ads/Rewarded;->mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputmAd(Ladmob/plus/cordova/ads/Rewarded;Lcom/google/android/gms/ads/rewarded/RewardedAd;)V
    .locals 0

    iput-object p1, p0, Ladmob/plus/cordova/ads/Rewarded;->mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    return-void
.end method

.method static bridge synthetic -$$Nest$mclear(Ladmob/plus/cordova/ads/Rewarded;)V
    .locals 0

    invoke-direct {p0}, Ladmob/plus/cordova/ads/Rewarded;->clear()V

    return-void
.end method

.method public constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Ladmob/plus/cordova/ads/AdBase;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Ladmob/plus/cordova/ads/Rewarded;->mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    return-void
.end method

.method static synthetic access$000(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Rewarded;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method static synthetic access$100(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Rewarded;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Rewarded;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method static synthetic access$300(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Rewarded;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Rewarded;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Ladmob/plus/cordova/ads/Rewarded;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Rewarded;->emit(Ljava/lang/String;)V

    return-void
.end method

.method private clear()V
    .locals 1

    .line 97
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded;->mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Ladmob/plus/cordova/ads/Rewarded;->mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    :cond_0
    return-void
.end method


# virtual methods
.method public isLoaded()Z
    .locals 1

    .line 81
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded;->mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method synthetic lambda$show$0$admob-plus-cordova-ads-Rewarded(Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 1

    .line 88
    const-string v0, "admob.ad.reward"

    invoke-virtual {p0, v0, p1}, Ladmob/plus/cordova/ads/Rewarded;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    return-void
.end method

.method public load(Ladmob/plus/core/Context;)V
    .locals 4

    .line 33
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Rewarded;->clear()V

    .line 35
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Rewarded;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Ladmob/plus/cordova/ads/Rewarded;->adUnitId:Ljava/lang/String;

    iget-object v2, p0, Ladmob/plus/cordova/ads/Rewarded;->adRequest:Lcom/google/android/gms/ads/AdRequest;

    new-instance v3, Ladmob/plus/cordova/ads/Rewarded$1;

    invoke-direct {v3, p0, p1}, Ladmob/plus/cordova/ads/Rewarded$1;-><init>(Ladmob/plus/cordova/ads/Rewarded;Ladmob/plus/core/Context;)V

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Rewarded;->clear()V

    .line 28
    invoke-super {p0}, Ladmob/plus/cordova/ads/AdBase;->onDestroy()V

    return-void
.end method

.method public show(Ladmob/plus/core/Context;)V
    .locals 3

    .line 86
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Rewarded;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Ladmob/plus/cordova/ads/Rewarded;->mAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Rewarded;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Ladmob/plus/cordova/ads/Rewarded$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Ladmob/plus/cordova/ads/Rewarded$$ExternalSyntheticLambda0;-><init>(Ladmob/plus/cordova/ads/Rewarded;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->show(Landroid/app/Activity;Lcom/google/android/gms/ads/OnUserEarnedRewardListener;)V

    .line 90
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    goto :goto_0

    .line 92
    :cond_0
    const-string v0, "Ad is not loaded"

    invoke-interface {p1, v0}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

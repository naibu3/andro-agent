.class public final synthetic Ladmob/plus/cordova/ads/RewardedInterstitial$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/ads/OnUserEarnedRewardListener;


# instance fields
.field public final synthetic f$0:Ladmob/plus/cordova/ads/RewardedInterstitial;


# direct methods
.method public synthetic constructor <init>(Ladmob/plus/cordova/ads/RewardedInterstitial;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ladmob/plus/cordova/ads/RewardedInterstitial$$ExternalSyntheticLambda0;->f$0:Ladmob/plus/cordova/ads/RewardedInterstitial;

    return-void
.end method


# virtual methods
.method public final onUserEarnedReward(Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ladmob/plus/cordova/ads/RewardedInterstitial$$ExternalSyntheticLambda0;->f$0:Ladmob/plus/cordova/ads/RewardedInterstitial;

    invoke-virtual {v0, p1}, Ladmob/plus/cordova/ads/RewardedInterstitial;->lambda$show$0$admob-plus-cordova-ads-RewardedInterstitial(Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    return-void
.end method

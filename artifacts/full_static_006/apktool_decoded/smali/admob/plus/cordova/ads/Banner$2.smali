.class Ladmob/plus/cordova/ads/Banner$2;
.super Lcom/google/android/gms/ads/AdListener;
.source "Banner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/ads/Banner;->createBannerView()Lcom/google/android/gms/ads/AdView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ladmob/plus/cordova/ads/Banner;

.field final synthetic val$adView:Lcom/google/android/gms/ads/AdView;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/ads/Banner;Lcom/google/android/gms/ads/AdView;)V
    .locals 0

    .line 89
    iput-object p1, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    iput-object p2, p0, Ladmob/plus/cordova/ads/Banner$2;->val$adView:Lcom/google/android/gms/ads/AdView;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method synthetic lambda$onAdLoaded$0$admob-plus-cordova-ads-Banner$2()V
    .locals 3

    .line 117
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const-string v1, "admob.banner.size"

    invoke-static {v0}, Ladmob/plus/cordova/ads/Banner;->-$$Nest$mcomputeAdSize(Ladmob/plus/cordova/ads/Banner;)Ljava/util/HashMap;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ladmob/plus/cordova/ads/Banner;->access$600(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public onAdClicked()V
    .locals 2

    .line 92
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const-string v1, "admob.ad.click"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Banner;->access$000(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 97
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const-string v1, "admob.ad.dismiss"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Banner;->access$100(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V

    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    .line 102
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const-string v1, "admob.ad.loadfail"

    invoke-static {v0, v1, p1}, Ladmob/plus/cordova/ads/Banner;->access$200(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method public onAdImpression()V
    .locals 2

    .line 107
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const-string v1, "admob.ad.impression"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Banner;->access$300(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 112
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    invoke-static {v0}, Ladmob/plus/cordova/ads/Banner;->-$$Nest$fgetmAdViewOld(Ladmob/plus/cordova/ads/Banner;)Lcom/google/android/gms/ads/AdView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    invoke-static {v0}, Ladmob/plus/cordova/ads/Banner;->-$$Nest$fgetmAdViewOld(Ladmob/plus/cordova/ads/Banner;)Lcom/google/android/gms/ads/AdView;

    move-result-object v1

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Banner;->-$$Nest$mremoveBannerView(Ladmob/plus/cordova/ads/Banner;Lcom/google/android/gms/ads/AdView;)V

    .line 114
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Banner;->-$$Nest$fputmAdViewOld(Ladmob/plus/cordova/ads/Banner;Lcom/google/android/gms/ads/AdView;)V

    .line 117
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->val$adView:Lcom/google/android/gms/ads/AdView;

    new-instance v1, Ladmob/plus/cordova/ads/Banner$2$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Ladmob/plus/cordova/ads/Banner$2$$ExternalSyntheticLambda0;-><init>(Ladmob/plus/cordova/ads/Banner$2;)V

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Banner;->-$$Nest$smrunJustBeforeBeingDrawn(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 119
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const-string v1, "admob.ad.load"

    invoke-static {v0}, Ladmob/plus/cordova/ads/Banner;->-$$Nest$mcomputeAdSize(Ladmob/plus/cordova/ads/Banner;)Ljava/util/HashMap;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ladmob/plus/cordova/ads/Banner;->access$400(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public onAdOpened()V
    .locals 2

    .line 124
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner$2;->this$0:Ladmob/plus/cordova/ads/Banner;

    const-string v1, "admob.ad.show"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Banner;->access$500(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V

    return-void
.end method

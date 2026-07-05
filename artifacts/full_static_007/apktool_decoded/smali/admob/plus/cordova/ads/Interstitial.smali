.class public Ladmob/plus/cordova/ads/Interstitial;
.super Ladmob/plus/cordova/ads/AdBase;
.source "Interstitial.java"


# instance fields
.field private mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;


# direct methods
.method static bridge synthetic -$$Nest$fgetmAd(Ladmob/plus/cordova/ads/Interstitial;)Lcom/google/android/gms/ads/interstitial/InterstitialAd;
    .locals 0

    iget-object p0, p0, Ladmob/plus/cordova/ads/Interstitial;->mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputmAd(Ladmob/plus/cordova/ads/Interstitial;Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V
    .locals 0

    iput-object p1, p0, Ladmob/plus/cordova/ads/Interstitial;->mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    return-void
.end method

.method public constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Ladmob/plus/cordova/ads/AdBase;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Ladmob/plus/cordova/ads/Interstitial;->mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    return-void
.end method

.method static synthetic access$000(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Interstitial;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Interstitial;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method static synthetic access$200(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Interstitial;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Interstitial;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Interstitial;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Ladmob/plus/cordova/ads/Interstitial;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Interstitial;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method private clear()V
    .locals 2

    .line 90
    iget-object v0, p0, Ladmob/plus/cordova/ads/Interstitial;->mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 91
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 92
    iput-object v1, p0, Ladmob/plus/cordova/ads/Interstitial;->mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    :cond_0
    return-void
.end method


# virtual methods
.method public isLoaded()Z
    .locals 1

    .line 76
    iget-object v0, p0, Ladmob/plus/cordova/ads/Interstitial;->mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public load(Ladmob/plus/core/Context;)V
    .locals 4

    .line 32
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Interstitial;->clear()V

    .line 34
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Interstitial;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Ladmob/plus/cordova/ads/Interstitial;->adUnitId:Ljava/lang/String;

    iget-object v2, p0, Ladmob/plus/cordova/ads/Interstitial;->adRequest:Lcom/google/android/gms/ads/AdRequest;

    new-instance v3, Ladmob/plus/cordova/ads/Interstitial$1;

    invoke-direct {v3, p0, p1}, Ladmob/plus/cordova/ads/Interstitial$1;-><init>(Ladmob/plus/cordova/ads/Interstitial;Ladmob/plus/core/Context;)V

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Interstitial;->clear()V

    .line 27
    invoke-super {p0}, Ladmob/plus/cordova/ads/AdBase;->onDestroy()V

    return-void
.end method

.method public show(Ladmob/plus/core/Context;)V
    .locals 2

    .line 81
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Interstitial;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Ladmob/plus/cordova/ads/Interstitial;->mAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Interstitial;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->show(Landroid/app/Activity;)V

    .line 83
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    goto :goto_0

    .line 85
    :cond_0
    const-string v0, "Ad is not loaded"

    invoke-interface {p1, v0}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.class public Ladmob/plus/cordova/ads/AppOpen;
.super Ladmob/plus/cordova/ads/AdBase;
.source "AppOpen.java"


# instance fields
.field private mAd:Lcom/google/android/gms/ads/appopen/AppOpenAd;

.field private final mAdRequest:Lcom/google/android/gms/ads/AdRequest;

.field private final mOrientation:I


# direct methods
.method static bridge synthetic -$$Nest$fputmAd(Ladmob/plus/cordova/ads/AppOpen;Lcom/google/android/gms/ads/appopen/AppOpenAd;)V
    .locals 0

    iput-object p1, p0, Ladmob/plus/cordova/ads/AppOpen;->mAd:Lcom/google/android/gms/ads/appopen/AppOpenAd;

    return-void
.end method

.method static bridge synthetic -$$Nest$mclear(Ladmob/plus/cordova/ads/AppOpen;)V
    .locals 0

    invoke-direct {p0}, Ladmob/plus/cordova/ads/AppOpen;->clear()V

    return-void
.end method

.method public constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 2

    .line 19
    invoke-direct {p0, p1}, Ladmob/plus/cordova/ads/AdBase;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Ladmob/plus/cordova/ads/AppOpen;->mAd:Lcom/google/android/gms/ads/appopen/AppOpenAd;

    .line 21
    invoke-virtual {p1}, Ladmob/plus/cordova/ExecuteContext;->optAdRequest()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    iput-object v0, p0, Ladmob/plus/cordova/ads/AppOpen;->mAdRequest:Lcom/google/android/gms/ads/AdRequest;

    .line 23
    const-string v0, "orientation"

    invoke-virtual {p1, v0}, Ladmob/plus/cordova/ExecuteContext;->optInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    iput v0, p0, Ladmob/plus/cordova/ads/AppOpen;->mOrientation:I

    return-void
.end method

.method static synthetic access$000(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/AppOpen;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/AppOpen;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method static synthetic access$200(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/AppOpen;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/AppOpen;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/AppOpen;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Ladmob/plus/cordova/ads/AppOpen;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/AppOpen;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method private clear()V
    .locals 1

    .line 94
    iget-object v0, p0, Ladmob/plus/cordova/ads/AppOpen;->mAd:Lcom/google/android/gms/ads/appopen/AppOpenAd;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 95
    iput-object v0, p0, Ladmob/plus/cordova/ads/AppOpen;->mAd:Lcom/google/android/gms/ads/appopen/AppOpenAd;

    :cond_0
    return-void
.end method


# virtual methods
.method public isLoaded()Z
    .locals 1

    .line 84
    iget-object v0, p0, Ladmob/plus/cordova/ads/AppOpen;->mAd:Lcom/google/android/gms/ads/appopen/AppOpenAd;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public load(Ladmob/plus/core/Context;)V
    .locals 5

    .line 36
    invoke-direct {p0}, Ladmob/plus/cordova/ads/AppOpen;->clear()V

    .line 38
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/AppOpen;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Ladmob/plus/cordova/ads/AppOpen;->adUnitId:Ljava/lang/String;

    iget-object v2, p0, Ladmob/plus/cordova/ads/AppOpen;->mAdRequest:Lcom/google/android/gms/ads/AdRequest;

    iget v3, p0, Ladmob/plus/cordova/ads/AppOpen;->mOrientation:I

    new-instance v4, Ladmob/plus/cordova/ads/AppOpen$1;

    invoke-direct {v4, p0, p1}, Ladmob/plus/cordova/ads/AppOpen$1;-><init>(Ladmob/plus/cordova/ads/AppOpen;Ladmob/plus/core/Context;)V

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/ads/appopen/AppOpenAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;ILcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ladmob/plus/cordova/ads/AppOpen;->clear()V

    .line 31
    invoke-super {p0}, Ladmob/plus/cordova/ads/AdBase;->onDestroy()V

    return-void
.end method

.method public show(Ladmob/plus/core/Context;)V
    .locals 2

    .line 89
    iget-object v0, p0, Ladmob/plus/cordova/ads/AppOpen;->mAd:Lcom/google/android/gms/ads/appopen/AppOpenAd;

    invoke-virtual {p0}, Ladmob/plus/cordova/ads/AppOpen;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/appopen/AppOpenAd;->show(Landroid/app/Activity;)V

    const/4 v0, 0x1

    .line 90
    invoke-interface {p1, v0}, Ladmob/plus/core/Context;->resolve(Z)V

    return-void
.end method

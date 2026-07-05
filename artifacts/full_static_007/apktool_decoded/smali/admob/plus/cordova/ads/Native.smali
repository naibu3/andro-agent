.class public Ladmob/plus/cordova/ads/Native;
.super Ladmob/plus/cordova/ads/AdBase;
.source "Native.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ladmob/plus/cordova/ads/Native$ViewProvider;
    }
.end annotation


# static fields
.field public static final VIEW_DEFAULT_KEY:Ljava/lang/String; = "default"

.field public static final providers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ladmob/plus/cordova/ads/Native$ViewProvider;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mAd:Lcom/google/android/gms/ads/nativead/NativeAd;

.field private final mAdRequest:Lcom/google/android/gms/ads/AdRequest;

.field private mLoader:Lcom/google/android/gms/ads/AdLoader;

.field private view:Landroid/view/View;

.field private final viewProvider:Ladmob/plus/cordova/ads/Native$ViewProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ladmob/plus/cordova/ads/Native;->providers:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 3

    .line 36
    invoke-direct {p0, p1}, Ladmob/plus/cordova/ads/AdBase;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    .line 38
    invoke-virtual {p1}, Ladmob/plus/cordova/ExecuteContext;->optAdRequest()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    iput-object v0, p0, Ladmob/plus/cordova/ads/Native;->mAdRequest:Lcom/google/android/gms/ads/AdRequest;

    .line 39
    const-string v0, "view"

    invoke-virtual {p1, v0}, Ladmob/plus/cordova/ExecuteContext;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 40
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    :cond_0
    const-string p1, "default"

    .line 43
    :cond_1
    sget-object v0, Ladmob/plus/cordova/ads/Native;->providers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ladmob/plus/cordova/ads/Native$ViewProvider;

    iput-object v0, p0, Ladmob/plus/cordova/ads/Native;->viewProvider:Ladmob/plus/cordova/ads/Native$ViewProvider;

    if-eqz v0, :cond_2

    return-void

    .line 45
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot find viewProvider: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic access$000(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Native;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method static synthetic access$100(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Native;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Native;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Native;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Native;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Native;->emit(Ljava/lang/String;)V

    return-void
.end method

.method private clear()V
    .locals 3

    .line 137
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->mAd:Lcom/google/android/gms/ads/nativead/NativeAd;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/NativeAd;->destroy()V

    .line 139
    iput-object v1, p0, Ladmob/plus/cordova/ads/Native;->mAd:Lcom/google/android/gms/ads/nativead/NativeAd;

    .line 141
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 142
    instance-of v2, v0, Lcom/google/android/gms/ads/nativead/NativeAdView;

    if-eqz v2, :cond_1

    .line 143
    check-cast v0, Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 144
    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/NativeAdView;->removeAllViews()V

    .line 145
    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/NativeAdView;->destroy()V

    .line 147
    :cond_1
    iput-object v1, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    .line 149
    :cond_2
    iput-object v1, p0, Ladmob/plus/cordova/ads/Native;->mLoader:Lcom/google/android/gms/ads/AdLoader;

    return-void
.end method


# virtual methods
.method public hide(Ladmob/plus/core/Context;)V
    .locals 2

    .line 128
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 132
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->viewProvider:Ladmob/plus/cordova/ads/Native$ViewProvider;

    invoke-interface {v0, p0}, Ladmob/plus/cordova/ads/Native$ViewProvider;->didHide(Ladmob/plus/cordova/ads/Native;)V

    .line 133
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public isLoaded()Z
    .locals 1

    .line 58
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->mLoader:Lcom/google/android/gms/ads/AdLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdLoader;->isLoading()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method synthetic lambda$load$0$admob-plus-cordova-ads-Native(Lcom/google/android/gms/ads/nativead/NativeAd;)V
    .locals 0

    .line 67
    iput-object p1, p0, Ladmob/plus/cordova/ads/Native;->mAd:Lcom/google/android/gms/ads/nativead/NativeAd;

    return-void
.end method

.method public load(Ladmob/plus/core/Context;)V
    .locals 3

    .line 63
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Native;->clear()V

    .line 65
    new-instance v0, Lcom/google/android/gms/ads/AdLoader$Builder;

    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Native;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Ladmob/plus/cordova/ads/Native;->adUnitId:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/AdLoader$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v1, Ladmob/plus/cordova/ads/Native$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Ladmob/plus/cordova/ads/Native$$ExternalSyntheticLambda0;-><init>(Ladmob/plus/cordova/ads/Native;)V

    .line 66
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdLoader$Builder;->forNativeAd(Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object v0

    new-instance v1, Ladmob/plus/cordova/ads/Native$1;

    invoke-direct {v1, p0, p1}, Ladmob/plus/cordova/ads/Native$1;-><init>(Ladmob/plus/cordova/ads/Native;Ladmob/plus/core/Context;)V

    .line 69
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdLoader$Builder;->withAdListener(Lcom/google/android/gms/ads/AdListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdLoader$Builder;->build()Lcom/google/android/gms/ads/AdLoader;

    move-result-object p1

    iput-object p1, p0, Ladmob/plus/cordova/ads/Native;->mLoader:Lcom/google/android/gms/ads/AdLoader;

    .line 102
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->mAdRequest:Lcom/google/android/gms/ads/AdRequest;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/AdLoader;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Native;->clear()V

    .line 53
    invoke-super {p0}, Ladmob/plus/cordova/ads/AdBase;->onDestroy()V

    return-void
.end method

.method public show(Ladmob/plus/core/Context;)V
    .locals 6

    .line 107
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->viewProvider:Ladmob/plus/cordova/ads/Native$ViewProvider;

    iget-object v1, p0, Ladmob/plus/cordova/ads/Native;->mAd:Lcom/google/android/gms/ads/nativead/NativeAd;

    invoke-interface {v0, v1}, Ladmob/plus/cordova/ads/Native$ViewProvider;->createView(Lcom/google/android/gms/ads/nativead/NativeAd;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    .line 109
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Native;->getContentView()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 113
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    const-string v1, "x"

    const-wide/16 v2, 0x0

    invoke-interface {p1, v1, v2, v3}, Ladmob/plus/core/Context;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ladmob/plus/core/Helper;->dpToPx(D)D

    move-result-wide v4

    double-to-float v1, v4

    invoke-virtual {v0, v1}, Landroid/view/View;->setX(F)V

    .line 114
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    const-string v1, "y"

    invoke-interface {p1, v1, v2, v3}, Ladmob/plus/core/Context;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ladmob/plus/core/Helper;->dpToPx(D)D

    move-result-wide v4

    double-to-float v1, v4

    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    .line 115
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 116
    const-string v1, "width"

    invoke-interface {p1, v1, v2, v3}, Ladmob/plus/core/Context;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ladmob/plus/core/Helper;->dpToPx(D)D

    move-result-wide v4

    double-to-int v1, v4

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 117
    const-string v1, "height"

    invoke-interface {p1, v1, v2, v3}, Ladmob/plus/core/Context;->optDouble(Ljava/lang/String;D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ladmob/plus/core/Helper;->dpToPx(D)D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 118
    iget-object v1, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->viewProvider:Ladmob/plus/cordova/ads/Native$ViewProvider;

    invoke-interface {v0, p0}, Ladmob/plus/cordova/ads/Native$ViewProvider;->didShow(Ladmob/plus/cordova/ads/Native;)V

    .line 122
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    const/4 v0, 0x1

    .line 123
    invoke-interface {p1, v0}, Ladmob/plus/core/Context;->resolve(Z)V

    return-void
.end method

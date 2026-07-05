.class public Ladmob/plus/cordova/ads/Banner;
.super Ladmob/plus/cordova/ads/AdBase;
.source "Banner.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ladmob/plus/cordova/ads/Banner$AdSizeType;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AdMobPlus.Banner"

.field private static rootLinearLayout:Landroid/view/ViewGroup;

.field private static screenWidth:I


# instance fields
.field private final adSize:Lcom/google/android/gms/ads/AdSize;

.field private final gravity:I

.field private mAdView:Lcom/google/android/gms/ads/AdView;

.field private mAdViewOld:Lcom/google/android/gms/ads/AdView;

.field private mRelativeLayout:Landroid/widget/RelativeLayout;

.field private final offset:Ljava/lang/Integer;


# direct methods
.method public static synthetic $r8$lambda$4FSzqGF4tWe41XxKEyB8IDcvQ2A(Ladmob/plus/cordova/ads/Banner;)V
    .locals 0

    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->reloadBannerView()V

    return-void
.end method

.method static bridge synthetic -$$Nest$fgetmAdViewOld(Ladmob/plus/cordova/ads/Banner;)Lcom/google/android/gms/ads/AdView;
    .locals 0

    iget-object p0, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputmAdViewOld(Ladmob/plus/cordova/ads/Banner;Lcom/google/android/gms/ads/AdView;)V
    .locals 0

    iput-object p1, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    return-void
.end method

.method static bridge synthetic -$$Nest$mcomputeAdSize(Ladmob/plus/cordova/ads/Banner;)Ljava/util/HashMap;
    .locals 0

    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->computeAdSize()Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic -$$Nest$mremoveBannerView(Ladmob/plus/cordova/ads/Banner;Lcom/google/android/gms/ads/AdView;)V
    .locals 0

    invoke-direct {p0, p1}, Ladmob/plus/cordova/ads/Banner;->removeBannerView(Lcom/google/android/gms/ads/AdView;)V

    return-void
.end method

.method static bridge synthetic -$$Nest$smrunJustBeforeBeingDrawn(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Ladmob/plus/cordova/ads/Banner;->runJustBeforeBeingDrawn(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 2

    .line 45
    invoke-direct {p0, p1}, Ladmob/plus/cordova/ads/AdBase;-><init>(Ladmob/plus/cordova/ExecuteContext;)V

    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    .line 42
    iput-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    .line 47
    invoke-virtual {p1}, Ladmob/plus/cordova/ExecuteContext;->optAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    iput-object v0, p0, Ladmob/plus/cordova/ads/Banner;->adSize:Lcom/google/android/gms/ads/AdSize;

    .line 48
    const-string v0, "top"

    invoke-virtual {p1}, Ladmob/plus/cordova/ExecuteContext;->optPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x30

    goto :goto_0

    :cond_0
    const/16 v0, 0x50

    :goto_0
    iput v0, p0, Ladmob/plus/cordova/ads/Banner;->gravity:I

    .line 49
    invoke-virtual {p1}, Ladmob/plus/cordova/ExecuteContext;->optOffset()Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ladmob/plus/cordova/ads/Banner;->offset:Ljava/lang/Integer;

    return-void
.end method

.method static synthetic access$000(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Banner;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Banner;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Banner;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    return-void
.end method

.method static synthetic access$300(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Banner;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Banner;->emit(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method static synthetic access$500(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ladmob/plus/cordova/ads/Banner;->emit(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Ladmob/plus/cordova/ads/Banner;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 31
    invoke-virtual {p0, p1, p2}, Ladmob/plus/cordova/ads/Banner;->emit(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private addBannerView()V
    .locals 2

    .line 244
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-nez v0, :cond_0

    return-void

    .line 245
    :cond_0
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->offset:Ljava/lang/Integer;

    if-nez v1, :cond_2

    .line 246
    invoke-static {v0}, Ladmob/plus/core/Helper;->getParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    sget-object v1, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    if-ne v0, v1, :cond_1

    if-eqz v1, :cond_1

    return-void

    .line 247
    :cond_1
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->addBannerViewWithLinearLayout()V

    goto :goto_0

    .line 249
    :cond_2
    invoke-static {v0}, Ladmob/plus/core/Helper;->getParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    if-ne v0, v1, :cond_3

    if-eqz v1, :cond_3

    return-void

    .line 250
    :cond_3
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->addBannerViewWithRelativeLayout()V

    .line 253
    :goto_0
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getContentView()Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 255
    invoke-virtual {v0}, Landroid/view/ViewGroup;->bringToFront()V

    .line 256
    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 257
    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    :cond_4
    return-void
.end method

.method private addBannerViewWithLinearLayout()V
    .locals 6

    .line 262
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getWebView()Landroid/view/View;

    move-result-object v0

    .line 263
    invoke-static {v0}, Ladmob/plus/core/Helper;->getParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v1

    .line 264
    sget-object v2, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    if-nez v2, :cond_0

    .line 265
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    sput-object v2, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    :cond_0
    if-eqz v1, :cond_1

    .line 268
    sget-object v2, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    if-eq v1, v2, :cond_1

    .line 269
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 270
    sget-object v2, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    check-cast v2, Landroid/widget/LinearLayout;

    const/4 v3, 0x1

    .line 271
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 272
    sget-object v2, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-direct {v3, v5, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 276
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v2, v5, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 280
    sget-object v2, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 282
    sget-object v0, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    invoke-static {v0}, Ladmob/plus/core/Helper;->getParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eq v0, v1, :cond_1

    .line 284
    sget-object v0, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    invoke-static {v0}, Ladmob/plus/core/Helper;->removeFromParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 285
    sget-object v0, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 289
    :cond_1
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-static {v0}, Ladmob/plus/core/Helper;->removeFromParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 290
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->isPositionTop()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 291
    sget-object v0, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    iget-object v2, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_0

    .line 293
    :cond_2
    sget-object v0, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    iget-object v2, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 296
    :goto_0
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getContentView()Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 298
    :goto_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 299
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 300
    instance-of v3, v2, Landroid/widget/RelativeLayout;

    if-eqz v3, :cond_3

    .line 301
    invoke-virtual {v2}, Landroid/view/View;->bringToFront()V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method private addBannerViewWithRelativeLayout()V
    .locals 4

    .line 308
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 311
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->isPositionTop()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    const/16 v1, 0xc

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 313
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    if-nez v1, :cond_3

    .line 314
    new-instance v1, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    .line 315
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 318
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->isPositionTop()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 319
    iget-object v2, p0, Ladmob/plus/cordova/ads/Banner;->offset:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v3, v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_1

    .line 321
    :cond_1
    iget-object v2, p0, Ladmob/plus/cordova/ads/Banner;->offset:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v3, v3, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 324
    :goto_1
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getContentView()Landroid/view/ViewGroup;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 326
    iget-object v3, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    .line 328
    :cond_2
    const-string v1, "AdMobPlus.Banner"

    const-string v2, "Unable to find content view"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    :cond_3
    :goto_2
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-static {v1}, Ladmob/plus/core/Helper;->removeFromParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 333
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 334
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->bringToFront()V

    return-void
.end method

.method private computeAdSize()Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 132
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->getWidth()I

    move-result v0

    .line 133
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdView;->getHeight()I

    move-result v1

    .line 135
    new-instance v2, Ladmob/plus/cordova/ads/Banner$3;

    invoke-direct {v2, p0, v0, v1}, Ladmob/plus/cordova/ads/Banner$3;-><init>(Ladmob/plus/cordova/ads/Banner;II)V

    return-object v2
.end method

.method private createBannerView()Lcom/google/android/gms/ads/AdView;
    .locals 2

    .line 86
    new-instance v0, Lcom/google/android/gms/ads/AdView;

    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    .line 87
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->adUnitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdUnitId(Ljava/lang/String;)V

    .line 88
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->adSize:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 89
    new-instance v1, Ladmob/plus/cordova/ads/Banner$2;

    invoke-direct {v1, p0, v0}, Ladmob/plus/cordova/ads/Banner$2;-><init>(Ladmob/plus/cordova/ads/Banner;Lcom/google/android/gms/ads/AdView;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    return-object v0
.end method

.method public static destroyParentView()V
    .locals 1

    .line 53
    sget-object v0, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    invoke-static {v0}, Ladmob/plus/core/Helper;->getParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    const/4 v0, 0x0

    .line 55
    sput-object v0, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    return-void
.end method

.method private isPositionTop()Z
    .locals 2

    .line 338
    iget v0, p0, Ladmob/plus/cordova/ads/Banner;->gravity:I

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private pauseBannerViews()V
    .locals 2

    .line 202
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V

    .line 203
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-eq v0, v1, :cond_1

    .line 204
    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V

    :cond_1
    return-void
.end method

.method private reloadBannerView()V
    .locals 2

    .line 184
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->pauseBannerViews()V

    .line 187
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Ladmob/plus/cordova/ads/Banner;->removeBannerView(Lcom/google/android/gms/ads/AdView;)V

    .line 188
    :cond_1
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    iput-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    .line 190
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->createBannerView()Lcom/google/android/gms/ads/AdView;

    move-result-object v0

    iput-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 191
    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->adRequest:Lcom/google/android/gms/ads/AdRequest;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 192
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->addBannerView()V

    :cond_2
    :goto_0
    return-void
.end method

.method private removeBannerView(Lcom/google/android/gms/ads/AdView;)V
    .locals 0

    .line 238
    invoke-static {p1}, Ladmob/plus/core/Helper;->removeFromParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 239
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdView;->removeAllViews()V

    .line 240
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdView;->destroy()V

    return-void
.end method

.method private resumeBannerViews()V
    .locals 1

    .line 215
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V

    .line 216
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V

    :cond_1
    return-void
.end method

.method private static runJustBeforeBeingDrawn(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    .line 59
    new-instance v0, Ladmob/plus/cordova/ads/Banner$1;

    invoke-direct {v0, p0, p1}, Ladmob/plus/cordova/ads/Banner$1;-><init>(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method


# virtual methods
.method public hide(Ladmob/plus/core/Context;)V
    .locals 2

    .line 165
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    .line 166
    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V

    .line 167
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 169
    :cond_0
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public isLoaded()Z
    .locals 1

    .line 72
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public load(Ladmob/plus/core/Context;)V
    .locals 2

    .line 77
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    if-nez v0, :cond_0

    .line 78
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->createBannerView()Lcom/google/android/gms/ads/AdView;

    move-result-object v0

    iput-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 81
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    iget-object v1, p0, Ladmob/plus/cordova/ads/Banner;->adRequest:Lcom/google/android/gms/ads/AdRequest;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 82
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 174
    invoke-super {p0, p1}, Ladmob/plus/cordova/ads/AdBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 176
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 177
    sget v0, Ladmob/plus/cordova/ads/Banner;->screenWidth:I

    if-eq p1, v0, :cond_0

    .line 178
    sput p1, Ladmob/plus/cordova/ads/Banner;->screenWidth:I

    .line 179
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getActivity()Landroid/app/Activity;

    move-result-object p1

    new-instance v0, Ladmob/plus/cordova/ads/Banner$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Ladmob/plus/cordova/ads/Banner$$ExternalSyntheticLambda0;-><init>(Ladmob/plus/cordova/ads/Banner;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 221
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 222
    invoke-direct {p0, v0}, Ladmob/plus/cordova/ads/Banner;->removeBannerView(Lcom/google/android/gms/ads/AdView;)V

    .line 223
    iput-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 225
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    .line 226
    invoke-direct {p0, v0}, Ladmob/plus/cordova/ads/Banner;->removeBannerView(Lcom/google/android/gms/ads/AdView;)V

    .line 227
    iput-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mAdViewOld:Lcom/google/android/gms/ads/AdView;

    .line 229
    :cond_1
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 230
    invoke-static {v0}, Ladmob/plus/core/Helper;->removeFromParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 231
    iput-object v1, p0, Ladmob/plus/cordova/ads/Banner;->mRelativeLayout:Landroid/widget/RelativeLayout;

    .line 234
    :cond_2
    invoke-super {p0}, Ladmob/plus/cordova/ads/AdBase;->onDestroy()V

    return-void
.end method

.method public onPause(Z)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->pauseBannerViews()V

    .line 198
    invoke-super {p0, p1}, Ladmob/plus/cordova/ads/AdBase;->onPause(Z)V

    return-void
.end method

.method public onResume(Z)V
    .locals 0

    .line 210
    invoke-super {p0, p1}, Ladmob/plus/cordova/ads/AdBase;->onResume(Z)V

    .line 211
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->resumeBannerViews()V

    return-void
.end method

.method public show(Ladmob/plus/core/Context;)V
    .locals 2

    .line 147
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 148
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->addBannerView()V

    goto :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 150
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V

    .line 151
    iget-object v0, p0, Ladmob/plus/cordova/ads/Banner;->mAdView:Lcom/google/android/gms/ads/AdView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    goto :goto_0

    .line 153
    :cond_1
    invoke-virtual {p0}, Ladmob/plus/cordova/ads/Banner;->getWebView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Ladmob/plus/core/Helper;->getParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    .line 154
    sget-object v1, Ladmob/plus/cordova/ads/Banner;->rootLinearLayout:Landroid/view/ViewGroup;

    if-eq v1, v0, :cond_2

    .line 155
    invoke-static {v1}, Ladmob/plus/core/Helper;->removeFromParentView(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 156
    invoke-direct {p0}, Ladmob/plus/cordova/ads/Banner;->addBannerView()V

    .line 160
    :cond_2
    :goto_0
    invoke-interface {p1}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

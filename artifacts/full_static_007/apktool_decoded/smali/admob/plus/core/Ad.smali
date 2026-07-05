.class public abstract Ladmob/plus/core/Ad;
.super Ljava/lang/Object;
.source "Ad.java"


# instance fields
.field public final adUnitId:Ljava/lang/String;

.field public final id:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ladmob/plus/core/Context;)V
    .locals 1

    .line 29
    invoke-interface {p1}, Ladmob/plus/core/Context;->optId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1}, Ladmob/plus/core/Context;->optAdUnitID()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Ladmob/plus/core/Ad;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ladmob/plus/core/Ad;->id:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Ladmob/plus/core/Ad;->adUnitId:Ljava/lang/String;

    .line 25
    sget-object p2, Ladmob/plus/core/Helper;->ads:Ljava/util/Map;

    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 33
    sget-object v0, Ladmob/plus/core/Helper;->ads:Ljava/util/Map;

    iget-object v1, p0, Ladmob/plus/core/Ad;->id:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected emit(Ljava/lang/String;)V
    .locals 1

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, v0}, Ladmob/plus/core/Ad;->emit(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method protected emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
    .locals 1

    .line 52
    new-instance v0, Ladmob/plus/core/Ad$1;

    invoke-direct {v0, p0, p2}, Ladmob/plus/core/Ad$1;-><init>(Ladmob/plus/core/Ad;Lcom/google/android/gms/ads/AdError;)V

    invoke-virtual {p0, p1, v0}, Ladmob/plus/core/Ad;->emit(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method protected emit(Ljava/lang/String;Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 1

    .line 60
    new-instance v0, Ladmob/plus/core/Ad$2;

    invoke-direct {v0, p0, p2}, Ladmob/plus/core/Ad$2;-><init>(Ladmob/plus/core/Ad;Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    invoke-virtual {p0, p1, v0}, Ladmob/plus/core/Ad;->emit(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method protected emit(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 69
    invoke-virtual {p0}, Ladmob/plus/core/Ad;->getAdapter()Ladmob/plus/core/Helper$Adapter;

    move-result-object v0

    new-instance v1, Ladmob/plus/core/Ad$3;

    invoke-direct {v1, p0, p2}, Ladmob/plus/core/Ad$3;-><init>(Ladmob/plus/core/Ad;Ljava/util/Map;)V

    invoke-interface {v0, p1, v1}, Ladmob/plus/core/Helper$Adapter;->emit(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 39
    invoke-virtual {p0}, Ladmob/plus/core/Ad;->getAdapter()Ladmob/plus/core/Helper$Adapter;

    move-result-object v0

    invoke-interface {v0}, Ladmob/plus/core/Helper$Adapter;->getActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method protected abstract getAdapter()Ladmob/plus/core/Helper$Adapter;
.end method

.method public getContentView()Landroid/view/ViewGroup;
    .locals 2

    .line 44
    invoke-virtual {p0}, Ladmob/plus/core/Ad;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

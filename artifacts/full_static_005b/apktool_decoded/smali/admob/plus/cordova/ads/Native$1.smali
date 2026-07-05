.class Ladmob/plus/cordova/ads/Native$1;
.super Lcom/google/android/gms/ads/AdListener;
.source "Native.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/ads/Native;->load(Ladmob/plus/core/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ladmob/plus/cordova/ads/Native;

.field final synthetic val$ctx:Ladmob/plus/core/Context;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/ads/Native;Ladmob/plus/core/Context;)V
    .locals 0

    .line 69
    iput-object p1, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    iput-object p2, p0, Ladmob/plus/cordova/ads/Native$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    .line 94
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    const-string v1, "admob.ad.click"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Native;->access$400(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 79
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    const-string v1, "admob.ad.dismiss"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Native;->access$100(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V

    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    .line 72
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    const-string v1, "admob.ad.loadfail"

    invoke-static {v0, v1, p1}, Ladmob/plus/cordova/ads/Native;->access$000(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V

    .line 73
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    invoke-virtual {v0}, Ladmob/plus/cordova/ads/Native;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/LoadAdError;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdImpression()V
    .locals 2

    .line 98
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    const-string v1, "admob.ad.impression"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Native;->access$500(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    .line 87
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    const-string v1, "admob.ad.load"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Native;->access$300(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    invoke-virtual {v0}, Ladmob/plus/cordova/ads/Native;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->val$ctx:Ladmob/plus/core/Context;

    invoke-interface {v0}, Ladmob/plus/core/Context;->resolve()V

    :cond_0
    return-void
.end method

.method public onAdOpened()V
    .locals 2

    .line 83
    iget-object v0, p0, Ladmob/plus/cordova/ads/Native$1;->this$0:Ladmob/plus/cordova/ads/Native;

    const-string v1, "admob.ad.show"

    invoke-static {v0, v1}, Ladmob/plus/cordova/ads/Native;->access$200(Ladmob/plus/cordova/ads/Native;Ljava/lang/String;)V

    return-void
.end method

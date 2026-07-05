.class Ladmob/plus/core/Ad$2;
.super Ljava/util/HashMap;
.source "Ad.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/core/Ad;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/rewarded/RewardItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Ladmob/plus/core/Ad;

.field final synthetic val$rewardItem:Lcom/google/android/gms/ads/rewarded/RewardItem;


# direct methods
.method constructor <init>(Ladmob/plus/core/Ad;Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 0

    .line 60
    iput-object p1, p0, Ladmob/plus/core/Ad$2;->this$0:Ladmob/plus/core/Ad;

    iput-object p2, p0, Ladmob/plus/core/Ad$2;->val$rewardItem:Lcom/google/android/gms/ads/rewarded/RewardItem;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 61
    new-instance p1, Ladmob/plus/core/Ad$2$1;

    invoke-direct {p1, p0}, Ladmob/plus/core/Ad$2$1;-><init>(Ladmob/plus/core/Ad$2;)V

    const-string p2, "reward"

    invoke-virtual {p0, p2, p1}, Ladmob/plus/core/Ad$2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.class Ladmob/plus/core/Ad$2$1;
.super Ljava/util/HashMap;
.source "Ad.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ladmob/plus/core/Ad$2;
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
.field final synthetic this$1:Ladmob/plus/core/Ad$2;


# direct methods
.method constructor <init>(Ladmob/plus/core/Ad$2;)V
    .locals 2

    .line 61
    iput-object p1, p0, Ladmob/plus/core/Ad$2$1;->this$1:Ladmob/plus/core/Ad$2;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 62
    iget-object v0, p1, Ladmob/plus/core/Ad$2;->val$rewardItem:Lcom/google/android/gms/ads/rewarded/RewardItem;

    invoke-interface {v0}, Lcom/google/android/gms/ads/rewarded/RewardItem;->getAmount()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "amount"

    invoke-virtual {p0, v1, v0}, Ladmob/plus/core/Ad$2$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object p1, p1, Ladmob/plus/core/Ad$2;->val$rewardItem:Lcom/google/android/gms/ads/rewarded/RewardItem;

    invoke-interface {p1}, Lcom/google/android/gms/ads/rewarded/RewardItem;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type"

    invoke-virtual {p0, v0, p1}, Ladmob/plus/core/Ad$2$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

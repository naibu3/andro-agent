.class Ladmob/plus/core/Ad$1;
.super Ljava/util/HashMap;
.source "Ad.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/core/Ad;->emit(Ljava/lang/String;Lcom/google/android/gms/ads/AdError;)V
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

.field final synthetic val$error:Lcom/google/android/gms/ads/AdError;


# direct methods
.method constructor <init>(Ladmob/plus/core/Ad;Lcom/google/android/gms/ads/AdError;)V
    .locals 1

    .line 52
    iput-object p1, p0, Ladmob/plus/core/Ad$1;->this$0:Ladmob/plus/core/Ad;

    iput-object p2, p0, Ladmob/plus/core/Ad$1;->val$error:Lcom/google/android/gms/ads/AdError;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 53
    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdError;->getCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "code"

    invoke-virtual {p0, v0, p1}, Ladmob/plus/core/Ad$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    const-string p1, "message"

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ladmob/plus/core/Ad$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    const-string p1, "cause"

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdError;->getCause()Lcom/google/android/gms/ads/AdError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ladmob/plus/core/Ad$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

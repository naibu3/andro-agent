.class Ladmob/plus/core/Ad$3;
.super Ljava/util/HashMap;
.source "Ad.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/core/Ad;->emit(Ljava/lang/String;Ljava/util/Map;)V
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


# direct methods
.method constructor <init>(Ladmob/plus/core/Ad;Ljava/util/Map;)V
    .locals 0

    .line 69
    iput-object p1, p0, Ladmob/plus/core/Ad$3;->this$0:Ladmob/plus/core/Ad;

    invoke-direct {p0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 70
    const-string p2, "adId"

    iget-object p1, p1, Ladmob/plus/core/Ad;->id:Ljava/lang/String;

    invoke-virtual {p0, p2, p1}, Ladmob/plus/core/Ad$3;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

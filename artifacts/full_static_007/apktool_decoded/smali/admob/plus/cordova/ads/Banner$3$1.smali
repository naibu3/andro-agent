.class Ladmob/plus/cordova/ads/Banner$3$1;
.super Ljava/util/HashMap;
.source "Banner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ladmob/plus/cordova/ads/Banner$3;
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
.field final synthetic this$1:Ladmob/plus/cordova/ads/Banner$3;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/ads/Banner$3;)V
    .locals 2

    .line 136
    iput-object p1, p0, Ladmob/plus/cordova/ads/Banner$3$1;->this$1:Ladmob/plus/cordova/ads/Banner$3;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 137
    iget v0, p1, Ladmob/plus/cordova/ads/Banner$3;->val$width:I

    invoke-static {v0}, Ladmob/plus/core/Helper;->pxToDp(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "width"

    invoke-virtual {p0, v1, v0}, Ladmob/plus/cordova/ads/Banner$3$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget v0, p1, Ladmob/plus/cordova/ads/Banner$3;->val$height:I

    invoke-static {v0}, Ladmob/plus/core/Helper;->pxToDp(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "height"

    invoke-virtual {p0, v1, v0}, Ladmob/plus/cordova/ads/Banner$3$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget v0, p1, Ladmob/plus/cordova/ads/Banner$3;->val$width:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "widthInPixels"

    invoke-virtual {p0, v1, v0}, Ladmob/plus/cordova/ads/Banner$3$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    iget p1, p1, Ladmob/plus/cordova/ads/Banner$3;->val$height:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "heightInPixels"

    invoke-virtual {p0, v0, p1}, Ladmob/plus/cordova/ads/Banner$3$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

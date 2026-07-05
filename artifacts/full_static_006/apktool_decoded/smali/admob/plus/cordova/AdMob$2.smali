.class Ladmob/plus/cordova/AdMob$2;
.super Ljava/util/HashMap;
.source "AdMob.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/AdMob;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
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
.field final synthetic this$0:Ladmob/plus/cordova/AdMob;


# direct methods
.method constructor <init>(Ladmob/plus/cordova/AdMob;)V
    .locals 1

    .line 114
    iput-object p1, p0, Ladmob/plus/cordova/AdMob$2;->this$0:Ladmob/plus/cordova/AdMob;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 115
    const-string p1, "version"

    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->getVersion()Lcom/google/android/gms/ads/VersionInfo;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ladmob/plus/cordova/AdMob$2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

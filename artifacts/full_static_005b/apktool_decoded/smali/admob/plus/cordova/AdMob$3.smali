.class Ladmob/plus/cordova/AdMob$3;
.super Ljava/util/HashMap;
.source "AdMob.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ladmob/plus/cordova/AdMob;->executeReady(Lorg/apache/cordova/CallbackContext;)Z
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

    .line 196
    iput-object p1, p0, Ladmob/plus/cordova/AdMob$3;->this$0:Ladmob/plus/cordova/AdMob;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 197
    iget-object p1, p1, Ladmob/plus/cordova/AdMob;->helper:Ladmob/plus/core/Helper;

    invoke-virtual {p1}, Ladmob/plus/core/Helper;->isRunningInTestLab()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "isRunningInTestLab"

    invoke-virtual {p0, v0, p1}, Ladmob/plus/cordova/AdMob$3;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

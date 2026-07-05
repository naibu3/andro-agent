.class public final synthetic Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;


# instance fields
.field public final synthetic f$0:Ladmob/plus/cordova/AdMob;

.field public final synthetic f$1:Lorg/apache/cordova/CallbackContext;


# direct methods
.method public synthetic constructor <init>(Ladmob/plus/cordova/AdMob;Lorg/apache/cordova/CallbackContext;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda0;->f$0:Ladmob/plus/cordova/AdMob;

    iput-object p2, p0, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda0;->f$1:Lorg/apache/cordova/CallbackContext;

    return-void
.end method


# virtual methods
.method public final onInitializationComplete(Lcom/google/android/gms/ads/initialization/InitializationStatus;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda0;->f$0:Ladmob/plus/cordova/AdMob;

    iget-object v1, p0, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda0;->f$1:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0, v1, p1}, Ladmob/plus/cordova/AdMob;->lambda$execute$0$admob-plus-cordova-AdMob(Lorg/apache/cordova/CallbackContext;Lcom/google/android/gms/ads/initialization/InitializationStatus;)V

    return-void
.end method

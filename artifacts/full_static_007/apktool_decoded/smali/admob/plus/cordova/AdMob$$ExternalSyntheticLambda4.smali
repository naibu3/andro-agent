.class public final synthetic Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ladmob/plus/cordova/ExecuteContext;


# direct methods
.method public synthetic constructor <init>(Ladmob/plus/cordova/ExecuteContext;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda4;->f$0:Ladmob/plus/cordova/ExecuteContext;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 0
    iget-object v0, p0, Ladmob/plus/cordova/AdMob$$ExternalSyntheticLambda4;->f$0:Ladmob/plus/cordova/ExecuteContext;

    invoke-static {v0}, Ladmob/plus/cordova/AdMob;->lambda$executeAdShow$3(Ladmob/plus/cordova/ExecuteContext;)V

    return-void
.end method

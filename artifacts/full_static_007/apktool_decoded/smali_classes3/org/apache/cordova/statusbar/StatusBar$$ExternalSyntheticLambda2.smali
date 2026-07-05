.class public final synthetic Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lorg/apache/cordova/statusbar/StatusBar;

.field public final synthetic f$1:Lorg/apache/cordova/CordovaArgs;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/cordova/statusbar/StatusBar;Lorg/apache/cordova/CordovaArgs;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda2;->f$0:Lorg/apache/cordova/statusbar/StatusBar;

    iput-object p2, p0, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda2;->f$1:Lorg/apache/cordova/CordovaArgs;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda2;->f$0:Lorg/apache/cordova/statusbar/StatusBar;

    iget-object v1, p0, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda2;->f$1:Lorg/apache/cordova/CordovaArgs;

    invoke-virtual {v0, v1}, Lorg/apache/cordova/statusbar/StatusBar;->lambda$execute$3$org-apache-cordova-statusbar-StatusBar(Lorg/apache/cordova/CordovaArgs;)V

    return-void
.end method

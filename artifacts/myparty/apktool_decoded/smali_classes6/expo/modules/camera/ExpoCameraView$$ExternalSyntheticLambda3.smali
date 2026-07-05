.class public final synthetic Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lexpo/modules/camera/common/BarcodeScannedEvent;

    invoke-static {p1}, Lexpo/modules/camera/ExpoCameraView;->$r8$lambda$WeNHOUYUhttn1DkO3zGoSyzb27U(Lexpo/modules/camera/common/BarcodeScannedEvent;)S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1
.end method

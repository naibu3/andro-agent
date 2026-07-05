.class public final synthetic Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda6;->f$0:Lexpo/modules/camera/ExpoCameraView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda6;->f$0:Lexpo/modules/camera/ExpoCameraView;

    check-cast p1, Lexpo/modules/camera/utils/BarCodeScannerResult;

    invoke-static {v0, p1}, Lexpo/modules/camera/ExpoCameraView;->$r8$lambda$2a4sfEePjMeg7TWt2K-PGCp1IG8(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

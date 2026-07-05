.class public final synthetic Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda4;
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
    check-cast p1, Lexpo/modules/camera/common/PictureSavedEvent;

    invoke-static {p1}, Lexpo/modules/camera/ExpoCameraView;->$r8$lambda$87iTa1Z1Yw82UUCTJQoGjKznWGk(Lexpo/modules/camera/common/PictureSavedEvent;)S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1
.end method

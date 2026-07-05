.class final Lexpo/modules/camera/CameraViewModule$definition$1$12$12;
.super Ljava/lang/Object;
.source "CameraViewModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Lexpo/modules/camera/ExpoCameraView;",
        "Lexpo/modules/camera/records/FocusMode;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_View:Lexpo/modules/kotlin/views/ViewDefinitionBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/views/ViewDefinitionBuilder<",
            "Lexpo/modules/camera/ExpoCameraView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/views/ViewDefinitionBuilder<",
            "Lexpo/modules/camera/ExpoCameraView;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$12$12;->$this_View:Lexpo/modules/kotlin/views/ViewDefinitionBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 354
    check-cast p1, Lexpo/modules/camera/ExpoCameraView;

    check-cast p2, Lexpo/modules/camera/records/FocusMode;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$12$12;->invoke(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/records/FocusMode;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/records/FocusMode;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 356
    invoke-virtual {p1}, Lexpo/modules/camera/ExpoCameraView;->getAutoFocus()Lexpo/modules/camera/records/FocusMode;

    move-result-object v0

    if-eq v0, p2, :cond_1

    .line 357
    invoke-virtual {p1, p2}, Lexpo/modules/camera/ExpoCameraView;->setAutoFocus(Lexpo/modules/camera/records/FocusMode;)V

    return-void

    .line 360
    :cond_0
    invoke-virtual {p1}, Lexpo/modules/camera/ExpoCameraView;->getAutoFocus()Lexpo/modules/camera/records/FocusMode;

    move-result-object p2

    sget-object v0, Lexpo/modules/camera/records/FocusMode;->OFF:Lexpo/modules/camera/records/FocusMode;

    if-eq p2, v0, :cond_1

    .line 361
    sget-object p2, Lexpo/modules/camera/records/FocusMode;->OFF:Lexpo/modules/camera/records/FocusMode;

    invoke-virtual {p1, p2}, Lexpo/modules/camera/ExpoCameraView;->setAutoFocus(Lexpo/modules/camera/records/FocusMode;)V

    :cond_1
    return-void
.end method

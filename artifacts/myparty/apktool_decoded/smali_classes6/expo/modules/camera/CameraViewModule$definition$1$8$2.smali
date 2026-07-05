.class final Lexpo/modules/camera/CameraViewModule$definition$1$8$2;
.super Ljava/lang/Object;
.source "CameraViewModule.kt"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCanceledListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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
.field final synthetic $promise:Lexpo/modules/kotlin/Promise;


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/Promise;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$8$2;->$promise:Lexpo/modules/kotlin/Promise;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 2

    .line 181
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$8$2;->$promise:Lexpo/modules/kotlin/Promise;

    new-instance v1, Lexpo/modules/camera/CameraExceptions$BarcodeScanningCancelledException;

    invoke-direct {v1}, Lexpo/modules/camera/CameraExceptions$BarcodeScanningCancelledException;-><init>()V

    check-cast v1, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {v0, v1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void
.end method

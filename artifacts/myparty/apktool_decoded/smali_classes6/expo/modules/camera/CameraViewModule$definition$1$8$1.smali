.class final Lexpo/modules/camera/CameraViewModule$definition$1$8$1;
.super Ljava/lang/Object;
.source "CameraViewModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/mlkit/vision/barcode/common/Barcode;",
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
.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic this$0:Lexpo/modules/camera/CameraViewModule;


# direct methods
.method constructor <init>(Lexpo/modules/camera/CameraViewModule;Lexpo/modules/kotlin/Promise;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    iput-object p2, p0, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;->$promise:Lexpo/modules/kotlin/Promise;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 175
    check-cast p1, Lcom/google/mlkit/vision/barcode/common/Barcode;

    invoke-virtual {p0, p1}, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;->invoke(Lcom/google/mlkit/vision/barcode/common/Barcode;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/google/mlkit/vision/barcode/common/Barcode;)V
    .locals 3

    .line 176
    sget-object v0, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->parseBarcodeScanningResult$default(Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;Lcom/google/mlkit/vision/barcode/common/Barcode;Lcom/google/mlkit/vision/common/InputImage;ILjava/lang/Object;)Lexpo/modules/camera/utils/BarCodeScannerResult;

    move-result-object p1

    .line 177
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    sget-object v1, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, p1, v2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->toBundle(Lexpo/modules/camera/utils/BarCodeScannerResult;F)Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "onModernBarcodeScanned"

    invoke-virtual {v0, v1, p1}, Lexpo/modules/camera/CameraViewModule;->sendEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 178
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;->$promise:Lexpo/modules/kotlin/Promise;

    invoke-interface {p1}, Lexpo/modules/kotlin/Promise;->resolve()V

    return-void
.end method

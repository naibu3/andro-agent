.class public final Lexpo/modules/camera/CameraViewModule$definition$1$7$1;
.super Ljava/lang/Object;
.source "CameraViewModule.kt"

# interfaces
.implements Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraViewModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule$definition$1$7$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,465:1\n1563#2:466\n1634#2,3:467\n*S KotlinDebug\n*F\n+ 1 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule$definition$1$7$1\n*L\n124#1:466\n124#1:467,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "expo/modules/camera/CameraViewModule$definition$1$7$1",
        "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;",
        "onSuccess",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "onFailure",
        "cause",
        "",
        "expo-camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $barcodeTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic $url:Ljava/lang/String;

.field final synthetic this$0:Lexpo/modules/camera/CameraViewModule;


# direct methods
.method constructor <init>(Ljava/util/List;Lexpo/modules/camera/CameraViewModule;Lexpo/modules/kotlin/Promise;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;",
            "Lexpo/modules/camera/CameraViewModule;",
            "Lexpo/modules/kotlin/Promise;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$barcodeTypes:Ljava/util/List;

    iput-object p2, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    iput-object p3, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    iput-object p4, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$url:Ljava/lang/String;

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 144
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    new-instance v0, Lexpo/modules/camera/CameraExceptions$ImageRetrievalException;

    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$url:Ljava/lang/String;

    invoke-direct {v0, v1}, Lexpo/modules/camera/CameraExceptions$ImageRetrievalException;-><init>(Ljava/lang/String;)V

    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void
.end method

.method public onSuccess(Landroid/graphics/Bitmap;)V
    .locals 12

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    :try_start_0
    new-instance v2, Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;

    invoke-direct {v2}, Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;-><init>()V

    .line 124
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$barcodeTypes:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 466
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 467
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 468
    check-cast v3, Lexpo/modules/camera/records/BarcodeType;

    .line 124
    invoke-virtual {v3}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 468
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 469
    :cond_0
    move-object v5, v1

    check-cast v5, Ljava/util/List;

    .line 125
    invoke-virtual {v2, v5}, Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;->setSettings(Ljava/util/List;)V

    .line 127
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-static {v0}, Lexpo/modules/camera/CameraViewModule;->access$getModuleScope$p(Lexpo/modules/camera/CameraViewModule;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    new-instance v1, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;

    iget-object v4, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;-><init>(Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;Landroid/graphics/Bitmap;Lexpo/modules/kotlin/Promise;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    move-object v9, v1

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 139
    :catch_0
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    new-instance v0, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;

    invoke-direct {v0}, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;-><init>()V

    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void
.end method

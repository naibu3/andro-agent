.class final Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CameraViewModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->onSuccess(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraViewModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,465:1\n774#2:466\n865#2,2:467\n1563#2:469\n1634#2,3:470\n*S KotlinDebug\n*F\n+ 1 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1\n*L\n130#1:466\n130#1:467,2\n131#1:469\n131#1:470,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "expo.modules.camera.CameraViewModule$definition$1$7$1$onSuccess$1"
    f = "CameraViewModule.kt"
    i = {}
    l = {
        0x81
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic $formats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic $scanner:Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;

.field label:I


# direct methods
.method constructor <init>(Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;Landroid/graphics/Bitmap;Lexpo/modules/kotlin/Promise;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;",
            "Landroid/graphics/Bitmap;",
            "Lexpo/modules/kotlin/Promise;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$scanner:Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;

    iput-object p2, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$bitmap:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$promise:Lexpo/modules/kotlin/Promise;

    iput-object p4, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$formats:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;

    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$scanner:Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;

    iget-object v2, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$bitmap:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$promise:Lexpo/modules/kotlin/Promise;

    iget-object v4, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$formats:Ljava/util/List;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;-><init>(Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;Landroid/graphics/Bitmap;Lexpo/modules/kotlin/Promise;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 127
    iget v1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 129
    :try_start_1
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$scanner:Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;

    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$bitmap:Landroid/graphics/Bitmap;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->label:I

    invoke-virtual {p1, v1, v3}, Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;->scan(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 127
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 130
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$formats:Ljava/util/List;

    .line 466
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 467
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lexpo/modules/camera/utils/BarCodeScannerResult;

    .line 130
    invoke-virtual {v3}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getType()I

    move-result v3

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 467
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 468
    :cond_4
    check-cast v1, Ljava/util/List;

    .line 466
    check-cast v1, Ljava/lang/Iterable;

    .line 469
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 470
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 471
    check-cast v1, Lexpo/modules/camera/utils/BarCodeScannerResult;

    .line 131
    sget-object v2, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v1, v3}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->toBundle(Lexpo/modules/camera/utils/BarCodeScannerResult;F)Landroid/os/Bundle;

    move-result-object v1

    .line 471
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 472
    :cond_5
    check-cast p1, Ljava/util/List;

    .line 132
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$promise:Lexpo/modules/kotlin/Promise;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/util/Collection;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    .line 134
    :goto_3
    sget-object v0, Lexpo/modules/camera/CameraViewModule;->Companion:Lexpo/modules/camera/CameraViewModule$Companion;

    invoke-virtual {v0}, Lexpo/modules/camera/CameraViewModule$Companion;->getTAG$expo_camera_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ML Kit scanning failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;->$promise:Lexpo/modules/kotlin/Promise;

    new-instance v0, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;

    invoke-direct {v0}, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;-><init>()V

    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 137
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

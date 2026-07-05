.class final Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ExpoCameraView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/ExpoCameraView$takePicture$1;->onCaptureSuccess(Landroidx/camera/core/ImageProxy;)V
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
    c = "expo.modules.camera.ExpoCameraView$takePicture$1$onCaptureSuccess$1$1"
    f = "ExpoCameraView.kt"
    i = {}
    l = {
        0x132
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $data:[B

.field final synthetic $it:Ljava/io/File;

.field final synthetic $options:Lexpo/modules/camera/PictureOptions;

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic $runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

.field label:I

.field final synthetic this$0:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method public static synthetic $r8$lambda$QKaIh7gl3MNreoMTgkDE9WA5MIM(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->invokeSuspend$lambda$0(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;Landroid/os/Bundle;)V

    return-void
.end method

.method constructor <init>(Lexpo/modules/camera/ExpoCameraView;[BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/RuntimeContext;Ljava/io/File;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/camera/ExpoCameraView;",
            "[B",
            "Lexpo/modules/kotlin/Promise;",
            "Lexpo/modules/camera/PictureOptions;",
            "Lexpo/modules/kotlin/RuntimeContext;",
            "Ljava/io/File;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$data:[B

    iput-object p3, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$promise:Lexpo/modules/kotlin/Promise;

    iput-object p4, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$options:Lexpo/modules/camera/PictureOptions;

    iput-object p5, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

    iput-object p6, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$it:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;Landroid/os/Bundle;)V
    .locals 0

    .line 303
    invoke-virtual {p0}, Lexpo/modules/camera/PictureOptions;->getPictureRef()Z

    move-result p0

    if-nez p0, :cond_0

    .line 304
    invoke-virtual {p1, p2}, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;

    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$data:[B

    iget-object v3, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$promise:Lexpo/modules/kotlin/Promise;

    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$options:Lexpo/modules/camera/PictureOptions;

    iget-object v5, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

    iget-object v6, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$it:Ljava/io/File;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;-><init>(Lexpo/modules/camera/ExpoCameraView;[BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/RuntimeContext;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 300
    iget v1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 301
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    invoke-virtual {p1}, Lexpo/modules/camera/ExpoCameraView;->getMirror()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    invoke-virtual {p1}, Lexpo/modules/camera/ExpoCameraView;->getLensFacing()Lexpo/modules/camera/records/CameraType;

    move-result-object p1

    sget-object v1, Lexpo/modules/camera/records/CameraType;->FRONT:Lexpo/modules/camera/records/CameraType;

    if-ne p1, v1, :cond_2

    move v7, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    move v7, p1

    .line 302
    :goto_0
    new-instance v3, Lexpo/modules/camera/tasks/ResolveTakenPicture;

    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$data:[B

    iget-object v5, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$promise:Lexpo/modules/kotlin/Promise;

    iget-object v6, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$options:Lexpo/modules/camera/PictureOptions;

    iget-object v8, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

    iget-object v9, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->$it:Ljava/io/File;

    .line 306
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    new-instance v10, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v10, v6, p1}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1$$ExternalSyntheticLambda0;-><init>(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;)V

    .line 302
    invoke-direct/range {v3 .. v10}, Lexpo/modules/camera/tasks/ResolveTakenPicture;-><init>([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;ZLexpo/modules/kotlin/RuntimeContext;Ljava/io/File;Lexpo/modules/camera/tasks/PictureSavedDelegate;)V

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    .line 306
    iput v2, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->label:I

    invoke-virtual {v3, p1}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->resolve(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 307
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

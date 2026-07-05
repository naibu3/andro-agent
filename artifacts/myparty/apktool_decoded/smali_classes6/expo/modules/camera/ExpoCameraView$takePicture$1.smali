.class public final Lexpo/modules/camera/ExpoCameraView$takePicture$1;
.super Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;
.source "ExpoCameraView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/ExpoCameraView;->takePicture(Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/RuntimeContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExpoCameraView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpoCameraView.kt\nexpo/modules/camera/ExpoCameraView$takePicture$1\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,807:1\n28#2:808\n*S KotlinDebug\n*F\n+ 1 ExpoCameraView.kt\nexpo/modules/camera/ExpoCameraView$takePicture$1\n*L\n284#1:808\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "expo/modules/camera/ExpoCameraView$takePicture$1",
        "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;",
        "onCaptureStarted",
        "",
        "onCaptureSuccess",
        "image",
        "Landroidx/camera/core/ImageProxy;",
        "onError",
        "exception",
        "Landroidx/camera/core/ImageCaptureException;",
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
.field final synthetic $cacheDirectory:Ljava/io/File;

.field final synthetic $hasShutterSound:Z

.field final synthetic $options:Lexpo/modules/camera/PictureOptions;

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic $runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

.field final synthetic $volume:I

.field final synthetic this$0:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method public static synthetic $r8$lambda$iVIJz7BadRdJJOdjmy2AOfFSFIQ(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->onCaptureStarted$lambda$1$lambda$0(Lexpo/modules/camera/ExpoCameraView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$sup1iOlC8JXZTeW2pRVknfWBrC0(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->onCaptureStarted$lambda$1(Lexpo/modules/camera/ExpoCameraView;)V

    return-void
.end method

.method constructor <init>(ZILexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/RuntimeContext;)V
    .locals 0

    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$hasShutterSound:Z

    iput p2, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$volume:I

    iput-object p3, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    iput-object p4, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$options:Lexpo/modules/camera/PictureOptions;

    iput-object p5, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    iput-object p6, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$cacheDirectory:Ljava/io/File;

    iput-object p7, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

    .line 275
    invoke-direct {p0}, Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;-><init>()V

    return-void
.end method

.method private static final onCaptureStarted$lambda$1(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 4

    .line 284
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getRootView()Landroid/view/View;

    move-result-object v0

    .line 808
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 284
    invoke-virtual {v0, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 285
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getRootView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lexpo/modules/camera/ExpoCameraView$takePicture$1$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$$ExternalSyntheticLambda1;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final onCaptureStarted$lambda$1$lambda$0(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 1

    .line 286
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getRootView()Landroid/view/View;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public onCaptureStarted()V
    .locals 5

    .line 277
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$hasShutterSound:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$volume:I

    if-eqz v0, :cond_0

    .line 278
    new-instance v0, Landroid/media/MediaActionSound;

    invoke-direct {v0}, Landroid/media/MediaActionSound;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaActionSound;->play(I)V

    .line 280
    :cond_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    invoke-virtual {v0}, Lexpo/modules/camera/ExpoCameraView;->getAnimateShutter()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 283
    :cond_1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    invoke-virtual {v0}, Lexpo/modules/camera/ExpoCameraView;->getRootView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    new-instance v2, Lexpo/modules/camera/ExpoCameraView$takePicture$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$$ExternalSyntheticLambda0;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    const-wide/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onCaptureSuccess(Landroidx/camera/core/ImageProxy;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "image"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy;->getPlanes()[Landroidx/camera/core/ImageProxy$PlaneProxy;

    move-result-object v1

    const-string v3, "getPlanes(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzerKt;->toByteArray([Landroidx/camera/core/ImageProxy$PlaneProxy;)[B

    move-result-object v6

    .line 295
    iget-object v1, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$options:Lexpo/modules/camera/PictureOptions;

    invoke-virtual {v1}, Lexpo/modules/camera/PictureOptions;->getFastMode()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 296
    iget-object v1, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    .line 299
    :cond_0
    iget-object v10, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$cacheDirectory:Ljava/io/File;

    iget-object v5, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    iget-object v7, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    iget-object v8, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$options:Lexpo/modules/camera/PictureOptions;

    iget-object v9, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$runtimeContext:Lexpo/modules/kotlin/RuntimeContext;

    .line 300
    invoke-static {v5}, Lexpo/modules/camera/ExpoCameraView;->access$getScope$p(Lexpo/modules/camera/ExpoCameraView;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v4, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v11}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;-><init>(Lexpo/modules/camera/ExpoCameraView;[BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/RuntimeContext;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    move-object v14, v4

    check-cast v14, Lkotlin/jvm/functions/Function2;

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v11, v1

    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 309
    invoke-interface {v2}, Landroidx/camera/core/ImageProxy;->close()V

    return-void
.end method

.method public onError(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    new-instance v0, Lexpo/modules/camera/CameraExceptions$ImageCaptureFailed;

    invoke-direct {v0}, Lexpo/modules/camera/CameraExceptions$ImageCaptureFailed;-><init>()V

    check-cast v0, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void
.end method

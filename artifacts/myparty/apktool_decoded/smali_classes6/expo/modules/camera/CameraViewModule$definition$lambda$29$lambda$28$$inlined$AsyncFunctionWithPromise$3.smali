.class public final Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;
.super Ljava/lang/Object;
.source "ViewDefinitionBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "[",
        "Ljava/lang/Object;",
        "Lexpo/modules/kotlin/Promise;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nViewDefinitionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewDefinitionBuilder.kt\nexpo/modules/kotlin/views/ViewDefinitionBuilder$AsyncFunction$14\n+ 2 EnforceType.kt\nexpo/modules/kotlin/types/EnforceTypeKt\n+ 3 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule\n*L\n1#1,475:1\n18#2:476\n413#3,10:477\n*S KotlinDebug\n*F\n+ 1 ViewDefinitionBuilder.kt\nexpo/modules/kotlin/views/ViewDefinitionBuilder$AsyncFunction$14\n*L\n290#1:476\n*E\n"
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
.field final synthetic this$0:Lexpo/modules/camera/CameraViewModule;


# direct methods
.method public constructor <init>(Lexpo/modules/camera/CameraViewModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 292
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 13

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    .line 291
    move-object v4, p1

    check-cast v4, Lexpo/modules/camera/PictureOptions;

    move-object v6, v0

    check-cast v6, Lexpo/modules/camera/ExpoCameraView;

    .line 477
    sget-object p1, Lexpo/modules/core/utilities/EmulatorUtilities;->INSTANCE:Lexpo/modules/core/utilities/EmulatorUtilities;

    invoke-virtual {p1}, Lexpo/modules/core/utilities/EmulatorUtilities;->isRunningOnEmulator()Z

    move-result p1

    if-nez p1, :cond_0

    .line 478
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-static {p1}, Lexpo/modules/camera/CameraViewModule;->access$getCacheDirectory(Lexpo/modules/camera/CameraViewModule;)Ljava/io/File;

    move-result-object p1

    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v0}, Lexpo/modules/camera/CameraViewModule;->getRuntimeContext()Lexpo/modules/kotlin/RuntimeContext;

    move-result-object v0

    invoke-virtual {v6, v4, p2, p1, v0}, Lexpo/modules/camera/ExpoCameraView;->takePicture(Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/RuntimeContext;)V

    return-void

    .line 480
    :cond_0
    sget-object p1, Lexpo/modules/camera/CameraViewHelper;->INSTANCE:Lexpo/modules/camera/CameraViewHelper;

    invoke-virtual {v6}, Lexpo/modules/camera/ExpoCameraView;->getWidth()I

    move-result v0

    invoke-virtual {v6}, Lexpo/modules/camera/ExpoCameraView;->getHeight()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lexpo/modules/camera/CameraViewHelper;->generateSimulatorPhoto(II)[B

    move-result-object v2

    .line 481
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-static {p1}, Lexpo/modules/camera/CameraViewModule;->access$getModuleScope$p(Lexpo/modules/camera/CameraViewModule;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    new-instance v1, Lexpo/modules/camera/CameraViewModule$definition$1$12$18$1;

    iget-object v5, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    const/4 v7, 0x0

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lexpo/modules/camera/CameraViewModule$definition$1$12$18$1;-><init>([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/CameraViewModule;Lexpo/modules/camera/ExpoCameraView;Lkotlin/coroutines/Continuation;)V

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

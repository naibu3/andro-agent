.class public final Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;
.super Ljava/lang/Object;
.source "ObjectDefinitionBuilder.kt"

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
    value = "SMAP\nObjectDefinitionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectDefinitionBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$AsyncFunction$14\n+ 2 EnforceType.kt\nexpo/modules/kotlin/types/EnforceTypeKt\n+ 3 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule\n*L\n1#1,613:1\n18#2:614\n113#3,8:615\n148#3:623\n*S KotlinDebug\n*F\n+ 1 ObjectDefinitionBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$AsyncFunction$14\n*L\n300#1:614\n*E\n"
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

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 302
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    .line 301
    check-cast p1, Ljava/util/List;

    check-cast v0, Ljava/lang/String;

    .line 615
    sget-object v1, Lexpo/modules/camera/utils/CameraUtils;->INSTANCE:Lexpo/modules/camera/utils/CameraUtils;

    iget-object v2, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v2}, Lexpo/modules/camera/CameraViewModule;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v2

    invoke-virtual {v2}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lexpo/modules/camera/utils/CameraUtils;->isMLKitAvailable(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 616
    new-instance p1, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;

    invoke-direct {p1}, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;-><init>()V

    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 620
    :cond_0
    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v1}, Lexpo/modules/camera/CameraViewModule;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v1

    invoke-virtual {v1}, Lexpo/modules/kotlin/AppContext;->getImageLoader()Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 622
    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;

    iget-object v3, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {v2, p1, v3, p2, v0}, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;-><init>(Ljava/util/List;Lexpo/modules/camera/CameraViewModule;Lexpo/modules/kotlin/Promise;Ljava/lang/String;)V

    check-cast v2, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;

    .line 620
    invoke-interface {v1, v0, v2}, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;->loadImageForManipulationFromURL(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V

    :cond_1
    return-void
.end method

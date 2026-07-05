.class public final Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6;
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
    value = "SMAP\nViewDefinitionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewDefinitionBuilder.kt\nexpo/modules/kotlin/views/ViewDefinitionBuilder$AsyncFunction$14\n+ 2 EnforceType.kt\nexpo/modules/kotlin/types/EnforceTypeKt\n+ 3 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule\n*L\n1#1,475:1\n18#2:476\n430#3,6:477\n*S KotlinDebug\n*F\n+ 1 ViewDefinitionBuilder.kt\nexpo/modules/kotlin/views/ViewDefinitionBuilder$AsyncFunction$14\n*L\n290#1:476\n*E\n"
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

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 292
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 6

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v1, p1, v0

    const/4 v2, 0x1

    aget-object p1, p1, v2

    .line 291
    check-cast p1, Lexpo/modules/camera/RecordingOptions;

    check-cast v1, Lexpo/modules/camera/ExpoCameraView;

    .line 477
    invoke-virtual {v1}, Lexpo/modules/camera/ExpoCameraView;->getMute()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-static {v3}, Lexpo/modules/camera/CameraViewModule;->access$getPermissionsManager(Lexpo/modules/camera/CameraViewModule;)Lexpo/modules/interfaces/permissions/Permissions;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/String;

    const-string v5, "android.permission.RECORD_AUDIO"

    aput-object v5, v4, v0

    invoke-interface {v3, v4}, Lexpo/modules/interfaces/permissions/Permissions;->hasGrantedPermissions([Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 478
    :cond_0
    new-instance p1, Lexpo/modules/kotlin/exception/Exceptions$MissingPermissions;

    new-array p2, v2, [Ljava/lang/String;

    aput-object v5, p2, v0

    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/Exceptions$MissingPermissions;-><init>([Ljava/lang/String;)V

    throw p1

    .line 481
    :cond_1
    :goto_0
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-static {v0}, Lexpo/modules/camera/CameraViewModule;->access$getCacheDirectory(Lexpo/modules/camera/CameraViewModule;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v1, p1, p2, v0}, Lexpo/modules/camera/ExpoCameraView;->record(Lexpo/modules/camera/RecordingOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;)V

    return-void
.end method

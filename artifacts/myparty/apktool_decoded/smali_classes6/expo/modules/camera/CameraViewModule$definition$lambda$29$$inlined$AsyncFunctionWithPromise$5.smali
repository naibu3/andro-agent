.class public final Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;
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
    value = "SMAP\nObjectDefinitionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectDefinitionBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$AsyncFunction$10\n+ 2 EnforceType.kt\nexpo/modules/kotlin/types/EnforceTypeKt\n+ 3 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,613:1\n11#2:614\n151#3,18:615\n171#3,19:637\n1563#4:633\n1634#4,3:634\n*S KotlinDebug\n*F\n+ 1 ObjectDefinitionBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$AsyncFunction$10\n+ 2 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule\n*L\n275#1:614\n168#2:633\n168#2:634,3\n*E\n"
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

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 277
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 276
    check-cast p1, Lexpo/modules/camera/records/BarcodeSettings;

    .line 615
    sget-object v0, Lexpo/modules/camera/utils/CameraUtils;->INSTANCE:Lexpo/modules/camera/utils/CameraUtils;

    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v1}, Lexpo/modules/camera/CameraViewModule;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v1

    invoke-virtual {v1}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/camera/utils/CameraUtils;->hasGooglePlayServices(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 616
    new-instance p1, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;

    invoke-direct {p1}, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;-><init>()V

    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 620
    :cond_0
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v0}, Lexpo/modules/camera/CameraViewModule;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    .line 623
    new-instance p1, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    invoke-direct {p1}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 628
    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;

    invoke-direct {v1}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;-><init>()V

    .line 629
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 631
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/camera/records/BarcodeType;

    invoke-virtual {v2}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    move-result v2

    .line 632
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/4 v3, 0x1

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 633
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 634
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 635
    check-cast v4, Lexpo/modules/camera/records/BarcodeType;

    .line 632
    invoke-virtual {v4}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 635
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 636
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 633
    check-cast v3, Ljava/util/Collection;

    .line 632
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p1

    array-length v3, p1

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    .line 630
    invoke-virtual {v1, v2, p1}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->setBarcodeFormats(I[I)Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;

    .line 637
    :cond_3
    invoke-virtual {v1}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->build()Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    move-result-object p1

    const-string v1, "build(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 639
    invoke-static {v0, p1}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanning;->getClient(Landroid/content/Context;Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;)Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanner;

    move-result-object p1

    const-string v0, "getClient(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 640
    invoke-interface {p1}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanner;->startScan()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 641
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;

    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {v0, v1, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;-><init>(Lexpo/modules/camera/CameraViewModule;Lexpo/modules/kotlin/Promise;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lexpo/modules/camera/CameraViewModuleKt$sam$com_google_android_gms_tasks_OnSuccessListener$0;

    invoke-direct {v1, v0}, Lexpo/modules/camera/CameraViewModuleKt$sam$com_google_android_gms_tasks_OnSuccessListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcom/google/android/gms/tasks/OnSuccessListener;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 646
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$8$2;

    invoke-direct {v0, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$8$2;-><init>(Lexpo/modules/kotlin/Promise;)V

    check-cast v0, Lcom/google/android/gms/tasks/OnCanceledListener;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCanceledListener(Lcom/google/android/gms/tasks/OnCanceledListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 649
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$8$3;

    invoke-direct {v0, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$8$3;-><init>(Lexpo/modules/kotlin/Promise;)V

    check-cast v0, Lcom/google/android/gms/tasks/OnFailureListener;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 641
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 653
    :catch_0
    new-instance p1, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;

    invoke-direct {p1}, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;-><init>()V

    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    :goto_1
    return-void
.end method

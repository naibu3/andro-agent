.class public final Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;
.super Ljava/lang/Object;
.source "Camera2ExtensionsSessionProcessor.kt"

# interfaces
.implements Landroidx/camera/core/impl/SessionProcessor;
.implements Landroidx/camera/extensions/CameraExtensionsInfo;
.implements Landroidx/camera/extensions/CameraExtensionsControl;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCamera2ExtensionsSessionProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera2ExtensionsSessionProcessor.kt\nandroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0010\u0010\u0004\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001c\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0008\u0010&\u001a\u00020\'H\u0016J\"\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0\u00050)2\u0006\u0010+\u001a\u00020*H\u0016J\u000e\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0015H\u0016J \u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030/\u0012\u0006\u0008\u0000\u0012\u00020\u001d0.0\u0005H\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0016J\u0014\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080.H\u0016J\u0010\u00103\u001a\u00020\'2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\'2\u0006\u00107\u001a\u000208H\u0016J\u0008\u00109\u001a\u00020\'H\u0016J\u0018\u0010:\u001a\u00020\u00082\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u0008\u0010?\u001a\u00020\'H\u0016J \u0010@\u001a\u00020\u00082\u0006\u0010A\u001a\u00020B2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010C\u001a\u00020\'2\u0006\u0010D\u001a\u00020\u0008H\u0016J\u0008\u0010E\u001a\u00020BH\u0016J\u0010\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010GH\u0016J\u0008\u0010H\u001a\u00020BH\u0016J\u0010\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010GH\u0016J\u0016\u0010J\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020K\u0018\u00010.H\u0016J\u0010\u0010L\u001a\u00020\'2\u0006\u0010M\u001a\u00020\u0008H\u0016J\u0012\u0010N\u001a\u00020\'2\u0008\u0010O\u001a\u0004\u0018\u00010\u001fH\u0016R\u0018\u0010\u0004\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0015X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"
    }
    d2 = {
        "Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;",
        "Landroidx/camera/core/impl/SessionProcessor;",
        "Landroidx/camera/extensions/CameraExtensionsInfo;",
        "Landroidx/camera/extensions/CameraExtensionsControl;",
        "availableCaptureRequestKeys",
        "",
        "Landroid/hardware/camera2/CaptureRequest$Key;",
        "mode",
        "",
        "vendorExtender",
        "Landroidx/camera/extensions/internal/VendorExtender;",
        "<init>",
        "(Ljava/util/List;ILandroidx/camera/extensions/internal/VendorExtender;)V",
        "camera2ExtensionMode",
        "extensionStrengthLiveData",
        "Landroidx/lifecycle/MutableLiveData;",
        "currentExtensionTypeLiveData",
        "extensionStrength",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "currentExtensionType",
        "supportedCameraOperations",
        "",
        "getSupportedCameraOperations$annotations",
        "()V",
        "cameraInfoInternal",
        "Landroidx/camera/core/impl/CameraInfoInternal;",
        "cameraCaptureCallback",
        "Landroidx/camera/core/impl/CameraCaptureCallback;",
        "lock",
        "",
        "captureSessionRequestProcessor",
        "Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;",
        "initSession",
        "Landroidx/camera/core/impl/SessionConfig;",
        "cameraInfo",
        "Landroidx/camera/core/CameraInfo;",
        "outputSurfaceConfig",
        "Landroidx/camera/core/impl/OutputSurfaceConfiguration;",
        "deInitSession",
        "",
        "getSupportedPostviewSize",
        "",
        "Landroid/util/Size;",
        "captureSize",
        "getSupportedCameraOperations",
        "getAvailableCharacteristicsKeyValues",
        "Landroid/util/Pair;",
        "Landroid/hardware/camera2/CameraCharacteristics$Key;",
        "getExtensionAvailableStabilizationModes",
        "",
        "getImplementationType",
        "setParameters",
        "config",
        "Landroidx/camera/core/impl/Config;",
        "onCaptureSessionStart",
        "requestProcessor",
        "Landroidx/camera/core/impl/RequestProcessor;",
        "onCaptureSessionEnd",
        "startRepeating",
        "tagBundle",
        "Landroidx/camera/core/impl/TagBundle;",
        "callback",
        "Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;",
        "stopRepeating",
        "startCapture",
        "postviewEnabled",
        "",
        "abortCapture",
        "captureSequenceId",
        "isExtensionStrengthAvailable",
        "getExtensionStrength",
        "Landroidx/lifecycle/LiveData;",
        "isCurrentExtensionModeAvailable",
        "getCurrentExtensionMode",
        "getRealtimeCaptureLatency",
        "",
        "setExtensionStrength",
        "strength",
        "setCaptureSessionRequestProcessor",
        "processor",
        "camera-extensions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final availableCaptureRequestKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final camera2ExtensionMode:I

.field private cameraCaptureCallback:Landroidx/camera/core/impl/CameraCaptureCallback;

.field private cameraInfoInternal:Landroidx/camera/core/impl/CameraInfoInternal;

.field private captureSessionRequestProcessor:Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;

.field private final currentExtensionType:Ljava/util/concurrent/atomic/AtomicInteger;

.field private currentExtensionTypeLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final extensionStrength:Ljava/util/concurrent/atomic/AtomicInteger;

.field private extensionStrengthLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;

.field private final mode:I

.field private final supportedCameraOperations:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final vendorExtender:Landroidx/camera/extensions/internal/VendorExtender;


# direct methods
.method public constructor <init>(Ljava/util/List;ILandroidx/camera/extensions/internal/VendorExtender;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "*>;>;I",
            "Landroidx/camera/extensions/internal/VendorExtender;",
            ")V"
        }
    .end annotation

    const-string v0, "availableCaptureRequestKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vendorExtender"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->availableCaptureRequestKeys:Ljava/util/List;

    .line 54
    iput p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->mode:I

    .line 55
    iput-object p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->vendorExtender:Landroidx/camera/extensions/internal/VendorExtender;

    .line 58
    sget-object p3, Landroidx/camera/extensions/internal/Camera2ExtensionsUtil;->INSTANCE:Landroidx/camera/extensions/internal/Camera2ExtensionsUtil;

    invoke-virtual {p3, p2}, Landroidx/camera/extensions/internal/Camera2ExtensionsUtil;->convertCameraXModeToCamera2Mode(I)I

    move-result p3

    iput p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->camera2ExtensionMode:I

    .line 62
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v0, 0x64

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->extensionStrength:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 63
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->currentExtensionType:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 67
    invoke-static {p1}, Landroidx/camera/extensions/internal/ExtensionsUtils;->getSupportedCameraOperations(Ljava/util/List;)Ljava/util/Set;

    move-result-object p1

    const-string p3, "getSupportedCameraOperations(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->supportedCameraOperations:Ljava/util/Set;

    .line 72
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->lock:Ljava/lang/Object;

    .line 78
    invoke-virtual {p0}, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->isCurrentExtensionModeAvailable()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 79
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->currentExtensionTypeLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 81
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->isExtensionStrengthAvailable()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 82
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->extensionStrengthLiveData:Landroidx/lifecycle/MutableLiveData;

    :cond_1
    return-void
.end method

.method public static final synthetic access$getCurrentExtensionType$p(Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 51
    iget-object p0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->currentExtensionType:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic access$getExtensionStrength$p(Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 51
    iget-object p0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->extensionStrength:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic access$getExtensionStrengthLiveData$p(Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 51
    iget-object p0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->extensionStrengthLiveData:Landroidx/lifecycle/MutableLiveData;

    return-object p0
.end method

.method private static synthetic getSupportedCameraOperations$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public abortCapture(I)V
    .locals 1

    .line 206
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 207
    const-string v0, "Camera2ExtensionsSessionProcessor#abortCapture should not be invoked!"

    .line 206
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public deInitSession()V
    .locals 2

    .line 136
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->cameraInfoInternal:Landroidx/camera/core/impl/CameraInfoInternal;

    if-eqz v0, :cond_0

    .line 137
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->cameraCaptureCallback:Landroidx/camera/core/impl/CameraCaptureCallback;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/CameraInfoInternal;->removeSessionCaptureCallback(Landroidx/camera/core/impl/CameraCaptureCallback;)V

    :cond_0
    return-void
.end method

.method public getAvailableCharacteristicsKeyValues()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "*>;-",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 151
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->vendorExtender:Landroidx/camera/extensions/internal/VendorExtender;

    invoke-interface {v0}, Landroidx/camera/extensions/internal/VendorExtender;->getAvailableCharacteristicsKeyValues()Ljava/util/List;

    move-result-object v0

    const-string v1, "getAvailableCharacteristicsKeyValues(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getCurrentExtensionMode()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 219
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->currentExtensionTypeLiveData:Landroidx/lifecycle/MutableLiveData;

    check-cast v0, Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public getExtensionAvailableStabilizationModes()[I
    .locals 1

    .line 155
    invoke-super {p0}, Landroidx/camera/core/impl/SessionProcessor;->getExtensionAvailableStabilizationModes()[I

    move-result-object v0

    return-object v0
.end method

.method public getExtensionStrength()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 214
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->extensionStrengthLiveData:Landroidx/lifecycle/MutableLiveData;

    check-cast v0, Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public getImplementationType()Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->camera2ExtensionMode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getRealtimeCaptureLatency()Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 222
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->lock:Ljava/lang/Object;

    monitor-enter v0

    .line 223
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->captureSessionRequestProcessor:Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;->getRealtimeStillCaptureLatency()Landroid/util/Pair;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public getSupportedCameraOperations()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 146
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->supportedCameraOperations:Ljava/util/Set;

    return-object v0
.end method

.method public getSupportedPostviewSize(Landroid/util/Size;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    const-string v0, "captureSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->vendorExtender:Landroidx/camera/extensions/internal/VendorExtender;

    invoke-interface {v0, p1}, Landroidx/camera/extensions/internal/VendorExtender;->getSupportedPostviewResolutions(Landroid/util/Size;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "getSupportedPostviewResolutions(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public initSession(Landroidx/camera/core/CameraInfo;Landroidx/camera/core/impl/OutputSurfaceConfiguration;)Landroidx/camera/core/impl/SessionConfig;
    .locals 1

    const-string p2, "cameraInfo"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    check-cast p1, Landroidx/camera/core/impl/CameraInfoInternal;

    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->cameraInfoInternal:Landroidx/camera/core/impl/CameraInfoInternal;

    .line 93
    new-instance p1, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor$initSession$1;

    invoke-direct {p1, p0}, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor$initSession$1;-><init>(Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;)V

    check-cast p1, Landroidx/camera/core/impl/CameraCaptureCallback;

    .line 92
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->cameraCaptureCallback:Landroidx/camera/core/impl/CameraCaptureCallback;

    .line 127
    iget-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->cameraInfoInternal:Landroidx/camera/core/impl/CameraInfoInternal;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 128
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object p2

    .line 129
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->cameraCaptureCallback:Landroidx/camera/core/impl/CameraCaptureCallback;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 127
    invoke-interface {p1, p2, v0}, Landroidx/camera/core/impl/CameraInfoInternal;->addSessionCaptureCallback(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/CameraCaptureCallback;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public isCurrentExtensionModeAvailable()Z
    .locals 1

    .line 217
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->vendorExtender:Landroidx/camera/extensions/internal/VendorExtender;

    invoke-interface {v0}, Landroidx/camera/extensions/internal/VendorExtender;->isCurrentExtensionModeAvailable()Z

    move-result v0

    return v0
.end method

.method public isExtensionStrengthAvailable()Z
    .locals 1

    .line 212
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->vendorExtender:Landroidx/camera/extensions/internal/VendorExtender;

    invoke-interface {v0}, Landroidx/camera/extensions/internal/VendorExtender;->isExtensionStrengthAvailable()Z

    move-result v0

    return v0
.end method

.method public onCaptureSessionEnd()V
    .locals 2

    .line 175
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 176
    const-string v1, "Camera2ExtensionsSessionProcessor#onCaptureSessionEnd should not be invoked!"

    .line 175
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCaptureSessionStart(Landroidx/camera/core/impl/RequestProcessor;)V
    .locals 1

    const-string v0, "requestProcessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 170
    const-string v0, "Camera2ExtensionsSessionProcessor#onCaptureSessionStart should not be invoked!"

    .line 169
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCaptureSessionRequestProcessor(Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;)V
    .locals 1

    .line 232
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->captureSessionRequestProcessor:Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public setExtensionStrength(I)V
    .locals 2

    .line 228
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/Camera2ExtensionsSessionProcessor;->captureSessionRequestProcessor:Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Landroidx/camera/core/impl/SessionProcessor$CaptureSessionRequestProcessor;->setExtensionStrength(I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public setParameters(Landroidx/camera/core/impl/Config;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 164
    const-string v0, "Camera2ExtensionsSessionProcessor#setParameters should not be invoked!"

    .line 163
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startCapture(ZLandroidx/camera/core/impl/TagBundle;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;)I
    .locals 0

    const-string/jumbo p1, "tagBundle"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callback"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 201
    const-string p2, "Camera2ExtensionsSessionProcessor#startCapture should not be invoked!"

    .line 200
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startRepeating(Landroidx/camera/core/impl/TagBundle;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;)I
    .locals 1

    const-string/jumbo v0, "tagBundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callback"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 185
    const-string p2, "Camera2ExtensionsSessionProcessor#startRepeating should not be invoked!"

    .line 184
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public stopRepeating()V
    .locals 2

    .line 190
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 191
    const-string v1, "Camera2ExtensionsSessionProcessor#stopRepeating should not be invoked!"

    .line 190
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public final Lexpo/modules/camera/ExpoCameraView;
.super Lexpo/modules/kotlin/views/ExpoView;
.source "ExpoCameraView.kt"

# interfaces
.implements Lexpo/modules/interfaces/camera/CameraViewInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/ExpoCameraView$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExpoCameraView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpoCameraView.kt\nexpo/modules/camera/ExpoCameraView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 ViewEventDelegate.kt\nexpo/modules/kotlin/viewevent/ViewEventDelegateKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 BarCodeScannerListMappers.kt\nexpo/modules/camera/utils/BarCodeScannerListMappersKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,807:1\n33#2,3:808\n27#3,3:811\n27#3,3:814\n29#3:817\n29#3:818\n11228#4:819\n11563#4,3:820\n4#5,4:823\n10#5,4:827\n774#6:831\n865#6,2:832\n*S KotlinDebug\n*F\n+ 1 ExpoCameraView.kt\nexpo/modules/camera/ExpoCameraView\n*L\n208#1:808,3\n215#1:811,3\n216#1:814,3\n217#1:817\n228#1:818\n614#1:819\n614#1:820,3\n688#1:823,4\n693#1:827,4\n521#1:831\n521#1:832,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e3\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002*\u0001\u000e\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u008f\u0001\u001a\u00020}2\u0007\u0010\u0090\u0001\u001a\u00020U2\u0007\u0010\u0091\u0001\u001a\u00020UH\u0014J6\u0010\u0092\u0001\u001a\u00020}2\u0007\u0010\u0093\u0001\u001a\u00020)2\u0007\u0010\u0094\u0001\u001a\u00020U2\u0007\u0010\u0095\u0001\u001a\u00020U2\u0007\u0010\u0096\u0001\u001a\u00020U2\u0007\u0010\u0097\u0001\u001a\u00020UH\u0014J\u0015\u0010\u0098\u0001\u001a\u00020}2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0016J/\u0010\u009b\u0001\u001a\u00020}2\u0008\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u0008\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u0008\u0010\u00a0\u0001\u001a\u00030\u00a1\u00012\u0008\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001J\u0010\u0010\u00a4\u0001\u001a\u00020}2\u0007\u0010\u00a5\u0001\u001a\u000207J\u0012\u0010\u00a6\u0001\u001a\u00020}2\u0007\u0010\u00a7\u0001\u001a\u00020)H\u0002J%\u0010\u00a8\u0001\u001a\u00020}2\u0008\u0010\u009c\u0001\u001a\u00030\u00a9\u00012\u0008\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u0008\u0010\u00a0\u0001\u001a\u00030\u00a1\u0001J\u0007\u0010\u00aa\u0001\u001a\u00020}J\u0007\u0010\u00ab\u0001\u001a\u00020}J\u0010\u0010\u00ac\u0001\u001a\u00020}H\u0087@\u00a2\u0006\u0003\u0010\u00ad\u0001J\t\u0010\u00ae\u0001\u001a\u00020 H\u0002J\n\u0010\u00af\u0001\u001a\u00030\u00b0\u0001H\u0002J\u0015\u0010\u00b1\u0001\u001a\u0005\u0018\u00010\u00b2\u00012\u0007\u0010\u00b3\u0001\u001a\u00020bH\u0002J\u0010\u0010\u00b4\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u00b5\u0001H\u0002J\t\u0010\u00b6\u0001\u001a\u00020}H\u0002J\u0011\u0010\u00b7\u0001\u001a\u00020}2\u0006\u00100\u001a\u00020CH\u0002J\u0013\u0010\u00b8\u0001\u001a\u00020}2\u0008\u0010\u00b9\u0001\u001a\u00030\u00ba\u0001H\u0002J\u000f\u0010\u00bb\u0001\u001a\u0008\u0012\u0004\u0012\u00020b0$H\u0007J\u0007\u0010\u00bc\u0001\u001a\u00020}J\u0007\u0010\u00bd\u0001\u001a\u00020}J\u0010\u0010\u00be\u0001\u001a\u00020}2\u0007\u0010\u008e\u0001\u001a\u00020)J\u0013\u0010\u00bf\u0001\u001a\u00020}2\n\u0010\u00c0\u0001\u001a\u0005\u0018\u00010\u00c1\u0001J\u0013\u0010\u00c2\u0001\u001a\u00020}2\u0008\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001H\u0002JD\u0010\u00c5\u0001\u001a$\u0012\u0018\u0012\u0016\u0012\u0005\u0012\u00030\u00c8\u00010\u00c7\u0001j\n\u0012\u0005\u0012\u00030\u00c8\u0001`\u00c9\u0001\u0012\u0005\u0012\u00030\u00c8\u00010\u00c6\u00012\r\u0010\u00ca\u0001\u001a\u0008\u0012\u0004\u0012\u00020U0$2\u0008\u0010\u00cb\u0001\u001a\u00030\u00cc\u0001H\u0002J\u0013\u0010\u0086\u0001\u001a\u00020}2\u0008\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001H\u0002J\u0014\u0010\u00cd\u0001\u001a\u00020}2\t\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\'H\u0016J\n\u0010\u00cf\u0001\u001a\u00030\u00d0\u0001H\u0016J\u0011\u0010\u008a\u0001\u001a\u00020}2\u0008\u0010\u00d1\u0001\u001a\u00030\u00c8\u0001J\n\u0010\u00d2\u0001\u001a\u00030\u00d3\u0001H\u0002J\u0007\u0010\u00d4\u0001\u001a\u00020}R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0008\u0012\u0004\u0012\u00020%0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00102\u001a\u0002012\u0006\u00100\u001a\u000201@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R$\u00108\u001a\u0002072\u0006\u00100\u001a\u000207@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R$\u0010>\u001a\u00020=2\u0006\u00100\u001a\u00020=@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR$\u0010D\u001a\u00020C2\u0006\u00100\u001a\u00020C@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR$\u0010J\u001a\u00020I2\u0006\u00100\u001a\u00020I@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR$\u0010P\u001a\u00020O2\u0006\u00100\u001a\u00020O@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR*\u0010V\u001a\u0004\u0018\u00010U2\u0008\u00100\u001a\u0004\u0018\u00010U@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010[\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR(\u0010]\u001a\u0004\u0018\u00010\\2\u0008\u00100\u001a\u0004\u0018\u00010\\@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010aR$\u0010c\u001a\u00020b2\u0006\u00100\u001a\u00020b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR$\u0010h\u001a\u00020)2\u0006\u00100\u001a\u00020)@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008i\u0010j\"\u0004\u0008k\u0010lR\u001a\u0010m\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008n\u0010j\"\u0004\u0008o\u0010lR\u001a\u0010p\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008q\u0010j\"\u0004\u0008r\u0010lR+\u0010t\u001a\u00020)2\u0006\u0010s\u001a\u00020)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008w\u0010x\u001a\u0004\u0008u\u0010j\"\u0004\u0008v\u0010lR\u000e\u0010y\u001a\u00020UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010{\u001a\u0008\u0012\u0004\u0012\u00020}0|8BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001\u001a\u0004\u0008~\u0010\u007fR&\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010|8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u0085\u0001\u0010\u0081\u0001\u001a\u0005\u0008\u0084\u0001\u0010\u007fR&\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010|8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u0089\u0001\u0010\u0081\u0001\u001a\u0005\u0008\u0088\u0001\u0010\u007fR&\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010|8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u008d\u0001\u0010\u0081\u0001\u001a\u0005\u0008\u008c\u0001\u0010\u007fR\u000f\u0010\u008e\u0001\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00d5\u0001"
    }
    d2 = {
        "Lexpo/modules/camera/ExpoCameraView;",
        "Lexpo/modules/kotlin/views/ExpoView;",
        "Lexpo/modules/interfaces/camera/CameraViewInterface;",
        "context",
        "Landroid/content/Context;",
        "appContext",
        "Lexpo/modules/kotlin/AppContext;",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V",
        "currentActivity",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "getCurrentActivity",
        "()Landroidx/appcompat/app/AppCompatActivity;",
        "orientationEventListener",
        "expo/modules/camera/ExpoCameraView$orientationEventListener$2$1",
        "getOrientationEventListener",
        "()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;",
        "orientationEventListener$delegate",
        "Lkotlin/Lazy;",
        "camera",
        "Landroidx/camera/core/Camera;",
        "getCamera",
        "()Landroidx/camera/core/Camera;",
        "setCamera",
        "(Landroidx/camera/core/Camera;)V",
        "activeRecording",
        "Landroidx/camera/video/Recording;",
        "cameraProvider",
        "Landroidx/camera/lifecycle/ProcessCameraProvider;",
        "imageCaptureUseCase",
        "Landroidx/camera/core/ImageCapture;",
        "imageAnalysisUseCase",
        "Landroidx/camera/core/ImageAnalysis;",
        "recorder",
        "Landroidx/camera/video/Recorder;",
        "barcodeFormats",
        "",
        "Lexpo/modules/camera/records/BarcodeType;",
        "glSurfaceTexture",
        "Landroid/graphics/SurfaceTexture;",
        "isRecording",
        "",
        "previewView",
        "Landroidx/camera/view/PreviewView;",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "shouldCreateCamera",
        "previewPaused",
        "value",
        "Lexpo/modules/camera/records/CameraType;",
        "lensFacing",
        "getLensFacing",
        "()Lexpo/modules/camera/records/CameraType;",
        "setLensFacing",
        "(Lexpo/modules/camera/records/CameraType;)V",
        "Lexpo/modules/camera/records/FlashMode;",
        "flashMode",
        "getFlashMode",
        "()Lexpo/modules/camera/records/FlashMode;",
        "setFlashMode",
        "(Lexpo/modules/camera/records/FlashMode;)V",
        "Lexpo/modules/camera/records/CameraMode;",
        "cameraMode",
        "getCameraMode",
        "()Lexpo/modules/camera/records/CameraMode;",
        "setCameraMode",
        "(Lexpo/modules/camera/records/CameraMode;)V",
        "",
        "zoom",
        "getZoom",
        "()F",
        "setZoom",
        "(F)V",
        "Lexpo/modules/camera/records/FocusMode;",
        "autoFocus",
        "getAutoFocus",
        "()Lexpo/modules/camera/records/FocusMode;",
        "setAutoFocus",
        "(Lexpo/modules/camera/records/FocusMode;)V",
        "Lexpo/modules/camera/records/VideoQuality;",
        "videoQuality",
        "getVideoQuality",
        "()Lexpo/modules/camera/records/VideoQuality;",
        "setVideoQuality",
        "(Lexpo/modules/camera/records/VideoQuality;)V",
        "",
        "videoEncodingBitrate",
        "getVideoEncodingBitrate",
        "()Ljava/lang/Integer;",
        "setVideoEncodingBitrate",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "Lexpo/modules/camera/records/CameraRatio;",
        "ratio",
        "getRatio",
        "()Lexpo/modules/camera/records/CameraRatio;",
        "setRatio",
        "(Lexpo/modules/camera/records/CameraRatio;)V",
        "",
        "pictureSize",
        "getPictureSize",
        "()Ljava/lang/String;",
        "setPictureSize",
        "(Ljava/lang/String;)V",
        "mirror",
        "getMirror",
        "()Z",
        "setMirror",
        "(Z)V",
        "mute",
        "getMute",
        "setMute",
        "animateShutter",
        "getAnimateShutter",
        "setAnimateShutter",
        "<set-?>",
        "enableTorch",
        "getEnableTorch",
        "setEnableTorch",
        "enableTorch$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "lastWidth",
        "lastHeight",
        "onCameraReady",
        "Lexpo/modules/kotlin/viewevent/ViewEventCallback;",
        "",
        "getOnCameraReady",
        "()Lexpo/modules/kotlin/viewevent/ViewEventCallback;",
        "onCameraReady$delegate",
        "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;",
        "onMountError",
        "Lexpo/modules/camera/common/CameraMountErrorEvent;",
        "getOnMountError",
        "onMountError$delegate",
        "onBarcodeScanned",
        "Lexpo/modules/camera/common/BarcodeScannedEvent;",
        "getOnBarcodeScanned",
        "onBarcodeScanned$delegate",
        "onPictureSaved",
        "Lexpo/modules/camera/common/PictureSavedEvent;",
        "getOnPictureSaved",
        "onPictureSaved$delegate",
        "shouldScanBarcodes",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onLayout",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onViewAdded",
        "child",
        "Landroid/view/View;",
        "takePicture",
        "options",
        "Lexpo/modules/camera/PictureOptions;",
        "promise",
        "Lexpo/modules/kotlin/Promise;",
        "cacheDirectory",
        "Ljava/io/File;",
        "runtimeContext",
        "Lexpo/modules/kotlin/RuntimeContext;",
        "setCameraFlashMode",
        "mode",
        "setTorchEnabled",
        "enabled",
        "record",
        "Lexpo/modules/camera/RecordingOptions;",
        "stopRecording",
        "toggleRecording",
        "createCamera",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createImageAnalyzer",
        "buildResolutionSelector",
        "Landroidx/camera/core/resolutionselector/ResolutionSelector;",
        "parseSizeSafely",
        "Landroid/util/Size;",
        "size",
        "createVideoCapture",
        "Landroidx/camera/video/VideoCapture;",
        "startFocusMetering",
        "setCameraZoom",
        "observeCameraState",
        "cameraInfo",
        "Landroidx/camera/core/CameraInfo;",
        "getAvailablePictureSizes",
        "resumePreview",
        "pausePreview",
        "setShouldScanBarcodes",
        "setBarcodeScannerSettings",
        "settings",
        "Lexpo/modules/camera/records/BarcodeSettings;",
        "transformBarcodeScannerResultToViewCoordinates",
        "barcode",
        "Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "getCornerPointsAndBoundingBox",
        "Lkotlin/Pair;",
        "Ljava/util/ArrayList;",
        "Landroid/os/Bundle;",
        "Lkotlin/collections/ArrayList;",
        "cornerPoints",
        "boundingBox",
        "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
        "setPreviewTexture",
        "surfaceTexture",
        "getPreviewSizeAsArray",
        "",
        "response",
        "cancelCoroutineScope",
        "",
        "cleanupCamera",
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


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private activeRecording:Landroidx/camera/video/Recording;

.field private animateShutter:Z

.field private autoFocus:Lexpo/modules/camera/records/FocusMode;

.field private barcodeFormats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;"
        }
    .end annotation
.end field

.field private camera:Landroidx/camera/core/Camera;

.field private cameraMode:Lexpo/modules/camera/records/CameraMode;

.field private cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

.field private final enableTorch$delegate:Lkotlin/properties/ReadWriteProperty;

.field private flashMode:Lexpo/modules/camera/records/FlashMode;

.field private glSurfaceTexture:Landroid/graphics/SurfaceTexture;

.field private imageAnalysisUseCase:Landroidx/camera/core/ImageAnalysis;

.field private imageCaptureUseCase:Landroidx/camera/core/ImageCapture;

.field private isRecording:Z

.field private lastHeight:I

.field private lastWidth:I

.field private lensFacing:Lexpo/modules/camera/records/CameraType;

.field private mirror:Z

.field private mute:Z

.field private final onBarcodeScanned$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final onCameraReady$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final onMountError$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final onPictureSaved$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final orientationEventListener$delegate:Lkotlin/Lazy;

.field private pictureSize:Ljava/lang/String;

.field private previewPaused:Z

.field private previewView:Landroidx/camera/view/PreviewView;

.field private ratio:Lexpo/modules/camera/records/CameraRatio;

.field private recorder:Landroidx/camera/video/Recorder;

.field private final scope:Lkotlinx/coroutines/CoroutineScope;

.field private shouldCreateCamera:Z

.field private shouldScanBarcodes:Z

.field private videoEncodingBitrate:Ljava/lang/Integer;

.field private videoQuality:Lexpo/modules/camera/records/VideoQuality;

.field private zoom:F


# direct methods
.method public static synthetic $r8$lambda$0D0b5hkRFuZ4LFjQj3CTzRiOxDQ(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;Landroidx/camera/core/SurfaceRequest;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView;->createCamera$lambda$15$lambda$14(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;Landroidx/camera/core/SurfaceRequest;)V

    return-void
.end method

.method public static synthetic $r8$lambda$2a4sfEePjMeg7TWt2K-PGCp1IG8(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->createImageAnalyzer$lambda$21$lambda$20(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$87iTa1Z1Yw82UUCTJQoGjKznWGk(Lexpo/modules/camera/common/PictureSavedEvent;)S
    .locals 0

    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved_delegate$lambda$5(Lexpo/modules/camera/common/PictureSavedEvent;)S

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$N8STAGhKTqXM3aFpI1W1fLn7FYA(Ljava/util/List;I)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->buildResolutionSelector$lambda$24(Ljava/util/List;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$PXvJ278I5Md2YhwnuHfhtQ5VHHk(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->orientationEventListener_delegate$lambda$0(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$PfHccbbgFuWoL4DJEKjx3JTBBDk(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;Landroidx/camera/video/VideoRecordEvent;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView;->record$lambda$9$lambda$8(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;Landroidx/camera/video/VideoRecordEvent;)V

    return-void
.end method

.method public static synthetic $r8$lambda$PweXDvqYFGe1X1bFDZTpa-F5i8M(Lexpo/modules/camera/ExpoCameraView;Landroidx/camera/core/CameraState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->observeCameraState$lambda$32(Lexpo/modules/camera/ExpoCameraView;Landroidx/camera/core/CameraState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UEda7oLjTcnH9PaAxs_vUkshE0E(Landroid/view/Surface;Landroidx/camera/core/SurfaceRequest$Result;)V
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->createCamera$lambda$15$lambda$14$lambda$13(Landroid/view/Surface;Landroidx/camera/core/SurfaceRequest$Result;)V

    return-void
.end method

.method public static synthetic $r8$lambda$WeNHOUYUhttn1DkO3zGoSyzb27U(Lexpo/modules/camera/common/BarcodeScannedEvent;)S
    .locals 0

    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned_delegate$lambda$4(Lexpo/modules/camera/common/BarcodeScannedEvent;)S

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x5

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 208
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "enableTorch"

    const-string v3, "getEnableTorch()Z"

    const-class v4, Lexpo/modules/camera/ExpoCameraView;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    .line 215
    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-string v2, "onCameraReady"

    const-string v3, "getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/PropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 216
    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-string v2, "onMountError"

    const-string v3, "getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/PropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 217
    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-string v2, "onBarcodeScanned"

    const-string v3, "getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/PropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 228
    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-string v2, "onPictureSaved"

    const-string v3, "getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/PropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/views/ExpoView;-><init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V

    .line 102
    new-instance v0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda2;

    invoke-direct {v0, p2, p0}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda2;-><init>(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->orientationEventListener$delegate:Lkotlin/Lazy;

    .line 129
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->barcodeFormats:Ljava/util/List;

    .line 133
    new-instance p2, Landroidx/camera/view/PreviewView;

    invoke-direct {p2, p1}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 134
    invoke-virtual {p2, p1}, Landroidx/camera/view/PreviewView;->setElevation(F)V

    .line 133
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    .line 136
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 140
    sget-object p1, Lexpo/modules/camera/records/CameraType;->BACK:Lexpo/modules/camera/records/CameraType;

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    .line 146
    sget-object p1, Lexpo/modules/camera/records/FlashMode;->OFF:Lexpo/modules/camera/records/FlashMode;

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    .line 152
    sget-object p1, Lexpo/modules/camera/records/CameraMode;->PICTURE:Lexpo/modules/camera/records/CameraMode;

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    .line 164
    sget-object p1, Lexpo/modules/camera/records/FocusMode;->OFF:Lexpo/modules/camera/records/FocusMode;

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    .line 176
    sget-object p1, Lexpo/modules/camera/records/VideoQuality;->VIDEO1080P:Lexpo/modules/camera/records/VideoQuality;

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    .line 194
    const-string p1, ""

    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    const/4 p1, 0x1

    .line 207
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->animateShutter:Z

    .line 208
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 808
    new-instance p2, Lexpo/modules/camera/ExpoCameraView$special$$inlined$observable$1;

    invoke-direct {p2, p1, p0}, Lexpo/modules/camera/ExpoCameraView$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lexpo/modules/camera/ExpoCameraView;)V

    check-cast p2, Lkotlin/properties/ReadWriteProperty;

    .line 208
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->enableTorch$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 215
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    .line 813
    new-instance p2, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 215
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->onCameraReady$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 816
    new-instance p2, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    invoke-direct {p2, p1, v0}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 216
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->onMountError$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 217
    new-instance p2, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda3;

    invoke-direct {p2}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda3;-><init>()V

    .line 817
    new-instance v0, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    invoke-direct {v0, p1, p2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 217
    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 228
    new-instance p2, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda4;

    invoke-direct {p2}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda4;-><init>()V

    .line 818
    new-instance v0, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    invoke-direct {v0, p1, p2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 228
    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 770
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOrientationEventListener()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    move-result-object p1

    invoke-virtual {p1}, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;->enable()V

    .line 771
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    new-instance p2, Lexpo/modules/camera/ExpoCameraView$1;

    invoke-direct {p2, p0}, Lexpo/modules/camera/ExpoCameraView$1;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    check-cast p2, Landroid/view/ViewGroup$OnHierarchyChangeListener;

    invoke-virtual {p1, p2}, Landroidx/camera/view/PreviewView;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 782
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    check-cast p1, Landroid/view/View;

    .line 783
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 781
    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static final synthetic access$getImageAnalysisUseCase$p(Lexpo/modules/camera/ExpoCameraView;)Landroidx/camera/core/ImageAnalysis;
    .locals 0

    .line 93
    iget-object p0, p0, Lexpo/modules/camera/ExpoCameraView;->imageAnalysisUseCase:Landroidx/camera/core/ImageAnalysis;

    return-object p0
.end method

.method public static final synthetic access$getImageCaptureUseCase$p(Lexpo/modules/camera/ExpoCameraView;)Landroidx/camera/core/ImageCapture;
    .locals 0

    .line 93
    iget-object p0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Landroidx/camera/core/ImageCapture;

    return-object p0
.end method

.method public static final synthetic access$getScope$p(Lexpo/modules/camera/ExpoCameraView;)Lkotlinx/coroutines/CoroutineScope;
    .locals 0

    .line 93
    iget-object p0, p0, Lexpo/modules/camera/ExpoCameraView;->scope:Lkotlinx/coroutines/CoroutineScope;

    return-object p0
.end method

.method public static final synthetic access$setTorchEnabled(Lexpo/modules/camera/ExpoCameraView;Z)V
    .locals 0

    .line 93
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setTorchEnabled(Z)V

    return-void
.end method

.method private final buildResolutionSelector()Landroidx/camera/core/resolutionselector/ResolutionSelector;
    .locals 3

    .line 510
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 511
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    invoke-direct {p0, v0}, Lexpo/modules/camera/ExpoCameraView;->parseSizeSafely(Ljava/lang/String;)Landroid/util/Size;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 513
    new-instance v1, Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Landroidx/camera/core/resolutionselector/ResolutionStrategy;-><init>(Landroid/util/Size;I)V

    goto :goto_0

    .line 514
    :cond_0
    sget-object v1, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->HIGHEST_AVAILABLE_STRATEGY:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    const-string v0, "HIGHEST_AVAILABLE_STRATEGY"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 516
    :cond_1
    sget-object v1, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->HIGHEST_AVAILABLE_STRATEGY:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 515
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 519
    :goto_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    sget-object v2, Lexpo/modules/camera/records/CameraRatio;->ONE_ONE:Lexpo/modules/camera/records/CameraRatio;

    if-ne v0, v2, :cond_2

    .line 520
    new-instance v0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    invoke-direct {v0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    new-instance v2, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda5;

    invoke-direct {v2}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda5;-><init>()V

    invoke-virtual {v0, v2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionFilter(Landroidx/camera/core/resolutionselector/ResolutionFilter;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    move-result-object v0

    .line 524
    invoke-virtual {v0, v1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    move-result-object v0

    .line 519
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    .line 526
    :cond_2
    new-instance v0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    invoke-direct {v0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    .line 527
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    if-eqz v2, :cond_3

    .line 528
    invoke-virtual {v2}, Lexpo/modules/camera/records/CameraRatio;->mapToStrategy()Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setAspectRatioStrategy(Landroidx/camera/core/resolutionselector/AspectRatioStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 530
    :cond_3
    invoke-virtual {v0, v1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 531
    invoke-virtual {v0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    move-result-object v0

    .line 525
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final buildResolutionSelector$lambda$24(Ljava/util/List;I)Ljava/util/List;
    .locals 3

    const-string p1, "supportedSizes"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    check-cast p0, Ljava/lang/Iterable;

    .line 831
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 832
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/util/Size;

    .line 522
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    if-ne v2, v1, :cond_0

    .line 832
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 833
    :cond_1
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private final cancelCoroutineScope()Ljava/lang/Object;
    .locals 4

    .line 795
    :try_start_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lexpo/modules/core/errors/ModuleDestroyedException;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Lexpo/modules/core/errors/ModuleDestroyedException;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/util/concurrent/CancellationException;

    invoke-static {v0, v1}, Lkotlinx/coroutines/CoroutineScopeKt;->cancel(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 797
    :catch_0
    sget-object v0, Lexpo/modules/camera/CameraViewModule;->Companion:Lexpo/modules/camera/CameraViewModule$Companion;

    invoke-virtual {v0}, Lexpo/modules/camera/CameraViewModule$Companion;->getTAG$expo_camera_release()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The scope does not have a job in it"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private static final createCamera$lambda$15$lambda$14(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;Landroidx/camera/core/SurfaceRequest;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 437
    invoke-virtual {p1}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p0

    new-instance p1, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda1;

    invoke-direct {p1, v0}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda1;-><init>(Landroid/view/Surface;)V

    invoke-virtual {p2, v0, p0, p1}, Landroidx/camera/core/SurfaceRequest;->provideSurface(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V

    return-void
.end method

.method private static final createCamera$lambda$15$lambda$14$lambda$13(Landroid/view/Surface;Landroidx/camera/core/SurfaceRequest$Result;)V
    .locals 0

    .line 438
    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    return-void
.end method

.method private final createImageAnalyzer()Landroidx/camera/core/ImageAnalysis;
    .locals 6

    .line 486
    new-instance v0, Landroidx/camera/core/ImageAnalysis$Builder;

    invoke-direct {v0}, Landroidx/camera/core/ImageAnalysis$Builder;-><init>()V

    .line 488
    new-instance v1, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    invoke-direct {v1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    .line 489
    sget-object v2, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->HIGHEST_AVAILABLE_STRATEGY:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    invoke-virtual {v1, v2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    move-result-object v1

    .line 490
    invoke-virtual {v1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    move-result-object v1

    .line 487
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageAnalysis$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/ImageAnalysis$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 492
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageAnalysis$Builder;->setBackpressureStrategy(I)Landroidx/camera/core/ImageAnalysis$Builder;

    move-result-object v0

    .line 493
    invoke-virtual {v0}, Landroidx/camera/core/ImageAnalysis$Builder;->build()Landroidx/camera/core/ImageAnalysis;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    iget-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldScanBarcodes:Z

    if-eqz v1, :cond_0

    sget-object v1, Lexpo/modules/camera/utils/CameraUtils;->INSTANCE:Lexpo/modules/camera/utils/CameraUtils;

    invoke-virtual {v1}, Lexpo/modules/camera/utils/CameraUtils;->isMLKitBarcodeScannerAvailable()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 498
    :try_start_0
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 499
    new-instance v2, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;

    iget-object v3, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->barcodeFormats:Ljava/util/List;

    .line 497
    new-instance v5, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda6;

    invoke-direct {v5, p0}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda6;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    .line 499
    invoke-direct {v2, v3, v4, v5}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;-><init>(Lexpo/modules/camera/records/CameraType;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Landroidx/camera/core/ImageAnalysis$Analyzer;

    .line 497
    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/ImageAnalysis;->setAnalyzer(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageAnalysis$Analyzer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 504
    sget-object v2, Lexpo/modules/camera/CameraViewModule;->Companion:Lexpo/modules/camera/CameraViewModule$Companion;

    invoke-virtual {v2}, Lexpo/modules/camera/CameraViewModule$Companion;->getTAG$expo_camera_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to initialize BarcodeAnalyzer: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object v0
.end method

.method private static final createImageAnalyzer$lambda$21$lambda$20(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned(Lexpo/modules/camera/utils/BarCodeScannerResult;)V

    .line 501
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final createVideoCapture()Landroidx/camera/video/VideoCapture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/video/VideoCapture<",
            "Landroidx/camera/video/Recorder;",
            ">;"
        }
    .end annotation

    .line 549
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    invoke-virtual {v0}, Lexpo/modules/camera/records/VideoQuality;->mapToQuality()Landroidx/camera/video/Quality;

    move-result-object v0

    .line 550
    invoke-static {v0}, Landroidx/camera/video/FallbackStrategy;->higherQualityOrLowerThan(Landroidx/camera/video/Quality;)Landroidx/camera/video/FallbackStrategy;

    move-result-object v1

    const-string v2, "higherQualityOrLowerThan(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 551
    invoke-static {v0, v1}, Landroidx/camera/video/QualitySelector;->from(Landroidx/camera/video/Quality;Landroidx/camera/video/FallbackStrategy;)Landroidx/camera/video/QualitySelector;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    new-instance v1, Landroidx/camera/video/Recorder$Builder;

    invoke-direct {v1}, Landroidx/camera/video/Recorder$Builder;-><init>()V

    .line 554
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->videoEncodingBitrate:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 555
    invoke-virtual {v1, v2}, Landroidx/camera/video/Recorder$Builder;->setTargetVideoEncodingBitRate(I)Landroidx/camera/video/Recorder$Builder;

    .line 558
    :cond_0
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/video/Recorder$Builder;->setExecutor(Ljava/util/concurrent/Executor;)Landroidx/camera/video/Recorder$Builder;

    move-result-object v1

    .line 559
    invoke-virtual {v1, v0}, Landroidx/camera/video/Recorder$Builder;->setQualitySelector(Landroidx/camera/video/QualitySelector;)Landroidx/camera/video/Recorder$Builder;

    move-result-object v0

    .line 560
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$Builder;->build()Landroidx/camera/video/Recorder;

    move-result-object v0

    .line 562
    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->recorder:Landroidx/camera/video/Recorder;

    .line 561
    const-string v1, "also(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    new-instance v1, Landroidx/camera/video/VideoCapture$Builder;

    check-cast v0, Landroidx/camera/video/VideoOutput;

    invoke-direct {v1, v0}, Landroidx/camera/video/VideoCapture$Builder;-><init>(Landroidx/camera/video/VideoOutput;)V

    .line 566
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->mirror:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 567
    invoke-virtual {v1, v0}, Landroidx/camera/video/VideoCapture$Builder;->setMirrorMode(I)Landroidx/camera/video/VideoCapture$Builder;

    :cond_1
    const/4 v0, 0x1

    .line 569
    invoke-virtual {v1, v0}, Landroidx/camera/video/VideoCapture$Builder;->setVideoStabilizationEnabled(Z)Landroidx/camera/video/VideoCapture$Builder;

    .line 570
    invoke-virtual {v1}, Landroidx/camera/video/VideoCapture$Builder;->build()Landroidx/camera/video/VideoCapture;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;)Lkotlin/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 707
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 708
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 709
    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v4, v2, v3}, Lkotlin/internal/ProgressionUtilKt;->getProgressionLastElement(III)I

    move-result v2

    const-string v3, "y"

    const-string v5, "x"

    if-ltz v2, :cond_0

    .line 710
    :goto_0
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v0

    add-int/lit8 v7, v4, 0x1

    .line 711
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v0

    .line 713
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 714
    invoke-virtual {v8, v5, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 715
    invoke-virtual {v8, v3, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 712
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v4, v2, :cond_0

    add-int/lit8 v4, v4, 0x2

    goto :goto_0

    .line 719
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 722
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 723
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getX()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v0

    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 724
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getY()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v0

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 725
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 722
    check-cast v2, Landroid/os/Parcelable;

    .line 720
    const-string v3, "origin"

    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 729
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 730
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v0

    const-string v4, "width"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 731
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    const-string v0, "height"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 732
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 729
    check-cast v2, Landroid/os/Parcelable;

    .line 727
    const-string p2, "size"

    invoke-virtual {p1, p2, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 735
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method private final getCurrentActivity()Landroidx/appcompat/app/AppCompatActivity;
    .locals 2

    .line 100
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getThrowingActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    return-object v0
.end method

.method private final getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lexpo/modules/camera/common/BarcodeScannedEvent;",
            ">;"
        }
    .end annotation

    .line 217
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    sget-object v2, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;Lkotlin/reflect/KProperty;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object v0

    return-object v0
.end method

.method private final getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 215
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onCameraReady$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    sget-object v2, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;Lkotlin/reflect/KProperty;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object v0

    return-object v0
.end method

.method private final getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lexpo/modules/camera/common/CameraMountErrorEvent;",
            ">;"
        }
    .end annotation

    .line 216
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onMountError$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    sget-object v2, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;Lkotlin/reflect/KProperty;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object v0

    return-object v0
.end method

.method private final getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lexpo/modules/camera/common/PictureSavedEvent;",
            ">;"
        }
    .end annotation

    .line 228
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    sget-object v2, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;Lkotlin/reflect/KProperty;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object v0

    return-object v0
.end method

.method private final getOrientationEventListener()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;
    .locals 1

    .line 102
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->orientationEventListener$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    return-object v0
.end method

.method private final observeCameraState(Landroidx/camera/core/CameraInfo;)V
    .locals 3

    .line 597
    invoke-interface {p1}, Landroidx/camera/core/CameraInfo;->getCameraState()Landroidx/lifecycle/LiveData;

    move-result-object p1

    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getCurrentActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda0;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    new-instance v2, Lexpo/modules/camera/ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lexpo/modules/camera/ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Landroidx/lifecycle/Observer;

    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method private static final observeCameraState$lambda$32(Lexpo/modules/camera/ExpoCameraView;Landroidx/camera/core/CameraState;)Lkotlin/Unit;
    .locals 1

    .line 598
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getType()Landroidx/camera/core/CameraState$Type;

    move-result-object p1

    sget-object v0, Lexpo/modules/camera/ExpoCameraView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Landroidx/camera/core/CameraState$Type;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 600
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p1, v0}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 601
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getEnableTorch()Z

    move-result p1

    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setTorchEnabled(Z)V

    .line 606
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final onBarcodeScanned(Lexpo/modules/camera/utils/BarCodeScannerResult;)V
    .locals 10

    .line 739
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->shouldScanBarcodes:Z

    if-eqz v0, :cond_0

    .line 740
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->transformBarcodeScannerResultToViewCoordinates(Lexpo/modules/camera/utils/BarCodeScannerResult;)V

    .line 742
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getCornerPoints()Ljava/util/List;

    move-result-object v0

    .line 743
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getBoundingBox()Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;

    move-result-object v1

    .line 741
    invoke-direct {p0, v0, v1}, Lexpo/modules/camera/ExpoCameraView;->getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/os/Bundle;

    .line 745
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object v0

    .line 746
    new-instance v2, Lexpo/modules/camera/common/BarcodeScannedEvent;

    .line 747
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getId()I

    move-result v3

    .line 748
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 749
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getRaw()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 750
    sget-object v1, Lexpo/modules/camera/records/BarcodeType;->Companion:Lexpo/modules/camera/records/BarcodeType$Companion;

    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getType()I

    move-result v6

    invoke-virtual {v1, v6}, Lexpo/modules/camera/records/BarcodeType$Companion;->mapFormatToString(I)Ljava/lang/String;

    move-result-object v6

    .line 753
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getExtra()Landroid/os/Bundle;

    move-result-object v9

    .line 746
    invoke-direct/range {v2 .. v9}, Lexpo/modules/camera/common/BarcodeScannedEvent;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 745
    invoke-interface {v0, v2}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final onBarcodeScanned_delegate$lambda$4(Lexpo/modules/camera/common/BarcodeScannedEvent;)S
    .locals 1

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    invoke-virtual {p0}, Lexpo/modules/camera/common/BarcodeScannedEvent;->getData()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    rem-int/lit16 p0, p0, 0x7fff

    int-to-short p0, p0

    return p0
.end method

.method private static final onPictureSaved_delegate$lambda$5(Lexpo/modules/camera/common/PictureSavedEvent;)S
    .locals 1

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    invoke-virtual {p0}, Lexpo/modules/camera/common/PictureSavedEvent;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "uri"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    .line 231
    :goto_0
    rem-int/lit16 p0, p0, 0x7fff

    int-to-short p0, p0

    return p0
.end method

.method private static final orientationEventListener_delegate$lambda$0(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;
    .locals 1

    .line 103
    invoke-virtual {p0}, Lexpo/modules/kotlin/AppContext;->getThrowingActivity()Landroid/app/Activity;

    move-result-object p0

    new-instance v0, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    invoke-direct {v0, p1, p0}, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Landroid/app/Activity;)V

    return-object v0
.end method

.method private final parseSizeSafely(Ljava/lang/String;)Landroid/util/Size;
    .locals 2

    .line 536
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\d+x\\d+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 537
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 542
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/util/Size;->parseSize(Ljava/lang/String;)Landroid/util/Size;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    return-object v1
.end method

.method private static final record$lambda$9$lambda$8(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;Landroidx/camera/video/VideoRecordEvent;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 353
    instance-of v0, p2, Landroidx/camera/video/VideoRecordEvent$Pause;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 354
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    return-void

    .line 356
    :cond_0
    instance-of v0, p2, Landroidx/camera/video/VideoRecordEvent$Resume;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 357
    iput-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    return-void

    .line 359
    :cond_1
    instance-of v0, p2, Landroidx/camera/video/VideoRecordEvent$Start;

    if-eqz v0, :cond_2

    .line 360
    iput-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    return-void

    .line 362
    :cond_2
    instance-of p0, p2, Landroidx/camera/video/VideoRecordEvent$Finalize;

    if-eqz p0, :cond_8

    .line 363
    check-cast p2, Landroidx/camera/video/VideoRecordEvent$Finalize;

    invoke-virtual {p2}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getError()I

    move-result p0

    if-eqz p0, :cond_7

    const/4 v0, 0x2

    if-eq p0, v0, :cond_7

    const/4 v0, 0x4

    if-eq p0, v0, :cond_7

    const/16 v0, 0x9

    if-eq p0, v0, :cond_7

    .line 376
    new-instance p0, Lexpo/modules/camera/CameraExceptions$VideoRecordingFailed;

    .line 377
    invoke-virtual {p2}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    .line 378
    :cond_3
    invoke-virtual {p2}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    :cond_4
    const-string p2, "Unknown error"

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Video recording Failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 376
    :cond_6
    invoke-direct {p0, v0}, Lexpo/modules/camera/CameraExceptions$VideoRecordingFailed;-><init>(Ljava/lang/String;)V

    check-cast p0, Lexpo/modules/kotlin/exception/CodedException;

    .line 375
    invoke-interface {p1, p0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 369
    :cond_7
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 370
    invoke-virtual {p2}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getOutputResults()Landroidx/camera/video/OutputResults;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/camera/video/OutputResults;->getOutputUri()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "uri"

    invoke-virtual {p0, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    invoke-interface {p1, p0}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method private final setCameraZoom(F)V
    .locals 3

    .line 591
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getZoomState()Landroidx/lifecycle/LiveData;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/ZoomState;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/ZoomState;->getMaxZoomRatio()F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x0

    .line 592
    invoke-static {p1, v2, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    mul-float/2addr p1, v0

    invoke-static {v0, p1}, Ljava/lang/Float;->min(FF)F

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Float;->max(FF)F

    move-result p1

    .line 593
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->setZoomRatio(F)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    return-void
.end method

.method private final setTorchEnabled(Z)V
    .locals 2

    .line 324
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->hasFlashUnit()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 325
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    return-void
.end method

.method private final startFocusMetering()V
    .locals 6

    .line 574
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_0

    .line 575
    new-instance v1, Landroidx/camera/core/DisplayOrientedMeteringPointFactory;

    .line 576
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v2}, Landroidx/camera/view/PreviewView;->getDisplay()Landroid/view/Display;

    move-result-object v2

    .line 577
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v3

    .line 578
    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v4}, Landroidx/camera/view/PreviewView;->getWidth()I

    move-result v4

    int-to-float v4, v4

    .line 579
    iget-object v5, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v5}, Landroidx/camera/view/PreviewView;->getHeight()I

    move-result v5

    int-to-float v5, v5

    .line 575
    invoke-direct {v1, v2, v3, v4, v5}, Landroidx/camera/core/DisplayOrientedMeteringPointFactory;-><init>(Landroid/view/Display;Landroidx/camera/core/CameraInfo;FF)V

    .line 581
    new-instance v2, Landroidx/camera/core/FocusMeteringAction$Builder;

    const/high16 v3, 0x3f800000    # 1.0f

    .line 582
    invoke-virtual {v1, v3, v3}, Landroidx/camera/core/DisplayOrientedMeteringPointFactory;->createPoint(FF)Landroidx/camera/core/MeteringPoint;

    move-result-object v1

    const/4 v3, 0x1

    .line 581
    invoke-direct {v2, v1, v3}, Landroidx/camera/core/FocusMeteringAction$Builder;-><init>(Landroidx/camera/core/MeteringPoint;I)V

    .line 585
    invoke-virtual {v2}, Landroidx/camera/core/FocusMeteringAction$Builder;->build()Landroidx/camera/core/FocusMeteringAction;

    move-result-object v1

    const-string v2, "build(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 586
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v0

    invoke-interface {v0, v1}, Landroidx/camera/core/CameraControl;->startFocusAndMetering(Landroidx/camera/core/FocusMeteringAction;)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    return-void
.end method

.method private final transformBarcodeScannerResultToViewCoordinates(Lexpo/modules/camera/utils/BarCodeScannerResult;)V
    .locals 11

    .line 641
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getCornerPoints()Ljava/util/List;

    move-result-object v0

    .line 642
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 643
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v2}, Landroidx/camera/view/PreviewView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 644
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getWidth()I

    move-result v3

    int-to-float v3, v3

    .line 645
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    cmpg-float v6, v1, v5

    if-lez v6, :cond_b

    cmpg-float v6, v2, v5

    if-lez v6, :cond_b

    cmpg-float v6, v3, v5

    if-lez v6, :cond_b

    cmpg-float v5, v4, v5

    if-gtz v5, :cond_0

    goto/16 :goto_5

    .line 654
    :cond_0
    iget-object v5, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v5}, Landroidx/camera/view/PreviewView;->getScaleType()Landroidx/camera/view/PreviewView$ScaleType;

    move-result-object v5

    sget-object v6, Lexpo/modules/camera/ExpoCameraView$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v5}, Landroidx/camera/view/PreviewView$ScaleType;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-eq v5, v6, :cond_2

    if-eq v5, v7, :cond_1

    div-float v3, v1, v3

    div-float v4, v2, v4

    goto :goto_2

    :cond_1
    div-float v5, v1, v2

    div-float v8, v3, v4

    cmpl-float v5, v5, v8

    if-lez v5, :cond_3

    goto :goto_0

    :cond_2
    div-float v5, v1, v2

    div-float v8, v3, v4

    cmpl-float v5, v5, v8

    if-lez v5, :cond_4

    :cond_3
    div-float v3, v2, v4

    goto :goto_1

    :cond_4
    :goto_0
    div-float v3, v1, v3

    :goto_1
    move v4, v3

    :goto_2
    const/4 v5, 0x0

    .line 823
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v5, v8}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v5

    check-cast v5, Lkotlin/ranges/IntProgression;

    invoke-static {v5, v7}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v8

    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v9

    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v5

    if-lez v5, :cond_5

    if-le v8, v9, :cond_6

    :cond_5
    if-gez v5, :cond_7

    if-gt v9, v8, :cond_7

    .line 689
    :cond_6
    :goto_3
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    int-to-float v10, v10

    mul-float/2addr v10, v3

    .line 690
    invoke-static {v10}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 824
    invoke-interface {v0, v8, v10}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-eq v8, v9, :cond_7

    add-int/2addr v8, v5

    goto :goto_3

    .line 827
    :cond_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v6, v3}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v3

    check-cast v3, Lkotlin/ranges/IntProgression;

    invoke-static {v3, v7}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v5

    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v6

    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v3

    if-lez v3, :cond_8

    if-le v5, v6, :cond_9

    :cond_8
    if-gez v3, :cond_a

    if-gt v6, v5, :cond_a

    .line 694
    :cond_9
    :goto_4
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v7, v4

    .line 695
    invoke-static {v7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 828
    invoke-interface {v0, v5, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-eq v5, v6, :cond_a

    add-int/2addr v5, v3

    goto :goto_4

    .line 698
    :cond_a
    invoke-virtual {p1, v0}, Lexpo/modules/camera/utils/BarCodeScannerResult;->setCornerPoints(Ljava/util/List;)V

    float-to-int v0, v2

    .line 699
    invoke-virtual {p1, v0}, Lexpo/modules/camera/utils/BarCodeScannerResult;->setHeight(I)V

    float-to-int v0, v1

    .line 700
    invoke-virtual {p1, v0}, Lexpo/modules/camera/utils/BarCodeScannerResult;->setWidth(I)V

    :cond_b
    :goto_5
    return-void
.end method


# virtual methods
.method public final cleanupCamera()V
    .locals 1

    .line 801
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOrientationEventListener()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;->disable()V

    .line 802
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->cancelCoroutineScope()Ljava/lang/Object;

    .line 803
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 804
    :cond_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_1
    return-void
.end method

.method public final createCamera(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lexpo/modules/camera/ExpoCameraView$createCamera$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;

    iget v1, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;

    invoke-direct {v0, p0, p1}, Lexpo/modules/camera/ExpoCameraView$createCamera$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 408
    iget v2, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 410
    iget-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    if-eqz p1, :cond_d

    iget-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewPaused:Z

    if-eqz p1, :cond_3

    goto/16 :goto_6

    :cond_3
    const/4 p1, 0x0

    .line 413
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 414
    sget-object p1, Landroidx/camera/lifecycle/ProcessCameraProvider;->Companion:Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;

    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, "getContext(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    invoke-static {p1, v2, v0}, Landroidx/camera/lifecycle/ProcessCameraProviderExtKt;->awaitInstance(Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    .line 408
    :cond_4
    :goto_1
    check-cast p1, Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 416
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    if-eqz v0, :cond_7

    .line 417
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    .line 418
    sget-object v2, Lexpo/modules/camera/records/CameraRatio;->FOUR_THREE:Lexpo/modules/camera/records/CameraRatio;

    if-eq v0, v2, :cond_6

    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    sget-object v2, Lexpo/modules/camera/records/CameraRatio;->SIXTEEN_NINE:Lexpo/modules/camera/records/CameraRatio;

    if-ne v0, v2, :cond_5

    goto :goto_2

    .line 421
    :cond_5
    sget-object v0, Landroidx/camera/view/PreviewView$ScaleType;->FILL_CENTER:Landroidx/camera/view/PreviewView$ScaleType;

    goto :goto_3

    .line 419
    :cond_6
    :goto_2
    sget-object v0, Landroidx/camera/view/PreviewView$ScaleType;->FIT_CENTER:Landroidx/camera/view/PreviewView$ScaleType;

    .line 417
    :goto_3
    invoke-virtual {v1, v0}, Landroidx/camera/view/PreviewView;->setScaleType(Landroidx/camera/view/PreviewView$ScaleType;)V

    .line 425
    :cond_7
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->buildResolutionSelector()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    move-result-object v0

    .line 426
    new-instance v1, Landroidx/camera/core/Preview$Builder;

    invoke-direct {v1}, Landroidx/camera/core/Preview$Builder;-><init>()V

    .line 427
    invoke-virtual {v1, v0}, Landroidx/camera/core/Preview$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/Preview$Builder;

    move-result-object v1

    .line 428
    invoke-virtual {v1}, Landroidx/camera/core/Preview$Builder;->build()Landroidx/camera/core/Preview;

    move-result-object v1

    .line 430
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v2}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/Preview$SurfaceProvider;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V

    .line 429
    const-string v2, "also(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 433
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz v2, :cond_8

    .line 434
    iget-object v3, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v3}, Landroidx/camera/view/PreviewView;->getWidth()I

    move-result v3

    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v4}, Landroidx/camera/view/PreviewView;->getHeight()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 435
    new-instance v3, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda8;

    invoke-direct {v3, v2, p0}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda8;-><init>(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;)V

    invoke-virtual {v1, v3}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V

    .line 443
    :cond_8
    new-instance v2, Landroidx/camera/core/CameraSelector$Builder;

    invoke-direct {v2}, Landroidx/camera/core/CameraSelector$Builder;-><init>()V

    .line 444
    iget-object v3, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    invoke-virtual {v3}, Lexpo/modules/camera/records/CameraType;->mapToCharacteristic()I

    move-result v3

    invoke-virtual {v2, v3}, Landroidx/camera/core/CameraSelector$Builder;->requireLensFacing(I)Landroidx/camera/core/CameraSelector$Builder;

    move-result-object v2

    .line 445
    invoke-virtual {v2}, Landroidx/camera/core/CameraSelector$Builder;->build()Landroidx/camera/core/CameraSelector;

    move-result-object v2

    const-string v3, "build(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    new-instance v4, Landroidx/camera/core/ImageCapture$Builder;

    invoke-direct {v4}, Landroidx/camera/core/ImageCapture$Builder;-><init>()V

    .line 448
    invoke-virtual {v4, v0}, Landroidx/camera/core/ImageCapture$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/ImageCapture$Builder;

    move-result-object v0

    .line 449
    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    invoke-virtual {v4}, Lexpo/modules/camera/records/FlashMode;->mapToLens()I

    move-result v4

    invoke-virtual {v0, v4}, Landroidx/camera/core/ImageCapture$Builder;->setFlashMode(I)Landroidx/camera/core/ImageCapture$Builder;

    move-result-object v0

    .line 450
    invoke-virtual {v0}, Landroidx/camera/core/ImageCapture$Builder;->build()Landroidx/camera/core/ImageCapture;

    move-result-object v0

    .line 447
    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Landroidx/camera/core/ImageCapture;

    .line 452
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->createVideoCapture()Landroidx/camera/video/VideoCapture;

    move-result-object v0

    .line 453
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->createImageAnalyzer()Landroidx/camera/core/ImageAnalysis;

    move-result-object v4

    iput-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->imageAnalysisUseCase:Landroidx/camera/core/ImageAnalysis;

    .line 455
    new-instance v4, Landroidx/camera/core/UseCaseGroup$Builder;

    invoke-direct {v4}, Landroidx/camera/core/UseCaseGroup$Builder;-><init>()V

    .line 456
    check-cast v1, Landroidx/camera/core/UseCase;

    invoke-virtual {v4, v1}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    .line 457
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    sget-object v5, Lexpo/modules/camera/records/CameraMode;->PICTURE:Lexpo/modules/camera/records/CameraMode;

    if-ne v1, v5, :cond_a

    .line 458
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Landroidx/camera/core/ImageCapture;

    if-eqz v0, :cond_9

    .line 459
    check-cast v0, Landroidx/camera/core/UseCase;

    invoke-virtual {v4, v0}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    .line 461
    :cond_9
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageAnalysisUseCase:Landroidx/camera/core/ImageAnalysis;

    if-eqz v0, :cond_b

    .line 462
    check-cast v0, Landroidx/camera/core/UseCase;

    invoke-virtual {v4, v0}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    goto :goto_4

    .line 465
    :cond_a
    check-cast v0, Landroidx/camera/core/UseCase;

    invoke-virtual {v4, v0}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    .line 467
    :cond_b
    :goto_4
    invoke-virtual {v4}, Landroidx/camera/core/UseCaseGroup$Builder;->build()Landroidx/camera/core/UseCaseGroup;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 470
    :try_start_0
    invoke-virtual {p1}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 471
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getCurrentActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    invoke-virtual {p1, v1, v2, v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->bindToLifecycle(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_c

    .line 473
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    const-string v1, "getCameraInfo(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lexpo/modules/camera/ExpoCameraView;->observeCameraState(Landroidx/camera/core/CameraInfo;)V

    .line 476
    :cond_c
    iget v0, p0, Lexpo/modules/camera/ExpoCameraView;->zoom:F

    invoke-direct {p0, v0}, Lexpo/modules/camera/ExpoCameraView;->setCameraZoom(F)V

    .line 477
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 479
    :catch_0
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object p1

    .line 480
    new-instance v0, Lexpo/modules/camera/common/CameraMountErrorEvent;

    const-string v1, "Camera component could not be rendered - is there any other instance running?"

    invoke-direct {v0, v1}, Lexpo/modules/camera/common/CameraMountErrorEvent;-><init>(Ljava/lang/String;)V

    .line 479
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 483
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 411
    :cond_d
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final getAnimateShutter()Z
    .locals 1

    .line 207
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->animateShutter:Z

    return v0
.end method

.method public final getAutoFocus()Lexpo/modules/camera/records/FocusMode;
    .locals 1

    .line 164
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    return-object v0
.end method

.method public final getAvailablePictureSizes()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 611
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 612
    invoke-static {v0}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;

    move-result-object v0

    .line 613
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-eqz v0, :cond_1

    const/16 v1, 0x100

    .line 614
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 819
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 820
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    .line 614
    invoke-virtual {v4}, Landroid/util/Size;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 821
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 822
    :cond_0
    check-cast v1, Ljava/util/List;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    return-object v1

    .line 615
    :cond_3
    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getCamera()Landroidx/camera/core/Camera;
    .locals 1

    .line 122
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    return-object v0
.end method

.method public final getCameraMode()Lexpo/modules/camera/records/CameraMode;
    .locals 1

    .line 152
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    return-object v0
.end method

.method public final getEnableTorch()Z
    .locals 3

    .line 208
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->enableTorch$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getFlashMode()Lexpo/modules/camera/records/FlashMode;
    .locals 1

    .line 146
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    return-object v0
.end method

.method public final getLensFacing()Lexpo/modules/camera/records/CameraType;
    .locals 1

    .line 140
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    return-object v0
.end method

.method public final getMirror()Z
    .locals 1

    .line 200
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->mirror:Z

    return v0
.end method

.method public final getMute()Z
    .locals 1

    .line 206
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    return v0
.end method

.method public final getPictureSize()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    return-object v0
.end method

.method public getPreviewSizeAsArray()[I
    .locals 2

    .line 767
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getWidth()I

    move-result v0

    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getHeight()I

    move-result v1

    filled-new-array {v0, v1}, [I

    move-result-object v0

    return-object v0
.end method

.method public final getRatio()Lexpo/modules/camera/records/CameraRatio;
    .locals 1

    .line 188
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    return-object v0
.end method

.method public final getVideoEncodingBitrate()Ljava/lang/Integer;
    .locals 1

    .line 182
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoEncodingBitrate:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getVideoQuality()Lexpo/modules/camera/records/VideoQuality;
    .locals 1

    .line 176
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    return-object v0
.end method

.method public final getZoom()F
    .locals 1

    .line 158
    iget v0, p0, Lexpo/modules/camera/ExpoCameraView;->zoom:F

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 250
    iget p1, p0, Lexpo/modules/camera/ExpoCameraView;->lastWidth:I

    if-ne p4, p1, :cond_1

    iget p1, p0, Lexpo/modules/camera/ExpoCameraView;->lastHeight:I

    if-eq p5, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 251
    :cond_1
    :goto_0
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroidx/camera/view/PreviewView;->layout(IIII)V

    .line 252
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p4, p5}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 253
    :cond_2
    iput p4, p0, Lexpo/modules/camera/ExpoCameraView;->lastWidth:I

    .line 254
    iput p5, p0, Lexpo/modules/camera/ExpoCameraView;->lastHeight:I

    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 239
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0, p1, p2}, Lexpo/modules/camera/ExpoCameraView;->measureChild(Landroid/view/View;II)V

    .line 242
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getMeasuredWidth()I

    move-result v0

    invoke-static {v0, p1}, Landroid/view/ViewGroup;->resolveSize(II)I

    move-result p1

    .line 243
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getMeasuredHeight()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/ViewGroup;->resolveSize(II)I

    move-result p2

    .line 241
    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onPictureSaved(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 791
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    move-result-object v0

    new-instance v1, Lexpo/modules/camera/common/PictureSavedEvent;

    const-string v2, "id"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "data"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, v2, p1}, Lexpo/modules/camera/common/PictureSavedEvent;-><init>(ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 1

    .line 259
    invoke-super {p0, p1}, Lexpo/modules/kotlin/views/ExpoView;->onViewAdded(Landroid/view/View;)V

    .line 260
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 263
    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    .line 264
    :cond_1
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->removeView(Landroid/view/View;)V

    .line 265
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/PreviewView;

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lexpo/modules/camera/ExpoCameraView;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final pausePreview()V
    .locals 1

    const/4 v0, 0x1

    .line 627
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewPaused:Z

    .line 628
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->cameraProvider:Landroidx/camera/lifecycle/ProcessCameraProvider;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    :cond_0
    return-void
.end method

.method public final record(Lexpo/modules/camera/RecordingOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;)V
    .locals 5

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheDirectory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    sget-object v0, Lexpo/modules/camera/utils/FileSystemUtils;->INSTANCE:Lexpo/modules/camera/utils/FileSystemUtils;

    const-string v1, "Camera"

    const-string v2, ".mp4"

    invoke-virtual {v0, p3, v1, v2}, Lexpo/modules/camera/utils/FileSystemUtils;->generateOutputFile(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p3

    .line 331
    new-instance v0, Landroidx/camera/video/FileOutputOptions$Builder;

    invoke-direct {v0, p3}, Landroidx/camera/video/FileOutputOptions$Builder;-><init>(Ljava/io/File;)V

    .line 332
    invoke-virtual {p1}, Lexpo/modules/camera/RecordingOptions;->getMaxFileSize()I

    move-result p3

    int-to-long v1, p3

    invoke-virtual {v0, v1, v2}, Landroidx/camera/video/FileOutputOptions$Builder;->setFileSizeLimit(J)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/camera/video/FileOutputOptions$Builder;

    .line 333
    invoke-virtual {p1}, Lexpo/modules/camera/RecordingOptions;->getMaxDuration()I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x3e8

    int-to-long v2, p1

    mul-long/2addr v0, v2

    invoke-virtual {p3, v0, v1}, Landroidx/camera/video/FileOutputOptions$Builder;->setDurationLimitMillis(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/video/FileOutputOptions$Builder;

    .line 334
    invoke-virtual {p1}, Landroidx/camera/video/FileOutputOptions$Builder;->build()Landroidx/camera/video/FileOutputOptions;

    move-result-object p1

    const-string p3, "build(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    iget-object p3, p0, Lexpo/modules/camera/ExpoCameraView;->recorder:Landroidx/camera/video/Recorder;

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    .line 337
    iget-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 338
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 337
    const-string v4, "android.permission.RECORD_AUDIO"

    invoke-static {v1, v4}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 342
    new-instance p1, Lexpo/modules/kotlin/exception/Exceptions$MissingPermissions;

    new-array p3, v2, [Ljava/lang/String;

    aput-object v4, p3, v3

    invoke-direct {p1, p3}, Lexpo/modules/kotlin/exception/Exceptions$MissingPermissions;-><init>([Ljava/lang/String;)V

    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 345
    :cond_0
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p3, v1, p1}, Landroidx/camera/video/Recorder;->prepareRecording(Landroid/content/Context;Landroidx/camera/video/FileOutputOptions;)Landroidx/camera/video/PendingRecording;

    move-result-object p1

    .line 347
    iget-boolean p3, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    if-nez p3, :cond_1

    .line 348
    invoke-static {p1, v3, v2, v0}, Landroidx/camera/video/PendingRecording;->withAudioEnabled$default(Landroidx/camera/video/PendingRecording;ZILjava/lang/Object;)Landroidx/camera/video/PendingRecording;

    .line 351
    :cond_1
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p3

    const-string v0, "getMainExecutor(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0, p2}, Lexpo/modules/camera/ExpoCameraView$$ExternalSyntheticLambda7;-><init>(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;)V

    invoke-virtual {p1, p3, v0}, Landroidx/camera/video/PendingRecording;->start(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)Landroidx/camera/video/Recording;

    move-result-object p1

    .line 345
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->activeRecording:Landroidx/camera/video/Recording;

    return-void

    .line 387
    :cond_2
    const-string p1, "E_RECORDING_FAILED"

    .line 388
    const-string p3, "Starting video recording failed - could not create video file."

    .line 386
    invoke-interface {p2, p1, p3, v0}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final resumePreview()V
    .locals 7

    const/4 v0, 0x1

    .line 619
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    const/4 v0, 0x0

    .line 620
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewPaused:Z

    .line 621
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lexpo/modules/camera/ExpoCameraView$resumePreview$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lexpo/modules/camera/ExpoCameraView$resumePreview$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setAnimateShutter(Z)V
    .locals 0

    .line 207
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->animateShutter:Z

    return-void
.end method

.method public final setAutoFocus(Lexpo/modules/camera/records/FocusMode;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    .line 167
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 168
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    sget-object v1, Lexpo/modules/camera/records/FocusMode;->OFF:Lexpo/modules/camera/records/FocusMode;

    if-ne v0, v1, :cond_0

    .line 169
    invoke-interface {p1}, Landroidx/camera/core/CameraControl;->cancelFocusAndMetering()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    .line 168
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-void

    .line 171
    :cond_0
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->startFocusMetering()V

    :cond_1
    return-void
.end method

.method public final setBarcodeScannerSettings(Lexpo/modules/camera/records/BarcodeSettings;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 637
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->barcodeFormats:Ljava/util/List;

    return-void
.end method

.method public final setCamera(Landroidx/camera/core/Camera;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Landroidx/camera/core/Camera;

    return-void
.end method

.method public final setCameraFlashMode(Lexpo/modules/camera/records/FlashMode;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Landroidx/camera/core/ImageCapture;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lexpo/modules/camera/records/FlashMode;->mapToLens()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/ImageCapture;->setFlashMode(I)V

    :cond_0
    return-void
.end method

.method public final setCameraMode(Lexpo/modules/camera/records/CameraMode;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    const/4 p1, 0x1

    .line 155
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public final setEnableTorch(Z)V
    .locals 3

    .line 208
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->enableTorch$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setFlashMode(Lexpo/modules/camera/records/FlashMode;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    .line 149
    invoke-virtual {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setCameraFlashMode(Lexpo/modules/camera/records/FlashMode;)V

    return-void
.end method

.method public final setLensFacing(Lexpo/modules/camera/records/CameraType;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    const/4 p1, 0x1

    .line 143
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public final setMirror(Z)V
    .locals 0

    .line 202
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->mirror:Z

    const/4 p1, 0x1

    .line 203
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public final setMute(Z)V
    .locals 0

    .line 206
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    return-void
.end method

.method public final setPictureSize(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    const/4 p1, 0x1

    .line 197
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public setPreviewTexture(Landroid/graphics/SurfaceTexture;)V
    .locals 6

    .line 760
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    const/4 p1, 0x1

    .line 761
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 762
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance p1, Lexpo/modules/camera/ExpoCameraView$setPreviewTexture$1;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lexpo/modules/camera/ExpoCameraView$setPreviewTexture$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setRatio(Lexpo/modules/camera/records/CameraRatio;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    const/4 p1, 0x1

    .line 191
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public final setShouldScanBarcodes(Z)V
    .locals 0

    .line 632
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldScanBarcodes:Z

    const/4 p1, 0x1

    .line 633
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public final setVideoEncodingBitrate(Ljava/lang/Integer;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoEncodingBitrate:Ljava/lang/Integer;

    const/4 p1, 0x1

    .line 185
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public final setVideoQuality(Lexpo/modules/camera/records/VideoQuality;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    const/4 p1, 0x1

    .line 179
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    return-void
.end method

.method public final setZoom(F)V
    .locals 0

    .line 160
    iput p1, p0, Lexpo/modules/camera/ExpoCameraView;->zoom:F

    .line 161
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setCameraZoom(F)V

    return-void
.end method

.method public final stopRecording()V
    .locals 1

    const/4 v0, 0x0

    .line 394
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    .line 395
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->activeRecording:Landroidx/camera/video/Recording;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/video/Recording;->close()V

    :cond_0
    return-void
.end method

.method public final takePicture(Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/RuntimeContext;)V
    .locals 10

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheDirectory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runtimeContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    const/4 v1, 0x3

    .line 270
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v4

    .line 271
    invoke-virtual {p1}, Lexpo/modules/camera/PictureOptions;->getShutterSound()Z

    move-result v3

    .line 273
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Landroidx/camera/core/ImageCapture;

    if-eqz v0, :cond_0

    .line 274
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 275
    new-instance v2, Lexpo/modules/camera/ExpoCameraView$takePicture$1;

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    invoke-direct/range {v2 .. v9}, Lexpo/modules/camera/ExpoCameraView$takePicture$1;-><init>(ZILexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/RuntimeContext;)V

    check-cast v2, Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;

    .line 273
    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/ImageCapture;->takePicture(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    :cond_0
    return-void
.end method

.method public final toggleRecording()V
    .locals 2

    .line 399
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->activeRecording:Landroidx/camera/video/Recording;

    if-eqz v0, :cond_1

    .line 400
    iget-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    if-eqz v1, :cond_0

    .line 401
    invoke-virtual {v0}, Landroidx/camera/video/Recording;->pause()V

    return-void

    .line 403
    :cond_0
    invoke-virtual {v0}, Landroidx/camera/video/Recording;->resume()V

    :cond_1
    return-void
.end method

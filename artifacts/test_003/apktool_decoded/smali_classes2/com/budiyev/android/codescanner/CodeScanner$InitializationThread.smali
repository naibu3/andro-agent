.class final Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;
.super Ljava/lang/Thread;
.source "CodeScanner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/budiyev/android/codescanner/CodeScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "InitializationThread"
.end annotation


# instance fields
.field private final mHeight:I

.field private final mWidth:I

.field final synthetic this$0:Lcom/budiyev/android/codescanner/CodeScanner;


# direct methods
.method public constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;II)V
    .locals 0
    .param p2, "width"    # I
    .param p3, "height"    # I

    .line 806
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 807
    const-string p1, "cs-init"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 808
    iput p2, p0, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mWidth:I

    .line 809
    iput p3, p0, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mHeight:I

    .line 810
    return-void
.end method

.method private initialize()V
    .locals 23

    .line 819
    move-object/from16 v1, p0

    const/4 v0, 0x0

    .line 820
    .local v0, "camera":Landroid/hardware/Camera;
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    move-object v5, v2

    .line 821
    .local v5, "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    iget-object v2, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v2}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2400(Lcom/budiyev/android/codescanner/CodeScanner;)I

    move-result v2

    .line 822
    .local v2, "cameraId":I
    const/4 v14, 0x0

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    const/4 v4, -0x2

    if-ne v2, v4, :cond_0

    goto :goto_0

    .line 835
    :cond_0
    invoke-static {v2}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v0

    .line 836
    invoke-static {v2, v5}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    move-object v4, v0

    goto :goto_4

    .line 823
    :cond_1
    :goto_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v4

    .line 824
    .local v4, "numberOfCameras":I
    if-ne v2, v3, :cond_2

    const/4 v3, 0x0

    goto :goto_1

    .line 825
    :cond_2
    const/4 v3, 0x1

    :goto_1
    nop

    .line 826
    .local v3, "facing":I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_2
    if-ge v6, v4, :cond_4

    .line 827
    invoke-static {v6, v5}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 828
    iget v7, v5, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v7, v3, :cond_3

    .line 829
    invoke-static {v6}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v0

    .line 830
    iget-object v7, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v7, v6}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2402(Lcom/budiyev/android/codescanner/CodeScanner;I)I

    .line 831
    goto :goto_3

    .line 826
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 834
    .end local v3    # "facing":I
    .end local v4    # "numberOfCameras":I
    .end local v6    # "i":I
    :cond_4
    :goto_3
    move-object v4, v0

    .line 838
    .end local v0    # "camera":Landroid/hardware/Camera;
    .local v4, "camera":Landroid/hardware/Camera;
    :goto_4
    if-eqz v4, :cond_12

    .line 841
    invoke-virtual {v4}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v6

    .line 842
    .local v6, "parameters":Landroid/hardware/Camera$Parameters;
    if-eqz v6, :cond_11

    .line 845
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2500(Lcom/budiyev/android/codescanner/CodeScanner;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5}, Lcom/budiyev/android/codescanner/Utils;->getDisplayOrientation(Landroid/content/Context;Landroid/hardware/Camera$CameraInfo;)I

    move-result v10

    .line 846
    .local v10, "orientation":I
    invoke-static {v10}, Lcom/budiyev/android/codescanner/Utils;->isPortrait(I)Z

    move-result v15

    .line 847
    .local v15, "portrait":Z
    nop

    .line 848
    if-eqz v15, :cond_5

    iget v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mHeight:I

    goto :goto_5

    :cond_5
    iget v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mWidth:I

    .line 849
    :goto_5
    if-eqz v15, :cond_6

    iget v3, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mWidth:I

    goto :goto_6

    :cond_6
    iget v3, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mHeight:I

    .line 848
    :goto_6
    invoke-static {v6, v0, v3}, Lcom/budiyev/android/codescanner/Utils;->findSuitableImageSize(Landroid/hardware/Camera$Parameters;II)Lcom/budiyev/android/codescanner/Point;

    move-result-object v3

    .line 850
    .local v3, "imageSize":Lcom/budiyev/android/codescanner/Point;
    move v12, v10

    .end local v10    # "orientation":I
    .local v12, "orientation":I
    invoke-virtual {v3}, Lcom/budiyev/android/codescanner/Point;->getX()I

    move-result v10

    .line 851
    .local v10, "imageWidth":I
    invoke-virtual {v3}, Lcom/budiyev/android/codescanner/Point;->getY()I

    move-result v11

    .line 852
    .local v11, "imageHeight":I
    invoke-virtual {v6, v10, v11}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 853
    const/16 v0, 0x11

    invoke-virtual {v6, v0}, Landroid/hardware/Camera$Parameters;->setPreviewFormat(I)V

    .line 854
    if-eqz v15, :cond_7

    move v0, v11

    goto :goto_7

    :cond_7
    move v0, v10

    .line 855
    :goto_7
    if-eqz v15, :cond_8

    move v7, v10

    goto :goto_8

    :cond_8
    move v7, v11

    :goto_8
    iget v8, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mWidth:I

    iget v9, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mHeight:I

    .line 854
    invoke-static {v0, v7, v8, v9}, Lcom/budiyev/android/codescanner/Utils;->getPreviewSize(IIII)Lcom/budiyev/android/codescanner/Point;

    move-result-object v8

    .line 856
    .local v8, "previewSize":Lcom/budiyev/android/codescanner/Point;
    invoke-virtual {v6}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v7

    .line 857
    .local v7, "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v7, :cond_a

    const-string v0, "auto"

    .line 858
    invoke-interface {v7, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "continuous-picture"

    .line 859
    invoke-interface {v7, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    const/4 v0, 0x1

    goto :goto_9

    :cond_a
    const/4 v0, 0x0

    :goto_9
    move/from16 v16, v0

    .line 860
    .local v16, "autoFocusSupported":Z
    if-nez v16, :cond_b

    .line 861
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0, v14}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2602(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 863
    :cond_b
    new-instance v9, Lcom/budiyev/android/codescanner/Point;

    iget v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mWidth:I

    iget v13, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->mHeight:I

    invoke-direct {v9, v0, v13}, Lcom/budiyev/android/codescanner/Point;-><init>(II)V

    .line 864
    .local v9, "viewSize":Lcom/budiyev/android/codescanner/Point;
    if-eqz v16, :cond_d

    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2600(Lcom/budiyev/android/codescanner/CodeScanner;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 865
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2700(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/AutoFocusMode;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/budiyev/android/codescanner/Utils;->setAutoFocusMode(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/AutoFocusMode;)V

    .line 866
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$1900(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScannerView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/CodeScannerView;->getFrameRect()Lcom/budiyev/android/codescanner/Rect;

    move-result-object v0

    .line 867
    .local v0, "frameRect":Lcom/budiyev/android/codescanner/Rect;
    if-eqz v0, :cond_c

    .line 868
    move-object v13, v7

    move-object v7, v0

    .end local v0    # "frameRect":Lcom/budiyev/android/codescanner/Rect;
    .local v7, "frameRect":Lcom/budiyev/android/codescanner/Rect;
    .local v13, "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static/range {v6 .. v12}, Lcom/budiyev/android/codescanner/Utils;->configureDefaultFocusArea(Landroid/hardware/Camera$Parameters;Lcom/budiyev/android/codescanner/Rect;Lcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/Point;III)V

    move/from16 v17, v10

    move/from16 v18, v11

    .end local v10    # "imageWidth":I
    .end local v11    # "imageHeight":I
    .local v17, "imageWidth":I
    .local v18, "imageHeight":I
    goto :goto_a

    .line 867
    .end local v13    # "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v17    # "imageWidth":I
    .end local v18    # "imageHeight":I
    .restart local v0    # "frameRect":Lcom/budiyev/android/codescanner/Rect;
    .local v7, "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v10    # "imageWidth":I
    .restart local v11    # "imageHeight":I
    :cond_c
    move-object v13, v7

    move/from16 v17, v10

    move/from16 v18, v11

    move-object v7, v0

    .end local v0    # "frameRect":Lcom/budiyev/android/codescanner/Rect;
    .end local v10    # "imageWidth":I
    .end local v11    # "imageHeight":I
    .local v7, "frameRect":Lcom/budiyev/android/codescanner/Rect;
    .restart local v13    # "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v17    # "imageWidth":I
    .restart local v18    # "imageHeight":I
    goto :goto_a

    .line 864
    .end local v13    # "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v17    # "imageWidth":I
    .end local v18    # "imageHeight":I
    .local v7, "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v10    # "imageWidth":I
    .restart local v11    # "imageHeight":I
    :cond_d
    move-object v13, v7

    move/from16 v17, v10

    move/from16 v18, v11

    .line 872
    .end local v7    # "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v10    # "imageWidth":I
    .end local v11    # "imageHeight":I
    .restart local v13    # "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v17    # "imageWidth":I
    .restart local v18    # "imageHeight":I
    :goto_a
    invoke-virtual {v6}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v7

    .line 873
    .local v7, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v7, :cond_e

    const-string/jumbo v0, "torch"

    .line 874
    invoke-interface {v7, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    goto :goto_b

    :cond_e
    const/4 v0, 0x0

    :goto_b
    move v10, v0

    .line 875
    .local v10, "flashSupported":Z
    if-nez v10, :cond_f

    .line 876
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0, v14}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2802(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 878
    :cond_f
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2900(Lcom/budiyev/android/codescanner/CodeScanner;)I

    move-result v11

    .line 879
    .local v11, "zoom":I
    if-eqz v11, :cond_10

    .line 880
    invoke-static {v6, v11}, Lcom/budiyev/android/codescanner/Utils;->setZoom(Landroid/hardware/Camera$Parameters;I)V

    .line 882
    :cond_10
    invoke-static {v6}, Lcom/budiyev/android/codescanner/Utils;->configureFpsRange(Landroid/hardware/Camera$Parameters;)V

    .line 883
    invoke-static {v6}, Lcom/budiyev/android/codescanner/Utils;->configureSceneMode(Landroid/hardware/Camera$Parameters;)V

    .line 884
    invoke-static {v6}, Lcom/budiyev/android/codescanner/Utils;->configureVideoStabilization(Landroid/hardware/Camera$Parameters;)V

    .line 885
    invoke-virtual {v4, v6}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 886
    invoke-virtual {v4, v12}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 887
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$900(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/lang/Object;

    move-result-object v19

    monitor-enter v19

    .line 888
    :try_start_0
    new-instance v0, Lcom/budiyev/android/codescanner/Decoder;

    iget-object v14, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 889
    invoke-static {v14}, Lcom/budiyev/android/codescanner/CodeScanner;->access$3000(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScanner$DecoderStateListener;

    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    move/from16 v20, v2

    .end local v2    # "cameraId":I
    .local v20, "cameraId":I
    :try_start_1
    iget-object v2, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v2}, Lcom/budiyev/android/codescanner/CodeScanner;->access$3100(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/CodeScanner$ExceptionHandler;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v21, v3

    .end local v3    # "imageSize":Lcom/budiyev/android/codescanner/Point;
    .local v21, "imageSize":Lcom/budiyev/android/codescanner/Point;
    :try_start_2
    iget-object v3, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v3}, Lcom/budiyev/android/codescanner/CodeScanner;->access$3200(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/util/List;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v22, v4

    .end local v4    # "camera":Landroid/hardware/Camera;
    .local v22, "camera":Landroid/hardware/Camera;
    :try_start_3
    iget-object v4, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 890
    invoke-static {v4}, Lcom/budiyev/android/codescanner/CodeScanner;->access$3300(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/DecodeCallback;

    move-result-object v4

    invoke-direct {v0, v14, v2, v3, v4}, Lcom/budiyev/android/codescanner/Decoder;-><init>(Lcom/budiyev/android/codescanner/Decoder$StateListener;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/util/List;Lcom/budiyev/android/codescanner/DecodeCallback;)V

    .line 891
    .local v0, "decoder":Lcom/budiyev/android/codescanner/Decoder;
    iget-object v2, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    new-instance v3, Lcom/budiyev/android/codescanner/DecoderWrapper;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move/from16 v4, v16

    move-object/from16 v16, v7

    move-object/from16 v7, v21

    move/from16 v21, v11

    move v11, v4

    move v4, v12

    move v12, v10

    move v10, v4

    move-object v14, v6

    move-object/from16 v4, v22

    move-object v6, v0

    .end local v0    # "decoder":Lcom/budiyev/android/codescanner/Decoder;
    .end local v22    # "camera":Landroid/hardware/Camera;
    .restart local v4    # "camera":Landroid/hardware/Camera;
    .local v6, "decoder":Lcom/budiyev/android/codescanner/Decoder;
    .local v7, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .local v10, "orientation":I
    .local v11, "autoFocusSupported":Z
    .local v12, "flashSupported":Z
    .local v14, "parameters":Landroid/hardware/Camera$Parameters;
    .local v16, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local v21, "zoom":I
    :try_start_4
    invoke-direct/range {v3 .. v12}, Lcom/budiyev/android/codescanner/DecoderWrapper;-><init>(Landroid/hardware/Camera;Landroid/hardware/Camera$CameraInfo;Lcom/budiyev/android/codescanner/Decoder;Lcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/Point;IZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v0, v3

    move v3, v12

    move v12, v10

    .end local v10    # "orientation":I
    .local v3, "flashSupported":Z
    .local v12, "orientation":I
    :try_start_5
    invoke-static {v2, v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$1802(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/DecoderWrapper;)Lcom/budiyev/android/codescanner/DecoderWrapper;

    .line 894
    invoke-virtual {v6}, Lcom/budiyev/android/codescanner/Decoder;->start()V

    .line 895
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/budiyev/android/codescanner/CodeScanner;->access$3402(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 896
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/budiyev/android/codescanner/CodeScanner;->access$1302(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 897
    nop

    .end local v6    # "decoder":Lcom/budiyev/android/codescanner/Decoder;
    monitor-exit v19
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 898
    iget-object v0, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->access$2300(Lcom/budiyev/android/codescanner/CodeScanner;)Landroid/os/Handler;

    move-result-object v0

    new-instance v2, Lcom/budiyev/android/codescanner/CodeScanner$FinishInitializationTask;

    iget-object v6, v1, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->this$0:Lcom/budiyev/android/codescanner/CodeScanner;

    const/4 v10, 0x0

    invoke-direct {v2, v6, v8, v10}, Lcom/budiyev/android/codescanner/CodeScanner$FinishInitializationTask;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/Point;Lcom/budiyev/android/codescanner/CodeScanner$1;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 899
    return-void

    .line 897
    .end local v3    # "flashSupported":Z
    .restart local v10    # "orientation":I
    .local v12, "flashSupported":Z
    :catchall_0
    move-exception v0

    move v3, v12

    move v12, v10

    .end local v10    # "orientation":I
    .restart local v3    # "flashSupported":Z
    .local v12, "orientation":I
    goto :goto_c

    .end local v3    # "flashSupported":Z
    .end local v4    # "camera":Landroid/hardware/Camera;
    .end local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v6, "parameters":Landroid/hardware/Camera$Parameters;
    .local v7, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local v10, "flashSupported":Z
    .local v11, "zoom":I
    .local v16, "autoFocusSupported":Z
    .local v21, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .restart local v22    # "camera":Landroid/hardware/Camera;
    :catchall_1
    move-exception v0

    move/from16 v3, v16

    move-object/from16 v16, v7

    move-object/from16 v7, v21

    move/from16 v21, v11

    move v11, v3

    move-object v14, v6

    move v3, v10

    move-object/from16 v4, v22

    .end local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v10    # "flashSupported":Z
    .end local v22    # "camera":Landroid/hardware/Camera;
    .restart local v3    # "flashSupported":Z
    .restart local v4    # "camera":Landroid/hardware/Camera;
    .local v7, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .local v11, "autoFocusSupported":Z
    .restart local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v16, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local v21, "zoom":I
    goto :goto_c

    .end local v3    # "flashSupported":Z
    .end local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .restart local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v7, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v10    # "flashSupported":Z
    .local v11, "zoom":I
    .local v16, "autoFocusSupported":Z
    .local v21, "imageSize":Lcom/budiyev/android/codescanner/Point;
    :catchall_2
    move-exception v0

    move/from16 v3, v16

    move-object/from16 v16, v7

    move-object/from16 v7, v21

    move/from16 v21, v11

    move v11, v3

    move-object v14, v6

    move v3, v10

    .end local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v10    # "flashSupported":Z
    .restart local v3    # "flashSupported":Z
    .local v7, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .local v11, "autoFocusSupported":Z
    .restart local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v16, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local v21, "zoom":I
    goto :goto_c

    .end local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v21    # "zoom":I
    .local v3, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .restart local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v7, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v10    # "flashSupported":Z
    .local v11, "zoom":I
    .local v16, "autoFocusSupported":Z
    :catchall_3
    move-exception v0

    move-object v14, v6

    move/from16 v21, v11

    move/from16 v11, v16

    move-object/from16 v16, v7

    move-object v7, v3

    move v3, v10

    .end local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v10    # "flashSupported":Z
    .local v3, "flashSupported":Z
    .local v7, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .local v11, "autoFocusSupported":Z
    .restart local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v16, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v21    # "zoom":I
    goto :goto_c

    .end local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v20    # "cameraId":I
    .end local v21    # "zoom":I
    .restart local v2    # "cameraId":I
    .local v3, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .restart local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v7, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v10    # "flashSupported":Z
    .local v11, "zoom":I
    .local v16, "autoFocusSupported":Z
    :catchall_4
    move-exception v0

    move/from16 v20, v2

    move-object v14, v6

    move/from16 v21, v11

    move/from16 v11, v16

    move-object/from16 v16, v7

    move-object v7, v3

    move v3, v10

    .end local v2    # "cameraId":I
    .end local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v10    # "flashSupported":Z
    .local v3, "flashSupported":Z
    .local v7, "imageSize":Lcom/budiyev/android/codescanner/Point;
    .local v11, "autoFocusSupported":Z
    .restart local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .local v16, "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v20    # "cameraId":I
    .restart local v21    # "zoom":I
    :goto_c
    :try_start_6
    monitor-exit v19
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    throw v0

    :catchall_5
    move-exception v0

    goto :goto_c

    .line 843
    .end local v3    # "flashSupported":Z
    .end local v7    # "imageSize":Lcom/budiyev/android/codescanner/Point;
    .end local v8    # "previewSize":Lcom/budiyev/android/codescanner/Point;
    .end local v9    # "viewSize":Lcom/budiyev/android/codescanner/Point;
    .end local v11    # "autoFocusSupported":Z
    .end local v12    # "orientation":I
    .end local v13    # "focusModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v14    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v15    # "portrait":Z
    .end local v16    # "flashModes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v17    # "imageWidth":I
    .end local v18    # "imageHeight":I
    .end local v20    # "cameraId":I
    .end local v21    # "zoom":I
    .restart local v2    # "cameraId":I
    .restart local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    :cond_11
    move/from16 v20, v2

    .end local v2    # "cameraId":I
    .restart local v20    # "cameraId":I
    new-instance v0, Lcom/budiyev/android/codescanner/CodeScannerException;

    const-string v2, "Unable to configure camera"

    invoke-direct {v0, v2}, Lcom/budiyev/android/codescanner/CodeScannerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 839
    .end local v6    # "parameters":Landroid/hardware/Camera$Parameters;
    .end local v20    # "cameraId":I
    .restart local v2    # "cameraId":I
    :cond_12
    move/from16 v20, v2

    .end local v2    # "cameraId":I
    .restart local v20    # "cameraId":I
    new-instance v0, Lcom/budiyev/android/codescanner/CodeScannerException;

    const-string v2, "Unable to access camera"

    invoke-direct {v0, v2}, Lcom/budiyev/android/codescanner/CodeScannerException;-><init>(Ljava/lang/String;)V

    goto :goto_e

    :goto_d
    throw v0

    :goto_e
    goto :goto_d
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 814
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 815
    invoke-direct {p0}, Lcom/budiyev/android/codescanner/CodeScanner$InitializationThread;->initialize()V

    .line 816
    return-void
.end method

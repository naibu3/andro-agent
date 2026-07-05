.class public final Lcom/facebook/react/views/virtualview/ReactVirtualView;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "ReactVirtualView.kt"

# interfaces
.implements Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;
.implements Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/virtualview/ReactVirtualView$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReactVirtualView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactVirtualView.kt\ncom/facebook/react/views/virtualview/ReactVirtualView\n+ 2 ReactVirtualView.kt\ncom/facebook/react/views/virtualview/ReactVirtualView$debugLog$1\n*L\n1#1,383:1\n358#1,4:384\n364#1,4:389\n359#1,9:393\n359#1,9:402\n359#1,9:411\n359#1,9:420\n358#2:388\n*S KotlinDebug\n*F\n+ 1 ReactVirtualView.kt\ncom/facebook/react/views/virtualview/ReactVirtualView\n*L\n89#1:384,4\n89#1:389,4\n187#1:393,9\n194#1:402,9\n226#1:411,9\n265#1:420,9\n89#1:388\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u00107\u001a\u000208H\u0010\u00a2\u0006\u0002\u00089J\u0008\u0010:\u001a\u000208H\u0014J\r\u0010;\u001a\u000208H\u0001\u00a2\u0006\u0002\u0008<J\u0008\u0010=\u001a\u000208H\u0014J0\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u000200H\u0014JR\u0010D\u001a\u0002082\u0008\u0010E\u001a\u0004\u0018\u00010*2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u0002002\u0006\u0010F\u001a\u0002002\u0006\u0010G\u001a\u0002002\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u000200H\u0016J,\u0010J\u001a\u0002082\u0008\u0010K\u001a\u0004\u0018\u00010L2\u0008\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020PH\u0016J\u0012\u0010>\u001a\u0002082\u0008\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010D\u001a\u0002082\u0006\u0010K\u001a\u00020LH\u0016J\u0010\u0010R\u001a\u0002082\u0006\u0010S\u001a\u00020\"H\u0002J\u0018\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020,2\u0006\u0010V\u001a\u00020,H\u0002J\u001a\u0010W\u001a\u0002082\u0008\u0010X\u001a\u0004\u0018\u00010\n2\u0006\u0010Y\u001a\u00020\nH\u0002J\u0010\u0010Z\u001a\u0002082\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010[\u001a\u0002082\u0006\u0010\t\u001a\u00020\nH\u0002J\n\u0010\\\u001a\u0004\u0018\u00010LH\u0002J\u0008\u0010]\u001a\u000208H\u0002J\u0012\u0010^\u001a\u0004\u0018\u00010L2\u0006\u0010_\u001a\u00020\"H\u0002J\u0008\u0010`\u001a\u000208H\u0002J)\u0010a\u001a\u0002082\u0006\u0010b\u001a\u0002042\u000e\u0008\u0002\u0010c\u001a\u0008\u0012\u0004\u0012\u0002040dH\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008eR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0014\u0010%\u001a\u00020\"X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010$R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00103\u001a\u0004\u0018\u0001048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u00106\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006f"
    }
    d2 = {
        "Lcom/facebook/react/views/virtualview/ReactVirtualView;",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;",
        "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;",
        "Landroid/view/View$OnLayoutChangeListener;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "mode",
        "Lcom/facebook/react/views/virtualview/VirtualViewMode;",
        "getMode$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtualview/VirtualViewMode;",
        "setMode$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V",
        "renderState",
        "Lcom/facebook/react/views/virtualview/VirtualViewRenderState;",
        "getRenderState$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtualview/VirtualViewRenderState;",
        "setRenderState$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtualview/VirtualViewRenderState;)V",
        "modeChangeEmitter",
        "Lcom/facebook/react/views/virtualview/ModeChangeEmitter;",
        "getModeChangeEmitter$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtualview/ModeChangeEmitter;",
        "setModeChangeEmitter$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtualview/ModeChangeEmitter;)V",
        "prerenderRatio",
        "",
        "getPrerenderRatio$ReactAndroid_release",
        "()D",
        "setPrerenderRatio$ReactAndroid_release",
        "(D)V",
        "debugLogEnabled",
        "",
        "getDebugLogEnabled$ReactAndroid_release",
        "()Z",
        "detectWindowFocus",
        "getDetectWindowFocus$ReactAndroid_release",
        "onWindowFocusChangeListener",
        "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;",
        "parentScrollView",
        "Landroid/view/View;",
        "lastRect",
        "Landroid/graphics/Rect;",
        "targetRect",
        "thresholdRect",
        "offsetX",
        "",
        "offsetY",
        "offsetChanged",
        "nativeId",
        "",
        "getNativeId$ReactAndroid_release",
        "()Ljava/lang/String;",
        "recycleView",
        "",
        "recycleView$ReactAndroid_release",
        "onAttachedToWindow",
        "doAttachedToWindow",
        "doAttachedToWindow$ReactAndroid_release",
        "onDetachedFromWindow",
        "onLayout",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayoutChange",
        "v",
        "oldLeft",
        "oldTop",
        "oldRight",
        "oldBottom",
        "onScroll",
        "scrollView",
        "Landroid/view/ViewGroup;",
        "scrollEventType",
        "Lcom/facebook/react/views/scroll/ScrollEventType;",
        "xVelocity",
        "",
        "yVelocity",
        "dispatchOnModeChangeIfNeeded",
        "checkRectChange",
        "rectsOverlap",
        "rect1",
        "rect2",
        "maybeEmitModeChanges",
        "oldMode",
        "newMode",
        "emitAsyncModeChange",
        "emitSyncModeChange",
        "getParentScrollView",
        "cleanupLayoutListeners",
        "traverseParentStack",
        "addListeners",
        "updateParentOffset",
        "debugLog",
        "subtag",
        "block",
        "Lkotlin/Function0;",
        "debugLog$ReactAndroid_release",
        "ReactAndroid_release"
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
.field private final debugLogEnabled:Z

.field private final detectWindowFocus:Z

.field private final lastRect:Landroid/graphics/Rect;

.field private mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

.field private modeChangeEmitter:Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

.field private offsetChanged:Z

.field private offsetX:I

.field private offsetY:I

.field private final onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

.field private parentScrollView:Landroid/view/View;

.field private prerenderRatio:D

.field private renderState:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

.field private final targetRect:Landroid/graphics/Rect;

.field private final thresholdRect:Landroid/graphics/Rect;


# direct methods
.method public static synthetic $r8$lambda$ZufkPHHdz8LA5UcTrwYQgLBWLcA(Lcom/facebook/react/views/virtualview/ReactVirtualView;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->onWindowFocusChangeListener$lambda$0(Lcom/facebook/react/views/virtualview/ReactVirtualView;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 36
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewRenderState;->Unknown:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    .line 38
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->virtualViewPrerenderRatio()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->prerenderRatio:D

    .line 39
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    move-result p1

    iput-boolean p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->debugLogEnabled:Z

    .line 40
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewWindowFocusDetection()Z

    move-result p1

    iput-boolean p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->detectWindowFocus:Z

    .line 43
    new-instance p1, Lcom/facebook/react/views/virtualview/ReactVirtualView$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView$$ExternalSyntheticLambda0;-><init>(Lcom/facebook/react/views/virtualview/ReactVirtualView;)V

    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 50
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    .line 51
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 52
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    return-void
.end method

.method private final cleanupLayoutListeners()V
    .locals 1

    const/4 v0, 0x0

    .line 307
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->traverseParentStack(Z)Landroid/view/ViewGroup;

    return-void
.end method

.method public static synthetic debugLog$ReactAndroid_release$default(Lcom/facebook/react/views/virtualview/ReactVirtualView;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 3

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 358
    sget-object p2, Lcom/facebook/react/views/virtualview/ReactVirtualView$debugLog$1;->INSTANCE:Lcom/facebook/react/views/virtualview/ReactVirtualView$debugLog$1;

    check-cast p2, Lkotlin/jvm/functions/Function0;

    :cond_0
    const-string/jumbo p3, "subtag"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "block"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 360
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result p3

    const-string p4, "]"

    const-string v0, "]["

    const-string v1, " ["

    const-string v2, "ReactVirtualView:"

    if-eqz p3, :cond_1

    .line 361
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result p3

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 364
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result p3

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private final dispatchOnModeChangeIfNeeded(Z)V
    .locals 11

    .line 167
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->parentScrollView:Landroid/view/View;

    if-nez v0, :cond_1

    goto/16 :goto_3

    .line 170
    :cond_1
    iget-boolean v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    if-eqz v1, :cond_2

    .line 171
    invoke-direct {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->updateParentOffset()V

    .line 173
    :cond_2
    iget-object v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 174
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getLeft()I

    move-result v2

    iget v3, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetX:I

    add-int/2addr v2, v3

    .line 175
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getTop()I

    move-result v3

    iget v4, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetY:I

    add-int/2addr v3, v4

    .line 176
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getRight()I

    move-result v4

    iget v5, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetX:I

    add-int/2addr v4, v5

    .line 177
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getBottom()I

    move-result v5

    iget v6, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetY:I

    add-int/2addr v5, v6

    .line 173
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 179
    iget-object v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 186
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    const-string v1, " ["

    const-string v2, " threshold="

    const-string v3, "]"

    const-string v4, "]["

    const-string v5, "ReactVirtualView:dispatchOnModeChangeIfNeeded"

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 393
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result p1

    if-eqz p1, :cond_11

    .line 394
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result p1

    const-string v0, "empty rects target="

    if-eqz p1, :cond_5

    .line 188
    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p1

    iget-object v6, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 395
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 188
    :cond_5
    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p1

    iget-object v6, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 398
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_6
    if-eqz p1, :cond_9

    .line 193
    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 402
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result p1

    if-eqz p1, :cond_11

    .line 403
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result p1

    const-string v0, "no rect change ["

    if-eqz p1, :cond_7

    .line 404
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result p1

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 407
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result p1

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 197
    :cond_8
    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 201
    :cond_9
    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 202
    iget-boolean p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->detectWindowFocus:Z

    if-eqz p1, :cond_b

    .line 203
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->hasWindowFocus()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 204
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    goto :goto_1

    .line 206
    :cond_a
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    goto :goto_1

    .line 209
    :cond_b
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    goto :goto_1

    .line 213
    :cond_c
    iget-wide v6, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->prerenderRatio:D

    const-wide/16 v8, 0x0

    cmpl-double p1, v6, v8

    if-lez p1, :cond_d

    .line 214
    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 215
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    neg-int v0, v0

    int-to-double v6, v0

    iget-wide v8, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->prerenderRatio:D

    mul-double/2addr v6, v8

    double-to-int v0, v6

    .line 216
    iget-object v6, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    neg-int v6, v6

    int-to-double v6, v6

    iget-wide v8, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->prerenderRatio:D

    mul-double/2addr v6, v8

    double-to-int v6, v6

    .line 214
    invoke-virtual {p1, v0, v6}, Landroid/graphics/Rect;->inset(II)V

    .line 217
    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result p1

    goto :goto_0

    :cond_d
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_e

    .line 220
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    goto :goto_1

    .line 222
    :cond_e
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    .line 223
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 411
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 412
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result v0

    const-string v6, " target="

    const-string v7, "mode="

    if-eqz v0, :cond_f

    .line 227
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    iget-object v8, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 413
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 227
    :cond_f
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    iget-object v8, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 416
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    :cond_10
    :goto_2
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    if-ne p1, v0, :cond_12

    :cond_11
    :goto_3
    return-void

    .line 234
    :cond_12
    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    .line 235
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->maybeEmitModeChanges(Lcom/facebook/react/views/virtualview/VirtualViewMode;Lcom/facebook/react/views/virtualview/VirtualViewMode;)V

    return-void
.end method

.method private final emitAsyncModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V
    .locals 4

    .line 297
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-interface {v0, p1, v1, v2, v3}, Lcom/facebook/react/views/virtualview/ModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    :cond_0
    return-void
.end method

.method private final emitSyncModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V
    .locals 4

    .line 301
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    const/4 v3, 0x1

    invoke-interface {v0, p1, v1, v2, v3}, Lcom/facebook/react/views/virtualview/ModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    :cond_0
    return-void
.end method

.method private final getParentScrollView()Landroid/view/ViewGroup;
    .locals 1

    const/4 v0, 0x1

    .line 304
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->traverseParentStack(Z)Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method private final maybeEmitModeChanges(Lcom/facebook/react/views/virtualview/VirtualViewMode;Lcom/facebook/react/views/virtualview/VirtualViewMode;)V
    .locals 8

    .line 420
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result v0

    const-string v1, "]"

    const-string v2, "]["

    const-string v3, " ["

    const-string v4, "->"

    const-string v5, "ReactVirtualView:Mode change"

    if-eqz v0, :cond_0

    .line 265
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 422
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 265
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 425
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "VirtualView::mode change "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", nativeID="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 266
    invoke-static {v1, v2, v0}, Lcom/facebook/systrace/Systrace;->beginSection(JLjava/lang/String;)V

    .line 269
    sget-object v0, Lcom/facebook/react/views/virtualview/ReactVirtualView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Lcom/facebook/react/views/virtualview/VirtualViewMode;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 p1, 0x3

    if-ne p2, p1, :cond_2

    .line 290
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->emitAsyncModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V

    goto :goto_1

    .line 269
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 285
    :cond_3
    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    if-eq p1, p2, :cond_7

    .line 286
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->emitAsyncModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V

    goto :goto_1

    .line 271
    :cond_4
    iget-object p2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    sget-object v0, Lcom/facebook/react/views/virtualview/VirtualViewRenderState;->Unknown:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    if-ne p2, v0, :cond_5

    .line 273
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->emitSyncModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V

    goto :goto_1

    .line 278
    :cond_5
    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    if-ne p1, p2, :cond_6

    iget-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewRenderState;->Rendered:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    if-ne p1, p2, :cond_6

    goto :goto_1

    .line 280
    :cond_6
    sget-object p1, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->emitSyncModeChange(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V

    .line 293
    :cond_7
    :goto_1
    invoke-static {v1, v2}, Lcom/facebook/systrace/Systrace;->endSection(J)V

    return-void
.end method

.method private static final onWindowFocusChangeListener$lambda$0(Lcom/facebook/react/views/virtualview/ReactVirtualView;Z)V
    .locals 0

    const/4 p1, 0x0

    .line 44
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    return-void
.end method

.method private final rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 3

    .line 246
    iget v0, p1, Landroid/graphics/Rect;->top:I

    iget v1, p2, Landroid/graphics/Rect;->bottom:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    iget v0, p2, Landroid/graphics/Rect;->top:I

    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 250
    :cond_0
    iget v0, p1, Landroid/graphics/Rect;->left:I

    iget v1, p2, Landroid/graphics/Rect;->right:I

    if-ge v0, v1, :cond_2

    iget p2, p2, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    if-lt p2, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method private final traverseParentStack(Z)Landroid/view/ViewGroup;
    .locals 3

    .line 318
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 320
    instance-of v2, v0, Lcom/facebook/react/views/scroll/ReactScrollView;

    if-eqz v2, :cond_0

    .line 321
    check-cast v0, Landroid/view/ViewGroup;

    return-object v0

    .line 323
    :cond_0
    instance-of v2, v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;

    if-eqz v2, :cond_1

    .line 324
    check-cast v0, Landroid/view/ViewGroup;

    return-object v0

    .line 326
    :cond_1
    instance-of v2, v0, Lcom/facebook/react/uimanager/ReactRoot;

    if-eqz v2, :cond_2

    return-object v1

    .line 330
    :cond_2
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_3

    .line 332
    move-object v1, v0

    check-cast v1, Landroid/view/View;

    move-object v2, p0

    check-cast v2, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    if-eqz p1, :cond_3

    .line 334
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 337
    :cond_3
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method private final updateParentOffset()V
    .locals 5

    .line 344
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->parentScrollView:Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 345
    iput v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetX:I

    .line 346
    iput v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetY:I

    .line 347
    iput-boolean v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    .line 348
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    .line 349
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 350
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_1

    .line 351
    iget v2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetX:I

    move-object v3, v1

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v4

    add-int/2addr v2, v4

    iput v2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetX:I

    .line 352
    iget v2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetY:I

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetY:I

    .line 354
    :cond_1
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final debugLog$ReactAndroid_release(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "subtag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 360
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result v0

    const-string v1, "]"

    const-string v2, "]["

    const-string v3, " ["

    const-string v4, "ReactVirtualView:"

    if-eqz v0, :cond_0

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 364
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final doAttachedToWindow$ReactAndroid_release()V
    .locals 7

    .line 84
    invoke-direct {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getParentScrollView()Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 85
    iput-boolean v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    .line 86
    move-object v1, p0

    check-cast v1, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->addScrollListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;)V

    .line 87
    move-object v1, p0

    check-cast v1, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->addLayoutChangeListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 84
    :goto_0
    check-cast v0, Landroid/view/View;

    .line 83
    iput-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 385
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 386
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result v0

    const-string v1, "]"

    const-string v2, "]["

    const-string v3, " ["

    const-string v4, "ReactVirtualView:onAttachedToWindow"

    if-eqz v0, :cond_1

    .line 387
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 389
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->detectWindowFocus:Z

    if-eqz v0, :cond_3

    .line 91
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    :cond_3
    const/4 v0, 0x0

    .line 93
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    return-void
.end method

.method public final getDebugLogEnabled$ReactAndroid_release()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->debugLogEnabled:Z

    return v0
.end method

.method public final getDetectWindowFocus$ReactAndroid_release()Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->detectWindowFocus:Z

    return v0
.end method

.method public final getMode$ReactAndroid_release()Lcom/facebook/react/views/virtualview/VirtualViewMode;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    return-object v0
.end method

.method public final getModeChangeEmitter$ReactAndroid_release()Lcom/facebook/react/views/virtualview/ModeChangeEmitter;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

    return-object v0
.end method

.method public final getNativeId$ReactAndroid_release()Ljava/lang/String;
    .locals 2

    .line 61
    sget v0, Lcom/facebook/react/R$id;->view_tag_native_id:I

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPrerenderRatio$ReactAndroid_release()D
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->prerenderRatio:D

    return-wide v0
.end method

.method public final getRenderState$ReactAndroid_release()Lcom/facebook/react/views/virtualview/VirtualViewRenderState;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 77
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 78
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->doAttachedToWindow$ReactAndroid_release()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 97
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onDetachedFromWindow()V

    .line 98
    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeScrollListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;)V

    .line 99
    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeLayoutChangeListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;)V

    .line 100
    iget-boolean v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->detectWindowFocus:Z

    if-eqz v0, :cond_0

    .line 101
    invoke-virtual {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 103
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->cleanupLayoutListeners()V

    return-void
.end method

.method public onLayout(Landroid/view/ViewGroup;)V
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->parentScrollView:Landroid/view/View;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 151
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 108
    invoke-super/range {p0 .. p5}, Lcom/facebook/react/views/view/ReactViewGroup;->onLayout(ZIIII)V

    move p2, p1

    move-object p1, p0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 110
    iput-boolean p2, p1, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    const/4 p2, 0x0

    .line 111
    invoke-direct {p0, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    :cond_0
    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 126
    iget-boolean p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    const/4 p4, 0x1

    if-nez p1, :cond_1

    if-ne p6, p2, :cond_1

    if-eq p7, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p4

    :goto_1
    iput-boolean p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    .line 127
    invoke-direct {p0, p4}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    return-void
.end method

.method public onLayoutChange(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "scrollView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->parentScrollView:Landroid/view/View;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 161
    iput-boolean p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    const/4 p1, 0x0

    .line 162
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    :cond_0
    return-void
.end method

.method public onScroll(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V
    .locals 0

    .line 140
    iget-object p2, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->parentScrollView:Landroid/view/View;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 141
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    :cond_0
    return-void
.end method

.method public recycleView$ReactAndroid_release()V
    .locals 2

    .line 64
    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeScrollListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;)V

    .line 65
    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeLayoutChangeListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;)V

    .line 66
    invoke-direct {p0}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->cleanupLayoutListeners()V

    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    .line 68
    iput-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

    .line 69
    iget-object v1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 70
    iput-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->parentScrollView:Landroid/view/View;

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetX:I

    .line 72
    iput v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetY:I

    .line 73
    iput-boolean v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->offsetChanged:Z

    return-void
.end method

.method public final setMode$ReactAndroid_release(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->mode:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    return-void
.end method

.method public final setModeChangeEmitter$ReactAndroid_release(Lcom/facebook/react/views/virtualview/ModeChangeEmitter;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

    return-void
.end method

.method public final setPrerenderRatio$ReactAndroid_release(D)V
    .locals 0

    .line 38
    iput-wide p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->prerenderRatio:D

    return-void
.end method

.method public final setRenderState$ReactAndroid_release(Lcom/facebook/react/views/virtualview/VirtualViewRenderState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iput-object p1, p0, Lcom/facebook/react/views/virtualview/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    return-void
.end method

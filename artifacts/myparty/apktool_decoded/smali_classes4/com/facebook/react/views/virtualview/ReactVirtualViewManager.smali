.class public final Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "ReactVirtualViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/VirtualViewManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "VirtualView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/virtualview/ReactVirtualViewManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/facebook/react/views/virtualview/ReactVirtualView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/VirtualViewManagerInterface<",
        "Lcom/facebook/react/views/virtualview/ReactVirtualView;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReactVirtualViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactVirtualViewManager.kt\ncom/facebook/react/views/virtualview/ReactVirtualViewManager\n+ 2 ReactVirtualView.kt\ncom/facebook/react/views/virtualview/ReactVirtualView\n*L\n1#1,103:1\n359#2,9:104\n*S KotlinDebug\n*F\n+ 1 ReactVirtualViewManager.kt\ncom/facebook/react/views/virtualview/ReactVirtualViewManager\n*L\n58#1:104,9\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0014J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0016H\u0017J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000cH\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0014R*\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/facebook/react/views/virtualview/ReactVirtualView;",
        "Lcom/facebook/react/viewmanagers/VirtualViewManagerInterface;",
        "<init>",
        "()V",
        "_delegate",
        "Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "getDelegate",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getName",
        "",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "setInitialHidden",
        "",
        "view",
        "value",
        "",
        "setRenderState",
        "",
        "setNativeId",
        "nativeId",
        "addEventEmitters",
        "prepareToRecycleView",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/facebook/react/views/virtualview/ReactVirtualViewManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "VirtualView"


# instance fields
.field private final _delegate:Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate<",
            "Lcom/facebook/react/views/virtualview/ReactVirtualView;",
            "Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->Companion:Lcom/facebook/react/views/virtualview/ReactVirtualViewManager$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 25
    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    new-instance v0, Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->_delegate:Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate;

    return-void
.end method


# virtual methods
.method public bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V
    .locals 0

    .line 23
    check-cast p2, Lcom/facebook/react/views/virtualview/ReactVirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/virtualview/ReactVirtualView;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/virtualview/ReactVirtualView;)V
    .locals 3

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    move-object v0, p1

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p2}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 64
    :cond_0
    new-instance v1, Lcom/facebook/react/views/virtualview/VirtualViewEventEmitter;

    invoke-virtual {p2}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v2

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    move-result p1

    invoke-direct {v1, v2, p1, v0}, Lcom/facebook/react/views/virtualview/VirtualViewEventEmitter;-><init>(IILcom/facebook/react/uimanager/events/EventDispatcher;)V

    check-cast v1, Lcom/facebook/react/views/virtualview/ModeChangeEmitter;

    .line 63
    invoke-virtual {p2, v1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->setModeChangeEmitter$ReactAndroid_release(Lcom/facebook/react/views/virtualview/ModeChangeEmitter;)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/virtualview/ReactVirtualView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/virtualview/ReactVirtualView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-instance v0, Lcom/facebook/react/views/virtualview/ReactVirtualView;

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/facebook/react/views/virtualview/ReactVirtualView;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->_delegate:Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate;

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 31
    const-string v0, "VirtualView"

    return-object v0
.end method

.method public bridge synthetic prepareToRecycleView(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 23
    check-cast p2, Lcom/facebook/react/views/virtualview/ReactVirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/virtualview/ReactVirtualView;)Lcom/facebook/react/views/virtualview/ReactVirtualView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected prepareToRecycleView(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/virtualview/ReactVirtualView;)Lcom/facebook/react/views/virtualview/ReactVirtualView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p2}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->recycleView$ReactAndroid_release()V

    .line 72
    check-cast p2, Landroid/view/View;

    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/ViewGroupManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/views/virtualview/ReactVirtualView;

    return-object p1
.end method

.method public bridge synthetic setInitialHidden(Landroid/view/View;Z)V
    .locals 0

    .line 23
    check-cast p1, Lcom/facebook/react/views/virtualview/ReactVirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->setInitialHidden(Lcom/facebook/react/views/virtualview/ReactVirtualView;Z)V

    return-void
.end method

.method public setInitialHidden(Lcom/facebook/react/views/virtualview/ReactVirtualView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "initialHidden"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getMode$ReactAndroid_release()Lcom/facebook/react/views/virtualview/VirtualViewMode;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    .line 39
    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtualview/VirtualViewMode;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->setMode$ReactAndroid_release(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic setNativeId(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/facebook/react/views/virtualview/ReactVirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->setNativeId(Lcom/facebook/react/views/virtualview/ReactVirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public setNativeId(Lcom/facebook/react/views/virtualview/ReactVirtualView;Ljava/lang/String;)V
    .locals 6

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-super {p0, v0, p2}, Lcom/facebook/react/uimanager/ViewGroupManager;->setNativeId(Landroid/view/View;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 105
    invoke-static {}, Lcom/facebook/react/views/virtualview/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    move-result p2

    const-string v0, "]"

    const-string v1, "]["

    const-string v2, " ["

    const-string v3, "ReactVirtualView:setNativeId"

    if-eqz p2, :cond_0

    .line 58
    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    .line 106
    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v4

    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/common/logging/FLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 58
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    .line 109
    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getId()I

    move-result v4

    invoke-virtual {p1}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/common/logging/FLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic setRenderState(Landroid/view/View;I)V
    .locals 0

    .line 23
    check-cast p1, Lcom/facebook/react/views/virtualview/ReactVirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;->setRenderState(Lcom/facebook/react/views/virtualview/ReactVirtualView;I)V

    return-void
.end method

.method public setRenderState(Lcom/facebook/react/views/virtualview/ReactVirtualView;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "renderState"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewRenderState()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    .line 51
    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewRenderState;->Unknown:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    goto :goto_0

    .line 50
    :cond_0
    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewRenderState;->None:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    goto :goto_0

    .line 49
    :cond_1
    sget-object p2, Lcom/facebook/react/views/virtualview/VirtualViewRenderState;->Rendered:Lcom/facebook/react/views/virtualview/VirtualViewRenderState;

    .line 47
    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/virtualview/ReactVirtualView;->setRenderState$ReactAndroid_release(Lcom/facebook/react/views/virtualview/VirtualViewRenderState;)V

    :cond_2
    return-void
.end method

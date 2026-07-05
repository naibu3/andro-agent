.class public final Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;
.super Lcom/swmansion/rnscreens/gamma/common/BaseEventEmitter;
.source "TabScreenEventEmitter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u0008\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\u000c\u001a\u00020\t\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;",
        "Lcom/swmansion/rnscreens/gamma/common/BaseEventEmitter;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactContext;",
        "viewTag",
        "",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;I)V",
        "emitOnWillAppear",
        "",
        "emitOnDidAppear",
        "emitOnWillDisappear",
        "emitOnDidDisappear",
        "Companion",
        "react-native-screens_release"
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
.field public static final Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter$Companion;

.field public static final TAG:Ljava/lang/String; = "TabScreenEventEmitter"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;I)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/common/BaseEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    return-void
.end method


# virtual methods
.method public final emitOnDidAppear()V
    .locals 4

    .line 22
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v0

    const-string v1, "onDidAppear"

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitterKt;->access$logEventDispatch(ILjava/lang/String;)V

    .line 23
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    move-result-object v0

    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidAppearEvent;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getSurfaceId()I

    move-result v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidAppearEvent;-><init>(II)V

    check-cast v1, Lcom/facebook/react/uimanager/events/Event;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void
.end method

.method public final emitOnDidDisappear()V
    .locals 4

    .line 32
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v0

    const-string v1, "onDidDisappear"

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitterKt;->access$logEventDispatch(ILjava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    move-result-object v0

    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidDisappearEvent;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getSurfaceId()I

    move-result v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidDisappearEvent;-><init>(II)V

    check-cast v1, Lcom/facebook/react/uimanager/events/Event;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void
.end method

.method public final emitOnWillAppear()V
    .locals 4

    .line 17
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v0

    const-string v1, "onWillAppear"

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitterKt;->access$logEventDispatch(ILjava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    move-result-object v0

    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillAppearEvent;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getSurfaceId()I

    move-result v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillAppearEvent;-><init>(II)V

    check-cast v1, Lcom/facebook/react/uimanager/events/Event;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void
.end method

.method public final emitOnWillDisappear()V
    .locals 4

    .line 27
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v0

    const-string v1, "onWillDisappear"

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitterKt;->access$logEventDispatch(ILjava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    move-result-object v0

    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillDisappearEvent;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getSurfaceId()I

    move-result v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;->getViewTag()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillDisappearEvent;-><init>(II)V

    check-cast v1, Lcom/facebook/react/uimanager/events/Event;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void
.end method

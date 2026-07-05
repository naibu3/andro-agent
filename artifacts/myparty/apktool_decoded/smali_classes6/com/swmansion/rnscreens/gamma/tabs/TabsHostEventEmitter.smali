.class public final Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;
.super Lcom/swmansion/rnscreens/gamma/common/BaseEventEmitter;
.source "TabsHostEventEmitter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;",
        "Lcom/swmansion/rnscreens/gamma/common/BaseEventEmitter;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactContext;",
        "viewTag",
        "",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;I)V",
        "emitOnNativeFocusChange",
        "",
        "tabKey",
        "",
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


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;I)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/common/BaseEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    return-void
.end method


# virtual methods
.method public final emitOnNativeFocusChange(Ljava/lang/String;)V
    .locals 4

    const-string v0, "tabKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;->getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    move-result-object v0

    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;->getSurfaceId()I

    move-result v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;->getViewTag()I

    move-result v3

    invoke-direct {v1, v2, v3, p1}, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;-><init>(IILjava/lang/String;)V

    check-cast v1, Lcom/facebook/react/uimanager/events/Event;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void
.end method

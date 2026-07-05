.class public interface abstract Lio/qonversion/sandwich/AutomationsEventListener;
.super Ljava/lang/Object;
.source "AutomationsEventListener.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/qonversion/sandwich/AutomationsEventListener$DefaultImpls;,
        Lio/qonversion/sandwich/AutomationsEventListener$Event;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001:\u0001\nJ0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0008\u0002\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\tH&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/qonversion/sandwich/AutomationsEventListener;",
        "",
        "onAutomationEvent",
        "",
        "event",
        "Lio/qonversion/sandwich/AutomationsEventListener$Event;",
        "payload",
        "",
        "",
        "Lio/qonversion/sandwich/BridgeData;",
        "Event",
        "sandwich_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onAutomationEvent(Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/qonversion/sandwich/AutomationsEventListener$Event;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.class public final Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "TabsHostNativeFocusChangeEvent.kt"

# interfaces
.implements Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidAppearEvent;",
        ">;",
        "Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\r\u001a\u00020\u0008H\u0016J\u0008\u0010\u000e\u001a\u00020\u0008H\u0016J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;",
        "Lcom/facebook/react/uimanager/events/Event;",
        "Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidAppearEvent;",
        "Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;",
        "surfaceId",
        "",
        "viewId",
        "tabKey",
        "",
        "<init>",
        "(IILjava/lang/String;)V",
        "getTabKey",
        "()Ljava/lang/String;",
        "getEventName",
        "getEventRegistrationName",
        "getCoalescingKey",
        "",
        "getEventData",
        "Lcom/facebook/react/bridge/WritableMap;",
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
.field public static final Companion:Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent$Companion;

.field private static final EVENT_KEY_TAB_KEY:Ljava/lang/String; = "tabKey"

.field public static final EVENT_NAME:Ljava/lang/String; = "topNativeFocusChange"

.field public static final EVENT_REGISTRATION_NAME:Ljava/lang/String; = "onNativeFocusChange"


# instance fields
.field private final tabKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent$Companion;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    const-string v0, "tabKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 11
    iput-object p3, p0, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;->tabKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCoalescingKey()S
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 22
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 23
    const-string v1, "tabKey"

    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;->tabKey:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 14
    const-string v0, "topNativeFocusChange"

    return-object v0
.end method

.method public getEventRegistrationName()Ljava/lang/String;
    .locals 1

    .line 16
    const-string v0, "onNativeFocusChange"

    return-object v0
.end method

.method public final getTabKey()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/event/TabsHostNativeFocusChangeEvent;->tabKey:Ljava/lang/String;

    return-object v0
.end method

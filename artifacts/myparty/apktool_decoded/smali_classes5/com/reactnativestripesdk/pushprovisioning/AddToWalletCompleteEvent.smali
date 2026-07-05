.class public final Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "AddToWalletCompleteEvent.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;",
        "Lcom/facebook/react/uimanager/events/Event;",
        "surfaceId",
        "",
        "viewTag",
        "error",
        "Lcom/facebook/react/bridge/WritableMap;",
        "<init>",
        "(IILcom/facebook/react/bridge/WritableMap;)V",
        "getEventName",
        "",
        "getEventData",
        "Companion",
        "stripe_stripe-react-native_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent$Companion;

.field public static final EVENT_NAME:Ljava/lang/String; = "topCompleteAction"


# instance fields
.field private final error:Lcom/facebook/react/bridge/WritableMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;->Companion:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;->$stable:I

    return-void
.end method

.method public constructor <init>(IILcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 9
    iput-object p3, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;->error:Lcom/facebook/react/bridge/WritableMap;

    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;->error:Lcom/facebook/react/bridge/WritableMap;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 11
    const-string v0, "topCompleteAction"

    return-object v0
.end method

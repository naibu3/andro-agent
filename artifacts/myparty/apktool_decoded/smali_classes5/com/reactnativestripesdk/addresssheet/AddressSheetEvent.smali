.class public final Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "AddressSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$Companion;,
        Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;,
        Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0008H\u0014J\u0008\u0010\u000c\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;",
        "Lcom/facebook/react/uimanager/events/Event;",
        "surfaceId",
        "",
        "viewTag",
        "eventType",
        "Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;",
        "eventMap",
        "Lcom/facebook/react/bridge/WritableMap;",
        "<init>",
        "(IILcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;Lcom/facebook/react/bridge/WritableMap;)V",
        "getEventData",
        "getEventName",
        "",
        "EventType",
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

.field public static final Companion:Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$Companion;

.field public static final ON_ERROR:Ljava/lang/String; = "topErrorAction"

.field public static final ON_SUBMIT:Ljava/lang/String; = "topSubmitAction"


# instance fields
.field private final eventMap:Lcom/facebook/react/bridge/WritableMap;

.field private final eventType:Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;->Companion:Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;->$stable:I

    return-void
.end method

.method public constructor <init>(IILcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    const-string v0, "eventType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 9
    iput-object p3, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;->eventType:Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;

    .line 10
    iput-object p4, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;->eventMap:Lcom/facebook/react/bridge/WritableMap;

    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;->eventMap:Lcom/facebook/react/bridge/WritableMap;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;->eventType:Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;

    sget-object v1, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 27
    const-string v0, "topErrorAction"

    return-object v0

    .line 25
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 26
    :cond_1
    const-string v0, "topSubmitAction"

    return-object v0
.end method

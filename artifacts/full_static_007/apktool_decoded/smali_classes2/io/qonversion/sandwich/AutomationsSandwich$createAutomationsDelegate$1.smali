.class public final Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;
.super Ljava/lang/Object;
.source "AutomationsSandwich.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/automations/AutomationsDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/qonversion/sandwich/AutomationsSandwich;->createAutomationsDelegate(Lio/qonversion/sandwich/AutomationsEventListener;)Lcom/qonversion/android/sdk/automations/AutomationsDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u000b\u001a\u00020\u0003H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "io/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1",
        "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
        "automationsDidFailExecuting",
        "",
        "actionResult",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "automationsDidFinishExecuting",
        "automationsDidShowScreen",
        "screenId",
        "",
        "automationsDidStartExecuting",
        "automationsFinished",
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


# instance fields
.field final synthetic $eventListener:Lio/qonversion/sandwich/AutomationsEventListener;


# direct methods
.method constructor <init>(Lio/qonversion/sandwich/AutomationsEventListener;)V
    .locals 0

    iput-object p1, p0, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;->$eventListener:Lio/qonversion/sandwich/AutomationsEventListener;

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;->$eventListener:Lio/qonversion/sandwich/AutomationsEventListener;

    sget-object v1, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionFailed:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lio/qonversion/sandwich/AutomationsEventListener;->onAutomationEvent(Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;)V

    return-void
.end method

.method public automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;->$eventListener:Lio/qonversion/sandwich/AutomationsEventListener;

    sget-object v1, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lio/qonversion/sandwich/AutomationsEventListener;->onAutomationEvent(Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;)V

    return-void
.end method

.method public automationsDidShowScreen(Ljava/lang/String;)V
    .locals 2

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 91
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;->$eventListener:Lio/qonversion/sandwich/AutomationsEventListener;

    sget-object v1, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ScreenShown:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    invoke-interface {v0, v1, p1}, Lio/qonversion/sandwich/AutomationsEventListener;->onAutomationEvent(Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;)V

    return-void
.end method

.method public automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;->$eventListener:Lio/qonversion/sandwich/AutomationsEventListener;

    sget-object v1, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionStarted:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lio/qonversion/sandwich/AutomationsEventListener;->onAutomationEvent(Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;)V

    return-void
.end method

.method public automationsFinished()V
    .locals 4

    .line 107
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich$createAutomationsDelegate$1;->$eventListener:Lio/qonversion/sandwich/AutomationsEventListener;

    sget-object v1, Lio/qonversion/sandwich/AutomationsEventListener$Event;->AutomationsFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lio/qonversion/sandwich/AutomationsEventListener$DefaultImpls;->onAutomationEvent$default(Lio/qonversion/sandwich/AutomationsEventListener;Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

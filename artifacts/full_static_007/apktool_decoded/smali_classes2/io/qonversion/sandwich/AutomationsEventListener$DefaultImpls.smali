.class public final Lio/qonversion/sandwich/AutomationsEventListener$DefaultImpls;
.super Ljava/lang/Object;
.source "AutomationsEventListener.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/qonversion/sandwich/AutomationsEventListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic onAutomationEvent$default(Lio/qonversion/sandwich/AutomationsEventListener;Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-interface {p0, p1, p2}, Lio/qonversion/sandwich/AutomationsEventListener;->onAutomationEvent(Lio/qonversion/sandwich/AutomationsEventListener$Event;Ljava/util/Map;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onAutomationEvent"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

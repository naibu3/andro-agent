.class public interface abstract Lcom/qonversion/android/sdk/automations/AutomationsDelegate;
.super Ljava/lang/Object;
.source "AutomationsDelegate.java"


# virtual methods
.method public automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 0

    return-void
.end method

.method public automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 0

    return-void
.end method

.method public automationsDidShowScreen(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 0

    return-void
.end method

.method public automationsFinished()V
    .locals 0

    return-void
.end method

.method public shouldHandleEvent(Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;Ljava/util/Map;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    const/4 p1, 0x1

    .line 65
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

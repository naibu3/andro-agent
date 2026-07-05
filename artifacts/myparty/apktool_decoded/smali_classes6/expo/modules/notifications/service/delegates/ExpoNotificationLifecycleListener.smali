.class public Lexpo/modules/notifications/service/delegates/ExpoNotificationLifecycleListener;
.super Ljava/lang/Object;
.source "ExpoNotificationLifecycleListener.java"

# interfaces
.implements Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;


# instance fields
.field private mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;


# direct methods
.method public constructor <init>(Lexpo/modules/notifications/notifications/NotificationManager;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lexpo/modules/notifications/service/delegates/ExpoNotificationLifecycleListener;->mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 35
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 37
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 40
    const-string p2, "notificationResponse"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "textInputNotificationResponse"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    const-string p2, "ExpoNotificationLifeCycleListener.onCreate:"

    invoke-static {p2, p1}, Lexpo/modules/notifications/notifications/debug/DebugLogging;->logBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 45
    iget-object p2, p0, Lexpo/modules/notifications/service/delegates/ExpoNotificationLifecycleListener;->mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;

    invoke-virtual {p2, p1}, Lexpo/modules/notifications/notifications/NotificationManager;->onNotificationResponseFromExtras(Landroid/os/Bundle;)V

    return-void

    .line 41
    :cond_1
    :goto_0
    const-string p1, "ReactNativeJS"

    const-string p2, "[native] ExpoNotificationLifecycleListener contains an unmarshalled notification response. Skipping."

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)Z
    .locals 4

    .line 61
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 63
    const-string v1, "notificationResponse"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "textInputNotificationResponse"

    if-nez v2, :cond_1

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 70
    :cond_0
    const-string v1, "ExpoNotificationLifeCycleListener.onNewIntent:"

    invoke-static {v1, v0}, Lexpo/modules/notifications/notifications/debug/DebugLogging;->logBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 71
    iget-object v1, p0, Lexpo/modules/notifications/service/delegates/ExpoNotificationLifecycleListener;->mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;

    invoke-virtual {v1, v0}, Lexpo/modules/notifications/notifications/NotificationManager;->onNotificationResponseFromExtras(Landroid/os/Bundle;)V

    goto :goto_1

    .line 64
    :cond_1
    :goto_0
    invoke-virtual {p1, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 68
    invoke-super {p0, p1}, Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;->onNewIntent(Landroid/content/Intent;)Z

    move-result p1

    return p1

    .line 73
    :cond_2
    :goto_1
    invoke-super {p0, p1}, Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;->onNewIntent(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

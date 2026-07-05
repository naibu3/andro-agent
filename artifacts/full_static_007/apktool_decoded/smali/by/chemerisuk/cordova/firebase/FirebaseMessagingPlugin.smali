.class public Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;
.super Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;
.source "FirebaseMessagingPlugin.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "FCMPlugin"

.field private static instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;


# instance fields
.field private backgroundCallback:Lorg/apache/cordova/CallbackContext;

.field private firebaseMessaging:Lcom/google/firebase/messaging/FirebaseMessaging;

.field private forceShow:Z

.field private foregroundCallback:Lorg/apache/cordova/CallbackContext;

.field private isBackground:Z

.field private lastBundle:Lorg/json/JSONObject;

.field private notificationManager:Landroid/app/NotificationManager;

.field private requestPermissionCallback:Lorg/apache/cordova/CallbackContext;

.field private tokenRefreshCallback:Lorg/apache/cordova/CallbackContext;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lby/chemerisuk/cordova/support/ReflectiveCordovaPlugin;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->isBackground:Z

    .line 43
    iput-boolean v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->forceShow:Z

    return-void
.end method

.method private clearNotifications(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
    .end annotation

    .line 77
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->notificationManager:Landroid/app/NotificationManager;

    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 78
    invoke-virtual {p1}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method private deleteToken(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
        value = .enum Lby/chemerisuk/cordova/support/ExecutionThread;->WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->firebaseMessaging:Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->deleteToken()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 84
    invoke-virtual {p1}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method private getBadge(Lorg/apache/cordova/CallbackContext;)V
    .locals 3
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
    .end annotation

    .line 132
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    .line 133
    const-string v1, "badge"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 134
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->success(I)V

    return-void
.end method

.method private getNotificationData(Landroid/content/Intent;)Lorg/json/JSONObject;
    .locals 5

    .line 224
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 230
    :cond_0
    const-string v1, "google.message_id"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "google.sent_time"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 235
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 236
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 237
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 238
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object v1

    :catch_0
    move-exception p1

    .line 242
    const-string v1, "FCMPlugin"

    const-string v2, "getNotificationData"

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method

.method private getToken(Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)V
    .locals 3
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
        value = .enum Lby/chemerisuk/cordova/support/ExecutionThread;->WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    .line 89
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CordovaArgs;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 91
    new-instance p1, Lorg/apache/cordova/PluginResult;

    sget-object v0, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    const/4 v1, 0x0

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto :goto_0

    .line 93
    :cond_0
    iget-object p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->firebaseMessaging:Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->getToken()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 94
    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static isForceShow()Z
    .locals 1

    .line 212
    sget-object v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->forceShow:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onBackgroundMessage(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
    .end annotation

    .line 110
    sget-object v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    iput-object p1, v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->backgroundCallback:Lorg/apache/cordova/CallbackContext;

    .line 112
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->lastBundle:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    .line 113
    invoke-direct {p0, v0, p1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->sendNotification(Lorg/json/JSONObject;Lorg/apache/cordova/CallbackContext;)V

    const/4 p1, 0x0

    .line 114
    iput-object p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->lastBundle:Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method private onMessage(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
    .end annotation

    .line 105
    sget-object v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    iput-object p1, v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->foregroundCallback:Lorg/apache/cordova/CallbackContext;

    return-void
.end method

.method private onTokenRefresh(Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
    .end annotation

    .line 100
    sget-object v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    iput-object p1, v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->tokenRefreshCallback:Lorg/apache/cordova/CallbackContext;

    return-void
.end method

.method private requestPermission(Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)V
    .locals 3
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 139
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CordovaArgs;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    .line 140
    iget-object v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 141
    const-string v2, "forceShow"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->forceShow:Z

    .line 142
    invoke-static {v1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 143
    invoke-virtual {p2}, Lorg/apache/cordova/CallbackContext;->success()V

    goto :goto_0

    .line 144
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt p1, v1, :cond_1

    .line 145
    iput-object p2, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->requestPermissionCallback:Lorg/apache/cordova/CallbackContext;

    .line 146
    const-string p1, "android.permission.POST_NOTIFICATIONS"

    invoke-static {p0, v0, p1}, Lorg/apache/cordova/PermissionHelper;->requestPermission(Lorg/apache/cordova/CordovaPlugin;ILjava/lang/String;)V

    goto :goto_0

    .line 148
    :cond_1
    const-string p1, "Notifications permission is not granted"

    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static sendNotification(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 4

    .line 182
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 183
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 186
    :try_start_0
    const-string v2, "gcm"

    invoke-static {v1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->toJSON(Lcom/google/firebase/messaging/RemoteMessage$Notification;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 188
    :cond_0
    const-string v1, "google.message_id"

    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 189
    const-string v1, "google.sent_time"

    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage;->getSentTime()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 191
    sget-object p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    if-eqz p0, :cond_2

    .line 192
    iget-boolean v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->isBackground:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->backgroundCallback:Lorg/apache/cordova/CallbackContext;

    goto :goto_0

    .line 193
    :cond_1
    iget-object v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->foregroundCallback:Lorg/apache/cordova/CallbackContext;

    .line 194
    :goto_0
    invoke-direct {p0, v0, v1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->sendNotification(Lorg/json/JSONObject;Lorg/apache/cordova/CallbackContext;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 197
    const-string v0, "FCMPlugin"

    const-string v1, "sendNotification"

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_1
    return-void
.end method

.method private sendNotification(Lorg/json/JSONObject;Lorg/apache/cordova/CallbackContext;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 217
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONObject;)V

    const/4 p1, 0x1

    .line 218
    invoke-virtual {v0, p1}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 219
    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    :cond_0
    return-void
.end method

.method static sendToken(Ljava/lang/String;)V
    .locals 2

    .line 202
    sget-object v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->tokenRefreshCallback:Lorg/apache/cordova/CallbackContext;

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    .line 204
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1, p0}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 205
    invoke-virtual {v0, p0}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 206
    sget-object p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    iget-object p0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->tokenRefreshCallback:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p0, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    :cond_0
    return-void
.end method

.method private setBadge(Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 120
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CordovaArgs;->getInt(I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 122
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 123
    invoke-static {v0, p1}, Lme/leolin/shortcutbadger/ShortcutBadger;->applyCount(Landroid/content/Context;I)Z

    .line 124
    invoke-virtual {p2}, Lorg/apache/cordova/CallbackContext;->success()V

    goto :goto_0

    .line 126
    :cond_0
    const-string p1, "Badge value can\'t be negative"

    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private subscribe(Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
        value = .enum Lby/chemerisuk/cordova/support/ExecutionThread;->WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    .line 63
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CordovaArgs;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 64
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->firebaseMessaging:Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->subscribeToTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 65
    invoke-virtual {p2}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method private static toJSON(Lcom/google/firebase/messaging/RemoteMessage$Notification;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 248
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "body"

    .line 249
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "title"

    .line 250
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "sound"

    .line 251
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getSound()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "icon"

    .line 252
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getIcon()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "tag"

    .line 253
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getTag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "color"

    .line 254
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "clickAction"

    .line 255
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getClickAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 257
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getImageUrl()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 259
    const-string v1, "imageUrl"

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method private unsubscribe(Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .annotation runtime Lby/chemerisuk/cordova/support/CordovaMethod;
        value = .enum Lby/chemerisuk/cordova/support/ExecutionThread;->WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    .line 70
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CordovaArgs;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 71
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->firebaseMessaging:Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->unsubscribeFromTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 72
    invoke-virtual {p2}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method


# virtual methods
.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 165
    invoke-direct {p0, p1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->getNotificationData(Landroid/content/Intent;)Lorg/json/JSONObject;

    move-result-object p1

    .line 166
    sget-object v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 167
    iget-object v0, v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->backgroundCallback:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0, p1, v0}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->sendNotification(Lorg/json/JSONObject;Lorg/apache/cordova/CallbackContext;)V

    :cond_0
    return-void
.end method

.method public onPause(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 173
    iput-boolean p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->isBackground:Z

    return-void
.end method

.method public onRequestPermissionResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 154
    array-length p1, p3

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    aget v0, p3, p2

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 156
    iget-object p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->requestPermissionCallback:Lorg/apache/cordova/CallbackContext;

    const-string p2, "Notifications permission is not granted"

    invoke-virtual {p1, p2}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    return-void

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 160
    :cond_1
    iget-object p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->requestPermissionCallback:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method public onResume(Z)V
    .locals 0

    const/4 p1, 0x0

    .line 178
    iput-boolean p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->isBackground:Z

    return-void
.end method

.method protected pluginInitialize()V
    .locals 2

    .line 54
    sput-object p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->instance:Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;

    .line 56
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v0

    iput-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->firebaseMessaging:Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 57
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    const-class v1, Landroid/app/NotificationManager;

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->notificationManager:Landroid/app/NotificationManager;

    .line 58
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->getNotificationData(Landroid/content/Intent;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->lastBundle:Lorg/json/JSONObject;

    return-void
.end method

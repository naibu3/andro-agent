.class public Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "FirebaseMessagingPluginService.java"


# static fields
.field public static final ACTION_FCM_MESSAGE:Ljava/lang/String; = "by.chemerisuk.cordova.firebase.ACTION_FCM_MESSAGE"

.field public static final ACTION_FCM_TOKEN:Ljava/lang/String; = "by.chemerisuk.cordova.firebase.ACTION_FCM_TOKEN"

.field public static final EXTRA_FCM_MESSAGE:Ljava/lang/String; = "by.chemerisuk.cordova.firebase.EXTRA_FCM_MESSAGE"

.field public static final EXTRA_FCM_TOKEN:Ljava/lang/String; = "by.chemerisuk.cordova.firebase.EXTRA_FCM_TOKEN"

.field public static final NOTIFICATION_CHANNEL_KEY:Ljava/lang/String; = "com.google.firebase.messaging.default_notification_channel_id"

.field public static final NOTIFICATION_COLOR_KEY:Ljava/lang/String; = "com.google.firebase.messaging.default_notification_color"

.field public static final NOTIFICATION_ICON_KEY:Ljava/lang/String; = "com.google.firebase.messaging.default_notification_icon"

.field private static final TAG:Ljava/lang/String; = "FCMPluginService"


# instance fields
.field private broadcastManager:Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

.field private defaultNotificationChannel:Ljava/lang/String;

.field private defaultNotificationColor:I

.field private defaultNotificationIcon:I

.field private notificationManager:Landroid/app/NotificationManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    return-void
.end method

.method private getNotificationChannel(Lcom/google/firebase/messaging/RemoteMessage$Notification;)Ljava/lang/String;
    .locals 0

    .line 111
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getChannelId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 113
    iget-object p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationChannel:Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method private getNotificationSound(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    if-eqz p1, :cond_2

    .line 120
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x2

    .line 123
    invoke-static {p1}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object p1

    return-object p1

    .line 125
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android.resource://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/raw/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private showAlert(Lcom/google/firebase/messaging/RemoteMessage$Notification;)V
    .locals 3

    .line 93
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {p0, p1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->getNotificationChannel(Lcom/google/firebase/messaging/RemoteMessage$Notification;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getSound()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->getNotificationSound(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSound(Landroid/net/Uri;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 95
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 96
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 97
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setGroup(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationIcon:I

    .line 98
    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    iget v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationColor:I

    .line 99
    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 101
    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 103
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->notificationManager:Landroid/app/NotificationManager;

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 105
    new-instance p1, Landroid/os/Handler;

    invoke-virtual {p0}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService$$ExternalSyntheticLambda0;-><init>(Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method synthetic lambda$showAlert$0$by-chemerisuk-cordova-firebase-FirebaseMessagingPluginService()V
    .locals 2

    .line 106
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->notificationManager:Landroid/app/NotificationManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method public onCreate()V
    .locals 5

    .line 45
    const-string v0, "FCMPluginService"

    invoke-static {p0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object v1

    iput-object v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->broadcastManager:Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    .line 46
    const-class v1, Landroid/app/NotificationManager;

    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    iput-object v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->notificationManager:Landroid/app/NotificationManager;

    .line 48
    :try_start_0
    invoke-virtual {p0}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 49
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.google.firebase.messaging.default_notification_icon"

    iget v4, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationIcon:I

    .line 50
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.google.firebase.messaging.default_notification_channel_id"

    const-string v4, "default"

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationChannel:Ljava/lang/String;

    .line 51
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.google.firebase.messaging.default_notification_color"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationColor:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 55
    const-string v2, "Failed to load notification color"

    invoke-static {v0, v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception v1

    .line 53
    const-string v2, "Failed to load meta-data"

    invoke-static {v0, v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 59
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->notificationManager:Landroid/app/NotificationManager;

    iget-object v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationChannel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->notificationManager:Landroid/app/NotificationManager;

    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->defaultNotificationChannel:Ljava/lang/String;

    const-string v3, "Firebase"

    const/4 v4, 0x4

    invoke-direct {v1, v2, v3, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 2

    .line 78
    invoke-static {p1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->sendNotification(Lcom/google/firebase/messaging/RemoteMessage;)V

    .line 80
    new-instance v0, Landroid/content/Intent;

    const-string v1, "by.chemerisuk.cordova.firebase.ACTION_FCM_MESSAGE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 81
    const-string v1, "by.chemerisuk.cordova.firebase.EXTRA_FCM_MESSAGE"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 82
    iget-object v1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->broadcastManager:Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    invoke-virtual {v1, v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 84
    invoke-static {}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->isForceShow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 87
    invoke-direct {p0, p1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->showAlert(Lcom/google/firebase/messaging/RemoteMessage$Notification;)V

    :cond_0
    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 2

    .line 69
    invoke-static {p1}, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPlugin;->sendToken(Ljava/lang/String;)V

    .line 71
    new-instance v0, Landroid/content/Intent;

    const-string v1, "by.chemerisuk.cordova.firebase.ACTION_FCM_TOKEN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 72
    const-string v1, "by.chemerisuk.cordova.firebase.EXTRA_FCM_TOKEN"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    iget-object p1, p0, Lby/chemerisuk/cordova/firebase/FirebaseMessagingPluginService;->broadcastManager:Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    invoke-virtual {p1, v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    return-void
.end method

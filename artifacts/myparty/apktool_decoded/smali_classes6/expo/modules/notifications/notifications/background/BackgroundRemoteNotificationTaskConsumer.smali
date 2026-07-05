.class public Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;
.super Lexpo/modules/interfaces/taskManager/TaskConsumer;
.source "BackgroundRemoteNotificationTaskConsumer.java"

# interfaces
.implements Lexpo/modules/interfaces/taskManager/TaskConsumerInterface;


# static fields
.field private static final NOTIFICATION_KEY:Ljava/lang/String; = "notification"


# instance fields
.field private mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lexpo/modules/interfaces/taskManager/TaskConsumer;-><init>(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;)V

    .line 39
    sget-object p1, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->Companion:Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;

    invoke-virtual {p1, p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->addBackgroundTaskConsumer(Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;)V

    return-void
.end method

.method private static bundleToJson(Landroid/os/Bundle;)Lorg/json/JSONObject;
    .locals 5

    .line 98
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 99
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 101
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Landroid/os/Bundle;

    if-eqz v3, :cond_0

    .line 102
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    invoke-static {v3}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->bundleToJson(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lorg/json/JSONObject;->wrap(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not create JSON object from notification bundle. "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "expo-notifications"

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static jsonStringToBundle(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 114
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 116
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 117
    invoke-static {v1}, Lexpo/modules/notifications/notifications/NotificationSerializer;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not parse notification from JSON string. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "expo-notifications"

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method


# virtual methods
.method public didExecuteJob(Landroid/app/job/JobService;Landroid/app/job/JobParameters;)Z
    .locals 5

    .line 72
    iget-object v0, p0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 76
    :cond_0
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->getTaskManagerUtils()Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;

    move-result-object v0

    invoke-interface {v0, p2}, Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;->extractDataFromJobParams(Landroid/app/job/JobParameters;)Ljava/util/List;

    move-result-object v0

    .line 78
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PersistableBundle;

    .line 79
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 80
    const-string v3, "notification"

    invoke-virtual {v1, v3}, Landroid/os/PersistableBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->jsonStringToBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 81
    iget-object v1, p0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;

    new-instance v3, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer$1;

    invoke-direct {v3, p0, p1, p2}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer$1;-><init>(Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;Landroid/app/job/JobService;Landroid/app/job/JobParameters;)V

    const/4 v4, 0x0

    invoke-interface {v1, v2, v4, v3}, Lexpo/modules/interfaces/taskManager/TaskInterface;->execute(Landroid/os/Bundle;Ljava/lang/Error;Lexpo/modules/interfaces/taskManager/TaskExecutionCallback;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public didRegister(Lexpo/modules/interfaces/taskManager/TaskInterface;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;

    return-void
.end method

.method public didUnregister()V
    .locals 1

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;

    return-void
.end method

.method public executeTask(Landroid/os/Bundle;)V
    .locals 2

    .line 125
    iget-object v0, p0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lexpo/modules/interfaces/taskManager/TaskInterface;->execute(Landroid/os/Bundle;Ljava/lang/Error;)V

    return-void
.end method

.method public scheduleJob(Landroid/os/Bundle;)V
    .locals 3

    .line 60
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v1, p0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;

    if-eqz v1, :cond_0

    .line 63
    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    .line 65
    invoke-static {p1}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->bundleToJson(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "notification"

    invoke-virtual {v1, v2, p1}, Landroid/os/PersistableBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->getTaskManagerUtils()Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;

    move-result-object p1

    iget-object v2, p0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->mTask:Lexpo/modules/interfaces/taskManager/TaskInterface;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v2, v1}, Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;->scheduleJob(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskInterface;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public taskType()Ljava/lang/String;
    .locals 1

    .line 46
    const-string v0, "remote-notification"

    return-object v0
.end method

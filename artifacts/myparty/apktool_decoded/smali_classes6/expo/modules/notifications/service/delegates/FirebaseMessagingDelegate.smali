.class public Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;
.super Ljava/lang/Object;
.source "FirebaseMessagingDelegate.kt"

# interfaces
.implements Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0004J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0004J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0008\u0010\u0019\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;",
        "Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
        "onNewToken",
        "",
        "token",
        "",
        "onMessageReceived",
        "remoteMessage",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "createNotification",
        "Lexpo/modules/notifications/notifications/model/Notification;",
        "getNotificationIdentifier",
        "createNotificationRequest",
        "Lexpo/modules/notifications/notifications/model/NotificationRequest;",
        "identifier",
        "content",
        "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "notificationTrigger",
        "Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;",
        "onDeletedMessages",
        "Companion",
        "expo-notifications_release"
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
.field public static final Companion:Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;

.field private static sBackgroundTaskConsumerReferences:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
            ">;>;"
        }
    .end annotation
.end field

.field private static sLastToken:Ljava/lang/String;

.field private static final sTokenListenersReferences:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;",
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->Companion:Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;

    .line 35
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sTokenListenersReferences:Ljava/util/WeakHashMap;

    .line 64
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sBackgroundTaskConsumerReferences:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->context:Landroid/content/Context;

    return-void
.end method

.method public static final synthetic access$getSBackgroundTaskConsumerReferences$cp()Ljava/util/WeakHashMap;
    .locals 1

    .line 21
    sget-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sBackgroundTaskConsumerReferences:Ljava/util/WeakHashMap;

    return-object v0
.end method

.method public static final synthetic access$getSLastToken$cp()Ljava/lang/String;
    .locals 1

    .line 21
    sget-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sLastToken:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getSTokenListenersReferences$cp()Ljava/util/WeakHashMap;
    .locals 1

    .line 21
    sget-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sTokenListenersReferences:Ljava/util/WeakHashMap;

    return-object v0
.end method

.method public static final synthetic access$setSBackgroundTaskConsumerReferences$cp(Ljava/util/WeakHashMap;)V
    .locals 0

    .line 21
    sput-object p0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sBackgroundTaskConsumerReferences:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static final synthetic access$setSLastToken$cp(Ljava/lang/String;)V
    .locals 0

    .line 21
    sput-object p0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sLastToken:Ljava/lang/String;

    return-void
.end method

.method public static final addTokenListener(Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->Companion:Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;

    invoke-virtual {v0, p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->addTokenListener(Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;)V

    return-void
.end method


# virtual methods
.method protected final createNotification(Lcom/google/firebase/messaging/RemoteMessage;)Lexpo/modules/notifications/notifications/model/Notification;
    .locals 5

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->getNotificationIdentifier(Lcom/google/firebase/messaging/RemoteMessage;)Ljava/lang/String;

    move-result-object v0

    .line 115
    new-instance v1, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;

    invoke-direct {v1, p1}, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;-><init>(Lcom/google/firebase/messaging/RemoteMessage;)V

    check-cast v1, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    new-instance v2, Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;

    invoke-direct {v2, p1}, Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;-><init>(Lcom/google/firebase/messaging/RemoteMessage;)V

    invoke-virtual {p0, v0, v1, v2}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->createNotificationRequest(Ljava/lang/String;Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;)Lexpo/modules/notifications/notifications/model/NotificationRequest;

    move-result-object v0

    .line 116
    new-instance v1, Lexpo/modules/notifications/notifications/model/Notification;

    new-instance v2, Ljava/util/Date;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getSentTime()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-direct {v1, v0, v2}, Lexpo/modules/notifications/notifications/model/Notification;-><init>(Lexpo/modules/notifications/notifications/model/NotificationRequest;Ljava/util/Date;)V

    return-object v1
.end method

.method protected createNotificationRequest(Ljava/lang/String;Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;)Lexpo/modules/notifications/notifications/model/NotificationRequest;
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTrigger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    new-instance v0, Lexpo/modules/notifications/notifications/model/NotificationRequest;

    check-cast p3, Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;

    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/notifications/notifications/model/NotificationRequest;-><init>(Ljava/lang/String;Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;)V

    return-object v0
.end method

.method protected final getContext()Landroid/content/Context;
    .locals 1

    .line 21
    iget-object v0, p0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->context:Landroid/content/Context;

    return-object v0
.end method

.method protected final getNotificationIdentifier(Lcom/google/firebase/messaging/RemoteMessage;)Ljava/lang/String;
    .locals 2

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "tag"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getMessageId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1

    :cond_1
    return-object v0
.end method

.method public onDeletedMessages()V
    .locals 2

    .line 137
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    iget-object v1, p0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/service/NotificationsService$Companion;->handleDropped(Landroid/content/Context;)V

    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 8

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    sget-object v0, Lexpo/modules/notifications/notifications/debug/DebugLogging;->INSTANCE:Lexpo/modules/notifications/notifications/debug/DebugLogging;

    const-string v1, "FirebaseMessagingDelegate.onMessageReceived: message"

    invoke-virtual {v0, v1, p1}, Lexpo/modules/notifications/notifications/debug/DebugLogging;->logRemoteMessage(Ljava/lang/String;Lcom/google/firebase/messaging/RemoteMessage;)V

    .line 106
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->createNotification(Lcom/google/firebase/messaging/RemoteMessage;)Lexpo/modules/notifications/notifications/model/Notification;

    move-result-object v4

    .line 107
    sget-object v0, Lexpo/modules/notifications/notifications/debug/DebugLogging;->INSTANCE:Lexpo/modules/notifications/notifications/debug/DebugLogging;

    const-string v1, "FirebaseMessagingDelegate.onMessageReceived: notification"

    invoke-virtual {v0, v1, v4}, Lexpo/modules/notifications/notifications/debug/DebugLogging;->logNotification(Ljava/lang/String;Lexpo/modules/notifications/notifications/model/Notification;)V

    .line 108
    sget-object v2, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    iget-object v3, p0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->context:Landroid/content/Context;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lexpo/modules/notifications/service/NotificationsService$Companion;->receive$default(Lexpo/modules/notifications/service/NotificationsService$Companion;Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Landroid/os/ResultReceiver;ILjava/lang/Object;)V

    .line 109
    sget-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->Companion:Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;

    iget-object v1, p0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lexpo/modules/notifications/notifications/RemoteMessageSerializer;->toBundle(Lcom/google/firebase/messaging/RemoteMessage;)Landroid/os/Bundle;

    move-result-object p1

    const-string v2, "toBundle(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->runTaskManagerTasks(Landroid/content/Context;Landroid/os/Bundle;)V

    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 2

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    sget-object v0, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sTokenListenersReferences:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 98
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;->onNewToken(Ljava/lang/String;)V

    goto :goto_0

    .line 100
    :cond_1
    sput-object p1, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->sLastToken:Ljava/lang/String;

    return-void
.end method

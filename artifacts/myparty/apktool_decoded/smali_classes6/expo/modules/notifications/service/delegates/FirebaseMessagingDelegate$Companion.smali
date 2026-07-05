.class public final Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;
.super Ljava/lang/Object;
.source "FirebaseMessagingDelegate.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirebaseMessagingDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseMessagingDelegate.kt\nexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1617#2,9:141\n1869#2:150\n1870#2:152\n1626#2:153\n1869#2,2:154\n1#3:151\n*S KotlinDebug\n*F\n+ 1 FirebaseMessagingDelegate.kt\nexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion\n*L\n78#1:141,9\n78#1:150\n78#1:152\n78#1:153\n85#1:154,2\n78#1:151\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000cH\u0007J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0014J\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001bJ\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u000c\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0018\u00010\r0\u000bX\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR,\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\r0\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u000f\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006!"
    }
    d2 = {
        "Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;",
        "",
        "<init>",
        "()V",
        "sLastToken",
        "",
        "getSLastToken",
        "()Ljava/lang/String;",
        "setSLastToken",
        "(Ljava/lang/String;)V",
        "sTokenListenersReferences",
        "Ljava/util/WeakHashMap;",
        "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;",
        "Ljava/lang/ref/WeakReference;",
        "getSTokenListenersReferences",
        "()Ljava/util/WeakHashMap;",
        "addTokenListener",
        "",
        "listener",
        "sBackgroundTaskConsumerReferences",
        "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
        "getSBackgroundTaskConsumerReferences",
        "setSBackgroundTaskConsumerReferences",
        "(Ljava/util/WeakHashMap;)V",
        "addBackgroundTaskConsumer",
        "taskConsumer",
        "getBackgroundTasks",
        "",
        "runTaskManagerTasks",
        "applicationContext",
        "Landroid/content/Context;",
        "bundle",
        "Landroid/os/Bundle;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addBackgroundTaskConsumer(Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;)V
    .locals 2

    const-string v0, "taskConsumer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->getSBackgroundTaskConsumerReferences()Ljava/util/WeakHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 75
    :cond_0
    invoke-virtual {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->getSBackgroundTaskConsumerReferences()Ljava/util/WeakHashMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final addTokenListener(Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;)V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->getSTokenListenersReferences()Ljava/util/WeakHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->getSTokenListenersReferences()Ljava/util/WeakHashMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    invoke-virtual {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->getSLastToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    invoke-interface {p1, v0}, Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;->onNewToken(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final getBackgroundTasks()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
            ">;"
        }
    .end annotation

    .line 78
    invoke-virtual {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->getSBackgroundTaskConsumerReferences()Ljava/util/WeakHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 141
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 150
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 149
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 78
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;

    if-eqz v2, :cond_0

    .line 149
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 153
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method protected final getSBackgroundTaskConsumerReferences()Ljava/util/WeakHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/WeakHashMap<",
            "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
            ">;>;"
        }
    .end annotation

    .line 64
    invoke-static {}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->access$getSBackgroundTaskConsumerReferences$cp()Ljava/util/WeakHashMap;

    move-result-object v0

    return-object v0
.end method

.method protected final getSLastToken()Ljava/lang/String;
    .locals 1

    .line 29
    invoke-static {}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->access$getSLastToken$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final getSTokenListenersReferences()Ljava/util/WeakHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/WeakHashMap<",
            "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;",
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;",
            ">;>;"
        }
    .end annotation

    .line 35
    invoke-static {}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->access$getSTokenListenersReferences$cp()Ljava/util/WeakHashMap;

    move-result-object v0

    return-object v0
.end method

.method public final runTaskManagerTasks(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bundle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    sget-object v0, Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;->INSTANCE:Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;

    invoke-virtual {v0, p1}, Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;->getTaskServiceImpl(Landroid/content/Context;)Lexpo/modules/interfaces/taskManager/TaskServiceInterface;

    .line 85
    invoke-virtual {p0}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;->getBackgroundTasks()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 154
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;

    .line 86
    invoke-virtual {v0, p2}, Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;->executeTask(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final setSBackgroundTaskConsumerReferences(Ljava/util/WeakHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/WeakHashMap<",
            "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-static {p1}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->access$setSBackgroundTaskConsumerReferences$cp(Ljava/util/WeakHashMap;)V

    return-void
.end method

.method protected final setSLastToken(Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-static {p1}, Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;->access$setSLastToken$cp(Ljava/lang/String;)V

    return-void
.end method

.class public Lexpo/modules/notifications/NotificationsPackage;
.super Lexpo/modules/core/BasePackage;
.source "NotificationsPackage.java"


# instance fields
.field private mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lexpo/modules/core/BasePackage;-><init>()V

    .line 23
    new-instance v0, Lexpo/modules/notifications/notifications/NotificationManager;

    invoke-direct {v0}, Lexpo/modules/notifications/notifications/NotificationManager;-><init>()V

    iput-object v0, p0, Lexpo/modules/notifications/NotificationsPackage;->mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;

    return-void
.end method


# virtual methods
.method public createInternalModules(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lexpo/modules/core/interfaces/InternalModule;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 35
    new-array v0, v0, [Lexpo/modules/core/interfaces/InternalModule;

    new-instance v1, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;

    invoke-direct {v1, p1}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    new-instance p1, Lexpo/modules/notifications/notifications/categories/serializers/ExpoNotificationsCategoriesSerializer;

    invoke-direct {p1}, Lexpo/modules/notifications/notifications/categories/serializers/ExpoNotificationsCategoriesSerializer;-><init>()V

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public createReactActivityLifecycleListeners(Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;",
            ">;"
        }
    .end annotation

    .line 43
    new-instance p1, Lexpo/modules/notifications/service/delegates/ExpoNotificationLifecycleListener;

    iget-object v0, p0, Lexpo/modules/notifications/NotificationsPackage;->mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;

    invoke-direct {p1, v0}, Lexpo/modules/notifications/service/delegates/ExpoNotificationLifecycleListener;-><init>(Lexpo/modules/notifications/notifications/NotificationManager;)V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public createSingletonModules(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lexpo/modules/core/interfaces/SingletonModule;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x1

    .line 28
    new-array p1, p1, [Lexpo/modules/core/interfaces/SingletonModule;

    const/4 v0, 0x0

    iget-object v1, p0, Lexpo/modules/notifications/NotificationsPackage;->mNotificationManager:Lexpo/modules/notifications/notifications/NotificationManager;

    aput-object v1, p1, v0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

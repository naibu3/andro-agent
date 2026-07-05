.class public final Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;
.super Lexpo/modules/notifications/notifications/channels/AbstractNotificationsChannelsProvider;
.source "AndroidXNotificationsChannelsProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000c\u001a\u00020\r8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000b\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u000b\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;",
        "Lexpo/modules/notifications/notifications/channels/AbstractNotificationsChannelsProvider;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "groupManager",
        "Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;",
        "getGroupManager",
        "()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;",
        "groupManager$delegate",
        "Lkotlin/Lazy;",
        "channelManager",
        "Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;",
        "getChannelManager",
        "()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;",
        "channelManager$delegate",
        "channelSerializer",
        "Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;",
        "getChannelSerializer",
        "()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;",
        "channelSerializer$delegate",
        "groupSerializer",
        "Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;",
        "getGroupSerializer",
        "()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;",
        "groupSerializer$delegate",
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


# instance fields
.field private final channelManager$delegate:Lkotlin/Lazy;

.field private final channelSerializer$delegate:Lkotlin/Lazy;

.field private final groupManager$delegate:Lkotlin/Lazy;

.field private final groupSerializer$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$NB1rNFDUNEXDJTHrV4Loj6p789o(Landroid/content/Context;)Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;
    .locals 0

    invoke-static {p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->groupManager_delegate$lambda$0(Landroid/content/Context;)Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QUe1MN1b2aUSTFyRLr2gap8HUZk(Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;
    .locals 0

    invoke-static {p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->groupSerializer_delegate$lambda$3(Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oCvIvokDvEJh6J0kE6AMmPkoAII()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;
    .locals 1

    invoke-static {}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->channelSerializer_delegate$lambda$2()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$yEUyhwsWks0zK63KH9NsD2vNz4E(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;
    .locals 0

    invoke-static {p0, p1}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->channelManager_delegate$lambda$1(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0, p1}, Lexpo/modules/notifications/notifications/channels/AbstractNotificationsChannelsProvider;-><init>(Landroid/content/Context;)V

    .line 11
    new-instance v0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->groupManager$delegate:Lkotlin/Lazy;

    .line 15
    new-instance v0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1, p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1;-><init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->channelManager$delegate:Lkotlin/Lazy;

    .line 19
    new-instance p1, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda2;

    invoke-direct {p1}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->channelSerializer$delegate:Lkotlin/Lazy;

    .line 23
    new-instance p1, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda3;

    invoke-direct {p1, p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda3;-><init>(Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->groupSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private static final channelManager_delegate$lambda$1(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;
    .locals 1

    .line 16
    new-instance v0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;

    invoke-virtual {p1}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->getGroupManager()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;

    move-result-object p1

    check-cast p1, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    invoke-direct {v0, p0, p1}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;-><init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;)V

    return-object v0
.end method

.method private static final channelSerializer_delegate$lambda$2()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;
    .locals 1

    .line 20
    new-instance v0, Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;

    invoke-direct {v0}, Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;-><init>()V

    return-object v0
.end method

.method private static final groupManager_delegate$lambda$0(Landroid/content/Context;)Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;
    .locals 1

    .line 12
    new-instance v0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;

    invoke-direct {v0, p0}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final groupSerializer_delegate$lambda$3(Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;
    .locals 1

    .line 24
    new-instance v0, Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->getChannelSerializer()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;

    move-result-object p0

    check-cast p0, Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;

    invoke-direct {v0, p0}, Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;-><init>(Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;)V

    return-object v0
.end method


# virtual methods
.method public getChannelManager()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;
    .locals 1

    .line 15
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->channelManager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;

    return-object v0
.end method

.method public bridge synthetic getChannelManager()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->getChannelManager()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;

    return-object v0
.end method

.method public getChannelSerializer()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;
    .locals 1

    .line 19
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->channelSerializer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;

    return-object v0
.end method

.method public bridge synthetic getChannelSerializer()Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->getChannelSerializer()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;

    return-object v0
.end method

.method public getGroupManager()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;
    .locals 1

    .line 11
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->groupManager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;

    return-object v0
.end method

.method public bridge synthetic getGroupManager()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->getGroupManager()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    return-object v0
.end method

.method public getGroupSerializer()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;
    .locals 1

    .line 23
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->groupSerializer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;

    return-object v0
.end method

.method public bridge synthetic getGroupSerializer()Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelGroupSerializer;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->getGroupSerializer()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelGroupSerializer;

    return-object v0
.end method

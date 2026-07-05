.class public Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;
.super Ljava/lang/Object;
.source "AndroidXNotificationsChannelManager.java"

# interfaces
.implements Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;


# instance fields
.field private final mNotificationManager:Landroidx/core/app/NotificationManagerCompat;

.field private mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

.field private final mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-static {p1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/NotificationManagerCompat;

    .line 52
    new-instance v0, Lexpo/modules/notifications/notifications/SoundResolver;

    invoke-direct {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    .line 53
    iput-object p2, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    return-void
.end method


# virtual methods
.method protected configureChannelWithOptions(Ljava/lang/Object;Lexpo/modules/core/arguments/ReadableArguments;)V
    .locals 3

    .line 95
    instance-of v0, p1, Landroid/app/NotificationChannel;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 98
    :cond_0
    check-cast p1, Landroid/app/NotificationChannel;

    .line 99
    const-string v0, "bypassDnd"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 100
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->setBypassDnd(Z)V

    .line 102
    :cond_1
    const-string v0, "description"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 103
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 105
    :cond_2
    const-string v0, "lightColor"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 106
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->setLightColor(I)V

    .line 108
    :cond_3
    const-string v0, "groupId"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 109
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    invoke-interface {v1, v0}, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;->getNotificationChannelGroup(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    move-result-object v1

    if-nez v1, :cond_4

    .line 112
    iget-object v1, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    new-instance v2, Lexpo/modules/core/arguments/MapArguments;

    invoke-direct {v2}, Lexpo/modules/core/arguments/MapArguments;-><init>()V

    invoke-interface {v1, v0, v0, v2}, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;->createNotificationChannelGroup(Ljava/lang/String;Ljava/lang/CharSequence;Lexpo/modules/core/arguments/ReadableArguments;)Landroid/app/NotificationChannelGroup;

    move-result-object v1

    .line 114
    :cond_4
    invoke-virtual {v1}, Landroid/app/NotificationChannelGroup;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->setGroup(Ljava/lang/String;)V

    .line 116
    :cond_5
    const-string v0, "lockscreenVisibility"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 117
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 119
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->getNativeValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    .line 122
    :cond_6
    const-string v0, "showBadge"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 123
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 125
    :cond_7
    const-string v0, "sound"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "audioAttributes"

    if-nez v0, :cond_8

    invoke-interface {p2, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 126
    :cond_8
    invoke-virtual {p0, p2}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->createSoundUriFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;

    move-result-object v0

    .line 127
    invoke-interface {p2, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getArguments(Ljava/lang/String;)Lexpo/modules/core/arguments/ReadableArguments;

    move-result-object v1

    invoke-virtual {p0, v1}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->createAttributesFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/media/AudioAttributes;

    move-result-object v1

    .line 128
    invoke-virtual {p1, v0, v1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 130
    :cond_9
    const-string v0, "vibrationPattern"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 131
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->createVibrationPatternFromList(Ljava/util/List;)[J

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    .line 133
    :cond_a
    const-string v0, "enableLights"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 134
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->enableLights(Z)V

    .line 136
    :cond_b
    const-string v0, "enableVibrate"

    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 137
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    :cond_c
    :goto_0
    return-void
.end method

.method protected createAttributesFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/media/AudioAttributes;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 179
    :cond_0
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 180
    const-string v1, "usage"

    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 181
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/AudioUsage;

    move-result-object v1

    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->getNativeValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 183
    :cond_1
    const-string v1, "contentType"

    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 184
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/AudioContentType;

    move-result-object v1

    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->getNativeValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 186
    :cond_2
    const-string v1, "flags"

    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 188
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getArguments(Ljava/lang/String;)Lexpo/modules/core/arguments/ReadableArguments;

    move-result-object p1

    .line 189
    const-string v1, "enforceAudibility"

    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 192
    const-string v2, "requestHardwareAudioVideoSynchronization"

    invoke-interface {p1, v2}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    or-int/lit8 v1, v1, 0x10

    .line 195
    :cond_3
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 197
    :cond_4
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    return-object p1
.end method

.method public createNotificationChannel(Ljava/lang/String;Ljava/lang/CharSequence;ILexpo/modules/core/arguments/ReadableArguments;)Landroid/app/NotificationChannel;
    .locals 1

    .line 80
    new-instance v0, Landroid/app/NotificationChannel;

    invoke-direct {v0, p1, p2, p3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 81
    invoke-virtual {p0, v0, p4}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->configureChannelWithOptions(Ljava/lang/Object;Lexpo/modules/core/arguments/ReadableArguments;)V

    .line 82
    iget-object p2, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {p2, v0}, Landroidx/core/app/NotificationManagerCompat;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 86
    iget-object p2, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {p2, p1}, Landroidx/core/app/NotificationManagerCompat;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    return-object p1
.end method

.method protected createSoundUriFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;
    .locals 2

    .line 144
    const-string v0, "sound"

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 145
    sget-object p1, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    return-object p1

    .line 148
    :cond_0
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 153
    :cond_1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    invoke-virtual {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;->resolve(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method protected createVibrationPatternFromList(Ljava/util/List;)[J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 162
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    const/4 v1, 0x0

    .line 163
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 164
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/Number;

    if-eqz v2, :cond_1

    .line 165
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 167
    :cond_1
    new-instance v0, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;-><init>(ILjava/lang/Object;)V

    throw v0

    :cond_2
    return-object v0
.end method

.method public deleteNotificationChannel(Ljava/lang/String;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationManagerCompat;->deleteNotificationChannel(Ljava/lang/String;)V

    return-void
.end method

.method public getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 1

    .line 61
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationManagerCompat;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    return-object p1
.end method

.method public getNotificationChannels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->getNotificationChannels()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

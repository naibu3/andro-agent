.class public Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;
.super Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
.source "ArgumentsNotificationContentBuilder.java"


# static fields
.field private static final AUTO_DISMISS_KEY:Ljava/lang/String; = "autoDismiss"

.field private static final BADGE_KEY:Ljava/lang/String; = "badge"

.field private static final BODY_KEY:Ljava/lang/String; = "data"

.field private static final CATEGORY_IDENTIFIER_KEY:Ljava/lang/String; = "categoryIdentifier"

.field private static final COLOR_KEY:Ljava/lang/String; = "color"

.field private static final PRIORITY_KEY:Ljava/lang/String; = "priority"

.field private static final SOUND_KEY:Ljava/lang/String; = "sound"

.field private static final STICKY_KEY:Ljava/lang/String; = "sticky"

.field private static final SUBTITLE_KEY:Ljava/lang/String; = "subtitle"

.field private static final TEXT_KEY:Ljava/lang/String; = "body"

.field private static final TITLE_KEY:Ljava/lang/String; = "title"

.field private static final VIBRATE_KEY:Ljava/lang/String; = "vibrate"


# instance fields
.field private mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;-><init>()V

    .line 36
    new-instance v0, Lexpo/modules/notifications/notifications/SoundResolver;

    invoke-direct {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    return-void
.end method


# virtual methods
.method protected getAutoDismiss(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 137
    const-string v0, "autoDismiss"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method protected getBadgeCount(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;
    .locals 2

    .line 66
    const-string v0, "badge"

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getBody(Lexpo/modules/core/arguments/ReadableArguments;)Lorg/json/JSONObject;
    .locals 2

    const/4 v0, 0x0

    .line 95
    :try_start_0
    const-string v1, "data"

    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 97
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :cond_0
    return-object v0
.end method

.method protected getCategoryId(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/String;
    .locals 2

    .line 142
    const-string v0, "categoryIdentifier"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getColor(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;
    .locals 3

    .line 71
    const-string v0, "color"

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    return-object v1

    .line 73
    :catch_0
    const-string p1, "expo-notifications"

    const-string v0, "Could not have parsed color passed in notification."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method

.method protected getPriority(Lexpo/modules/core/arguments/ReadableArguments;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 1

    .line 131
    const-string v0, "priority"

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 132
    invoke-static {p1}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->fromEnumValue(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    move-result-object p1

    return-object p1
.end method

.method protected getSound(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;
    .locals 1

    .line 88
    const-string v0, "sound"

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 89
    iget-object v0, p0, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    invoke-virtual {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;->resolve(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method protected getSticky(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 147
    const-string v0, "sticky"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method protected getVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)[J
    .locals 4

    .line 111
    :try_start_0
    const-string v0, "vibrate"

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 113
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    const/4 v1, 0x0

    .line 114
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 115
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/Number;

    if-eqz v2, :cond_0

    .line 116
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 118
    :cond_0
    new-instance v0, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;-><init>(ILjava/lang/Object;)V

    throw v0
    :try_end_0
    .catch Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object v0

    :catch_0
    move-exception p1

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to set custom vibration pattern from the notification: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "expo-notifications"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public setPayload(Lexpo/modules/core/arguments/ReadableArguments;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 2

    .line 40
    const-string v0, "title"

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->setTitle(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    const-string v1, "subtitle"

    .line 41
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setSubtitle(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    const-string v1, "body"

    .line 42
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setText(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    .line 43
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getBody(Lexpo/modules/core/arguments/ReadableArguments;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setBody(Lorg/json/JSONObject;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    .line 44
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getPriority(Lexpo/modules/core/arguments/ReadableArguments;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setPriority(Lexpo/modules/notifications/notifications/enums/NotificationPriority;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    .line 45
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getBadgeCount(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setBadgeCount(Ljava/lang/Number;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    .line 46
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getColor(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setColor(Ljava/lang/Number;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    .line 47
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getAutoDismiss(Lexpo/modules/core/arguments/ReadableArguments;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setAutoDismiss(Z)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    .line 48
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getCategoryId(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setCategoryId(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    move-result-object v0

    .line 49
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getSticky(Lexpo/modules/core/arguments/ReadableArguments;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setSticky(Z)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 51
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->shouldPlayDefaultSound(Lexpo/modules/core/arguments/ReadableArguments;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->useDefaultSound()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getSound(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->setSound(Landroid/net/Uri;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 57
    :goto_0
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->shouldUseDefaultVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->useDefaultVibrationPattern()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    return-object p0

    .line 60
    :cond_1
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)[J

    move-result-object p1

    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->setVibrationPattern([J)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    return-object p0
.end method

.method protected shouldPlayDefaultSound(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 79
    const-string v0, "sound"

    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    .line 80
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 84
    :cond_0
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getSound(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method protected shouldUseDefaultVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 106
    const-string v0, "vibrate"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method

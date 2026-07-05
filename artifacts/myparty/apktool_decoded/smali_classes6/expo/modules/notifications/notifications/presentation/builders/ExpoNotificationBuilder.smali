.class public Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;
.super Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;
.source "ExpoNotificationBuilder.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExpoNotificationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpoNotificationBuilder.kt\nexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1#2:411\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0004\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 12\u00020\u0001:\u00011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0004J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015H\u0004J\u000e\u0010\u0016\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J\u0008\u0010 \u001a\u00020!H\u0002J\u0008\u0010\"\u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0016\u0010\'\u001a\u0004\u0018\u00010(8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R\u0014\u0010+\u001a\u00020$8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010&R\u0016\u0010-\u001a\u0004\u0018\u00010.8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100\u00a8\u00062"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;",
        "Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;",
        "context",
        "Landroid/content/Context;",
        "notification",
        "Lexpo/modules/notifications/notifications/model/Notification;",
        "store",
        "Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;)V",
        "addActionsToBuilder",
        "",
        "builder",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "categoryIdentifier",
        "",
        "buildButtonAction",
        "Landroidx/core/app/NotificationCompat$Action;",
        "action",
        "Lexpo/modules/notifications/notifications/model/NotificationAction;",
        "buildTextInputAction",
        "Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;",
        "build",
        "Landroid/app/Notification;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "applySoundsAndVibrations",
        "content",
        "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "marshallNotificationRequest",
        "",
        "request",
        "Lexpo/modules/notifications/notifications/model/NotificationRequest;",
        "shouldPlaySound",
        "",
        "shouldVibrate",
        "priority",
        "",
        "getPriority",
        "()I",
        "largeIcon",
        "Landroid/graphics/Bitmap;",
        "getLargeIcon",
        "()Landroid/graphics/Bitmap;",
        "icon",
        "getIcon",
        "color",
        "",
        "getColor",
        "()Ljava/lang/Number;",
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
.field public static final Companion:Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$Companion;

.field public static final EXTRAS_BODY_KEY:Ljava/lang/String; = "body"

.field public static final EXTRAS_MARSHALLED_NOTIFICATION_REQUEST_KEY:Ljava/lang/String; = "expo.notification_request"

.field public static final META_DATA_DEFAULT_COLOR_KEY:Ljava/lang/String; = "expo.modules.notifications.default_notification_color"

.field public static final META_DATA_DEFAULT_ICON_KEY:Ljava/lang/String; = "expo.modules.notifications.default_notification_icon"

.field public static final META_DATA_LARGE_ICON_KEY:Ljava/lang/String; = "expo.modules.notifications.large_notification_icon"


# instance fields
.field private final store:Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->Companion:Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notification"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "store"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p1, p2}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;-><init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;)V

    .line 36
    iput-object p3, p0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->store:Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;

    return-void
.end method

.method private final applySoundsAndVibrations(Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Landroidx/core/app/NotificationCompat$Builder;)V
    .locals 6

    .line 160
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->shouldPlaySound()Z

    move-result v0

    .line 161
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->shouldVibrate()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    .line 165
    invoke-virtual {p2, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSilent(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 167
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-ge v3, v4, :cond_7

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 169
    invoke-interface {p1}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getShouldPlayDefaultSound()Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_0
    if-eqz v1, :cond_2

    .line 170
    invoke-interface {p1}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getShouldUseDefaultVibrationPattern()Z

    move-result v5

    if-eqz v5, :cond_2

    move v3, v2

    :cond_2
    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    const/4 p1, -0x1

    .line 172
    invoke-virtual {p2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 171
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-void

    :cond_3
    if-eqz v0, :cond_5

    .line 175
    invoke-interface {p1}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getSoundName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 176
    new-instance v0, Lexpo/modules/notifications/notifications/SoundResolver;

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lexpo/modules/notifications/notifications/SoundResolver;-><init>(Landroid/content/Context;)V

    invoke-interface {p1}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getSoundName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lexpo/modules/notifications/notifications/SoundResolver;->resolve(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 177
    invoke-virtual {p2, v0}, Landroidx/core/app/NotificationCompat$Builder;->setSound(Landroid/net/Uri;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_1

    :cond_4
    if-eqz v4, :cond_5

    .line 179
    invoke-virtual {p2, v2}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 180
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    invoke-virtual {p2, v0}, Landroidx/core/app/NotificationCompat$Builder;->setSound(Landroid/net/Uri;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_5
    :goto_1
    if-eqz v1, :cond_7

    .line 184
    invoke-interface {p1}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getVibrationPattern()[J

    move-result-object p1

    if-eqz p1, :cond_6

    .line 186
    invoke-virtual {p2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setVibrate([J)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_6
    if-eqz v3, :cond_7

    const/4 p1, 0x2

    .line 188
    invoke-virtual {p2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    :cond_7
    return-void
.end method

.method static synthetic build$suspendImpl(Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/app/Notification;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;

    iget v1, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;

    invoke-direct {v0, p0, p1}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;-><init>(Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 92
    iget v2, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->L$0:Ljava/lang/Object;

    check-cast p0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 93
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->createBuilder()Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 95
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getIcon()I

    move-result v2

    invoke-virtual {p1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 96
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getPriority()I

    move-result v2

    invoke-virtual {p1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 98
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v2

    .line 100
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->isAutoDismiss()Z

    move-result v4

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 101
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->isSticky()Z

    move-result v4

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 104
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getTitle()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 105
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getText()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 106
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getSubText()Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setSubText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 109
    new-instance v4, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getText()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v4, v5}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v4

    check-cast v4, Landroidx/core/app/NotificationCompat$Style;

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    .line 111
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getColor()Ljava/lang/Number;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 112
    :cond_3
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v4

    invoke-interface {v4}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getBadgeCount()Ljava/lang/Number;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setNumber(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 113
    :cond_4
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v4

    invoke-interface {v4}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getCategoryId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {p0, p1, v4}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->addActionsToBuilder(Landroidx/core/app/NotificationCompat$Builder;Ljava/lang/String;)V

    .line 115
    :cond_5
    invoke-direct {p0, v2, p1}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->applySoundsAndVibrations(Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Landroidx/core/app/NotificationCompat$Builder;)V

    .line 117
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getBody()Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 119
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "getExtras(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getBody()Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "body"

    invoke-virtual {v4, v5, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setExtras(Landroid/os/Bundle;)Landroidx/core/app/NotificationCompat$Builder;

    .line 128
    :cond_6
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 135
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotification()Lexpo/modules/notifications/notifications/model/Notification;

    move-result-object v4

    invoke-virtual {v4}, Lexpo/modules/notifications/notifications/model/Notification;->getNotificationRequest()Lexpo/modules/notifications/notifications/model/NotificationRequest;

    move-result-object v4

    const-string v5, "getNotificationRequest(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p0, v4}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->marshallNotificationRequest(Lexpo/modules/notifications/notifications/model/NotificationRequest;)[B

    move-result-object v4

    .line 132
    const-string v5, "expo.notification_request"

    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 138
    invoke-virtual {p1, v2}, Landroidx/core/app/NotificationCompat$Builder;->addExtras(Landroid/os/Bundle;)Landroidx/core/app/NotificationCompat$Builder;

    .line 141
    new-instance v2, Lexpo/modules/notifications/notifications/model/NotificationAction;

    const-string v4, "expo.modules.notifications.actions.DEFAULT"

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5, v3}, Lexpo/modules/notifications/notifications/model/NotificationAction;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 143
    sget-object v4, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    .line 144
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 145
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotification()Lexpo/modules/notifications/notifications/model/Notification;

    move-result-object v6

    .line 143
    invoke-virtual {v4, v5, v6, v2}, Lexpo/modules/notifications/service/NotificationsService$Companion;->createNotificationResponseIntent(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationAction;)Landroid/app/PendingIntent;

    move-result-object v2

    .line 142
    invoke-virtual {p1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 150
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v2

    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->containsImage()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 151
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v2

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object p0

    iput-object p1, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder$build$1;->label:I

    invoke-interface {v2, p0, v0}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getImage(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_7

    return-object v1

    :cond_7
    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    .line 92
    :goto_1
    check-cast p1, Landroid/graphics/Bitmap;

    if-eqz p1, :cond_8

    .line 152
    invoke-virtual {p0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_8
    move-object p1, p0

    goto :goto_2

    .line 154
    :cond_9
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getLargeIcon()Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/core/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    .line 156
    :goto_2
    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final getPriority()I
    .locals 5

    .line 275
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v0

    invoke-interface {v0}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getPriority()Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    move-result-object v0

    .line 277
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationBehavior()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 281
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getPriorityOverride()Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 283
    invoke-virtual {v2}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

    move-result v0

    return v0

    :cond_0
    if-eqz v0, :cond_1

    goto :goto_0

    .line 289
    :cond_1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    :goto_0
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

    move-result v0

    .line 293
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPresentAlert()Z

    move-result v1

    if-eqz v1, :cond_2

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    int-to-double v3, v0

    .line 298
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    :goto_1
    double-to-int v0, v0

    return v0

    :cond_2
    const-wide/16 v1, 0x0

    int-to-double v3, v0

    .line 305
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_4

    .line 312
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

    move-result v0

    return v0

    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private final shouldPlaySound()Z
    .locals 4

    .line 232
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationBehavior()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPlaySound()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 234
    :goto_0
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v2

    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getShouldPlayDefaultSound()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v2

    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getSoundName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v1

    :goto_2
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    return v1

    :cond_3
    return v3
.end method

.method private final shouldVibrate()Z
    .locals 4

    .line 250
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationBehavior()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPlaySound()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 253
    :goto_0
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v2

    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getShouldUseDefaultVibrationPattern()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v2

    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getVibrationPattern()[J

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v1

    :goto_2
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    return v1

    :cond_3
    return v3
.end method


# virtual methods
.method public addActionsToBuilder(Landroidx/core/app/NotificationCompat$Builder;Ljava/lang/String;)V
    .locals 7

    const-string v0, "format(...)"

    const-string v1, "Could not read category with identifier: %s. %s"

    const-string v2, "expo-notifications"

    const-string v3, "builder"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "categoryIdentifier"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x2

    .line 45
    :try_start_0
    iget-object v5, p0, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->store:Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;

    invoke-virtual {v5, p2}, Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;->getNotificationCategory(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationCategory;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 47
    invoke-virtual {v5}, Lexpo/modules/notifications/notifications/model/NotificationCategory;->getActions()Ljava/util/List;

    move-result-object v5

    const-string v6, "getActions(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v5

    goto :goto_0

    :catch_0
    move-exception v5

    .line 61
    sget-object v6, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 64
    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    filled-new-array {p2, v5}, [Ljava/lang/Object;

    move-result-object p2

    .line 61
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-static {v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception v5

    .line 52
    sget-object v6, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 55
    invoke-virtual {v5}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v5

    filled-new-array {p2, v5}, [Ljava/lang/Object;

    move-result-object p2

    .line 52
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-static {v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/model/NotificationAction;

    .line 69
    instance-of v1, v0, Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;

    if-eqz v1, :cond_1

    .line 70
    check-cast v0, Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;

    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->buildTextInputAction(Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->buildButtonAction(Lexpo/modules/notifications/notifications/model/NotificationAction;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public build(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/app/Notification;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->build$suspendImpl(Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final buildButtonAction(Lexpo/modules/notifications/notifications/model/NotificationAction;)Landroidx/core/app/NotificationCompat$Action;
    .locals 3

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotification()Lexpo/modules/notifications/notifications/model/Notification;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lexpo/modules/notifications/service/NotificationsService$Companion;->createNotificationResponseIntent(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationAction;)Landroid/app/PendingIntent;

    move-result-object v0

    .line 79
    new-instance v1, Landroidx/core/app/NotificationCompat$Action$Builder;

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getIcon()I

    move-result v2

    invoke-virtual {p1}, Lexpo/modules/notifications/notifications/model/NotificationAction;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-direct {v1, v2, p1, v0}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v1}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected final buildTextInputAction(Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;)Landroidx/core/app/NotificationCompat$Action;
    .locals 5

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotification()Lexpo/modules/notifications/notifications/model/Notification;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lexpo/modules/notifications/notifications/model/NotificationAction;

    invoke-virtual {v0, v1, v2, v3}, Lexpo/modules/notifications/service/NotificationsService$Companion;->createNotificationResponseIntent(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationAction;)Landroid/app/PendingIntent;

    move-result-object v0

    .line 84
    new-instance v1, Landroidx/core/app/RemoteInput$Builder;

    const-string v2, "userTextResponse"

    invoke-direct {v1, v2}, Landroidx/core/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p1}, Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;->getPlaceholder()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/core/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroidx/core/app/RemoteInput$Builder;

    move-result-object v1

    .line 86
    invoke-virtual {v1}, Landroidx/core/app/RemoteInput$Builder;->build()Landroidx/core/app/RemoteInput;

    move-result-object v1

    const-string v2, "build(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    new-instance v3, Landroidx/core/app/NotificationCompat$Action$Builder;

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getIcon()I

    move-result v4

    invoke-virtual {p1}, Lexpo/modules/notifications/notifications/model/TextInputNotificationAction;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-direct {v3, v4, p1, v0}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 89
    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Action$Builder;->addRemoteInput(Landroidx/core/app/RemoteInput;)Landroidx/core/app/NotificationCompat$Action$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected getColor()Ljava/lang/Number;
    .locals 5

    .line 374
    const-string v0, "expo.modules.notifications.default_notification_color"

    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    move-result-object v1

    invoke-interface {v1}, Lexpo/modules/notifications/notifications/interfaces/INotificationContent;->getColor()Ljava/lang/Number;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v1, p0

    check-cast v1, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;

    const/4 v1, 0x0

    .line 376
    :try_start_0
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 377
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x80

    .line 376
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    const-string v3, "getApplicationInfo(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 381
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 382
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 381
    invoke-virtual {v3, v0, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 389
    const-string v2, "Could not have fetched default notification color."

    .line 390
    check-cast v0, Ljava/lang/Throwable;

    .line 387
    const-string v3, "expo-notifications"

    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-object v1
.end method

.method protected getIcon()I
    .locals 4

    .line 350
    const-string v0, "expo.modules.notifications.default_notification_icon"

    .line 351
    :try_start_0
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 352
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    .line 351
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    const-string v2, "getApplicationInfo(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 356
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 359
    const-string v1, "Could not have fetched default notification icon."

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, "expo-notifications"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 361
    :cond_0
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    return v0
.end method

.method protected final getLargeIcon()Landroid/graphics/Bitmap;
    .locals 4

    .line 327
    const-string v0, "expo.modules.notifications.large_notification_icon"

    .line 328
    :try_start_0
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 329
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    .line 328
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    const-string v2, "getApplicationInfo(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 333
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 334
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/ExpoNotificationBuilder;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 337
    const-string v1, "Could not have fetched large notification icon."

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, "expo-notifications"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final marshallNotificationRequest(Lexpo/modules/notifications/notifications/model/NotificationRequest;)[B
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const-string v1, "obtain(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 204
    invoke-virtual {p1, v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationRequest;->writeToParcel(Landroid/os/Parcel;I)V

    .line 205
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    move-result-object v1

    .line 206
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 213
    invoke-virtual {p1}, Lexpo/modules/notifications/notifications/model/NotificationRequest;->getIdentifier()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not marshalled notification request: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 214
    check-cast v0, Ljava/lang/Throwable;

    .line 211
    const-string v1, "expo-notifications"

    invoke-static {v1, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

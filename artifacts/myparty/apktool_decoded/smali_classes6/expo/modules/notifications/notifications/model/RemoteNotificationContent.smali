.class public final Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;
.super Ljava/lang/Object;
.source "RemoteNotificationContent.kt"

# interfaces
.implements Lexpo/modules/notifications/notifications/interfaces/INotificationContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRemoteNotificationContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteNotificationContent.kt\nexpo/modules/notifications/notifications/model/RemoteNotificationContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0016\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0004\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010<\u001a\u000208H\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u000208H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010!X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010%X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010-8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u0014\u00100\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u001bR\u0011\u00101\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010\u001bR\u0016\u00102\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010\u0016R\u0014\u00104\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u001bR\u0016\u00105\u001a\u0004\u0018\u00010\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010\u0016R\u0018\u00107\u001a\u0004\u0018\u000108X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u00089\u0010:\u00a8\u0006B"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;",
        "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "remoteMessage",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "<init>",
        "(Lcom/google/firebase/messaging/RemoteMessage;)V",
        "parcel",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "notificationData",
        "Lexpo/modules/notifications/notifications/model/NotificationData;",
        "Ljava/util/Map;",
        "getImage",
        "Landroid/graphics/Bitmap;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "containsImage",
        "",
        "title",
        "",
        "getTitle",
        "()Ljava/lang/String;",
        "text",
        "getText",
        "shouldPlayDefaultSound",
        "getShouldPlayDefaultSound",
        "()Z",
        "soundName",
        "getSoundName",
        "shouldUseDefaultVibrationPattern",
        "getShouldUseDefaultVibrationPattern",
        "vibrationPattern",
        "",
        "getVibrationPattern",
        "()[J",
        "body",
        "Lorg/json/JSONObject;",
        "getBody",
        "()Lorg/json/JSONObject;",
        "priority",
        "Lexpo/modules/notifications/notifications/enums/NotificationPriority;",
        "getPriority",
        "()Lexpo/modules/notifications/notifications/enums/NotificationPriority;",
        "color",
        "",
        "getColor",
        "()Ljava/lang/Number;",
        "isAutoDismiss",
        "isDataOnly",
        "categoryId",
        "getCategoryId",
        "isSticky",
        "subText",
        "getSubText",
        "badgeCount",
        "",
        "getBadgeCount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "describeContents",
        "writeToParcel",
        "",
        "dest",
        "flags",
        "CREATOR",
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
.field public static final CREATOR:Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;


# instance fields
.field private final badgeCount:Ljava/lang/Integer;

.field private final body:Lorg/json/JSONObject;

.field private final categoryId:Ljava/lang/String;

.field private final isAutoDismiss:Z

.field private final isDataOnly:Z

.field private final isSticky:Z

.field private final notificationData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

.field private final shouldPlayDefaultSound:Z

.field private final soundName:Ljava/lang/String;

.field private final subText:Ljava/lang/String;

.field private final text:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final vibrationPattern:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->CREATOR:Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const-class v0, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-direct {p0, p1}, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;-><init>(Lcom/google/firebase/messaging/RemoteMessage;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 4

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 23
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "getData(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->constructor-impl(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->notificationData:Ljava/util/Map;

    .line 34
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getTitle-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->title:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getBody()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getMessage-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->text:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getSound()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_5

    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getShouldPlayDefaultSound-impl(Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v2

    goto :goto_1

    :cond_5
    move v1, v3

    :goto_1
    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->shouldPlayDefaultSound:Z

    .line 40
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getSound()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getSound-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_7
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->soundName:Ljava/lang/String;

    .line 45
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getVibrateTimings()[J

    move-result-object v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getVibrationPattern-impl(Ljava/util/Map;)[J

    move-result-object v1

    :cond_9
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->vibrationPattern:[J

    .line 47
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getBody-impl(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->body:Lorg/json/JSONObject;

    .line 64
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getAutoDismiss-impl(Ljava/util/Map;)Z

    move-result v1

    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isAutoDismiss:Z

    .line 66
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    move v2, v3

    :goto_2
    iput-boolean v2, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isDataOnly:Z

    .line 68
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getCategoryId-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->categoryId:Ljava/lang/String;

    .line 70
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->isSticky-impl(Ljava/util/Map;)Z

    move-result p1

    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isSticky:Z

    .line 72
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getSubText-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->subText:Ljava/lang/String;

    .line 74
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getBadge-impl(Ljava/util/Map;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->badgeCount:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public containsImage()Z
    .locals 1

    .line 31
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getImageUrl()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBadgeCount()Ljava/lang/Integer;
    .locals 1

    .line 74
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->badgeCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public bridge synthetic getBadgeCount()Ljava/lang/Number;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->getBadgeCount()Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    return-object v0
.end method

.method public getBody()Lorg/json/JSONObject;
    .locals 1

    .line 47
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->body:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getCategoryId()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->categoryId:Ljava/lang/String;

    return-object v0
.end method

.method public getColor()Ljava/lang/Number;
    .locals 1

    .line 57
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getColor()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->notificationData:Ljava/util/Map;

    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getColor-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_2

    .line 58
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljava/lang/Number;

    return-object v0
.end method

.method public getImage(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 26
    iget-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getImageUrl()Landroid/net/Uri;

    move-result-object p1

    move-object v1, p1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_2

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v6, p2

    .line 27
    invoke-static/range {v1 .. v8}, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt;->downloadImage$default(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1

    :cond_2
    return-object v0
.end method

.method public getPriority()Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 2

    .line 50
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->getPriority()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 51
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->HIGH:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    return-object v0

    .line 52
    :cond_0
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    return-object v0
.end method

.method public getShouldPlayDefaultSound()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->shouldPlayDefaultSound:Z

    return v0
.end method

.method public getShouldUseDefaultVibrationPattern()Z
    .locals 1

    .line 43
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getDefaultVibrateSettings()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->notificationData:Ljava/util/Map;

    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getShouldUseDefaultVibrationPattern-impl(Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method public getSoundName()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->soundName:Ljava/lang/String;

    return-object v0
.end method

.method public getSubText()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->subText:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getVibrationPattern()[J
    .locals 1

    .line 45
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->vibrationPattern:[J

    return-object v0
.end method

.method public isAutoDismiss()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isAutoDismiss:Z

    return v0
.end method

.method public final isDataOnly()Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isDataOnly:Z

    return v0
.end method

.method public isSticky()Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isSticky:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

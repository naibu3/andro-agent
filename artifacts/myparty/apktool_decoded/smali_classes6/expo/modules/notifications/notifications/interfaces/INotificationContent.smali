.class public interface abstract Lexpo/modules/notifications/notifications/interfaces/INotificationContent;
.super Ljava/lang/Object;
.source "INotificationContent.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0004\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0016\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010(\u001a\u00020\u000fH&J\u0018\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u00a6@\u00a2\u0006\u0002\u0010-R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\rR\u0012\u0010$\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0011R\u0014\u0010%\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\u0005R\u0012\u0010\'\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u0011\u00a8\u0006."
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "Landroid/os/Parcelable;",
        "title",
        "",
        "getTitle",
        "()Ljava/lang/String;",
        "text",
        "getText",
        "subText",
        "getSubText",
        "badgeCount",
        "",
        "getBadgeCount",
        "()Ljava/lang/Number;",
        "shouldPlayDefaultSound",
        "",
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
        "getColor",
        "isAutoDismiss",
        "categoryId",
        "getCategoryId",
        "isSticky",
        "containsImage",
        "getImage",
        "Landroid/graphics/Bitmap;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# virtual methods
.method public abstract containsImage()Z
.end method

.method public abstract getBadgeCount()Ljava/lang/Number;
.end method

.method public abstract getBody()Lorg/json/JSONObject;
.end method

.method public abstract getCategoryId()Ljava/lang/String;
.end method

.method public abstract getColor()Ljava/lang/Number;
.end method

.method public abstract getImage(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
.end method

.method public abstract getPriority()Lexpo/modules/notifications/notifications/enums/NotificationPriority;
.end method

.method public abstract getShouldPlayDefaultSound()Z
.end method

.method public abstract getShouldUseDefaultVibrationPattern()Z
.end method

.method public abstract getSoundName()Ljava/lang/String;
.end method

.method public abstract getSubText()Ljava/lang/String;
.end method

.method public abstract getText()Ljava/lang/String;
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getVibrationPattern()[J
.end method

.method public abstract isAutoDismiss()Z
.end method

.method public abstract isSticky()Z
.end method

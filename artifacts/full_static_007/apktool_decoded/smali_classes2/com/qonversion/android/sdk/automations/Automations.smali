.class public interface abstract Lcom/qonversion/android/sdk/automations/Automations;
.super Ljava/lang/Object;
.source "Automations.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/Automations$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J,\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\'J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/Automations;",
        "",
        "getNotificationCustomPayload",
        "",
        "",
        "messageData",
        "handleNotification",
        "",
        "setDelegate",
        "",
        "delegate",
        "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
        "setNotificationsToken",
        "token",
        "setScreenCustomizationDelegate",
        "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
        "showScreen",
        "withID",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations$Companion;->$$INSTANCE:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    sput-object v0, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    return-void
.end method

.method public static getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations;->Companion:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/Automations$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getNotificationCustomPayload(Ljava/util/Map;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract handleNotification(Ljava/util/Map;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Consider removing this method. Qonversion is not working with push notifications anymore"
    .end annotation
.end method

.method public abstract setDelegate(Lcom/qonversion/android/sdk/automations/AutomationsDelegate;)V
.end method

.method public abstract setNotificationsToken(Ljava/lang/String;)V
    .annotation runtime Lkotlin/Deprecated;
        message = "Consider removing this method as it isn\'t needed anymore"
    .end annotation
.end method

.method public abstract setScreenCustomizationDelegate(Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;)V
.end method

.method public abstract showScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
.end method

.class public Lexpo/modules/notifications/service/NotificationsService;
.super Landroid/content/BroadcastReceiver;
.source "NotificationsService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/service/NotificationsService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsService.kt\nexpo/modules/notifications/service/NotificationsService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,811:1\n1#2:812\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a8\u0006&"
    }
    d2 = {
        "Lexpo/modules/notifications/service/NotificationsService;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "getPresentationDelegate",
        "Lexpo/modules/notifications/service/interfaces/PresentationDelegate;",
        "context",
        "Landroid/content/Context;",
        "getHandlingDelegate",
        "Lexpo/modules/notifications/service/interfaces/HandlingDelegate;",
        "getCategoriesDelegate",
        "Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;",
        "getSchedulingDelegate",
        "Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;",
        "onReceive",
        "",
        "intent",
        "Landroid/content/Intent;",
        "handleIntent",
        "onPresentNotification",
        "onGetAllPresentedNotifications",
        "Landroid/os/Bundle;",
        "onDismissNotifications",
        "onDismissAllNotifications",
        "onReceiveNotification",
        "onReceiveNotificationResponse",
        "onNotificationsDropped",
        "onGetCategories",
        "onSetCategory",
        "onDeleteCategory",
        "onGetAllScheduledNotifications",
        "onGetScheduledNotification",
        "onScheduleNotification",
        "onNotificationTriggered",
        "onRemoveScheduledNotifications",
        "onRemoveAllScheduledNotifications",
        "onSetupScheduledNotifications",
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
.field public static final Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

.field private static final DELETE_CATEGORY_TYPE:Ljava/lang/String; = "deleteCategory"

.field private static final DISMISS_ALL_TYPE:Ljava/lang/String; = "dismissAll"

.field private static final DISMISS_SELECTED_TYPE:Ljava/lang/String; = "dismissSelected"

.field private static final DROPPED_TYPE:Ljava/lang/String; = "dropped"

.field public static final ERROR_CODE:I = 0x1

.field public static final EVENT_TYPE_KEY:Ljava/lang/String; = "type"

.field public static final EXCEPTION_KEY:Ljava/lang/String; = "exception"

.field private static final GET_ALL_DISPLAYED_TYPE:Ljava/lang/String; = "getAllDisplayed"

.field private static final GET_ALL_SCHEDULED_TYPE:Ljava/lang/String; = "getAllScheduled"

.field private static final GET_CATEGORIES_TYPE:Ljava/lang/String; = "getCategories"

.field private static final GET_SCHEDULED_TYPE:Ljava/lang/String; = "getScheduled"

.field public static final IDENTIFIERS_KEY:Ljava/lang/String; = "identifiers"

.field public static final IDENTIFIER_KEY:Ljava/lang/String; = "identifier"

.field public static final NOTIFICATIONS_KEY:Ljava/lang/String; = "notifications"

.field public static final NOTIFICATION_ACTION_KEY:Ljava/lang/String; = "notificationAction"

.field public static final NOTIFICATION_BEHAVIOR_KEY:Ljava/lang/String; = "notificationBehavior"

.field public static final NOTIFICATION_CATEGORIES_KEY:Ljava/lang/String; = "notificationCategories"

.field public static final NOTIFICATION_CATEGORY_KEY:Ljava/lang/String; = "notificationCategory"

.field public static final NOTIFICATION_EVENT_ACTION:Ljava/lang/String; = "expo.modules.notifications.NOTIFICATION_EVENT"

.field public static final NOTIFICATION_KEY:Ljava/lang/String; = "notification"

.field public static final NOTIFICATION_REQUESTS_KEY:Ljava/lang/String; = "notificationRequests"

.field public static final NOTIFICATION_REQUEST_KEY:Ljava/lang/String; = "notificationRequest"

.field public static final NOTIFICATION_RESPONSE_KEY:Ljava/lang/String; = "notificationResponse"

.field private static final PRESENT_TYPE:Ljava/lang/String; = "present"

.field public static final RECEIVER_KEY:Ljava/lang/String; = "receiver"

.field private static final RECEIVE_RESPONSE_TYPE:Ljava/lang/String; = "receiveResponse"

.field private static final RECEIVE_TYPE:Ljava/lang/String; = "receive"

.field private static final REMOVE_ALL_TYPE:Ljava/lang/String; = "removeAll"

.field private static final REMOVE_SELECTED_TYPE:Ljava/lang/String; = "removeSelected"

.field private static final SCHEDULE_TYPE:Ljava/lang/String; = "schedule"

.field private static final SETUP_ACTIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final SET_CATEGORY_TYPE:Ljava/lang/String; = "setCategory"

.field public static final SUCCEEDED_KEY:Ljava/lang/String; = "succeeded"

.field public static final SUCCESS_CODE:I = 0x0

.field public static final TEXT_INPUT_NOTIFICATION_RESPONSE_KEY:Ljava/lang/String; = "textInputNotificationResponse"

.field private static final TRIGGER_TYPE:Ljava/lang/String; = "trigger"

.field public static final USER_TEXT_RESPONSE_KEY:Ljava/lang/String; = "userTextResponse"


# direct methods
.method public static synthetic $r8$lambda$CMnNfXUcSUZ_zgLCPabTmop83Qw(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lexpo/modules/notifications/service/NotificationsService;->onReceive$lambda$1(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lexpo/modules/notifications/service/NotificationsService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/notifications/service/NotificationsService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    const/4 v0, 0x5

    .line 34
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android.intent.action.BOOT_COMPLETED"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 35
    const-string v2, "android.intent.action.REBOOT"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 36
    const-string v2, "android.intent.action.MY_PACKAGE_REPLACED"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 37
    const-string v2, "android.intent.action.QUICKBOOT_POWERON"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 38
    const-string v2, "com.htc.intent.action.QUICKBOOT_POWERON"

    aput-object v2, v0, v1

    .line 33
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lexpo/modules/notifications/service/NotificationsService;->SETUP_ACTIONS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static final synthetic access$getSETUP_ACTIONS$cp()Ljava/util/List;
    .locals 1

    .line 30
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->SETUP_ACTIONS:Ljava/util/List;

    return-object v0
.end method

.method private static final onReceive$lambda$1(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Lkotlin/Unit;
    .locals 0

    if-eqz p0, :cond_0

    .line 614
    :try_start_0
    invoke-virtual {p2, p3, p0}, Lexpo/modules/notifications/service/NotificationsService;->handleIntent(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 616
    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    throw p0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 618
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method protected getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 600
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoCategoriesDelegate;

    invoke-direct {v0, p1}, Lexpo/modules/notifications/service/delegates/ExpoCategoriesDelegate;-><init>(Landroid/content/Context;)V

    check-cast v0, Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;

    return-object v0
.end method

.method protected getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoHandlingDelegate;

    invoke-direct {v0, p1}, Lexpo/modules/notifications/service/delegates/ExpoHandlingDelegate;-><init>(Landroid/content/Context;)V

    check-cast v0, Lexpo/modules/notifications/service/interfaces/HandlingDelegate;

    return-object v0
.end method

.method protected getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 594
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p1, v1, v2, v1}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;-><init>(Landroid/content/Context;Landroidx/core/app/NotificationManagerCompat;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    return-object v0
.end method

.method protected getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 603
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoSchedulingDelegate;

    invoke-direct {v0, p1}, Lexpo/modules/notifications/service/delegates/ExpoSchedulingDelegate;-><init>(Landroid/content/Context;)V

    check-cast v0, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    return-object v0
.end method

.method public handleIntent(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    const-string v0, "Received event of unrecognized type: "

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "intent"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 622
    sget-object v1, Lexpo/modules/notifications/service/NotificationsService;->SETUP_ACTIONS:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 623
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onSetupScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    .line 624
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "expo.modules.notifications.NOTIFICATION_EVENT"

    const-string v3, ". Ignoring."

    if-ne v1, v2, :cond_6

    .line 625
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v4, "receiver"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    instance-of v4, v1, Landroid/os/ResultReceiver;

    if-eqz v4, :cond_2

    check-cast v1, Landroid/os/ResultReceiver;

    goto :goto_1

    :cond_2
    move-object v1, v2

    .line 628
    :goto_1
    :try_start_0
    const-string v4, "type"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v2, "setCategory"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 648
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onSetCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v2

    goto/16 :goto_2

    .line 628
    :sswitch_1
    const-string v5, "dropped"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 636
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onNotificationsDropped(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_2

    .line 628
    :sswitch_2
    const-string v5, "removeAll"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 663
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onRemoveAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_2

    .line 628
    :sswitch_3
    const-string v5, "receive"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 632
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onReceiveNotification(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_2

    .line 628
    :sswitch_4
    const-string v2, "getCategories"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 645
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetCategories(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v2

    goto/16 :goto_2

    .line 628
    :sswitch_5
    const-string v5, "dismissAll"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 642
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onDismissAllNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_2

    .line 628
    :sswitch_6
    const-string v2, "getScheduled"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 657
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetScheduledNotification(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v2

    goto/16 :goto_2

    .line 628
    :sswitch_7
    const-string v5, "present"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 638
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onPresentNotification(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_2

    .line 628
    :sswitch_8
    const-string v5, "removeSelected"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 661
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onRemoveScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_2

    .line 628
    :sswitch_9
    const-string v5, "dismissSelected"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 640
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onDismissNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_2

    .line 628
    :sswitch_a
    const-string v5, "schedule"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 659
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onScheduleNotification(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_2

    .line 628
    :sswitch_b
    const-string v5, "trigger"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 665
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onNotificationTriggered(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_2

    .line 628
    :sswitch_c
    const-string v2, "getAllDisplayed"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 630
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetAllPresentedNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_2

    .line 628
    :sswitch_d
    const-string v2, "getAllScheduled"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 654
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_2

    .line 628
    :sswitch_e
    const-string v2, "deleteCategory"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 651
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onDeleteCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_2

    .line 628
    :sswitch_f
    const-string v5, "receiveResponse"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 634
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onReceiveNotificationResponse(Landroid/content/Context;Landroid/content/Intent;)V

    :goto_2
    if-eqz v1, :cond_3

    const/4 p1, 0x0

    .line 671
    invoke-virtual {v1, p1, v2}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    return-void

    .line 667
    :cond_4
    :goto_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 677
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Action "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, " failed: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "expo-notifications"

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 679
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    if-eqz v1, :cond_5

    .line 681
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "exception"

    check-cast p1, Ljava/io/Serializable;

    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 p1, 0x1

    invoke-virtual {v1, p1, p2}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_5
    return-void

    .line 684
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Received intent of unrecognized action: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x7fcfa7bc -> :sswitch_f
        -0x775b3437 -> :sswitch_e
        -0x6768c17e -> :sswitch_d
        -0x4f12854a -> :sswitch_c
        -0x3f2caa48 -> :sswitch_b
        -0x29996d69 -> :sswitch_a
        -0x226a20bb -> :sswitch_9
        -0x180374c1 -> :sswitch_8
        -0x12f88745 -> :sswitch_7
        -0xa26ce09 -> :sswitch_6
        0x26a6cab7 -> :sswitch_5
        0x3b87fe12 -> :sswitch_4
        0x408272e3 -> :sswitch_3
        0x4c6f0a7d -> :sswitch_2
        0x72c867c0 -> :sswitch_1
        0x79955b80 -> :sswitch_0
    .end sparse-switch
.end method

.method public onDeleteCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 756
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 759
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;

    move-result-object p1

    .line 760
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v1, "identifier"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 759
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;->deleteCategory(Ljava/lang/String;)Z

    move-result p1

    .line 757
    const-string p2, "succeeded"

    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public onDismissAllNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 712
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->dismissAllNotifications()V

    return-void
.end method

.method public onDismissNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 707
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    move-result-object p1

    .line 708
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "identifiers"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/collections/ArraysKt;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    .line 707
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->dismissNotifications(Ljava/util/Collection;)V

    return-void
.end method

.method public onGetAllPresentedNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 697
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 700
    new-instance v0, Ljava/util/ArrayList;

    .line 701
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->getAllPresentedNotifications()Ljava/util/Collection;

    move-result-object p1

    .line 700
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 698
    const-string p1, "notifications"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p2
.end method

.method public onGetAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 769
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 772
    new-instance v0, Ljava/util/ArrayList;

    .line 773
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->getAllScheduledNotifications()Ljava/util/Collection;

    move-result-object p1

    .line 772
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 770
    const-string p1, "notificationRequests"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p2
.end method

.method public onGetCategories(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 736
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 739
    new-instance v0, Ljava/util/ArrayList;

    .line 740
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;->getCategories()Ljava/util/Collection;

    move-result-object p1

    .line 739
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 737
    const-string p1, "notificationCategories"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p2
.end method

.method public onGetScheduledNotification(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 779
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 782
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    move-result-object p1

    .line 783
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v1, "identifier"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 782
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->getScheduledNotification(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationRequest;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    .line 780
    const-string p2, "notificationRequest"

    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object v0
.end method

.method public onNotificationTriggered(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 794
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    move-result-object p1

    .line 795
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "identifier"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 794
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->triggerNotification(Ljava/lang/String;)V

    return-void
.end method

.method public onNotificationsDropped(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 729
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/HandlingDelegate;->handleNotificationsDropped()V

    return-void
.end method

.method public onPresentNotification(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 691
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    move-result-object p1

    .line 692
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "notification"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lexpo/modules/notifications/notifications/model/Notification;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 693
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v1, "notificationBehavior"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 691
    :cond_1
    invoke-interface {p1, v0, v1}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->presentNotification(Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 611
    invoke-virtual {p0}, Lexpo/modules/notifications/service/NotificationsService;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v0

    .line 612
    new-instance v6, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;

    invoke-direct {v6, p2, v0, p0, p1}, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;-><init>(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)V

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->thread$default(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void
.end method

.method public onReceiveNotification(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 719
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;

    move-result-object p1

    .line 720
    const-string v0, "notification"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Lexpo/modules/notifications/notifications/model/Notification;

    .line 719
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/HandlingDelegate;->handleNotification(Lexpo/modules/notifications/notifications/model/Notification;)V

    return-void
.end method

.method public onReceiveNotificationResponse(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 724
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    invoke-virtual {v0, p2}, Lexpo/modules/notifications/service/NotificationsService$Companion;->getNotificationResponseFromBroadcastIntent(Landroid/content/Intent;)Lexpo/modules/notifications/notifications/model/NotificationResponse;

    move-result-object p2

    .line 725
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;

    move-result-object p1

    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/HandlingDelegate;->handleNotificationResponse(Lexpo/modules/notifications/notifications/model/NotificationResponse;)V

    return-void
.end method

.method public onRemoveAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 804
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->removeAllScheduledNotifications()V

    return-void
.end method

.method public onRemoveScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 799
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    move-result-object p1

    .line 800
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "identifiers"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/collections/ArraysKt;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    .line 799
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->removeScheduledNotifications(Ljava/util/Collection;)V

    return-void
.end method

.method public onScheduleNotification(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 789
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    move-result-object p1

    .line 790
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "notificationRequest"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lexpo/modules/notifications/notifications/model/NotificationRequest;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 789
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->scheduleNotification(Lexpo/modules/notifications/notifications/model/NotificationRequest;)V

    return-void
.end method

.method public onSetCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 746
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 749
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;

    move-result-object p1

    .line 750
    const-string v1, "notificationCategory"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Lexpo/modules/notifications/notifications/model/NotificationCategory;

    .line 749
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;->setCategory(Lexpo/modules/notifications/notifications/model/NotificationCategory;)Lexpo/modules/notifications/notifications/model/NotificationCategory;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    .line 747
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object v0
.end method

.method public onSetupScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 807
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    move-result-object p1

    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->setupScheduledNotifications()V

    return-void
.end method

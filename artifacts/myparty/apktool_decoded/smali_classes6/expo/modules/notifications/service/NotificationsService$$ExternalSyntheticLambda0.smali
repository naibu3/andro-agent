.class public final synthetic Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroid/content/Intent;

.field public final synthetic f$1:Landroid/content/BroadcastReceiver$PendingResult;

.field public final synthetic f$2:Lexpo/modules/notifications/service/NotificationsService;

.field public final synthetic f$3:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$0:Landroid/content/Intent;

    iput-object p2, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$1:Landroid/content/BroadcastReceiver$PendingResult;

    iput-object p3, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$2:Lexpo/modules/notifications/service/NotificationsService;

    iput-object p4, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$3:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$0:Landroid/content/Intent;

    iget-object v1, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$1:Landroid/content/BroadcastReceiver$PendingResult;

    iget-object v2, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$2:Lexpo/modules/notifications/service/NotificationsService;

    iget-object v3, p0, Lexpo/modules/notifications/service/NotificationsService$$ExternalSyntheticLambda0;->f$3:Landroid/content/Context;

    invoke-static {v0, v1, v2, v3}, Lexpo/modules/notifications/service/NotificationsService;->$r8$lambda$CMnNfXUcSUZ_zgLCPabTmop83Qw(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

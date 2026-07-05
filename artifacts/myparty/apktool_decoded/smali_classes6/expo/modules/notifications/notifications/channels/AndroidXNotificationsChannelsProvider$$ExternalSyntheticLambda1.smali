.class public final synthetic Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1;->f$1:Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1;->f$1:Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;

    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;->$r8$lambda$yEUyhwsWks0zK63KH9NsD2vNz4E(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;)Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;

    move-result-object v0

    return-object v0
.end method

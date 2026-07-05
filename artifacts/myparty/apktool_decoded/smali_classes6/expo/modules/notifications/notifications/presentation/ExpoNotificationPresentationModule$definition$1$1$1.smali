.class final Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule$definition$1$1$1;
.super Ljava/lang/Object;
.source "ExpoNotificationPresentationModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Landroid/os/Bundle;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic this$0:Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/Promise;Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule$definition$1$1$1;->$promise:Lexpo/modules/kotlin/Promise;

    iput-object p2, p0, Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule$definition$1$1$1;->this$0:Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule$definition$1$1$1;->invoke(ILandroid/os/Bundle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(ILandroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 32
    const-string v1, "notifications"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez p1, :cond_1

    if-eqz v1, :cond_1

    .line 34
    iget-object p1, p0, Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule$definition$1$1$1;->$promise:Lexpo/modules/kotlin/Promise;

    iget-object p2, p0, Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule$definition$1$1$1;->this$0:Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p2, v1}, Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;->serializeNotifications(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/util/Collection;)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    .line 36
    const-string p1, "exception"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    instance-of p2, p1, Ljava/lang/Exception;

    if-eqz p2, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/lang/Exception;

    .line 37
    :cond_3
    iget-object p1, p0, Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule$definition$1$1$1;->$promise:Lexpo/modules/kotlin/Promise;

    const-string p2, "A list of displayed notifications could not be fetched."

    check-cast v0, Ljava/lang/Throwable;

    const-string v1, "ERR_NOTIFICATIONS_FETCH_FAILED"

    invoke-interface {p1, v1, p2, v0}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.class public final synthetic Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lexpo/modules/kotlin/Promise;

.field public final synthetic f$1:Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/Promise;Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule$$ExternalSyntheticLambda1;->f$0:Lexpo/modules/kotlin/Promise;

    iput-object p2, p0, Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule$$ExternalSyntheticLambda1;->f$1:Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule$$ExternalSyntheticLambda1;->f$0:Lexpo/modules/kotlin/Promise;

    iget-object v1, p0, Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule$$ExternalSyntheticLambda1;->f$1:Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, v1, p1, p2}, Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;->$r8$lambda$0LWd2qJu4IOc-_xrBCBSsq0mhaQ(Lexpo/modules/kotlin/Promise;Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;ILandroid/os/Bundle;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

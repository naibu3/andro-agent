.class public final synthetic Lexpo/modules/notifications/notifications/scheduling/NotificationScheduler$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lexpo/modules/kotlin/Promise;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/Promise;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/notifications/scheduling/NotificationScheduler$$ExternalSyntheticLambda0;->f$0:Lexpo/modules/kotlin/Promise;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/scheduling/NotificationScheduler$$ExternalSyntheticLambda0;->f$0:Lexpo/modules/kotlin/Promise;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, p1, p2}, Lexpo/modules/notifications/notifications/scheduling/NotificationScheduler;->$r8$lambda$sNIvh5533GjyJGwzpK7jNMc7Fdk(Lexpo/modules/kotlin/Promise;ILandroid/os/Bundle;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

.class public final Lcom/stripe/android/link/LinkDismissalCoordinatorKt;
.super Ljava/lang/Object;
.source "LinkDismissalCoordinator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a)\u0010\u0000\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00010\u0004H\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "withDismissalDisabled",
        "R",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "action",
        "Lkotlin/Function0;",
        "(Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final withDismissalDisabled(Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            "Lkotlin/jvm/functions/Function0<",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-interface {p0}, Lcom/stripe/android/link/LinkDismissalCoordinator;->getCanDismiss()Z

    move-result v0

    const/4 v1, 0x0

    .line 21
    invoke-interface {p0, v1}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 23
    :try_start_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-interface {p0, v0}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p0, v0}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    throw p1
.end method

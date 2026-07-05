.class public final Lcom/stripe/android/link/RealLinkDismissalCoordinator;
.super Ljava/lang/Object;
.source "LinkDismissalCoordinator.kt"

# interfaces
.implements Lcom/stripe/android/link/LinkDismissalCoordinator;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/link/RealLinkDismissalCoordinator;",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "<init>",
        "()V",
        "_canDismiss",
        "",
        "canDismiss",
        "getCanDismiss",
        "()Z",
        "setDismissible",
        "",
        "dismissible",
        "paymentsheet_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private _canDismiss:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lcom/stripe/android/link/RealLinkDismissalCoordinator;->_canDismiss:Z

    return-void
.end method


# virtual methods
.method public getCanDismiss()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/stripe/android/link/RealLinkDismissalCoordinator;->_canDismiss:Z

    return v0
.end method

.method public setDismissible(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/stripe/android/link/RealLinkDismissalCoordinator;->_canDismiss:Z

    return-void
.end method

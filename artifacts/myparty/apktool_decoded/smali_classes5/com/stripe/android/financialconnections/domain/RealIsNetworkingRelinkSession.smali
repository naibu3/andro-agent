.class public final Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;
.super Ljava/lang/Object;
.source "IsNetworkingRelinkSession.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;",
        "Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;",
        "pendingRepairRepository",
        "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;)V",
        "invoke",
        "",
        "financial-connections_release"
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
.field private final pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "pendingRepairRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;->pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

    return-void
.end method


# virtual methods
.method public invoke()Z
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;->pendingRepairRepository:Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;->get()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

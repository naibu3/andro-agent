.class public final Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;
.super Lcom/stripe/android/financialconnections/repository/PersistingRepository;
.source "CoreAuthorizationPendingNetworkingRepairRepository.kt"


# annotations
.annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/repository/PersistingRepository<",
        "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;",
        "Lcom/stripe/android/financialconnections/repository/PersistingRepository;",
        "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V",
        "set",
        "",
        "coreAuthorization",
        "",
        "State",
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
.field private final logger:Lcom/stripe/android/core/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/repository/PersistingRepository;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    .line 17
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method


# virtual methods
.method public final set(Ljava/lang/String;)V
    .locals 3

    const-string v0, "coreAuthorization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "core authorization set to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 24
    new-instance v0, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository$State;-><init>(Ljava/lang/String;)V

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;->set(Landroid/os/Parcelable;)V

    return-void
.end method

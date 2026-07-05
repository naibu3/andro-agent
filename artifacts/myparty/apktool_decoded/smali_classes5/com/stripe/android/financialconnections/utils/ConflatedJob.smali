.class public final Lcom/stripe/android/financialconnections/utils/ConflatedJob;
.super Ljava/lang/Object;
.source "ConflatedJob.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\t\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/utils/ConflatedJob;",
        "",
        "<init>",
        "()V",
        "job",
        "Lkotlinx/coroutines/Job;",
        "prevJob",
        "isActive",
        "",
        "()Z",
        "plusAssign",
        "",
        "newJob",
        "cancel",
        "start",
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
.field private job:Lkotlinx/coroutines/Job;

.field private prevJob:Lkotlinx/coroutines/Job;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 24
    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lkotlinx/coroutines/Job;

    iput-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->prevJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final isActive()Z
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized plusAssign(Lkotlinx/coroutines/Job;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "newJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->cancel()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lkotlinx/coroutines/Job;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final start()V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->job:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->start()Z

    :cond_0
    return-void
.end method

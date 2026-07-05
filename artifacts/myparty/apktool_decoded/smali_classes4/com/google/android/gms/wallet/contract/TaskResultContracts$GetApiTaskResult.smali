.class public abstract Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;
.super Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;
.source "com.google.android.gms:play-services-wallet@@19.3.0"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/contract/TaskResultContracts;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "GetApiTaskResult"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult<",
        "TT;",
        "Lcom/google/android/gms/wallet/contract/ApiTaskResult<",
        "TT;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;-><init>()V

    return-void
.end method


# virtual methods
.method protected outputFromTask(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/wallet/contract/ApiTaskResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;)",
            "Lcom/google/android/gms/wallet/contract/ApiTaskResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    .line 4
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x10

    const-string v2, "The task has been canceled."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;->zza:Lcom/google/android/gms/common/api/Status;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    invoke-direct {v0, p1}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    :cond_2
    new-instance p1, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    .line 5
    sget-object v0, Lcom/google/android/gms/common/api/Status;->RESULT_INTERNAL_ERROR:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object p1
.end method

.method protected final bridge synthetic outputFromTask(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;->outputFromTask(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/google/android/gms/wallet/contract/ApiTaskResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/android/gms/wallet/contract/ApiTaskResult<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_0

    .line 4
    new-instance p1, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    .line 5
    sget-object p2, Lcom/google/android/gms/common/api/Status;->RESULT_INTERNAL_ERROR:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v1, p2}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1

    .line 1
    :cond_0
    new-instance p1, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    sget-object p2, Lcom/google/android/gms/common/api/Status;->RESULT_CANCELED:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v1, p2}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1

    :cond_1
    if-eqz p2, :cond_2

    .line 2
    invoke-virtual {p0, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;->taskResultFromIntent(Landroid/content/Intent;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_3

    new-instance p2, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    .line 3
    sget-object v0, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p2

    :cond_3
    new-instance p1, Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    .line 4
    sget-object p2, Lcom/google/android/gms/common/api/Status;->RESULT_INTERNAL_ERROR:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v1, p2}, Lcom/google/android/gms/wallet/contract/ApiTaskResult;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;->parseResult(ILandroid/content/Intent;)Lcom/google/android/gms/wallet/contract/ApiTaskResult;

    move-result-object p1

    return-object p1
.end method

.method protected abstract taskResultFromIntent(Landroid/content/Intent;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")TT;"
        }
    .end annotation
.end method

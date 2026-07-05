.class public final synthetic Lcom/google/mlkit/vision/codescanner/internal/zzb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/vision/codescanner/internal/zze;

.field public final synthetic zzb:J

.field public final synthetic zzc:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/codescanner/internal/zze;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/codescanner/internal/zzb;->zza:Lcom/google/mlkit/vision/codescanner/internal/zze;

    iput-wide p2, p0, Lcom/google/mlkit/vision/codescanner/internal/zzb;->zzb:J

    iput-wide p4, p0, Lcom/google/mlkit/vision/codescanner/internal/zzb;->zzc:J

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zzb;->zza:Lcom/google/mlkit/vision/codescanner/internal/zze;

    iget-wide v2, p0, Lcom/google/mlkit/vision/codescanner/internal/zzb;->zzb:J

    iget-wide v4, p0, Lcom/google/mlkit/vision/codescanner/internal/zzb;->zzc:J

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p1, 0xc9

    :goto_0
    move v1, p1

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/MlKitException;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/MlKitException;

    invoke-virtual {p1}, Lcom/google/mlkit/common/MlKitException;->getErrorCode()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    .line 4
    :goto_1
    invoke-virtual/range {v0 .. v5}, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzb(IJJ)V

    return-void
.end method

.class public final synthetic Lcom/google/mlkit/vision/codescanner/internal/zzd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/vision/codescanner/internal/zze;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/codescanner/internal/zze;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/codescanner/internal/zzd;->zza:Lcom/google/mlkit/vision/codescanner/internal/zze;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zzd;->zza:Lcom/google/mlkit/vision/codescanner/internal/zze;

    check-cast p1, Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;

    invoke-virtual {v0, p1}, Lcom/google/mlkit/vision/codescanner/internal/zze;->zza(Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

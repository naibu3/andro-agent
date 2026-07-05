.class final Lcom/google/android/gms/internal/ads/zzcde;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:I

.field final synthetic zzb:I

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcdi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcdi;II)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzcde;->zza:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzcde;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcde;->zzc:Lcom/google/android/gms/internal/ads/zzcdi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcde;->zzc:Lcom/google/android/gms/internal/ads/zzcdi;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcdi;->zzi(Lcom/google/android/gms/internal/ads/zzcdi;)Lcom/google/android/gms/internal/ads/zzcdj;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcde;->zza:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzcde;->zzb:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcdi;->zzi(Lcom/google/android/gms/internal/ads/zzcdi;)Lcom/google/android/gms/internal/ads/zzcdj;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcdj;->zzj(II)V

    :cond_0
    return-void
.end method

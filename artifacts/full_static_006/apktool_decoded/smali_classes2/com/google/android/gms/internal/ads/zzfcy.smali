.class final Lcom/google/android/gms/internal/ads/zzfcy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzepr;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfcz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfcz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfcy;->zza:Lcom/google/android/gms/internal/ads/zzfcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfcy;->zza:Lcom/google/android/gms/internal/ads/zzfcz;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcy;->zza:Lcom/google/android/gms/internal/ads/zzfcz;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzfcz;->zza:Lcom/google/android/gms/internal/ads/zzcrz;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfcy;->zza:Lcom/google/android/gms/internal/ads/zzfcz;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcrz;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcy;->zza:Lcom/google/android/gms/internal/ads/zzfcz;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzfcz;->zza:Lcom/google/android/gms/internal/ads/zzcrz;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcup;->zzb()V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcy;->zza:Lcom/google/android/gms/internal/ads/zzfcz;

    iput-object p1, v1, Lcom/google/android/gms/internal/ads/zzfcz;->zza:Lcom/google/android/gms/internal/ads/zzcrz;

    .line 3
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzcrz;->zzc(Lcom/google/android/gms/internal/ads/zzbca;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcy;->zza:Lcom/google/android/gms/internal/ads/zzfcz;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfcz;->zzm(Lcom/google/android/gms/internal/ads/zzfcz;)Lcom/google/android/gms/internal/ads/zzfcr;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcsa;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfcz;->zzm(Lcom/google/android/gms/internal/ads/zzfcz;)Lcom/google/android/gms/internal/ads/zzfcr;

    move-result-object v4

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfcz;->zzh(Lcom/google/android/gms/internal/ads/zzfcz;)Lcom/google/android/gms/internal/ads/zzdvc;

    move-result-object v5

    .line 4
    invoke-direct {v3, p1, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzcsa;-><init>(Lcom/google/android/gms/internal/ads/zzcrz;Lcom/google/android/gms/ads/internal/client/zzbu;Lcom/google/android/gms/internal/ads/zzfcr;Lcom/google/android/gms/internal/ads/zzdvc;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfcr;->zzk(Lcom/google/android/gms/internal/ads/zzbcg;)V

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzj()V

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

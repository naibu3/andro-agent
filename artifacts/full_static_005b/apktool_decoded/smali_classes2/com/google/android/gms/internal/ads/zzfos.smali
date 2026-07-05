.class final Lcom/google/android/gms/internal/ads/zzfos;
.super Ljava/util/TimerTask;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field final synthetic zza:Ljava/util/Timer;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfou;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzchs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfou;Lcom/google/android/gms/internal/ads/zzchs;Ljava/util/Timer;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfos;->zzc:Lcom/google/android/gms/internal/ads/zzchs;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfos;->zza:Ljava/util/Timer;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfos;->zzb:Lcom/google/android/gms/internal/ads/zzfou;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfos;->zzb:Lcom/google/android/gms/internal/ads/zzfou;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfou;->zzc(Lcom/google/android/gms/internal/ads/zzfou;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfos;->zzc:Lcom/google/android/gms/internal/ads/zzchs;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzchs;->zza(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfos;->zza:Ljava/util/Timer;

    .line 3
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method

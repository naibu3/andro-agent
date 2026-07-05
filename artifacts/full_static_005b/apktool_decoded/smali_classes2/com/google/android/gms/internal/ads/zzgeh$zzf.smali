.class final Lcom/google/android/gms/internal/ads/zzgeh$zzf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzgeh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzgeh<",
            "TV;>;"
        }
    .end annotation
.end field

.field final zzb:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgeh;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgeh$zzf;->zza:Lcom/google/android/gms/internal/ads/zzgeh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgeh$zzf;->zzb:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgeh$zzf;->zza:Lcom/google/android/gms/internal/ads/zzgeh;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgeh;->zzj(Lcom/google/android/gms/internal/ads/zzgeh;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgeh$zzf;->zzb:Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgeh$zzf;->zza:Lcom/google/android/gms/internal/ads/zzgeh;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgeh;->zzk(Lcom/google/common/util/concurrent/ListenableFuture;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgeh;->zzg()Lcom/google/android/gms/internal/ads/zzgeh$zza;

    move-result-object v2

    .line 3
    invoke-virtual {v2, v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzgeh$zza;->zzf(Lcom/google/android/gms/internal/ads/zzgeh;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgeh$zzf;->zza:Lcom/google/android/gms/internal/ads/zzgeh;

    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgeh;->zzp(Lcom/google/android/gms/internal/ads/zzgeh;Z)V

    :cond_1
    :goto_0
    return-void
.end method

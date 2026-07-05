.class final Lcom/google/android/gms/internal/ads/zzcqo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgfp;


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcqp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcqp;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcqo;->zza:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqo;->zzb:Lcom/google/android/gms/internal/ads/zzcqp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqo;->zzb:Lcom/google/android/gms/internal/ads/zzcqp;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcqp;->zzj(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfia;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcqp;->zzk(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfoa;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcqp;->zzi(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfhf;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcqp;->zzh(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfgt;

    move-result-object v3

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcqp;->zzl(Lcom/google/android/gms/internal/ads/zzcqp;)Ljava/util/List;

    move-result-object v7

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcqo;->zza:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 2
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzfoa;->zzd(Lcom/google/android/gms/internal/ads/zzfhf;Lcom/google/android/gms/internal/ads/zzfgt;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfia;->zza(Ljava/util/List;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqo;->zzb:Lcom/google/android/gms/internal/ads/zzcqp;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcqo;->zza:Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcqp;->zzj(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfia;

    move-result-object p1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcqp;->zzk(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfoa;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcqp;->zzi(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfhf;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcqp;->zzh(Lcom/google/android/gms/internal/ads/zzcqp;)Lcom/google/android/gms/internal/ads/zzfgt;

    move-result-object v3

    const/4 v4, 0x0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcqp;->zzl(Lcom/google/android/gms/internal/ads/zzcqp;)Ljava/util/List;

    move-result-object v7

    .line 3
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzfoa;->zzd(Lcom/google/android/gms/internal/ads/zzfhf;Lcom/google/android/gms/internal/ads/zzfgt;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfia;->zza(Ljava/util/List;)V

    return-void
.end method

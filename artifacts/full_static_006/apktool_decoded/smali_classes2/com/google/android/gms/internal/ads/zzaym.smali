.class final Lcom/google/android/gms/internal/ads/zzaym;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Landroid/app/AppOpsManager$OnOpActiveChangedListener;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzayn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzayn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaym;->zza:Lcom/google/android/gms/internal/ads/zzayn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onOpActiveChanged(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 4

    if-eqz p4, :cond_0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaym;->zza:Lcom/google/android/gms/internal/ads/zzayn;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzayn;->zzg(Lcom/google/android/gms/internal/ads/zzayn;J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaym;->zza:Lcom/google/android/gms/internal/ads/zzayn;

    const/4 p2, 0x1

    .line 2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzayn;->zzf(Lcom/google/android/gms/internal/ads/zzayn;Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaym;->zza:Lcom/google/android/gms/internal/ads/zzayn;

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzayn;->zza(Lcom/google/android/gms/internal/ads/zzayn;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaym;->zza:Lcom/google/android/gms/internal/ads/zzayn;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzayn;->zza(Lcom/google/android/gms/internal/ads/zzayn;)J

    move-result-wide v0

    cmp-long p4, p2, v0

    if-ltz p4, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzayn;->zza(Lcom/google/android/gms/internal/ads/zzayn;)J

    move-result-wide v0

    sub-long/2addr p2, v0

    .line 4
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzayn;->zze(Lcom/google/android/gms/internal/ads/zzayn;J)V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaym;->zza:Lcom/google/android/gms/internal/ads/zzayn;

    const/4 p2, 0x0

    .line 5
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzayn;->zzf(Lcom/google/android/gms/internal/ads/zzayn;Z)V

    return-void
.end method

.class public final Lcom/google/android/gms/internal/ads/zzrn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zza:[Lcom/google/android/gms/internal/ads/zzdz;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzsh;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzec;


# direct methods
.method public varargs constructor <init>([Lcom/google/android/gms/internal/ads/zzdz;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzsh;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzec;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzec;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/zzdz;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzrn;->zza:[Lcom/google/android/gms/internal/ads/zzdz;

    const/4 v3, 0x0

    .line 2
    invoke-static {p1, v3, v2, v3, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrn;->zzb:Lcom/google/android/gms/internal/ads/zzsh;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzrn;->zzc:Lcom/google/android/gms/internal/ads/zzec;

    aput-object v0, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method


# virtual methods
.method public final zza(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrn;->zzc:Lcom/google/android/gms/internal/ads/zzec;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzec;->zzi(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final zzb()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrn;->zzb:Lcom/google/android/gms/internal/ads/zzsh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsh;->zzo()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzcl;)Lcom/google/android/gms/internal/ads/zzcl;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrn;->zzc:Lcom/google/android/gms/internal/ads/zzec;

    iget v1, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzc:F

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzec;->zzk(F)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrn;->zzc:Lcom/google/android/gms/internal/ads/zzec;

    .line 2
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzd:F

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzec;->zzj(F)V

    return-object p1
.end method

.method public final zzd(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrn;->zzb:Lcom/google/android/gms/internal/ads/zzsh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzsh;->zzp(Z)V

    return p1
.end method

.method public final zze()[Lcom/google/android/gms/internal/ads/zzdz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrn;->zza:[Lcom/google/android/gms/internal/ads/zzdz;

    return-object v0
.end method

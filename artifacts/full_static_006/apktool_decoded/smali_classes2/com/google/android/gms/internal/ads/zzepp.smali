.class public final Lcom/google/android/gms/internal/ads/zzepp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdme;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzepc;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzczo;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdme;Lcom/google/android/gms/internal/ads/zzdvc;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzepp;->zza:Lcom/google/android/gms/internal/ads/zzdme;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzepc;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzepc;-><init>(Lcom/google/android/gms/internal/ads/zzdvc;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzepp;->zzb:Lcom/google/android/gms/internal/ads/zzepc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdme;->zzg()Lcom/google/android/gms/internal/ads/zzboi;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzepo;

    invoke-direct {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzepo;-><init>(Lcom/google/android/gms/internal/ads/zzepc;Lcom/google/android/gms/internal/ads/zzboi;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzepp;->zzc:Lcom/google/android/gms/internal/ads/zzczo;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzczo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepp;->zzc:Lcom/google/android/gms/internal/ads/zzczo;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzdaz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepp;->zzb:Lcom/google/android/gms/internal/ads/zzepc;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzdjy;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdjy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzepp;->zzb:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzepp;->zza:Lcom/google/android/gms/internal/ads/zzdme;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzepc;->zzg()Lcom/google/android/gms/ads/internal/client/zzbh;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzdjy;-><init>(Lcom/google/android/gms/internal/ads/zzdme;Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzepc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepp;->zzb:Lcom/google/android/gms/internal/ads/zzepc;

    return-object v0
.end method

.method public final zze(Lcom/google/android/gms/ads/internal/client/zzbh;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepp;->zzb:Lcom/google/android/gms/internal/ads/zzepc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzepc;->zzj(Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-void
.end method

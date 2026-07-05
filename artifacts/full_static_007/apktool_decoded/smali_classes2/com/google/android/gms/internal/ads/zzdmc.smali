.class public final Lcom/google/android/gms/internal/ads/zzdmc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field zza:Lcom/google/android/gms/internal/ads/zzbiw;

.field zzb:Lcom/google/android/gms/internal/ads/zzbit;

.field zzc:Lcom/google/android/gms/internal/ads/zzbjj;

.field zzd:Lcom/google/android/gms/internal/ads/zzbjg;

.field zze:Lcom/google/android/gms/internal/ads/zzboi;

.field final zzf:Landroidx/collection/SimpleArrayMap;

.field final zzg:Landroidx/collection/SimpleArrayMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/collection/SimpleArrayMap;

    invoke-direct {v0}, Landroidx/collection/SimpleArrayMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zzf:Landroidx/collection/SimpleArrayMap;

    new-instance v0, Landroidx/collection/SimpleArrayMap;

    .line 2
    invoke-direct {v0}, Landroidx/collection/SimpleArrayMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zzg:Landroidx/collection/SimpleArrayMap;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbit;)Lcom/google/android/gms/internal/ads/zzdmc;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zzb:Lcom/google/android/gms/internal/ads/zzbit;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbiw;)Lcom/google/android/gms/internal/ads/zzdmc;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zza:Lcom/google/android/gms/internal/ads/zzbiw;

    return-object p0
.end method

.method public final zzc(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbjc;Lcom/google/android/gms/internal/ads/zzbiz;)Lcom/google/android/gms/internal/ads/zzdmc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zzf:Landroidx/collection/SimpleArrayMap;

    invoke-virtual {v0, p1, p2}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zzg:Landroidx/collection/SimpleArrayMap;

    .line 2
    invoke-virtual {p2, p1, p3}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzboi;)Lcom/google/android/gms/internal/ads/zzdmc;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zze:Lcom/google/android/gms/internal/ads/zzboi;

    return-object p0
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzbjg;)Lcom/google/android/gms/internal/ads/zzdmc;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zzd:Lcom/google/android/gms/internal/ads/zzbjg;

    return-object p0
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzbjj;)Lcom/google/android/gms/internal/ads/zzdmc;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmc;->zzc:Lcom/google/android/gms/internal/ads/zzbjj;

    return-object p0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzdme;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdme;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzdme;-><init>(Lcom/google/android/gms/internal/ads/zzdmc;Lcom/google/android/gms/internal/ads/zzdmd;)V

    return-object v0
.end method

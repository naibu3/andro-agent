.class final Lcom/google/android/gms/internal/ads/zzhbl;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbc;


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzhbt;

.field final zzb:I

.field final zzc:Lcom/google/android/gms/internal/ads/zzhfg;

.field final zzd:Z

.field final zze:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzhbt;ILcom/google/android/gms/internal/ads/zzhfg;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zza:Lcom/google/android/gms/internal/ads/zzhbt;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzd:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    return-void
.end method


# virtual methods
.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhbl;

    .line 2
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhdd;Lcom/google/android/gms/internal/ads/zzhde;)Lcom/google/android/gms/internal/ads/zzhdd;
    .locals 1

    .line 1
    check-cast p2, Lcom/google/android/gms/internal/ads/zzhbo;

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbi;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzhbi;->zzbj(Lcom/google/android/gms/internal/ads/zzhbo;)Lcom/google/android/gms/internal/ads/zzhbi;

    return-object p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzhdj;Lcom/google/android/gms/internal/ads/zzhdj;)Lcom/google/android/gms/internal/ads/zzhdj;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzhfg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzhfh;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhfg;->zza()Lcom/google/android/gms/internal/ads/zzhfh;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    return v0
.end method

.method public final zzg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzhbl;->zzd:Z

    return v0
.end method

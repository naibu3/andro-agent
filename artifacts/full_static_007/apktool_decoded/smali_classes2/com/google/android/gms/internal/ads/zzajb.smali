.class final Lcom/google/android/gms/internal/ads/zzajb;
.super Lcom/google/android/gms/internal/ads/zzadh;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaji;


# instance fields
.field private final zza:I


# direct methods
.method public constructor <init>(JJLcom/google/android/gms/internal/ads/zzaen;Z)V
    .locals 8

    .line 1
    iget v5, p5, Lcom/google/android/gms/internal/ads/zzaen;->zzf:I

    iget v6, p5, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzadh;-><init>(JJIIZ)V

    iget p1, p5, Lcom/google/android/gms/internal/ads/zzaen;->zzf:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajb;->zza:I

    return-void
.end method


# virtual methods
.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzajb;->zza:I

    return v0
.end method

.method public final zzd()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final zze(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzadh;->zzb(J)J

    move-result-wide p1

    return-wide p1
.end method

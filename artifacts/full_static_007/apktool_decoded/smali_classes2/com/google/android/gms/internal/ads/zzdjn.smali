.class public final Lcom/google/android/gms/internal/ads/zzdjn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhkp;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhlg;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhlg;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzhlg;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzhlg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zza:Lcom/google/android/gms/internal/ads/zzhlg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zzb:Lcom/google/android/gms/internal/ads/zzhlg;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zzc:Lcom/google/android/gms/internal/ads/zzhlg;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zzd:Lcom/google/android/gms/internal/ads/zzhlg;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zza:Lcom/google/android/gms/internal/ads/zzhlg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhlg;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzflt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zzb:Lcom/google/android/gms/internal/ads/zzhlg;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzhlg;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzgge;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zzc:Lcom/google/android/gms/internal/ads/zzhlg;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzejx;

    .line 2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzejx;->zza()Lcom/google/android/gms/internal/ads/zzejw;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdjn;->zzd:Lcom/google/android/gms/internal/ads/zzhlg;

    check-cast v3, Lcom/google/android/gms/internal/ads/zzemr;

    .line 3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzemr;->zza()Lcom/google/android/gms/internal/ads/zzemq;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzemx;

    invoke-direct {v4, v0, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzemx;-><init>(Lcom/google/android/gms/internal/ads/zzflt;Lcom/google/android/gms/internal/ads/zzgge;Lcom/google/android/gms/internal/ads/zzehn;Lcom/google/android/gms/internal/ads/zzehr;)V

    return-object v4
.end method

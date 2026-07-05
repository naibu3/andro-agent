.class public final Lcom/google/android/gms/internal/ads/zzhks;
.super Lcom/google/android/gms/internal/ads/zzhkk;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# direct methods
.method synthetic constructor <init>(ILcom/google/android/gms/internal/ads/zzhkr;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhkk;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhks;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhkk;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhkk;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzhkt;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhkt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhks;->zza:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhkt;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzhkr;)V

    return-object v0
.end method

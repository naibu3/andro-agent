.class final Lcom/google/android/gms/internal/ads/zzgcf;
.super Lcom/google/android/gms/internal/ads/zzgce;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzgcg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgcg;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgcf;->zza:Lcom/google/android/gms/internal/ads/zzgcg;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgce;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzgbn;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgcf;->zza:Lcom/google/android/gms/internal/ads/zzgcg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgcg;->zza()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgcd;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzgcd;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgcj;

    .line 2
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzgcj;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzfyw;)V

    return-object v2
.end method

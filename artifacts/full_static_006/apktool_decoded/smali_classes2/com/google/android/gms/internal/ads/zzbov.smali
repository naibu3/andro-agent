.class final Lcom/google/android/gms/internal/ads/zzbov;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzblp;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbow;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzblp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbow;Lcom/google/android/gms/internal/ads/zzblp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbov;->zza:Lcom/google/android/gms/internal/ads/zzbow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbov;->zzb:Lcom/google/android/gms/internal/ads/zzblp;

    return-void
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzbov;)Lcom/google/android/gms/internal/ads/zzblp;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzbov;->zzb:Lcom/google/android/gms/internal/ads/zzblp;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzchd;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbov;->zzb:Lcom/google/android/gms/internal/ads/zzblp;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbov;->zza:Lcom/google/android/gms/internal/ads/zzbow;

    .line 2
    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzblp;->zza(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method

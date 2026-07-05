.class public final synthetic Lcom/google/android/gms/internal/ads/zzaig;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaii;

    check-cast p2, Lcom/google/android/gms/internal/ads/zzaii;

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgar;->zzk()Lcom/google/android/gms/internal/ads/zzgar;

    move-result-object v0

    iget-wide v1, p1, Lcom/google/android/gms/internal/ads/zzaii;->zzb:J

    iget-wide v3, p2, Lcom/google/android/gms/internal/ads/zzaii;->zzb:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzgar;->zzc(JJ)Lcom/google/android/gms/internal/ads/zzgar;

    move-result-object v0

    .line 2
    iget-wide v1, p1, Lcom/google/android/gms/internal/ads/zzaii;->zzc:J

    iget-wide v3, p2, Lcom/google/android/gms/internal/ads/zzaii;->zzc:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzgar;->zzc(JJ)Lcom/google/android/gms/internal/ads/zzgar;

    move-result-object v0

    .line 3
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzaii;->zzd:I

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzaii;->zzd:I

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzgar;->zzb(II)Lcom/google/android/gms/internal/ads/zzgar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgar;->zza()I

    move-result p1

    return p1
.end method

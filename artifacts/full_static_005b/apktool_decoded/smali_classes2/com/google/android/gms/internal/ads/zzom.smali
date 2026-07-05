.class public final synthetic Lcom/google/android/gms/internal/ads/zzom;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfe;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzmy;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdv;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzdv;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzom;->zza:Lcom/google/android/gms/internal/ads/zzmy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzom;->zzb:Lcom/google/android/gms/internal/ads/zzdv;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzna;

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzom;->zza:Lcom/google/android/gms/internal/ads/zzmy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzom;->zzb:Lcom/google/android/gms/internal/ads/zzdv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzna;->zzq(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzdv;)V

    .line 2
    iget p1, v1, Lcom/google/android/gms/internal/ads/zzdv;->zzc:I

    iget p1, v1, Lcom/google/android/gms/internal/ads/zzdv;->zzd:I

    iget p1, v1, Lcom/google/android/gms/internal/ads/zzdv;->zze:I

    iget p1, v1, Lcom/google/android/gms/internal/ads/zzdv;->zzf:F

    return-void
.end method

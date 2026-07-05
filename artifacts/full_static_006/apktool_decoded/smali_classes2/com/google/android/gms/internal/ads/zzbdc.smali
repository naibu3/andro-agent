.class final Lcom/google/android/gms/internal/ads/zzbdc;
.super Lcom/google/android/gms/internal/ads/zzccn;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbdi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbdi;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdc;->zza:Lcom/google/android/gms/internal/ads/zzbdi;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzccn;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdc;->zza:Lcom/google/android/gms/internal/ads/zzbdi;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdi;->zze(Lcom/google/android/gms/internal/ads/zzbdi;)V

    .line 2
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzccn;->cancel(Z)Z

    move-result p1

    return p1
.end method

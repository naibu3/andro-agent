.class public final synthetic Lcom/google/android/gms/internal/ads/zzffv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfdx;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbyh;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbyh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffv;->zza:Lcom/google/android/gms/internal/ads/zzbyh;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffv;->zza:Lcom/google/android/gms/internal/ads/zzbyh;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbzd;

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbzr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbyh;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbyh;->zzb()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbzr;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzbzd;->zzk(Lcom/google/android/gms/internal/ads/zzbyx;)V

    return-void
.end method

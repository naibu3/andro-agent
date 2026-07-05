.class public final Lcom/google/android/gms/internal/ads/zzdje;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzp;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdbr;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdgu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdbr;Lcom/google/android/gms/internal/ads/zzdgu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdje;->zza:Lcom/google/android/gms/internal/ads/zzdbr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdje;->zzb:Lcom/google/android/gms/internal/ads/zzdgu;

    return-void
.end method


# virtual methods
.method public final zzdH()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdje;->zza:Lcom/google/android/gms/internal/ads/zzdbr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdbr;->zzdH()V

    return-void
.end method

.method public final zzdk()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdje;->zza:Lcom/google/android/gms/internal/ads/zzdbr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdbr;->zzdk()V

    return-void
.end method

.method public final zzdq()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdje;->zza:Lcom/google/android/gms/internal/ads/zzdbr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdbr;->zzdq()V

    return-void
.end method

.method public final zzdr()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdje;->zza:Lcom/google/android/gms/internal/ads/zzdbr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdbr;->zzdr()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdje;->zzb:Lcom/google/android/gms/internal/ads/zzdgu;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgu;->zzb()V

    return-void
.end method

.method public final zzdt()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdje;->zza:Lcom/google/android/gms/internal/ads/zzdbr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdbr;->zzdt()V

    return-void
.end method

.method public final zzdu(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdje;->zza:Lcom/google/android/gms/internal/ads/zzdbr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdbr;->zzdu(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdje;->zzb:Lcom/google/android/gms/internal/ads/zzdgu;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdgu;->zza()V

    return-void
.end method

.class public final synthetic Lcom/google/android/gms/internal/ads/zzgrz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgpa;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzghx;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzghi;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgsg;

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrt;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgrt;-><init>(Lcom/google/android/gms/internal/ads/zzgrs;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgrt;->zzc(Lcom/google/android/gms/internal/ads/zzgsg;)Lcom/google/android/gms/internal/ads/zzgrt;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgsg;->zzc()I

    move-result p1

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzf;->zzc(I)Lcom/google/android/gms/internal/ads/zzgzf;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgrt;->zzb(Lcom/google/android/gms/internal/ads/zzgzf;)Lcom/google/android/gms/internal/ads/zzgrt;

    .line 3
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzgrt;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzgrt;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgrt;->zzd()Lcom/google/android/gms/internal/ads/zzgrv;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Lcom/google/android/gms/internal/ads/zzgkf;
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

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgkm;

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgkb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgkb;-><init>(Lcom/google/android/gms/internal/ads/zzgka;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgkb;->zzc(Lcom/google/android/gms/internal/ads/zzgkm;)Lcom/google/android/gms/internal/ads/zzgkb;

    .line 2
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzgkb;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzgkb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgkm;->zzb()I

    move-result p1

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzf;->zzc(I)Lcom/google/android/gms/internal/ads/zzgzf;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgkb;->zzb(Lcom/google/android/gms/internal/ads/zzgzf;)Lcom/google/android/gms/internal/ads/zzgkb;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgkb;->zzd()Lcom/google/android/gms/internal/ads/zzgkd;

    move-result-object p1

    return-object p1
.end method

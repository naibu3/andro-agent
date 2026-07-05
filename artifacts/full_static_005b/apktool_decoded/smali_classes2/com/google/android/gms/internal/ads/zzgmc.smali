.class public final synthetic Lcom/google/android/gms/internal/ads/zzgmc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgpw;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzghi;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgmb;

    sget v0, Lcom/google/android/gms/internal/ads/zzgmf;->zza:I

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgnu;->zzc()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgnu;->zzb(Lcom/google/android/gms/internal/ads/zzgmb;)Lcom/google/android/gms/internal/ads/zzggy;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzd;->zzb(Lcom/google/android/gms/internal/ads/zzgmb;)Lcom/google/android/gms/internal/ads/zzggy;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.class public final synthetic Lcom/google/android/gms/internal/ads/zzgky;
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
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgli;

    sget v0, Lcom/google/android/gms/internal/ads/zzgkz;->zza:I

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgli;->zzb()Lcom/google/android/gms/internal/ads/zzglo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzglo;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgli;->zzb()Lcom/google/android/gms/internal/ads/zzglo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzglo;->zzb()Lcom/google/android/gms/internal/ads/zzgii;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzghv;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzghu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzghu;->zzb()Lcom/google/android/gms/internal/ads/zzggy;

    move-result-object v0

    .line 2
    sget v2, Lcom/google/android/gms/internal/ads/zzgkw;->zza:I

    .line 3
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgie;->zzb(Lcom/google/android/gms/internal/ads/zzghx;)[B

    move-result-object v1

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhay;->zza()Lcom/google/android/gms/internal/ads/zzhay;

    move-result-object v2

    .line 5
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgwm;->zzf([BLcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzgwm;

    move-result-object v1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzhcd; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    new-instance v2, Lcom/google/android/gms/internal/ads/zzgkw;

    .line 7
    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzgkw;-><init>(Lcom/google/android/gms/internal/ads/zzgwm;Lcom/google/android/gms/internal/ads/zzggy;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgli;->zzc()Lcom/google/android/gms/internal/ads/zzgze;

    move-result-object p1

    .line 8
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ads/zzgns;->zzc(Lcom/google/android/gms/internal/ads/zzggy;Lcom/google/android/gms/internal/ads/zzgze;)Lcom/google/android/gms/internal/ads/zzggy;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
